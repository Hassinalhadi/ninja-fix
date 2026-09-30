package i7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.i;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g7.m;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;

/* renamed from: i7.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1899e extends FrameLayout {
    public static final i e = new i(1);

    /* renamed from: a */
    public ColorStateList f12763a;
    public AbstractC1900f alpha;

    /* renamed from: b */
    public PorterDuff.Mode f12764b;

    /* renamed from: c */
    public Rect f12765c;

    /* renamed from: d */
    public boolean f12766d;
    public final m purple;
    public int red;
    public final float silver;
    public final float teal;
    public final int white;
    public final int yellow;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1899e(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, L6.a.indigo);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.red = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.purple = m.charlie(context2, attributeSet, 0, 0).alpha();
        }
        this.silver = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC2719n0.alpha(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(z.hotel(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.teal = obtainStyledAttributes.getFloat(1, 1.0f);
        this.white = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.yellow = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            int golf = AbstractC2815x7.golf(getBackgroundOverlayColorAlpha(), AbstractC2815x7.charlie(R.attr.colorSurface, this), AbstractC2815x7.charlie(R.attr.colorOnSurface, this));
            m mVar = this.purple;
            if (mVar != null) {
                P1.a aVar = AbstractC1900f.uniform;
                g7.i iVar = new g7.i(mVar);
                iVar.quebec(ColorStateList.valueOf(golf));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                P1.a aVar2 = AbstractC1900f.uniform;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(golf);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f12763a;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public static /* synthetic */ void alpha(AbstractC1899e abstractC1899e, AbstractC1900f abstractC1900f) {
        abstractC1899e.setBaseTransientBottomBar(abstractC1900f);
    }

    public void setBaseTransientBottomBar(AbstractC1900f abstractC1900f) {
        this.alpha = abstractC1900f;
    }

    public float getActionTextColorAlpha() {
        return this.teal;
    }

    public int getAnimationMode() {
        return this.red;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.silver;
    }

    public int getMaxInlineActionWidth() {
        return this.yellow;
    }

    public int getMaxWidth() {
        return this.white;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i4;
        super.onAttachedToWindow();
        AbstractC1900f abstractC1900f = this.alpha;
        if (abstractC1900f != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = abstractC1900f.india.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i4 = mandatorySystemGestureInsets.bottom;
            abstractC1900f.papa = i4;
            abstractC1900f.foxtrot();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1900f abstractC1900f = this.alpha;
        if (abstractC1900f != null && abstractC1900f.bravo()) {
            AbstractC1900f.xray.post(new RunnableC1897c(abstractC1900f, 1));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        AbstractC1900f abstractC1900f = this.alpha;
        if (abstractC1900f != null && abstractC1900f.romeo) {
            abstractC1900f.echo();
            abstractC1900f.romeo = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i10 = this.white;
        if (i10 > 0 && getMeasuredWidth() > i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i5);
        }
    }

    public void setAnimationMode(int i4) {
        this.red = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f12763a != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f12763a);
            drawable.setTintMode(this.f12764b);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f12763a = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f12764b);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f12764b = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f12766d && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f12765c = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            AbstractC1900f abstractC1900f = this.alpha;
            if (abstractC1900f != null) {
                P1.a aVar = AbstractC1900f.uniform;
                abstractC1900f.foxtrot();
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        i iVar;
        if (onClickListener != null) {
            iVar = null;
        } else {
            iVar = e;
        }
        setOnTouchListener(iVar);
        super.setOnClickListener(onClickListener);
    }
}
