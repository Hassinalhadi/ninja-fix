package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;

/* loaded from: classes3.dex */
public class ActionMenuView extends LinearLayoutCompat implements ao.k, ao.z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2803a;
    public ao.l alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f2804b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2805c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2806d;
    public r e;
    public Context purple;
    public int red;
    public boolean silver;
    public C0469n teal;
    public Pf.j white;
    public ao.j yellow;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f2805c = (int) (56.0f * f5);
        this.f2806d = (int) (f5 * 4.0f);
        this.purple = context;
        this.red = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.q, android.widget.LinearLayout$LayoutParams] */
    public static C0475q delta() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.alpha = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.widget.q, android.widget.LinearLayout$LayoutParams] */
    public static C0475q echo(ViewGroup.LayoutParams layoutParams) {
        C0475q c0475q;
        if (layoutParams != null) {
            if (layoutParams instanceof C0475q) {
                C0475q c0475q2 = (C0475q) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0475q2);
                layoutParams2.alpha = c0475q2.alpha;
                c0475q = layoutParams2;
            } else {
                c0475q = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0475q).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0475q).gravity = 16;
            }
            return c0475q;
        }
        return delta();
    }

    @Override // ao.z
    public final void alpha(ao.l lVar) {
        this.alpha = lVar;
    }

    @Override // ao.k
    public final boolean bravo(ao.n nVar) {
        return this.alpha.quebec(nVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0475q;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean foxtrot(int i4) {
        boolean z2 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC0471o)) {
            z2 = ((InterfaceC0471o) childAt).alpha();
        }
        if (i4 > 0 && (childAt2 instanceof InterfaceC0471o)) {
            return ((InterfaceC0471o) childAt2).bravo() | z2;
        }
        return z2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return delta();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return echo(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Menu getMenu() {
        if (this.alpha == null) {
            Context context = getContext();
            ao.l lVar = new ao.l(context);
            this.alpha = lVar;
            lVar.teal = new C0465l(1, this);
            C0469n c0469n = new C0469n(context);
            this.teal = c0469n;
            c0469n.f2905f = true;
            c0469n.f2906g = true;
            Pf.j jVar = this.white;
            Pf.j jVar2 = jVar;
            if (jVar == null) {
                jVar2 = new Object();
            }
            c0469n.teal = jVar2;
            this.alpha.bravo(c0469n, this.purple);
            C0469n c0469n2 = this.teal;
            c0469n2.f2901a = this;
            this.alpha = c0469n2.red;
        }
        return this.alpha;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0469n c0469n = this.teal;
        C0463k c0463k = c0469n.f2903c;
        if (c0463k != null) {
            return c0463k.getDrawable();
        }
        if (c0469n.e) {
            return c0469n.f2904d;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.red;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0469n c0469n = this.teal;
        if (c0469n != null) {
            c0469n.india();
            if (this.teal.juliet()) {
                this.teal.golf();
                this.teal.november();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0469n c0469n = this.teal;
        if (c0469n != null) {
            c0469n.golf();
            C0455g c0455g = c0469n.f2913n;
            if (c0455g != null && c0455g.bravo()) {
                c0455g.india.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        boolean z10;
        int i12;
        int width;
        int i13;
        if (!this.f2803a) {
            super.onLayout(z2, i4, i5, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i11 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i10 - i4;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = m1.alpha;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C0475q c0475q = (C0475q) childAt.getLayoutParams();
                if (c0475q.alpha) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (foxtrot(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0475q).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0475q).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0475q).leftMargin) + ((LinearLayout.LayoutParams) c0475q).rightMargin;
                    foxtrot(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        if (i22 > 0) {
            i12 = paddingRight / i22;
        } else {
            i12 = 0;
        }
        int max = Math.max(0, i12);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C0475q c0475q2 = (C0475q) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0475q2.alpha) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c0475q2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0475q2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C0475q c0475q3 = (C0475q) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0475q3.alpha) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) c0475q3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0475q3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        ?? r11;
        boolean z12;
        int i14;
        int i15;
        ActionMenuItemView actionMenuItemView;
        boolean z13;
        int i16;
        boolean z14;
        ao.l lVar;
        boolean z15 = this.f2803a;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2803a = z2;
        if (z15 != z2) {
            this.f2804b = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f2803a && (lVar = this.alpha) != null && size != this.f2804b) {
            this.f2804b = size;
            lVar.papa(true);
        }
        int childCount = getChildCount();
        if (this.f2803a && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i5);
            int size2 = View.MeasureSpec.getSize(i4);
            int size3 = View.MeasureSpec.getSize(i5);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
            int i17 = size2 - paddingRight;
            int i18 = this.f2805c;
            int i19 = i17 / i18;
            int i20 = i17 % i18;
            if (i19 == 0) {
                setMeasuredDimension(i17, 0);
                return;
            }
            int i21 = (i20 / i19) + i18;
            int childCount2 = getChildCount();
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            boolean z16 = false;
            int i26 = 0;
            long j5 = 0;
            while (true) {
                i10 = this.f2806d;
                if (i25 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i25);
                int i27 = size3;
                int i28 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i15 = i21;
                } else {
                    boolean z17 = childAt instanceof ActionMenuItemView;
                    i23++;
                    if (z17) {
                        childAt.setPadding(i10, 0, i10, 0);
                    }
                    C0475q c0475q = (C0475q) childAt.getLayoutParams();
                    c0475q.foxtrot = false;
                    c0475q.charlie = 0;
                    c0475q.bravo = 0;
                    c0475q.delta = false;
                    ((LinearLayout.LayoutParams) c0475q).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c0475q).rightMargin = 0;
                    if (z17 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c0475q.echo = z12;
                    if (c0475q.alpha) {
                        i14 = 1;
                    } else {
                        i14 = i19;
                    }
                    C0475q c0475q2 = (C0475q) childAt.getLayoutParams();
                    int i29 = i19;
                    i15 = i21;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z17) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z13;
                    if (i14 > 0 && (!z13 || i14 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i16 = measuredWidth / i15;
                        if (measuredWidth % i15 != 0) {
                            i16++;
                        }
                        if (z18 && i16 < 2) {
                            i16 = 2;
                        }
                    } else {
                        i16 = 0;
                    }
                    if (!c0475q2.alpha && z18) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c0475q2.delta = z14;
                    c0475q2.bravo = i16;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, 1073741824), makeMeasureSpec);
                    i24 = Math.max(i24, i16);
                    if (c0475q.delta) {
                        i26++;
                    }
                    if (c0475q.alpha) {
                        z16 = true;
                    }
                    i19 = i29 - i16;
                    i22 = Math.max(i22, childAt.getMeasuredHeight());
                    if (i16 == 1) {
                        j5 |= 1 << i25;
                    }
                }
                i25++;
                size3 = i27;
                paddingBottom = i28;
                i21 = i15;
            }
            int i30 = size3;
            int i31 = i19;
            int i32 = i21;
            if (z16 && i23 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i33 = i31;
            boolean z19 = false;
            while (i26 > 0 && i33 > 0) {
                int i34 = LottieConstants.IterateForever;
                long j6 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i36 < childCount2) {
                    boolean z20 = z10;
                    C0475q c0475q3 = (C0475q) getChildAt(i36).getLayoutParams();
                    int i37 = i22;
                    if (c0475q3.delta) {
                        int i38 = c0475q3.bravo;
                        if (i38 < i34) {
                            j6 = 1 << i36;
                            i34 = i38;
                            i35 = 1;
                        } else if (i38 == i34) {
                            j6 |= 1 << i36;
                            i35++;
                        }
                    }
                    i36++;
                    i22 = i37;
                    z10 = z20;
                }
                boolean z21 = z10;
                i11 = i22;
                j5 |= j6;
                if (i35 > i33) {
                    break;
                }
                int i39 = i34 + 1;
                int i40 = 0;
                while (i40 < childCount2) {
                    View childAt2 = getChildAt(i40);
                    C0475q c0475q4 = (C0475q) childAt2.getLayoutParams();
                    boolean z22 = z16;
                    long j7 = 1 << i40;
                    if ((j6 & j7) == 0) {
                        if (c0475q4.bravo == i39) {
                            j5 |= j7;
                        }
                    } else {
                        if (z21 && c0475q4.echo) {
                            r11 = 1;
                            r11 = 1;
                            if (i33 == 1) {
                                childAt2.setPadding(i10 + i32, 0, i10, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        c0475q4.bravo += r11;
                        c0475q4.foxtrot = r11;
                        i33--;
                    }
                    i40++;
                    z16 = z22;
                }
                i22 = i11;
                z10 = z21;
                z19 = true;
            }
            i11 = i22;
            if (!z16 && i23 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i33 > 0 && j5 != 0 && (i33 < i23 - 1 || z11 || i24 > 1)) {
                float bitCount = Long.bitCount(j5);
                if (!z11) {
                    if ((j5 & 1) != 0 && !((C0475q) getChildAt(0).getLayoutParams()).echo) {
                        bitCount -= 0.5f;
                    }
                    int i41 = childCount2 - 1;
                    if ((j5 & (1 << i41)) != 0 && !((C0475q) getChildAt(i41).getLayoutParams()).echo) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i13 = (int) ((i33 * i32) / bitCount);
                } else {
                    i13 = 0;
                }
                boolean z23 = z19;
                for (int i42 = 0; i42 < childCount2; i42++) {
                    if ((j5 & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        C0475q c0475q5 = (C0475q) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0475q5.charlie = i13;
                            c0475q5.foxtrot = true;
                            if (i42 == 0 && !c0475q5.echo) {
                                ((LinearLayout.LayoutParams) c0475q5).leftMargin = (-i13) / 2;
                            }
                            z23 = true;
                        } else if (c0475q5.alpha) {
                            c0475q5.charlie = i13;
                            c0475q5.foxtrot = true;
                            ((LinearLayout.LayoutParams) c0475q5).rightMargin = (-i13) / 2;
                            z23 = true;
                        } else {
                            if (i42 != 0) {
                                ((LinearLayout.LayoutParams) c0475q5).leftMargin = i13 / 2;
                            }
                            if (i42 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) c0475q5).rightMargin = i13 / 2;
                            }
                        }
                    }
                }
                z19 = z23;
            }
            if (z19) {
                for (int i43 = 0; i43 < childCount2; i43++) {
                    View childAt4 = getChildAt(i43);
                    C0475q c0475q6 = (C0475q) childAt4.getLayoutParams();
                    if (c0475q6.foxtrot) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0475q6.bravo * i32) + c0475q6.charlie, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i12 = i11;
            } else {
                i12 = i30;
            }
            setMeasuredDimension(i17, i12);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            C0475q c0475q7 = (C0475q) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) c0475q7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0475q7).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.teal.f2910k = z2;
    }

    public void setOnMenuItemClickListener(r rVar) {
        this.e = rVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0469n c0469n = this.teal;
        C0463k c0463k = c0469n.f2903c;
        if (c0463k != null) {
            c0463k.setImageDrawable(drawable);
        } else {
            c0469n.e = true;
            c0469n.f2904d = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.silver = z2;
    }

    public void setPopupTheme(int i4) {
        if (this.red != i4) {
            this.red = i4;
            if (i4 == 0) {
                this.purple = getContext();
            } else {
                this.purple = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C0469n c0469n) {
        this.teal = c0469n;
        c0469n.f2901a = this;
        this.alpha = c0469n.red;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C0450d0 generateDefaultLayoutParams() {
        return delta();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C0450d0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return echo(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final C0450d0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
