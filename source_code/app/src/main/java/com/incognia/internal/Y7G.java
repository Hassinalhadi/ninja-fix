package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Y7G extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f9977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7G(Boolean bool) {
        super(1);
        this.f9977b = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).kTC = this.f9977b;
        return Unit.INSTANCE;
    }
}
