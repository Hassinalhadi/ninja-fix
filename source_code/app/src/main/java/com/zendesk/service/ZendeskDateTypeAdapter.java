package com.zendesk.service;

import S8.a;
import S8.b;
import S8.c;
import av.q;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.google.gson.ad;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class ZendeskDateTypeAdapter extends ad {
    private static final String LOG_TAG = "ZendeskDateTypeAdapter";
    private static final String PARSING_ERROR_FORMAT = "Failed to parse Date from: %s";
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private boolean checkOffset(String str, int i4, char c3) {
        if (i4 < str.length() && str.charAt(i4) == c3) {
            return true;
        }
        return false;
    }

    private String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_UTC, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(21);
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt >= '0' && charAt <= '9') {
                i4++;
            } else {
                return i4;
            }
        }
        return str.length();
    }

    private void padInt(StringBuilder sb2, int i4, int i5) {
        String num = Integer.toString(i4);
        for (int length = i5 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[Catch: IndexOutOfBoundsException -> 0x0050, TryCatch #0 {IndexOutOfBoundsException -> 0x0050, blocks: (B:3:0x000a, B:5:0x001d, B:6:0x001f, B:8:0x002b, B:9:0x002d, B:11:0x003c, B:13:0x0042, B:18:0x0058, B:20:0x0068, B:21:0x006a, B:23:0x0076, B:24:0x0079, B:26:0x007f, B:31:0x008b, B:36:0x009b, B:38:0x00a3, B:43:0x00d7, B:45:0x00dd, B:47:0x00e3, B:49:0x0117, B:50:0x012b, B:51:0x012c, B:52:0x0133, B:53:0x00bb, B:54:0x00be), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c A[Catch: IndexOutOfBoundsException -> 0x0050, TryCatch #0 {IndexOutOfBoundsException -> 0x0050, blocks: (B:3:0x000a, B:5:0x001d, B:6:0x001f, B:8:0x002b, B:9:0x002d, B:11:0x003c, B:13:0x0042, B:18:0x0058, B:20:0x0068, B:21:0x006a, B:23:0x0076, B:24:0x0079, B:26:0x007f, B:31:0x008b, B:36:0x009b, B:38:0x00a3, B:43:0x00d7, B:45:0x00dd, B:47:0x00e3, B:49:0x0117, B:50:0x012b, B:51:0x012c, B:52:0x0133, B:53:0x00bb, B:54:0x00be), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String gray;
        int i4;
        int i5;
        int i10;
        int i11;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int parseInt = parseInt(str, index, i12);
            if (checkOffset(str, i12, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int parseInt2 = parseInt(str, i12, i13);
            if (checkOffset(str, i13, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int parseInt3 = parseInt(str, i13, i14);
            boolean checkOffset = checkOffset(str, i14, 'T');
            if (!checkOffset && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i15 = i13 + 5;
                int parseInt4 = parseInt(str, i13 + 3, i15);
                if (checkOffset(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int parseInt5 = parseInt(str, i15, i16);
                if (checkOffset(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() > i16 && (charAt = str.charAt(i16)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i17 = i16 + 2;
                    i10 = parseInt(str, i16, i17);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (checkOffset(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i16 + 4);
                        int min = Math.min(indexOfNonDigit, i16 + 6);
                        int parseInt6 = parseInt(str, i18, min);
                        int i19 = min - i18;
                        if (i19 != 1) {
                            if (i19 == 2) {
                                parseInt6 *= 10;
                            }
                        } else {
                            parseInt6 *= 100;
                        }
                        i4 = parseInt4;
                        i14 = indexOfNonDigit;
                        i5 = parseInt5;
                        i11 = parseInt6;
                        if (str.length() > i14) {
                            char charAt2 = str.charAt(i14);
                            if (charAt2 == 'Z') {
                                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TIMEZONE_UTC);
                                gregorianCalendar2.setLenient(false);
                                gregorianCalendar2.set(1, parseInt);
                                gregorianCalendar2.set(2, parseInt2 - 1);
                                gregorianCalendar2.set(5, parseInt3);
                                gregorianCalendar2.set(11, i4);
                                gregorianCalendar2.set(12, i5);
                                gregorianCalendar2.set(13, i10);
                                gregorianCalendar2.set(14, i11);
                                parsePosition.setIndex(i14 + 1);
                                return gregorianCalendar2.getTime();
                            }
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    i4 = parseInt4;
                    i14 = i17;
                    i5 = parseInt5;
                    i11 = 0;
                    if (str.length() > i14) {
                    }
                } else {
                    i14 = i16;
                    i4 = parseInt4;
                    i5 = parseInt5;
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            i10 = 0;
            i11 = 0;
            if (str.length() > i14) {
            }
        } catch (IndexOutOfBoundsException e) {
            if (str == null) {
                gray = null;
            } else {
                gray = ao.ad.gray("\"", str, "'");
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(q.foxtrot("Failed to parse date [", gray, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private int parseInt(String str, int i4, int i5) throws NumberFormatException {
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

    @Override // com.google.gson.ad
    public Date read(a aVar) throws IOException {
        if (aVar.white() == b.f2049b) {
            aVar.peach();
            return null;
        }
        String purple = aVar.purple();
        try {
            return parse(purple, new ParsePosition(0));
        } catch (ParseException e) {
            Locale locale = Locale.US;
            Logger.e(LOG_TAG, q.echo("Failed to parse Date from: ", purple), e, new Object[0]);
            return null;
        }
    }

    @Override // com.google.gson.ad
    public void write(c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.azure();
        } else {
            cVar.navy(format(date));
        }
    }
}
