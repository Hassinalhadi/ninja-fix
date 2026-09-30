package h9;

import com.incognia.internal.KYK;
import com.incognia.internal.Nq;
import com.incognia.internal.R0t;
import com.incognia.internal.fU;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements KYK {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ q(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // com.incognia.internal.KYK
    public final void b(R0t r0t) {
        switch (this.alpha) {
            case 0:
                Nq.b((Nq) this.bravo, r0t);
                return;
            default:
                fU.b((fU) this.bravo, r0t);
                return;
        }
    }
}
