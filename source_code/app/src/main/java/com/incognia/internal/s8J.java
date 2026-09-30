package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class s8J extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sD f11268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8J(sD sDVar) {
        super(1);
        this.f11268b = sDVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.areEqual(((sD) obj).f11281b, this.f11268b.f11281b));
    }
}
