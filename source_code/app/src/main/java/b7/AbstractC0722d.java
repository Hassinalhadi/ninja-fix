package b7;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import l7.AbstractC2059a;
import s6.AbstractC2815x7;

/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0722d extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3324a;
    public final AbstractC0723e alpha;

    /* renamed from: b, reason: collision with root package name */
    public final RunnableC0720b f3325b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0720b f3326c;

    /* renamed from: d, reason: collision with root package name */
    public final C0721c f3327d;
    public final C0721c e;
    public int purple;
    public final boolean red;
    public final int silver;
    public C0719a teal;
    public boolean white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r9v4, types: [b7.a, java.lang.Object] */
    public AbstractC0722d(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(AbstractC2059a.alpha(context, attributeSet, i4, 2132083955), attributeSet, i4);
        this.white = false;
        this.yellow = 4;
        this.f3325b = new RunnableC0720b(this, 0);
        this.f3326c = new RunnableC0720b(this, 1);
        this.f3327d = new C0721c(0, this);
        this.e = new C0721c(1, this);
        Context context2 = getContext();
        this.alpha = alpha(context2, attributeSet);
        int[] iArr = L6.a.delta;
        com.google.android.material.internal.z.alpha(context2, attributeSet, i4, i5);
        com.google.android.material.internal.z.bravo(context2, attributeSet, iArr, i4, i5, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        obtainStyledAttributes.getInt(7, -1);
        this.silver = Math.min(obtainStyledAttributes.getInt(5, -1), 1000);
        obtainStyledAttributes.recycle();
        this.teal = new Object();
        this.red = true;
    }

    private t getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f3361g;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f3345g;
    }

    public abstract AbstractC0723e alpha(Context context, AttributeSet attributeSet);

    public final void bravo() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f3362h.uniform(this.f3327d);
        }
    }

    public void charlie(int i4) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.purple = i4;
                this.white = true;
                if (getIndeterminateDrawable().isVisible()) {
                    C0719a c0719a = this.teal;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    c0719a.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().f3362h.victor();
                        return;
                    }
                }
                this.f3327d.onAnimationEnd(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i4);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public final boolean delta() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.alpha.hotel;
    }

    public int[] getIndicatorColor() {
        return this.alpha.echo;
    }

    public int getIndicatorTrackGapSize() {
        return this.alpha.india;
    }

    public int getShowAnimationBehavior() {
        return this.alpha.golf;
    }

    public int getTrackColor() {
        return this.alpha.foxtrot;
    }

    public int getTrackCornerRadius() {
        return this.alpha.bravo;
    }

    public float getTrackCornerRadiusFraction() {
        return this.alpha.charlie;
    }

    public int getTrackThickness() {
        return this.alpha.alpha;
    }

    public int getWaveAmplitude() {
        return this.alpha.lima;
    }

    public int getWaveSpeed() {
        return this.alpha.mike;
    }

    public int getWavelengthDeterminate() {
        return this.alpha.juliet;
    }

    public int getWavelengthIndeterminate() {
        return this.alpha.kilo;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bravo();
        o progressDrawable = getProgressDrawable();
        C0721c c0721c = this.e;
        if (progressDrawable != null) {
            o progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.yellow == null) {
                progressDrawable2.yellow = new ArrayList();
            }
            if (!progressDrawable2.yellow.contains(c0721c)) {
                progressDrawable2.yellow.add(c0721c);
            }
        }
        if (getIndeterminateDrawable() != null) {
            u indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.yellow == null) {
                indeterminateDrawable.yellow = new ArrayList();
            }
            if (!indeterminateDrawable.yellow.contains(c0721c)) {
                indeterminateDrawable.yellow.add(c0721c);
            }
        }
        if (delta()) {
            if (this.silver > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3326c);
        removeCallbacks(this.f3325b);
        ((q) getCurrentDrawable()).delta(false, false, false);
        u indeterminateDrawable = getIndeterminateDrawable();
        C0721c c0721c = this.e;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().foxtrot(c0721c);
            getIndeterminateDrawable().f3362h.yankee();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().foxtrot(c0721c);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        getCurrentDrawingDelegate().golf();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        int foxtrot;
        int echo;
        try {
            t currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.foxtrot() < 0) {
                foxtrot = View.getDefaultSize(getSuggestedMinimumWidth(), i4);
            } else {
                foxtrot = currentDrawingDelegate.foxtrot() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.echo() < 0) {
                echo = View.getDefaultSize(getSuggestedMinimumHeight(), i5);
            } else {
                echo = currentDrawingDelegate.echo() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(foxtrot, echo);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        boolean z2;
        super.onVisibilityChanged(view, i4);
        if (i4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.red) {
            return;
        }
        ((q) getCurrentDrawable()).delta(delta(), false, z2);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (!this.red) {
            return;
        }
        ((q) getCurrentDrawable()).delta(delta(), false, false);
    }

    public void setAnimatorDurationScaleProvider(C0719a c0719a) {
        this.teal = c0719a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().red = c0719a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().red = c0719a;
        }
    }

    public void setHideAnimationBehavior(int i4) {
        this.alpha.hotel = i4;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        try {
            if (z2 == isIndeterminate()) {
                return;
            }
            q qVar = (q) getCurrentDrawable();
            if (qVar != null) {
                qVar.delta(false, false, false);
            }
            super.setIndeterminate(z2);
            q qVar2 = (q) getCurrentDrawable();
            if (qVar2 != null) {
                qVar2.delta(delta(), false, false);
            }
            if ((qVar2 instanceof u) && delta()) {
                ((u) qVar2).f3362h.xray();
            }
            this.white = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f5) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.november != f5) {
            abstractC0723e.november = f5;
            getIndeterminateDrawable().f3362h.papa();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof u) {
            ((q) drawable).delta(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (!this.f3324a) {
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC2815x7.delta(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.alpha.echo = iArr;
            getIndeterminateDrawable().f3362h.papa();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.india != i4) {
            abstractC0723e.india = i4;
            abstractC0723e.delta();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i4) {
        if (isIndeterminate()) {
            return;
        }
        charlie(i4);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof o) {
            o oVar = (o) drawable;
            oVar.delta(false, false, false);
            super.setProgressDrawable(oVar);
            oVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (!this.f3324a) {
            super.setProgressDrawable(drawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }

    public void setShowAnimationBehavior(int i4) {
        this.alpha.golf = i4;
        invalidate();
    }

    public void setTrackColor(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.foxtrot != i4) {
            abstractC0723e.foxtrot = i4;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.bravo != i4) {
            abstractC0723e.bravo = Math.min(i4, abstractC0723e.alpha / 2);
            abstractC0723e.delta = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f5) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.charlie != f5) {
            abstractC0723e.charlie = Math.min(f5, 0.5f);
            abstractC0723e.delta = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.alpha != i4) {
            abstractC0723e.alpha = i4;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i4) {
        if (i4 != 0 && i4 != 4 && i4 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.yellow = i4;
    }

    public void setWaveAmplitude(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.lima != i4) {
            abstractC0723e.lima = Math.abs(i4);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i4) {
        boolean z2;
        AbstractC0723e abstractC0723e = this.alpha;
        abstractC0723e.mike = i4;
        o progressDrawable = getProgressDrawable();
        if (abstractC0723e.mike != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ValueAnimator valueAnimator = progressDrawable.f3351m;
        if (z2 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else if (!z2 && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i4) {
        setWavelengthDeterminate(i4);
        setWavelengthIndeterminate(i4);
    }

    public void setWavelengthDeterminate(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.juliet != i4) {
            abstractC0723e.juliet = Math.abs(i4);
            if (!isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void setWavelengthIndeterminate(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e.kilo != i4) {
            abstractC0723e.kilo = Math.abs(i4);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public u getIndeterminateDrawable() {
        return (u) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public o getProgressDrawable() {
        return (o) super.getProgressDrawable();
    }
}
