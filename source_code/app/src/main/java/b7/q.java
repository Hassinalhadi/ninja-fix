package b7;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class q extends Drawable implements Animatable {

    /* renamed from: f */
    public static final C0726h f3356f = new C0726h(Float.class, "growFraction", 4);

    /* renamed from: a */
    public boolean f3357a;
    public final Context alpha;

    /* renamed from: b */
    public float f3358b;

    /* renamed from: d */
    public int f3360d;
    public final AbstractC0723e purple;
    public ObjectAnimator silver;
    public ObjectAnimator teal;
    public ArrayList yellow;
    public final float white = -1.0f;

    /* renamed from: c */
    public final Paint f3359c = new Paint();
    public final Rect e = new Rect();
    public C0719a red = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [b7.a, java.lang.Object] */
    public q(Context context, AbstractC0723e abstractC0723e) {
        this.alpha = context;
        this.purple = abstractC0723e;
        setAlpha(255);
    }

    public final float bravo() {
        AbstractC0723e abstractC0723e = this.purple;
        if (abstractC0723e.golf != 0 || abstractC0723e.hotel != 0) {
            return this.f3358b;
        }
        return 1.0f;
    }

    public final float charlie() {
        int i4;
        float f5 = this.white;
        if (f5 > 0.0f) {
            return f5;
        }
        boolean z2 = this instanceof o;
        AbstractC0723e abstractC0723e = this.purple;
        if (abstractC0723e.bravo(z2) && abstractC0723e.mike != 0) {
            C0719a c0719a = this.red;
            ContentResolver contentResolver = this.alpha.getContentResolver();
            c0719a.getClass();
            float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f10 > 0.0f) {
                if (z2) {
                    i4 = abstractC0723e.juliet;
                } else {
                    i4 = abstractC0723e.kilo;
                }
                int i5 = (int) (((i4 * 1000.0f) / abstractC0723e.mike) * f10);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i5)) / i5;
                if (uptimeMillis < 0.0f) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean delta(boolean z2, boolean z10, boolean z11) {
        boolean z12;
        C0719a c0719a = this.red;
        ContentResolver contentResolver = this.alpha.getContentResolver();
        c0719a.getClass();
        float f5 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z11 && f5 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        return echo(z2, z10, z12);
    }

    public boolean echo(boolean z2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z12;
        ObjectAnimator objectAnimator3 = this.silver;
        C0726h c0726h = f3356f;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c0726h, 0.0f, 1.0f);
            this.silver = ofFloat;
            ofFloat.setDuration(500L);
            this.silver.setInterpolator(M6.a.bravo);
            ObjectAnimator objectAnimator4 = this.silver;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.silver = objectAnimator4;
            objectAnimator4.addListener(new p(this, 0));
        }
        if (this.teal == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, c0726h, 1.0f, 0.0f);
            this.teal = ofFloat2;
            ofFloat2.setDuration(500L);
            this.teal.setInterpolator(M6.a.bravo);
            ObjectAnimator objectAnimator5 = this.teal;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.teal = objectAnimator5;
            objectAnimator5.addListener(new p(this, 1));
        }
        if (isVisible() || z2) {
            if (z2) {
                objectAnimator = this.silver;
            } else {
                objectAnimator = this.teal;
            }
            if (z2) {
                objectAnimator2 = this.teal;
            } else {
                objectAnimator2 = this.silver;
            }
            if (!z11) {
                if (objectAnimator2.isRunning()) {
                    boolean z13 = this.f3357a;
                    this.f3357a = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.f3357a = z13;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z14 = this.f3357a;
                    this.f3357a = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.f3357a = z14;
                }
                return super.setVisible(z2, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z2 && !super.setVisible(z2, false)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AbstractC0723e abstractC0723e = this.purple;
                if (!z2 ? abstractC0723e.hotel != 0 : abstractC0723e.golf != 0) {
                    if (!z10 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z12;
                    }
                    objectAnimator.start();
                    return z12;
                }
                boolean z15 = this.f3357a;
                this.f3357a = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.f3357a = z15;
                return z12;
            }
        }
        return false;
    }

    public final void foxtrot(C0721c c0721c) {
        ArrayList arrayList = this.yellow;
        if (arrayList != null && arrayList.contains(c0721c)) {
            this.yellow.remove(c0721c);
            if (this.yellow.isEmpty()) {
                this.yellow = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3360d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.silver;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.teal;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f3360d = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3359c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        return delta(z2, z10, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        echo(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        echo(false, true, false);
    }
}
