package s1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public abstract class al {
    public static void alpha(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static a0 bravo(View view, a0 a0Var, Rect rect) {
        WindowInsets golf = a0Var.golf();
        if (golf != null) {
            return a0.hotel(view, view.computeSystemWindowInsets(golf, rect));
        }
        rect.setEmpty();
        return a0Var;
    }

    public static ColorStateList charlie(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode delta(View view) {
        return view.getBackgroundTintMode();
    }

    public static float echo(View view) {
        return view.getElevation();
    }

    public static String foxtrot(View view) {
        return view.getTransitionName();
    }

    public static float golf(View view) {
        return view.getZ();
    }

    public static boolean hotel(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void india(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void juliet(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void kilo(View view, float f5) {
        view.setElevation(f5);
    }

    public static void lima(View view, InterfaceC2587u interfaceC2587u) {
        ak akVar;
        if (interfaceC2587u != null) {
            akVar = new ak(view, interfaceC2587u);
        } else {
            akVar = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, akVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (akVar != null) {
            view.setOnApplyWindowInsetsListener(akVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void mike(View view, String str) {
        view.setTransitionName(str);
    }

    public static void november(View view) {
        view.stopNestedScroll();
    }
}
