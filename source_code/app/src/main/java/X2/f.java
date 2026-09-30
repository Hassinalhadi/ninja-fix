package X2;

import androidx.lifecycle.InterfaceC0640j;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ak;

/* loaded from: classes3.dex */
public final class f extends ac {
    public static final f bravo = new ac();
    public static final e charlie = new Object();

    @Override // androidx.lifecycle.ac
    public final void alpha(ak akVar) {
        if (akVar instanceof InterfaceC0640j) {
            InterfaceC0640j interfaceC0640j = (InterfaceC0640j) akVar;
            e eVar = charlie;
            interfaceC0640j.onCreate(eVar);
            interfaceC0640j.onStart(eVar);
            interfaceC0640j.onResume(eVar);
            return;
        }
        throw new IllegalArgumentException((akVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.ac
    public final ab bravo() {
        return ab.teal;
    }

    @Override // androidx.lifecycle.ac
    public final void charlie(ak akVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
