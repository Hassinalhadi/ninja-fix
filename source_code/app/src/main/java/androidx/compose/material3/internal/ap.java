package androidx.compose.material3.internal;

import bz.X;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ap extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ X purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap(X x4, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = x4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                if (((Number) this.purple.getValue()).floatValue() > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                if (((Number) this.purple.getValue()).floatValue() > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
