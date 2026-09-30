package h9;

import com.incognia.internal.T;
import com.incognia.internal.d7p;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T bravo;

    public /* synthetic */ v(T t5, int i4) {
        this.alpha = i4;
        this.bravo = t5;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                T.f9(this.bravo);
                return;
            default:
                T.W(this.bravo);
                return;
        }
    }
}
