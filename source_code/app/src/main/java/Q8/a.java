package Q8;

import av.q;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public abstract class a {
    public static final TimeZone alpha = TimeZone.getTimeZone("UTC");

    public static boolean alpha(String str, int i4, char c3) {
        if (i4 < str.length() && str.charAt(i4) == c3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date bravo(String str, ParsePosition parsePosition) {
        String victor;
        String message;
        int i4;
        int i5;
        int i10;
        int i11;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int charlie = charlie(str, index, i12);
            if (alpha(str, i12, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int charlie2 = charlie(str, i12, i13);
            if (alpha(str, i13, NumberOnlyZipVisualTransformation.HYPHEN)) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int charlie3 = charlie(str, i13, i14);
            boolean alpha2 = alpha(str, i14, 'T');
            if (!alpha2 && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(charlie, charlie2 - 1, charlie3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (alpha2) {
                int i15 = i13 + 5;
                int charlie4 = charlie(str, i13 + 3, i15);
                if (alpha(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int charlie5 = charlie(str, i15, i16);
                if (alpha(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() > i16 && (charAt = str.charAt(i16)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i17 = i16 + 2;
                    i11 = charlie(str, i16, i17);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (alpha(str, i17, '.')) {
                        int i18 = i16 + 3;
                        for (int i19 = i16 + 4; i19 < str.length(); i19++) {
                            char charAt2 = str.charAt(i19);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i19;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i16 + 6);
                        i10 = charlie(str, i18, min);
                        int i20 = min - i18;
                        if (i20 != 1) {
                            if (i20 == 2) {
                                i10 *= 10;
                            }
                        } else {
                            i10 *= 100;
                        }
                        i4 = charlie4;
                        i14 = length2;
                        i5 = charlie5;
                    } else {
                        i4 = charlie4;
                        i14 = i17;
                        i5 = charlie5;
                        i10 = 0;
                    }
                    if (str.length() <= i14) {
                        char charAt3 = str.charAt(i14);
                        TimeZone timeZone = alpha;
                        if (charAt3 == 'Z') {
                            length = i14 + 1;
                        } else {
                            if (charAt3 != '+' && charAt3 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                            }
                            String substring = str.substring(i14);
                            if (substring.length() < 5) {
                                substring = substring + "00";
                            }
                            length = i14 + substring.length();
                            if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                                String str2 = "GMT" + substring;
                                timeZone = TimeZone.getTimeZone(str2);
                                String id2 = timeZone.getID();
                                if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                                }
                            }
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, charlie);
                        gregorianCalendar2.set(2, charlie2 - 1);
                        gregorianCalendar2.set(5, charlie3);
                        gregorianCalendar2.set(11, i4);
                        gregorianCalendar2.set(12, i5);
                        gregorianCalendar2.set(13, i11);
                        gregorianCalendar2.set(14, i10);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i14 = i16;
                i4 = charlie4;
                i5 = charlie5;
            } else {
                i4 = 0;
                i5 = 0;
            }
            i10 = 0;
            i11 = 0;
            if (str.length() <= i14) {
            }
        } catch (IllegalArgumentException e) {
            e = e;
            if (str != null) {
                victor = null;
            } else {
                victor = AbstractC2327c.victor('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(q.foxtrot("Failed to parse date [", victor, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(q.foxtrot("Failed to parse date [", victor, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int charlie(String str, int i4, int i5) {
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
