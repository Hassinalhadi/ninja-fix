package s1;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class E {
    public static /* synthetic */ WindowInsetsAnimation.Bounds foxtrot(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation golf(int i4, Interpolator interpolator, long j5) {
        return new WindowInsetsAnimation(i4, interpolator, j5);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation hotel(Object obj) {
        return (WindowInsetsAnimation) obj;
    }
}
