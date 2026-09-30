package com.incognia.internal;

import h9.C1824b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Kh extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Me f9018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kh(Me me2) {
        super(1);
        this.f9018b = me2;
    }

    public static final void b(Me me2, Nh nh) {
        U91 u91 = nh.f9242b;
        String str = Me.f9140K;
        me2.b(u91);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Nh) obj);
        return Unit.INSTANCE;
    }

    public final void b(Nh nh) {
        Me me2 = this.f9018b;
        njO.b(me2, new C1824b(7, me2, nh));
    }
}
