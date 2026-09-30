package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import s6.AbstractC2662g6;
import t6.A3;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0482u extends Button implements androidx.core.widget.l {
    public final C0480t alpha;
    public final D purple;
    public ab red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482u(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        T0.alpha(context);
        S0.alpha(getContext(), this);
        C0480t c0480t = new C0480t(this);
        this.alpha = c0480t;
        c0480t.delta(attributeSet, i4);
        D d4 = new D(this);
        this.purple = d4;
        d4.foxtrot(attributeSet, i4);
        d4.bravo();
        getEmojiTextViewHelper().alpha(attributeSet, i4);
    }

    private ab getEmojiTextViewHelper() {
        if (this.red == null) {
            this.red = new ab(this);
        }
        return this.red;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.alpha();
        }
        D d4 = this.purple;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m1.charlie) {
            return super.getAutoSizeMaxTextSize();
        }
        D d4 = this.purple;
        if (d4 != null) {
            return Math.round(d4.india.echo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m1.charlie) {
            return super.getAutoSizeMinTextSize();
        }
        D d4 = this.purple;
        if (d4 != null) {
            return Math.round(d4.india.delta);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m1.charlie) {
            return super.getAutoSizeStepGranularity();
        }
        D d4 = this.purple;
        if (d4 != null) {
            return Math.round(d4.india.charlie);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m1.charlie) {
            return super.getAutoSizeTextAvailableSizes();
        }
        D d4 = this.purple;
        if (d4 != null) {
            return d4.india.foxtrot;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m1.charlie) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        D d4 = this.purple;
        if (d4 == null) {
            return 0;
        }
        return d4.india.alpha;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A3.papa(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.purple.delta();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.purple.echo();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        D d4 = this.purple;
        if (d4 != null && !m1.charlie) {
            d4.india.alpha();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        super.onTextChanged(charSequence, i4, i5, i10);
        D d4 = this.purple;
        if (d4 != null && !m1.charlie) {
            M m4 = d4.india;
            if (m4.foxtrot()) {
                m4.alpha();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().bravo(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i10, int i11) {
        if (m1.charlie) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i10, i11);
            return;
        }
        D d4 = this.purple;
        if (d4 != null) {
            d4.hotel(i4, i5, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (m1.charlie) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        D d4 = this.purple;
        if (d4 != null) {
            d4.india(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (m1.charlie) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        D d4 = this.purple;
        if (d4 != null) {
            d4.juliet(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A3.quebec(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().charlie(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2662g6) getEmojiTextViewHelper().bravo.purple).bravo(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        D d4 = this.purple;
        if (d4 != null) {
            d4.alpha.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        D d4 = this.purple;
        d4.kilo(colorStateList);
        d4.bravo();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        D d4 = this.purple;
        d4.lima(mode);
        d4.bravo();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        D d4 = this.purple;
        if (d4 != null) {
            d4.golf(i4, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f5) {
        boolean z2 = m1.charlie;
        if (z2) {
            super.setTextSize(i4, f5);
            return;
        }
        D d4 = this.purple;
        if (d4 != null && !z2) {
            M m4 = d4.india;
            if (!m4.foxtrot()) {
                m4.golf(f5, i4);
            }
        }
    }
}
