package z8;

import com.google.firebase.perf.util.Timer;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ f purple;
    public final /* synthetic */ Timer red;

    public /* synthetic */ e(f fVar, Timer timer, int i4) {
        this.alpha = i4;
        this.purple = fVar;
        this.red = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                f fVar = this.purple;
                C8.d charlie = fVar.charlie(this.red);
                if (charlie != null) {
                    fVar.bravo.add(charlie);
                    return;
                }
                return;
            default:
                f fVar2 = this.purple;
                C8.d charlie2 = fVar2.charlie(this.red);
                if (charlie2 != null) {
                    fVar2.bravo.add(charlie2);
                    return;
                }
                return;
        }
    }
}
