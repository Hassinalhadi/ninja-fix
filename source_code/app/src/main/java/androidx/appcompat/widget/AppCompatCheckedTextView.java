package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import delivery.samurai.android.R;
import id.C1915c;
import t6.A3;
import t6.AbstractC3032n3;
import t6.AbstractC3051r3;

/* loaded from: classes3.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements androidx.core.widget.l {
    public final C0486w alpha;
    public final C0480t purple;
    public final D red;
    public ab silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        T0.alpha(context);
        S0.alpha(getContext(), this);
        D d4 = new D(this);
        this.red = d4;
        d4.foxtrot(attributeSet, R.attr.checkedTextViewStyle);
        d4.bravo();
        C0480t c0480t = new C0480t(this);
        this.purple = c0480t;
        c0480t.delta(attributeSet, R.attr.checkedTextViewStyle);
        this.alpha = new C0486w(this);
        Context context2 = getContext();
        int[] iArr = aj.a.lima;
        C1915c victor = C1915c.victor(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) victor.red;
        s1.au.mike(this, getContext(), iArr, attributeSet, (TypedArray) victor.red, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC3032n3.echo(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(victor.november(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(S.bravo(typedArray.getInt(3, -1), null));
                }
                victor.xray();
                getEmojiTextViewHelper().alpha(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC3032n3.echo(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            victor.xray();
            getEmojiTextViewHelper().alpha(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            victor.xray();
            throw th;
        }
    }

    private ab getEmojiTextViewHelper() {
        if (this.silver == null) {
            this.silver = new ab(this);
        }
        return this.silver;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        D d4 = this.red;
        if (d4 != null) {
            d4.bravo();
        }
        C0480t c0480t = this.purple;
        if (c0480t != null) {
            c0480t.alpha();
        }
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            c0486w.bravo();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A3.papa(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            return c0486w.alpha;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3051r3.bravo(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            if (c0486w.echo) {
                c0486w.echo = false;
            } else {
                c0486w.echo = true;
                c0486w.bravo();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A3.quebec(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().charlie(z2);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            c0486w.alpha = colorStateList;
            c0486w.charlie = true;
            c0486w.bravo();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0486w c0486w = this.alpha;
        if (c0486w != null) {
            c0486w.bravo = mode;
            c0486w.delta = true;
            c0486w.bravo();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        D d4 = this.red;
        if (d4 != null) {
            d4.golf(i4, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(AbstractC3032n3.echo(i4, getContext()));
    }
}
