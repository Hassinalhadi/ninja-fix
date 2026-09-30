package h9;

import com.incognia.internal.Gg;
import com.incognia.internal.YKm;
import com.incognia.internal.cFV;
import com.incognia.internal.eW;
import com.incognia.internal.gx0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ag implements YKm {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Gg bravo;

    public /* synthetic */ ag(Gg gg, int i4) {
        this.alpha = i4;
        this.bravo = gg;
    }

    @Override // com.incognia.internal.YKm
    public final void b(boolean z2) {
        switch (this.alpha) {
            case 0:
                cFV.b((cFV) this.bravo, z2);
                return;
            case 1:
                eW.b((eW) this.bravo, z2);
                return;
            default:
                gx0.b((gx0) this.bravo, z2);
                return;
        }
    }
}
