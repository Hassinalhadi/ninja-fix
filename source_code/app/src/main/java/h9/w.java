package h9;

import com.incognia.internal.Gg;
import com.incognia.internal.T;
import com.incognia.internal.XO;
import com.incognia.internal.qv;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements XO {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Gg bravo;

    public /* synthetic */ w(Gg gg, int i4) {
        this.alpha = i4;
        this.bravo = gg;
    }

    @Override // com.incognia.internal.XO
    public final void b() {
        switch (this.alpha) {
            case 0:
                T.b((T) this.bravo);
                return;
            default:
                qv.b((qv) this.bravo);
                return;
        }
    }
}
