package h9;

import com.incognia.internal.Gg;
import com.incognia.internal.L8H;
import com.incognia.internal.PIe;
import com.incognia.internal.cFV;
import com.incognia.internal.d7p;
import com.incognia.internal.wKp;
import java.io.Serializable;

/* renamed from: h9.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1833k implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean bravo;
    public final /* synthetic */ Gg charlie;
    public final /* synthetic */ Object delta;

    public /* synthetic */ C1833k(Gg gg, Serializable serializable, boolean z2, int i4) {
        this.alpha = i4;
        this.charlie = gg;
        this.delta = serializable;
        this.bravo = z2;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                L8H.b((L8H) this.charlie, (Throwable) this.delta, this.bravo);
                return;
            case 1:
                L8H.b(this.bravo, (PIe) this.delta, (L8H) this.charlie);
                return;
            default:
                wKp.b((cFV) this.charlie, (String) this.delta, this.bravo);
                return;
        }
    }

    public /* synthetic */ C1833k(boolean z2, PIe pIe, L8H l8h) {
        this.alpha = 1;
        this.bravo = z2;
        this.delta = pIe;
        this.charlie = l8h;
    }
}
