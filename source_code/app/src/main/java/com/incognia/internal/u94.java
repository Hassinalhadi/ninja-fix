package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class u94 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0B f11446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u94(r0B r0b) {
        super(1);
        this.f11446b = r0b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f11446b.invoke((FM4) obj);
        return Unit.INSTANCE;
    }
}
