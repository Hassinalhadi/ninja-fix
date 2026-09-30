package com.incognia.internal;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class r0B extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f11190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0B(LinkedHashMap linkedHashMap) {
        super(1);
        this.f11190b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).f8696w = this.f11190b;
        return Unit.INSTANCE;
    }
}
