package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.eW;

/* loaded from: classes2.dex */
public final /* synthetic */ class ai implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ eW bravo;

    public /* synthetic */ ai(eW eWVar, int i4) {
        this.alpha = i4;
        this.bravo = eWVar;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                eW.f9(this.bravo);
                return;
            case 1:
                eW.b(this.bravo);
                return;
            case 2:
                eW.W(this.bravo);
                return;
            default:
                eW.sVU(this.bravo);
                return;
        }
    }
}
