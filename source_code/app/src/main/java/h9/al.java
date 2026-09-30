package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.fU;

/* loaded from: classes2.dex */
public final /* synthetic */ class al implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ fU bravo;

    public /* synthetic */ al(fU fUVar, int i4) {
        this.alpha = i4;
        this.bravo = fUVar;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                fU.b(this.bravo);
                return;
            case 1:
                fU.W(this.bravo);
                return;
            default:
                fU.f9(this.bravo);
                return;
        }
    }
}
