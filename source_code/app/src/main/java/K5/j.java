package K5;

import E5.t;
import android.content.Context;
import java.util.concurrent.Executor;
import r6.u;

/* loaded from: classes3.dex */
public final class j implements G5.b {
    public final F5.e alpha;
    public final Kd.a bravo;
    public final Kd.a charlie;
    public final t delta;
    public final Kd.a echo;
    public final Kd.a foxtrot;
    public final Kd.a golf;

    public j(F5.e eVar, Kd.a aVar, Kd.a aVar2, t tVar, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5) {
        this.alpha = eVar;
        this.bravo = aVar;
        this.charlie = aVar2;
        this.delta = tVar;
        this.echo = aVar3;
        this.foxtrot = aVar4;
        this.golf = aVar5;
    }

    @Override // Kd.a
    public final Object get() {
        return new i((Context) this.alpha.bravo, (F5.f) this.bravo.get(), (L5.d) this.charlie.get(), (d) this.delta.get(), (Executor) this.echo.get(), (M5.b) this.foxtrot.get(), new u(6), new g8.d(6), (L5.c) this.golf.get());
    }
}
