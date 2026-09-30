package F5;

import L5.j;
import android.content.Context;
import r6.u;

/* loaded from: classes3.dex */
public final class g implements G5.b {
    public final /* synthetic */ int alpha;
    public final G5.b bravo;
    public final Kd.a charlie;

    public /* synthetic */ g(G5.b bVar, Kd.a aVar, int i4) {
        this.alpha = i4;
        this.bravo = bVar;
        this.charlie = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new f((Context) ((e) this.bravo).bravo, (d) ((e) this.charlie).get());
            default:
                return new L5.h(new u(6), new g8.d(6), L5.a.foxtrot, (j) ((e) this.bravo).get(), this.charlie);
        }
    }
}
