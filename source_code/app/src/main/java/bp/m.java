package bp;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.core.am;
import t6.AbstractC3066u3;
import t6.j4;

/* loaded from: classes3.dex */
public final class m extends View {
    public Window alpha;
    public l purple;

    private float getBrightness() {
        Window window = this.alpha;
        if (window == null) {
            AbstractC3066u3.charlie("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f5) {
        if (this.alpha == null) {
            AbstractC3066u3.charlie("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f5)) {
            AbstractC3066u3.charlie("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.alpha.getAttributes();
        attributes.screenBrightness = f5;
        this.alpha.setAttributes(attributes);
        AbstractC3066u3.bravo("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(am amVar) {
        AbstractC3066u3.bravo("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public am getScreenFlash() {
        return this.purple;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(a aVar) {
        j4.alpha();
    }

    public void setScreenFlashWindow(Window window) {
        l lVar;
        j4.alpha();
        if (this.alpha != window) {
            if (window == null) {
                lVar = null;
            } else {
                lVar = new l(this);
            }
            this.purple = lVar;
        }
        this.alpha = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
