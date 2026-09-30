package androidx.fragment.app;

import androidx.appcompat.widget.P0;
import ge.InterfaceC1772d;

/* loaded from: classes3.dex */
public final class N implements androidx.lifecycle.a0 {
    @Override // androidx.lifecycle.a0
    public final /* synthetic */ androidx.lifecycle.Y create(InterfaceC1772d interfaceC1772d, T1.c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
    }

    @Override // androidx.lifecycle.a0
    public final /* synthetic */ androidx.lifecycle.Y create(Class cls, T1.c cVar) {
        return P0.charlie(this, cls, cVar);
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.Y create(Class cls) {
        return new FragmentManagerViewModel(true);
    }
}
