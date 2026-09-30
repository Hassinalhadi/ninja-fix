package h9;

import com.incognia.internal.G5G;
import com.incognia.internal.KYK;
import com.incognia.internal.d7p;

/* renamed from: h9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1829g implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ G5G bravo;
    public final /* synthetic */ KYK charlie;

    public /* synthetic */ C1829g(G5G g5g, KYK kyk, int i4) {
        this.alpha = i4;
        this.bravo = g5g;
        this.charlie = kyk;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                G5G.b(this.bravo, this.charlie);
                return;
            default:
                G5G.W(this.bravo, this.charlie);
                return;
        }
    }
}
