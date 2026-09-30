package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Z0 implements ao.x {
    public ao.l alpha;
    public ao.n purple;
    public final /* synthetic */ Toolbar red;

    public Z0(Toolbar toolbar) {
        this.red = toolbar;
    }

    @Override // ao.x
    public final void bravo(ao.l lVar, boolean z2) {
    }

    @Override // ao.x
    public final void charlie(Context context, ao.l lVar) {
        ao.n nVar;
        ao.l lVar2 = this.alpha;
        if (lVar2 != null && (nVar = this.purple) != null) {
            lVar2.delta(nVar);
        }
        this.alpha = lVar;
    }

    @Override // ao.x
    public final boolean delta() {
        return false;
    }

    @Override // ao.x
    public final boolean foxtrot(ao.n nVar) {
        Toolbar toolbar = this.red;
        toolbar.charlie();
        ViewParent parent = toolbar.f2835a.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2835a);
            }
            toolbar.addView(toolbar.f2835a);
        }
        View actionView = nVar.getActionView();
        toolbar.f2836b = actionView;
        this.purple = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2836b);
            }
            a1 hotel = Toolbar.hotel();
            hotel.alpha = (toolbar.f2840g & 112) | 8388611;
            hotel.bravo = 2;
            toolbar.f2836b.setLayoutParams(hotel);
            toolbar.addView(toolbar.f2836b);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((a1) childAt.getLayoutParams()).bravo != 2 && childAt != toolbar.alpha) {
                toolbar.removeViewAt(childCount);
                toolbar.f2857x.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f3239v = true;
        nVar.f3224g.papa(false);
        KeyEvent.Callback callback = toolbar.f2836b;
        if (callback instanceof an.c) {
            ((an.c) callback).onActionViewExpanded();
        }
        toolbar.victor();
        return true;
    }

    @Override // ao.x
    public final int getId() {
        return 0;
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
    }

    @Override // ao.x
    public final void india() {
        if (this.purple != null) {
            ao.l lVar = this.alpha;
            if (lVar != null) {
                int size = lVar.white.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.alpha.getItem(i4) == this.purple) {
                        return;
                    }
                }
            }
            kilo(this.purple);
        }
    }

    @Override // ao.x
    public final boolean kilo(ao.n nVar) {
        Toolbar toolbar = this.red;
        KeyEvent.Callback callback = toolbar.f2836b;
        if (callback instanceof an.c) {
            ((an.c) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2836b);
        toolbar.removeView(toolbar.f2835a);
        toolbar.f2836b = null;
        ArrayList arrayList = toolbar.f2857x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.purple = null;
        toolbar.requestLayout();
        nVar.f3239v = false;
        nVar.f3224g.papa(false);
        toolbar.victor();
        return true;
    }

    @Override // ao.x
    public final Parcelable lima() {
        return null;
    }

    @Override // ao.x
    public final boolean mike(ao.ae aeVar) {
        return false;
    }
}
