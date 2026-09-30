package B3;

import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;

/* loaded from: classes3.dex */
public abstract class b {
    public static final Object alpha = y.sierra(new Pair("AL", 28), new Pair("AD", 24), new Pair("AT", 20), new Pair("AZ", 28), new Pair("BH", 22), new Pair("BE", 16), new Pair("BA", 20), new Pair("BR", 29), new Pair("BG", 22), new Pair("CR", 22), new Pair("HR", 21), new Pair("CY", 28), new Pair("CZ", 24), new Pair("DK", 18), new Pair("DO", 28), new Pair("EE", 20), new Pair("FI", 18), new Pair("FO", 18), new Pair("FR", 27), new Pair("GE", 22), new Pair("DE", 22), new Pair("GI", 23), new Pair("GR", 27), new Pair("GL", 18), new Pair("GT", 28), new Pair("HU", 28), new Pair("IS", 26), new Pair("IE", 22), new Pair("IL", 23), new Pair("IT", 27), new Pair("JO", 30), new Pair("KZ", 20), new Pair("KW", 30), new Pair("LV", 21), new Pair("LB", 28), new Pair("LI", 21), new Pair("LT", 20), new Pair("LU", 20), new Pair("MK", 19), new Pair("MT", 31), new Pair("MR", 27), new Pair("MU", 30), new Pair("MD", 24), new Pair("MC", 27), new Pair("ME", 22), new Pair("NL", 18), new Pair("NO", 15), new Pair("PK", 24), new Pair("PS", 29), new Pair("PL", 28), new Pair("PT", 25), new Pair("QA", 29), new Pair("RO", 24), new Pair("SM", 27), new Pair("SA", 24), new Pair("RS", 22), new Pair("SK", 24), new Pair("SI", 19), new Pair("ES", 24), new Pair("SE", 24), new Pair("CH", 21), new Pair("TN", 24), new Pair("TR", 26), new Pair("UA", 29), new Pair("AE", 23), new Pair("GB", 22), new Pair("VG", 24), new Pair("BY", 28), new Pair("SV", 28), new Pair("TL", 23), new Pair("IQ", 23), new Pair("LC", 32), new Pair("SC", 31), new Pair("ST", 25), new Pair("VA", 22), new Pair("XK", 20), new Pair("IR", 26), new Pair("EG", 29), new Pair("HN", 28), new Pair("NI", 28), new Pair("RU", 33));
    public static final Regex bravo = new Regex("^[A-Z]{2}\\d{2}[A-Z0-9]{11,30}$");

    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    public static A3.a alpha(String str) {
        String sb2;
        int[] iArr;
        if (str == null) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (1632 <= charAt && charAt < 1642) {
                    sb3.append((char) (charAt - 1584));
                } else if (1776 <= charAt && charAt < 1786) {
                    sb3.append((char) (charAt - 1728));
                } else {
                    sb3.append(charAt);
                }
            }
            sb2 = sb3.toString();
            Intrinsics.delta(sb2, "toString(...)");
        }
        String upperCase = StringsKt.b(new Regex("[-_]+").foxtrot(new Regex("[\\p{Z}\\s\\p{Cf}]+").foxtrot(r.oscar(sb2, "^(?i)\\s*IBAN\\s*:?", ""), ""), "")).toString().toUpperCase(Locale.ROOT);
        Intrinsics.delta(upperCase, "toUpperCase(...)");
        String foxtrot = new Regex("[^A-Z0-9]").foxtrot(upperCase, "");
        if (foxtrot.length() == 0) {
            return new A3.a(false, null, a.alpha, "iban.empty", null, 18);
        }
        if (!bravo.echo(foxtrot)) {
            if (StringsKt.beige(foxtrot, "IBAN", false)) {
                return new A3.a(false, null, a.purple, "iban.has_token", null, 18);
            }
            return new A3.a(false, null, a.red, "iban.bad_format", null, 18);
        }
        String substring = foxtrot.substring(0, 2);
        Intrinsics.delta(substring, "substring(...)");
        Integer num = (Integer) alpha.get(substring);
        if (num != null && foxtrot.length() != num.intValue()) {
            return new A3.a(false, null, a.silver, "iban.bad_length_country", ab.juliet(substring), 2);
        }
        String concat = StringsKt.blue(4, foxtrot).concat(StringsKt.yellow(4, foxtrot));
        int length = concat.length();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 < length) {
                char charAt2 = concat.charAt(i5);
                if ('0' <= charAt2 && charAt2 < ':') {
                    iArr = new int[]{charAt2 - '0'};
                } else {
                    if ('A' > charAt2 || charAt2 >= '[') {
                        break;
                    }
                    int i11 = charAt2 - '7';
                    if (i11 >= 10 && i11 < 20) {
                        iArr = new int[]{1, charAt2 - 'A'};
                    } else {
                        iArr = new int[]{i11 / 10, i11 % 10};
                    }
                }
                for (int i12 : iArr) {
                    i10 = ((i10 * 10) + i12) % 97;
                }
                i5++;
            } else if (i10 == 1) {
                return new A3.a(true, foxtrot, null, null, null, 28);
            }
        }
        return new A3.a(false, null, a.teal, "iban.bad_checksum", null, 18);
    }
}
