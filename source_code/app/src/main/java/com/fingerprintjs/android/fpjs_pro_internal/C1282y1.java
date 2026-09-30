package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.component2;
import com.zendesk.service.HttpConstants;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282y1 extends gF31878 {
    public static int hotel = 0;
    public static int india = 1;
    public final String foxtrot;
    public final Object golf;

    public C1282y1(String str, Object obj) {
        super(str, obj, component2.a.echo, null);
        this.foxtrot = str;
        this.golf = obj;
    }

    public static /* synthetic */ Object delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i13;
        int i15 = ~((~i5) | i14);
        int i16 = ~(i11 | i14);
        int i17 = i15 | i16;
        int i18 = i16 | i5;
        int i19 = ~(i14 | i5);
        int i20 = (1290797056 * i10) + ((-767557632) * i4) + ((-837287936) * i12) + (189531495 * i19) + ((-189531495) * i18) + (i17 * 189531495) + ((-647756440) * i5) + (((-1026819430) * i13) - 865599488);
        int papa = AbstractC2327c.papa(i10, 977123338, (1577873432 * i4) + i13 + i5 + i12);
        int i21 = i17 * HttpConstants.HTTP_UNAVAILABLE;
        int i22 = i18 * (-503);
        if (AbstractC2327c.quebec(papa, 70909952, (i10 * (-1884272278)) + (i4 * 1546282648) + (i12 * (-1177406223)) + (i19 * HttpConstants.HTTP_UNAVAILABLE) + i22 + i21 + (i5 * (-1177405720)) + (i13 * (-1177406726)) + 1326046462, 451280896, ((-539361280) * papa) + i20) != 1) {
            C1282y1 c1282y1 = (C1282y1) objArr[0];
            int i23 = india;
            hotel = ((i23 & 9) + (i23 | 9)) % 128;
            String emerald = androidx.appcompat.widget.P0.emerald(Q0.c.victor("SignalSuccess(name=", c1282y1.foxtrot, ", value="), c1282y1.golf, ")");
            india = (hotel + 111) % 128;
            return emerald;
        }
        C1282y1 c1282y12 = (C1282y1) objArr[0];
        Object obj = objArr[1];
        int i24 = india;
        int i25 = ((i24 | 111) << 1) - (i24 ^ 111);
        int i26 = i25 % 128;
        hotel = i26;
        if (i25 % 2 == 0) {
            if (c1282y12 == obj) {
                int i27 = i26 + 85;
                india = i27 % 128;
                int i28 = i27 % 2;
                Boolean bool = Boolean.TRUE;
                if (i28 == 0) {
                }
                return bool;
            }
            if (!(obj instanceof C1282y1)) {
                hotel = ((i24 ^ 107) + ((i24 & 107) << 1)) % 128;
                return Boolean.FALSE;
            }
            C1282y1 c1282y13 = (C1282y1) obj;
            if (!Intrinsics.areEqual(c1282y12.foxtrot, c1282y13.foxtrot)) {
                int i29 = india;
                hotel = ((i29 & 15) + (i29 | 15)) % 128;
                return Boolean.FALSE;
            }
            if (Intrinsics.areEqual(c1282y12.golf, c1282y13.golf)) {
                return Boolean.TRUE;
            }
            int i30 = hotel;
            india = (((i30 | 23) << 1) - (i30 ^ 23)) % 128;
            return Boolean.FALSE;
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.gF31878
    public final String alpha() {
        int i4 = india;
        int i5 = (((i4 | 59) << 1) - (i4 ^ 59)) % 128;
        hotel = i5;
        india = ((i5 & 29) + (i5 | 29)) % 128;
        return this.foxtrot;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) delta(new Object[]{this, obj}, copy$D8871.component5(), -1643864655, copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), 1643864656)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        r1 = r3.hashCode();
        r3 = com.fingerprintjs.android.fpjs_pro_internal.C1282y1.hotel;
        com.fingerprintjs.android.fpjs_pro_internal.C1282y1.india = ((r3 & 69) + (r3 | 69)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.C1282y1.india;
        r3 = (r1 & 107) + (r1 | 107);
        com.fingerprintjs.android.fpjs_pro_internal.C1282y1.hotel = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i4;
        int i5;
        int i10 = hotel;
        int i11 = ((i10 | 13) << 1) - (i10 ^ 13);
        india = i11 % 128;
        int i12 = i11 % 2;
        String str = this.foxtrot;
        Object obj = this.golf;
        int hashCode = str.hashCode();
        if (i12 == 0) {
            i4 = hashCode << 12;
        } else {
            i4 = hashCode * 31;
        }
        int i13 = -(-i5);
        int i14 = (i4 ^ i13) + ((i4 & i13) << 1);
        hotel = (india + 77) % 128;
        return i14;
    }

    public final String toString() {
        return (String) delta(new Object[]{this}, copy$D8871.component5(), -790822268, copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), 790822268);
    }
}
