package com.fingerprintjs.android.fpjs_pro_internal;

import android.telephony.TelephonyManager;
import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1218i0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/i0;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/i0;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1246p0 extends Lambda implements Function0<AbstractC1218i0> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1261t0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246p0(C1261t0 c1261t0) {
        super(0);
        this.alpha = c1261t0;
    }

    @NotNull
    public final AbstractC1218i0 alpha() {
        int i4 = red;
        purple = (((i4 | 39) << 1) - (i4 ^ 39)) % 128;
        TelephonyManager telephonyManager = (TelephonyManager) C1261t0.bravo(new Object[]{this.alpha}, 756340061, com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), -756340060);
        Intrinsics.checkNotNull(telephonyManager);
        switch (telephonyManager.getDataState()) {
            case -1:
                AbstractC1218i0.c cVar = AbstractC1218i0.c.alpha;
                int i5 = purple;
                int i10 = ((i5 | 75) << 1) - (i5 ^ 75);
                red = i10 % 128;
                if (i10 % 2 != 0) {
                    return cVar;
                }
                throw null;
            case 0:
                return AbstractC1218i0.f.alpha;
            case 1:
                AbstractC1218i0.a aVar = AbstractC1218i0.a.alpha;
                red = (purple + 35) % 128;
                return aVar;
            case 2:
                AbstractC1218i0.b bVar = AbstractC1218i0.b.alpha;
                int i11 = red;
                int i12 = (i11 ^ 61) + ((i11 & 61) << 1);
                purple = i12 % 128;
                if (i12 % 2 == 0) {
                    return bVar;
                }
                throw null;
            case 3:
                return AbstractC1218i0.e.alpha;
            case 4:
                return AbstractC1218i0.d.alpha;
            case 5:
                return AbstractC1218i0.g.alpha;
            default:
                throw new Exception();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ AbstractC1218i0 invoke() {
        int i4 = red;
        int i5 = ((i4 | 17) << 1) - (i4 ^ 17);
        purple = i5 % 128;
        if (i5 % 2 == 0) {
            AbstractC1218i0 alpha = alpha();
            int i10 = red;
            purple = (((i10 | 85) << 1) - (i10 ^ 85)) % 128;
            return alpha;
        }
        alpha();
        throw null;
    }
}
