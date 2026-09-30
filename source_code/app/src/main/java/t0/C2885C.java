package t0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC2264a;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2885C extends ViewGroup {
    public final HashMap alpha;
    public final HashMap purple;

    public C2885C(Context context) {
        super(context);
        setClipChildren(false);
        this.alpha = new HashMap();
        this.purple = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @NotNull
    public final HashMap<T0.j, s0.al> getHolderToLayoutNode() {
        return this.alpha;
    }

    @NotNull
    public final HashMap<s0.al, T0.j> getLayoutNodeToHolder() {
        return this.purple;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        for (T0.j jVar : this.alpha.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        int i10;
        boolean z10 = false;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC2264a.alpha("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2264a.alpha("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i5));
        for (T0.j jVar : this.alpha.keySet()) {
            int i11 = jVar.f2079n;
            if (i11 != Integer.MIN_VALUE && (i10 = jVar.f2080o) != Integer.MIN_VALUE) {
                jVar.measure(i11, i10);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            s0.al alVar = (s0.al) this.alpha.get(childAt);
            if (childAt.isLayoutRequested() && alVar != null) {
                s0.al.olive(alVar, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
