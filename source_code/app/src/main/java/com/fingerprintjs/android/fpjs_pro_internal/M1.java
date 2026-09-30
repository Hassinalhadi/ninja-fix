package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/M1;", "", "delta", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class M1 {
    public static int echo = 0;
    public static int foxtrot = 1;
    public final int alpha;
    public final long bravo;
    public final C1233m charlie;

    public M1(int i4, long j5, C1233m c1233m) {
        this.alpha = i4;
        this.bravo = j5;
        this.charlie = c1233m;
    }

    public static Serializable alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = ~i5;
        int i16 = ~i12;
        int i17 = (~(i14 | i15 | i16)) | (~(i10 | i5));
        int i18 = ~(i12 | i5);
        int i19 = i17 | i18;
        int i20 = ~(i14 | i5);
        int i21 = i18 | i14 | (~(i15 | i16));
        int i22 = (469762048 * i11) + ((-1337982976) * i13) + ((-88080384) * i4) + ((-325430244) * i21) + (325430244 * i20) + (i19 * 325430244) + (237349861 * i5) + ((-413510627) * i10) + 1558183936;
        int papa = AbstractC2327c.papa(i11, 1735201104, (1349231875 * i13) + i10 + i5 + i4);
        if (AbstractC2327c.quebec(papa, -417333248, (i11 * (-1872492752)) + (i13 * (-66979019)) + (i4 * 236313959) + (i21 * 836) + (i20 * (-836)) + (i19 * (-836)) + (i5 * 236313123) + ((i10 * 236314795) - 374860141), 639631360, (1272971264 * papa) + i22) != 1) {
            M1 m1 = (M1) objArr[0];
            int i23 = foxtrot;
            echo = ((i23 ^ 7) + ((i23 & 7) << 1)) % 128;
            Pair pair = new Pair(P28427.C1180z1.echo.vD14832N6715(), Integer.valueOf(m1.alpha));
            Pair pair2 = new Pair(P28427.V4.echo.vD14832N6715(), Long.valueOf(m1.bravo));
            String vD14832N6715 = P28427.C1005a1.echo.vD14832N6715();
            C1233m c1233m = m1.charlie;
            Map sierra = kotlin.collections.y.sierra(pair, pair2, new Pair(vD14832N6715, Long.valueOf(c1233m.alpha)), new Pair(P28427.C1164x.echo.vD14832N6715(), Long.valueOf(c1233m.bravo)));
            foxtrot = (echo + 121) % 128;
            return (Serializable) sierra;
        }
        M1 m12 = (M1) objArr[0];
        Object obj = objArr[1];
        int i24 = echo;
        int i25 = ((i24 & 49) + (i24 | 49)) % 128;
        foxtrot = i25;
        if (m12 == obj) {
            int i26 = i24 + 79;
            foxtrot = i26 % 128;
            if (i26 % 2 == 0) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        if (!(obj instanceof M1)) {
            echo = ((i25 & 15) + (i25 | 15)) % 128;
            return Boolean.FALSE;
        }
        M1 m13 = (M1) obj;
        if (m12.alpha != m13.alpha) {
            echo = (((i25 | 107) << 1) - (i25 ^ 107)) % 128;
            return Boolean.FALSE;
        }
        if (m12.bravo != m13.bravo) {
            int vD14832N67152 = F2.vD14832N6715();
            int i27 = ~vD14832N67152;
            int i28 = ((~(98836025 | i27)) * (-560)) + 1559096876;
            int i29 = -(-((~((vD14832N67152 & (-1880629507)) | ((-1880629507) ^ vD14832N67152))) * (-560)));
            int i30 = (((i28 & i29) + (i29 | i28)) - (~(((~(1885090579 | i27)) | 94374952) * 560))) - 1;
            int vD14832N67153 = F2.vD14832N6715();
            int i31 = ~vD14832N67153;
            int i32 = ~((1873772011 & i31) | (1873772011 ^ i31));
            int i33 = (((-1182062386) - (~(((~((vD14832N67153 & (-252140907)) | ((-252140907) ^ vD14832N67153))) | ((i32 & 134234376) | (i32 ^ 134234376))) * (-68)))) - (~((~((-252140907) | ((1755865481 ^ i31) | (1755865481 & i31)))) * (-68)))) - 1;
            int i34 = (1755865481 | (~((i31 & 252140906) | (252140906 ^ i31)))) * 68;
            if (i30 <= (i33 ^ i34) + ((i34 & i33) << 1)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (!Intrinsics.areEqual(m12.charlie, m13.charlie)) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) alpha(new Object[]{this, obj}, F2.vD14832N6715(), -365831209, 365831210, F2.vD14832N6715(), F2.vD14832N6715(), F2.vD14832N6715())).booleanValue();
    }

    public final int hashCode() {
        int i4 = foxtrot;
        echo = ((i4 & 97) + (i4 | 97)) % 128;
        int i5 = this.alpha * 31;
        long j5 = this.bravo;
        int i10 = (int) (j5 ^ (j5 >>> 32));
        int i11 = (i5 ^ i10) + ((i5 & i10) << 1);
        int i12 = i11 * 31;
        int hashCode = this.charlie.hashCode();
        int vD14832N6715 = F2.vD14832N6715();
        int i13 = hashCode * (-103);
        int i14 = -(-(i11 * (-3193)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = ~hashCode;
        int i17 = ~i12;
        int i18 = ~((i16 & i17) | (i16 ^ i17));
        int i19 = ~i12;
        int i20 = ~((i19 & vD14832N6715) | (i19 ^ vD14832N6715));
        int i21 = ((i18 & i20) | (i18 ^ i20)) * 104;
        int i22 = (i15 & i21) + (i21 | i15);
        int i23 = ~vD14832N6715;
        int i24 = (i23 & hashCode) | (i23 ^ hashCode);
        int i25 = (~((i12 & i24) | (i24 ^ i12))) * (-104);
        int i26 = (i22 & i25) + (i25 | i22);
        int i27 = ((hashCode ^ vD14832N6715) | (hashCode & vD14832N6715)) * 104;
        int i28 = (i26 & i27) + (i27 | i26);
        int i29 = foxtrot + 31;
        echo = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = 24 / 0;
        }
        return i28;
    }

    public final String toString() {
        int i4 = echo;
        foxtrot = ((i4 & 81) + (i4 | 81)) % 128;
        return "";
    }
}
