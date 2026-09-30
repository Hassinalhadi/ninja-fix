package s1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes3.dex */
public abstract class ar {
    public static WindowInsets alpha(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence bravo(View view) {
        return view.getStateDescription();
    }
}
