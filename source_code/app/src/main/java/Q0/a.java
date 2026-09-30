package Q0;

import A0.z;
import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;

/* loaded from: classes3.dex */
public final class a {
    public final long alpha;

    public /* synthetic */ a(long j5) {
        this.alpha = j5;
    }

    public static long alpha(long j5, int i4, int i5, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i4 = juliet(j5);
        }
        if ((i12 & 2) != 0) {
            i5 = hotel(j5);
        }
        if ((i12 & 4) != 0) {
            i10 = india(j5);
        }
        if ((i12 & 8) != 0) {
            i11 = golf(j5);
        }
        if (i5 < i4 || i11 < i10 || i4 < 0 || i10 < 0) {
            j.alpha("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.hotel(i4, i5, i10, i11);
    }

    public static final boolean bravo(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final boolean charlie(long j5) {
        int i4 = (int) (3 & j5);
        int i5 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        if ((((int) (j5 >> (i5 + 46))) & ((1 << (18 - i5)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean delta(long j5) {
        int i4 = (int) (3 & j5);
        if ((((int) (j5 >> 33)) & ((1 << z.foxtrot((i4 & 2) >> 1, 3, (i4 & 1) << 1, 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean echo(long j5) {
        int i4;
        int i5 = (int) (3 & j5);
        int i10 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j5 >> (i10 + 15))) & i11;
        int i13 = ((int) (j5 >> (i10 + 46))) & i11;
        if (i13 == 0) {
            i4 = LottieConstants.IterateForever;
        } else {
            i4 = i13 - 1;
        }
        if (i12 == i4) {
            return true;
        }
        return false;
    }

    public static final boolean foxtrot(long j5) {
        int i4;
        int i5 = (int) (3 & j5);
        int foxtrot = (1 << z.foxtrot((i5 & 2) >> 1, 3, (i5 & 1) << 1, 13)) - 1;
        int i10 = ((int) (j5 >> 2)) & foxtrot;
        int i11 = ((int) (j5 >> 33)) & foxtrot;
        if (i11 == 0) {
            i4 = LottieConstants.IterateForever;
        } else {
            i4 = i11 - 1;
        }
        if (i10 == i4) {
            return true;
        }
        return false;
    }

    public static final int golf(long j5) {
        int i4 = (int) (3 & j5);
        int i5 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        int i10 = ((int) (j5 >> (i5 + 46))) & ((1 << (18 - i5)) - 1);
        if (i10 == 0) {
            return LottieConstants.IterateForever;
        }
        return i10 - 1;
    }

    public static final int hotel(long j5) {
        int i4 = (int) (3 & j5);
        int i5 = (int) (j5 >> 33);
        int foxtrot = i5 & ((1 << z.foxtrot((i4 & 2) >> 1, 3, (i4 & 1) << 1, 13)) - 1);
        if (foxtrot == 0) {
            return LottieConstants.IterateForever;
        }
        return foxtrot - 1;
    }

    public static final int india(long j5) {
        int i4 = (int) (3 & j5);
        int i5 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        return ((int) (j5 >> (i5 + 15))) & ((1 << (18 - i5)) - 1);
    }

    public static final int juliet(long j5) {
        int i4 = (int) (3 & j5);
        return ((int) (j5 >> 2)) & ((1 << z.foxtrot((i4 & 2) >> 1, 3, (i4 & 1) << 1, 13)) - 1);
    }

    public static String kilo(long j5) {
        String valueOf;
        int hotel = hotel(j5);
        String str = "Infinity";
        if (hotel == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(hotel);
        }
        int golf = golf(j5);
        if (golf != Integer.MAX_VALUE) {
            str = String.valueOf(golf);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(juliet(j5));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(india(j5));
        sb2.append(", maxHeight = ");
        return P0.fuchsia(sb2, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.alpha != ((a) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return kilo(this.alpha);
    }
}
