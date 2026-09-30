package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0484v;
import androidx.vectordrawable.graphics.drawable.e;
import ao.ad;
import b7.C0721c;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import i1.k;
import id.C1915c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l7.AbstractC2059a;
import org.xmlpull.v1.XmlPullParserException;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public final class b extends C0484v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f7942r = {R.attr.state_indeterminate};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f7943s = {R.attr.state_error};

    /* renamed from: t, reason: collision with root package name */
    public static final int[][] f7944t = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: u, reason: collision with root package name */
    public static final int f7945u = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: a, reason: collision with root package name */
    public boolean f7946a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7947b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7948c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f7949d;
    public Drawable e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f7950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7951g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f7952h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f7953i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f7954j;

    /* renamed from: k, reason: collision with root package name */
    public int f7955k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f7956l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7957m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7958n;

    /* renamed from: o, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7959o;

    /* renamed from: p, reason: collision with root package name */
    public final e f7960p;

    /* renamed from: q, reason: collision with root package name */
    public final C0721c f7961q;
    public final LinkedHashSet teal;
    public final LinkedHashSet white;
    public ColorStateList yellow;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.checkboxStyle, 2132083911), attributeSet, R.attr.checkboxStyle);
        e eVar;
        int next;
        Context context2;
        TypedArray obtainStyledAttributes;
        int resourceId;
        this.teal = new LinkedHashSet();
        this.white = new LinkedHashSet();
        Context context3 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context3);
            Resources resources = context3.getResources();
            Resources.Theme theme = context3.getTheme();
            ThreadLocal threadLocal = k.alpha;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            eVar.alpha = drawable;
            drawable.setCallback(eVar.white);
            new P3.b(2, eVar.alpha.getConstantState());
        } else {
            int i4 = e.yellow;
            try {
                XmlResourceParser xml = context3.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    Resources resources2 = context3.getResources();
                    Resources.Theme theme2 = context3.getTheme();
                    e eVar2 = new e(context3);
                    eVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    eVar = eVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e) {
                Log.e("AnimatedVDCompat", "parser error", e);
                eVar = null;
                this.f7960p = eVar;
                this.f7961q = new C0721c(2, this);
                context2 = getContext();
                this.e = getButtonDrawable();
                this.f7952h = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr = L6.a.zulu;
                z.alpha(context2, attributeSet, R.attr.checkboxStyle, 2132083911);
                z.bravo(context2, attributeSet, iArr, R.attr.checkboxStyle, 2132083911, new int[0]);
                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2132083911);
                C1915c c1915c = new C1915c(context2, obtainStyledAttributes);
                this.f7950f = c1915c.oscar(2);
                if (this.e != null) {
                    resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                    if (resourceId == f7945u) {
                        super.setButtonDrawable((Drawable) null);
                        this.e = AbstractC3032n3.echo(R.drawable.mtrl_checkbox_button, context2);
                        this.f7951g = true;
                        if (this.f7950f == null) {
                        }
                    }
                }
                this.f7953i = AbstractC2719n0.bravo(context2, c1915c, 3);
                this.f7954j = z.hotel(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
                this.f7946a = obtainStyledAttributes.getBoolean(10, false);
                this.f7947b = obtainStyledAttributes.getBoolean(6, true);
                this.f7948c = obtainStyledAttributes.getBoolean(9, false);
                this.f7949d = obtainStyledAttributes.getText(8);
                if (obtainStyledAttributes.hasValue(7)) {
                }
                c1915c.xray();
                alpha();
            } catch (XmlPullParserException e4) {
                Log.e("AnimatedVDCompat", "parser error", e4);
                eVar = null;
                this.f7960p = eVar;
                this.f7961q = new C0721c(2, this);
                context2 = getContext();
                this.e = getButtonDrawable();
                this.f7952h = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr2 = L6.a.zulu;
                z.alpha(context2, attributeSet, R.attr.checkboxStyle, 2132083911);
                z.bravo(context2, attributeSet, iArr2, R.attr.checkboxStyle, 2132083911, new int[0]);
                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.checkboxStyle, 2132083911);
                C1915c c1915c2 = new C1915c(context2, obtainStyledAttributes);
                this.f7950f = c1915c2.oscar(2);
                if (this.e != null) {
                }
                this.f7953i = AbstractC2719n0.bravo(context2, c1915c2, 3);
                this.f7954j = z.hotel(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
                this.f7946a = obtainStyledAttributes.getBoolean(10, false);
                this.f7947b = obtainStyledAttributes.getBoolean(6, true);
                this.f7948c = obtainStyledAttributes.getBoolean(9, false);
                this.f7949d = obtainStyledAttributes.getText(8);
                if (obtainStyledAttributes.hasValue(7)) {
                }
                c1915c2.xray();
                alpha();
            }
        }
        this.f7960p = eVar;
        this.f7961q = new C0721c(2, this);
        context2 = getContext();
        this.e = getButtonDrawable();
        this.f7952h = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr22 = L6.a.zulu;
        z.alpha(context2, attributeSet, R.attr.checkboxStyle, 2132083911);
        z.bravo(context2, attributeSet, iArr22, R.attr.checkboxStyle, 2132083911, new int[0]);
        obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr22, R.attr.checkboxStyle, 2132083911);
        C1915c c1915c22 = new C1915c(context2, obtainStyledAttributes);
        this.f7950f = c1915c22.oscar(2);
        if (this.e != null && AbstractC2710m0.charlie(context2, R.attr.isMaterial3Theme, false)) {
            resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId22 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f7945u && resourceId22 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.e = AbstractC3032n3.echo(R.drawable.mtrl_checkbox_button, context2);
                this.f7951g = true;
                if (this.f7950f == null) {
                    this.f7950f = AbstractC3032n3.echo(R.drawable.mtrl_checkbox_button_icon, context2);
                }
            }
        }
        this.f7953i = AbstractC2719n0.bravo(context2, c1915c22, 3);
        this.f7954j = z.hotel(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f7946a = obtainStyledAttributes.getBoolean(10, false);
        this.f7947b = obtainStyledAttributes.getBoolean(6, true);
        this.f7948c = obtainStyledAttributes.getBoolean(9, false);
        this.f7949d = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c1915c22.xray();
        alpha();
    }

    private String getButtonStateDescription() {
        int i4 = this.f7955k;
        if (i4 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i4 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.yellow == null) {
            int charlie = AbstractC2815x7.charlie(R.attr.colorControlActivated, this);
            int charlie2 = AbstractC2815x7.charlie(R.attr.colorError, this);
            int charlie3 = AbstractC2815x7.charlie(R.attr.colorSurface, this);
            int charlie4 = AbstractC2815x7.charlie(R.attr.colorOnSurface, this);
            this.yellow = new ColorStateList(f7944t, new int[]{AbstractC2815x7.golf(1.0f, charlie3, charlie2), AbstractC2815x7.golf(1.0f, charlie3, charlie), AbstractC2815x7.golf(0.54f, charlie3, charlie4), AbstractC2815x7.golf(0.38f, charlie3, charlie4), AbstractC2815x7.golf(0.38f, charlie3, charlie4)});
        }
        return this.yellow;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7952h;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void alpha() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        O6.b bVar;
        Drawable drawable = this.e;
        ColorStateList colorStateList3 = this.f7952h;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.e = drawable;
        Drawable drawable2 = this.f7950f;
        ColorStateList colorStateList4 = this.f7953i;
        PorterDuff.Mode mode = this.f7954j;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f7950f = drawable2;
        if (this.f7951g) {
            e eVar = this.f7960p;
            if (eVar != null) {
                Drawable drawable3 = eVar.alpha;
                C0721c c0721c = this.f7961q;
                if (drawable3 != null) {
                    ((AnimatedVectorDrawable) drawable3).unregisterAnimationCallback(c0721c.getPlatformCallback());
                }
                ArrayList arrayList = eVar.teal;
                if (arrayList != null && c0721c != null) {
                    arrayList.remove(c0721c);
                    if (eVar.teal.size() == 0 && (bVar = eVar.silver) != null) {
                        eVar.purple.bravo.removeListener(bVar);
                        eVar.silver = null;
                    }
                }
                eVar.alpha(c0721c);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable4 = this.e;
                if ((drawable4 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                    ((AnimatedStateListDrawable) this.e).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
                }
            }
        }
        Drawable drawable5 = this.e;
        if (drawable5 != null && (colorStateList2 = this.f7952h) != null) {
            drawable5.setTintList(colorStateList2);
        }
        Drawable drawable6 = this.f7950f;
        if (drawable6 != null && (colorStateList = this.f7953i) != null) {
            drawable6.setTintList(colorStateList);
        }
        Drawable drawable7 = this.e;
        Drawable drawable8 = this.f7950f;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f5 = intrinsicWidth / intrinsicHeight;
                if (f5 >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f5);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f5 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.e;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7950f;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7953i;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7954j;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7952h;
    }

    public int getCheckedState() {
        return this.f7955k;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7949d;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f7955k == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7946a && this.f7952h == null && this.f7953i == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f7942r);
        }
        if (this.f7948c) {
            View.mergeDrawableStates(onCreateDrawableState, f7943s);
        }
        int i5 = 0;
        while (true) {
            if (i5 < onCreateDrawableState.length) {
                int i10 = onCreateDrawableState[i5];
                if (i10 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i10 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i5] = 16842912;
                    break;
                }
                i5++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f7956l = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.f7947b && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i4 = 1;
            if (getLayoutDirection() == 1) {
                i4 = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i4;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f7948c) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7949d));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.alpha);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.google.android.material.checkbox.MaterialCheckBox$SavedState, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.alpha = getCheckedState();
        return baseSavedState;
    }

    @Override // androidx.appcompat.widget.C0484v, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7950f = drawable;
        alpha();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7953i == colorStateList) {
            return;
        }
        this.f7953i = colorStateList;
        alpha();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f7954j == mode) {
            return;
        }
        this.f7954j = mode;
        alpha();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7952h == colorStateList) {
            return;
        }
        this.f7952h = colorStateList;
        alpha();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        alpha();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f7947b = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        boolean z2;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7955k != i4) {
            this.f7955k = i4;
            if (i4 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setChecked(z2);
            refreshDrawableState();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && this.f7958n == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f7957m) {
                this.f7957m = true;
                LinkedHashSet linkedHashSet = this.white;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw ad.yankee(it);
                    }
                }
                if (this.f7955k != 2 && (onCheckedChangeListener = this.f7959o) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i5 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f7957m = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7949d = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        CharSequence charSequence;
        if (i4 != 0) {
            charSequence = getResources().getText(i4);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z2) {
        if (this.f7948c != z2) {
            this.f7948c = z2;
            refreshDrawableState();
            Iterator it = this.teal.iterator();
            if (!it.hasNext()) {
            } else {
                throw ad.yankee(it);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7959o = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7958n = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f7946a = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.C0484v, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.e = drawable;
        this.f7951g = false;
        alpha();
    }
}
