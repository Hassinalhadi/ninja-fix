package androidx.appcompat.view.menu;

import aj.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0461j;
import androidx.appcompat.widget.InterfaceC0471o;
import ao.b;
import ao.k;
import ao.l;
import ao.n;
import ao.y;
import t6.AbstractC3056s3;

/* loaded from: classes3.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, InterfaceC0471o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2753a;
    public n alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f2754b;

    /* renamed from: c, reason: collision with root package name */
    public int f2755c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2756d;
    public CharSequence purple;
    public Drawable red;
    public k silver;
    public C0461j teal;
    public b white;
    public boolean yellow;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.yellow = echo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.charlie, 0, 0);
        this.f2754b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f2756d = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2755c = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.InterfaceC0471o
    public final boolean alpha() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.InterfaceC0471o
    public final boolean bravo() {
        if (!TextUtils.isEmpty(getText()) && this.alpha.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // ao.y
    public final void charlie(n nVar) {
        int i4;
        this.alpha = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.alpha);
        if (nVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.teal == null) {
            this.teal = new C0461j(this);
        }
    }

    public final boolean echo() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            if ((i4 < 640 || i5 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void foxtrot() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2 = true;
        boolean z10 = !TextUtils.isEmpty(this.purple);
        if (this.red != null && ((this.alpha.f3235r & 4) != 4 || (!this.yellow && !this.f2753a))) {
            z2 = false;
        }
        boolean z11 = z10 & z2;
        CharSequence charSequence3 = null;
        if (z11) {
            charSequence = this.purple;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.alpha.f3227j;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z11) {
                charSequence2 = null;
            } else {
                charSequence2 = this.alpha.teal;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.alpha.f3228k;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z11) {
                charSequence3 = this.alpha.teal;
            }
            AbstractC3056s3.alpha(this, charSequence3);
            return;
        }
        AbstractC3056s3.alpha(this, charSequence5);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // ao.y
    public n getItemData() {
        return this.alpha;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.silver;
        if (kVar != null) {
            kVar.bravo(this.alpha);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.yellow = echo();
        foxtrot();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.f2755c) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f2754b;
        if (mode == Integer.MIN_VALUE) {
            i10 = Math.min(size, i12);
        } else {
            i10 = i12;
        }
        if (mode != 1073741824 && i12 > 0 && measuredWidth < i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i5);
        }
        if (isEmpty && this.red != null) {
            super.setPadding((getMeasuredWidth() - this.red.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0461j c0461j;
        if (this.alpha.hasSubMenu() && (c0461j = this.teal) != null && c0461j.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f2753a != z2) {
            this.f2753a = z2;
            n nVar = this.alpha;
            if (nVar != null) {
                l lVar = nVar.f3224g;
                lVar.f3206d = true;
                lVar.papa(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.red = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f2756d;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        foxtrot();
    }

    public void setItemInvoker(k kVar) {
        this.silver = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i10, int i11) {
        this.f2755c = i4;
        super.setPadding(i4, i5, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.white = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.purple = charSequence;
        foxtrot();
    }
}
