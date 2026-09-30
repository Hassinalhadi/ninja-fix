package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Y extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Z alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z2) {
        super(0);
        this.alpha = z2;
    }

    @NotNull
    public final String alpha() {
        purple = (red + 101) % 128;
        String alpha = Z.alpha(new Object[]{this.alpha}, C1188a2.alpha(), C1188a2.alpha(), C1188a2.alpha(), 1947440971, C1188a2.alpha(), -1947440970);
        int i4 = purple;
        red = (((i4 | 21) << 1) - (i4 ^ 21)) % 128;
        return alpha;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = purple;
        int i5 = (i4 & 63) + (i4 | 63);
        red = i5 % 128;
        if (i5 % 2 != 0) {
            String alpha = alpha();
            red = (purple + 13) % 128;
            return alpha;
        }
        alpha();
        throw null;
    }
}
