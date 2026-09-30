package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class at extends C0466l0 implements au {
    public final /* synthetic */ av A;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2866w;

    /* renamed from: x, reason: collision with root package name */
    public aq f2867x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f2868y;

    /* renamed from: z, reason: collision with root package name */
    public int f2869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(av avVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.A = avVar;
        this.f2868y = new Rect();
        this.f2889h = avVar;
        this.f2899r = true;
        this.f2900s.setFocusable(true);
        this.f2890i = new ar(0, this);
    }

    @Override // androidx.appcompat.widget.au
    public final CharSequence delta() {
        return this.f2866w;
    }

    @Override // androidx.appcompat.widget.au
    public final void foxtrot(CharSequence charSequence) {
        this.f2866w = charSequence;
    }

    @Override // androidx.appcompat.widget.au
    public final void lima(int i4) {
        this.f2869z = i4;
    }

    @Override // androidx.appcompat.widget.au
    public final void mike(int i4, int i5) {
        ViewTreeObserver viewTreeObserver;
        af afVar = this.f2900s;
        boolean isShowing = afVar.isShowing();
        sierra();
        this.f2900s.setInputMethodMode(2);
        golf();
        Z z2 = this.red;
        z2.setChoiceMode(1);
        z2.setTextDirection(i4);
        z2.setTextAlignment(i5);
        av avVar = this.A;
        int selectedItemPosition = avVar.getSelectedItemPosition();
        Z z10 = this.red;
        if (afVar.isShowing() && z10 != null) {
            z10.setListSelectionHidden(false);
            z10.setSelection(selectedItemPosition);
            if (z10.getChoiceMode() != 0) {
                z10.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = avVar.getViewTreeObserver()) != null) {
            an anVar = new an(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(anVar);
            this.f2900s.setOnDismissListener(new as(this, anVar));
        }
    }

    @Override // androidx.appcompat.widget.C0466l0, androidx.appcompat.widget.au
    public final void oscar(ListAdapter listAdapter) {
        super.oscar(listAdapter);
        this.f2867x = (aq) listAdapter;
    }

    public final void sierra() {
        int i4;
        int i5;
        af afVar = this.f2900s;
        Drawable background = afVar.getBackground();
        av avVar = this.A;
        if (background != null) {
            background.getPadding(avVar.f2871a);
            boolean z2 = m1.alpha;
            int layoutDirection = avVar.getLayoutDirection();
            Rect rect = avVar.f2871a;
            if (layoutDirection == 1) {
                i4 = rect.right;
            } else {
                i4 = -rect.left;
            }
        } else {
            Rect rect2 = avVar.f2871a;
            rect2.right = 0;
            rect2.left = 0;
            i4 = 0;
        }
        int paddingLeft = avVar.getPaddingLeft();
        int paddingRight = avVar.getPaddingRight();
        int width = avVar.getWidth();
        int i10 = avVar.yellow;
        if (i10 == -2) {
            int alpha = avVar.alpha(this.f2867x, afVar.getBackground());
            int i11 = avVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = avVar.f2871a;
            int i12 = (i11 - rect3.left) - rect3.right;
            if (alpha > i12) {
                alpha = i12;
            }
            romeo(Math.max(alpha, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            romeo((width - paddingLeft) - paddingRight);
        } else {
            romeo(i10);
        }
        boolean z10 = m1.alpha;
        if (avVar.getLayoutDirection() == 1) {
            i5 = (((width - paddingRight) - this.teal) - this.f2869z) + i4;
        } else {
            i5 = paddingLeft + this.f2869z + i4;
        }
        this.white = i5;
    }
}
