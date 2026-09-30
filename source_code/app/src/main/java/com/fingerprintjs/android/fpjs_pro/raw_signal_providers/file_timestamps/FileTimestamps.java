package com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps;

import com.fingerprintjs.android.fpjs_pro_internal.C1224j2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class FileTimestamps {
    public static int delta = 0;
    public static int echo = 1;
    public final long alpha;
    public final long bravo;
    public final long charlie;

    public FileTimestamps(long j5, long j6, long j7) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
    }

    public static /* synthetic */ Number bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i13;
        int i15 = ~i4;
        int i16 = (~(i14 | i15)) | (~(i13 | i4)) | (~(i10 | i4));
        int i17 = ~i10;
        int i18 = (~(i17 | i4)) | i13;
        int i19 = (~(i4 | i13 | i10)) | (~(i17 | i15));
        int i20 = 1538392064 * i5;
        int i21 = ((-1109524480) * i12) + ((-375259136) * i11) + i20 + (462509112 * i19) + (925018224 * i18) + ((-462509112) * i16) + (1075882953 * i10) + (i13 * 1075882953) + 1902575616;
        int papa = AbstractC2327c.papa(i12, -1711780345, ((-373584967) * i11) + i13 + i10 + i5);
        int i22 = i18 * 1264;
        int i23 = i19 * 632;
        int i24 = i5 * 235013625;
        int i25 = i11 * 915899377;
        int i26 = i12 * (-1709701169);
        int quebec = AbstractC2327c.quebec(papa, 1974403072, i26 + i25 + i24 + i23 + i22 + (i16 * (-632)) + (i10 * 235012993) + ((i13 * 235012993) - 778813113), -848756736, (585564160 * papa) + i21);
        if (quebec != 1) {
            if (quebec != 2) {
                FileTimestamps fileTimestamps = (FileTimestamps) objArr[0];
                int i27 = delta;
                echo = (i27 + 91) % 128;
                long j5 = fileTimestamps.alpha;
                int i28 = i27 + 59;
                echo = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 94 / 0;
                    return Long.valueOf(j5);
                }
                return Long.valueOf(j5);
            }
            FileTimestamps fileTimestamps2 = (FileTimestamps) objArr[0];
            int i30 = echo;
            delta = ((i30 ^ 53) + ((i30 & 53) << 1)) % 128;
            long j6 = fileTimestamps2.alpha;
            int i31 = (int) (j6 ^ (j6 >>> 32));
            int i32 = i31 * 31;
            long j7 = fileTimestamps2.bravo;
            int i33 = (int) (j7 ^ (j7 >>> 32));
            int alpha = C1224j2.alpha();
            int i34 = ((i33 * ModuleDescriptor.MODULE_VERSION) - (~(-(-(i31 * (-4309)))))) - 1;
            int i35 = ~i33;
            int i36 = ~((i35 ^ i32) | (i35 & i32));
            int i37 = ~((i35 ^ alpha) | (i35 & alpha));
            int i38 = -(-(((i36 & i37) | (i36 ^ i37)) * (-280)));
            int i39 = (i34 ^ i38) + ((i34 & i38) << 1);
            int i40 = ~i32;
            int i41 = (((~((i40 ^ alpha) | (i40 & alpha))) | i37) * 140) + i39;
            int i42 = (i35 ^ i40) | (i35 & i40);
            int i43 = ~((i42 & alpha) | (i42 ^ alpha));
            int i44 = ~alpha;
            int i45 = i35 | i44;
            int i46 = ~((i45 & i32) | (i45 ^ i32));
            int i47 = (i46 & i43) | (i43 ^ i46);
            int i48 = ~((i40 ^ i44) | (i44 & i40) | i33);
            int i49 = -(-(((i47 & i48) | (i47 ^ i48)) * 140));
            int i50 = ((i41 ^ i49) + ((i49 & i41) << 1)) * 31;
            long j10 = fileTimestamps2.charlie;
            int i51 = (int) ((j10 >>> 32) ^ j10);
            int i52 = (i50 & i51) + (i51 | i50);
            int i53 = delta;
            int i54 = (i53 & 125) + (i53 | 125);
            echo = i54 % 128;
            if (i54 % 2 != 0) {
                return Integer.valueOf(i52);
            }
            throw null;
        }
        FileTimestamps fileTimestamps3 = (FileTimestamps) objArr[0];
        int i55 = echo;
        delta = (i55 + 1) % 128;
        long j11 = fileTimestamps3.bravo;
        int i56 = (i55 & 69) + (i55 | 69);
        delta = i56 % 128;
        if (i56 % 2 == 0) {
            return Long.valueOf(j11);
        }
        throw null;
    }

    public final long alpha() {
        int i4 = delta;
        int i5 = ((i4 | 77) << 1) - (i4 ^ 77);
        echo = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = i4 + 111;
            echo = i10 % 128;
            int i11 = i10 % 2;
            long j5 = this.charlie;
            if (i11 == 0) {
                int i12 = 41 / 0;
            }
            return j5;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i4 = echo;
        int i5 = ((i4 ^ 91) + ((i4 & 91) << 1)) % 128;
        delta = i5;
        if (this == obj) {
            int i10 = (i4 + 103) % 128;
            delta = i10;
            int i11 = ((i10 | 81) << 1) - (i10 ^ 81);
            echo = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 70 / 0;
            }
            return true;
        }
        if (!(obj instanceof FileTimestamps)) {
            echo = ((i5 ^ 19) + ((i5 & 19) << 1)) % 128;
            return false;
        }
        FileTimestamps fileTimestamps = (FileTimestamps) obj;
        if (this.alpha != fileTimestamps.alpha) {
            int i13 = (i4 + 65) % 128;
            delta = i13;
            echo = (i13 + 105) % 128;
            return false;
        }
        if (this.bravo != fileTimestamps.bravo) {
            echo = (i5 + 55) % 128;
            return false;
        }
        if (this.charlie == fileTimestamps.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Integer) bravo(new Object[]{this}, C1224j2.alpha(), C1224j2.alpha(), -641086714, C1224j2.alpha(), C1224j2.alpha(), 641086716)).intValue();
    }

    public final String toString() {
        int i4 = delta;
        int i5 = ((i4 ^ 63) + ((i4 & 63) << 1)) % 128;
        echo = i5;
        delta = (i5 + 21) % 128;
        return "";
    }
}
