package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class xa extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f11803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(Boolean bool) {
        super(1);
        this.f11803b = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).Ni = this.f11803b;
        return Unit.INSTANCE;
    }
}
