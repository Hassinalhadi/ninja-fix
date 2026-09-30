package androidx.recyclerview.widget;

import android.view.View;
import com.airbnb.lottie.compose.LottieConstants;

/* loaded from: classes3.dex */
public final class au extends O {
    public RecyclerView alpha;
    public final j0 bravo = new j0(this);
    public as charlie;
    public as delta;

    public static int bravo(View view, K1.g gVar) {
        return ((gVar.charlie(view) / 2) + gVar.echo(view)) - ((gVar.lima() / 2) + gVar.kilo());
    }

    public static View charlie(L l10, K1.g gVar) {
        int whiskey = l10.whiskey();
        View view = null;
        if (whiskey == 0) {
            return null;
        }
        int lima = (gVar.lima() / 2) + gVar.kilo();
        int i4 = LottieConstants.IterateForever;
        for (int i5 = 0; i5 < whiskey; i5++) {
            View victor = l10.victor(i5);
            int abs = Math.abs(((gVar.charlie(victor) / 2) + gVar.echo(victor)) - lima);
            if (abs < i4) {
                view = victor;
                i4 = abs;
            }
        }
        return view;
    }

    public final int[] alpha(L l10, View view) {
        int[] iArr = new int[2];
        if (l10.echo()) {
            iArr[0] = bravo(view, delta(l10));
        } else {
            iArr[0] = 0;
        }
        if (l10.foxtrot()) {
            iArr[1] = bravo(view, echo(l10));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final K1.g delta(L l10) {
        as asVar = this.delta;
        if (asVar == null || ((L) asVar.bravo) != l10) {
            this.delta = new as(l10, 0);
        }
        return this.delta;
    }

    public final K1.g echo(L l10) {
        as asVar = this.charlie;
        if (asVar == null || ((L) asVar.bravo) != l10) {
            this.charlie = new as(l10, 1);
        }
        return this.charlie;
    }

    public final void foxtrot() {
        L layoutManager;
        View view;
        RecyclerView recyclerView = this.alpha;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.foxtrot()) {
                view = charlie(layoutManager, echo(layoutManager));
            } else if (layoutManager.echo()) {
                view = charlie(layoutManager, delta(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] alpha = alpha(layoutManager, view);
                int i4 = alpha[0];
                if (i4 == 0 && alpha[1] == 0) {
                    return;
                }
                this.alpha.smoothScrollBy(i4, alpha[1]);
            }
        }
    }
}
