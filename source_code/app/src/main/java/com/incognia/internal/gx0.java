package com.incognia.internal;

import h9.ag;
import h9.am;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class gx0 implements Gg {

    /* renamed from: W, reason: collision with root package name */
    public final XuT f10508W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10509b;

    /* renamed from: f9, reason: collision with root package name */
    public final dGS f10510f9;
    public D5f sVU = aNe.f10097b;
    public final YKm gmP = new ag(this, 2);

    public gx0(pl2 pl2Var, XuT xuT, dGS dgs) {
        this.f10509b = pl2Var;
        this.f10508W = xuT;
        this.f10510f9 = dgs;
    }

    public static final void W(gx0 gx0Var) {
        dGS dgs = gx0Var.f10510f9;
        dgs.f10306f9.add(gx0Var.gmP);
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.sVU = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10509b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.sVU = b66.f10146b;
        njO.b(this, new h9.ao(this, 0));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.sVU;
    }

    public static final void b(gx0 gx0Var, boolean z2) {
        gx0Var.W();
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new am(5, this, cj0));
    }

    public static final void b(gx0 gx0Var, Function0 function0) {
        dGS dgs = gx0Var.f10510f9;
        dgs.f10306f9.remove(gx0Var.gmP);
        gx0Var.sVU = L4.f9041b;
        function0.invoke();
    }

    public final void W() {
        njO.b(this, new h9.ao(this, 1));
    }

    public static final void b(gx0 gx0Var) {
        gx0Var.f10508W.b(new Nh(cq.f10265W));
    }
}
