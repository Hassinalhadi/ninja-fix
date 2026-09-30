package w;

import D0.am;
import android.os.CancellationSignal;
import n.ax;
import vf.Y;
import y.C3344D;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ m(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.alpha) {
            case 0:
                C3344D c3344d = (C3344D) this.bravo;
                if (c3344d != null) {
                    ax axVar = c3344d.delta;
                    if (axVar != null) {
                        axVar.echo(am.bravo);
                    }
                    ax axVar2 = c3344d.delta;
                    if (axVar2 != null) {
                        axVar2.foxtrot(am.bravo);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((Y) this.bravo).foxtrot(null);
                return;
        }
    }
}
