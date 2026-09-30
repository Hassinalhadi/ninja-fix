package an;

import androidx.appcompat.widget.e1;
import t6.AbstractC3082y;

/* loaded from: classes3.dex */
public final class j extends AbstractC3082y {
    public final /* synthetic */ int alpha;
    public boolean bravo;
    public int charlie;
    public final /* synthetic */ Object delta;

    public j(k kVar) {
        this.alpha = 0;
        this.delta = kVar;
        this.bravo = false;
        this.charlie = 0;
    }

    @Override // t6.AbstractC3082y, s1.InterfaceC2566A
    public void alpha() {
        switch (this.alpha) {
            case 1:
                this.bravo = true;
                return;
            default:
                return;
        }
    }

    @Override // s1.InterfaceC2566A
    public final void bravo() {
        switch (this.alpha) {
            case 0:
                int i4 = this.charlie + 1;
                this.charlie = i4;
                k kVar = (k) this.delta;
                if (i4 == kVar.alpha.size()) {
                    AbstractC3082y abstractC3082y = kVar.delta;
                    if (abstractC3082y != null) {
                        abstractC3082y.bravo();
                    }
                    this.charlie = 0;
                    this.bravo = false;
                    kVar.echo = false;
                    return;
                }
                return;
            default:
                if (!this.bravo) {
                    ((e1) this.delta).alpha.setVisibility(this.charlie);
                    return;
                }
                return;
        }
    }

    @Override // t6.AbstractC3082y, s1.InterfaceC2566A
    public final void onAnimationStart() {
        switch (this.alpha) {
            case 0:
                if (!this.bravo) {
                    this.bravo = true;
                    AbstractC3082y abstractC3082y = ((k) this.delta).delta;
                    if (abstractC3082y != null) {
                        abstractC3082y.onAnimationStart();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((e1) this.delta).alpha.setVisibility(0);
                return;
        }
    }

    public j(e1 e1Var, int i4) {
        this.alpha = 1;
        this.delta = e1Var;
        this.charlie = i4;
        this.bravo = false;
    }
}
