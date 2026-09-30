package h9;

import android.net.Network;
import com.incognia.internal.d7p;
import com.incognia.internal.lhI;
import com.incognia.internal.qm4;

/* loaded from: classes2.dex */
public final /* synthetic */ class ax implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ lhI bravo;
    public final /* synthetic */ Network charlie;

    public /* synthetic */ ax(lhI lhi, Network network, int i4) {
        this.alpha = i4;
        this.bravo = lhi;
        this.charlie = network;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                qm4.W(this.bravo, this.charlie);
                return;
            default:
                qm4.b(this.bravo, this.charlie);
                return;
        }
    }
}
