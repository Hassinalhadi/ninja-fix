package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.am;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class jp implements Gg {

    /* renamed from: J, reason: collision with root package name */
    public final String f10716J;
    public D5f PqK = aNe.f10097b;

    /* renamed from: R, reason: collision with root package name */
    public final y6C f10717R;

    /* renamed from: V, reason: collision with root package name */
    public syj f10718V;

    /* renamed from: W, reason: collision with root package name */
    public final XuT f10719W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10720b;

    /* renamed from: f9, reason: collision with root package name */
    public final h3 f10721f9;
    public final CN1 gmP;
    public final y6C olU;
    public final W6 sVU;
    public static final String DOu = (String) wGk.yo0.getValue();
    public static final String IB = (String) wGk.aRN.getValue();
    public static final String Qs = (String) wGk.UJ.getValue();

    /* renamed from: E, reason: collision with root package name */
    public static final String f10714E = (String) wGk.qp.getValue();

    /* renamed from: n9, reason: collision with root package name */
    public static final String f10715n9 = (String) wGk.mim.getValue();

    public jp(pl2 pl2Var, XuT xuT, h3 h3Var, W6 w62, CN1 cn1, String str) {
        this.f10720b = pl2Var;
        this.f10719W = xuT;
        this.f10721f9 = h3Var;
        this.sVU = w62;
        this.gmP = cn1;
        this.f10716J = str;
        this.olU = new y6C(IB, pl2Var, new Gf(this));
        this.f10717R = new y6C(DOu, pl2Var, new NA(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.PqK = tOI.f11377b;
        this.f10719W.b(AZ.class, this.f10717R);
        this.f10719W.b(Ri.class, this.olU);
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10720b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.PqK = b66.f10146b;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.PqK;
    }

    public static final void b(jp jpVar, Function0 function0) {
        jpVar.PqK = L4.f9041b;
        function0.invoke();
    }

    public final void b(CRN crn) {
        if (njO.b(this, new am(8, this, crn))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        crn.invoke(new Result(Result.m206constructorimpl(ResultKt.createFailure(new KcS(Qs)))));
    }

    public static final void b(jp jpVar, Function1 function1) {
        if (!jpVar.gmP.b()) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new bJ(Qs))), function1);
            return;
        }
        syj syjVar = jpVar.f10718V;
        if (syjVar == null) {
            String str = jpVar.f10716J;
            String b2 = cxz.b();
            kT kTVar = QHn.f9493f9;
            String str2 = f10714E;
            Long sVU = kTVar.sVU(str2);
            syj syjVar2 = new syj(null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b2, null, null, null, null, null, null, null, null, null, CnH.f8475E, String.valueOf(CnH.IB), null, null, null, null, null, 70901, null, null, null, null, null, null, null, TimeZone.getDefault().getID(), Long.valueOf(sVU != null ? sVU.longValue() : 0L), Long.valueOf(System.currentTimeMillis()), null);
            Long sVU2 = kTVar.sVU(str2);
            kTVar.b(str2, Long.valueOf((sVU2 != null ? sVU2.longValue() : 0L) + 1));
            jpVar.f10718V = syjVar2;
            j.quebec(Result.m206constructorimpl(syjVar2), function1);
            return;
        }
        j.quebec(Result.m206constructorimpl(syjVar), function1);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.f10719W.W(AZ.class, this.f10717R);
        this.f10719W.W(Ri.class, this.olU);
        njO.b(this, new am(7, this, cj0));
    }
}
