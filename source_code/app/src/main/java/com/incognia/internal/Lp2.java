package com.incognia.internal;

import android.location.Location;
import g3.z;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Lp2 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9082W = LazyKt.lazy(pmm.f11106b);

    /* renamed from: b, reason: collision with root package name */
    public final fJi f9083b;

    public Lp2(fJi fji) {
        this.f9083b = fji;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9082W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Integer num;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (CnH.b(CnH.f8484b, 31, 0, 2)) {
                Location location = new Location("");
                z.sierra(location);
                this.f9083b.getClass();
                num = fJi.b(location);
            } else {
                num = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9082W.getValue(), num, new Jj6(new I7U(num))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
