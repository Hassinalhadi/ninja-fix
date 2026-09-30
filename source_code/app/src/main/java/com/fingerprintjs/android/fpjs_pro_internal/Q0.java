package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Q0 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ R0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r02) {
        super(0);
        this.alpha = r02;
    }

    @NotNull
    public final String alpha() {
        Intent registerReceiver = R0.delta(this.alpha).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        Intrinsics.checkNotNull(registerReceiver);
        int intExtra = registerReceiver.getIntExtra("health", -1);
        if (intExtra != -1) {
            int i4 = red;
            int i5 = ((i4 | 13) << 1) - (i4 ^ 13);
            purple = i5 % 128;
            if (i5 % 2 == 0) {
                return R0.alpha(intExtra);
            }
            R0.alpha(intExtra);
            throw null;
        }
        int i10 = red;
        purple = ((i10 & 91) + (i10 | 91)) % 128;
        return "";
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        int i5 = ((i4 | 25) << 1) - (i4 ^ 25);
        purple = i5 % 128;
        if (i5 % 2 == 0) {
            String alpha = alpha();
            int i10 = purple;
            int i11 = ((i10 | 53) << 1) - (i10 ^ 53);
            red = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 99 / 0;
            }
            return alpha;
        }
        alpha();
        throw null;
    }
}
