package com.fingerprintjs.android.fpjs_pro_internal;

import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1250q0 extends Lambda implements Function0<String> {
    public final /* synthetic */ C1261t0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1250q0(C1261t0 c1261t0) {
        super(0);
        this.alpha = c1261t0;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        TelephonyManager telephonyManager = (TelephonyManager) C1261t0.bravo(new Object[]{this.alpha}, 756340061, com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), -756340060);
        Intrinsics.checkNotNull(telephonyManager);
        String simCountryIso = telephonyManager.getSimCountryIso();
        Intrinsics.checkNotNull(simCountryIso);
        return simCountryIso;
    }
}
