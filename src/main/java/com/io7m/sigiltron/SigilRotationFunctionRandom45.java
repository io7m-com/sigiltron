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

/**
 * A completely random rotation.
 */

public final class SigilRotationFunctionRandom45 implements
  SigilRotationFunctionType
{
  /**
   * Construct a rotation function.
   */

  public SigilRotationFunctionRandom45()
  {

  }

  @Override public Double getRotation(
    final Character c)
  {
    final int r = (int) (Math.random() * 8);
    final int d = r * 45;
    System.out.println("rotation: " + d);
    return Math.toRadians(d);
  }

  @Override public String toString()
  {
    return "Random 45° increments";
  }
}
