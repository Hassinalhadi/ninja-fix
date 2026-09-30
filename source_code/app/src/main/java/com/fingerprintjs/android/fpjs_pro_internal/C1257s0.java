package com.fingerprintjs.android.fpjs_pro_internal;

import android.telephony.TelephonyManager;
import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1210g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/g0;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/g0;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1257s0 extends Lambda implements Function0<AbstractC1210g0> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1261t0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257s0(C1261t0 c1261t0) {
        super(0);
        this.alpha = c1261t0;
    }

    @NotNull
    public final AbstractC1210g0 alpha() {
        purple = (red + 63) % 128;
        TelephonyManager telephonyManager = (TelephonyManager) C1261t0.bravo(new Object[]{this.alpha}, 756340061, com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), -756340060);
        Intrinsics.checkNotNull(telephonyManager);
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 0) {
            if (phoneType != 1) {
                if (phoneType != 2) {
                    if (phoneType == 3) {
                        AbstractC1210g0.b bVar = AbstractC1210g0.b.alpha;
                        int identityHashCode = System.identityHashCode(this);
                        int i4 = ~identityHashCode;
                        int i5 = i4 | (-1733556555);
                        int i10 = ((~((i5 & 1364903436) | (i5 ^ 1364903436))) * 52) + 1837476461;
                        int i11 = ~(i4 | (-1364903437));
                        int i12 = (i11 & 1095942152) | (i11 ^ 1095942152);
                        int i13 = ~identityHashCode;
                        int i14 = ~(((-1733556555) & i13) | (i13 ^ (-1733556555)));
                        int i15 = (((i12 & i14) | (i12 ^ i14)) * (-52)) + i10;
                        int i16 = ~((i13 & 1733556554) | (1733556554 ^ i13));
                        int i17 = -(-(((i16 & (-2002517839)) | (i16 ^ (-2002517839))) * 52));
                        int i18 = (i15 ^ i17) + ((i17 & i15) << 1);
                        int identityHashCode2 = System.identityHashCode(this);
                        int i19 = ~(((-1678485705) & identityHashCode2) | ((-1678485705) ^ identityHashCode2));
                        int i20 = ~identityHashCode2;
                        int i21 = (197416225 & i20) | (197416225 ^ i20);
                        int i22 = (i19 | (~((i21 & 1720434152) | (i21 ^ 1720434152)))) * 497;
                        int i23 = (1481092264 ^ i22) + ((i22 & 1481092264) << 1);
                        int i24 = ~(((-1720434153) & i20) | ((-1720434153) ^ i20));
                        int i25 = (i24 & 41948448) | (i24 ^ 41948448);
                        int i26 = ~((identityHashCode2 & 1875901929) | (1875901929 ^ identityHashCode2));
                        int i27 = -(-(((i25 & i26) | (i25 ^ i26)) * 497));
                        if (i18 <= (i23 & i27) + (i27 | i23)) {
                            return bVar;
                        }
                        throw null;
                    }
                    throw new Exception();
                }
                return AbstractC1210g0.d.alpha;
            }
            AbstractC1210g0.a aVar = AbstractC1210g0.a.alpha;
            int i28 = red;
            int i29 = (i28 & 117) + (i28 | 117);
            purple = i29 % 128;
            if (i29 % 2 == 0) {
                return aVar;
            }
            throw null;
        }
        return AbstractC1210g0.c.alpha;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ AbstractC1210g0 invoke() {
        red = (purple + 57) % 128;
        AbstractC1210g0 alpha = alpha();
        purple = (red + 97) % 128;
        return alpha;
    }
}
