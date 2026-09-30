package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class I7U extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f8883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7U(Integer num) {
        super(1);
        this.f8883b = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).rkR = this.f8883b;
        return Unit.INSTANCE;
    }
}
