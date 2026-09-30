package K5;

import E5.t;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l implements G5.b {
    public final Kd.a alpha;
    public final Kd.a bravo;
    public final t charlie;
    public final Kd.a delta;

    public l(Kd.a aVar, Kd.a aVar2, t tVar, Kd.a aVar3) {
        this.alpha = aVar;
        this.bravo = aVar2;
        this.charlie = tVar;
        this.delta = aVar3;
    }

    @Override // Kd.a
    public final Object get() {
        return new k((Executor) this.alpha.get(), (L5.d) this.bravo.get(), (d) this.charlie.get(), (M5.b) this.delta.get());
    }
}
