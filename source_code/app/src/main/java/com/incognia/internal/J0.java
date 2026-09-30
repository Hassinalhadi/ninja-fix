package com.incognia.internal;

import h9.C1827e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class J0 extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ oBS f8930W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ urQ f8931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(urQ urq, oBS obs) {
        super(1);
        this.f8931b = urq;
        this.f8930W = obs;
    }

    public static final void b(urQ urq, cQM cqm, Function1 function1) {
        urq.f11503V = false;
        if (function1 != null) {
            function1.invoke(urQ.DOu);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((cQM) obj);
        return Unit.INSTANCE;
    }

    public final void b(cQM cqm) {
        urQ urq = this.f8931b;
        njO.b(urq, new C1827e((Object) urq, (Object) cqm, (Function1) this.f8930W, 1));
    }
}
