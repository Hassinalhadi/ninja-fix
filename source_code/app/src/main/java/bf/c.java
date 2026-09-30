package bf;

import androidx.camera.core.ap;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.V;

/* loaded from: classes3.dex */
public final class c implements ap {
    public final InterfaceC0519q alpha;

    public c(InterfaceC0519q interfaceC0519q) {
        this.alpha = interfaceC0519q;
    }

    @Override // androidx.camera.core.ap
    public final V alpha() {
        return this.alpha.alpha();
    }

    @Override // androidx.camera.core.ap
    public final int bravo() {
        return 0;
    }

    @Override // androidx.camera.core.ap
    public final long getTimestamp() {
        return this.alpha.getTimestamp();
    }
}
