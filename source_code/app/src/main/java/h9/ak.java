package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.eW;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ak implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ eW bravo;
    public final /* synthetic */ List charlie;

    public /* synthetic */ ak(eW eWVar, List list, int i4) {
        this.alpha = i4;
        this.bravo = eWVar;
        this.charlie = list;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                eW.W(this.bravo, this.charlie);
                return;
            default:
                eW.sVU(this.bravo, this.charlie);
                return;
        }
    }
}
