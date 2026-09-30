package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Q7 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(boolean z2) {
        super(1);
        this.f9484b = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).nK = Boolean.valueOf(this.f9484b);
        return Unit.INSTANCE;
    }
}
