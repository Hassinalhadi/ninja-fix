package t0;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ak {
    public static final ak alpha = new Object();

    public final void alpha(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    public final void bravo(@NotNull View view) {
        ai aiVar = ai.alpha;
        ai aiVar2 = ai.alpha;
        view.setViewTranslationCallback(ai.alpha);
    }
}
