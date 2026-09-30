package uk.co.samuelwall.materialtaptargetprompt.extras.focals;

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
public class CirclePromptFocal extends PromptFocal {
    int mBaseAlpha;
    float mBaseRadius;
    RectF mBounds;
    Paint mPaint;
    Path mPath;
    PointF mPosition;
    float mRadius;
    int mRippleAlpha;
    float mRippleRadius;

    public CirclePromptFocal() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPosition = new PointF();
        this.mBounds = new RectF();
        this.mPath = new Path();
    }

    private float calculateX(float f5, float f10, float f11) {
        return (f10 * ((float) Math.cos(Math.toRadians(f5)))) + f11;
    }

    private float calculateY(float f5, float f10, float f11) {
        return (f10 * ((float) Math.sin(Math.toRadians(f5)))) + f11;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public PointF calculateAngleEdgePoint(float f5, float f10) {
        float width = this.mBounds.width() + f10;
        return new PointF(calculateX(f5, width, this.mBounds.centerX()), calculateY(f5, width, this.mBounds.centerY()));
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return PromptUtils.isPointInCircle(f5, f10, this.mPosition, this.mRadius);
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
            PointF pointF = this.mPosition;
            canvas.drawCircle(pointF.x, pointF.y, this.mRippleRadius, this.mPaint);
            this.mPaint.setColor(color);
            this.mPaint.setAlpha(alpha);
        }
        canvas.drawPath(getPath(), this.mPaint);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public RectF getBounds() {
        return this.mBounds;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public Path getPath() {
        return this.mPath;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void prepare(PromptOptions promptOptions, View view, int[] iArr) {
        view.getLocationInWindow(new int[2]);
        prepare(promptOptions, (view.getWidth() / 2) + (r1[0] - iArr[0]), (view.getHeight() / 2) + (r1[1] - iArr[1]));
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void setColour(int i4) {
        this.mPaint.setColor(i4);
        int alpha = Color.alpha(i4);
        this.mBaseAlpha = alpha;
        this.mPaint.setAlpha(alpha);
    }

    public CirclePromptFocal setRadius(float f5) {
        this.mBaseRadius = f5;
        return this;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        this.mPaint.setAlpha((int) (this.mBaseAlpha * f10));
        this.mRadius = this.mBaseRadius * f5;
        Path path = new Path();
        this.mPath = path;
        PointF pointF = this.mPosition;
        path.addCircle(pointF.x, pointF.y, this.mRadius, Path.Direction.CW);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void updateRipple(float f5, float f10) {
        this.mRippleRadius = this.mBaseRadius * f5;
        this.mRippleAlpha = (int) (this.mBaseRippleAlpha * f10);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptFocal
    public void prepare(PromptOptions promptOptions, float f5, float f10) {
        PointF pointF = this.mPosition;
        pointF.x = f5;
        pointF.y = f10;
        RectF rectF = this.mBounds;
        float f11 = this.mBaseRadius;
        rectF.left = f5 - f11;
        rectF.top = f10 - f11;
        rectF.right = f5 + f11;
        rectF.bottom = f10 + f11;
    }
}
