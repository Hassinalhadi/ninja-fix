package com.incognia.internal;

import android.os.SystemClock;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class xyU implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f11825b = LazyKt.lazy(T3.f9637b);

    public xyU(W6 w62) {
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11825b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new ecq((String) this.f11825b.getValue(), new oVD(SystemClock.elapsedRealtime(), System.currentTimeMillis(), W6.b(), TimeZone.getDefault().getID())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
