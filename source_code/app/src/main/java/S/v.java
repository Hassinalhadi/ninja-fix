package S;

import androidx.compose.runtime.C0585q;

/* loaded from: classes3.dex */
public final class v {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ v(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    public final void alpha() {
        switch (this.alpha) {
            case 0:
                w wVar = (w) this.bravo;
                wVar.juliet--;
                return;
            default:
                C0585q c0585q = (C0585q) this.bravo;
                c0585q.amber--;
                return;
        }
    }

    public final void bravo() {
        switch (this.alpha) {
            case 0:
                ((w) this.bravo).juliet++;
                return;
            default:
                ((C0585q) this.bravo).amber++;
                return;
        }
    }
}
