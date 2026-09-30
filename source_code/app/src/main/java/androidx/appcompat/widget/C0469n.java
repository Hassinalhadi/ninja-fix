package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0469n implements ao.x {

    /* renamed from: a, reason: collision with root package name */
    public ao.z f2901a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f2902b;

    /* renamed from: c, reason: collision with root package name */
    public C0463k f2903c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2904d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2905f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2906g;

    /* renamed from: h, reason: collision with root package name */
    public int f2907h;

    /* renamed from: i, reason: collision with root package name */
    public int f2908i;

    /* renamed from: j, reason: collision with root package name */
    public int f2909j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2910k;

    /* renamed from: m, reason: collision with root package name */
    public C0455g f2912m;

    /* renamed from: n, reason: collision with root package name */
    public C0455g f2913n;

    /* renamed from: o, reason: collision with root package name */
    public RunnableC0459i f2914o;

    /* renamed from: p, reason: collision with root package name */
    public C0457h f2915p;
    public Context purple;

    /* renamed from: r, reason: collision with root package name */
    public int f2917r;
    public ao.l red;
    public final LayoutInflater silver;
    public ao.w teal;
    public final int white = R.layout.abc_action_menu_layout;
    public final int yellow = R.layout.abc_action_menu_item_layout;

    /* renamed from: l, reason: collision with root package name */
    public final SparseBooleanArray f2911l = new SparseBooleanArray();

    /* renamed from: q, reason: collision with root package name */
    public final C0465l f2916q = new C0465l(0, this);

    public C0469n(Context context) {
        this.alpha = context;
        this.silver = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ao.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View alpha(ao.n nVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = nVar.getActionView();
        int i4 = 0;
        if (actionView == null || nVar.echo()) {
            if (view instanceof ao.y) {
                actionMenuItemView = (ao.y) view;
            } else {
                actionMenuItemView = (ao.y) this.silver.inflate(this.yellow, viewGroup, false);
            }
            actionMenuItemView.charlie(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2901a);
            if (this.f2915p == null) {
                this.f2915p = new C0457h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2915p);
            actionView = actionMenuItemView;
        }
        if (nVar.f3239v) {
            i4 = 8;
        }
        actionView.setVisibility(i4);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0475q)) {
            actionView.setLayoutParams(ActionMenuView.echo(layoutParams));
        }
        return actionView;
    }

    @Override // ao.x
    public final void bravo(ao.l lVar, boolean z2) {
        golf();
        C0455g c0455g = this.f2913n;
        if (c0455g != null && c0455g.bravo()) {
            c0455g.india.dismiss();
        }
        ao.w wVar = this.teal;
        if (wVar != null) {
            wVar.bravo(lVar, z2);
        }
    }

    @Override // ao.x
    public final void charlie(Context context, ao.l lVar) {
        this.purple = context;
        LayoutInflater.from(context);
        this.red = lVar;
        Resources resources = context.getResources();
        if (!this.f2906g) {
            this.f2905f = true;
        }
        int i4 = 2;
        this.f2907h = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i5 <= 600 && ((i5 <= 960 || i10 <= 720) && (i5 <= 720 || i10 <= 960))) {
            if (i5 < 500 && ((i5 <= 640 || i10 <= 480) && (i5 <= 480 || i10 <= 640))) {
                if (i5 >= 360) {
                    i4 = 3;
                }
            } else {
                i4 = 4;
            }
        } else {
            i4 = 5;
        }
        this.f2909j = i4;
        int i11 = this.f2907h;
        if (this.f2905f) {
            if (this.f2903c == null) {
                C0463k c0463k = new C0463k(this, this.alpha);
                this.f2903c = c0463k;
                if (this.e) {
                    c0463k.setImageDrawable(this.f2904d);
                    this.f2904d = null;
                    this.e = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2903c.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f2903c.getMeasuredWidth();
        } else {
            this.f2903c = null;
        }
        this.f2908i = i11;
        float f5 = resources.getDisplayMetrics().density;
    }

    @Override // ao.x
    public final boolean delta() {
        int i4;
        ArrayList arrayList;
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        C0469n c0469n = this;
        ao.l lVar = c0469n.red;
        if (lVar != null) {
            arrayList = lVar.lima();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i10 = c0469n.f2909j;
        int i11 = c0469n.f2908i;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0469n.f2901a;
        int i12 = 0;
        boolean z13 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i5 = 2;
            z2 = true;
            if (i12 >= i4) {
                break;
            }
            ao.n nVar = (ao.n) arrayList.get(i12);
            int i15 = nVar.f3235r;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z13 = true;
            }
            if (c0469n.f2910k && nVar.f3239v) {
                i10 = 0;
            }
            i12++;
        }
        if (c0469n.f2905f && (z13 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = c0469n.f2911l;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i4) {
            ao.n nVar2 = (ao.n) arrayList.get(i17);
            int i19 = nVar2.f3235r;
            if ((i19 & 2) == i5) {
                z10 = z2;
            } else {
                z10 = false;
            }
            int i20 = nVar2.purple;
            if (z10) {
                View alpha = c0469n.alpha(nVar2, null, viewGroup);
                alpha.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = alpha.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z2);
                }
                nVar2.golf(z2);
            } else if ((i19 & 1) == z2) {
                boolean z14 = sparseBooleanArray.get(i20);
                if ((i16 > 0 || z14) && i11 > 0) {
                    z11 = z2;
                } else {
                    z11 = false;
                }
                if (z11) {
                    View alpha2 = c0469n.alpha(nVar2, null, viewGroup);
                    alpha2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = alpha2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    if (i11 + i18 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 &= z12;
                }
                if (z11 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z14) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        ao.n nVar3 = (ao.n) arrayList.get(i21);
                        if (nVar3.purple == i20) {
                            if ((nVar3.f3234q & 32) == 32) {
                                i16++;
                            }
                            nVar3.golf(false);
                        }
                    }
                }
                if (z11) {
                    i16--;
                }
                nVar2.golf(z11);
            } else {
                nVar2.golf(false);
                i17++;
                i5 = 2;
                c0469n = this;
                z2 = true;
            }
            i17++;
            i5 = 2;
            c0469n = this;
            z2 = true;
        }
        return z2;
    }

    @Override // ao.x
    public final void echo(ao.w wVar) {
        throw null;
    }

    @Override // ao.x
    public final boolean foxtrot(ao.n nVar) {
        return false;
    }

    @Override // ao.x
    public final int getId() {
        return this.f2902b;
    }

    public final boolean golf() {
        Object obj;
        RunnableC0459i runnableC0459i = this.f2914o;
        if (runnableC0459i != null && (obj = this.f2901a) != null) {
            ((View) obj).removeCallbacks(runnableC0459i);
            this.f2914o = null;
            return true;
        }
        C0455g c0455g = this.f2912m;
        if (c0455g != null) {
            if (c0455g.bravo()) {
                c0455g.india.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
        int i4;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i4 = ((ActionMenuPresenter$SavedState) parcelable).alpha) > 0 && (findItem = this.red.findItem(i4)) != null) {
            mike((ao.ae) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ao.x
    public final void india() {
        int i4;
        ao.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f2901a;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ao.l lVar = this.red;
            if (lVar != null) {
                lVar.india();
                ArrayList lima = this.red.lima();
                int size = lima.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    ao.n nVar2 = (ao.n) lima.get(i5);
                    if ((nVar2.f3234q & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (childAt instanceof ao.y) {
                            nVar = ((ao.y) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View alpha = alpha(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            alpha.setPressed(false);
                            alpha.jumpDrawablesToCurrentState();
                        }
                        if (alpha != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) alpha.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(alpha);
                            }
                            ((ViewGroup) this.f2901a).addView(alpha, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f2903c) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f2901a).requestLayout();
        ao.l lVar2 = this.red;
        if (lVar2 != null) {
            lVar2.india();
            ArrayList arrayList2 = lVar2.f3204b;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ao.o oVar = ((ao.n) arrayList2.get(i10)).f3237t;
            }
        }
        ao.l lVar3 = this.red;
        if (lVar3 != null) {
            lVar3.india();
            arrayList = lVar3.f3205c;
        }
        if (this.f2905f && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((ao.n) arrayList.get(0)).f3239v;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2903c == null) {
                this.f2903c = new C0463k(this, this.alpha);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2903c.getParent();
            if (viewGroup3 != this.f2901a) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2903c);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2901a;
                C0463k c0463k = this.f2903c;
                actionMenuView.getClass();
                C0475q delta = ActionMenuView.delta();
                delta.alpha = true;
                actionMenuView.addView(c0463k, delta);
            }
        } else {
            C0463k c0463k2 = this.f2903c;
            if (c0463k2 != null) {
                Object parent = c0463k2.getParent();
                Object obj = this.f2901a;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2903c);
                }
            }
        }
        ((ActionMenuView) this.f2901a).setOverflowReserved(this.f2905f);
    }

    public final boolean juliet() {
        C0455g c0455g = this.f2912m;
        if (c0455g != null && c0455g.bravo()) {
            return true;
        }
        return false;
    }

    @Override // ao.x
    public final boolean kilo(ao.n nVar) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
    @Override // ao.x
    public final Parcelable lima() {
        ?? obj = new Object();
        obj.alpha = this.f2917r;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ao.x
    public final boolean mike(ao.ae aeVar) {
        boolean z2;
        if (aeVar.hasVisibleItems()) {
            ao.ae aeVar2 = aeVar;
            while (true) {
                ao.l lVar = aeVar2.f3182s;
                if (lVar == this.red) {
                    break;
                }
                aeVar2 = (ao.ae) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f2901a;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof ao.y) && ((ao.y) childAt).getItemData() == aeVar2.f3183t) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                this.f2917r = aeVar.f3183t.alpha;
                int size = aeVar.white.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        MenuItem item = aeVar.getItem(i5);
                        if (item.isVisible() && item.getIcon() != null) {
                            z2 = true;
                            break;
                        }
                        i5++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                C0455g c0455g = new C0455g(this, this.purple, aeVar, view);
                this.f2913n = c0455g;
                c0455g.golf = z2;
                ao.t tVar = c0455g.india;
                if (tVar != null) {
                    tVar.quebec(z2);
                }
                C0455g c0455g2 = this.f2913n;
                if (!c0455g2.bravo()) {
                    if (c0455g2.echo != null) {
                        c0455g2.delta(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                ao.w wVar = this.teal;
                if (wVar != null) {
                    wVar.echo(aeVar);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean november() {
        ao.l lVar;
        if (this.f2905f && !juliet() && (lVar = this.red) != null && this.f2901a != null && this.f2914o == null) {
            lVar.india();
            if (!lVar.f3205c.isEmpty()) {
                RunnableC0459i runnableC0459i = new RunnableC0459i(this, new C0455g(this, this.purple, this.red, this.f2903c));
                this.f2914o = runnableC0459i;
                ((View) this.f2901a).post(runnableC0459i);
                return true;
            }
            return false;
        }
        return false;
    }
}
