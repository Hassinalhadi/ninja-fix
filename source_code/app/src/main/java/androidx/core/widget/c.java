package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes3.dex */
public abstract class c {
    public static EdgeEffect alpha(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float bravo(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float charlie(EdgeEffect edgeEffect, float f5, float f10) {
        try {
            return edgeEffect.onPullDistance(f5, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f5, f10);
            return 0.0f;
        }
    }
}
