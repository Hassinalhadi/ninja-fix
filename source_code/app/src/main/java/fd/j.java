package fd;

import Xd.l;
import com.google.android.gms.measurement.internal.C1467s;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2832z6;

/* loaded from: classes2.dex */
public final class j implements Nd.f {
    public static final C1467s purple = new C1467s(9);
    public final Nd.h alpha;

    public j(Nd.h callContext) {
        Intrinsics.echo(callContext, "callContext");
        this.alpha = callContext;
    }

    @Override // Nd.h
    public final Object fold(Object obj, l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        return AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        return purple;
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
