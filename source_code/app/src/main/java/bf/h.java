package bf;

import androidx.camera.core.am;
import kotlin.Unit;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class h implements am {
    public final am alpha;
    public final Object bravo = new Object();
    public boolean charlie;

    public h(am amVar) {
        this.alpha = amVar;
    }

    public final void alpha() {
        Unit unit;
        synchronized (this.bravo) {
            try {
                if (this.charlie) {
                    am amVar = this.alpha;
                    if (amVar != null) {
                        amVar.clear();
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        AbstractC3066u3.charlie("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC3066u3.india("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.charlie = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void bravo() {
        synchronized (this.bravo) {
        }
    }

    @Override // androidx.camera.core.am
    public final void clear() {
        alpha();
    }
}
