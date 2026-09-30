package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class P0 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ R0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r02) {
        super(0);
        this.alpha = r02;
    }

    @NotNull
    public final String alpha() {
        int i4 = red;
        purple = ((i4 & 41) + (i4 | 41)) % 128;
        String valueOf = String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(R0.delta(this.alpha)), null)).doubleValue());
        int i5 = purple;
        int i10 = (i5 & 35) + (i5 | 35);
        red = i10 % 128;
        if (i10 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = ((i4 & 59) + (i4 | 59)) % 128;
        String alpha = alpha();
        int i5 = red;
        int i10 = (i5 & 7) + (i5 | 7);
        purple = i10 % 128;
        if (i10 % 2 == 0) {
            return alpha;
        }
        throw null;
    }
}
