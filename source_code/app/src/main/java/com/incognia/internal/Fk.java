package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Fk extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f8725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fk(Function0 function0) {
        super(1);
        this.f8725b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f8725b.invoke();
        return Unit.INSTANCE;
    }
}
