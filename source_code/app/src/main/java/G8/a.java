package G8;

import I8.d;
import L7.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ b purple;
    public final /* synthetic */ d red;

    public /* synthetic */ a(b bVar, d dVar, int i4) {
        this.alpha = i4;
        this.purple = bVar;
        this.red = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha(this.red);
                return;
            default:
                this.purple.alpha(this.red);
                return;
        }
    }
}
