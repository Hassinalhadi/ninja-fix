package com.google.android.material.card;

import L6.a;
import P6.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.z;
import g1.AbstractC1735d;
import g7.g;
import g7.i;
import g7.l;
import g7.m;
import g7.x;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;
import s6.R4;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, x {
    public static final int[] e = {R.attr.state_checkable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f7936f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7937g = {delivery.samurai.android.R.attr.state_dragged};

    /* renamed from: a, reason: collision with root package name */
    public final d f7938a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7939b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7941d;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, delivery.samurai.android.R.attr.materialCardViewStyle, 2132083899), attributeSet, delivery.samurai.android.R.attr.materialCardViewStyle);
        this.f7940c = false;
        this.f7941d = false;
        this.f7939b = true;
        TypedArray golf = z.golf(getContext(), attributeSet, a.yankee, delivery.samurai.android.R.attr.materialCardViewStyle, 2132083899, new int[0]);
        d dVar = new d(this, attributeSet);
        this.f7938a = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        i iVar = dVar.charlie;
        iVar.quebec(cardBackgroundColor);
        dVar.bravo.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.lima();
        MaterialCardView materialCardView = dVar.alpha;
        ColorStateList alpha = AbstractC2719n0.alpha(materialCardView.getContext(), golf, 11);
        dVar.november = alpha;
        if (alpha == null) {
            dVar.november = ColorStateList.valueOf(-1);
        }
        dVar.hotel = golf.getDimensionPixelSize(12, 0);
        boolean z2 = golf.getBoolean(0, false);
        dVar.sierra = z2;
        materialCardView.setLongClickable(z2);
        dVar.lima = AbstractC2719n0.alpha(materialCardView.getContext(), golf, 6);
        dVar.golf(AbstractC2719n0.delta(materialCardView.getContext(), golf, 2));
        dVar.foxtrot = golf.getDimensionPixelSize(5, 0);
        dVar.echo = golf.getDimensionPixelSize(4, 0);
        dVar.golf = golf.getInteger(3, 8388661);
        ColorStateList alpha2 = AbstractC2719n0.alpha(materialCardView.getContext(), golf, 7);
        dVar.kilo = alpha2;
        if (alpha2 == null) {
            dVar.kilo = ColorStateList.valueOf(AbstractC2815x7.charlie(delivery.samurai.android.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList alpha3 = AbstractC2719n0.alpha(materialCardView.getContext(), golf, 1);
        i iVar2 = dVar.delta;
        iVar2.quebec(alpha3 == null ? ColorStateList.valueOf(0) : alpha3);
        RippleDrawable rippleDrawable = dVar.oscar;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.kilo);
        }
        iVar.papa(materialCardView.getCardElevation());
        float f5 = dVar.hotel;
        ColorStateList colorStateList = dVar.november;
        iVar2.purple.kilo = f5;
        iVar2.invalidateSelf();
        g gVar = iVar2.purple;
        if (gVar.echo != colorStateList) {
            gVar.echo = colorStateList;
            iVar2.onStateChange(iVar2.getState());
        }
        materialCardView.setBackgroundInternal(dVar.delta(iVar));
        Drawable charlie = dVar.juliet() ? dVar.charlie() : iVar2;
        dVar.india = charlie;
        materialCardView.setForeground(dVar.delta(charlie));
        golf.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f7938a.charlie.getBounds());
        return rectF;
    }

    public final void bravo() {
        d dVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (dVar = this.f7938a).oscar) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i4 = bounds.bottom;
            dVar.oscar.setBounds(bounds.left, bounds.top, bounds.right, i4 - 1);
            dVar.oscar.setBounds(bounds.left, bounds.top, bounds.right, i4);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f7938a.charlie.purple.delta;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f7938a.delta.purple.delta;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7938a.juliet;
    }

    public int getCheckedIconGravity() {
        return this.f7938a.golf;
    }

    public int getCheckedIconMargin() {
        return this.f7938a.echo;
    }

    public int getCheckedIconSize() {
        return this.f7938a.foxtrot;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7938a.lima;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f7938a.bravo.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f7938a.bravo.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f7938a.bravo.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f7938a.bravo.top;
    }

    public float getProgress() {
        return this.f7938a.charlie.purple.juliet;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f7938a.charlie.kilo();
    }

    public ColorStateList getRippleColor() {
        return this.f7938a.kilo;
    }

    public m getShapeAppearanceModel() {
        return this.f7938a.mike;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f7938a.november;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7938a.november;
    }

    public int getStrokeWidth() {
        return this.f7938a.hotel;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7940c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f7938a;
        dVar.kilo();
        R4.delta(this, dVar.charlie);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 3);
        d dVar = this.f7938a;
        if (dVar != null && dVar.sierra) {
            View.mergeDrawableStates(onCreateDrawableState, e);
        }
        if (this.f7940c) {
            View.mergeDrawableStates(onCreateDrawableState, f7936f);
        }
        if (this.f7941d) {
            View.mergeDrawableStates(onCreateDrawableState, f7937g);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f7940c);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        d dVar = this.f7938a;
        if (dVar != null && dVar.sierra) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f7940c);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f7938a.echo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f7939b) {
            d dVar = this.f7938a;
            if (!dVar.romeo) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.romeo = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7938a.charlie.quebec(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        d dVar = this.f7938a;
        dVar.charlie.papa(dVar.alpha.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        i iVar = this.f7938a.delta;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.quebec(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.f7938a.sierra = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f7940c != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7938a.golf(drawable);
    }

    public void setCheckedIconGravity(int i4) {
        d dVar = this.f7938a;
        if (dVar.golf != i4) {
            dVar.golf = i4;
            MaterialCardView materialCardView = dVar.alpha;
            dVar.echo(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i4) {
        this.f7938a.echo = i4;
    }

    public void setCheckedIconMarginResource(int i4) {
        if (i4 != -1) {
            this.f7938a.echo = getResources().getDimensionPixelSize(i4);
        }
    }

    public void setCheckedIconResource(int i4) {
        this.f7938a.golf(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setCheckedIconSize(int i4) {
        this.f7938a.foxtrot = i4;
    }

    public void setCheckedIconSizeResource(int i4) {
        if (i4 != 0) {
            this.f7938a.foxtrot = getResources().getDimensionPixelSize(i4);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f7938a;
        dVar.lima = colorStateList;
        Drawable drawable = dVar.juliet;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        d dVar = this.f7938a;
        if (dVar != null) {
            dVar.kilo();
        }
    }

    public void setDragged(boolean z2) {
        if (this.f7941d != z2) {
            this.f7941d = z2;
            refreshDrawableState();
            bravo();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        this.f7938a.mike();
    }

    public void setOnCheckedChangeListener(P6.a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        d dVar = this.f7938a;
        dVar.mike();
        dVar.lima();
    }

    public void setProgress(float f5) {
        d dVar = this.f7938a;
        dVar.charlie.romeo(f5);
        i iVar = dVar.delta;
        if (iVar != null) {
            iVar.romeo(f5);
        }
        i iVar2 = dVar.quebec;
        if (iVar2 != null) {
            iVar2.romeo(f5);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f5) {
        super.setRadius(f5);
        d dVar = this.f7938a;
        l golf = dVar.mike.golf();
        golf.charlie(f5);
        dVar.hotel(golf.alpha());
        dVar.india.invalidateSelf();
        if (dVar.india() || (dVar.alpha.getPreventCornerOverlap() && !dVar.charlie.november())) {
            dVar.lima();
        }
        if (dVar.india()) {
            dVar.mike();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f7938a;
        dVar.kilo = colorStateList;
        RippleDrawable rippleDrawable = dVar.oscar;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i4) {
        ColorStateList charlie = AbstractC1735d.charlie(i4, getContext());
        d dVar = this.f7938a;
        dVar.kilo = charlie;
        RippleDrawable rippleDrawable = dVar.oscar;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(charlie);
        }
    }

    @Override // g7.x
    public void setShapeAppearanceModel(m mVar) {
        setClipToOutline(mVar.foxtrot(getBoundsAsRectF()));
        this.f7938a.hotel(mVar);
    }

    public void setStrokeColor(int i4) {
        setStrokeColor(ColorStateList.valueOf(i4));
    }

    public void setStrokeWidth(int i4) {
        d dVar = this.f7938a;
        if (i4 != dVar.hotel) {
            dVar.hotel = i4;
            i iVar = dVar.delta;
            ColorStateList colorStateList = dVar.november;
            iVar.purple.kilo = i4;
            iVar.invalidateSelf();
            g gVar = iVar.purple;
            if (gVar.echo != colorStateList) {
                gVar.echo = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        d dVar = this.f7938a;
        dVar.mike();
        dVar.lima();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d dVar = this.f7938a;
        if (dVar != null && dVar.sierra && isEnabled()) {
            this.f7940c = !this.f7940c;
            refreshDrawableState();
            bravo();
            dVar.foxtrot(this.f7940c, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f7938a;
        if (dVar.november != colorStateList) {
            dVar.november = colorStateList;
            i iVar = dVar.delta;
            iVar.purple.kilo = dVar.hotel;
            iVar.invalidateSelf();
            g gVar = iVar.purple;
            if (gVar.echo != colorStateList) {
                gVar.echo = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i4) {
        this.f7938a.charlie.quebec(ColorStateList.valueOf(i4));
    }
}
