package androidx.compose.runtime.tooling;

import I.ak;
import Xd.l;
import androidx.compose.runtime.C0585q;
import java.util.List;
import s6.AbstractC2832z6;

/* loaded from: classes3.dex */
public final class c implements ak, Nd.f {
    public static final W8.a purple = new W8.a(14);
    public final C0585q alpha;

    public c(C0585q c0585q) {
        this.alpha = c0585q;
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

    @Override // I.ak
    public final List teal(Integer num) {
        return this.alpha.emerald();
    }
}
