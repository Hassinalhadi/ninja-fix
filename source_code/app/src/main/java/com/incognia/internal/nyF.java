package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class nyF extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyF(boolean z2) {
        super(1);
        this.f10980b = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).gG = Boolean.valueOf(this.f10980b);
        return Unit.INSTANCE;
    }
}
