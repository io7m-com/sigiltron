/*
 * Copyright © 2014 <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.sigiltron;

import java.security.SecureRandom;

/**
 * Use the reference value.
 */

public final class SigilSpreadFunctionRandom implements
  SigilSpreadFunctionType
{
  private final SecureRandom random;

  /**
   * Construct a spread function.
   */

  public SigilSpreadFunctionRandom()
  {
    this.random = new SecureRandom();
  }

  @SuppressWarnings("boxing")
  @Override
  public Integer getSpread(
    final int size)
  {
    return this.random.nextInt(size);
  }

  @Override
  public String toString()
  {
    return "Random based on the given spread";
  }
}
