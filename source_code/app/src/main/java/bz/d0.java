package bz;

/* loaded from: classes3.dex */
public final class d0 implements androidx.compose.runtime.af {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ a0 bravo;

    public /* synthetic */ d0(a0 a0Var, int i4) {
        this.alpha = i4;
        this.bravo = a0Var;
    }

    @Override // androidx.compose.runtime.af
    public final void dispose() {
        switch (this.alpha) {
            case 0:
                a0 a0Var = this.bravo;
                a0Var.juliet();
                a0Var.alpha.S();
                return;
            default:
                a0 a0Var2 = this.bravo;
                a0Var2.juliet();
                a0Var2.alpha.S();
                return;
        }
    }
}
