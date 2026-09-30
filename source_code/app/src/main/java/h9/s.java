package h9;

import com.incognia.internal.P48;
import com.incognia.internal.d7p;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P48 bravo;

    public /* synthetic */ s(P48 p48, int i4) {
        this.alpha = i4;
        this.bravo = p48;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                P48.b(this.bravo);
                return;
            default:
                P48.W(this.bravo);
                return;
        }
    }
}
