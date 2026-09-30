package Jb;

import android.os.SystemClock;
import androidx.drawerlayout.widget.DrawerLayout;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC2966a2;

/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeActivityV2 purple;

    public /* synthetic */ ao(HomeActivityV2 homeActivityV2, int i4) {
        this.alpha = i4;
        this.purple = homeActivityV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i4 = 1;
        int i5 = R.id.action_global_support;
        String str2 = null;
        HomeActivityV2 homeActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                int i10 = HomeActivityV2.f12269k0;
                q3.g gVar = homeActivityV2.f12273K;
                if (gVar != null) {
                    return new Yc.a(homeActivityV2, gVar);
                }
                Intrinsics.lima("featureFlagProvider");
                throw null;
            case 1:
                int i11 = HomeActivityV2.f12269k0;
                UserInfo sierra = L9.d.sierra(homeActivityV2);
                if (sierra != null) {
                    str = sierra.getTicketingClient();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    i4 = 0;
                }
                Y1.r rVar = homeActivityV2.f12282U;
                if (rVar != null) {
                    if (i4 == 0) {
                        i5 = R.id.action_global_tickets;
                    }
                    rVar.charlie(i5, null, null);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("navController");
                throw null;
            case 2:
                Y1.r rVar2 = homeActivityV2.f12282U;
                if (rVar2 != null) {
                    rVar2.charlie(R.id.nav, null, null);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("navController");
                throw null;
            case 3:
                int i12 = HomeActivityV2.f12269k0;
                AbstractC2966a2.alpha(homeActivityV2).charlie(R.id.nav_suspension, null, null);
                return Unit.INSTANCE;
            case 4:
                int i13 = HomeActivityV2.f12269k0;
                ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                return Unit.INSTANCE;
            case 5:
                int i14 = HomeActivityV2.f12269k0;
                homeActivityV2.maroon(R.id.nav, null);
                return Unit.INSTANCE;
            case 6:
                int i15 = HomeActivityV2.f12269k0;
                homeActivityV2.maroon(R.id.nav_orders, null);
                return Unit.INSTANCE;
            case 7:
                int i16 = HomeActivityV2.f12269k0;
                homeActivityV2.maroon(R.id.nav_shifts, null);
                return Unit.INSTANCE;
            case 8:
                int i17 = HomeActivityV2.f12269k0;
                homeActivityV2.maroon(R.id.nav_wallet, null);
                return Unit.INSTANCE;
            default:
                int i18 = HomeActivityV2.f12269k0;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - homeActivityV2.f12290c0 < homeActivityV2.f12291d0) {
                    ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                } else {
                    homeActivityV2.f12290c0 = uptimeMillis;
                    UserInfo sierra2 = L9.d.sierra(homeActivityV2);
                    if (sierra2 != null) {
                        str2 = sierra2.getTicketingClient();
                    }
                    if (str2 != null && str2.length() != 0) {
                        i5 = R.id.action_global_tickets;
                    }
                    homeActivityV2.navy(new Ec.aw(homeActivityV2, i5, i4));
                    ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                }
                return Unit.INSTANCE;
        }
    }
}
