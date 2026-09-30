package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.lhI;
import com.incognia.internal.qm4;

/* loaded from: classes2.dex */
public final /* synthetic */ class as implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ lhI bravo;

    public /* synthetic */ as(lhI lhi, int i4) {
        this.alpha = i4;
        this.bravo = lhi;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                lhI.b(this.bravo);
                return;
            default:
                qm4.b(this.bravo);
                return;
        }
    }
}
