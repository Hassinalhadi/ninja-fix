package af;

import androidx.compose.runtime.ax;
import kotlin.Unit;

/* renamed from: af.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0437h extends ah.b {
    public final C0430a alpha;

    public C0437h(C0430a c0430a, ax axVar) {
        this.alpha = c0430a;
    }

    @Override // ah.b
    public final void alpha(Object obj) {
        Unit unit;
        ah.g gVar = this.alpha.alpha;
        if (gVar != null) {
            gVar.alpha(obj);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
        } else {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // ah.b
    public final void bravo() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
