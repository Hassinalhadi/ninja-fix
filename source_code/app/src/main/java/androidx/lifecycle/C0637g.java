package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0637g implements aj {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ C0637g(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        switch (this.alpha) {
            case 0:
                new HashMap();
                InterfaceC0650u[] interfaceC0650uArr = (InterfaceC0650u[]) this.purple;
                if (interfaceC0650uArr.length <= 0) {
                    if (interfaceC0650uArr.length <= 0) {
                        return;
                    }
                    InterfaceC0650u interfaceC0650u = interfaceC0650uArr[0];
                    throw null;
                }
                InterfaceC0650u interfaceC0650u2 = interfaceC0650uArr[0];
                throw null;
            default:
                if (aaVar == aa.ON_CREATE) {
                    alVar.getLifecycle().charlie(this);
                    ((U) this.purple).bravo();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aaVar).toString());
                }
        }
    }
}
