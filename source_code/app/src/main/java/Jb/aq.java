package Jb;

import android.content.Intent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeActivityV2 purple;

    public /* synthetic */ aq(HomeActivityV2 homeActivityV2, int i4) {
        this.alpha = i4;
        this.purple = homeActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num = null;
        HomeActivityV2 homeActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = HomeActivityV2.f12269k0;
                ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                Y1.r rVar = homeActivityV2.f12282U;
                if (rVar != null) {
                    Y1.aa foxtrot = rVar.bravo.foxtrot();
                    if (foxtrot != null) {
                        num = Integer.valueOf(foxtrot.purple.charlie);
                    }
                    if (num == null || num.intValue() != R.id.nav) {
                        homeActivityV2.navy(new ao(homeActivityV2, 2));
                        return;
                    }
                    return;
                }
                Intrinsics.lima("navController");
                throw null;
            case 1:
                int i5 = HomeActivityV2.f12269k0;
                ((AuthViewModel) homeActivityV2.f12279R.getValue()).onLogout().observe(homeActivityV2, new Dc.t(4, new as(homeActivityV2, 1)));
                return;
            default:
                int i10 = HomeActivityV2.f12269k0;
                q3.g gVar = homeActivityV2.f12273K;
                if (gVar != null) {
                    if (((N9.i) gVar).bravo(N9.a.hotel)) {
                        Intent intent = new Intent(homeActivityV2, (Class<?>) EnvelopsListingActivityV2.class);
                        intent.putExtra("redirectId", (String) null);
                        homeActivityV2.startActivity(intent);
                        return;
                    } else {
                        Intent intent2 = new Intent(homeActivityV2, (Class<?>) EnvelopsListingActivity.class);
                        intent2.putExtra("redirectId", (String) null);
                        homeActivityV2.startActivity(intent2);
                        return;
                    }
                }
                Intrinsics.lima("featureFlagProvider");
                throw null;
        }
    }
}
