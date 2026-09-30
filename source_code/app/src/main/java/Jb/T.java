package Jb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.app.base.BaseViewModel;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrdersFragmentV2 purple;

    public /* synthetic */ T(OrdersFragmentV2 ordersFragmentV2, int i4) {
        this.alpha = i4;
        this.purple = ordersFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeActivityV2 homeActivityV2;
        HomeActivityV2 homeActivityV22;
        HomeActivityV2 homeActivityV23;
        HomeActivityV2 homeActivityV24;
        switch (this.alpha) {
            case 0:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            case 1:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            case 2:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            case 3:
                OrdersFragmentV2 ordersFragmentV2 = this.purple;
                d3.k.fuchsia(ordersFragmentV2.kilo());
                ordersFragmentV2.sierra();
                ordersFragmentV2.tango();
                ordersFragmentV2.beige();
                return Unit.INSTANCE;
            case 4:
                d3.k.fuchsia(this.purple.kilo());
                return Unit.INSTANCE;
            case 5:
                d3.k kilo = this.purple.kilo();
                if (kilo instanceof HomeActivityV2) {
                    homeActivityV2 = (HomeActivityV2) kilo;
                } else {
                    homeActivityV2 = null;
                }
                if (homeActivityV2 != null) {
                    HomeActivityV2.lime(homeActivityV2);
                }
                return Unit.INSTANCE;
            case 6:
                d3.k kilo2 = this.purple.kilo();
                if (kilo2 instanceof HomeActivityV2) {
                    homeActivityV22 = (HomeActivityV2) kilo2;
                } else {
                    homeActivityV22 = null;
                }
                if (homeActivityV22 != null) {
                    homeActivityV22.magenta(new Bundle());
                }
                return Unit.INSTANCE;
            case 7:
                try {
                    this.purple.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 8:
                d3.k kilo3 = this.purple.kilo();
                if (kilo3 instanceof HomeActivityV2) {
                    homeActivityV23 = (HomeActivityV2) kilo3;
                } else {
                    homeActivityV23 = null;
                }
                if (homeActivityV23 != null) {
                    homeActivityV23.navy(new ao(homeActivityV23, 3));
                }
                return Unit.INSTANCE;
            case 9:
                this.purple.yankee(true);
                return Unit.INSTANCE;
            case 10:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            case 11:
                OrdersFragmentV2 ordersFragmentV22 = this.purple;
                if (!ordersFragmentV22.getChildFragmentManager().jade()) {
                    new Kb.h().romeo(ordersFragmentV22.getChildFragmentManager(), null);
                }
                return Unit.INSTANCE;
            case 12:
                OrdersFragmentV2 ordersFragmentV23 = this.purple;
                if (!ordersFragmentV23.getChildFragmentManager().jade()) {
                    new C0215x().romeo(ordersFragmentV23.getChildFragmentManager(), "conn_diag");
                }
                return Unit.INSTANCE;
            case 13:
                OrdersFragmentV2 ordersFragmentV24 = this.purple;
                ordersFragmentV24.startActivity(new Intent(ordersFragmentV24.kilo(), (Class<?>) AssetsListActivity.class));
                return Unit.INSTANCE;
            case 14:
                OrdersFragmentV2 ordersFragmentV25 = this.purple;
                ordersFragmentV25.startActivity(new Intent(ordersFragmentV25.kilo(), (Class<?>) TransferCardListActivity.class));
                return Unit.INSTANCE;
            case 15:
                OrdersFragmentV2 ordersFragmentV26 = this.purple;
                OrdersViewModel ordersViewModel = (OrdersViewModel) ordersFragmentV26.f12301i.getValue();
                BaseViewModel.launchApi$default(ordersViewModel, null, new na.o(ordersViewModel, null), 1, null);
                ordersFragmentV26.kilo().kilo();
                ordersFragmentV26.sierra();
                ordersFragmentV26.tango();
                ordersFragmentV26.beige();
                return Unit.INSTANCE;
            case 16:
                OrdersFragmentV2 ordersFragmentV27 = this.purple;
                d3.k.fuchsia(ordersFragmentV27.kilo());
                ordersFragmentV27.sierra();
                ordersFragmentV27.tango();
                ordersFragmentV27.beige();
                return Unit.INSTANCE;
            case 17:
                OrdersFragmentV2 ordersFragmentV28 = this.purple;
                if (!ordersFragmentV28.getChildFragmentManager().jade()) {
                    new Kb.h().romeo(ordersFragmentV28.getChildFragmentManager(), null);
                }
                return Unit.INSTANCE;
            case 18:
                OrdersFragmentV2 ordersFragmentV29 = this.purple;
                if (!ordersFragmentV29.getChildFragmentManager().jade()) {
                    new C0215x().romeo(ordersFragmentV29.getChildFragmentManager(), "conn_diag");
                }
                return Unit.INSTANCE;
            case 19:
                OrdersFragmentV2 ordersFragmentV210 = this.purple;
                ordersFragmentV210.startActivity(new Intent(ordersFragmentV210.kilo(), (Class<?>) AssetsListActivity.class));
                return Unit.INSTANCE;
            case 20:
                OrdersFragmentV2 ordersFragmentV211 = this.purple;
                ordersFragmentV211.startActivity(new Intent(ordersFragmentV211.kilo(), (Class<?>) TransferCardListActivity.class));
                return Unit.INSTANCE;
            case 21:
                androidx.fragment.app.an requireActivity = this.purple.requireActivity();
                Intrinsics.charlie(requireActivity, "null cannot be cast to non-null type delivery.samurai.android.ui.homev2.HomeActivityV2");
                ((HomeActivityV2) requireActivity).maroon(R.id.nav_wallet, null);
                return Unit.INSTANCE;
            case 22:
                d3.k kilo4 = this.purple.kilo();
                if (kilo4 instanceof HomeActivityV2) {
                    homeActivityV24 = (HomeActivityV2) kilo4;
                } else {
                    homeActivityV24 = null;
                }
                if (homeActivityV24 != null) {
                    homeActivityV24.navy(new ao(homeActivityV24, 3));
                }
                return Unit.INSTANCE;
            case 23:
                C3462a.alpha("LocationFlow", 12, "🔄 [SWITCH_TOGGLE] Compliance passed - starting status update (ON)", null);
                OrdersFragmentV2 ordersFragmentV212 = this.purple;
                if (!ordersFragmentV212.f12314v.bravo(true)) {
                    C3462a.alpha("LocationFlow", 12, "🔄 [SWITCH_TOGGLE] Ignored - update already in progress", null);
                    return Unit.INSTANCE;
                }
                ordersFragmentV212.azure(true);
                return Unit.INSTANCE;
            case 24:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            case 25:
                this.purple.f12304l = false;
                return Unit.INSTANCE;
            default:
                try {
                    androidx.fragment.app.an requireActivity2 = this.purple.requireActivity();
                    Intrinsics.charlie(requireActivity2, "null cannot be cast to non-null type delivery.samurai.android.ui.homev2.HomeActivityV2");
                    ((HomeActivityV2) requireActivity2).maroon(R.id.nav_wallet, null);
                } catch (Exception e) {
                    Log.e("Settlement", "Failed to navigate to wallet", e);
                }
                return Unit.INSTANCE;
        }
    }
}
