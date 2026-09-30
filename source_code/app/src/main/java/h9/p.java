package h9;

import com.incognia.internal.Nq;
import com.incognia.internal.d7p;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Nq bravo;

    public /* synthetic */ p(Nq nq, int i4) {
        this.alpha = i4;
        this.bravo = nq;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                Nq.b(this.bravo);
                return;
            case 1:
                Nq.gmP(this.bravo);
                return;
            case 2:
                Nq.f9(this.bravo);
                return;
            default:
                Nq.W(this.bravo);
                return;
        }
    }
}
