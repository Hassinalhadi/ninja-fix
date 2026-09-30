package bz;

import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ a0 purple;

    public /* synthetic */ S(a0 a0Var, int i4) {
        this.alpha = i4;
        this.purple = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        switch (this.alpha) {
            case 0:
                a0 a0Var = this.purple;
                if (Intrinsics.areEqual(((t0) a0Var.delta).getValue(), a0Var.alpha.L()) && a0Var.golf.juliet() == Long.MIN_VALUE && !((Boolean) ((t0) a0Var.hotel).getValue()).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                return Long.valueOf(this.purple.bravo());
        }
    }
}
