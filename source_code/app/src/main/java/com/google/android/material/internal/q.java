package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import ao.ae;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class q implements ao.x {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f8064a;
    public NavigationMenuView alpha;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8067d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8068f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f8069g;

    /* renamed from: h, reason: collision with root package name */
    public int f8070h;

    /* renamed from: i, reason: collision with root package name */
    public int f8071i;

    /* renamed from: j, reason: collision with root package name */
    public int f8072j;

    /* renamed from: k, reason: collision with root package name */
    public int f8073k;

    /* renamed from: l, reason: collision with root package name */
    public int f8074l;

    /* renamed from: m, reason: collision with root package name */
    public int f8075m;

    /* renamed from: n, reason: collision with root package name */
    public int f8076n;

    /* renamed from: o, reason: collision with root package name */
    public int f8077o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8078p;
    public LinearLayout purple;

    /* renamed from: r, reason: collision with root package name */
    public int f8080r;
    public ao.l red;

    /* renamed from: s, reason: collision with root package name */
    public int f8081s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public int f8082t;
    public i teal;
    public LayoutInflater white;
    public int yellow = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8065b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8066c = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8079q = true;

    /* renamed from: u, reason: collision with root package name */
    public int f8083u = -1;

    /* renamed from: v, reason: collision with root package name */
    public final Z8.c f8084v = new Z8.c(3, this);

    public final void alpha() {
        i iVar = this.teal;
        if (iVar != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = iVar.alpha;
                if (i4 < arrayList.size()) {
                    if (arrayList.get(i4) instanceof l) {
                        iVar.notifyItemChanged(i4);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // ao.x
    public final void bravo(ao.l lVar, boolean z2) {
    }

    @Override // ao.x
    public final void charlie(Context context, ao.l lVar) {
        this.white = LayoutInflater.from(context);
        this.red = lVar;
        this.f8082t = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // ao.x
    public final boolean delta() {
        return false;
    }

    @Override // ao.x
    public final boolean foxtrot(ao.n nVar) {
        return false;
    }

    @Override // ao.x
    public final int getId() {
        return this.silver;
    }

    public final void golf() {
        i iVar = this.teal;
        if (iVar != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = iVar.alpha;
                if (i4 < arrayList.size()) {
                    if ((arrayList.get(i4) instanceof m) && iVar.getItemViewType(i4) == 1) {
                        iVar.notifyItemChanged(i4);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
        ao.n nVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.alpha.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                i iVar = this.teal;
                iVar.getClass();
                int i4 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = iVar.alpha;
                if (i4 != 0) {
                    iVar.charlie = true;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        k kVar = (k) arrayList.get(i5);
                        if (kVar instanceof m) {
                            ao.n nVar2 = ((m) kVar).alpha;
                            if (nVar2.alpha == i4) {
                                iVar.bravo(nVar2);
                                break;
                            }
                        }
                        i5++;
                    }
                    iVar.charlie = false;
                    iVar.alpha();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        k kVar2 = (k) arrayList.get(i10);
                        if ((kVar2 instanceof m) && (actionView = (nVar = ((m) kVar2).alpha).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(nVar.alpha)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.purple.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // ao.x
    public final void india() {
        i iVar = this.teal;
        if (iVar != null) {
            ArrayList arrayList = iVar.alpha;
            int size = arrayList.size();
            iVar.alpha();
            iVar.notifyDataSetChanged();
            if (size == arrayList.size()) {
                iVar.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }

    public final void juliet() {
        i iVar = this.teal;
        if (iVar != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = iVar.alpha;
                if (i4 < arrayList.size()) {
                    if ((arrayList.get(i4) instanceof m) && iVar.getItemViewType(i4) == 0) {
                        iVar.notifyItemChanged(i4);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // ao.x
    public final boolean kilo(ao.n nVar) {
        return false;
    }

    @Override // ao.x
    public final Parcelable lima() {
        View view;
        Bundle bundle = new Bundle();
        if (this.alpha != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.alpha.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        i iVar = this.teal;
        if (iVar != null) {
            iVar.getClass();
            Bundle bundle2 = new Bundle();
            ao.n nVar = iVar.bravo;
            if (nVar != null) {
                bundle2.putInt("android:menu:checked", nVar.alpha);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = iVar.alpha;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k kVar = (k) arrayList.get(i4);
                if (kVar instanceof m) {
                    ao.n nVar2 = ((m) kVar).alpha;
                    if (nVar2 != null) {
                        view = nVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
                        view.saveHierarchyState(sparseArray3);
                        sparseArray2.put(nVar2.alpha, sparseArray3);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.purple != null) {
            SparseArray<Parcelable> sparseArray4 = new SparseArray<>();
            this.purple.saveHierarchyState(sparseArray4);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray4);
        }
        return bundle;
    }

    @Override // ao.x
    public final boolean mike(ae aeVar) {
        return false;
    }
}
