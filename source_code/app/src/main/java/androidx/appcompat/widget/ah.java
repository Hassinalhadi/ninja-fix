package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import delivery.samurai.android.R;
import s6.AbstractC2662g6;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public class ah extends RadioButton implements androidx.core.widget.k, androidx.core.widget.l {
    public final C0486w alpha;
    public final C0480t purple;
    public final D red;
    public ab silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.alpha(context);
        S0.alpha(getContext(), this);
        C0486w c0486w = new C0486w(this);
        this.alpha = c0486w;
        c0486w.charlie(attributeSet, R.attr.radioButtonStyle);
        C0480t c0480t = new C0480t(this);
        this.purple = c0480t;
        c0480t.delta(attributeSet, R.attr.radioButtonStyle);
        D d4 = new D(this);
        this.red = d4;
        d4.foxtrot(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().alpha(attributeSet, R.attr.radioButtonStyle);
    }

    private ab getEmojiTextViewHelper() {
        if (this.silver == null) {
            this.silver = new ab(this);
        }
        return this.silver;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.alpha();
        }
        D d4 = this.red;
        if (d4 != null) {
            d4.bravo();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            return c0486w.alpha;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            return c0486w.bravo;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.red.delta();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.red.echo();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().bravo(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            if (c0486w.echo) {
                c0486w.echo = false;
            } else {
                c0486w.echo = true;
                c0486w.alpha();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        D d4 = this.red;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        D d4 = this.red;
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
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            c0486w.alpha = colorStateList;
            c0486w.charlie = true;
            c0486w.alpha();
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            c0486w.bravo = mode;
            c0486w.delta = true;
            c0486w.alpha();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        D d4 = this.red;
        d4.kilo(colorStateList);
        d4.bravo();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        D d4 = this.red;
        d4.lima(mode);
        d4.bravo();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(AbstractC3032n3.echo(i4, getContext()));
    }
}
