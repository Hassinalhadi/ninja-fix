package h9;

import com.incognia.internal.eW;
import com.incognia.internal.pYm;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class aj implements pYm {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ eW bravo;

    public /* synthetic */ aj(eW eWVar, int i4) {
        this.alpha = i4;
        this.bravo = eWVar;
    }

    @Override // com.incognia.internal.pYm
    public final void b(List list) {
        switch (this.alpha) {
            case 0:
                eW.f9(this.bravo, list);
                return;
            default:
                eW.b(this.bravo, list);
                return;
        }
    }
}
