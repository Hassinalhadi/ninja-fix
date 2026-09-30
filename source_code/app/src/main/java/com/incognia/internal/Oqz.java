package com.incognia.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Oqz {
    public static final String gmP = (String) wGk.gcA.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Ssq f9369W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f9370b;

    /* renamed from: f9, reason: collision with root package name */
    public final KDK f9371f9;
    public final K sVU;

    public Oqz(S0A s0a, Ssq ssq, KDK kdk, K k6) {
        this.f9370b = s0a;
        this.f9369W = ssq;
        this.f9371f9 = kdk;
        this.sVU = k6;
    }

    public final boolean W() {
        List list;
        boolean z2;
        iA b2 = this.sVU.b();
        if (Intrinsics.areEqual(b2, r.f11189b)) {
            if (!((JSONObject) this.f9370b.f9574b.get()).optBoolean(gmP, true) && CnH.b(CnH.f8484b, 29, 0, 2)) {
                return this.f9371f9.b("android.permission.ACCESS_FINE_LOCATION");
            }
            if (this.f9371f9.b("android.permission.ACCESS_FINE_LOCATION")) {
                KDK kdk = this.f9371f9;
                r3 b4 = this.f9369W.b();
                if (b4 != null) {
                    list = b4.f11197V;
                } else {
                    list = null;
                }
                kdk.getClass();
                if (CnH.b(CnH.f8484b, 29, 0, 2)) {
                    z2 = kdk.b("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else if (list != null) {
                    z2 = list.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        if (Intrinsics.areEqual(b2, i.f10596b)) {
            return this.f9371f9.b("android.permission.ACCESS_FINE_LOCATION");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        List list;
        boolean z2;
        iA b2 = this.sVU.b();
        if (Intrinsics.areEqual(b2, r.f11189b)) {
            if (!((JSONObject) this.f9370b.f9574b.get()).optBoolean(gmP, true) && CnH.b(CnH.f8484b, 29, 0, 2)) {
                KDK kdk = this.f9371f9;
                if (kdk.b("android.permission.ACCESS_FINE_LOCATION") || kdk.b("android.permission.ACCESS_COARSE_LOCATION")) {
                    return true;
                }
                return false;
            }
            KDK kdk2 = this.f9371f9;
            if (kdk2.b("android.permission.ACCESS_FINE_LOCATION") || kdk2.b("android.permission.ACCESS_COARSE_LOCATION")) {
                KDK kdk3 = this.f9371f9;
                r3 b4 = this.f9369W.b();
                if (b4 != null) {
                    list = b4.f11197V;
                } else {
                    list = null;
                }
                kdk3.getClass();
                if (CnH.b(CnH.f8484b, 29, 0, 2)) {
                    z2 = kdk3.b("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else if (list != null) {
                    z2 = list.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        if (Intrinsics.areEqual(b2, i.f10596b)) {
            KDK kdk4 = this.f9371f9;
            if (kdk4.b("android.permission.ACCESS_FINE_LOCATION") || kdk4.b("android.permission.ACCESS_COARSE_LOCATION")) {
                return true;
            }
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
