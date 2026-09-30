package com.incognia.internal;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class wyZ {

    /* renamed from: W, reason: collision with root package name */
    public final vY f11768W;

    /* renamed from: b, reason: collision with root package name */
    public final k8E f11769b;

    /* renamed from: f9, reason: collision with root package name */
    public final Ssq f11770f9;

    public wyZ(k8E k8e, vY vYVar, Ssq ssq, W6 w62) {
        this.f11769b = k8e;
        this.f11768W = vYVar;
        this.f11770f9 = ssq;
    }

    public final P3H b() {
        return new P3H(this.f11769b.W(), this.f11769b.b(), this.f11768W.f11553b, cxz.b(), CnH.f8479R, CnH.DOu, CnH.f8475E, CnH.IB, this.f11770f9.olU, System.currentTimeMillis(), TimeZone.getDefault().getID());
    }
}
