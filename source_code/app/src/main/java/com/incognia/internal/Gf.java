package com.incognia.internal;

import h9.C1824b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Gf extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jp f8804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gf(jp jpVar) {
        super(1);
        this.f8804b = jpVar;
    }

    public static final void b(Ri ri, jp jpVar) {
        if (Intrinsics.areEqual(ri.f9560b, Cc5.f8464f9)) {
            W6 w62 = jpVar.sVU;
            QHn.f9493f9.b(jp.f10715n9, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Ri) obj);
        return Unit.INSTANCE;
    }

    public final void b(Ri ri) {
        jp jpVar = this.f8804b;
        njO.b(jpVar, new C1824b(3, ri, jpVar));
    }
}
