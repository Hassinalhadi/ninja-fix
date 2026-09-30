package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import s1.C2569b;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class c extends C2569b {
    public final /* synthetic */ AppBarLayout delta;
    public final /* synthetic */ CoordinatorLayout echo;
    public final /* synthetic */ AppBarLayout.BaseBehavior foxtrot;

    public c(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.foxtrot = baseBehavior;
        this.delta = appBarLayout;
        this.echo = coordinatorLayout;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        AppBarLayout.BaseBehavior baseBehavior;
        View hotel;
        this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
        c2952d.juliet(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.delta;
        if (appBarLayout.getTotalScrollRange() != 0 && (hotel = AppBarLayout.BaseBehavior.hotel((baseBehavior = this.foxtrot), this.echo)) != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (((e) appBarLayout.getChildAt(i4).getLayoutParams()).alpha != 0) {
                    if (baseBehavior.echo() != (-appBarLayout.getTotalScrollRange())) {
                        c2952d.bravo(C2951c.juliet);
                        c2952d.mike(true);
                    }
                    if (baseBehavior.echo() != 0) {
                        if (hotel.canScrollVertically(-1)) {
                            if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                c2952d.bravo(C2951c.kilo);
                                c2952d.mike(true);
                                return;
                            }
                            return;
                        }
                        c2952d.bravo(C2951c.kilo);
                        c2952d.mike(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        AppBarLayout appBarLayout = this.delta;
        if (i4 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i4 == 8192) {
            AppBarLayout.BaseBehavior baseBehavior = this.foxtrot;
            if (baseBehavior.echo() != 0) {
                View hotel = AppBarLayout.BaseBehavior.hotel(baseBehavior, this.echo);
                if (hotel.canScrollVertically(-1)) {
                    int i5 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i5 != 0) {
                        CoordinatorLayout coordinatorLayout = this.echo;
                        AppBarLayout appBarLayout2 = this.delta;
                        this.foxtrot.kilo(coordinatorLayout, appBarLayout2, hotel, i5, new int[]{0, 0});
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
        return super.golf(view, i4, bundle);
    }
}
