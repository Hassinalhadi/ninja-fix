package cc;

import androidx.compose.runtime.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p0 purple;

    public /* synthetic */ e(p0 p0Var, int i4) {
        this.alpha = i4;
        this.purple = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.kilo(r0.juliet() - 1);
                return Unit.INSTANCE;
            case 1:
                p0 p0Var = this.purple;
                p0Var.kilo(p0Var.juliet() + 1);
                return Unit.INSTANCE;
            case 2:
                g.india(this.purple, r0.juliet() - 1);
                return Unit.INSTANCE;
            default:
                p0 p0Var2 = this.purple;
                g.india(p0Var2, p0Var2.juliet() + 1);
                return Unit.INSTANCE;
        }
    }
}
