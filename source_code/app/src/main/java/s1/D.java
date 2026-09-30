package s1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import delivery.samurai.android.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class D extends H {
    public static final PathInterpolator echo = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final P1.a foxtrot = new P1.a(0);
    public static final DecelerateInterpolator golf = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator hotel = new AccelerateInterpolator(1.5f);

    public static void foxtrot(View view, I i4) {
        Pf.g kilo = kilo(view);
        if (kilo != null) {
            kilo.delta(i4);
            if (kilo.alpha == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                foxtrot(viewGroup.getChildAt(i5), i4);
            }
        }
    }

    public static void golf(View view, I i4, a0 a0Var, boolean z2) {
        Pf.g kilo = kilo(view);
        if (kilo != null) {
            kilo.purple = a0Var;
            if (!z2) {
                kilo.echo();
                if (kilo.alpha == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                golf(viewGroup.getChildAt(i5), i4, a0Var, z2);
            }
        }
    }

    public static void hotel(View view, a0 a0Var, List list) {
        Pf.g kilo = kilo(view);
        if (kilo != null) {
            a0Var = kilo.foxtrot(a0Var, list);
            if (kilo.alpha == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                hotel(viewGroup.getChildAt(i4), a0Var, list);
            }
        }
    }

    public static void india(View view, I i4, com.google.android.play.core.integrity.k kVar) {
        Pf.g kilo = kilo(view);
        if (kilo != null) {
            kilo.golf(i4, kVar);
            if (kilo.alpha == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                india(viewGroup.getChildAt(i5), i4, kVar);
            }
        }
    }

    public static WindowInsets juliet(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static Pf.g kilo(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof C) {
            return ((C) tag).alpha;
        }
        return null;
    }
}
