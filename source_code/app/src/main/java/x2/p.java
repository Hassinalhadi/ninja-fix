package x2;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class p implements r {
    public final /* synthetic */ int alpha;

    public static Paint charlie(float f5, int i4) {
        if (f5 > 0.0f) {
            Paint paint = new Paint();
            paint.setColor(i4);
            paint.setStrokeWidth(f5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    @Override // x2.r
    public float alpha(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }

    @Override // x2.r
    public final float bravo(ViewGroup viewGroup, View view) {
        switch (this.alpha) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                if (viewGroup.getLayoutDirection() == 1) {
                    return view.getTranslationX() + viewGroup.getWidth();
                }
                return view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                if (viewGroup.getLayoutDirection() == 1) {
                    return view.getTranslationX() - viewGroup.getWidth();
                }
                return view.getTranslationX() + viewGroup.getWidth();
        }
    }
}
