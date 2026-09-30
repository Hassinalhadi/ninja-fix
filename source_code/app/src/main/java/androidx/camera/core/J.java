package androidx.camera.core;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class J extends androidx.camera.core.impl.ah {
    public final /* synthetic */ int oscar = 1;
    public final Object papa;

    public J(Surface surface, Size size, int i4) {
        super(size, i4);
        this.papa = surface;
    }

    @Override // androidx.camera.core.impl.ah
    public final com.google.common.util.concurrent.e foxtrot() {
        switch (this.oscar) {
            case 0:
                return ((M) this.papa).foxtrot;
            default:
                return be.h.charlie((Surface) this.papa);
        }
    }

    public J(Surface surface) {
        super(androidx.camera.core.impl.ah.kilo, 0);
        this.papa = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m4, Size size) {
        super(size, 34);
        this.papa = m4;
    }
}
