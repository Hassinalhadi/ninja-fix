package com.incognia.internal;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class P7R implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Object f9390W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9391b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lambda f9392f9;

    /* JADX WARN: Multi-variable type inference failed */
    public P7R(String str, Object obj, Function1 function1) {
        this.f9391b = str;
        this.f9390W = obj;
        this.f9392f9 = (Lambda) function1;
        LazyKt.lazy(new GcI(this));
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9391b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        this.f9392f9.invoke(fm4);
    }
}
