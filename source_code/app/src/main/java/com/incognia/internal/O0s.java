package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class O0s extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G1 f9282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0s(G1 g12) {
        super(1);
        this.f9282b = g12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f9282b.b((FM4) obj);
        return Unit.INSTANCE;
    }
}
