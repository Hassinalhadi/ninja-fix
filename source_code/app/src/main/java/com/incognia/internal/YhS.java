package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class YhS implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10005b = LazyKt.lazy(WhI.f9862b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10005b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        P6 p62;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) this.f10005b.getValue();
            synchronized (BPv.f8417b) {
                try {
                    kT kTVar = QHn.f9492b;
                    String str2 = BPv.f8416W;
                    P6 p63 = (P6) kTVar.b(avG.f10125b, str2);
                    if (p63 == null) {
                        p63 = new P6();
                    }
                    p62 = new P6(p63.f9388b);
                    kTVar.b(str2, new P6(), vA.f11534b);
                } finally {
                }
            }
            m206constructorimpl = Result.m206constructorimpl(new iO(str, p62));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
