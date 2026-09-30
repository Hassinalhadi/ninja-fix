package b0;

import s6.J4;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ q purple;

    public /* synthetic */ m(q qVar, int i4) {
        this.alpha = i4;
        this.purple = qVar;
    }

    @Override // b0.i
    public final double delta(double d4) {
        switch (this.alpha) {
            case 0:
                return J4.bravo(this.purple.kilo.delta(d4), r10.echo, r10.foxtrot);
            default:
                return this.purple.november.delta(J4.bravo(d4, r0.echo, r0.foxtrot));
        }
    }
}
