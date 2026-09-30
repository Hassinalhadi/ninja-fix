package uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class ImmersiveModeCompatPromptBackground extends FullscreenPromptBackground {
    private final DisplayMetrics mBaseMetrics = new DisplayMetrics();
    private final WindowManager mWindowManager;

    public ImmersiveModeCompatPromptBackground(WindowManager windowManager) {
        this.mWindowManager = windowManager;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds.FullscreenPromptBackground
    public DisplayMetrics getDisplayMetrics() {
        this.mWindowManager.getDefaultDisplay().getRealMetrics(this.mBaseMetrics);
        return this.mBaseMetrics;
    }
}
