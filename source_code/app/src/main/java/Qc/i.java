package Qc;

import androidx.compose.runtime.t0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements k7.d {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ i(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final void delta(k7.g gVar) {
    }

    private final void echo(k7.g gVar) {
    }

    @Override // k7.InterfaceC2018c
    public final void alpha(k7.g tab) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(tab, "tab");
                return;
            case 1:
                return;
            default:
                Intrinsics.echo(tab, "tab");
                return;
        }
    }

    @Override // k7.InterfaceC2018c
    public final void bravo(k7.g tab) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(tab, "tab");
                TicketsFragment ticketsFragment = (TicketsFragment) this.bravo;
                int i4 = ticketsFragment.f12520i;
                int i5 = tab.bravo;
                if (i4 != i5) {
                    ticketsFragment.f12520i = i5;
                    ticketsFragment.uniform(i5);
                    ticketsFragment.quebec();
                    return;
                }
                return;
            case 1:
                ((ViewPager) this.bravo).setCurrentItem(tab.bravo);
                return;
            default:
                Intrinsics.echo(tab, "tab");
                int i10 = tab.bravo;
                AreaListingActivityV2 areaListingActivityV2 = (AreaListingActivityV2) this.bravo;
                areaListingActivityV2.f12141M = i10;
                areaListingActivityV2.f12139K = 0;
                ((t0) areaListingActivityV2.f12144P).setValue("");
                areaListingActivityV2.jade(tab.bravo);
                areaListingActivityV2.gray();
                return;
        }
    }

    @Override // k7.InterfaceC2018c
    public final void charlie(k7.g tab) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(tab, "tab");
                return;
            case 1:
                return;
            default:
                Intrinsics.echo(tab, "tab");
                AreaListingActivityV2 areaListingActivityV2 = (AreaListingActivityV2) this.bravo;
                areaListingActivityV2.jade(((TabLayout) areaListingActivityV2.green().purple).getSelectedTabPosition());
                return;
        }
    }
}
