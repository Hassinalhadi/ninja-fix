package bp;

import android.animation.ValueAnimator;
import androidx.camera.core.am;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class l implements am {
    public ValueAnimator alpha;
    public final /* synthetic */ m bravo;

    public l(m mVar) {
        this.bravo = mVar;
    }

    @Override // androidx.camera.core.am
    public final void clear() {
        AbstractC3066u3.bravo("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.alpha;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.alpha = null;
        }
        m mVar = this.bravo;
        mVar.setAlpha(0.0f);
        mVar.setBrightness(0.0f);
    }
}
