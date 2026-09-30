package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import id.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import s1.C2581n;
import s1.InterfaceC2578k;
import s1.InterfaceC2582o;
import t6.AbstractC3032n3;
import t6.AbstractC3056s3;

/* loaded from: classes3.dex */
public class Toolbar extends ViewGroup implements InterfaceC2578k {
    public ArrayList A;
    public b1 B;
    public final X0 C;

    /* renamed from: D, reason: collision with root package name */
    public e1 f2825D;

    /* renamed from: E, reason: collision with root package name */
    public C0469n f2826E;

    /* renamed from: F, reason: collision with root package name */
    public Z0 f2827F;

    /* renamed from: G, reason: collision with root package name */
    public Pf.j f2828G;

    /* renamed from: H, reason: collision with root package name */
    public O7.j f2829H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2830I;

    /* renamed from: J, reason: collision with root package name */
    public OnBackInvokedCallback f2831J;

    /* renamed from: K, reason: collision with root package name */
    public OnBackInvokedDispatcher f2832K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2833L;

    /* renamed from: M, reason: collision with root package name */
    public final Y f2834M;

    /* renamed from: a, reason: collision with root package name */
    public ac f2835a;
    public ActionMenuView alpha;

    /* renamed from: b, reason: collision with root package name */
    public View f2836b;

    /* renamed from: c, reason: collision with root package name */
    public Context f2837c;

    /* renamed from: d, reason: collision with root package name */
    public int f2838d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2839f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2840g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2841h;

    /* renamed from: i, reason: collision with root package name */
    public int f2842i;

    /* renamed from: j, reason: collision with root package name */
    public int f2843j;

    /* renamed from: k, reason: collision with root package name */
    public int f2844k;

    /* renamed from: l, reason: collision with root package name */
    public int f2845l;

    /* renamed from: m, reason: collision with root package name */
    public C0491y0 f2846m;

    /* renamed from: n, reason: collision with root package name */
    public int f2847n;

    /* renamed from: o, reason: collision with root package name */
    public int f2848o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2849p;
    public AppCompatTextView purple;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2850q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2851r;
    public AppCompatTextView red;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2852s;
    public ac silver;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f2853t;
    public AppCompatImageView teal;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2854u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2855v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2856w;
    public final Drawable white;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f2857x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2858y;
    public final CharSequence yellow;

    /* renamed from: z, reason: collision with root package name */
    public final C2581n f2859z;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int red;
        public boolean silver;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z2;
            this.red = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.silver = z2;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red);
            parcel.writeInt(this.silver ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new an.i(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.a1, android.view.ViewGroup$MarginLayoutParams] */
    public static a1 hotel() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.bravo = 0;
        marginLayoutParams.alpha = 8388627;
        return marginLayoutParams;
    }

    public static a1 india(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof a1;
        if (z2) {
            a1 a1Var = (a1) layoutParams;
            a1 a1Var2 = new a1(a1Var);
            a1Var2.bravo = 0;
            a1Var2.bravo = a1Var.bravo;
            return a1Var2;
        }
        if (z2) {
            a1 a1Var3 = new a1((a1) layoutParams);
            a1Var3.bravo = 0;
            return a1Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            a1 a1Var4 = new a1(marginLayoutParams);
            a1Var4.bravo = 0;
            ((ViewGroup.MarginLayoutParams) a1Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) a1Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) a1Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return a1Var4;
        }
        a1 a1Var5 = new a1(layoutParams);
        a1Var5.bravo = 0;
        return a1Var5;
    }

    public static int kilo(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int lima(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // s1.InterfaceC2578k
    public final void addMenuProvider(InterfaceC2582o interfaceC2582o) {
        C2581n c2581n = this.f2859z;
        c2581n.bravo.add(interfaceC2582o);
        c2581n.alpha.run();
    }

    public final void alpha(int i4, ArrayList arrayList) {
        boolean z2;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (z2) {
            for (int i5 = childCount - 1; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                a1 a1Var = (a1) childAt.getLayoutParams();
                if (a1Var.bravo == 0 && tango(childAt)) {
                    int i10 = a1Var.alpha;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            a1 a1Var2 = (a1) childAt2.getLayoutParams();
            if (a1Var2.bravo == 0 && tango(childAt2)) {
                int i12 = a1Var2.alpha;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i12, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void bravo(View view, boolean z2) {
        a1 a1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a1Var = hotel();
        } else if (!checkLayoutParams(layoutParams)) {
            a1Var = india(layoutParams);
        } else {
            a1Var = (a1) layoutParams;
        }
        a1Var.bravo = 1;
        if (z2 && this.f2836b != null) {
            view.setLayoutParams(a1Var);
            this.f2857x.add(view);
        } else {
            addView(view, a1Var);
        }
    }

    public final void charlie() {
        if (this.f2835a == null) {
            ac acVar = new ac(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2835a = acVar;
            acVar.setImageDrawable(this.white);
            this.f2835a.setContentDescription(this.yellow);
            a1 hotel = hotel();
            hotel.alpha = (this.f2840g & 112) | 8388611;
            hotel.bravo = 2;
            this.f2835a.setLayoutParams(hotel);
            this.f2835a.setOnClickListener(new ViewOnClickListenerC0445b(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof a1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.appcompat.widget.y0] */
    public final void delta() {
        if (this.f2846m == null) {
            ?? obj = new Object();
            obj.alpha = 0;
            obj.bravo = 0;
            obj.charlie = RecyclerView.UNDEFINED_DURATION;
            obj.delta = RecyclerView.UNDEFINED_DURATION;
            obj.echo = 0;
            obj.foxtrot = 0;
            obj.golf = false;
            obj.hotel = false;
            this.f2846m = obj;
        }
    }

    public final void echo() {
        foxtrot();
        ActionMenuView actionMenuView = this.alpha;
        if (actionMenuView.alpha == null) {
            ao.l lVar = (ao.l) actionMenuView.getMenu();
            if (this.f2827F == null) {
                this.f2827F = new Z0(this);
            }
            this.alpha.setExpandedActionViewsExclusive(true);
            lVar.bravo(this.f2827F, this.f2837c);
            victor();
        }
    }

    public final void foxtrot() {
        if (this.alpha == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.alpha = actionMenuView;
            actionMenuView.setPopupTheme(this.f2838d);
            this.alpha.setOnMenuItemClickListener(this.C);
            ActionMenuView actionMenuView2 = this.alpha;
            Pf.j jVar = this.f2828G;
            X0 x02 = new X0(this);
            actionMenuView2.white = jVar;
            actionMenuView2.yellow = x02;
            a1 hotel = hotel();
            hotel.alpha = (this.f2840g & 112) | 8388613;
            this.alpha.setLayoutParams(hotel);
            bravo(this.alpha, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return hotel();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return india(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ac acVar = this.f2835a;
        if (acVar != null) {
            return acVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ac acVar = this.f2835a;
        if (acVar != null) {
            return acVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0491y0 c0491y0 = this.f2846m;
        if (c0491y0 != null) {
            if (c0491y0.golf) {
                return c0491y0.alpha;
            }
            return c0491y0.bravo;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f2848o;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0491y0 c0491y0 = this.f2846m;
        if (c0491y0 != null) {
            return c0491y0.alpha;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0491y0 c0491y0 = this.f2846m;
        if (c0491y0 != null) {
            return c0491y0.bravo;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0491y0 c0491y0 = this.f2846m;
        if (c0491y0 != null) {
            if (c0491y0.golf) {
                return c0491y0.bravo;
            }
            return c0491y0.alpha;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f2847n;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ao.l lVar;
        ActionMenuView actionMenuView = this.alpha;
        if (actionMenuView != null && (lVar = actionMenuView.alpha) != null && lVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2848o, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2847n, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.teal;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.teal;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        echo();
        return this.alpha.getMenu();
    }

    public View getNavButtonView() {
        return this.silver;
    }

    public CharSequence getNavigationContentDescription() {
        ac acVar = this.silver;
        if (acVar != null) {
            return acVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ac acVar = this.silver;
        if (acVar != null) {
            return acVar.getDrawable();
        }
        return null;
    }

    public C0469n getOuterActionMenuPresenter() {
        return this.f2826E;
    }

    public Drawable getOverflowIcon() {
        echo();
        return this.alpha.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2837c;
    }

    public int getPopupTheme() {
        return this.f2838d;
    }

    public CharSequence getSubtitle() {
        return this.f2851r;
    }

    public final TextView getSubtitleTextView() {
        return this.red;
    }

    public CharSequence getTitle() {
        return this.f2850q;
    }

    public int getTitleMarginBottom() {
        return this.f2845l;
    }

    public int getTitleMarginEnd() {
        return this.f2843j;
    }

    public int getTitleMarginStart() {
        return this.f2842i;
    }

    public int getTitleMarginTop() {
        return this.f2844k;
    }

    public final TextView getTitleTextView() {
        return this.purple;
    }

    public Q getWrapper() {
        if (this.f2825D == null) {
            this.f2825D = new e1(this, true);
        }
        return this.f2825D;
    }

    public final void golf() {
        if (this.silver == null) {
            this.silver = new ac(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a1 hotel = hotel();
            hotel.alpha = (this.f2840g & 112) | 8388611;
            this.silver.setLayoutParams(hotel);
        }
    }

    public final int juliet(int i4, View view) {
        int i5;
        a1 a1Var = (a1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 > 0) {
            i5 = (measuredHeight - i4) / 2;
        } else {
            i5 = 0;
        }
        int i10 = a1Var.alpha & 112;
        if (i10 != 16 && i10 != 48 && i10 != 80) {
            i10 = this.f2849p & 112;
        }
        if (i10 != 48) {
            if (i10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i11 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i12 = ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                if (i11 < i12) {
                    i11 = i12;
                } else {
                    int i13 = (((height - paddingBottom) - measuredHeight) - i11) - paddingTop;
                    int i14 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
                    if (i13 < i14) {
                        i11 = Math.max(0, i11 - (i14 - i13));
                    }
                }
                return paddingTop + i11;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin) - i5;
        }
        return getPaddingTop() - i5;
    }

    public final void mike() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f2859z.bravo.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.az) ((InterfaceC2582o) it2.next())).alpha.kilo(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.A = currentMenuItems2;
    }

    public final boolean november(View view) {
        if (view.getParent() != this && !this.f2857x.contains(view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        victor();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2834M);
        victor();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2855v = false;
        }
        if (!this.f2855v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2855v = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2855v = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int max;
        boolean tango;
        boolean tango2;
        boolean z11;
        int i15;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        boolean z12;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int size;
        int i23;
        int i24;
        int size2;
        int i25;
        int size3;
        int i26;
        int i27;
        int i28;
        int size4;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i29 = width - paddingRight;
        int[] iArr = this.f2858y;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = s1.au.alpha;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight >= 0) {
            i12 = Math.min(minimumHeight, i11 - i5);
        } else {
            i12 = 0;
        }
        if (tango(this.silver)) {
            if (z10) {
                i14 = quebec(this.silver, i29, i12, iArr);
                i13 = paddingLeft;
                if (tango(this.f2835a)) {
                    if (z10) {
                        i14 = quebec(this.f2835a, i14, i12, iArr);
                    } else {
                        i13 = papa(this.f2835a, i13, i12, iArr);
                    }
                }
                if (tango(this.alpha)) {
                    if (z10) {
                        i13 = papa(this.alpha, i13, i12, iArr);
                    } else {
                        i14 = quebec(this.alpha, i14, i12, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i13);
                iArr[1] = Math.max(0, currentContentInsetRight - (i29 - i14));
                max = Math.max(i13, currentContentInsetLeft);
                int min = Math.min(i14, i29 - currentContentInsetRight);
                if (tango(this.f2836b)) {
                    if (z10) {
                        min = quebec(this.f2836b, min, i12, iArr);
                    } else {
                        max = papa(this.f2836b, max, i12, iArr);
                    }
                }
                if (tango(this.teal)) {
                    if (z10) {
                        min = quebec(this.teal, min, i12, iArr);
                    } else {
                        max = papa(this.teal, max, i12, iArr);
                    }
                }
                tango = tango(this.purple);
                tango2 = tango(this.red);
                if (!tango) {
                    a1 a1Var = (a1) this.purple.getLayoutParams();
                    z11 = z10;
                    i15 = this.purple.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
                } else {
                    z11 = z10;
                    i15 = 0;
                }
                if (!tango2) {
                    a1 a1Var2 = (a1) this.red.getLayoutParams();
                    i15 = this.red.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin + ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin + i15;
                }
                if (!tango || tango2) {
                    if (!tango) {
                        appCompatTextView = this.purple;
                    } else {
                        appCompatTextView = this.red;
                    }
                    if (!tango2) {
                        appCompatTextView2 = this.red;
                    } else {
                        appCompatTextView2 = this.purple;
                    }
                    a1 a1Var3 = (a1) appCompatTextView.getLayoutParams();
                    a1 a1Var4 = (a1) appCompatTextView2.getLayoutParams();
                    int i30 = i15;
                    if ((!tango && this.purple.getMeasuredWidth() > 0) || (tango2 && this.red.getMeasuredWidth() > 0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i16 = this.f2849p & 112;
                    int i31 = max;
                    if (i16 == 48) {
                        if (i16 != 80) {
                            int i32 = (((height - paddingTop2) - paddingBottom) - i30) / 2;
                            int i33 = ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f2844k;
                            if (i32 < i33) {
                                i32 = i33;
                            } else {
                                int i34 = (((height - paddingBottom) - i30) - i32) - paddingTop2;
                                int i35 = ((ViewGroup.MarginLayoutParams) a1Var3).bottomMargin;
                                int i36 = this.f2845l;
                                if (i34 < i35 + i36) {
                                    i32 = Math.max(0, i32 - ((((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin + i36) - i34));
                                }
                            }
                            paddingTop = paddingTop2 + i32;
                        } else {
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin) - this.f2845l) - i30;
                        }
                    } else {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f2844k;
                    }
                    if (!z11) {
                        if (z12) {
                            i20 = this.f2842i;
                        } else {
                            i20 = 0;
                        }
                        int i37 = i20 - iArr[1];
                        min -= Math.max(0, i37);
                        iArr[1] = Math.max(0, -i37);
                        if (tango) {
                            a1 a1Var5 = (a1) this.purple.getLayoutParams();
                            int measuredWidth = min - this.purple.getMeasuredWidth();
                            int measuredHeight = this.purple.getMeasuredHeight() + paddingTop;
                            this.purple.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i21 = measuredWidth - this.f2843j;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin;
                        } else {
                            i21 = min;
                        }
                        if (tango2) {
                            int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.red.getLayoutParams())).topMargin;
                            this.red.layout(min - this.red.getMeasuredWidth(), i38, min, this.red.getMeasuredHeight() + i38);
                            i22 = min - this.f2843j;
                        } else {
                            i22 = min;
                        }
                        if (z12) {
                            min = Math.min(i21, i22);
                        }
                        max = i31;
                    } else {
                        if (z12) {
                            i17 = this.f2842i;
                        } else {
                            i17 = 0;
                        }
                        int i39 = i17 - iArr[0];
                        max = Math.max(0, i39) + i31;
                        iArr[0] = Math.max(0, -i39);
                        if (tango) {
                            a1 a1Var6 = (a1) this.purple.getLayoutParams();
                            int measuredWidth2 = this.purple.getMeasuredWidth() + max;
                            int measuredHeight2 = this.purple.getMeasuredHeight() + paddingTop;
                            this.purple.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i18 = measuredWidth2 + this.f2843j;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) a1Var6).bottomMargin;
                        } else {
                            i18 = max;
                        }
                        if (tango2) {
                            int i40 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.red.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.red.getMeasuredWidth() + max;
                            this.red.layout(max, i40, measuredWidth3, this.red.getMeasuredHeight() + i40);
                            i19 = measuredWidth3 + this.f2843j;
                        } else {
                            i19 = max;
                        }
                        if (z12) {
                            max = Math.max(i18, i19);
                        }
                    }
                }
                ArrayList arrayList = this.f2856w;
                alpha(3, arrayList);
                size = arrayList.size();
                i23 = max;
                for (i24 = 0; i24 < size; i24++) {
                    i23 = papa((View) arrayList.get(i24), i23, i12, iArr);
                }
                alpha(5, arrayList);
                size2 = arrayList.size();
                for (i25 = 0; i25 < size2; i25++) {
                    min = quebec((View) arrayList.get(i25), min, i12, iArr);
                }
                alpha(1, arrayList);
                int i41 = iArr[0];
                int i42 = iArr[1];
                size3 = arrayList.size();
                int i43 = i42;
                int i44 = i41;
                i26 = 0;
                int i45 = 0;
                while (i26 < size3) {
                    View view = (View) arrayList.get(i26);
                    a1 a1Var7 = (a1) view.getLayoutParams();
                    int i46 = i26;
                    int i47 = ((ViewGroup.MarginLayoutParams) a1Var7).leftMargin - i44;
                    int i48 = ((ViewGroup.MarginLayoutParams) a1Var7).rightMargin - i43;
                    int max2 = Math.max(0, i47);
                    int max3 = Math.max(0, i48);
                    int max4 = Math.max(0, -i47);
                    int max5 = Math.max(0, -i48);
                    i45 += view.getMeasuredWidth() + max2 + max3;
                    i43 = max5;
                    i44 = max4;
                    i26 = i46 + 1;
                }
                i28 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i45 / 2);
                int i49 = i45 + i28;
                if (i28 >= i23) {
                    if (i49 > min) {
                        i23 = i28 - (i49 - min);
                    } else {
                        i23 = i28;
                    }
                }
                size4 = arrayList.size();
                for (i27 = 0; i27 < size4; i27++) {
                    i23 = papa((View) arrayList.get(i27), i23, i12, iArr);
                }
                arrayList.clear();
            }
            i13 = papa(this.silver, paddingLeft, i12, iArr);
        } else {
            i13 = paddingLeft;
        }
        i14 = i29;
        if (tango(this.f2835a)) {
        }
        if (tango(this.alpha)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i13);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i29 - i14));
        max = Math.max(i13, currentContentInsetLeft2);
        int min2 = Math.min(i14, i29 - currentContentInsetRight2);
        if (tango(this.f2836b)) {
        }
        if (tango(this.teal)) {
        }
        tango = tango(this.purple);
        tango2 = tango(this.red);
        if (!tango) {
        }
        if (!tango2) {
        }
        if (!tango) {
        }
        if (!tango) {
        }
        if (!tango2) {
        }
        a1 a1Var32 = (a1) appCompatTextView.getLayoutParams();
        a1 a1Var42 = (a1) appCompatTextView2.getLayoutParams();
        int i302 = i15;
        if (!tango) {
        }
        z12 = false;
        i16 = this.f2849p & 112;
        int i312 = max;
        if (i16 == 48) {
        }
        if (!z11) {
        }
        ArrayList arrayList2 = this.f2856w;
        alpha(3, arrayList2);
        size = arrayList2.size();
        i23 = max;
        while (i24 < size) {
        }
        alpha(5, arrayList2);
        size2 = arrayList2.size();
        while (i25 < size2) {
        }
        alpha(1, arrayList2);
        int i412 = iArr[0];
        int i422 = iArr[1];
        size3 = arrayList2.size();
        int i432 = i422;
        int i442 = i412;
        i26 = 0;
        int i452 = 0;
        while (i26 < size3) {
        }
        i28 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i452 / 2);
        int i492 = i452 + i28;
        if (i28 >= i23) {
        }
        size4 = arrayList2.size();
        while (i27 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        char c3;
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2 = m1.alpha;
        int i17 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c3 = 0;
        } else {
            c3 = 1;
            objArr = false;
        }
        if (tango(this.silver)) {
            sierra(this.silver, i4, 0, i5, this.f2841h);
            i10 = kilo(this.silver) + this.silver.getMeasuredWidth();
            i11 = Math.max(0, lima(this.silver) + this.silver.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.silver.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (tango(this.f2835a)) {
            sierra(this.f2835a, i4, 0, i5, this.f2841h);
            i10 = kilo(this.f2835a) + this.f2835a.getMeasuredWidth();
            i11 = Math.max(i11, lima(this.f2835a) + this.f2835a.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f2835a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i10);
        int max2 = Math.max(0, currentContentInsetStart - i10);
        Object[] objArr2 = objArr;
        int[] iArr = this.f2858y;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (tango(this.alpha)) {
            sierra(this.alpha, i4, max, i5, this.f2841h);
            i13 = kilo(this.alpha) + this.alpha.getMeasuredWidth();
            i11 = Math.max(i11, lima(this.alpha) + this.alpha.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.alpha.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i13);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i13);
        if (tango(this.f2836b)) {
            max3 += romeo(this.f2836b, i4, max3, i5, 0, iArr);
            i11 = Math.max(i11, lima(this.f2836b) + this.f2836b.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f2836b.getMeasuredState());
        }
        if (tango(this.teal)) {
            max3 += romeo(this.teal, i4, max3, i5, 0, iArr);
            i11 = Math.max(i11, lima(this.teal) + this.teal.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.teal.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((a1) childAt.getLayoutParams()).bravo == 0 && tango(childAt)) {
                max3 += romeo(childAt, i4, max3, i5, 0, iArr);
                int max4 = Math.max(i11, lima(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
                i11 = max4;
            } else {
                max3 = max3;
            }
        }
        int i19 = max3;
        int i20 = this.f2844k + this.f2845l;
        int i21 = this.f2842i + this.f2843j;
        if (tango(this.purple)) {
            romeo(this.purple, i4, i19 + i21, i5, i20, iArr);
            int kilo = kilo(this.purple) + this.purple.getMeasuredWidth();
            i14 = lima(this.purple) + this.purple.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i12, this.purple.getMeasuredState());
            i16 = kilo;
        } else {
            i14 = 0;
            i15 = i12;
            i16 = 0;
        }
        if (tango(this.red)) {
            i16 = Math.max(i16, romeo(this.red, i4, i19 + i21, i5, i20 + i14, iArr));
            i14 += lima(this.red) + this.red.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i15, this.red.getMeasuredState());
        }
        int max5 = Math.max(i11, i14);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i19 + i16;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & i15);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i15 << 16);
        if (this.f2830I) {
            int childCount2 = getChildCount();
            for (int i22 = 0; i22 < childCount2; i22++) {
                View childAt2 = getChildAt(i22);
                if (!tango(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ao.l lVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        ActionMenuView actionMenuView = this.alpha;
        if (actionMenuView != null) {
            lVar = actionMenuView.alpha;
        } else {
            lVar = null;
        }
        int i4 = savedState.red;
        if (i4 != 0 && this.f2827F != null && lVar != null && (findItem = lVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (savedState.silver) {
            Y y10 = this.f2834M;
            removeCallbacks(y10);
            post(y10);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        delta();
        C0491y0 c0491y0 = this.f2846m;
        boolean z2 = true;
        if (i4 != 1) {
            z2 = false;
        }
        if (z2 == c0491y0.golf) {
            return;
        }
        c0491y0.golf = z2;
        if (c0491y0.hotel) {
            if (z2) {
                int i5 = c0491y0.delta;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = c0491y0.echo;
                }
                c0491y0.alpha = i5;
                int i10 = c0491y0.charlie;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = c0491y0.foxtrot;
                }
                c0491y0.bravo = i10;
                return;
            }
            int i11 = c0491y0.charlie;
            if (i11 == Integer.MIN_VALUE) {
                i11 = c0491y0.echo;
            }
            c0491y0.alpha = i11;
            int i12 = c0491y0.delta;
            if (i12 == Integer.MIN_VALUE) {
                i12 = c0491y0.foxtrot;
            }
            c0491y0.bravo = i12;
            return;
        }
        c0491y0.alpha = c0491y0.echo;
        c0491y0.bravo = c0491y0.foxtrot;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.Toolbar$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ao.n nVar;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        Z0 z02 = this.f2827F;
        if (z02 != null && (nVar = z02.purple) != null) {
            absSavedState.red = nVar.alpha;
        }
        absSavedState.silver = oscar();
        return absSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2854u = false;
        }
        if (!this.f2854u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2854u = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2854u = false;
        return true;
    }

    public final boolean oscar() {
        C0469n c0469n;
        ActionMenuView actionMenuView = this.alpha;
        if (actionMenuView != null && (c0469n = actionMenuView.teal) != null && c0469n.juliet()) {
            return true;
        }
        return false;
    }

    public final int papa(View view, int i4, int i5, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin - iArr[0];
        int max = Math.max(0, i10) + i4;
        iArr[0] = Math.max(0, -i10);
        int juliet = juliet(i5, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, juliet, max + measuredWidth, view.getMeasuredHeight() + juliet);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + max;
    }

    public final int quebec(View view, int i4, int i5, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int juliet = juliet(i5, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, juliet, max, view.getMeasuredHeight() + juliet);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin);
    }

    @Override // s1.InterfaceC2578k
    public final void removeMenuProvider(InterfaceC2582o interfaceC2582o) {
        this.f2859z.bravo(interfaceC2582o);
    }

    public final int romeo(View view, int i4, int i5, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i13) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f2833L != z2) {
            this.f2833L = z2;
            victor();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setCollapsible(boolean z2) {
        this.f2830I = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i4 != this.f2848o) {
            this.f2848o = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i4 != this.f2847n) {
            this.f2847n = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC3032n3.echo(i4, getContext()));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        golf();
        this.silver.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b1 b1Var) {
        this.B = b1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        echo();
        this.alpha.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f2838d != i4) {
            this.f2838d = i4;
            if (i4 == 0) {
                this.f2837c = getContext();
            } else {
                this.f2837c = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f2845l = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f2843j = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f2842i = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f2844k = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final void sierra(View view, int i4, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean tango(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final boolean uniform() {
        C0469n c0469n;
        ActionMenuView actionMenuView = this.alpha;
        if (actionMenuView != null && (c0469n = actionMenuView.teal) != null && c0469n.november()) {
            return true;
        }
        return false;
    }

    public final void victor() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher alpha = Y0.alpha(this);
            Z0 z02 = this.f2827F;
            if (z02 != null && z02.purple != null && alpha != null && isAttachedToWindow() && this.f2833L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.f2832K == null) {
                if (this.f2831J == null) {
                    this.f2831J = Y0.bravo(new W0(this, 0));
                }
                Y0.charlie(alpha, this.f2831J);
                this.f2832K = alpha;
                return;
            }
            if (!z2 && (onBackInvokedDispatcher = this.f2832K) != null) {
                Y0.delta(onBackInvokedDispatcher, this.f2831J);
                this.f2832K = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2849p = 8388627;
        this.f2856w = new ArrayList();
        this.f2857x = new ArrayList();
        this.f2858y = new int[2];
        this.f2859z = new C2581n(new W0(this, 1));
        this.A = new ArrayList();
        this.C = new X0(this);
        this.f2834M = new Y(this, 1);
        Context context2 = getContext();
        int[] iArr = aj.a.yankee;
        C1915c victor = C1915c.victor(context2, attributeSet, iArr, R.attr.toolbarStyle);
        s1.au.mike(this, context, iArr, attributeSet, (TypedArray) victor.red, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) victor.red;
        this.e = typedArray.getResourceId(28, 0);
        this.f2839f = typedArray.getResourceId(19, 0);
        this.f2849p = typedArray.getInteger(0, 8388627);
        this.f2840g = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2845l = dimensionPixelOffset;
        this.f2844k = dimensionPixelOffset;
        this.f2843j = dimensionPixelOffset;
        this.f2842i = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2842i = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2843j = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2844k = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2845l = dimensionPixelOffset5;
        }
        this.f2841h = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        delta();
        C0491y0 c0491y0 = this.f2846m;
        c0491y0.hotel = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0491y0.echo = dimensionPixelSize;
            c0491y0.alpha = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0491y0.foxtrot = dimensionPixelSize2;
            c0491y0.bravo = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0491y0.alpha(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2847n = typedArray.getDimensionPixelOffset(10, RecyclerView.UNDEFINED_DURATION);
        this.f2848o = typedArray.getDimensionPixelOffset(6, RecyclerView.UNDEFINED_DURATION);
        this.white = victor.oscar(4);
        this.yellow = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2837c = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable oscar = victor.oscar(16);
        if (oscar != null) {
            setNavigationIcon(oscar);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable oscar2 = victor.oscar(11);
        if (oscar2 != null) {
            setLogo(oscar2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(victor.november(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(victor.november(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        victor.xray();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.a1, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.alpha = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.bravo);
        marginLayoutParams.alpha = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.bravo = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            charlie();
        }
        ac acVar = this.f2835a;
        if (acVar != null) {
            acVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            charlie();
            this.f2835a.setImageDrawable(drawable);
        } else {
            ac acVar = this.f2835a;
            if (acVar != null) {
                acVar.setImageDrawable(this.white);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.teal == null) {
                this.teal = new AppCompatImageView(getContext(), null);
            }
            if (!november(this.teal)) {
                bravo(this.teal, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.teal;
            if (appCompatImageView != null && november(appCompatImageView)) {
                removeView(this.teal);
                this.f2857x.remove(this.teal);
            }
        }
        AppCompatImageView appCompatImageView2 = this.teal;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.teal == null) {
            this.teal = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.teal;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            golf();
        }
        ac acVar = this.silver;
        if (acVar != null) {
            acVar.setContentDescription(charSequence);
            AbstractC3056s3.alpha(this.silver, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            golf();
            if (!november(this.silver)) {
                bravo(this.silver, true);
            }
        } else {
            ac acVar = this.silver;
            if (acVar != null && november(acVar)) {
                removeView(this.silver);
                this.f2857x.remove(this.silver);
            }
        }
        ac acVar2 = this.silver;
        if (acVar2 != null) {
            acVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.red == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.red = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.red.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f2839f;
                if (i4 != 0) {
                    this.red.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f2853t;
                if (colorStateList != null) {
                    this.red.setTextColor(colorStateList);
                }
            }
            if (!november(this.red)) {
                bravo(this.red, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.red;
            if (appCompatTextView2 != null && november(appCompatTextView2)) {
                removeView(this.red);
                this.f2857x.remove(this.red);
            }
        }
        AppCompatTextView appCompatTextView3 = this.red;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2851r = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2853t = colorStateList;
        AppCompatTextView appCompatTextView = this.red;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.purple == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.purple = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.purple.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.e;
                if (i4 != 0) {
                    this.purple.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f2852s;
                if (colorStateList != null) {
                    this.purple.setTextColor(colorStateList);
                }
            }
            if (!november(this.purple)) {
                bravo(this.purple, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.purple;
            if (appCompatTextView2 != null && november(appCompatTextView2)) {
                removeView(this.purple);
                this.f2857x.remove(this.purple);
            }
        }
        AppCompatTextView appCompatTextView3 = this.purple;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2850q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2852s = colorStateList;
        AppCompatTextView appCompatTextView = this.purple;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
