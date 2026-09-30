package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import s6.AbstractC2662g6;

/* loaded from: classes3.dex */
public final class N extends ToggleButton implements androidx.core.widget.l {
    public final C0480t alpha;
    public final D purple;
    public ab red;

    public N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        S0.alpha(getContext(), this);
        C0480t c0480t = new C0480t(this);
        this.alpha = c0480t;
        c0480t.delta(attributeSet, R.attr.buttonStyleToggle);
        D d4 = new D(this);
        this.purple = d4;
        d4.foxtrot(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().alpha(attributeSet, R.attr.buttonStyleToggle);
    }

    private ab getEmojiTextViewHelper() {
        if (this.red == null) {
            this.red = new ab(this);
        }
        return this.red;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().bravo(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        D d4 = this.purple;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        D d4 = this.purple;
        if (d4 != null) {
            d4.bravo();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().charlie(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2662g6) getEmojiTextViewHelper().bravo.purple).bravo(inputFilterArr));
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
}
