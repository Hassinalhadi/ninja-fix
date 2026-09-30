package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class F {
    public static final E alpha;

    static {
        E e;
        if (D.echo && D.delta && !AbstractC0596c.alpha()) {
            e = new E(1);
        } else {
            e = new E(0);
        }
        alpha = e;
    }

    public static int alpha(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i10 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new Utf8$UnpairedSurrogateException(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i10 += i4;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }
}
