package E5;

import android.content.Context;
import r6.u;

/* loaded from: classes3.dex */
public final class t implements G5.b {
    public final /* synthetic */ int alpha;
    public final G5.b bravo;
    public final Kd.a charlie;
    public final G5.b delta;

    public /* synthetic */ t(G5.b bVar, Kd.a aVar, G5.b bVar2, int i4) {
        this.alpha = i4;
        this.bravo = bVar;
        this.charlie = aVar;
        this.delta = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new s(new u(6), new g8.d(6), (J5.c) ((J5.b) this.bravo).get(), (K5.i) ((K5.j) this.charlie).get(), (K5.k) ((K5.l) this.delta).get());
            default:
                return new K5.d((Context) ((F5.e) this.bravo).bravo, (L5.d) this.charlie.get(), (K5.b) ((n) this.delta).get());
        }
    }
}
