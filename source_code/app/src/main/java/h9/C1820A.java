package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.tNn;
import com.incognia.internal.w5J;

/* renamed from: h9.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1820A implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ tNn bravo;
    public final /* synthetic */ String charlie;

    public /* synthetic */ C1820A(tNn tnn, String str, int i4) {
        this.alpha = i4;
        this.bravo = tnn;
        this.charlie = str;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                w5J.W(this.bravo, this.charlie);
                return;
            default:
                w5J.b(this.bravo, this.charlie);
                return;
        }
    }
}
