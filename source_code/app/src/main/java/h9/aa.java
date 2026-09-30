package h9;

import com.incognia.internal.WnY;
import com.incognia.internal.d7p;

/* loaded from: classes2.dex */
public final /* synthetic */ class aa implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ WnY bravo;

    public /* synthetic */ aa(WnY wnY, int i4) {
        this.alpha = i4;
        this.bravo = wnY;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                WnY.f9(this.bravo);
                return;
            default:
                WnY.b(this.bravo);
                return;
        }
    }
}
