package com.squareup.moshi.adapters;

import av.q;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.squareup.moshi.JsonDataException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class a {
    public static final TimeZone alpha = TimeZone.getTimeZone("GMT");

    public static boolean alpha(String str, int i4, char c3) {
        if (i4 < str.length() && str.charAt(i4) == c3) {
            return true;
        }
        return false;
    }

    public static String bravo(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(alpha, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        charlie(sb2, gregorianCalendar.get(1), 4);
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        charlie(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        charlie(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        charlie(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        charlie(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        charlie(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        charlie(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    public static void charlie(StringBuilder sb2, int i4, int i5) {
        String num = Integer.toString(i4);
        for (int length = i5 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    public static Date delta(String str) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        char charAt;
        int i13 = 4;
        try {
            int echo = echo(str, 0, 4);
            if (alpha(str, 4, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i13 = 5;
            }
            int i14 = i13 + 2;
            int echo2 = echo(str, i13, i14);
            if (alpha(str, i14, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int echo3 = echo(str, i14, i15);
            boolean alpha2 = alpha(str, i15, 'T');
            if (!alpha2 && str.length() <= i15) {
                return new GregorianCalendar(echo, echo2 - 1, echo3).getTime();
            }
            if (alpha2) {
                int i16 = i14 + 5;
                int echo4 = echo(str, i14 + 3, i16);
                if (alpha(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                i12 = echo(str, i16, i17);
                if (alpha(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() > i17 && (charAt = str.charAt(i17)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i18 = i17 + 2;
                    i11 = echo(str, i17, i18);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (alpha(str, i18, '.')) {
                        int i19 = i17 + 3;
                        int i20 = i17 + 4;
                        while (true) {
                            if (i20 < str.length()) {
                                char charAt2 = str.charAt(i20);
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                i20++;
                            } else {
                                i20 = str.length();
                                break;
                            }
                        }
                        int min = Math.min(i20, i17 + 6);
                        i4 = echo;
                        i10 = (int) (Math.pow(10.0d, 3 - (min - i19)) * echo(str, i19, min));
                        i5 = echo4;
                        i15 = i20;
                    } else {
                        i4 = echo;
                        i5 = echo4;
                        i15 = i18;
                        i10 = 0;
                    }
                } else {
                    i4 = echo;
                    i5 = echo4;
                    i15 = i17;
                    i10 = 0;
                    i11 = 0;
                }
            } else {
                i4 = echo;
                i5 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            if (str.length() > i15) {
                char charAt3 = str.charAt(i15);
                TimeZone timeZone = alpha;
                if (charAt3 != 'Z') {
                    if (charAt3 != '+' && charAt3 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                    }
                    String substring = str.substring(i15);
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str2 = "GMT" + substring;
                        timeZone = TimeZone.getTimeZone(str2);
                        String id2 = timeZone.getID();
                        if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i4);
                gregorianCalendar.set(2, echo2 - 1);
                gregorianCalendar.set(5, echo3);
                gregorianCalendar.set(11, i5);
                gregorianCalendar.set(12, i12);
                gregorianCalendar.set(13, i11);
                gregorianCalendar.set(14, i10);
                return gregorianCalendar.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException e) {
            e = e;
            throw new JsonDataException(q.echo("Not an RFC 3339 date: ", str), e);
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            throw new JsonDataException(q.echo("Not an RFC 3339 date: ", str), e);
        }
    }

    public static int echo(String str, int i4, int i5) {
        int i10;
        int i11;
        if (i4 >= 0 && i5 <= str.length() && i4 <= i5) {
            if (i4 < i5) {
                i11 = i4 + 1;
                int digit = Character.digit(str.charAt(i4), 10);
                if (digit >= 0) {
                    i10 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
                }
            } else {
                i10 = 0;
                i11 = i4;
            }
            while (i11 < i5) {
                int i12 = i11 + 1;
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (digit2 >= 0) {
                    i10 = (i10 * 10) - digit2;
                    i11 = i12;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
                }
            }
            return -i10;
        }
        throw new NumberFormatException(str);
    }
}
