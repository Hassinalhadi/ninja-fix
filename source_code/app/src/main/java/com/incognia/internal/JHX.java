package com.incognia.internal;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class JHX implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final G5G f8943W;

    /* renamed from: b, reason: collision with root package name */
    public final L8H f8944b;

    /* renamed from: f9, reason: collision with root package name */
    public final dGS f8945f9;
    public final Lazy sVU = LazyKt.lazy(mxc.f10924b);

    public JHX(L8H l8h, G5G g5g, dGS dgs) {
        this.f8944b = l8h;
        this.f8943W = g5g;
        this.f8945f9 = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.sVU.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        ArrayList arrayList;
        if (!this.f8945f9.b()) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new bJ((String) this.sVU.getValue()))));
            return;
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            try {
                arrayList = this.f8943W.W();
            } catch (Throwable th) {
                this.f8944b.b(th, false);
                arrayList = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new Ua((String) wGk.H02.getValue(), arrayList));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
