package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RememberMeModule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0967o0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f6167a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6168b;

    public C0967o0(RememberMeModule rememberMeModule, dagger.internal.b bVar) {
        this.f6167a = rememberMeModule;
        this.f6168b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RememberMeModule rememberMeModule = this.f6167a;
        List supportedSchemes = (List) this.f6168b.get();
        rememberMeModule.getClass();
        Intrinsics.echo(supportedSchemes, "supportedSchemes");
        return supportedSchemes;
    }
}
