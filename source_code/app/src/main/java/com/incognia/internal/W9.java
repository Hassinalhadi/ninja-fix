package com.incognia.internal;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class W9 implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9833b = LazyKt.lazy(JMg.f8949b);

    public W9(WbQ wbQ) {
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9833b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        String str;
        List list;
        Enumeration<NetworkInterface> networkInterfaces;
        try {
            Result.Companion companion = Result.INSTANCE;
            str = (String) this.f9833b.getValue();
            try {
                networkInterfaces = NetworkInterface.getNetworkInterfaces();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (networkInterfaces != null) {
            list = AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.charlie(new M.h(networkInterfaces)), wYG.f11750b));
            m206constructorimpl = Result.m206constructorimpl(new rJ(str, list));
            Bo7.b(m206constructorimpl, wa2);
        }
        list = null;
        m206constructorimpl = Result.m206constructorimpl(new rJ(str, list));
        Bo7.b(m206constructorimpl, wa2);
    }
}
