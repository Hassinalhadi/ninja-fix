package h9;

import com.incognia.internal.IZZ;
import com.incognia.internal.XO;
import com.incognia.internal.d7p;

/* renamed from: h9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1831i implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ XO bravo;

    public /* synthetic */ C1831i(XO xo, int i4) {
        this.alpha = i4;
        this.bravo = xo;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                IZZ.W(this.bravo);
                return;
            default:
                IZZ.sVU(this.bravo);
                return;
        }
    }
}
