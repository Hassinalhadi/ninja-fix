package al;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class g extends Drawable {
    public static final float lima = (float) Math.toRadians(45.0d);
    public final Paint alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final boolean foxtrot;
    public final Path golf;
    public final int hotel;
    public float india;
    public final float juliet;
    public final int kilo;

    public g(Context context) {
        Paint paint = new Paint();
        this.alpha = paint;
        this.golf = new Path();
        this.kilo = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, aj.a.november, R.attr.drawerArrowStyle, 2132082912);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.juliet = (float) (Math.cos(lima) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.foxtrot != z2) {
            this.foxtrot = z2;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.echo) {
            this.echo = round;
            invalidateSelf();
        }
        this.hotel = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.charlie = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.bravo = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.delta = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float alpha(float f5, float f10, float f11) {
        return Q0.c.lima(f10, f5, f11, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f5;
        float f10;
        int i4;
        Rect bounds = getBounds();
        int i5 = this.kilo;
        boolean z2 = false;
        if (i5 != 0 && (i5 == 1 || (i5 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z2 = true;
        }
        float f11 = this.bravo;
        float sqrt = (float) Math.sqrt(f11 * f11 * 2.0f);
        float f12 = this.india;
        float f13 = this.charlie;
        float alpha = alpha(f13, sqrt, f12);
        float alpha2 = alpha(f13, this.delta, this.india);
        float round = Math.round(alpha(0.0f, this.juliet, this.india));
        float alpha3 = alpha(0.0f, lima, this.india);
        if (z2) {
            f5 = 0.0f;
        } else {
            f5 = -180.0f;
        }
        if (z2) {
            f10 = 180.0f;
        } else {
            f10 = 0.0f;
        }
        float alpha4 = alpha(f5, f10, this.india);
        double d4 = alpha;
        double d9 = alpha3;
        boolean z10 = z2;
        float round2 = (float) Math.round(Math.cos(d9) * d4);
        float round3 = (float) Math.round(Math.sin(d9) * d4);
        Path path = this.golf;
        path.rewind();
        float f14 = this.echo;
        Paint paint = this.alpha;
        float alpha5 = alpha(paint.getStrokeWidth() + f14, -this.juliet, this.india);
        float f15 = (-alpha2) / 2.0f;
        path.moveTo(f15 + round, 0.0f);
        path.rLineTo(alpha2 - (round * 2.0f), 0.0f);
        path.moveTo(f15, alpha5);
        path.rLineTo(round2, round3);
        path.moveTo(f15, -alpha5);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        float f16 = this.echo;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f16 + ((((int) (height - (f16 * 2.0f))) / 4) * 2));
        if (this.foxtrot) {
            if (z10) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            canvas.rotate(alpha4 * i4);
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.hotel;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.hotel;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Paint paint = this.alpha;
        if (i4 != paint.getAlpha()) {
            paint.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.alpha.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f5) {
        if (this.india != f5) {
            this.india = f5;
            invalidateSelf();
        }
    }
}
