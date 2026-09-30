package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import ao.ae;
import delivery.samurai.android.R;
import java.util.ArrayList;
import s1.au;

/* loaded from: classes2.dex */
public final class i extends az {
    public final ArrayList alpha = new ArrayList();
    public ao.n bravo;
    public boolean charlie;
    public final /* synthetic */ q delta;

    public i(q qVar) {
        this.delta = qVar;
        alpha();
    }

    public final void alpha() {
        if (this.charlie) {
            return;
        }
        this.charlie = true;
        ArrayList arrayList = this.alpha;
        arrayList.clear();
        arrayList.add(new Object());
        q qVar = this.delta;
        int size = qVar.red.lima().size();
        boolean z2 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i5 < size) {
            ao.n nVar = (ao.n) qVar.red.lima().get(i5);
            if (nVar.isChecked()) {
                bravo(nVar);
            }
            if (nVar.isCheckable()) {
                nVar.foxtrot(z2);
            }
            if (nVar.hasSubMenu()) {
                ae aeVar = nVar.f3225h;
                if (aeVar.hasVisibleItems()) {
                    if (i5 != 0) {
                        arrayList.add(new l(qVar.f8082t, z2 ? 1 : 0));
                    }
                    arrayList.add(new m(nVar));
                    int size2 = aeVar.white.size();
                    int i11 = z2 ? 1 : 0;
                    int i12 = i11;
                    while (i11 < size2) {
                        ao.n nVar2 = (ao.n) aeVar.getItem(i11);
                        if (nVar2.isVisible()) {
                            if (i12 == 0 && nVar2.getIcon() != null) {
                                i12 = 1;
                            }
                            if (nVar2.isCheckable()) {
                                nVar2.foxtrot(z2);
                            }
                            if (nVar2.isChecked()) {
                                bravo(nVar2);
                            }
                            arrayList.add(new m(nVar2));
                        }
                        i11++;
                        z2 = false;
                    }
                    if (i12 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((m) arrayList.get(size4)).bravo = true;
                        }
                    }
                }
            } else {
                int i13 = nVar.purple;
                if (i13 != i4) {
                    i10 = arrayList.size();
                    if (nVar.getIcon() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i5 != 0) {
                        i10++;
                        int i14 = qVar.f8082t;
                        arrayList.add(new l(i14, i14));
                    }
                } else if (!z10 && nVar.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i15 = i10; i15 < size5; i15++) {
                        ((m) arrayList.get(i15)).bravo = true;
                    }
                    z10 = true;
                }
                m mVar = new m(nVar);
                mVar.bravo = z10;
                arrayList.add(mVar);
                i4 = i13;
            }
            i5++;
            z2 = false;
        }
        this.charlie = z2;
    }

    public final void bravo(ao.n nVar) {
        if (this.bravo != nVar && nVar.isCheckable()) {
            ao.n nVar2 = this.bravo;
            if (nVar2 != null) {
                nVar2.setChecked(false);
            }
            this.bravo = nVar;
            nVar.setChecked(true);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        return this.alpha.size();
    }

    @Override // androidx.recyclerview.widget.az
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemViewType(int i4) {
        k kVar = (k) this.alpha.get(i4);
        if (kVar instanceof l) {
            return 2;
        }
        if (kVar instanceof j) {
            return 3;
        }
        if (kVar instanceof m) {
            if (((m) kVar).alpha.hasSubMenu()) {
                return 1;
            }
            return 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        Drawable drawable;
        p pVar = (p) f0Var;
        int itemViewType = getItemViewType(i4);
        ArrayList arrayList = this.alpha;
        q qVar = this.delta;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                l lVar = (l) arrayList.get(i4);
                pVar.itemView.setPaddingRelative(qVar.f8074l, lVar.alpha, qVar.f8075m, lVar.bravo);
                return;
            }
            TextView textView = (TextView) pVar.itemView;
            textView.setText(((m) arrayList.get(i4)).alpha.teal);
            textView.setTextAppearance(qVar.yellow);
            textView.setPaddingRelative(qVar.f8076n, textView.getPaddingTop(), qVar.f8077o, textView.getPaddingBottom());
            ColorStateList colorStateList = qVar.f8064a;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            au.november(textView, new h(this, i4, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.itemView;
        navigationMenuItemView.setIconTintList(qVar.e);
        navigationMenuItemView.setTextAppearance(qVar.f8065b);
        ColorStateList colorStateList2 = qVar.f8067d;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable2 = qVar.f8068f;
        if (drawable2 != null) {
            drawable = drawable2.getConstantState().newDrawable();
        } else {
            drawable = null;
        }
        navigationMenuItemView.setBackground(drawable);
        RippleDrawable rippleDrawable = qVar.f8069g;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        m mVar = (m) arrayList.get(i4);
        navigationMenuItemView.setNeedsEmptyIcon(mVar.bravo);
        int i5 = qVar.f8070h;
        int i10 = qVar.f8071i;
        navigationMenuItemView.setPadding(i5, i10, i5, i10);
        navigationMenuItemView.setIconPadding(qVar.f8072j);
        if (qVar.f8078p) {
            navigationMenuItemView.setIconSize(qVar.f8073k);
        }
        navigationMenuItemView.setMaxLines(qVar.f8080r);
        navigationMenuItemView.f8044c = qVar.f8066c;
        navigationMenuItemView.charlie(mVar.alpha);
        au.november(navigationMenuItemView, new h(this, i4, false));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        q qVar = this.delta;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return new f0(qVar.purple);
                }
                return new f0(qVar.white.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            return new f0(qVar.white.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        LayoutInflater layoutInflater = qVar.white;
        Z8.c cVar = qVar.f8084v;
        f0 f0Var = new f0(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
        f0Var.itemView.setOnClickListener(cVar);
        return f0Var;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onViewRecycled(f0 f0Var) {
        p pVar = (p) f0Var;
        if (pVar instanceof o) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.itemView;
            FrameLayout frameLayout = navigationMenuItemView.e;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f8045d.setCompoundDrawables(null, null, null, null);
        }
    }
}
