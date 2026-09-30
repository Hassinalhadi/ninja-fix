package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RememberMeModule;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0961m0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f5998a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5999b;

    public C0961m0(RememberMeModule rememberMeModule, dagger.internal.b bVar) {
        this.f5998a = rememberMeModule;
        this.f5999b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RememberMeModule rememberMeModule = this.f5998a;
        Xd.l onPayRememberMe = (Xd.l) this.f5999b.get();
        rememberMeModule.getClass();
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        return onPayRememberMe;
    }
}
