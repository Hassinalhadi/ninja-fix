package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public abstract class PromptFocal implements PromptUIElement {
    protected int mBaseRippleAlpha;
    protected boolean mDrawRipple;

    public PointF calculateAngleEdgePoint(float f5, float f10) {
        int i4;
        RectF bounds = getBounds();
        double radians = (float) Math.toRadians(f5);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float width = bounds.width() + f10;
        int i5 = -2;
        if (cos > 0.0f) {
            i4 = 2;
        } else {
            i4 = -2;
        }
        float f11 = width / i4;
        float height = bounds.height() + f10;
        if (sin > 0.0f) {
            i5 = 2;
        }
        return new PointF(bounds.centerX() + f11, bounds.centerY() + (height / i5));
    }

    public abstract RectF getBounds();

    public Path getPath() {
        return null;
    }

    public abstract void prepare(PromptOptions promptOptions, float f5, float f10);

    public abstract void prepare(PromptOptions promptOptions, View view, int[] iArr);

    public abstract void setColour(int i4);

    public void setDrawRipple(boolean z2) {
        this.mDrawRipple = z2;
    }

    public void setRippleAlpha(int i4) {
        this.mBaseRippleAlpha = i4;
    }

    public abstract void updateRipple(float f5, float f10);
}
