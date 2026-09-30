package bx;

import androidx.compose.runtime.t0;
import bz.a0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ag implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ a0 purple;

    public /* synthetic */ ag(a0 a0Var, int i4) {
        this.alpha = i4;
        this.purple = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return ((t0) this.purple.delta).getValue();
            default:
                return this.purple.foxtrot();
        }
    }
}
