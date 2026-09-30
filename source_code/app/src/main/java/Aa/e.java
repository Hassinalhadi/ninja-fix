package Aa;

import B9.ab;
import Gb.s;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ad;
import com.app.base.BaseViewModel;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends Q {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ e(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        int i10;
        LinearLayoutManager linearLayoutManager;
        int i11;
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                L layoutManager = recyclerView.getLayoutManager();
                Intrinsics.charlie(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
                int coral = linearLayoutManager2.coral();
                int L4 = linearLayoutManager2.L();
                j jVar = (j) this.bravo;
                if (!jVar.A && !jVar.B && L4 == coral - 1 && (i10 = jVar.f44z) < jVar.C - 1) {
                    int i12 = i10 + 1;
                    jVar.f44z = i12;
                    jVar.bronze(i12);
                    return;
                }
                return;
            case 1:
                Intrinsics.echo(recyclerView, "recyclerView");
                L layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager2;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    if (linearLayoutManager.L() + 3 >= linearLayoutManager.coral()) {
                        n nVar = (n) this.bravo;
                        k9.d dVar = nVar.A;
                        if (!dVar.bravo) {
                            ab abVar = nVar.f49y;
                            dVar.bravo = !((AuthViewModel) abVar.getValue()).isLastPage();
                            dVar.notifyItemInserted(dVar.getItemCount());
                            ((AuthViewModel) abVar.getValue()).getCountries();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                L layoutManager3 = recyclerView.getLayoutManager();
                Intrinsics.charlie(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager3 = (LinearLayoutManager) layoutManager3;
                int L10 = linearLayoutManager3.L();
                int coral2 = linearLayoutManager3.coral();
                EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) this.bravo;
                if (!envelopsListingActivityV2.f12265M && envelopsListingActivityV2.f12266N && L10 >= coral2 - 3) {
                    envelopsListingActivityV2.f12265M = true;
                    EnvelopsViewModelV2 green = envelopsListingActivityV2.green();
                    green.delta++;
                    BaseViewModel.launchApi$default(green, null, new s(green, null), 1, null);
                    return;
                }
                return;
            case 3:
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                L layoutManager4 = recyclerView.getLayoutManager();
                Intrinsics.charlie(layoutManager4, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager4 = (LinearLayoutManager) layoutManager4;
                int coral3 = linearLayoutManager4.coral();
                int L11 = linearLayoutManager4.L();
                Wa.b bVar = (Wa.b) this.bravo;
                if (!bVar.A && !bVar.B && L11 == coral3 - 1 && (i11 = bVar.f2207z) < bVar.C - 1) {
                    int i13 = i11 + 1;
                    bVar.f2207z = i13;
                    bVar.bronze(i13);
                    return;
                }
                return;
            case 4:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                ad adVar = (ad) this.bravo;
                int computeVerticalScrollRange = adVar.sierra.computeVerticalScrollRange();
                int i14 = adVar.romeo;
                int i15 = computeVerticalScrollRange - i14;
                int i16 = adVar.alpha;
                if (i15 > 0 && i14 >= i16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                adVar.tango = z2;
                int computeHorizontalScrollRange = adVar.sierra.computeHorizontalScrollRange();
                int i17 = adVar.quebec;
                if (computeHorizontalScrollRange - i17 > 0 && i17 >= i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                adVar.uniform = z10;
                boolean z11 = adVar.tango;
                if (!z11 && !z10) {
                    if (adVar.victor != 0) {
                        adVar.delta(0);
                        return;
                    }
                    return;
                }
                if (z11) {
                    float f5 = i14;
                    adVar.lima = (int) ((((f5 / 2.0f) + computeVerticalScrollOffset) * f5) / computeVerticalScrollRange);
                    adVar.kilo = Math.min(i14, (i14 * i14) / computeVerticalScrollRange);
                }
                if (adVar.uniform) {
                    float f10 = computeHorizontalScrollOffset;
                    float f11 = i17;
                    adVar.oscar = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
                    adVar.november = Math.min(i17, (i17 * i17) / computeHorizontalScrollRange);
                }
                int i18 = adVar.victor;
                if (i18 == 0 || i18 == 1) {
                    adVar.delta(1);
                    return;
                }
                return;
            default:
                ((S5.k) this.bravo).bravo();
                return;
        }
    }
}
