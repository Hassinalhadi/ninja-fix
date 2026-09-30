package s1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes3.dex */
public abstract class aj {
    public static WindowInsets alpha(View view, WindowInsets windowInsets) {
        int i4 = aw.alpha;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets bravo(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void charlie(View view) {
        view.requestApplyInsets();
    }
}
