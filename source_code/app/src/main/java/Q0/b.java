package Q0;

import androidx.appcompat.widget.P0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class b {
    public static final long alpha(int i4, int i5, int i10, int i11) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i5 >= i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z2 & z10;
        if (i4 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z13 & z11;
        if (i10 >= 0) {
            z12 = true;
        }
        if (!(z12 & z14)) {
            j.alpha("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return hotel(i4, i5, i10, i11);
    }

    public static /* synthetic */ long bravo(int i4, int i5, int i10) {
        if ((i10 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i10 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return alpha(0, i4, 0, i5);
    }

    public static final int charlie(int i4) {
        if (i4 < 8191) {
            return 13;
        }
        if (i4 < 32767) {
            return 15;
        }
        if (i4 < 65535) {
            return 16;
        }
        if (i4 < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long delta(long j5, long j6) {
        int i4 = (int) (j6 >> 32);
        int juliet = a.juliet(j5);
        int hotel = a.hotel(j5);
        if (i4 < juliet) {
            i4 = juliet;
        }
        if (i4 <= hotel) {
            hotel = i4;
        }
        int i5 = (int) (j6 & 4294967295L);
        int india = a.india(j5);
        int golf = a.golf(j5);
        if (i5 < india) {
            i5 = india;
        }
        if (i5 <= golf) {
            golf = i5;
        }
        return (hotel << 32) | (4294967295L & golf);
    }

    public static final long echo(long j5, long j6) {
        int juliet = a.juliet(j5);
        int hotel = a.hotel(j5);
        int india = a.india(j5);
        int golf = a.golf(j5);
        int juliet2 = a.juliet(j6);
        if (juliet2 < juliet) {
            juliet2 = juliet;
        }
        if (juliet2 > hotel) {
            juliet2 = hotel;
        }
        int hotel2 = a.hotel(j6);
        if (hotel2 >= juliet) {
            juliet = hotel2;
        }
        if (juliet <= hotel) {
            hotel = juliet;
        }
        int india2 = a.india(j6);
        if (india2 < india) {
            india2 = india;
        }
        if (india2 > golf) {
            india2 = golf;
        }
        int golf2 = a.golf(j6);
        if (golf2 >= india) {
            india = golf2;
        }
        if (india <= golf) {
            golf = india;
        }
        return alpha(juliet2, hotel, india2, golf);
    }

    public static final int foxtrot(int i4, long j5) {
        int india = a.india(j5);
        int golf = a.golf(j5);
        if (i4 < india) {
            i4 = india;
        }
        if (i4 > golf) {
            return golf;
        }
        return i4;
    }

    public static final int golf(int i4, long j5) {
        int juliet = a.juliet(j5);
        int hotel = a.hotel(j5);
        if (i4 < juliet) {
            i4 = juliet;
        }
        if (i4 > hotel) {
            return hotel;
        }
        return i4;
    }

    public static final long hotel(int i4, int i5, int i10, int i11) {
        int i12;
        int i13;
        if (i11 == Integer.MAX_VALUE) {
            i12 = i10;
        } else {
            i12 = i11;
        }
        int charlie = charlie(i12);
        if (i5 == Integer.MAX_VALUE) {
            i13 = i4;
        } else {
            i13 = i5;
        }
        int charlie2 = charlie(i13);
        if (charlie + charlie2 > 31) {
            kilo(i13, i12);
        }
        int i14 = i5 + 1;
        int i15 = i11 + 1;
        int i16 = charlie2 - 13;
        return ((i14 & (~(i14 >> 31))) << 33) | ((i16 >> 1) + (i16 & 1)) | (i4 << 2) | (i10 << (charlie2 + 2)) | ((i15 & (~(i15 >> 31))) << (charlie2 + 33));
    }

    public static final long india(int i4, int i5, long j5) {
        int juliet = a.juliet(j5) + i4;
        int i10 = 0;
        if (juliet < 0) {
            juliet = 0;
        }
        int hotel = a.hotel(j5);
        if (hotel != Integer.MAX_VALUE && (hotel = hotel + i4) < 0) {
            hotel = 0;
        }
        int india = a.india(j5) + i5;
        if (india < 0) {
            india = 0;
        }
        int golf = a.golf(j5);
        if (golf == Integer.MAX_VALUE || (golf = golf + i5) >= 0) {
            i10 = golf;
        }
        return alpha(juliet, hotel, india, i10);
    }

    public static /* synthetic */ long juliet(int i4, int i5, int i10, long j5) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        return india(i4, i5, j5);
    }

    public static final void kilo(int i4, int i5) {
        throw new IllegalArgumentException(P0.azure(i4, i5, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void lima(int i4) {
        throw new IllegalArgumentException(av.q.delta(i4, "Can't represent a size of ", " in Constraints"));
    }
}
