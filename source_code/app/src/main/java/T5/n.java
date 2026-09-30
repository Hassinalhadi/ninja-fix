package T5;

import com.google.android.gms.common.api.Status;
import s6.AbstractC2833z7;

/* loaded from: classes2.dex */
public final class n extends f {
    public final /* synthetic */ int hotel = 1;
    public final Object india;

    public n(G6.h hVar) {
        this.india = hVar;
    }

    @Override // T5.g
    public final void kilo(Status status) {
        switch (this.hotel) {
            case 0:
                G6.p pVar = (G6.p) this.india;
                pVar.getClass();
                AbstractC2833z7.charlie(status, null, pVar.alpha);
                return;
            default:
                AbstractC2833z7.charlie(status, null, (G6.h) this.india);
                return;
        }
    }

    public n(G6.p pVar) {
        this.india = pVar;
    }
}
