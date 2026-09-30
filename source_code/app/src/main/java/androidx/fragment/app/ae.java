package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ae extends ag {
    public final /* synthetic */ ar.a alpha;
    public final /* synthetic */ AtomicReference bravo;
    public final /* synthetic */ ai.b charlie;
    public final /* synthetic */ ah.a delta;
    public final /* synthetic */ ai echo;

    public ae(ai aiVar, ar.a aVar, AtomicReference atomicReference, ai.b bVar, ah.a aVar2) {
        this.echo = aiVar;
        this.alpha = aVar;
        this.bravo = atomicReference;
        this.charlie = bVar;
        this.delta = aVar2;
    }

    @Override // androidx.fragment.app.ag
    public final void alpha() {
        ai aiVar = this.echo;
        this.bravo.set(((ah.h) this.alpha.mo11apply(null)).delta(aiVar.generateActivityResultKey(), aiVar, this.charlie, this.delta));
    }
}
