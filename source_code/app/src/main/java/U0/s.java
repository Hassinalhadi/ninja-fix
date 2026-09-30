package U0;

import F.C0088b;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import s1.InterfaceC2587u;
import s1.a0;
import s1.al;
import s1.au;
import t0.AbstractC2902a;

/* loaded from: classes3.dex */
public final class s extends AbstractC2902a implements InterfaceC2587u {

    /* renamed from: b, reason: collision with root package name */
    public final Window f2094b;

    /* renamed from: c, reason: collision with root package name */
    public final ax f2095c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2096d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2097f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2098g;

    public s(Context context, Window window) {
        super(context, null);
        this.f2094b = window;
        this.f2095c = C0564b.zulu(q.alpha);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(this, this);
        au.papa(this, new T0.a(this, 1));
    }

    @Override // t0.AbstractC2902a
    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1735448596);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            ((Xd.l) ((t0) this.f2095c).getValue()).invoke(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0088b(this, i4, 4);
        }
    }

    @Override // t0.AbstractC2902a
    public final void foxtrot(boolean z2, int i4, int i5, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i12 = i10 - i4;
        int i13 = i11 - i5;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i12 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i13 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // t0.AbstractC2902a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2098g;
    }

    @Override // s1.InterfaceC2587u
    public final a0 gold(View view, a0 a0Var) {
        if (!this.e) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return a0Var.alpha.november(max, max2, max3, max4);
            }
        }
        return a0Var;
    }

    @Override // t0.AbstractC2902a
    public final void golf(int i4, int i5) {
        int i10;
        int min;
        int i11 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.golf(i4, i5);
            return;
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        Window window = this.f2094b;
        if (mode == Integer.MIN_VALUE && !this.f2096d && !this.e && window.getAttributes().height == -2) {
            i10 = size2 + 1;
        } else {
            i10 = size2;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i12 = size - paddingRight;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = i10 - paddingBottom;
        if (i13 >= 0) {
            i11 = i13;
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        if (mode2 != 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(i12, RecyclerView.UNDEFINED_DURATION);
        }
        if (mode != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(i11, RecyclerView.UNDEFINED_DURATION);
        }
        childAt.measure(i4, i5);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
        } else {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                min = childAt.getMeasuredHeight() + paddingBottom;
            } else {
                min = size2;
            }
        } else {
            min = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, min);
        if (!this.e && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            if (!this.f2096d) {
                window.setLayout(-1, -1);
            }
        }
    }
}
