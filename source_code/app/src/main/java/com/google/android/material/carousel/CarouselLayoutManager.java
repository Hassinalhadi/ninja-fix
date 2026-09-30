package com.google.android.material.carousel;

import G.a;
import Q6.b;
import Q6.c;
import Q6.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;
import androidx.recyclerview.widget.Z;
import androidx.recyclerview.widget.b0;
import ao.ad;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends L implements Z {
    public final a papa;
    public d quebec;
    public final View.OnLayoutChangeListener romeo;

    public CarouselLayoutManager() {
        a aVar = new a();
        new c();
        this.romeo = new Q6.a(0, this);
        this.papa = aVar;
        l();
        D(0);
    }

    public final float A(float f5, float f10) {
        if (C()) {
            return f5 - f10;
        }
        return f5 + f10;
    }

    public final boolean B() {
        if (this.quebec.alpha == 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if (B() && crimson() == 1) {
            return true;
        }
        return false;
    }

    public final void D(int i4) {
        d dVar;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(ad.zulu(i4, "invalid orientation:"));
        }
        charlie(null);
        d dVar2 = this.quebec;
        if (dVar2 != null && i4 == dVar2.alpha) {
            return;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                dVar = new d(this, 0);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            dVar = new d(this, 1);
        }
        this.quebec = dVar;
        l();
    }

    @Override // androidx.recyclerview.widget.Z
    public final PointF alpha(int i4) {
        return null;
    }

    @Override // androidx.recyclerview.widget.L
    public final void amber(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        rect.centerY();
        if (B()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.L
    public final void b(U u4, b0 b0Var) {
        int i4;
        if (b0Var.bravo() > 0) {
            if (B()) {
                i4 = this.november;
            } else {
                i4 = this.oscar;
            }
            if (i4 > 0.0f) {
                C();
                u4.delta(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h(u4);
    }

    @Override // androidx.recyclerview.widget.L
    public final void c(b0 b0Var) {
        if (whiskey() == 0) {
            return;
        }
        L.gray(victor(0));
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean echo() {
        return B();
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean foxtrot() {
        return !B();
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean jade() {
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean k(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final int kilo(b0 b0Var) {
        whiskey();
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final int lima(b0 b0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final int m(int i4, U u4, b0 b0Var) {
        if (!B() || whiskey() == 0 || i4 == 0) {
            return 0;
        }
        u4.delta(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.L
    public final int mike(b0 b0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final void n(int i4) {
    }

    @Override // androidx.recyclerview.widget.L
    public final int november(b0 b0Var) {
        whiskey();
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final int o(int i4, U u4, b0 b0Var) {
        if (!foxtrot() || whiskey() == 0 || i4 == 0) {
            return 0;
        }
        u4.delta(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.L
    public final void ochre(RecyclerView recyclerView) {
        a aVar = this.papa;
        Context context = recyclerView.getContext();
        float f5 = aVar.alpha;
        if (f5 <= 0.0f) {
            f5 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        aVar.alpha = f5;
        float f10 = aVar.bravo;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        aVar.bravo = f10;
        l();
        recyclerView.addOnLayoutChangeListener(this.romeo);
    }

    @Override // androidx.recyclerview.widget.L
    public final void olive(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.romeo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (C() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (C() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View orange(View view, int i4, U u4, b0 b0Var) {
        char c3;
        if (whiskey() != 0) {
            int i5 = this.quebec.alpha;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 17) {
                        if (i4 != 33) {
                            if (i4 != 66) {
                                if (i4 != 130) {
                                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i4);
                                }
                                c3 = 0;
                            } else {
                                if (i5 == 0) {
                                }
                                c3 = 0;
                            }
                        }
                    } else {
                        if (i5 == 0) {
                        }
                        c3 = 0;
                    }
                    if (c3 != 0) {
                        int i10 = 0;
                        if (c3 == 65535) {
                            if (L.gray(view) != 0) {
                                int gray = L.gray(victor(0)) - 1;
                                if (gray >= 0 && gray < coral()) {
                                    this.quebec.alpha();
                                    throw null;
                                }
                                if (C()) {
                                    i10 = whiskey() - 1;
                                }
                                return victor(i10);
                            }
                            return null;
                        }
                        if (L.gray(view) == coral() - 1) {
                            return null;
                        }
                        int gray2 = L.gray(victor(whiskey() - 1)) + 1;
                        if (gray2 >= 0 && gray2 < coral()) {
                            this.quebec.alpha();
                            throw null;
                        }
                        if (!C()) {
                            i10 = whiskey() - 1;
                        }
                        return victor(i10);
                    }
                    return null;
                }
                c3 = 1;
                if (c3 != 0) {
                }
            }
            c3 = 65535;
            if (c3 != 0) {
            }
        } else {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final int oscar(b0 b0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final int papa(b0 b0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.L
    public final void peach(AccessibilityEvent accessibilityEvent) {
        super.peach(accessibilityEvent);
        if (whiskey() > 0) {
            accessibilityEvent.setFromIndex(L.gray(victor(0)));
            accessibilityEvent.setToIndex(L.gray(victor(whiskey() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void red(int i4, int i5) {
        coral();
    }

    @Override // androidx.recyclerview.widget.L
    public final M sierra() {
        return new M(-2, -2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void silver() {
        coral();
    }

    @Override // androidx.recyclerview.widget.L
    public final void white(int i4, int i5) {
        coral();
    }

    @Override // androidx.recyclerview.widget.L
    public final void x(RecyclerView recyclerView, int i4) {
        b bVar = new b(this, recyclerView.getContext());
        bVar.setTargetPosition(i4);
        y(bVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        new c();
        this.romeo = new Q6.a(0, this);
        this.papa = new a();
        l();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.foxtrot);
            obtainStyledAttributes.getInt(0, 0);
            l();
            D(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
