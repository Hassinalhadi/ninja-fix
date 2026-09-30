package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k implements V3.e {
    public final V3.c alpha;
    public final View purple;

    public k(View view) {
        Y3.f.charlie(view, "Argument must not be null");
        this.purple = view;
        this.alpha = new V3.c(view);
    }

    @Override // R3.i
    public final void alpha() {
    }

    @Override // R3.i
    public final void bravo() {
    }

    @Override // R3.i
    public final void charlie() {
    }

    @Override // V3.e
    public final void delta(U3.h hVar) {
        this.alpha.bravo.remove(hVar);
    }

    @Override // V3.e
    public final void echo(U3.c cVar) {
        this.purple.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // V3.e
    public final void golf(Object obj) {
    }

    @Override // V3.e
    public final void juliet(Drawable drawable) {
    }

    @Override // V3.e
    public final void kilo(Drawable drawable) {
    }

    @Override // V3.e
    public final U3.c lima() {
        Object tag = this.purple.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof U3.c) {
                return (U3.c) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // V3.e
    public final void mike(Drawable drawable) {
        V3.c cVar = this.alpha;
        ViewTreeObserver viewTreeObserver = cVar.alpha.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(cVar.charlie);
        }
        cVar.charlie = null;
        cVar.bravo.clear();
    }

    @Override // V3.e
    public final void november(U3.h hVar) {
        int i4;
        V3.c cVar = this.alpha;
        View view = cVar.alpha;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i5 = 0;
        if (layoutParams != null) {
            i4 = layoutParams.width;
        } else {
            i4 = 0;
        }
        int alpha = cVar.alpha(view.getWidth(), i4, paddingRight);
        View view2 = cVar.alpha;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            i5 = layoutParams2.height;
        }
        int alpha2 = cVar.alpha(view2.getHeight(), i5, paddingBottom);
        if ((alpha <= 0 && alpha != Integer.MIN_VALUE) || (alpha2 <= 0 && alpha2 != Integer.MIN_VALUE)) {
            ArrayList arrayList = cVar.bravo;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            if (cVar.charlie == null) {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                V3.b bVar = new V3.b(cVar);
                cVar.charlie = bVar;
                viewTreeObserver.addOnPreDrawListener(bVar);
                return;
            }
            return;
        }
        hVar.kilo(alpha, alpha2);
    }

    public final String toString() {
        return "Target for: " + this.purple;
    }
}
