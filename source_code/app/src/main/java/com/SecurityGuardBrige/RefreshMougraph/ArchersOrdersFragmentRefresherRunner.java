package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersFragmentRefresherRunner implements Runnable {
    private final OrdersFragmentV2 fragment;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(57, ArchersOrdersFragmentRefresherRunner.class);
        Hidden0.special_clinit_57_00(ArchersOrdersFragmentRefresherRunner.class);
    }

    public ArchersOrdersFragmentRefresherRunner(OrdersFragmentV2 ordersFragmentV2) {
        this.fragment = ordersFragmentV2;
    }

    @Override // java.lang.Runnable
    public native void run();
}
