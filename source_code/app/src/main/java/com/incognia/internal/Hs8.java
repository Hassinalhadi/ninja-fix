package com.incognia.internal;

import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Hs8 {

    /* renamed from: W, reason: collision with root package name */
    public final d94 f8870W;

    /* renamed from: b, reason: collision with root package name */
    public final KDK f8871b;

    /* renamed from: f9, reason: collision with root package name */
    public final tNn f8872f9;
    public final S gmP;
    public final lhI sVU;

    public Hs8(KDK kdk, d94 d94Var, tNn tnn, lhI lhi, S s3) {
        this.f8871b = kdk;
        this.f8870W = d94Var;
        this.f8872f9 = tnn;
        this.sVU = lhi;
        this.gmP = s3;
    }

    public final List b(nD nDVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Qnk qnk = Qnk.f9518b;
        if (!this.f8870W.gmP() && !this.f8870W.PqK()) {
            z2 = false;
        } else {
            z2 = true;
        }
        GNY gny = new GNY(qnk, z2);
        aYF ayf = aYF.f10104b;
        tNn tnn = this.f8872f9;
        boolean W5 = tnn.W("gps");
        boolean W10 = tnn.W("network");
        if (this.f8871b.b("android.permission.ACCESS_FINE_LOCATION") && W5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((this.f8871b.b("android.permission.ACCESS_COARSE_LOCATION") || this.f8871b.b("android.permission.ACCESS_FINE_LOCATION")) && W10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        GNY gny2 = new GNY(ayf, z12);
        Tk tk = Tk.f9682b;
        lhI lhi = this.sVU;
        lhi.getClass();
        if (CnH.b(CnH.f8484b, 24, 0, 2) && lhi.olU.get()) {
            z13 = lhi.f10835R;
        } else {
            NetworkInfo activeNetworkInfo = lhi.f10834J.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                z13 = activeNetworkInfo.isConnectedOrConnecting();
            } else {
                z13 = false;
            }
        }
        GNY gny3 = new GNY(tk, z13);
        rG rGVar = rG.f11212b;
        if (!this.f8871b.b("android.permission.ACCESS_COARSE_LOCATION") && !this.f8871b.b("android.permission.ACCESS_FINE_LOCATION")) {
            z14 = false;
        } else {
            z14 = true;
        }
        GNY gny4 = new GNY(rGVar, z14);
        pYG pyg = pYG.f11081b;
        if (this.gmP.f9573f9.get() != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        ArrayList white = CollectionsKt.white(gny, gny2, gny3, gny4, new GNY(pyg, z15));
        if (!Intrinsics.areEqual(nDVar, IG.f8892f9)) {
            white.add(new GNY(w7.f11599b, Intrinsics.areEqual(nDVar, Cc5.f8464f9)));
        }
        return white;
    }
}
