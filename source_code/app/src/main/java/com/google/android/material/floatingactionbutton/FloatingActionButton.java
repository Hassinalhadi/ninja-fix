package com.google.android.material.floatingactionbutton;

import Fe.d;
import M6.e;
import W6.a;
import X6.h;
import X6.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.C0488x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import androidx.coordinatorlayout.widget.c;
import androidx.coordinatorlayout.widget.f;
import bv.aw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ad;
import com.google.android.material.internal.z;
import com.google.android.material.stateful.ExtendableSavedState;
import delivery.samurai.android.R;
import e7.AbstractC1632a;
import g7.j;
import g7.m;
import g7.x;
import java.util.List;
import java.util.WeakHashMap;
import l7.AbstractC2059a;
import s1.au;
import s6.AbstractC2719n0;
import s6.R4;

/* loaded from: classes2.dex */
public class FloatingActionButton extends ad implements a, x, b {

    /* renamed from: a, reason: collision with root package name */
    public int f8023a;

    /* renamed from: b, reason: collision with root package name */
    public int f8024b;

    /* renamed from: c, reason: collision with root package name */
    public int f8025c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8026d;
    public final Rect e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f8027f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.ad f8028g;

    /* renamed from: h, reason: collision with root package name */
    public final d f8029h;

    /* renamed from: i, reason: collision with root package name */
    public i f8030i;
    public ColorStateList purple;
    public PorterDuff.Mode red;
    public ColorStateList silver;
    public PorterDuff.Mode teal;
    public ColorStateList white;
    public int yellow;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [X6.h, g7.i] */
    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.floatingActionButtonStyle, 2132083659), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.alpha = getVisibility();
        this.e = new Rect();
        this.f8027f = new Rect();
        Context context2 = getContext();
        TypedArray golf = z.golf(context2, attributeSet, L6.a.november, R.attr.floatingActionButtonStyle, 2132083659, new int[0]);
        this.purple = AbstractC2719n0.alpha(context2, golf, 1);
        this.red = z.hotel(golf.getInt(2, -1), null);
        this.white = AbstractC2719n0.alpha(context2, golf, 12);
        this.yellow = golf.getInt(7, -1);
        this.f8023a = golf.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = golf.getDimensionPixelSize(3, 0);
        float dimension = golf.getDimension(4, 0.0f);
        float dimension2 = golf.getDimension(9, 0.0f);
        float dimension3 = golf.getDimension(11, 0.0f);
        this.f8026d = golf.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(golf.getDimensionPixelSize(10, 0));
        e alpha = e.alpha(context2, golf, 15);
        e alpha2 = e.alpha(context2, golf, 8);
        j jVar = m.mike;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, L6.a.beige, R.attr.floatingActionButtonStyle, 2132083659);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        m alpha3 = m.bravo(context2, resourceId, resourceId2, jVar).alpha();
        boolean z2 = golf.getBoolean(5, false);
        setEnabled(golf.getBoolean(0, true));
        golf.recycle();
        androidx.appcompat.widget.ad adVar = new androidx.appcompat.widget.ad(this);
        this.f8028g = adVar;
        adVar.bravo(attributeSet, R.attr.floatingActionButtonStyle);
        this.f8029h = new d(this);
        getImpl().golf(alpha3);
        i impl = getImpl();
        ColorStateList colorStateList2 = this.purple;
        PorterDuff.Mode mode = this.red;
        ColorStateList colorStateList3 = this.white;
        m mVar = impl.alpha;
        mVar.getClass();
        ?? iVar = new g7.i(mVar);
        impl.bravo = iVar;
        iVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.bravo.setTintMode(mode);
        }
        h hVar = impl.bravo;
        FloatingActionButton floatingActionButton = impl.sierra;
        hVar.mike(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            m mVar2 = impl.alpha;
            mVar2.getClass();
            X6.a aVar = new X6.a(mVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            colorStateList = colorStateList3;
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            aVar.india = color;
            aVar.juliet = color2;
            aVar.kilo = color3;
            aVar.lima = color4;
            float f5 = dimensionPixelSize;
            if (aVar.hotel != f5) {
                aVar.hotel = f5;
                aVar.bravo.setStrokeWidth(f5 * 1.3333f);
                aVar.november = true;
                aVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                aVar.mike = colorStateList2.getColorForState(aVar.getState(), aVar.mike);
            }
            aVar.papa = colorStateList2;
            aVar.november = true;
            aVar.invalidateSelf();
            impl.delta = aVar;
            X6.a aVar2 = impl.delta;
            aVar2.getClass();
            h hVar2 = impl.bravo;
            hVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{aVar2, hVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.delta = null;
            drawable2 = impl.bravo;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1632a.bravo(colorStateList), drawable2, drawable);
        impl.charlie = rippleDrawable;
        impl.echo = rippleDrawable;
        getImpl().kilo = dimensionPixelSize2;
        i impl2 = getImpl();
        if (impl2.hotel != dimension) {
            impl2.hotel = dimension;
            impl2.echo(dimension, impl2.india, impl2.juliet);
        }
        i impl3 = getImpl();
        if (impl3.india != dimension2) {
            impl3.india = dimension2;
            impl3.echo(impl3.hotel, dimension2, impl3.juliet);
        }
        i impl4 = getImpl();
        if (impl4.juliet != dimension3) {
            impl4.juliet = dimension3;
            impl4.echo(impl4.hotel, impl4.india, dimension3);
        }
        getImpl().november = alpha;
        getImpl().oscar = alpha2;
        getImpl().foxtrot = z2;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private i getImpl() {
        if (this.f8030i == null) {
            this.f8030i = new i(this, new O7.j(15, this));
        }
        return this.f8030i;
    }

    public final int charlie(int i4) {
        int i5 = this.f8023a;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        if (i4 != -1) {
            if (i4 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return charlie(1);
        }
        return charlie(0);
    }

    public final void delta(boolean z2) {
        int i4;
        AnimatorSet charlie;
        i impl = getImpl();
        FloatingActionButton floatingActionButton = impl.sierra;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.romeo == 1) {
                return;
            }
        } else if (impl.romeo != 2) {
            return;
        }
        Animator animator = impl.mike;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.sierra;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            e eVar = impl.oscar;
            if (eVar != null) {
                charlie = impl.bravo(eVar, 0.0f, 0.0f, 0.0f);
            } else {
                charlie = impl.charlie(0.0f, 0.4f, 0.4f, i.azure, i.beige);
            }
            charlie.addListener(new X6.d(impl, z2));
            charlie.start();
            return;
        }
        if (z2) {
            i4 = 8;
        } else {
            i4 = 4;
        }
        floatingActionButton.alpha(i4, z2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void echo() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.silver;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.teal;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0488x.charlie(colorForState, mode));
    }

    public final void foxtrot(boolean z2) {
        boolean z10;
        AnimatorSet charlie;
        float f5;
        float f10;
        i impl = getImpl();
        boolean z11 = true;
        if (impl.sierra.getVisibility() != 0) {
            if (impl.romeo == 2) {
                return;
            }
        } else if (impl.romeo != 1) {
            return;
        }
        Animator animator = impl.mike;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.november == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        FloatingActionButton floatingActionButton = impl.sierra;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            z11 = false;
        }
        Matrix matrix = impl.xray;
        if (z11) {
            if (floatingActionButton.getVisibility() != 0) {
                float f11 = 0.0f;
                floatingActionButton.setAlpha(0.0f);
                if (z10) {
                    f5 = 0.4f;
                } else {
                    f5 = 0.0f;
                }
                floatingActionButton.setScaleY(f5);
                if (z10) {
                    f10 = 0.4f;
                } else {
                    f10 = 0.0f;
                }
                floatingActionButton.setScaleX(f10);
                if (z10) {
                    f11 = 0.4f;
                }
                impl.papa = f11;
                impl.alpha(f11, matrix);
                floatingActionButton.setImageMatrix(matrix);
            }
            e eVar = impl.november;
            if (eVar != null) {
                charlie = impl.bravo(eVar, 1.0f, 1.0f, 1.0f);
            } else {
                charlie = impl.charlie(1.0f, 1.0f, 1.0f, i.zulu, i.amber);
            }
            charlie.addListener(new X6.e(impl, z2));
            charlie.start();
            return;
        }
        floatingActionButton.alpha(0, z2);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        impl.papa = 1.0f;
        impl.alpha(1.0f, matrix);
        floatingActionButton.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.purple;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.red;
    }

    @Override // androidx.coordinatorlayout.widget.b
    public c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().sierra.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().india;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().juliet;
    }

    public Drawable getContentBackground() {
        return getImpl().echo;
    }

    public int getCustomSize() {
        return this.f8023a;
    }

    public int getExpandedComponentIdHint() {
        return this.f8029h.bravo;
    }

    public e getHideMotionSpec() {
        return getImpl().oscar;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.white;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.white;
    }

    public m getShapeAppearanceModel() {
        m mVar = getImpl().alpha;
        mVar.getClass();
        return mVar;
    }

    public e getShowMotionSpec() {
        return getImpl().november;
    }

    public int getSize() {
        return this.yellow;
    }

    public int getSizeDimension() {
        return charlie(this.yellow);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.silver;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.teal;
    }

    public boolean getUseCompatPadding() {
        return this.f8026d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i impl = getImpl();
        h hVar = impl.bravo;
        if (hVar != null) {
            R4.delta(impl.sierra, hVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().sierra.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int sizeDimension = getSizeDimension();
        this.f8024b = (sizeDimension - this.f8025c) / 2;
        getImpl().hotel();
        int min = Math.min(View.resolveSize(sizeDimension, i4), View.resolveSize(sizeDimension, i5));
        Rect rect = this.e;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.alpha);
        Bundle bundle = (Bundle) extendableSavedState.red.get("expandableWidgetHelper");
        bundle.getClass();
        d dVar = this.f8029h;
        dVar.getClass();
        dVar.alpha = bundle.getBoolean("expanded", false);
        dVar.bravo = bundle.getInt("expandedComponentIdHint", 0);
        if (dVar.alpha) {
            View view = (View) dVar.charlie;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        aw awVar = extendableSavedState.red;
        d dVar = this.f8029h;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", dVar.alpha);
        bundle.putInt("expandedComponentIdHint", dVar.bravo);
        awVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i4;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f8027f;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i5 = rect.left;
            Rect rect2 = this.e;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            i iVar = this.f8030i;
            if (iVar.foxtrot) {
                i4 = Math.max((iVar.kilo - iVar.sierra.getSizeDimension()) / 2, 0);
            } else {
                i4 = 0;
            }
            int i10 = -i4;
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.purple != colorStateList) {
            this.purple = colorStateList;
            i impl = getImpl();
            h hVar = impl.bravo;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            X6.a aVar = impl.delta;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.mike = colorStateList.getColorForState(aVar.getState(), aVar.mike);
                }
                aVar.papa = colorStateList;
                aVar.november = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.red != mode) {
            this.red = mode;
            h hVar = getImpl().bravo;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f5) {
        i impl = getImpl();
        if (impl.hotel != f5) {
            impl.hotel = f5;
            impl.echo(f5, impl.india, impl.juliet);
        }
    }

    public void setCompatElevationResource(int i4) {
        setCompatElevation(getResources().getDimension(i4));
    }

    public void setCompatHoveredFocusedTranslationZ(float f5) {
        i impl = getImpl();
        if (impl.india != f5) {
            impl.india = f5;
            impl.echo(impl.hotel, f5, impl.juliet);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i4) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i4));
    }

    public void setCompatPressedTranslationZ(float f5) {
        i impl = getImpl();
        if (impl.juliet != f5) {
            impl.juliet = f5;
            impl.echo(impl.hotel, impl.india, f5);
        }
    }

    public void setCompatPressedTranslationZResource(int i4) {
        setCompatPressedTranslationZ(getResources().getDimension(i4));
    }

    public void setCustomSize(int i4) {
        if (i4 >= 0) {
            if (i4 != this.f8023a) {
                this.f8023a = i4;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        h hVar = getImpl().bravo;
        if (hVar != null) {
            hVar.papa(f5);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().foxtrot) {
            getImpl().foxtrot = z2;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i4) {
        this.f8029h.bravo = i4;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().oscar = eVar;
    }

    public void setHideMotionSpecResource(int i4) {
        setHideMotionSpec(e.bravo(i4, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i impl = getImpl();
            float f5 = impl.papa;
            impl.papa = f5;
            Matrix matrix = impl.xray;
            impl.alpha(f5, matrix);
            impl.sierra.setImageMatrix(matrix);
            if (this.silver != null) {
                echo();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f8028g.charlie(i4);
        echo();
    }

    public void setMaxImageSize(int i4) {
        this.f8025c = i4;
        i impl = getImpl();
        if (impl.quebec != i4) {
            impl.quebec = i4;
            float f5 = impl.papa;
            impl.papa = f5;
            Matrix matrix = impl.xray;
            impl.alpha(f5, matrix);
            impl.sierra.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i4) {
        setRippleColor(ColorStateList.valueOf(i4));
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        super.setScaleX(f5);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        super.setScaleY(f5);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z2) {
        i impl = getImpl();
        impl.golf = z2;
        impl.hotel();
    }

    @Override // g7.x
    public void setShapeAppearanceModel(m mVar) {
        getImpl().golf(mVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().november = eVar;
    }

    public void setShowMotionSpecResource(int i4) {
        setShowMotionSpec(e.bravo(i4, getContext()));
    }

    public void setSize(int i4) {
        this.f8023a = 0;
        if (i4 != this.yellow) {
            this.yellow = i4;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.silver != colorStateList) {
            this.silver = colorStateList;
            echo();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.teal != mode) {
            this.teal = mode;
            echo();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        super.setTranslationX(f5);
        getImpl().foxtrot();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        super.setTranslationY(f5);
        getImpl().foxtrot();
    }

    @Override // android.view.View
    public void setTranslationZ(float f5) {
        super.setTranslationZ(f5);
        getImpl().foxtrot();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f8026d != z2) {
            this.f8026d = z2;
            getImpl().hotel();
        }
    }

    @Override // com.google.android.material.internal.ad, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends c {
        public Rect alpha;
        public final boolean purple;

        public BaseBehavior() {
            this.purple = true;
        }

        public final boolean echo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            boolean z2;
            f fVar = (f) floatingActionButton.getLayoutParams();
            if (!this.purple || fVar.foxtrot != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            if (this.alpha == null) {
                this.alpha = new Rect();
            }
            Rect rect = this.alpha;
            com.google.android.material.internal.c.alpha(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.delta(false);
            } else {
                floatingActionButton.foxtrot(false);
            }
            return true;
        }

        public final boolean foxtrot(View view, FloatingActionButton floatingActionButton) {
            boolean z2;
            f fVar = (f) floatingActionButton.getLayoutParams();
            if (!this.purple || fVar.foxtrot != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.delta(false);
            } else {
                floatingActionButton.foxtrot(false);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.e;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final void onAttachedToLayoutParams(f fVar) {
            if (fVar.hotel == 0) {
                fVar.hotel = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                echo(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof f) {
                    z2 = ((f) layoutParams).alpha instanceof BottomSheetBehavior;
                } else {
                    z2 = false;
                }
                if (z2) {
                    foxtrot(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
            int i5;
            boolean z2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = dependencies.get(i11);
                if (view2 instanceof AppBarLayout) {
                    if (echo(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof f) {
                        z2 = ((f) layoutParams).alpha instanceof BottomSheetBehavior;
                    } else {
                        z2 = false;
                    }
                    if (z2 && foxtrot(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i4);
            Rect rect = floatingActionButton.e;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                f fVar = (f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i5 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i5 = -rect.left;
                } else {
                    i5 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    WeakHashMap weakHashMap = au.alpha;
                    floatingActionButton.offsetTopAndBottom(i10);
                }
                if (i5 != 0) {
                    WeakHashMap weakHashMap2 = au.alpha;
                    floatingActionButton.offsetLeftAndRight(i5);
                }
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.oscar);
            this.purple = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.white != colorStateList) {
            this.white = colorStateList;
            i impl = getImpl();
            ColorStateList colorStateList2 = this.white;
            RippleDrawable rippleDrawable = impl.charlie;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(AbstractC1632a.bravo(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(AbstractC1632a.bravo(colorStateList2));
            }
        }
    }
}
