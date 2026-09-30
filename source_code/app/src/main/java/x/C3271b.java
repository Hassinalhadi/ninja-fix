package x;

import D0.ae;
import D0.an;
import Q0.n;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3271b {
    public static C3271b hotel;
    public final n alpha;
    public final an bravo;
    public final Q0.e charlie;
    public final H0.j delta;
    public final an echo;
    public float foxtrot = Float.NaN;
    public float golf = Float.NaN;

    public C3271b(n nVar, an anVar, Q0.e eVar, H0.j jVar) {
        this.alpha = nVar;
        this.bravo = anVar;
        this.charlie = eVar;
        this.delta = jVar;
        this.echo = ae.hotel(anVar, nVar);
    }

    public final long alpha(int i4, long j5) {
        float f5 = this.golf;
        float f10 = this.foxtrot;
        int i5 = 0;
        if (Float.isNaN(f5) || Float.isNaN(f10)) {
            String str = AbstractC3272c.alpha;
            long bravo = Q0.b.bravo(0, 0, 15);
            Q0.e eVar = this.charlie;
            float bravo2 = ae.alpha(str, this.echo, bravo, eVar, this.delta, null, 1, 96).bravo();
            float bravo3 = ae.alpha(AbstractC3272c.bravo, this.echo, Q0.b.bravo(0, 0, 15), eVar, this.delta, null, 2, 96).bravo() - bravo2;
            this.golf = bravo2;
            this.foxtrot = bravo3;
            f10 = bravo3;
            f5 = bravo2;
        }
        if (i4 != 1) {
            int round = Math.round((f10 * (i4 - 1)) + f5);
            if (round >= 0) {
                i5 = round;
            }
            int golf = Q0.a.golf(j5);
            if (i5 > golf) {
                i5 = golf;
            }
        } else {
            i5 = Q0.a.india(j5);
        }
        return Q0.b.alpha(Q0.a.juliet(j5), Q0.a.hotel(j5), i5, Q0.a.golf(j5));
    }
}
