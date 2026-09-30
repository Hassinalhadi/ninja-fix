package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineExceptionHandler;
import s6.AbstractC2832z6;
import td.C3117a;
import vf.C3221z;

/* loaded from: classes3.dex */
public final class aq implements InterfaceC0563a0, CoroutineExceptionHandler {
    public final Nd.h alpha;
    public final Xd.l purple;
    public final C3117a red;
    public vf.Y silver;

    public aq(Nd.h hVar, Xd.l lVar) {
        Nd.h hVar2;
        this.alpha = hVar;
        this.purple = lVar;
        if (hVar.get(androidx.compose.runtime.tooling.c.purple) != null) {
            hVar2 = this;
        } else {
            hVar2 = Nd.i.alpha;
        }
        this.red = vf.ad.charlie(hVar.plus(hVar2));
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        vf.Y y10 = this.silver;
        if (y10 != null) {
            y10.whiskey(new LeftCompositionCancellationException());
        }
        this.silver = null;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        vf.Y y10 = this.silver;
        if (y10 != null) {
            y10.whiskey(new LeftCompositionCancellationException());
        }
        this.silver = null;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        vf.Y y10 = this.silver;
        if (y10 != null) {
            y10.foxtrot(vf.ad.alpha("Old job was still running!", null));
        }
        this.silver = vf.ad.zulu(this.red, null, null, this.purple, 3);
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
        return C3221z.alpha;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(Nd.h hVar, Throwable th) {
        androidx.compose.runtime.tooling.c cVar = (androidx.compose.runtime.tooling.c) hVar.get(androidx.compose.runtime.tooling.c.purple);
        if (cVar != null) {
            androidx.compose.runtime.tooling.b.alpha(th, new Yb.F(7, cVar, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.alpha.get(C3221z.alpha);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(hVar, th);
            return;
        }
        throw th;
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
