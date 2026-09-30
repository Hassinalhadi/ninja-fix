package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import id.C1915c;
import t6.AbstractC3032n3;
import t6.AbstractC3051r3;

/* loaded from: classes3.dex */
public final class ae extends MultiAutoCompleteTextView implements androidx.core.widget.l {
    public static final int[] silver = {R.attr.popupBackground};
    public final C0480t alpha;
    public final D purple;
    public final aa red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.autoCompleteTextViewStyle);
        T0.alpha(context);
        S0.alpha(getContext(), this);
        C1915c victor = C1915c.victor(getContext(), attributeSet, silver, delivery.samurai.android.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) victor.red).hasValue(0)) {
            setDropDownBackgroundDrawable(victor.oscar(0));
        }
        victor.xray();
        C0480t c0480t = new C0480t(this);
        this.alpha = c0480t;
        c0480t.delta(attributeSet, delivery.samurai.android.R.attr.autoCompleteTextViewStyle);
        D d4 = new D(this);
        this.purple = d4;
        d4.foxtrot(attributeSet, delivery.samurai.android.R.attr.autoCompleteTextViewStyle);
        d4.bravo();
        aa aaVar = new aa(this);
        this.red = aaVar;
        aaVar.bravo(attributeSet, delivery.samurai.android.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener alpha = aaVar.alpha(keyListener);
            if (alpha != keyListener) {
                super.setKeyListener(alpha);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3051r3.bravo(onCreateInputConnection, editorInfo, this);
        return this.red.charlie(onCreateInputConnection, editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.red.delta(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.red.alpha(keyListener));
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
}
