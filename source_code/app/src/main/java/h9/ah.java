package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.d94;
import com.incognia.internal.pYm;

/* loaded from: classes2.dex */
public final /* synthetic */ class ah implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d94 bravo;
    public final /* synthetic */ pYm charlie;

    public /* synthetic */ ah(d94 d94Var, pYm pym, int i4) {
        this.alpha = i4;
        this.bravo = d94Var;
        this.charlie = pym;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                d94.b(this.bravo, this.charlie);
                return;
            case 1:
                d94.W(this.bravo, this.charlie);
                return;
            default:
                d94.f9(this.bravo, this.charlie);
                return;
        }
    }
}
