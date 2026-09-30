package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC1452k {
    public final /* synthetic */ int echo;
    public final /* synthetic */ H0 foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(H0 h02, G g2, int i4) {
        super(g2);
        this.echo = i4;
        this.foxtrot = h02;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1452k
    public final void bravo() {
        switch (this.echo) {
            case 0:
                H0 h02 = this.foxtrot;
                h02.W();
                if (h02.g0()) {
                    ar arVar = ((G) h02.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("Inactivity, disconnecting from the service");
                    h02.b0();
                    return;
                }
                return;
            default:
                ar arVar2 = ((G) this.foxtrot.alpha).f7507b;
                G.foxtrot(arVar2);
                arVar2.f7632b.alpha("Tasks have been queued for a long time");
                return;
        }
    }
}
