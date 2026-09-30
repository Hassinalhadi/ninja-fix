package com.incognia.internal;

import android.net.DhcpInfo;
import com.google.android.material.datepicker.j;
import h9.am;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class zZe implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11928W;

    /* renamed from: b, reason: collision with root package name */
    public final d94 f11929b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11930f9 = LazyKt.lazy(nQC.f10956b);

    public zZe(d94 d94Var, pl2 pl2Var) {
        this.f11929b = d94Var;
        this.f11928W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11930f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11928W.b(new am(20, wa2, this));
    }

    public static final void b(Function1 function1, zZe zze) {
        Object m206constructorimpl;
        GW gw;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) zze.f11930f9.getValue();
            d94 d94Var = zze.f11929b;
            d94Var.getClass();
            try {
                cuf cufVar = d94Var.IB;
                DhcpInfo dhcpInfo = d94Var.olU.getDhcpInfo();
                cufVar.getClass();
                gw = new GW(Integer.valueOf(dhcpInfo.ipAddress), Integer.valueOf(dhcpInfo.gateway), Integer.valueOf(dhcpInfo.netmask), Integer.valueOf(dhcpInfo.dns1), Integer.valueOf(dhcpInfo.dns2), Integer.valueOf(dhcpInfo.serverAddress));
            } catch (Throwable unused) {
                gw = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new lp1(str, gw));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
