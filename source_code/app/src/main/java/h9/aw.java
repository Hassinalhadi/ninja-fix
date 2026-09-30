package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.pl2;

/* loaded from: classes2.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d7p purple;
    public final /* synthetic */ pl2 red;

    public /* synthetic */ aw(d7p d7pVar, pl2 pl2Var, int i4) {
        this.alpha = i4;
        this.purple = d7pVar;
        this.red = pl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                pl2.W(this.purple, this.red);
                return;
            default:
                pl2.b(this.purple, this.red);
                return;
        }
    }
}
