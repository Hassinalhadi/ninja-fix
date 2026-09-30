package uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds;

import Q0.c;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptText;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptUtils;

/* loaded from: classes.dex */
public class CirclePromptBackground extends PromptBackground {
    int mBaseColourAlpha;
    PointF mBasePosition;
    float mBaseRadius;
    Paint mPaint;
    Path mPath;
    PointF mPosition;
    float mRadius;

    public CirclePromptBackground() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPosition = new PointF();
        this.mBasePosition = new PointF();
        this.mPath = new Path();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return PromptUtils.isPointInCircle(f5, f10, this.mPosition, this.mRadius);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void draw(Canvas canvas) {
        PointF pointF = this.mPosition;
        canvas.drawCircle(pointF.x, pointF.y, this.mRadius, this.mPaint);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public Path getPath() {
        return this.mPath;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public void prepare(PromptOptions promptOptions, boolean z2, Rect rect) {
        float f5;
        PromptText promptText = promptOptions.getPromptText();
        RectF bounds = promptOptions.getPromptFocal().getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float focalPadding = promptOptions.getFocalPadding();
        RectF bounds2 = promptText.getBounds();
        float textPadding = promptOptions.getTextPadding();
        RectF rectF = new RectF(rect);
        float f10 = promptOptions.getResourceFinder().getResources().getDisplayMetrics().density * 88.0f;
        rectF.inset(f10, f10);
        if ((centerX > rectF.left && centerX < rectF.right) || (centerY > rectF.top && centerY < rectF.bottom)) {
            float width = bounds2.width();
            float f11 = (((100.0f / width) * ((width / 2.0f) + (centerX - bounds2.left))) / 100.0f) * 90.0f;
            if (bounds2.top < bounds.top) {
                f5 = 180.0f - f11;
            } else {
                f5 = 180.0f + f11;
            }
            PointF calculateAngleEdgePoint = promptOptions.getPromptFocal().calculateAngleEdgePoint(f5, focalPadding);
            float f12 = calculateAngleEdgePoint.x;
            float f13 = calculateAngleEdgePoint.y;
            float f14 = bounds2.left - textPadding;
            float f15 = bounds2.top;
            if (f15 >= bounds.top) {
                f15 = bounds2.bottom;
            }
            float f16 = bounds2.right + textPadding;
            float f17 = bounds.right;
            if (f17 > f16) {
                f16 = f17 + focalPadding;
            }
            double d4 = f15;
            double pow = Math.pow(d4, 2.0d) + Math.pow(f14, 2.0d);
            double pow2 = ((Math.pow(f13, 2.0d) + Math.pow(f12, 2.0d)) - pow) / 2.0d;
            double pow3 = ((pow - Math.pow(f16, 2.0d)) - Math.pow(d4, 2.0d)) / 2.0d;
            float f18 = f15 - f15;
            float f19 = f13 - f15;
            double d9 = 1.0d / ((r2 * f18) - (r1 * f19));
            this.mBasePosition.set((float) (((f18 * pow2) - (f19 * pow3)) * d9), (float) (((pow3 * (f12 - f14)) - (pow2 * (f14 - f16))) * d9));
            this.mBaseRadius = (float) Math.sqrt(Math.pow(f15 - this.mBasePosition.y, 2.0d) + Math.pow(f14 - this.mBasePosition.x, 2.0d));
        } else {
            this.mBasePosition.set(centerX, centerY);
            float max = Math.max(Math.abs(bounds2.right - centerX), Math.abs(bounds2.left - centerX)) + textPadding;
            this.mBaseRadius = (float) Math.sqrt(Math.pow(bounds2.height() + (bounds.height() / 2.0f) + focalPadding, 2.0d) + Math.pow(max, 2.0d));
        }
        this.mPosition.set(this.mBasePosition);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground
    public void setColour(int i4) {
        this.mPaint.setColor(i4);
        int alpha = Color.alpha(i4);
        this.mBaseColourAlpha = alpha;
        this.mPaint.setAlpha(alpha);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        RectF bounds = promptOptions.getPromptFocal().getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        this.mRadius = this.mBaseRadius * f5;
        this.mPaint.setAlpha((int) (this.mBaseColourAlpha * f10));
        PointF pointF = this.mPosition;
        PointF pointF2 = this.mBasePosition;
        pointF.set(c.lima(pointF2.x, centerX, f5, centerX), c.lima(pointF2.y, centerY, f5, centerY));
        this.mPath.reset();
        Path path = this.mPath;
        PointF pointF3 = this.mPosition;
        path.addCircle(pointF3.x, pointF3.y, this.mRadius, Path.Direction.CW);
    }
}
