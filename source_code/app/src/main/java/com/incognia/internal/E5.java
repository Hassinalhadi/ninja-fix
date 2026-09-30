package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class E5 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f8587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E5(Integer num) {
        super(1);
        this.f8587b = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).GT = this.f8587b;
        return Unit.INSTANCE;
    }
}
