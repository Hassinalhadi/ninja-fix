package uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptUtils;

/* loaded from: classes.dex */
public class FullscreenPromptBackground extends PromptBackground {
    RectF mBaseBounds;
    int mBaseColourAlpha;
    RectF mBounds;
    PointF mFocalCentre;
    Paint mPaint;
    Path mPath;
    float mRx;
    float mRy;

    public FullscreenPromptBackground() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mBounds = new RectF();
        this.mBaseBounds = new RectF();
        this.mFocalCentre = new PointF();
        this.mPath = new Path();
        this.mRy = 0.0f;
        this.mRx = 0.0f;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return this.mBounds.contains(f5, f10);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void draw(Canvas canvas) {
        canvas.drawRect(this.mBounds, this.mPaint);
    }

    public DisplayMetrics getDisplayMetrics() {
        return Resources.getSystem().getDisplayMetrics();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public Path getPath() {
        return this.mPath;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public void prepare(PromptOptions promptOptions, boolean z2, Rect rect) {
        RectF bounds = promptOptions.getPromptFocal().getBounds();
        this.mBaseBounds.set(rect.left, rect.top, rect.right, rect.bottom);
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

    public FullscreenPromptBackground setCornerRadius(float f5, float f10) {
        this.mRx = f5;
        this.mRy = f10;
        return this;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        this.mPaint.setAlpha((int) (this.mBaseColourAlpha * f10));
        PromptUtils.scale(this.mFocalCentre, this.mBaseBounds, this.mBounds, f5, false);
        this.mPath.reset();
        this.mPath.addRect(this.mBounds, Path.Direction.CW);
    }
}
