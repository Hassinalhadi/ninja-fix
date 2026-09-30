package com.incognia.internal;

import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.k;

/* loaded from: classes2.dex */
public final class lyy extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final lyy f10868b = new lyy();

    public lyy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object m206constructorimpl;
        boolean z2 = false;
        if (CnH.b(CnH.f8484b, 23, 0, 2)) {
            Lazy lazy = Mui.f9175b;
            try {
                Result.Companion companion = Result.INSTANCE;
                System.loadLibrary((String) wGk.imL.getValue());
                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Result.m207exceptionOrNullimpl(m206constructorimpl);
            z2 = !(m206constructorimpl instanceof k);
        }
        return Boolean.valueOf(z2);
    }
}
