package s6;

/* renamed from: s6.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2699k7 {
    public static final /* synthetic */ int alpha = 0;

    public static void alpha(int i4, int i5) {
        String alpha2;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
            alpha2 = AbstractC2708l7.alpha("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            alpha2 = AbstractC2708l7.alpha("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(alpha2);
    }

    public static void bravo(int i4, int i5, int i10) {
        String charlie;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                charlie = AbstractC2708l7.alpha("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                charlie = charlie(i5, i10, "end index");
            }
        } else {
            charlie = charlie(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(charlie);
    }

    public static String charlie(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC2708l7.alpha("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC2708l7.alpha("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }
}
