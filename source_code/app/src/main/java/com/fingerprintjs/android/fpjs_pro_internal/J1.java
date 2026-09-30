package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class J1 {
    public static int foxtrot = 0;
    public static int golf = 1;
    public static int hotel;
    public static int india;
    public final Location alpha;
    public final boolean bravo;
    public final List charlie;
    public final long delta;
    public final C1233m echo;

    public J1(Location location, boolean z2, List list, long j5, C1233m c1233m) {
        this.alpha = location;
        this.bravo = z2;
        this.charlie = list;
        this.delta = j5;
        this.echo = c1233m;
    }

    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i4;
        int i16 = ~(i14 | i15 | i10);
        int i17 = ~i10;
        int i18 = i16 | (~(i14 | i17 | i4));
        int i19 = (~(i10 | i15)) | i14 | (~(i17 | i4));
        int i20 = 1305971684 * i19;
        int i21 = (892338176 * i13) + ((-1446510592) * i12) + ((-89653248) * i5) + i20 + ((-1305971684) * i15) + (i18 * (-1305971684)) + ((-1395624931) * i4) + ((1216318437 * i11) - 781189120);
        int papa = AbstractC2327c.papa(i13, -1897213938, (1112421973 * i12) + i11 + i4 + i5);
        int i22 = i15 * (-980);
        int i23 = i19 * 980;
        int i24 = i5 * 2010091741;
        int i25 = i12 * (-1378896031);
        int i26 = i13 * 856652822;
        int quebec = AbstractC2327c.quebec(papa, 563281920, i26 + i25 + i24 + i23 + i22 + (i18 * (-980)) + (i4 * 2010090761) + (i11 * 2010092721) + 1217064380, -1077346304, ((-1657864192) * papa) + i21);
        boolean z2 = false;
        if (quebec != 1) {
            if (quebec != 2) {
                if (quebec != 3) {
                    J1 j12 = (J1) objArr[0];
                    Object obj = objArr[1];
                    int i27 = golf;
                    int i28 = (i27 + 1) % 128;
                    foxtrot = i28;
                    if (j12 == obj) {
                        int i29 = ((i28 & 53) + (i28 | 53)) % 128;
                        golf = i29;
                        foxtrot = (i29 + 115) % 128;
                        return Boolean.TRUE;
                    }
                    if (!(obj instanceof J1)) {
                        int i30 = (i27 & 91) + (i27 | 91);
                        foxtrot = i30 % 128;
                        if (i30 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    J1 j13 = (J1) obj;
                    if (!Intrinsics.areEqual(j12.alpha, j13.alpha)) {
                        int i31 = golf;
                        int i32 = (i31 ^ 53) + ((i31 & 53) << 1);
                        foxtrot = i32 % 128;
                        if (i32 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    if (j12.bravo != j13.bravo) {
                        return Boolean.FALSE;
                    }
                    if (!(!Intrinsics.areEqual(j12.charlie, j13.charlie))) {
                        if (j12.delta != j13.delta) {
                            int i33 = foxtrot + 21;
                            int i34 = i33 % 128;
                            golf = i34;
                            if (i33 % 2 == 0) {
                                z2 = true;
                            }
                            foxtrot = (i34 + 21) % 128;
                            return Boolean.valueOf(z2);
                        }
                        if (!Intrinsics.areEqual(j12.echo, j13.echo)) {
                            return Boolean.FALSE;
                        }
                        int i35 = golf;
                        foxtrot = ((i35 ^ 89) + ((i35 & 89) << 1)) % 128;
                        return Boolean.TRUE;
                    }
                    int i36 = foxtrot;
                    golf = ((i36 ^ 41) + ((i36 & 41) << 1)) % 128;
                    return Boolean.FALSE;
                }
                J1 j14 = (J1) objArr[0];
                int i37 = golf;
                int i38 = (i37 ^ 79) + ((i37 & 79) << 1);
                foxtrot = i38 % 128;
                int i39 = i38 % 2;
                List list = j14.charlie;
                if (i39 == 0) {
                    return list;
                }
                throw null;
            }
            J1 j15 = (J1) objArr[0];
            int i40 = golf;
            int i41 = (i40 & 39) + (i40 | 39);
            foxtrot = i41 % 128;
            int i42 = i41 % 2;
            List list2 = j15.charlie;
            if (i42 != 0) {
                int i43 = 5 / 0;
            }
            return list2;
        }
        int i44 = (foxtrot + 113) % 128;
        golf = i44;
        foxtrot = (((i44 | 111) << 1) - (i44 ^ 111)) % 128;
        return "";
    }

    public static int bravo() {
        int i4 = hotel;
        int i5 = i4 % 8499434;
        hotel = i4 + 1;
        if (i5 != 0) {
            return india;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        india = elapsedRealtime;
        return elapsedRealtime;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) alpha(new Object[]{this, obj}, -1522723654, bravo(), bravo(), 1522723654, bravo(), bravo())).booleanValue();
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int i5 = foxtrot;
        golf = (i5 + 125) % 128;
        Location location = this.alpha;
        if (location == null) {
            golf = (((i5 | 51) << 1) - (i5 ^ 51)) % 128;
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
            int i10 = foxtrot;
            golf = ((i10 & 79) + (i10 | 79)) % 128;
        }
        int i11 = hashCode * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (i11 & i4) + (i11 | i4);
        int i13 = i12 * 31;
        int hashCode2 = this.charlie.hashCode();
        int identityHashCode = System.identityHashCode(this);
        int i14 = ((hashCode2 * 615) - (~(i12 * (-19003)))) - 1;
        int i15 = ~hashCode2;
        int i16 = ~((i15 & i13) | (i15 ^ i13));
        int i17 = ~i13;
        int i18 = (i14 - (~(((identityHashCode | i16) | (~((i17 ^ hashCode2) | (i17 & hashCode2)))) * 614))) - 1;
        int i19 = ~hashCode2;
        int i20 = ~identityHashCode;
        int i21 = ~((i19 ^ i20) | (i19 & i20));
        int i22 = -(-(((i16 & i21) | (i21 ^ i16) | (~((i20 ^ i13) | (i20 & i13)))) * (-1228)));
        int i23 = ((i18 | i22) << 1) - (i22 ^ i18);
        int i24 = ~((i19 ^ i17) | (i19 & i17) | (~identityHashCode));
        int i25 = (hashCode2 & i20) | (i20 ^ hashCode2);
        int i26 = ~((i13 & i25) | (i25 ^ i13));
        int i27 = ((((i26 & i24) | (i24 ^ i26)) * 614) + i23) * 31;
        long j5 = this.delta;
        int i28 = (int) (j5 ^ (j5 >>> 32));
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = i29 * 31;
        int hashCode3 = this.echo.hashCode();
        int identityHashCode2 = System.identityHashCode(this);
        int i31 = hashCode3 * (-375);
        int i32 = -(-(i29 * (-11625)));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        int i34 = ~hashCode3;
        int i35 = ~i30;
        int i36 = (~((i35 & i34) | (i34 ^ i35))) | identityHashCode2;
        int i37 = (hashCode3 ^ i30) | (hashCode3 & i30);
        int i38 = ~i37;
        int i39 = ((i36 & i38) | (i36 ^ i38)) * 376;
        int i40 = (i33 & i39) + (i39 | i33);
        int i41 = ~(hashCode3 | (~identityHashCode2));
        int i42 = ~i37;
        int i43 = -(-(((i41 & i42) | (i41 ^ i42)) * (-376)));
        int i44 = ((i40 | i43) << 1) - (i43 ^ i40);
        int i45 = ~((i34 ^ identityHashCode2) | (i34 & identityHashCode2));
        int i46 = -(-(((i30 & i45) | (i30 ^ i45)) * 376));
        int i47 = (i44 ^ i46) + ((i46 & i44) << 1);
        int i48 = golf;
        foxtrot = (((i48 | 17) << 1) - (i48 ^ 17)) % 128;
        return i47;
    }

    public final String toString() {
        return (String) alpha(new Object[]{this}, -1120885009, bravo(), bravo(), 1120885010, bravo(), bravo());
    }
}
