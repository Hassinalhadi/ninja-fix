package J5;

import E5.s;
import F5.f;
import K5.d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class a implements c {
    public static final Logger foxtrot = Logger.getLogger(s.class.getName());
    public final d alpha;
    public final Executor bravo;
    public final f charlie;
    public final L5.d delta;
    public final M5.b echo;

    public a(Executor executor, f fVar, d dVar, L5.d dVar2, M5.b bVar) {
        this.bravo = executor;
        this.charlie = fVar;
        this.alpha = dVar;
        this.delta = dVar2;
        this.echo = bVar;
    }
}
