package h9;

import com.incognia.internal.cFV;
import com.incognia.internal.d7p;

/* loaded from: classes2.dex */
public final /* synthetic */ class af implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ cFV bravo;

    public /* synthetic */ af(cFV cfv, int i4) {
        this.alpha = i4;
        this.bravo = cfv;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                cFV.W(this.bravo);
                return;
            case 1:
                cFV.sVU(this.bravo);
                return;
            case 2:
                cFV.f9(this.bravo);
                return;
            default:
                cFV.b(this.bravo);
                return;
        }
    }
}
