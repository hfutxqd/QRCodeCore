/*
 * Copyright (C) 2010 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.common;

import java.nio.charset.Charset;

/**
 * Common string-related functions.
 *
 * @author Sean Owen
 * @author Alex Dupre
 */
public final class StringUtils {

  private static final String PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset().name();
  public static final String SHIFT_JIS = "SJIS";
  public static final String GB2312 = "GB2312";
  private static final String EUC_JP = "EUC_JP";
  private static final String UTF8 = "UTF8";
  private static final String ISO88591 = "ISO8859_1";
  private static final boolean ASSUME_SHIFT_JIS =
      SHIFT_JIS.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING) ||
      EUC_JP.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING);

}
