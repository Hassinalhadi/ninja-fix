package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.z;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import x2.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8259g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f8260a;
    public final ValueAnimator alpha;

    /* renamed from: b, reason: collision with root package name */
    public float f8261b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8262c;

    /* renamed from: d, reason: collision with root package name */
    public double f8263d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f8264f;
    public boolean purple;
    public final ArrayList red;
    public final int silver;
    public final float teal;
    public final Paint white;
    public final RectF yellow;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.alpha = valueAnimator;
        this.red = new ArrayList();
        Paint paint = new Paint();
        this.white = paint;
        this.yellow = new RectF();
        this.f8264f = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.juliet, R.attr.materialClockStyle, 2132083979);
        q.echo(context, R.attr.motionDurationLong2, 200);
        q.foxtrot(context, R.attr.motionEasingEmphasizedInterpolator, M6.a.bravo);
        this.e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.silver = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f8260a = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.teal = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        bravo(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = ClockHandView.f8259g;
                ClockHandView.this.charlie(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final int alpha(int i4) {
        if (i4 == 2) {
            return Math.round(this.e * 0.66f);
        }
        return this.e;
    }

    public final void bravo(float f5) {
        this.alpha.cancel();
        charlie(f5);
    }

    public final void charlie(float f5) {
        float f10 = f5 % 360.0f;
        this.f8261b = f10;
        this.f8263d = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float alpha = alpha(this.f8264f);
        float cos = (((float) Math.cos(this.f8263d)) * alpha) + width;
        float sin = (alpha * ((float) Math.sin(this.f8263d))) + height;
        float f11 = this.silver;
        this.yellow.set(cos - f11, sin - f11, cos + f11, sin + f11);
        Iterator it = this.red.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.f8258z - f10) > 0.001f) {
                clockFaceView.f8258z = f10;
                clockFaceView.golf();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f5 = width;
        float alpha = alpha(this.f8264f);
        float cos = (((float) Math.cos(this.f8263d)) * alpha) + f5;
        float f10 = height;
        float sin = (alpha * ((float) Math.sin(this.f8263d))) + f10;
        Paint paint = this.white;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.silver, paint);
        double sin2 = Math.sin(this.f8263d);
        paint.setStrokeWidth(this.f8260a);
        canvas.drawLine(f5, f10, width + ((int) (Math.cos(this.f8263d) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f5, f10, this.teal, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        if (!this.alpha.isRunning()) {
            bravo(this.f8261b);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        boolean z11;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
                z2 = false;
            } else {
                z10 = this.f8262c;
                if (this.purple) {
                    if (((float) Math.hypot(x4 - (getWidth() / 2), y10 - (getHeight() / 2))) <= alpha(2) + z.delta(12, getContext())) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    this.f8264f = i4;
                }
                z2 = false;
            }
        } else {
            this.f8262c = false;
            z2 = true;
            z10 = false;
        }
        boolean z13 = this.f8262c;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i5 = degrees + 90;
        if (i5 < 0) {
            i5 = degrees + HttpConstants.HTTP_BLOCKED;
        }
        float f5 = i5;
        if (this.f8261b != f5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z2 || !z11) {
            if (z11 || z10) {
                bravo(f5);
            }
            this.f8262c = z13 | z12;
            return true;
        }
        z12 = true;
        this.f8262c = z13 | z12;
        return true;
    }
}
