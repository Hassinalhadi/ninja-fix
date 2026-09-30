package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersRefresheringStopSpinner implements Runnable {
    private final SwipeRefreshLayout swipe;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(60, ArchersOrdersRefresheringStopSpinner.class);
        Hidden0.special_clinit_60_00(ArchersOrdersRefresheringStopSpinner.class);
    }

    public ArchersOrdersRefresheringStopSpinner(SwipeRefreshLayout swipeRefreshLayout) {
        this.swipe = swipeRefreshLayout;
    }

    @Override // java.lang.Runnable
    public native void run();
}
