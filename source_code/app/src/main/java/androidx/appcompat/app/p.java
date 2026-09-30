package androidx.appcompat.app;

import android.view.ViewGroup;
import s1.au;
import s1.az;

/* loaded from: classes3.dex */
public final class p implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ab purple;

    public /* synthetic */ p(ab abVar, int i4) {
        this.alpha = i4;
        this.purple = abVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        ViewGroup viewGroup;
        switch (this.alpha) {
            case 0:
                ab abVar = this.purple;
                if ((abVar.f2719S & 1) != 0) {
                    abVar.victor(0);
                }
                if ((abVar.f2719S & 4096) != 0) {
                    abVar.victor(108);
                }
                abVar.f2718R = false;
                abVar.f2719S = 0;
                return;
            default:
                ab abVar2 = this.purple;
                abVar2.f2739p.showAtLocation(abVar2.f2738o, 55, 0, 0);
                az azVar = abVar2.f2741r;
                if (azVar != null) {
                    azVar.bravo();
                }
                if (abVar2.f2742s && (viewGroup = abVar2.f2743t) != null && viewGroup.isLaidOut()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    abVar2.f2738o.setAlpha(0.0f);
                    az alpha = au.alpha(abVar2.f2738o);
                    alpha.alpha(1.0f);
                    abVar2.f2741r = alpha;
                    alpha.delta(new s(0, this));
                    return;
                }
                abVar2.f2738o.setAlpha(1.0f);
                abVar2.f2738o.setVisibility(0);
                return;
        }
    }
}
