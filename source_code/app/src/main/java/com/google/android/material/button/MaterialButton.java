package com.google.android.material.button;

import J1.f;
import J1.g;
import a4.u;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0482u;
import androidx.camera.core.impl.ai;
import androidx.customview.view.AbsSavedState;
import av.ah;
import b7.n;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import e7.AbstractC1632a;
import g1.AbstractC1735d;
import g7.ad;
import g7.ae;
import g7.af;
import g7.i;
import g7.l;
import g7.m;
import g7.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l7.AbstractC2059a;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import s6.R4;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public class MaterialButton extends C0482u implements Checkable, x {

    /* renamed from: a */
    public ColorStateList f7904a;

    /* renamed from: b */
    public Drawable f7905b;

    /* renamed from: c */
    public String f7906c;

    /* renamed from: d */
    public int f7907d;
    public int e;

    /* renamed from: f */
    public int f7908f;

    /* renamed from: g */
    public int f7909g;

    /* renamed from: h */
    public boolean f7910h;

    /* renamed from: i */
    public boolean f7911i;

    /* renamed from: j */
    public int f7912j;

    /* renamed from: k */
    public int f7913k;

    /* renamed from: l */
    public float f7914l;

    /* renamed from: m */
    public int f7915m;

    /* renamed from: n */
    public int f7916n;

    /* renamed from: o */
    public LinearLayout.LayoutParams f7917o;

    /* renamed from: p */
    public boolean f7918p;

    /* renamed from: q */
    public int f7919q;

    /* renamed from: r */
    public boolean f7920r;

    /* renamed from: s */
    public int f7921s;
    public final d silver;

    /* renamed from: t */
    public af f7922t;
    public final LinkedHashSet teal;

    /* renamed from: u */
    public int f7923u;

    /* renamed from: v */
    public float f7924v;

    /* renamed from: w */
    public float f7925w;
    public a white;

    /* renamed from: x */
    public f f7926x;
    public PorterDuff.Mode yellow;

    /* renamed from: y */
    public static final int[] f7902y = {R.attr.state_checkable};

    /* renamed from: z */
    public static final int[] f7903z = {R.attr.state_checked};
    public static final n A = new n(1);

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public boolean red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.red = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.bravo(context, attributeSet, delivery.samurai.android.R.attr.materialButtonStyle, 2132083887, new int[]{delivery.samurai.android.R.attr.materialSizeOverlay}), attributeSet, delivery.samurai.android.R.attr.materialButtonStyle);
        m alpha;
        this.teal = new LinkedHashSet();
        this.f7910h = false;
        this.f7911i = false;
        this.f7913k = -1;
        this.f7914l = -1.0f;
        this.f7915m = -1;
        this.f7916n = -1;
        this.f7921s = -1;
        Context context2 = getContext();
        TypedArray golf = z.golf(context2, attributeSet, L6.a.tango, delivery.samurai.android.R.attr.materialButtonStyle, 2132083887, new int[0]);
        this.f7909g = golf.getDimensionPixelSize(13, 0);
        int i4 = golf.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.yellow = z.hotel(i4, mode);
        this.f7904a = AbstractC2719n0.alpha(getContext(), golf, 15);
        this.f7905b = AbstractC2719n0.delta(getContext(), golf, 11);
        this.f7912j = golf.getInteger(12, 1);
        this.f7907d = golf.getDimensionPixelSize(14, 0);
        ad bravo = ad.bravo(context2, golf, 19);
        if (bravo != null) {
            alpha = bravo.charlie();
        } else {
            alpha = m.charlie(context2, attributeSet, delivery.samurai.android.R.attr.materialButtonStyle, 2132083887).alpha();
        }
        boolean z2 = golf.getBoolean(17, false);
        d dVar = new d(this, alpha);
        this.silver = dVar;
        dVar.foxtrot = golf.getDimensionPixelOffset(2, 0);
        dVar.golf = golf.getDimensionPixelOffset(3, 0);
        dVar.hotel = golf.getDimensionPixelOffset(4, 0);
        dVar.india = golf.getDimensionPixelOffset(5, 0);
        if (golf.hasValue(9)) {
            int dimensionPixelSize = golf.getDimensionPixelSize(9, -1);
            dVar.juliet = dimensionPixelSize;
            l golf2 = dVar.bravo.golf();
            golf2.charlie(dimensionPixelSize);
            dVar.bravo = golf2.alpha();
            dVar.charlie = null;
            dVar.delta();
            dVar.sierra = true;
        }
        dVar.kilo = golf.getDimensionPixelSize(22, 0);
        dVar.lima = z.hotel(golf.getInt(8, -1), mode);
        dVar.mike = AbstractC2719n0.alpha(getContext(), golf, 7);
        dVar.november = AbstractC2719n0.alpha(getContext(), golf, 21);
        dVar.oscar = AbstractC2719n0.alpha(getContext(), golf, 18);
        dVar.tango = golf.getBoolean(6, false);
        dVar.whiskey = golf.getDimensionPixelSize(10, 0);
        dVar.uniform = golf.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (golf.hasValue(0)) {
            dVar.romeo = true;
            setSupportBackgroundTintList(dVar.mike);
            setSupportBackgroundTintMode(dVar.lima);
        } else {
            dVar.charlie();
        }
        setPaddingRelative(paddingStart + dVar.foxtrot, paddingTop + dVar.hotel, paddingEnd + dVar.golf, paddingBottom + dVar.india);
        setCheckedInternal(golf.getBoolean(1, false));
        if (bravo != null) {
            dVar.delta = delta();
            if (dVar.charlie != null) {
                dVar.delta();
            }
            dVar.charlie = bravo;
            dVar.delta();
        }
        setOpticalCenterEnabled(z2);
        golf.recycle();
        setCompoundDrawablePadding(this.f7909g);
        hotel(this.f7905b != null);
    }

    public static /* synthetic */ void alpha(MaterialButton materialButton) {
        materialButton.f7919q = materialButton.getOpticalCenterShift();
        materialButton.juliet();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.f7924v;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        i alpha;
        if (!this.f7918p || !this.f7920r || (alpha = this.silver.alpha(false)) == null) {
            return 0;
        }
        return (int) (alpha.india() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f5 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f5 = Math.max(f5, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(f5);
    }

    private void setCheckedInternal(boolean z2) {
        d dVar = this.silver;
        if (dVar != null && dVar.tango && this.f7910h != z2) {
            this.f7910h = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f7910h;
                if (!materialButtonToggleGroup.e) {
                    materialButtonToggleGroup.foxtrot(getId(), z10);
                }
            }
            if (!this.f7911i) {
                this.f7911i = true;
                Iterator it = this.teal.iterator();
                if (!it.hasNext()) {
                    this.f7911i = false;
                    return;
                }
                throw ao.ad.yankee(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f5) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f7924v != f5) {
            this.f7924v = f5;
            juliet();
            invalidate();
            if (getParent() instanceof c) {
                c cVar = (c) getParent();
                int i4 = (int) this.f7924v;
                int indexOfChild = cVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i5 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 >= 0) {
                            if (cVar.charlie(i5)) {
                                materialButton2 = (MaterialButton) cVar.getChildAt(i5);
                                break;
                            }
                            i5--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = cVar.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild >= childCount) {
                            break;
                        } else if (cVar.charlie(indexOfChild)) {
                            materialButton = (MaterialButton) cVar.getChildAt(indexOfChild);
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i4);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i4);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i4 / 2);
                            materialButton.setDisplayedWidthDecrease((i4 + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final g delta() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue bravo = AbstractC2710m0.bravo(delivery.samurai.android.R.attr.motionSpringFastSpatial, context);
        int[] iArr = L6.a.black;
        if (bravo == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, delivery.samurai.android.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(bravo.resourceId, iArr);
        }
        g gVar = new g();
        try {
            float f5 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f5 != Float.MIN_VALUE) {
                float f10 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE) {
                    gVar.bravo(f5);
                    gVar.alpha(f10);
                    return gVar;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean echo() {
        d dVar = this.silver;
        if (dVar != null && !dVar.romeo) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot(boolean z2) {
        int i4;
        s sVar;
        if (this.f7922t != null) {
            if (this.f7926x == null) {
                f fVar = new f(this, A);
                this.f7926x = fVar;
                fVar.mike = delta();
            }
            if (this.f7920r) {
                int i5 = this.f7923u;
                af afVar = this.f7922t;
                int[] drawableState = getDrawableState();
                int[][] iArr = afVar.charlie;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i4 = -1;
                    if (i11 < afVar.alpha) {
                        if (StateSet.stateSetMatches(iArr[i11], drawableState)) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    int[] iArr2 = StateSet.WILD_CARD;
                    int[][] iArr3 = afVar.charlie;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= afVar.alpha) {
                            break;
                        }
                        if (StateSet.stateSetMatches(iArr3[i12], iArr2)) {
                            i4 = i12;
                            break;
                        }
                        i12++;
                    }
                    i11 = i4;
                }
                if (i11 < 0) {
                    sVar = afVar.bravo;
                } else {
                    sVar = afVar.delta[i11];
                }
                ae aeVar = (ae) sVar.purple;
                int width = getWidth();
                float f5 = aeVar.bravo;
                int i13 = aeVar.alpha;
                if (i13 == 1) {
                    f5 *= width;
                }
                i10 = (int) f5;
                this.f7926x.alpha(Math.min(i5, i10));
                if (z2) {
                    this.f7926x.delta();
                }
            }
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f7906c)) {
            return this.f7906c;
        }
        d dVar = this.silver;
        if (dVar != null && dVar.tango) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f7921s;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (echo()) {
            return this.silver.juliet;
        }
        return 0;
    }

    public g getCornerSpringForce() {
        return this.silver.delta;
    }

    public Drawable getIcon() {
        return this.f7905b;
    }

    public int getIconGravity() {
        return this.f7912j;
    }

    public int getIconPadding() {
        return this.f7909g;
    }

    public int getIconSize() {
        return this.f7907d;
    }

    public ColorStateList getIconTint() {
        return this.f7904a;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.yellow;
    }

    public int getInsetBottom() {
        return this.silver.india;
    }

    public int getInsetTop() {
        return this.silver.hotel;
    }

    public ColorStateList getRippleColor() {
        if (echo()) {
            return this.silver.oscar;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (echo()) {
            return this.silver.bravo;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ad getStateListShapeAppearanceModel() {
        if (echo()) {
            return this.silver.charlie;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (echo()) {
            return this.silver.november;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (echo()) {
            return this.silver.kilo;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0482u
    public ColorStateList getSupportBackgroundTintList() {
        if (echo()) {
            return this.silver.mike;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0482u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (echo()) {
            return this.silver.lima;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void golf() {
        int i4 = this.f7912j;
        boolean z2 = true;
        if (i4 != 1 && i4 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f7905b, null, null, null);
            return;
        }
        if (i4 != 3 && i4 != 4) {
            if (i4 != 16 && i4 != 32) {
                return;
            }
            setCompoundDrawablesRelative(null, this.f7905b, null, null);
            return;
        }
        setCompoundDrawablesRelative(null, null, this.f7905b, null);
    }

    public final void hotel(boolean z2) {
        Drawable drawable = this.f7905b;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f7905b = mutate;
            mutate.setTintList(this.f7904a);
            PorterDuff.Mode mode = this.yellow;
            if (mode != null) {
                this.f7905b.setTintMode(mode);
            }
            int i4 = this.f7907d;
            if (i4 == 0) {
                i4 = this.f7905b.getIntrinsicWidth();
            }
            int i5 = this.f7907d;
            if (i5 == 0) {
                i5 = this.f7905b.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7905b;
            int i10 = this.e;
            int i11 = this.f7908f;
            drawable2.setBounds(i10, i11, i4 + i10, i5 + i11);
            this.f7905b.setVisible(true, z2);
        }
        if (z2) {
            golf();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f7912j;
        if (((i12 != 1 && i12 != 2) || drawable3 == this.f7905b) && (((i12 != 3 && i12 != 4) || drawable5 == this.f7905b) && ((i12 != 16 && i12 != 32) || drawable4 == this.f7905b))) {
            return;
        }
        golf();
    }

    public final void india(int i4, int i5) {
        boolean z2;
        boolean z10;
        if (this.f7905b != null && getLayout() != null) {
            int i10 = this.f7912j;
            boolean z11 = true;
            if (i10 != 1 && i10 != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && i10 != 3 && i10 != 4) {
                if (i10 != 16 && i10 != 32) {
                    return;
                }
                this.e = 0;
                if (i10 == 16) {
                    this.f7908f = 0;
                    hotel(false);
                    return;
                }
                int i11 = this.f7907d;
                if (i11 == 0) {
                    i11 = this.f7905b.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - i11) - this.f7909g) - getPaddingBottom()) / 2);
                if (this.f7908f != max) {
                    this.f7908f = max;
                    hotel(false);
                    return;
                }
                return;
            }
            this.f7908f = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i12 = this.f7912j;
            if (i12 != 1 && i12 != 3 && ((i12 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i12 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i13 = this.f7907d;
                if (i13 == 0) {
                    i13 = this.f7905b.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i4 - getTextLayoutWidth()) - getPaddingEnd()) - i13) - this.f7909g) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f7912j != 4) {
                    z11 = false;
                }
                if (z10 != z11) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.e != textLayoutWidth) {
                    this.e = textLayoutWidth;
                    hotel(false);
                    return;
                }
                return;
            }
            this.e = 0;
            hotel(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7910h;
    }

    public final void juliet() {
        int i4 = (int) (this.f7924v - this.f7925w);
        int i5 = (i4 / 2) + this.f7919q;
        getLayoutParams().width = (int) (this.f7914l + i4);
        setPaddingRelative(this.f7915m + i5, getPaddingTop(), (this.f7916n + i4) - i5, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (echo()) {
            R4.delta(this, this.silver.alpha(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        d dVar = this.silver;
        if (dVar != null && dVar.tango) {
            View.mergeDrawableStates(onCreateDrawableState, f7902y);
        }
        if (this.f7910h) {
            View.mergeDrawableStates(onCreateDrawableState, f7903z);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0482u, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f7910h);
    }

    @Override // androidx.appcompat.widget.C0482u, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        d dVar = this.silver;
        if (dVar != null && dVar.tango) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setChecked(this.f7910h);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0482u, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int i12;
        super.onLayout(z2, i4, i5, i10, i11);
        india(getMeasuredWidth(), getMeasuredHeight());
        int i13 = getResources().getConfiguration().orientation;
        if (this.f7913k != i13) {
            this.f7913k = i13;
            this.f7914l = -1.0f;
        }
        if (this.f7914l == -1.0f) {
            this.f7914l = getMeasuredWidth();
            if (this.f7917o == null && (getParent() instanceof c) && ((c) getParent()).getButtonSizeChange() != null) {
                this.f7917o = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f7917o);
                layoutParams.width = (int) this.f7914l;
                setLayoutParams(layoutParams);
            }
        }
        boolean z10 = false;
        if (this.f7921s == -1) {
            if (this.f7905b == null) {
                i12 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i14 = this.f7907d;
                if (i14 == 0) {
                    i14 = this.f7905b.getIntrinsicWidth();
                }
                i12 = iconPadding + i14;
            }
            this.f7921s = (getMeasuredWidth() - getTextLayoutWidth()) - i12;
        }
        if (this.f7915m == -1) {
            this.f7915m = getPaddingStart();
        }
        if (this.f7916n == -1) {
            this.f7916n = getPaddingEnd();
        }
        if ((getParent() instanceof c) && ((c) getParent()).getOrientation() == 0) {
            z10 = true;
        }
        this.f7920r = z10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        setChecked(savedState.red);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.button.MaterialButton$SavedState] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.red = this.f7910h;
        return absSavedState;
    }

    @Override // androidx.appcompat.widget.C0482u, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        super.onTextChanged(charSequence, i4, i5, i10);
        india(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.silver.uniform) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7905b != null) {
            if (this.f7905b.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7906c = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.alpha(false) != null) {
                dVar.alpha(false).setTint(i4);
                return;
            }
            return;
        }
        super.setBackgroundColor(i4);
    }

    @Override // androidx.appcompat.widget.C0482u, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (echo()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                d dVar = this.silver;
                dVar.romeo = true;
                ColorStateList colorStateList = dVar.mike;
                MaterialButton materialButton = dVar.alpha;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(dVar.lima);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0482u, android.view.View
    public void setBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = AbstractC3032n3.echo(i4, getContext());
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (echo()) {
            this.silver.tango = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedInternal(z2);
    }

    public void setCornerRadius(int i4) {
        if (echo()) {
            d dVar = this.silver;
            if (!dVar.sierra || dVar.juliet != i4) {
                dVar.juliet = i4;
                dVar.sierra = true;
                l golf = dVar.bravo.golf();
                golf.charlie(i4);
                dVar.bravo = golf.alpha();
                dVar.charlie = null;
                dVar.delta();
            }
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (echo()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCornerSpringForce(g gVar) {
        d dVar = this.silver;
        dVar.delta = gVar;
        if (dVar.charlie != null) {
            dVar.delta();
        }
    }

    public void setDisplayedWidthDecrease(int i4) {
        this.f7925w = Math.min(i4, this.f7921s);
        juliet();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (echo()) {
            this.silver.alpha(false).papa(f5);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7905b != drawable) {
            this.f7905b = drawable;
            hotel(true);
            india(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f7912j != i4) {
            this.f7912j = i4;
            india(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f7909g != i4) {
            this.f7909g = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = AbstractC3032n3.echo(i4, getContext());
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i4) {
        if (i4 >= 0) {
            if (this.f7907d != i4) {
                this.f7907d = i4;
                hotel(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7904a != colorStateList) {
            this.f7904a = colorStateList;
            hotel(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.yellow != mode) {
            this.yellow = mode;
            hotel(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(AbstractC1735d.charlie(i4, getContext()));
    }

    public void setInsetBottom(int i4) {
        d dVar = this.silver;
        dVar.bravo(dVar.hotel, i4);
    }

    public void setInsetTop(int i4) {
        d dVar = this.silver;
        dVar.bravo(i4, dVar.india);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.white = aVar;
    }

    public void setOpticalCenterEnabled(boolean z2) {
        if (this.f7918p != z2) {
            this.f7918p = z2;
            d dVar = this.silver;
            if (z2) {
                u uVar = new u(16, this);
                dVar.echo = uVar;
                i alpha = dVar.alpha(false);
                if (alpha != null) {
                    alpha.f12672x = uVar;
                }
            } else {
                dVar.echo = null;
                i alpha2 = dVar.alpha(false);
                if (alpha2 != null) {
                    alpha2.f12672x = null;
                }
            }
            post(new ai(21, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.white;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((ah) aVar).purple).invalidate();
        }
        super.setPressed(z2);
        foxtrot(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.oscar != colorStateList) {
                dVar.oscar = colorStateList;
                MaterialButton materialButton = dVar.alpha;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1632a.bravo(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (echo()) {
            setRippleColor(AbstractC1735d.charlie(i4, getContext()));
        }
    }

    @Override // g7.x
    public void setShapeAppearanceModel(m mVar) {
        if (echo()) {
            d dVar = this.silver;
            dVar.bravo = mVar;
            dVar.charlie = null;
            dVar.delta();
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (echo()) {
            d dVar = this.silver;
            dVar.quebec = z2;
            dVar.echo();
        }
    }

    public void setSizeChange(af afVar) {
        if (this.f7922t != afVar) {
            this.f7922t = afVar;
            foxtrot(true);
        }
    }

    public void setStateListShapeAppearanceModel(ad adVar) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.delta == null && adVar.delta()) {
                dVar.delta = delta();
                if (dVar.charlie != null) {
                    dVar.delta();
                }
            }
            dVar.charlie = adVar;
            dVar.delta();
            return;
        }
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.november != colorStateList) {
                dVar.november = colorStateList;
                dVar.echo();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (echo()) {
            setStrokeColor(AbstractC1735d.charlie(i4, getContext()));
        }
    }

    public void setStrokeWidth(int i4) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.kilo != i4) {
                dVar.kilo = i4;
                dVar.echo();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (echo()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // androidx.appcompat.widget.C0482u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.mike != colorStateList) {
                dVar.mike = colorStateList;
                if (dVar.alpha(false) != null) {
                    dVar.alpha(false).setTintList(dVar.mike);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.C0482u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (echo()) {
            d dVar = this.silver;
            if (dVar.lima != mode) {
                dVar.lima = mode;
                if (dVar.alpha(false) != null && dVar.lima != null) {
                    dVar.alpha(false).setTintMode(dVar.lima);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        india(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.silver.uniform = z2;
    }

    @Override // android.widget.TextView
    public void setWidth(int i4) {
        this.f7914l = -1.0f;
        super.setWidth(i4);
    }

    public void setWidthChangeMax(int i4) {
        if (this.f7923u != i4) {
            this.f7923u = i4;
            foxtrot(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f7910h);
    }
}
