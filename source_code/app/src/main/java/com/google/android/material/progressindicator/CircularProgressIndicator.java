package com.google.android.material.progressindicator;

import K3.b;
import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.p;
import b7.AbstractC0722d;
import b7.AbstractC0723e;
import b7.C0724f;
import b7.C0727i;
import b7.C0729k;
import b7.C0730l;
import b7.o;
import b7.u;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public class CircularProgressIndicator extends AbstractC0722d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083906);
        b c0727i;
        C0730l c0730l = (C0730l) this.alpha;
        C0724f c0724f = new C0724f(c0730l);
        Context context2 = getContext();
        if (c0730l.oscar == 1) {
            c0727i = new C0729k(context2, c0730l);
        } else {
            c0727i = new C0727i(c0730l);
        }
        u uVar = new u(context2, c0730l, c0724f, c0727i);
        uVar.f3363i = p.alpha(R.drawable.ic_mtrl_arrow_circle, null, context2.getResources());
        setIndeterminateDrawable(uVar);
        setProgressDrawable(new o(getContext(), c0730l, c0724f));
        this.f3324a = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b7.e, b7.l] */
    @Override // b7.AbstractC0722d
    public final AbstractC0723e alpha(Context context, AttributeSet attributeSet) {
        ?? abstractC0723e = new AbstractC0723e(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083906);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = a.hotel;
        z.alpha(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083906);
        z.bravo(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083906, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083906);
        abstractC0723e.oscar = obtainStyledAttributes.getInt(0, 0);
        abstractC0723e.papa = Math.max(AbstractC2719n0.charlie(context, obtainStyledAttributes, 4, dimensionPixelSize), abstractC0723e.alpha * 2);
        abstractC0723e.quebec = AbstractC2719n0.charlie(context, obtainStyledAttributes, 3, dimensionPixelSize2);
        abstractC0723e.romeo = obtainStyledAttributes.getInt(2, 0);
        abstractC0723e.sierra = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        abstractC0723e.delta();
        return abstractC0723e;
    }

    public int getIndeterminateAnimationType() {
        return ((C0730l) this.alpha).oscar;
    }

    public int getIndicatorDirection() {
        return ((C0730l) this.alpha).romeo;
    }

    public int getIndicatorInset() {
        return ((C0730l) this.alpha).quebec;
    }

    public int getIndicatorSize() {
        return ((C0730l) this.alpha).papa;
    }

    public void setIndeterminateAnimationType(int i4) {
        b c0727i;
        AbstractC0723e abstractC0723e = this.alpha;
        if (((C0730l) abstractC0723e).oscar == i4) {
            return;
        }
        if (delta() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((C0730l) abstractC0723e).oscar = i4;
        ((C0730l) abstractC0723e).delta();
        if (i4 == 1) {
            c0727i = new C0729k(getContext(), (C0730l) abstractC0723e);
        } else {
            c0727i = new C0727i((C0730l) abstractC0723e);
        }
        u indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.f3362h = c0727i;
        c0727i.purple = indeterminateDrawable;
        bravo();
        invalidate();
    }

    public void setIndicatorDirection(int i4) {
        ((C0730l) this.alpha).romeo = i4;
        invalidate();
    }

    public void setIndicatorInset(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (((C0730l) abstractC0723e).quebec != i4) {
            ((C0730l) abstractC0723e).quebec = i4;
            invalidate();
        }
    }

    public void setIndicatorSize(int i4) {
        int max = Math.max(i4, getTrackThickness() * 2);
        AbstractC0723e abstractC0723e = this.alpha;
        if (((C0730l) abstractC0723e).papa != max) {
            ((C0730l) abstractC0723e).papa = max;
            ((C0730l) abstractC0723e).delta();
            requestLayout();
            invalidate();
        }
    }

    @Override // b7.AbstractC0722d
    public void setTrackThickness(int i4) {
        super.setTrackThickness(i4);
        ((C0730l) this.alpha).delta();
    }
}
