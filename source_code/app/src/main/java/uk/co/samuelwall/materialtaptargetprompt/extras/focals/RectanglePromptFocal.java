package uk.co.samuelwall.materialtaptargetprompt.extras.focals;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptUtils;

/* loaded from: classes.dex */
public class RectanglePromptFocal extends PromptFocal {
    int mBaseAlpha;
    RectF mBaseBounds;
    PointF mBaseBoundsCentre;
    RectF mBounds;
    float mPadding;
    Paint mPaint;
    Path mPath;
    int mRippleAlpha;
    RectF mRippleBounds;
    private float mRx;
    private float mRy;
    private PointF mSize;

    public RectanglePromptFocal() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mBounds = new RectF();
        this.mBaseBounds = new RectF();
        this.mBaseBoundsCentre = new PointF();
        this.mRippleBounds = new RectF();
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = 2.0f * f5;
        this.mRy = f10;
        this.mRx = f10;
        this.mPadding = f5 * 8.0f;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return this.mBounds.contains(f5, f10);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void draw(Canvas canvas) {
        if (this.mDrawRipple) {
            int alpha = this.mPaint.getAlpha();
            int color = this.mPaint.getColor();
            if (color == 0) {
                this.mPaint.setColor(-1);
            }
            this.mPaint.setAlpha(this.mRippleAlpha);
            canvas.drawRoundRect(this.mRippleBounds, this.mRx, this.mRy, this.mPaint);
            this.mPaint.setColor(color);
            this.mPaint.setAlpha(alpha);
        }
        canvas.drawPath(getPath(), this.mPaint);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public RectF getBounds() {
        return this.mBaseBounds;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public Path getPath() {
        return this.mPath;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void prepare(PromptOptions promptOptions, View view, int[] iArr) {
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        float f5 = iArr2[0] - iArr[0];
        float f10 = iArr2[1] - iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (this.mSize == null) {
            RectF rectF = this.mBaseBounds;
            float f11 = this.mPadding;
            rectF.left = f5 - f11;
            rectF.top = f10 - f11;
            rectF.right = width + f5 + f11;
            rectF.bottom = height + f10 + f11;
            PointF pointF = this.mBaseBoundsCentre;
            pointF.x = f5 + (width / 2);
            pointF.y = f10 + (height / 2);
            return;
        }
        prepare(promptOptions, f5 + (width / 2), f10 + (height / 2));
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void setColour(int i4) {
        this.mPaint.setColor(i4);
        int alpha = Color.alpha(i4);
        this.mBaseAlpha = alpha;
        this.mPaint.setAlpha(alpha);
    }

    public RectanglePromptFocal setCornerRadius(float f5, float f10) {
        this.mRx = f5;
        this.mRy = f10;
        return this;
    }

    public RectanglePromptFocal setSize(PointF pointF) {
        if (pointF == null) {
            this.mSize = null;
            return this;
        }
        PointF pointF2 = new PointF();
        this.mSize = pointF2;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        return this;
    }

    public RectanglePromptFocal setTargetPadding(float f5) {
        this.mPadding = f5;
        return this;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        PromptUtils.scale(this.mBaseBoundsCentre, this.mBaseBounds, this.mBounds, f5, true);
        Path path = new Path();
        this.mPath = path;
        path.addRoundRect(this.mBounds, this.mRx, this.mRy, Path.Direction.CW);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void updateRipple(float f5, float f10) {
        PromptUtils.scale(this.mBaseBoundsCentre, this.mBaseBounds, this.mRippleBounds, f5, true);
        this.mRippleAlpha = (int) (this.mBaseRippleAlpha * f10);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void prepare(PromptOptions promptOptions, float f5, float f10) {
        PointF pointF = this.mSize;
        if (pointF != null) {
            float f11 = pointF.x / 2.0f;
            float f12 = pointF.y / 2.0f;
            RectF rectF = this.mBaseBounds;
            float f13 = this.mPadding;
            rectF.left = (f5 - f11) - f13;
            rectF.top = (f10 - f12) - f13;
            rectF.right = f11 + f5 + f13;
            rectF.bottom = f12 + f10 + f13;
            PointF pointF2 = this.mBaseBoundsCentre;
            pointF2.x = f5;
            pointF2.y = f10;
            return;
        }
        throw new UnsupportedOperationException("RectanglePromptFocal size must be set using setSize(PointF)");
    }
}
