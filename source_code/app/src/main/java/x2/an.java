package x2;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class an {
    public static float alpha(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void bravo(View view, float f5) {
        view.setTransitionAlpha(f5);
    }
}
