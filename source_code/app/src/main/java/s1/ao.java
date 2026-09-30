package s1;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class ao {
    public static int alpha(View view) {
        return view.getImportantForAutofill();
    }

    public static void bravo(View view, int i4) {
        view.setImportantForAutofill(i4);
    }
}
