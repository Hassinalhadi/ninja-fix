package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RememberMeModule;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.rememberme.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0958l0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f5986a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5987b;

    public C0958l0(RememberMeModule rememberMeModule, dagger.internal.b bVar) {
        this.f5986a = rememberMeModule;
        this.f5987b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RememberMeModule rememberMeModule = this.f5986a;
        Function1 function1 = (Function1) this.f5987b.get();
        rememberMeModule.getClass();
        return function1;
    }
}
