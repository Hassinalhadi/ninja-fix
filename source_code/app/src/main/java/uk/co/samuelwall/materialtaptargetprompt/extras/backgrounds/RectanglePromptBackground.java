package uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptUtils;

/* loaded from: classes.dex */
public class RectanglePromptBackground extends PromptBackground {
    RectF mBaseBounds;
    int mBaseColourAlpha;
    RectF mBounds;
    PointF mFocalCentre;
    Paint mPaint;
    Path mPath;
    float mRx;
    float mRy;

    public RectanglePromptBackground() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mBounds = new RectF();
        this.mBaseBounds = new RectF();
        this.mFocalCentre = new PointF();
        this.mPath = new Path();
        float f5 = Resources.getSystem().getDisplayMetrics().density * 2.0f;
        this.mRy = f5;
        this.mRx = f5;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return this.mBounds.contains(f5, f10);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(this.mBounds, this.mRx, this.mRy, this.mPaint);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public Path getPath() {
        return this.mPath;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public void prepare(PromptOptions promptOptions, boolean z2, Rect rect) {
        float f5;
        float f10;
        RectF bounds = promptOptions.getPromptFocal().getBounds();
        RectF bounds2 = promptOptions.getPromptText().getBounds();
        float textPadding = promptOptions.getTextPadding();
        float f11 = bounds2.top;
        float f12 = bounds.top;
        if (f11 < f12) {
            f5 = f11 - textPadding;
            f10 = bounds.bottom;
        } else {
            f5 = f12 - textPadding;
            f10 = bounds2.bottom;
        }
        float f13 = f10 + textPadding;
        this.mBaseBounds.set(Math.min(bounds2.left - textPadding, bounds.left - textPadding), f5, Math.max(bounds2.right + textPadding, bounds.right + textPadding), f13);
        this.mFocalCentre.x = bounds.centerX();
        this.mFocalCentre.y = bounds.centerY();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public void setColour(int i4) {
        this.mPaint.setColor(i4);
        int alpha = Color.alpha(i4);
        this.mBaseColourAlpha = alpha;
        this.mPaint.setAlpha(alpha);
    }

    public RectanglePromptBackground setCornerRadius(float f5, float f10) {
        this.mRx = f5;
        this.mRy = f10;
        return this;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        this.mPaint.setAlpha((int) (this.mBaseColourAlpha * f10));
        PromptUtils.scale(this.mFocalCentre, this.mBaseBounds, this.mBounds, f5, false);
        this.mPath.reset();
        this.mPath.addRoundRect(this.mBounds, this.mRx, this.mRy, Path.Direction.CW);
    }
}
