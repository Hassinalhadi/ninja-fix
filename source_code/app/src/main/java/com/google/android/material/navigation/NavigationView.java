package com.google.android.material.navigation;

import a7.C0409d;
import a7.C0412g;
import a7.C0415j;
import a7.InterfaceC0407b;
import ae.C0423b;
import an.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import ao.l;
import ao.x;
import av.ah;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import com.google.android.material.internal.z;
import e7.AbstractC1632a;
import g1.AbstractC1735d;
import g7.C1755a;
import g7.aa;
import g7.m;
import g7.y;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l7.AbstractC2059a;
import s1.al;
import s1.au;
import s6.AbstractC2719n0;
import s6.G7;
import s6.R4;

/* loaded from: classes2.dex */
public class NavigationView extends t implements InterfaceC0407b {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f8085s = {R.attr.state_checked};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f8086t = {-16842910};

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.internal.f f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final q f8088b;

    /* renamed from: c, reason: collision with root package name */
    public f f8089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8090d;
    public final int[] e;

    /* renamed from: f, reason: collision with root package name */
    public i f8091f;

    /* renamed from: g, reason: collision with root package name */
    public final ao.c f8092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8094i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8095j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8096k;

    /* renamed from: l, reason: collision with root package name */
    public int f8097l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8098m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8099n;

    /* renamed from: o, reason: collision with root package name */
    public final y f8100o;

    /* renamed from: p, reason: collision with root package name */
    public final C0415j f8101p;

    /* renamed from: q, reason: collision with root package name */
    public final C0412g f8102q;

    /* renamed from: r, reason: collision with root package name */
    public final e f8103r;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public Bundle red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.red);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Type inference failed for: r14v0, types: [ao.l, com.google.android.material.internal.f, android.view.Menu] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet) {
        super(r1, attributeSet, delivery.samurai.android.R.attr.navigationViewStyle);
        y zVar;
        boolean z2;
        ColorStateList colorStateList;
        int i4;
        ColorStateList echo;
        int i5;
        ColorStateList colorStateList2;
        C1915c c1915c;
        int i10;
        NavigationMenuView navigationMenuView;
        boolean z10;
        Context alpha = AbstractC2059a.alpha(context, attributeSet, delivery.samurai.android.R.attr.navigationViewStyle, 2132083660);
        this.red = new Rect();
        this.silver = true;
        this.teal = true;
        this.white = true;
        this.yellow = true;
        TypedArray golf = z.golf(alpha, attributeSet, L6.a.emerald, delivery.samurai.android.R.attr.navigationViewStyle, 2132083661, new int[0]);
        this.alpha = golf.getDrawable(0);
        golf.recycle();
        setWillNotDraw(true);
        s sVar = new s(0, this);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(this, sVar);
        q qVar = new q();
        this.f8088b = qVar;
        this.e = new int[2];
        this.f8093h = true;
        this.f8094i = true;
        this.f8095j = true;
        this.f8096k = true;
        this.f8097l = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            zVar = new aa(this);
        } else {
            zVar = new g7.z(this);
        }
        this.f8100o = zVar;
        this.f8101p = new C0415j(this);
        this.f8102q = new C0412g(this, this);
        this.f8103r = new e(this);
        Context context2 = getContext();
        ?? lVar = new l(context2);
        this.f8087a = lVar;
        int[] iArr = L6.a.crimson;
        z.alpha(context2, attributeSet, delivery.samurai.android.R.attr.navigationViewStyle, 2132083660);
        z.bravo(context2, attributeSet, iArr, delivery.samurai.android.R.attr.navigationViewStyle, 2132083660, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, delivery.samurai.android.R.attr.navigationViewStyle, 2132083660);
        C1915c c1915c2 = new C1915c(context2, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(1)) {
            setBackground(c1915c2.oscar(1));
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f8097l = dimensionPixelSize;
        if (dimensionPixelSize == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f8098m = z2;
        this.f8099n = getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList bravo = G7.bravo(background);
        if (background == null || bravo != null) {
            g7.i iVar = new g7.i(m.charlie(context2, attributeSet, delivery.samurai.android.R.attr.navigationViewStyle, 2132083660).alpha());
            if (bravo != null) {
                iVar.quebec(bravo);
            }
            iVar.mike(context2);
            setBackground(iVar);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(obtainStyledAttributes.getBoolean(2, false));
        this.f8090d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (obtainStyledAttributes.hasValue(33)) {
            colorStateList = c1915c2.november(33);
        } else {
            colorStateList = null;
        }
        if (obtainStyledAttributes.hasValue(36)) {
            i4 = obtainStyledAttributes.getResourceId(36, 0);
        } else {
            i4 = 0;
        }
        if (i4 == 0 && colorStateList == null) {
            colorStateList = echo(R.attr.textColorSecondary);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            echo = c1915c2.november(15);
        } else {
            echo = echo(R.attr.textColorSecondary);
        }
        if (obtainStyledAttributes.hasValue(25)) {
            i5 = obtainStyledAttributes.getResourceId(25, 0);
        } else {
            i5 = 0;
        }
        boolean z11 = obtainStyledAttributes.getBoolean(26, true);
        if (obtainStyledAttributes.hasValue(14)) {
            setItemIconSize(obtainStyledAttributes.getDimensionPixelSize(14, 0));
        }
        if (obtainStyledAttributes.hasValue(27)) {
            colorStateList2 = c1915c2.november(27);
        } else {
            colorStateList2 = null;
        }
        if (i5 == 0 && colorStateList2 == null) {
            colorStateList2 = echo(R.attr.textColorPrimary);
        }
        Drawable oscar = c1915c2.oscar(11);
        if (oscar == null && (obtainStyledAttributes.hasValue(18) || obtainStyledAttributes.hasValue(19))) {
            oscar = foxtrot(c1915c2, AbstractC2719n0.bravo(getContext(), c1915c2, 20));
            ColorStateList bravo2 = AbstractC2719n0.bravo(context2, c1915c2, 17);
            if (bravo2 != null) {
                c1915c = c1915c2;
                qVar.f8069g = new RippleDrawable(AbstractC1632a.bravo(bravo2), null, foxtrot(c1915c2, null));
                qVar.juliet();
                if (!obtainStyledAttributes.hasValue(12)) {
                    i10 = 0;
                    setItemHorizontalPadding(obtainStyledAttributes.getDimensionPixelSize(12, 0));
                } else {
                    i10 = 0;
                }
                if (obtainStyledAttributes.hasValue(28)) {
                    setItemVerticalPadding(obtainStyledAttributes.getDimensionPixelSize(28, i10));
                }
                setDividerInsetStart(obtainStyledAttributes.getDimensionPixelSize(6, i10));
                setDividerInsetEnd(obtainStyledAttributes.getDimensionPixelSize(5, i10));
                setSubheaderInsetStart(obtainStyledAttributes.getDimensionPixelSize(35, i10));
                setSubheaderInsetEnd(obtainStyledAttributes.getDimensionPixelSize(34, i10));
                setTopInsetScrimEnabled(obtainStyledAttributes.getBoolean(37, this.f8093h));
                setBottomInsetScrimEnabled(obtainStyledAttributes.getBoolean(4, this.f8094i));
                setStartInsetScrimEnabled(obtainStyledAttributes.getBoolean(32, this.f8095j));
                setEndInsetScrimEnabled(obtainStyledAttributes.getBoolean(9, this.f8096k));
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(13, 0);
                setItemMaxLines(obtainStyledAttributes.getInt(16, 1));
                lVar.teal = new ah(25, this);
                qVar.silver = 1;
                qVar.charlie(context2, lVar);
                if (i4 != 0) {
                    qVar.yellow = i4;
                    qVar.golf();
                }
                qVar.f8064a = colorStateList;
                qVar.golf();
                qVar.e = echo;
                qVar.juliet();
                int overScrollMode = getOverScrollMode();
                qVar.f8083u = overScrollMode;
                navigationMenuView = qVar.alpha;
                if (navigationMenuView != null) {
                    navigationMenuView.setOverScrollMode(overScrollMode);
                }
                if (i5 != 0) {
                    qVar.f8065b = i5;
                    qVar.juliet();
                }
                qVar.f8066c = z11;
                qVar.juliet();
                qVar.f8067d = colorStateList2;
                qVar.juliet();
                qVar.f8068f = oscar;
                qVar.juliet();
                qVar.f8072j = dimensionPixelSize2;
                qVar.juliet();
                lVar.bravo(qVar, lVar.alpha);
                if (qVar.alpha == null) {
                    NavigationMenuView navigationMenuView2 = (NavigationMenuView) qVar.white.inflate(delivery.samurai.android.R.layout.design_navigation_menu, (ViewGroup) this, false);
                    qVar.alpha = navigationMenuView2;
                    navigationMenuView2.setAccessibilityDelegateCompat(new n(qVar, qVar.alpha));
                    if (qVar.teal == null) {
                        com.google.android.material.internal.i iVar2 = new com.google.android.material.internal.i(qVar);
                        qVar.teal = iVar2;
                        iVar2.setHasStableIds(true);
                    }
                    int i11 = qVar.f8083u;
                    if (i11 != -1) {
                        qVar.alpha.setOverScrollMode(i11);
                    }
                    LinearLayout linearLayout = (LinearLayout) qVar.white.inflate(delivery.samurai.android.R.layout.design_navigation_item_header, (ViewGroup) qVar.alpha, false);
                    qVar.purple = linearLayout;
                    linearLayout.setImportantForAccessibility(2);
                    qVar.alpha.setAdapter(qVar.teal);
                }
                addView(qVar.alpha);
                ?? r62 = 0;
                if (obtainStyledAttributes.hasValue(29)) {
                    int resourceId = obtainStyledAttributes.getResourceId(29, 0);
                    com.google.android.material.internal.i iVar3 = qVar.teal;
                    if (iVar3 != null) {
                        iVar3.charlie = true;
                    }
                    getMenuInflater().inflate(resourceId, lVar);
                    com.google.android.material.internal.i iVar4 = qVar.teal;
                    if (iVar4 != null) {
                        z10 = false;
                        iVar4.charlie = false;
                    } else {
                        z10 = false;
                    }
                    qVar.india();
                    r62 = z10;
                }
                if (obtainStyledAttributes.hasValue(10)) {
                    qVar.purple.addView(qVar.white.inflate(obtainStyledAttributes.getResourceId(10, r62), qVar.purple, (boolean) r62));
                    NavigationMenuView navigationMenuView3 = qVar.alpha;
                    navigationMenuView3.setPadding(r62, r62, r62, navigationMenuView3.getPaddingBottom());
                }
                c1915c.xray();
                this.f8092g = new ao.c(2, this);
                getViewTreeObserver().addOnGlobalLayoutListener(this.f8092g);
            }
        }
        c1915c = c1915c2;
        if (!obtainStyledAttributes.hasValue(12)) {
        }
        if (obtainStyledAttributes.hasValue(28)) {
        }
        setDividerInsetStart(obtainStyledAttributes.getDimensionPixelSize(6, i10));
        setDividerInsetEnd(obtainStyledAttributes.getDimensionPixelSize(5, i10));
        setSubheaderInsetStart(obtainStyledAttributes.getDimensionPixelSize(35, i10));
        setSubheaderInsetEnd(obtainStyledAttributes.getDimensionPixelSize(34, i10));
        setTopInsetScrimEnabled(obtainStyledAttributes.getBoolean(37, this.f8093h));
        setBottomInsetScrimEnabled(obtainStyledAttributes.getBoolean(4, this.f8094i));
        setStartInsetScrimEnabled(obtainStyledAttributes.getBoolean(32, this.f8095j));
        setEndInsetScrimEnabled(obtainStyledAttributes.getBoolean(9, this.f8096k));
        int dimensionPixelSize22 = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        setItemMaxLines(obtainStyledAttributes.getInt(16, 1));
        lVar.teal = new ah(25, this);
        qVar.silver = 1;
        qVar.charlie(context2, lVar);
        if (i4 != 0) {
        }
        qVar.f8064a = colorStateList;
        qVar.golf();
        qVar.e = echo;
        qVar.juliet();
        int overScrollMode2 = getOverScrollMode();
        qVar.f8083u = overScrollMode2;
        navigationMenuView = qVar.alpha;
        if (navigationMenuView != null) {
        }
        if (i5 != 0) {
        }
        qVar.f8066c = z11;
        qVar.juliet();
        qVar.f8067d = colorStateList2;
        qVar.juliet();
        qVar.f8068f = oscar;
        qVar.juliet();
        qVar.f8072j = dimensionPixelSize22;
        qVar.juliet();
        lVar.bravo(qVar, lVar.alpha);
        if (qVar.alpha == null) {
        }
        addView(qVar.alpha);
        ?? r622 = 0;
        if (obtainStyledAttributes.hasValue(29)) {
        }
        if (obtainStyledAttributes.hasValue(10)) {
        }
        c1915c.xray();
        this.f8092g = new ao.c(2, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f8092g);
    }

    private MenuInflater getMenuInflater() {
        if (this.f8091f == null) {
            this.f8091f = new i(getContext());
        }
        return this.f8091f;
    }

    @Override // a7.InterfaceC0407b
    public final void alpha(C0423b c0423b) {
        boolean z2;
        int i4 = ((I1.e) hotel().second).alpha;
        C0415j c0415j = this.f8101p;
        if (c0415j.foxtrot == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0423b c0423b2 = c0415j.foxtrot;
        c0415j.foxtrot = c0423b;
        float f5 = c0423b.charlie;
        if (c0423b2 != null) {
            if (c0423b.delta == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0415j.charlie(f5, z2, i4);
        }
        if (this.f8098m) {
            this.f8097l = M6.a.charlie(0, this.f8099n, c0415j.alpha.getInterpolation(f5));
            golf(getWidth(), getHeight());
        }
    }

    @Override // a7.InterfaceC0407b
    public final void bravo() {
        Pair hotel = hotel();
        DrawerLayout drawerLayout = (DrawerLayout) hotel.first;
        C0415j c0415j = this.f8101p;
        C0423b c0423b = c0415j.foxtrot;
        c0415j.foxtrot = null;
        if (c0423b != null && Build.VERSION.SDK_INT >= 34) {
            int i4 = ((I1.e) hotel.second).alpha;
            int i5 = b.alpha;
            c0415j.bravo(c0423b, i4, new a(this, 0, drawerLayout), new P6.b(2, drawerLayout));
            return;
        }
        drawerLayout.bravo(this, true);
    }

    @Override // a7.InterfaceC0407b
    public final void charlie(C0423b c0423b) {
        hotel();
        this.f8101p.foxtrot = c0423b;
    }

    @Override // a7.InterfaceC0407b
    public final void delta() {
        hotel();
        this.f8101p.alpha();
        if (this.f8098m && this.f8097l != 0) {
            this.f8097l = 0;
            golf(getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y yVar = this.f8100o;
        if (yVar.bravo()) {
            Path path = yVar.echo;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final ColorStateList echo(int i4) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            ColorStateList charlie = AbstractC1735d.charlie(typedValue.resourceId, getContext());
            if (!getContext().getTheme().resolveAttribute(delivery.samurai.android.R.attr.colorPrimary, typedValue, true)) {
                return null;
            }
            int i5 = typedValue.data;
            int defaultColor = charlie.getDefaultColor();
            int[] iArr = f8086t;
            return new ColorStateList(new int[][]{iArr, f8085s, FrameLayout.EMPTY_STATE_SET}, new int[]{charlie.getColorForState(iArr, defaultColor), i5, defaultColor});
        }
        return null;
    }

    public final InsetDrawable foxtrot(C1915c c1915c, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) c1915c.red;
        g7.i iVar = new g7.i(m.alpha(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).alpha());
        iVar.quebec(colorStateList);
        return new InsetDrawable((Drawable) iVar, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public C0415j getBackHelper() {
        return this.f8101p;
    }

    public MenuItem getCheckedItem() {
        return this.f8088b.teal.bravo;
    }

    public int getDividerInsetEnd() {
        return this.f8088b.f8075m;
    }

    public int getDividerInsetStart() {
        return this.f8088b.f8074l;
    }

    public int getHeaderCount() {
        return this.f8088b.purple.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f8088b.f8068f;
    }

    public int getItemHorizontalPadding() {
        return this.f8088b.f8070h;
    }

    public int getItemIconPadding() {
        return this.f8088b.f8072j;
    }

    public ColorStateList getItemIconTintList() {
        return this.f8088b.e;
    }

    public int getItemMaxLines() {
        return this.f8088b.f8080r;
    }

    public ColorStateList getItemTextColor() {
        return this.f8088b.f8067d;
    }

    public int getItemVerticalPadding() {
        return this.f8088b.f8071i;
    }

    public Menu getMenu() {
        return this.f8087a;
    }

    public int getSubheaderInsetEnd() {
        return this.f8088b.f8077o;
    }

    public int getSubheaderInsetStart() {
        return this.f8088b.f8076n;
    }

    public final void golf(int i4, int i5) {
        boolean z2;
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof I1.e)) {
            if ((this.f8097l > 0 || this.f8098m) && (getBackground() instanceof g7.i)) {
                if (Gravity.getAbsoluteGravity(((I1.e) getLayoutParams()).alpha, getLayoutDirection()) == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                g7.i iVar = (g7.i) getBackground();
                g7.l golf = iVar.purple.alpha.golf();
                golf.charlie(this.f8097l);
                if (z2) {
                    golf.echo = new C1755a(0.0f);
                    golf.hotel = new C1755a(0.0f);
                } else {
                    golf.foxtrot = new C1755a(0.0f);
                    golf.golf = new C1755a(0.0f);
                }
                m alpha = golf.alpha();
                iVar.setShapeAppearanceModel(alpha);
                y yVar = this.f8100o;
                yVar.charlie = alpha;
                yVar.charlie();
                yVar.alpha(this);
                yVar.delta = new RectF(0.0f, 0.0f, i4, i5);
                yVar.charlie();
                yVar.alpha(this);
                yVar.bravo = true;
                yVar.alpha(this);
            }
        }
    }

    public final Pair hotel() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof I1.e)) {
            return new Pair((DrawerLayout) parent, (I1.e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.t, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0409d c0409d;
        super.onAttachedToWindow();
        R4.echo(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            C0412g c0412g = this.f8102q;
            if (c0412g.alpha != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                e eVar = this.f8103r;
                if (eVar == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f3096m;
                    if (arrayList != null) {
                        arrayList.remove(eVar);
                    }
                }
                if (eVar != null) {
                    if (drawerLayout.f3096m == null) {
                        drawerLayout.f3096m = new ArrayList();
                    }
                    drawerLayout.f3096m.add(eVar);
                }
                if (DrawerLayout.kilo(this) && (c0409d = c0412g.alpha) != null) {
                    c0409d.bravo(c0412g.bravo, c0412g.charlie, true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.t, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f8092g);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            e eVar = this.f8103r;
            if (eVar == null) {
                drawerLayout.getClass();
            } else {
                ArrayList arrayList = drawerLayout.f3096m;
                if (arrayList != null) {
                    arrayList.remove(eVar);
                }
            }
        }
        C0412g c0412g = this.f8102q;
        C0409d c0409d = c0412g.alpha;
        if (c0409d != null) {
            c0409d.charlie(c0412g.charlie);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int i10 = this.f8090d;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            }
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), i10), 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        Bundle bundle = savedState.red;
        com.google.android.material.internal.f fVar = this.f8087a;
        fVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = fVar.f3215n;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int id2 = xVar.getId();
                        if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            xVar.hotel(parcelable2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.navigation.NavigationView$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable lima;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        absSavedState.red = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8087a.f3215n;
        if (copyOnWriteArrayList.isEmpty()) {
            return absSavedState;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = xVar.getId();
                if (id2 > 0 && (lima = xVar.lima()) != null) {
                    sparseArray.put(id2, lima);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        golf(i4, i5);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f8094i = z2;
    }

    public void setCheckedItem(int i4) {
        MenuItem findItem = this.f8087a.findItem(i4);
        if (findItem != null) {
            this.f8088b.teal.bravo((ao.n) findItem);
        }
    }

    public void setDividerInsetEnd(int i4) {
        q qVar = this.f8088b;
        qVar.f8075m = i4;
        qVar.alpha();
    }

    public void setDividerInsetStart(int i4) {
        q qVar = this.f8088b;
        qVar.f8074l = i4;
        qVar.alpha();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        R4.charlie(this, f5);
    }

    public void setEndInsetScrimEnabled(boolean z2) {
        this.f8096k = z2;
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        y yVar = this.f8100o;
        if (z2 != yVar.alpha) {
            yVar.alpha = z2;
            yVar.alpha(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        q qVar = this.f8088b;
        qVar.f8068f = drawable;
        qVar.juliet();
    }

    public void setItemBackgroundResource(int i4) {
        setItemBackground(getContext().getDrawable(i4));
    }

    public void setItemHorizontalPadding(int i4) {
        q qVar = this.f8088b;
        qVar.f8070h = i4;
        qVar.juliet();
    }

    public void setItemHorizontalPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.f8088b;
        qVar.f8070h = dimensionPixelSize;
        qVar.juliet();
    }

    public void setItemIconPadding(int i4) {
        q qVar = this.f8088b;
        qVar.f8072j = i4;
        qVar.juliet();
    }

    public void setItemIconPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.f8088b;
        qVar.f8072j = dimensionPixelSize;
        qVar.juliet();
    }

    public void setItemIconSize(int i4) {
        q qVar = this.f8088b;
        if (qVar.f8073k != i4) {
            qVar.f8073k = i4;
            qVar.f8078p = true;
            qVar.juliet();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        q qVar = this.f8088b;
        qVar.e = colorStateList;
        qVar.juliet();
    }

    public void setItemMaxLines(int i4) {
        q qVar = this.f8088b;
        qVar.f8080r = i4;
        qVar.juliet();
    }

    public void setItemTextAppearance(int i4) {
        q qVar = this.f8088b;
        qVar.f8065b = i4;
        qVar.juliet();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        q qVar = this.f8088b;
        qVar.f8066c = z2;
        qVar.juliet();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        q qVar = this.f8088b;
        qVar.f8067d = colorStateList;
        qVar.juliet();
    }

    public void setItemVerticalPadding(int i4) {
        q qVar = this.f8088b;
        qVar.f8071i = i4;
        qVar.juliet();
    }

    public void setItemVerticalPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.f8088b;
        qVar.f8071i = dimensionPixelSize;
        qVar.juliet();
    }

    public void setNavigationItemSelectedListener(f fVar) {
        this.f8089c = fVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        q qVar = this.f8088b;
        if (qVar != null) {
            qVar.f8083u = i4;
            NavigationMenuView navigationMenuView = qVar.alpha;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i4);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z2) {
        this.f8095j = z2;
    }

    public void setSubheaderInsetEnd(int i4) {
        q qVar = this.f8088b;
        qVar.f8077o = i4;
        qVar.golf();
    }

    public void setSubheaderInsetStart(int i4) {
        q qVar = this.f8088b;
        qVar.f8076n = i4;
        qVar.golf();
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.f8093h = z2;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f8087a.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f8088b.teal.bravo((ao.n) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
