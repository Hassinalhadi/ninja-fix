package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class S implements A1 {
    public static final S bravo = new S(0);
    public static final S charlie = new S(1);
    public static final S delta = new S(2);
    public static final S echo = new S(3);
    public static final S foxtrot = new S(4);
    public static final S golf = new S(5);
    public static final S hotel = new S(6);
    public static final S india = new S(7);
    public static final S juliet = new S(8);
    public static final S kilo = new S(9);
    public static final S lima = new S(10);
    public final /* synthetic */ int alpha;

    public /* synthetic */ S(int i4) {
        this.alpha = i4;
    }

    @Override // com.google.android.gms.internal.measurement.A1
    public final boolean alpha(int i4) {
        switch (this.alpha) {
            case 0:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                    return true;
                }
                return false;
            case 1:
                switch (i4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                if (i4 == 0 || i4 == 1 || i4 == 2) {
                    return true;
                }
                return false;
            case 3:
                if (T0.bravo(i4) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                    return true;
                }
                return false;
            case 5:
                if (i4 == 0 || i4 == 1) {
                    return true;
                }
                return false;
            case 6:
                if (i4 == 1 || i4 == 2) {
                    return true;
                }
                return false;
            case 7:
                if (ao.ad.echo(i4) != 0) {
                    return true;
                }
                return false;
            case 8:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                    return true;
                }
                return false;
            case 9:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                    return true;
                }
                return false;
            default:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                    return true;
                }
                return false;
        }
    }
}
