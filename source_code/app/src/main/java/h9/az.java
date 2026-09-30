package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.tNn;
import com.incognia.internal.wKp;

/* loaded from: classes2.dex */
public final /* synthetic */ class az implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ tNn bravo;
    public final /* synthetic */ wKp charlie;

    public /* synthetic */ az(tNn tnn, wKp wkp, int i4) {
        this.alpha = i4;
        this.bravo = tnn;
        this.charlie = wkp;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                tNn.W(this.bravo, this.charlie);
                return;
            default:
                tNn.b(this.bravo, this.charlie);
                return;
        }
    }
}
