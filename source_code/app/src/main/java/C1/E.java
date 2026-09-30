package C1;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2832z6;

/* loaded from: classes3.dex */
public final class E implements Nd.f {
    public final E alpha;
    public final ap purple;

    public E(E e, ap instance) {
        Intrinsics.echo(instance, "instance");
        this.alpha = e;
        this.purple = instance;
    }

    public final void alpha(ap apVar) {
        if (this.purple != apVar) {
            E e = this.alpha;
            if (e != null) {
                e.alpha(apVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // Nd.h
    public final Object fold(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        return AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        return D.alpha;
    }

    @Override // Nd.h
    public final Nd.h minusKey(Nd.g gVar) {
        return AbstractC2832z6.bravo(this, gVar);
    }

    @Override // Nd.h
    public final Nd.h plus(Nd.h hVar) {
        return AbstractC2832z6.charlie(this, hVar);
    }
}
