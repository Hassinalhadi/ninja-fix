package com.incognia.internal;

import android.app.ActivityManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class lxj implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10866W = LazyKt.lazy(EVy.f8620b);

    /* renamed from: b, reason: collision with root package name */
    public final g f10867b;

    public lxj(g gVar) {
        this.f10867b = gVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10866W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        hCR hcr;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) this.f10866W.getValue();
            g gVar = this.f10867b;
            gVar.getClass();
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                gVar.f10454f9.getMemoryInfo(memoryInfo);
                gVar.sVU.getClass();
                hcr = Kn5.b(memoryInfo);
            } catch (Throwable unused) {
                hcr = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new h7(str, hcr));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
