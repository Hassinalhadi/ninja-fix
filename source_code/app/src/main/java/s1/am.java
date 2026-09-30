package s1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes3.dex */
public abstract class am {
    public static a0 alpha(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        a0 hotel = a0.hotel(null, rootWindowInsets);
        X x4 = hotel.alpha;
        x4.tango(hotel);
        x4.delta(view.getRootView());
        return hotel;
    }

    public static void bravo(View view, int i4, int i5) {
        view.setScrollIndicators(i4, i5);
    }
}
