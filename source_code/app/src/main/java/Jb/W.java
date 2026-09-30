package Jb;

import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d3.k purple;

    public /* synthetic */ W(d3.k kVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                d3.k kVar = this.purple;
                kVar.november().echo(kVar);
                C3462a.alpha("LocationFlow", 12, "Location service restart completed", null);
                return;
            case 1:
                d3.k kVar2 = this.purple;
                if (!kVar2.isFinishing() && !kVar2.isDestroyed() && !kVar2.getSupportFragmentManager().jade()) {
                    kVar2.whiskey();
                    return;
                }
                return;
            case 2:
                d3.k kVar3 = this.purple;
                if (!kVar3.isFinishing() && !kVar3.isDestroyed() && !kVar3.getSupportFragmentManager().jade()) {
                    kVar3.victor();
                    return;
                }
                return;
            default:
                d3.k kVar4 = this.purple;
                if (!kVar4.isFinishing() && !kVar4.isDestroyed() && !kVar4.getSupportFragmentManager().jade()) {
                    kVar4.emerald();
                    return;
                }
                return;
        }
    }
}
