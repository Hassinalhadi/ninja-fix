package v2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3169e extends Drawable implements Animatable {
    public final C3168d alpha;
    public float purple;
    public final Resources red;
    public final ValueAnimator silver;
    public float teal;
    public boolean white;
    public static final LinearInterpolator yellow = new LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public static final P1.a f13987a = new P1.a(1);

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13988b = {ShapeBuilder.DEFAULT_SHAPE_COLOR};

    public C3169e(Context context) {
        context.getClass();
        this.red = context.getResources();
        C3168d c3168d = new C3168d();
        this.alpha = c3168d;
        c3168d.india = f13988b;
        c3168d.alpha(0);
        c3168d.hotel = 2.5f;
        c3168d.bravo.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C3166b(this, c3168d));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(yellow);
        ofFloat.addListener(new C3167c(this, c3168d));
        this.silver = ofFloat;
    }

    public static void delta(float f5, C3168d c3168d) {
        if (f5 > 0.75f) {
            float f10 = (f5 - 0.75f) / 0.25f;
            int[] iArr = c3168d.india;
            int i4 = c3168d.juliet;
            int i5 = iArr[i4];
            int i10 = iArr[(i4 + 1) % iArr.length];
            c3168d.uniform = ((((i5 >> 24) & 255) + ((int) ((((i10 >> 24) & 255) - r1) * f10))) << 24) | ((((i5 >> 16) & 255) + ((int) ((((i10 >> 16) & 255) - r3) * f10))) << 16) | ((((i5 >> 8) & 255) + ((int) ((((i10 >> 8) & 255) - r4) * f10))) << 8) | ((i5 & 255) + ((int) (f10 * ((i10 & 255) - r2))));
            return;
        }
        c3168d.uniform = c3168d.india[c3168d.juliet];
    }

    public final void alpha(float f5, C3168d c3168d, boolean z2) {
        float interpolation;
        float f10;
        if (this.white) {
            delta(f5, c3168d);
            float floor = (float) (Math.floor(c3168d.mike / 0.8f) + 1.0d);
            float f11 = c3168d.kilo;
            float f12 = c3168d.lima;
            c3168d.echo = (((f12 - 0.01f) - f11) * f5) + f11;
            c3168d.foxtrot = f12;
            float f13 = c3168d.mike;
            c3168d.golf = Q0.c.lima(floor, f13, f5, f13);
            return;
        }
        if (f5 == 1.0f && !z2) {
            return;
        }
        float f14 = c3168d.mike;
        P1.a aVar = f13987a;
        if (f5 < 0.5f) {
            interpolation = c3168d.kilo;
            f10 = (aVar.getInterpolation(f5 / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            float f15 = c3168d.kilo + 0.79f;
            interpolation = f15 - (((1.0f - aVar.getInterpolation((f5 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            f10 = f15;
        }
        float f16 = (0.20999998f * f5) + f14;
        float f17 = (f5 + this.teal) * 216.0f;
        c3168d.echo = interpolation;
        c3168d.foxtrot = f10;
        c3168d.golf = f16;
        this.purple = f17;
    }

    public final void bravo(float f5, float f10, float f11, float f12) {
        float f13 = this.red.getDisplayMetrics().density;
        float f14 = f10 * f13;
        C3168d c3168d = this.alpha;
        c3168d.hotel = f14;
        c3168d.bravo.setStrokeWidth(f14);
        c3168d.quebec = f5 * f13;
        c3168d.alpha(0);
        c3168d.romeo = (int) (f11 * f13);
        c3168d.sierra = (int) (f12 * f13);
    }

    public final void charlie(int i4) {
        if (i4 == 0) {
            bravo(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            bravo(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.purple, bounds.exactCenterX(), bounds.exactCenterY());
        C3168d c3168d = this.alpha;
        RectF rectF = c3168d.alpha;
        float f5 = c3168d.quebec;
        float f10 = (c3168d.hotel / 2.0f) + f5;
        if (f5 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c3168d.romeo * c3168d.papa) / 2.0f, c3168d.hotel / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = c3168d.echo;
        float f12 = c3168d.golf;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((c3168d.foxtrot + f12) * 360.0f) - f13;
        Paint paint = c3168d.bravo;
        paint.setColor(c3168d.uniform);
        paint.setAlpha(c3168d.tango);
        float f15 = c3168d.hotel / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c3168d.delta);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (c3168d.november) {
            Path path = c3168d.oscar;
            if (path == null) {
                Path path2 = new Path();
                c3168d.oscar = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (c3168d.romeo * c3168d.papa) / 2.0f;
            c3168d.oscar.moveTo(0.0f, 0.0f);
            c3168d.oscar.lineTo(c3168d.romeo * c3168d.papa, 0.0f);
            Path path3 = c3168d.oscar;
            float f18 = c3168d.romeo;
            float f19 = c3168d.papa;
            path3.lineTo((f18 * f19) / 2.0f, c3168d.sierra * f19);
            c3168d.oscar.offset((rectF.centerX() + min) - f17, (c3168d.hotel / 2.0f) + rectF.centerY());
            c3168d.oscar.close();
            Paint paint2 = c3168d.charlie;
            paint2.setColor(c3168d.uniform);
            paint2.setAlpha(c3168d.tango);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c3168d.oscar, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.alpha.tango;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.silver.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.alpha.tango = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.alpha.bravo.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.silver.cancel();
        C3168d c3168d = this.alpha;
        float f5 = c3168d.echo;
        c3168d.kilo = f5;
        float f10 = c3168d.foxtrot;
        c3168d.lima = f10;
        c3168d.mike = c3168d.golf;
        if (f10 != f5) {
            this.white = true;
            this.silver.setDuration(666L);
            this.silver.start();
            return;
        }
        c3168d.alpha(0);
        c3168d.kilo = 0.0f;
        c3168d.lima = 0.0f;
        c3168d.mike = 0.0f;
        c3168d.echo = 0.0f;
        c3168d.foxtrot = 0.0f;
        c3168d.golf = 0.0f;
        this.silver.setDuration(1332L);
        this.silver.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.silver.cancel();
        this.purple = 0.0f;
        C3168d c3168d = this.alpha;
        if (c3168d.november) {
            c3168d.november = false;
        }
        c3168d.alpha(0);
        c3168d.kilo = 0.0f;
        c3168d.lima = 0.0f;
        c3168d.mike = 0.0f;
        c3168d.echo = 0.0f;
        c3168d.foxtrot = 0.0f;
        c3168d.golf = 0.0f;
        invalidateSelf();
    }
}
