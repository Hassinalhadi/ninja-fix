package S;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b extends c {
    @Override // S.c
    public final c black(Function1 function1, Function1 function12) {
        return (c) ((g) n.foxtrot(new N2.ae(1, new Cb.l(7, function1, function12))));
    }

    @Override // S.c, S.g
    public final void charlie() {
        synchronized (n.charlie) {
            oscar();
        }
    }

    @Override // S.c, S.g
    public final void kilo() {
        u.charlie();
        throw null;
    }

    @Override // S.c, S.g
    public final void lima() {
        u.charlie();
        throw null;
    }

    @Override // S.c, S.g
    public final void mike() {
        n.alpha();
    }

    @Override // S.c, S.g
    public final g uniform(Function1 function1) {
        return (f) ((g) n.foxtrot(new N2.ae(1, new a(0, function1))));
    }

    @Override // S.c
    public final u whiskey() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
