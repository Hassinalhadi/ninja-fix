package av;

import Jb.C0211t;
import androidx.camera.core.C0496c;

/* loaded from: classes3.dex */
public final class t extends androidx.lifecycle.ay {
    public androidx.lifecycle.az bravo;
    public final C0496c charlie;

    public t(C0496c c0496c) {
        this.charlie = c0496c;
    }

    @Override // androidx.lifecycle.ay
    public final void bravo(androidx.lifecycle.au auVar, androidx.lifecycle.A a6) {
        throw null;
    }

    public final void charlie(androidx.lifecycle.az azVar) {
        androidx.lifecycle.ax axVar;
        androidx.lifecycle.az azVar2 = this.bravo;
        if (azVar2 != null && (axVar = (androidx.lifecycle.ax) this.alpha.delta(azVar2)) != null) {
            axVar.alpha.removeObserver(axVar);
        }
        this.bravo = azVar;
        super.bravo(azVar, new C0211t(3, this));
    }

    @Override // androidx.lifecycle.au
    public final Object getValue() {
        androidx.lifecycle.az azVar = this.bravo;
        if (azVar == null) {
            return this.charlie;
        }
        return azVar.getValue();
    }
}
