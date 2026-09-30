package t6;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import delivery.samurai.android.R;

/* renamed from: t6.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2982d3 {
    public static ObjectAnimator alpha(View view, x2.ai aiVar, int i4, int i5, float f5, float f10, float f11, float f12, BaseInterpolator baseInterpolator, x2.s sVar) {
        float f13;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) aiVar.bravo.getTag(R.id.transition_position)) != null) {
            f5 = (r5[0] - i4) + translationX;
            f13 = (r5[1] - i5) + translationY;
        } else {
            f13 = f10;
        }
        view.setTranslationX(f5);
        view.setTranslationY(f13);
        if (f5 == f11 && f13 == f12) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f13, f12));
        x2.aj ajVar = new x2.aj(view, aiVar.bravo, translationX, translationY);
        sVar.alpha(ajVar);
        ofPropertyValuesHolder.addListener(ajVar);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    public static int bravo(int i4) {
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
