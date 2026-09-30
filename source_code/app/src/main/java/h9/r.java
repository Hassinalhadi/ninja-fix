package h9;

import com.incognia.internal.Gg;
import com.incognia.internal.Nq;
import com.incognia.internal.WnY;
import com.incognia.internal.a11;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements a11 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Gg bravo;

    public /* synthetic */ r(Gg gg, int i4) {
        this.alpha = i4;
        this.bravo = gg;
    }

    @Override // com.incognia.internal.a11
    public final void b() {
        switch (this.alpha) {
            case 0:
                Nq.sVU((Nq) this.bravo);
                return;
            default:
                WnY.W((WnY) this.bravo);
                return;
        }
    }
}
