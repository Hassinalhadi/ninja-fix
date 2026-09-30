package h9;

import com.incognia.internal.XuT;
import com.incognia.internal.d7p;
import com.incognia.internal.y6C;

/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ XuT bravo;
    public final /* synthetic */ Class charlie;
    public final /* synthetic */ y6C delta;

    public /* synthetic */ ac(XuT xuT, Class cls, y6C y6c, int i4) {
        this.alpha = i4;
        this.bravo = xuT;
        this.charlie = cls;
        this.delta = y6c;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                XuT.b(this.bravo, this.charlie, this.delta);
                return;
            default:
                XuT.W(this.bravo, this.charlie, this.delta);
                return;
        }
    }
}
