package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.InvalidProxyIntegrationHeaders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/Y1;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/Y1;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ag extends Lambda implements Function0<Y1> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ ai alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ai aiVar) {
        super(0);
        this.alpha = aiVar;
    }

    @NotNull
    public final Y1 alpha() {
        red = (purple + 53) % 128;
        int i4 = ai.bronze;
        ai.blue = ((i4 ^ 87) + ((i4 & 87) << 1)) % 128;
        I i5 = this.alpha.bravo;
        ai.blue = (i4 + 31) % 128;
        C1228k2 c1228k2 = (C1228k2) i5;
        c1228k2.getClass();
        Y1 y12 = (Y1) C1228k2.alpha(new Object[]{c1228k2}, InvalidProxyIntegrationHeaders.D8871(), InvalidProxyIntegrationHeaders.D8871(), InvalidProxyIntegrationHeaders.D8871(), -532600118, InvalidProxyIntegrationHeaders.D8871(), 532600118);
        int i10 = purple;
        red = ((i10 & 93) + (i10 | 93)) % 128;
        return y12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Y1 invoke() {
        int i4 = red;
        purple = ((i4 ^ 51) + ((i4 & 51) << 1)) % 128;
        Y1 alpha = alpha();
        int i5 = red + 7;
        purple = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 0 / 0;
        }
        return alpha;
    }
}
