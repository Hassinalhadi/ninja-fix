package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.gx0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ gx0 bravo;

    public /* synthetic */ ao(gx0 gx0Var, int i4) {
        this.alpha = i4;
        this.bravo = gx0Var;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                gx0.W(this.bravo);
                return;
            default:
                gx0.b(this.bravo);
                return;
        }
    }
}
