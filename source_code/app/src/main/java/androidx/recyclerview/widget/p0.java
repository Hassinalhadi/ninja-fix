package androidx.recyclerview.widget;

import android.view.View;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p0 {
    public final ArrayList alpha = new ArrayList();
    public int bravo = RecyclerView.UNDEFINED_DURATION;
    public int charlie = RecyclerView.UNDEFINED_DURATION;
    public int delta = 0;
    public final int echo;
    public final /* synthetic */ StaggeredGridLayoutManager foxtrot;

    public p0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.foxtrot = staggeredGridLayoutManager;
        this.echo = i4;
    }

    public final void alpha() {
        View view = (View) P0.amber(1, this.alpha);
        l0 l0Var = (l0) view.getLayoutParams();
        this.charlie = this.foxtrot.romeo.bravo(view);
        l0Var.getClass();
    }

    public final void bravo() {
        this.alpha.clear();
        this.bravo = RecyclerView.UNDEFINED_DURATION;
        this.charlie = RecyclerView.UNDEFINED_DURATION;
        this.delta = 0;
    }

    public final int charlie() {
        boolean z2 = this.foxtrot.whiskey;
        ArrayList arrayList = this.alpha;
        if (z2) {
            return echo(arrayList.size() - 1, -1, false, true);
        }
        return echo(0, arrayList.size(), false, true);
    }

    public final int delta() {
        boolean z2 = this.foxtrot.whiskey;
        ArrayList arrayList = this.alpha;
        if (z2) {
            return echo(0, arrayList.size(), false, true);
        }
        return echo(arrayList.size() - 1, -1, false, true);
    }

    public final int echo(int i4, int i5, boolean z2, boolean z10) {
        int i10;
        boolean z11;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.foxtrot;
        int kilo = staggeredGridLayoutManager.romeo.kilo();
        int golf = staggeredGridLayoutManager.romeo.golf();
        if (i5 > i4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        while (i4 != i5) {
            View view = (View) this.alpha.get(i4);
            int echo = staggeredGridLayoutManager.romeo.echo(view);
            int bravo = staggeredGridLayoutManager.romeo.bravo(view);
            boolean z12 = false;
            if (!z10 ? echo < golf : echo <= golf) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 ? bravo > kilo : bravo >= kilo) {
                z12 = true;
            }
            if (z11 && z12) {
                if (z2) {
                    return L.gray(view);
                }
                if (echo < kilo || bravo > golf) {
                    return L.gray(view);
                }
            }
            i4 += i10;
        }
        return -1;
    }

    public final int foxtrot(int i4) {
        int i5 = this.charlie;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.alpha.size() == 0) {
            return i4;
        }
        alpha();
        return this.charlie;
    }

    public final View golf(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.foxtrot;
        ArrayList arrayList = this.alpha;
        View view = null;
        if (i5 == -1) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                View view2 = (View) arrayList.get(i10);
                if ((staggeredGridLayoutManager.whiskey && L.gray(view2) <= i4) || ((!staggeredGridLayoutManager.whiskey && L.gray(view2) >= i4) || !view2.hasFocusable())) {
                    break;
                }
                i10++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.whiskey && L.gray(view3) >= i4) || ((!staggeredGridLayoutManager.whiskey && L.gray(view3) <= i4) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public final int hotel(int i4) {
        int i5 = this.bravo;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.alpha.size() == 0) {
            return i4;
        }
        View view = (View) this.alpha.get(0);
        l0 l0Var = (l0) view.getLayoutParams();
        this.bravo = this.foxtrot.romeo.echo(view);
        l0Var.getClass();
        return this.bravo;
    }
}
