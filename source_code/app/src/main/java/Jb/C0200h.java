package Jb;

import android.os.Bundle;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jb.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0200h implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0208p purple;

    public /* synthetic */ C0200h(C0208p c0208p, int i4) {
        this.alpha = i4;
        this.purple = c0208p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeActivityV2 homeActivityV2;
        HomeActivityV2 homeActivityV22;
        OrdersFragmentV2 ordersFragmentV2;
        switch (this.alpha) {
            case 0:
                d3.k kilo = this.purple.kilo();
                if (kilo instanceof HomeActivityV2) {
                    homeActivityV2 = (HomeActivityV2) kilo;
                } else {
                    homeActivityV2 = null;
                }
                if (homeActivityV2 != null) {
                    homeActivityV2.magenta(new Bundle());
                }
                return Unit.INSTANCE;
            case 1:
                d3.k kilo2 = this.purple.kilo();
                if (kilo2 instanceof HomeActivityV2) {
                    homeActivityV22 = (HomeActivityV2) kilo2;
                } else {
                    homeActivityV22 = null;
                }
                if (homeActivityV22 != null) {
                    HomeActivityV2.lime(homeActivityV22);
                }
                return Unit.INSTANCE;
            case 2:
                androidx.fragment.app.ai requireParentFragment = this.purple.requireParentFragment();
                Intrinsics.delta(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            case 3:
                C0208p c0208p = this.purple;
                c0208p.sierra();
                c0208p.kilo().kilo();
                androidx.fragment.app.ai parentFragment = c0208p.getParentFragment();
                if (parentFragment instanceof OrdersFragmentV2) {
                    ordersFragmentV2 = (OrdersFragmentV2) parentFragment;
                } else {
                    ordersFragmentV2 = null;
                }
                if (ordersFragmentV2 != null) {
                    ordersFragmentV2.sierra();
                    ordersFragmentV2.tango();
                    ordersFragmentV2.beige();
                }
                return Unit.INSTANCE;
            default:
                d3.k.fuchsia(this.purple.kilo());
                return Unit.INSTANCE;
        }
    }
}
