package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1278x1 extends gF31878 {
    public static int india = 0;
    public static int juliet = 1;
    public final String foxtrot;
    public final Map golf;
    public final component2.b hotel;

    public C1278x1(String str, Map map, component2.b bVar) {
        super(str, map, bVar, null);
        this.foxtrot = str;
        this.golf = map;
        this.hotel = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        r11 = com.fingerprintjs.android.fpjs_pro_internal.C1278x1.india + 111;
        com.fingerprintjs.android.fpjs_pro_internal.C1278x1.juliet = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if ((r11 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        if (r6.golf == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008e, code lost:
    
        if (r6.golf == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00aa, code lost:
    
        r9 = r6.golf.hashCode();
        com.fingerprintjs.android.fpjs_pro_internal.C1278x1.juliet = (com.fingerprintjs.android.fpjs_pro_internal.C1278x1.india + 123) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int hashCode;
        int i14 = i10 | i12;
        int i15 = ~i4;
        int i16 = i14 | i15;
        int i17 = ~(i15 | i10);
        int i18 = (~i14) | i17;
        int i19 = i17 | (~((~i10) | (~i12)));
        int i20 = ((-1801453568) * i13) + ((-648019968) * i5) + (1630535680 * i11) + ((-2106796043) * i19) + (2106796043 * i18) + (i16 * (-2106796043)) + ((-557635572) * i12) + ((i10 * (-557635572)) - 1375207424);
        int papa = AbstractC2327c.papa(i13, 2071835342, (1699743442 * i5) + i10 + i12 + i11);
        int i21 = i18 * (-521);
        int i22 = i19 * 521;
        int i23 = i11 * (-355763899);
        int i24 = i5 * 2119243930;
        int i25 = i13 * (-943812730);
        int quebec = AbstractC2327c.quebec(papa, -597164032, i25 + i24 + i23 + i22 + i21 + (i16 * 521) + (i12 * (-355764420)) + ((i10 * (-355764420)) - 259725689), 58195968, (1296564224 * papa) + i20);
        int i26 = 0;
        if (quebec != 1) {
            if (quebec != 2) {
                C1278x1 c1278x1 = (C1278x1) objArr[0];
                int i27 = india + 119;
                juliet = i27 % 128;
                if (i27 % 2 == 0) {
                    hashCode = c1278x1.foxtrot.hashCode() + 82;
                } else {
                    hashCode = c1278x1.foxtrot.hashCode() * 31;
                }
                int identityHashCode = System.identityHashCode(c1278x1);
                int i28 = (hashCode * (-929)) + (i26 * (-464));
                int i29 = ~i26;
                int i30 = (hashCode ^ identityHashCode) | (hashCode & identityHashCode);
                int i31 = ~i30;
                int i32 = (((i31 & i29) | (i29 ^ i31)) * (-465)) + i28;
                int i33 = ~((identityHashCode & i29) | (i29 ^ identityHashCode));
                int i34 = -(-(((hashCode & i33) | (hashCode ^ i33)) * 930));
                int i35 = (i32 & i34) + (i34 | i32);
                int i36 = -(-(((i30 ^ i29) | (i29 & i30)) * 465));
                int i37 = ((i35 & i36) + (i36 | i35)) * 31;
                int i38 = -(-c1278x1.hotel.hashCode());
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                int i40 = india;
                juliet = ((i40 ^ 43) + ((i40 & 43) << 1)) % 128;
                return Integer.valueOf(i39);
            }
            C1278x1 c1278x12 = (C1278x1) objArr[0];
            india = (juliet + 89) % 128;
            StringBuilder victor = Q0.c.victor("SignalFailure(name=", c1278x12.foxtrot, ", value=");
            victor.append(c1278x12.golf);
            victor.append(", s=");
            victor.append(c1278x12.hotel);
            victor.append(")");
            String sb2 = victor.toString();
            int i41 = juliet + 71;
            india = i41 % 128;
            if (i41 % 2 == 0) {
                return sb2;
            }
            throw null;
        }
        C1278x1 c1278x13 = (C1278x1) objArr[0];
        india = (juliet + 51) % 128;
        c1278x13.getClass();
        int i42 = india + 43;
        int i43 = i42 % 128;
        juliet = i43;
        if (i42 % 2 == 0) {
            int i44 = 51 / 0;
        }
        india = (i43 + 55) % 128;
        return c1278x13.hotel;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.gF31878
    public final String alpha() {
        int i4 = juliet;
        int i5 = (i4 ^ 61) + ((i4 & 61) << 1);
        india = i5 % 128;
        int i10 = i5 % 2;
        String str = this.foxtrot;
        if (i10 != 0) {
            int i11 = 75 / 0;
        }
        return str;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.gF31878
    public final /* synthetic */ component2 charlie() {
        return (component2) delta(new Object[]{this}, bi.alpha(), bi.alpha(), -1419173069, bi.alpha(), 1419173070, bi.alpha());
    }

    public final boolean equals(Object obj) {
        int i4 = india;
        int i5 = i4 ^ 101;
        juliet = (((i4 & 101) << 1) + i5) % 128;
        if (this != obj) {
            if (!(obj instanceof C1278x1)) {
                int i10 = (((i4 | 101) << 1) - i5) % 128;
                juliet = i10;
                int i11 = ((i10 | 73) << 1) - (i10 ^ 73);
                india = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            } else {
                C1278x1 c1278x1 = (C1278x1) obj;
                if (!Intrinsics.areEqual(this.foxtrot, c1278x1.foxtrot)) {
                    int i12 = india + 117;
                    juliet = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                } else if (!Intrinsics.areEqual(this.golf, c1278x1.golf)) {
                    int i13 = juliet + 83;
                    india = i13 % 128;
                    if (i13 % 2 != 0) {
                    }
                } else if (!Intrinsics.areEqual(this.hotel, c1278x1.hotel)) {
                    int i14 = india;
                    int i15 = (i14 ^ 85) + ((i14 & 85) << 1);
                    juliet = i15 % 128;
                    if (i15 % 2 == 0) {
                    }
                } else {
                    int i16 = juliet + 121;
                    india = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 18 / 0;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((Integer) delta(new Object[]{this}, bi.alpha(), bi.alpha(), 756233077, bi.alpha(), -756233077, bi.alpha())).intValue();
    }

    public final String toString() {
        return (String) delta(new Object[]{this}, bi.alpha(), bi.alpha(), 420464181, bi.alpha(), -420464179, bi.alpha());
    }
}
