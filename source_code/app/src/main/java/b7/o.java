package b7;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class o extends q {

    /* renamed from: r, reason: collision with root package name */
    public static final n f3344r = new n(0);

    /* renamed from: g, reason: collision with root package name */
    public final t f3345g;

    /* renamed from: h, reason: collision with root package name */
    public final J1.g f3346h;

    /* renamed from: i, reason: collision with root package name */
    public final J1.f f3347i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3348j;

    /* renamed from: k, reason: collision with root package name */
    public float f3349k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3350l;

    /* renamed from: m, reason: collision with root package name */
    public final ValueAnimator f3351m;

    /* renamed from: n, reason: collision with root package name */
    public ValueAnimator f3352n;

    /* renamed from: o, reason: collision with root package name */
    public TimeInterpolator f3353o;

    /* renamed from: p, reason: collision with root package name */
    public TimeInterpolator f3354p;

    /* renamed from: q, reason: collision with root package name */
    public TimeInterpolator f3355q;

    public o(Context context, AbstractC0723e abstractC0723e, t tVar) {
        super(context, abstractC0723e);
        this.f3350l = false;
        this.f3345g = tVar;
        r rVar = new r();
        this.f3348j = rVar;
        rVar.hotel = true;
        J1.g gVar = new J1.g();
        this.f3346h = gVar;
        gVar.alpha(1.0f);
        gVar.bravo(50.0f);
        J1.f fVar = new J1.f(this, f3344r);
        this.f3347i = fVar;
        fVar.mike = gVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3351m = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new m(0, this, abstractC0723e));
        if (abstractC0723e.bravo(true) && abstractC0723e.mike != 0) {
            valueAnimator.start();
        }
        if (this.f3358b != 1.0f) {
            this.f3358b = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        boolean z10;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.e)) {
            canvas.save();
            t tVar = this.f3345g;
            Rect bounds = getBounds();
            float bravo = bravo();
            ObjectAnimator objectAnimator = this.silver;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            ObjectAnimator objectAnimator2 = this.teal;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.alpha.delta();
            tVar.alpha(canvas, bounds, bravo, z2, z10);
            float charlie = charlie();
            r rVar = this.f3348j;
            rVar.foxtrot = charlie;
            Paint paint = this.f3359c;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            AbstractC0723e abstractC0723e = this.purple;
            rVar.charlie = abstractC0723e.echo[0];
            int i4 = abstractC0723e.india;
            if (i4 > 0) {
                if (!(this.f3345g instanceof v)) {
                    i4 = (int) ((O6.c.alpha(rVar.bravo, 0.0f, 0.01f) * i4) / 0.01f);
                }
                this.f3345g.delta(canvas, paint, rVar.bravo, 1.0f, abstractC0723e.foxtrot, this.f3360d, i4);
            } else {
                this.f3345g.delta(canvas, paint, 0.0f, 1.0f, abstractC0723e.foxtrot, this.f3360d, 0);
            }
            this.f3345g.charlie(canvas, paint, rVar, this.f3360d);
            this.f3345g.bravo(canvas, paint, abstractC0723e.echo[0], this.f3360d);
            canvas.restore();
        }
    }

    @Override // b7.q
    public final boolean echo(boolean z2, boolean z10, boolean z11) {
        boolean echo = super.echo(z2, z10, z11);
        C0719a c0719a = this.red;
        ContentResolver contentResolver = this.alpha.getContentResolver();
        c0719a.getClass();
        float f5 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f5 == 0.0f) {
            this.f3350l = true;
            return echo;
        }
        this.f3350l = false;
        this.f3346h.bravo(50.0f / f5);
        return echo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3345g.echo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3345g.foxtrot();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3347i.delta();
        this.f3348j.bravo = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        float f5;
        float f10 = i4;
        if (f10 >= 1000.0f && f10 <= 9000.0f) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        boolean z2 = this.f3350l;
        r rVar = this.f3348j;
        J1.f fVar = this.f3347i;
        if (z2) {
            fVar.delta();
            rVar.bravo = f10 / 10000.0f;
            invalidateSelf();
            rVar.echo = f5;
            invalidateSelf();
        } else {
            fVar.bravo = rVar.bravo * 10000.0f;
            fVar.charlie = true;
            fVar.alpha(f10);
        }
        return true;
    }
}
