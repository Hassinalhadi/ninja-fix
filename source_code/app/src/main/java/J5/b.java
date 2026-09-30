package J5;

import E5.t;
import F5.f;
import K5.d;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b implements G5.b {
    public final Kd.a alpha;
    public final Kd.a bravo;
    public final t charlie;
    public final Kd.a delta;
    public final Kd.a echo;

    public b(Kd.a aVar, Kd.a aVar2, t tVar, Kd.a aVar3, Kd.a aVar4) {
        this.alpha = aVar;
        this.bravo = aVar2;
        this.charlie = tVar;
        this.delta = aVar3;
        this.echo = aVar4;
    }

    @Override // Kd.a
    public final Object get() {
        return new a((Executor) this.alpha.get(), (f) this.bravo.get(), (d) this.charlie.get(), (L5.d) this.delta.get(), (M5.b) this.echo.get());
    }
}
