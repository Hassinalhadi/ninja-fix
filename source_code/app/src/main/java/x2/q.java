package x2;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.clevertap.android.sdk.Constants;
import s6.AbstractC2710m0;
import s6.C5;

/* loaded from: classes3.dex */
public final class q implements r {
    public final /* synthetic */ int alpha;

    public static float charlie(int i4, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean delta(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int echo(Context context, int i4, int i5) {
        TypedValue bravo = AbstractC2710m0.bravo(i4, context);
        if (bravo != null && bravo.type == 16) {
            return bravo.data;
        }
        return i5;
    }

    public static TimeInterpolator foxtrot(Context context, int i4, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!delta(valueOf, "cubic-bezier") && !delta(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (delta(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(Constants.SEPARATOR_COMMA);
                if (split.length == 4) {
                    return new PathInterpolator(charlie(0, split), charlie(1, split), charlie(2, split), charlie(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (delta(valueOf, "path")) {
                return new PathInterpolator(C5.delta(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    @Override // x2.r
    public final float alpha(ViewGroup viewGroup, View view) {
        switch (this.alpha) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    @Override // x2.r
    public float bravo(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }
}
