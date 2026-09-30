package com.google.android.material.progressindicator;

import K3.b;
import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import b7.AbstractC0722d;
import b7.AbstractC0723e;
import b7.o;
import b7.s;
import b7.t;
import b7.u;
import b7.w;
import b7.y;
import b7.z;
import delivery.samurai.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LinearProgressIndicator extends AbstractC0722d {
    /* JADX WARN: Type inference failed for: r4v1, types: [b7.v, b7.t] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083918);
        b yVar;
        z zVar = (z) this.alpha;
        ?? tVar = new t(zVar);
        tVar.foxtrot = 300.0f;
        tVar.oscar = new Pair(new s(), new s());
        Context context2 = getContext();
        if (zVar.oscar == 0) {
            yVar = new w(zVar);
        } else {
            yVar = new y(context2, zVar);
        }
        setIndeterminateDrawable(new u(context2, zVar, tVar, yVar));
        setProgressDrawable(new o(getContext(), zVar, tVar));
        this.f3324a = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b7.e, b7.z] */
    @Override // b7.AbstractC0722d
    public final AbstractC0723e alpha(Context context, AttributeSet attributeSet) {
        ?? abstractC0723e = new AbstractC0723e(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083918);
        int[] iArr = a.quebec;
        boolean z2 = false;
        com.google.android.material.internal.z.alpha(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083918);
        com.google.android.material.internal.z.bravo(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083918, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083918);
        abstractC0723e.oscar = obtainStyledAttributes.getInt(0, 1);
        abstractC0723e.papa = obtainStyledAttributes.getInt(1, 0);
        abstractC0723e.romeo = Math.min(obtainStyledAttributes.getDimensionPixelSize(4, 0), abstractC0723e.alpha);
        if (obtainStyledAttributes.hasValue(3)) {
            abstractC0723e.sierra = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                abstractC0723e.tango = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), abstractC0723e.alpha / 2);
                abstractC0723e.victor = false;
                abstractC0723e.whiskey = true;
            } else if (i4 == 6) {
                abstractC0723e.uniform = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                abstractC0723e.victor = true;
                abstractC0723e.whiskey = true;
            }
        }
        obtainStyledAttributes.recycle();
        abstractC0723e.delta();
        if (abstractC0723e.papa == 1) {
            z2 = true;
        }
        abstractC0723e.quebec = z2;
        return abstractC0723e;
    }

    @Override // b7.AbstractC0722d
    public final void charlie(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (abstractC0723e != null && ((z) abstractC0723e).oscar == 0 && isIndeterminate()) {
            return;
        }
        super.charlie(i4);
    }

    public int getIndeterminateAnimationType() {
        return ((z) this.alpha).oscar;
    }

    public int getIndicatorDirection() {
        return ((z) this.alpha).papa;
    }

    public int getTrackInnerCornerRadius() {
        return ((z) this.alpha).tango;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((z) this.alpha).sierra;
    }

    public int getTrackStopIndicatorSize() {
        return ((z) this.alpha).romeo;
    }

    @Override // b7.AbstractC0722d, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        AbstractC0723e abstractC0723e = this.alpha;
        z zVar = (z) abstractC0723e;
        boolean z10 = true;
        if (((z) abstractC0723e).papa != 1 && ((getLayoutDirection() != 1 || ((z) abstractC0723e).papa != 2) && (getLayoutDirection() != 0 || ((z) abstractC0723e).papa != 3))) {
            z10 = false;
        }
        zVar.quebec = z10;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        int paddingRight = i4 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i5 - (getPaddingBottom() + getPaddingTop());
        u indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        o progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (((z) abstractC0723e).oscar == i4) {
            return;
        }
        if (delta() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((z) abstractC0723e).oscar = i4;
        ((z) abstractC0723e).delta();
        if (i4 == 0) {
            u indeterminateDrawable = getIndeterminateDrawable();
            w wVar = new w((z) abstractC0723e);
            indeterminateDrawable.f3362h = wVar;
            wVar.purple = indeterminateDrawable;
        } else {
            u indeterminateDrawable2 = getIndeterminateDrawable();
            y yVar = new y(getContext(), (z) abstractC0723e);
            indeterminateDrawable2.f3362h = yVar;
            yVar.purple = indeterminateDrawable2;
        }
        bravo();
        invalidate();
    }

    @Override // b7.AbstractC0722d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((z) this.alpha).delta();
    }

    public void setIndicatorDirection(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        ((z) abstractC0723e).papa = i4;
        z zVar = (z) abstractC0723e;
        boolean z2 = true;
        if (i4 != 1 && ((getLayoutDirection() != 1 || ((z) abstractC0723e).papa != 2) && (getLayoutDirection() != 0 || i4 != 3))) {
            z2 = false;
        }
        zVar.quebec = z2;
        invalidate();
    }

    @Override // b7.AbstractC0722d
    public void setTrackCornerRadius(int i4) {
        super.setTrackCornerRadius(i4);
        ((z) this.alpha).delta();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (((z) abstractC0723e).tango != i4) {
            ((z) abstractC0723e).tango = Math.round(Math.min(i4, ((z) abstractC0723e).alpha / 2.0f));
            ((z) abstractC0723e).victor = false;
            ((z) abstractC0723e).whiskey = true;
            ((z) abstractC0723e).delta();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f5) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (((z) abstractC0723e).uniform != f5) {
            ((z) abstractC0723e).uniform = Math.min(f5, 0.5f);
            ((z) abstractC0723e).victor = true;
            ((z) abstractC0723e).whiskey = true;
            ((z) abstractC0723e).delta();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (!Objects.equals(((z) abstractC0723e).sierra, num)) {
            ((z) abstractC0723e).sierra = num;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int i4) {
        AbstractC0723e abstractC0723e = this.alpha;
        if (((z) abstractC0723e).romeo != i4) {
            ((z) abstractC0723e).romeo = Math.min(i4, ((z) abstractC0723e).alpha);
            ((z) abstractC0723e).delta();
            invalidate();
        }
    }
}
