package com.incognia.internal;

import android.os.Environment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class K8q implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f8990b = LazyKt.lazy(Ijh.f8916b);

    public K8q(k8 k8Var) {
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8990b.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new hvm((String) wGk.jG.getValue(), new K0(Intrinsics.areEqual("mounted", Environment.getExternalStorageState()), k8.J(), k8.sVU(), k8.f9(), k8.b(), k8.gmP(), k8.W())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
