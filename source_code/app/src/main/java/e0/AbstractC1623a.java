package e0;

import a0.AbstractC0349c;
import a0.InterfaceC0364r;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1623a extends ViewGroup {
    public final void alpha(InterfaceC0364r interfaceC0364r, View view, long j5) {
        super.drawChild(AbstractC0349c.alpha(interfaceC0364r), view, j5);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
