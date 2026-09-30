package h9;

import com.incognia.internal.BGx;
import com.incognia.internal.cFV;
import com.incognia.internal.d7p;
import com.incognia.internal.kVL;
import com.incognia.internal.wKp;

/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ cFV bravo;
    public final /* synthetic */ BGx charlie;

    public /* synthetic */ ar(cFV cfv, BGx bGx, int i4) {
        this.alpha = i4;
        this.bravo = cfv;
        this.charlie = bGx;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                kVL.b(this.bravo, this.charlie);
                return;
            default:
                wKp.b(this.bravo, this.charlie);
                return;
        }
    }
}
