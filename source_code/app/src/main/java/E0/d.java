package E0;

import android.graphics.BlendMode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ BlendMode amber() {
        return BlendMode.DIFFERENCE;
    }

    public static /* bridge */ /* synthetic */ BlendMode azure() {
        return BlendMode.EXCLUSION;
    }

    public static /* bridge */ /* synthetic */ BlendMode beige() {
        return BlendMode.MULTIPLY;
    }

    public static /* bridge */ /* synthetic */ BlendMode black() {
        return BlendMode.HUE;
    }

    public static /* bridge */ /* synthetic */ BlendMode delta() {
        return BlendMode.CLEAR;
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable echo(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ boolean uniform(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ BlendMode whiskey() {
        return BlendMode.COLOR_BURN;
    }

    public static /* bridge */ /* synthetic */ BlendMode xray() {
        return BlendMode.SRC;
    }

    public static /* bridge */ /* synthetic */ BlendMode yankee() {
        return BlendMode.HARD_LIGHT;
    }

    public static /* bridge */ /* synthetic */ BlendMode zulu() {
        return BlendMode.SOFT_LIGHT;
    }
}
