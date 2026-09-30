package com.incognia.internal;

import android.location.Location;
import g3.z;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Ut implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9736W = LazyKt.lazy(Jl.f8964b);

    /* renamed from: b, reason: collision with root package name */
    public final fJi f9737b;

    public Ut(fJi fji) {
        this.f9737b = fji;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9736W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        String str;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (CnH.b(CnH.f8484b, 31, 0, 2)) {
                Location location = new Location("");
                z.sierra(location);
                this.f9737b.getClass();
                str = location.toString();
            } else {
                str = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9736W.getValue(), str, new Hnm(new tKF(str))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
