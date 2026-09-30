package i;

import Nf.C;
import androidx.compose.foundation.lazy.layout.as;
import kotlin.jvm.functions.Function1;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1860i extends androidx.compose.foundation.lazy.layout.j implements InterfaceC1869r {
    public final as bravo = new as();
    public bv.z charlie;

    public C1860i(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.j
    public final as kilo() {
        return this.bravo;
    }

    public final void papa(Object obj, Xd.m mVar) {
        C c3;
        if (obj != null) {
            c3 = new C(1, obj);
        } else {
            c3 = null;
        }
        this.bravo.alpha(1, new C1858g(c3, new hd.l(7), new P.d(new Cb.n(2, mVar), -857469575, true)));
    }

    public final void quebec(int i4, Function1 function1, Function1 function12, P.d dVar) {
        this.bravo.alpha(i4, new C1858g(function1, function12, dVar));
    }
}
