package R3;

import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ar;

/* loaded from: classes3.dex */
public final class p implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ p(Object obj, boolean z2, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.purple = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r3 != r4) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z2;
        switch (this.alpha) {
            case 0:
                F2.d dVar = (F2.d) this.red;
                dVar.getClass();
                Y3.l.alpha();
                C3.d dVar2 = (C3.d) dVar.bravo;
                boolean z10 = dVar2.alpha;
                boolean z11 = this.purple;
                dVar2.alpha = z11;
                if (z10 != z11) {
                    ((n) dVar2.red).alpha(z11);
                    return;
                }
                return;
            case 1:
                ((r) this.red).purple.alpha(this.purple);
                return;
            default:
                C1459n0 c1459n0 = (C1459n0) this.red;
                G g2 = (G) c1459n0.alpha;
                boolean alpha = g2.alpha();
                boolean z12 = false;
                if (g2.f7525u != null && g2.f7525u.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z13 = this.purple;
                g2.f7525u = Boolean.valueOf(z13);
                if (z2 == z13) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.bravo(Boolean.valueOf(z13), "Default data collection state already set to");
                }
                if (g2.alpha() != alpha) {
                    boolean alpha2 = g2.alpha();
                    if (g2.f7525u != null && g2.f7525u.booleanValue()) {
                        z12 = true;
                        break;
                    }
                }
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.f7634d.charlie(Boolean.valueOf(z13), Boolean.valueOf(alpha), "Default data collection is different than actual status");
                c1459n0.t0();
                return;
        }
    }
}
