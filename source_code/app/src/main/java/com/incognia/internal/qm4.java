package com.incognia.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import ao.ad;
import h9.as;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qm4 extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lhI f11169b;

    public qm4(lhI lhi) {
        this.f11169b = lhi;
    }

    public static final void W(lhI lhi, Network network) {
        lhi.f10835R = false;
        Iterator it = lhi.gmP.iterator();
        if (!it.hasNext()) {
        } else {
            throw ad.yankee(it);
        }
    }

    public static final void b(lhI lhi, Network network) {
        lhi.f10835R = true;
        Iterator it = lhi.gmP.iterator();
        if (it.hasNext()) {
            throw ad.yankee(it);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        lhI lhi = this.f11169b;
        njO.b(lhi, new h9.ax(lhi, network, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        lhI lhi = this.f11169b;
        njO.b(lhi, new h9.ax(lhi, network, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        lhI lhi = this.f11169b;
        njO.b(lhi, new as(lhi, 1));
    }

    public static final void b(lhI lhi) {
        lhi.f10835R = false;
        Iterator it = lhi.gmP.iterator();
        if (it.hasNext()) {
            throw ad.yankee(it);
        }
    }
}
