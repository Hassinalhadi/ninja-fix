package h9;

import com.incognia.IncogniaOptions;
import com.incognia.internal.G5G;
import com.incognia.internal.RjL;
import com.incognia.internal.d7p;

/* renamed from: h9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1830h implements d7p {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ C1830h(int i4, G5G g5g) {
        this.bravo = i4;
        this.charlie = g5g;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                G5G.b(this.bravo, (G5G) this.charlie);
                return;
            default:
                RjL.b((IncogniaOptions) this.charlie, this.bravo);
                return;
        }
    }

    public /* synthetic */ C1830h(IncogniaOptions incogniaOptions, int i4) {
        this.charlie = incogniaOptions;
        this.bravo = i4;
    }
}
