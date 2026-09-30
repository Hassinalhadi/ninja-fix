package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RememberMeModule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0970p0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f6174a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6175b;

    public C0970p0(RememberMeModule rememberMeModule, dagger.internal.b bVar) {
        this.f6174a = rememberMeModule;
        this.f6175b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RememberMeModule rememberMeModule = this.f6174a;
        List supportedTypes = (List) this.f6175b.get();
        rememberMeModule.getClass();
        Intrinsics.echo(supportedTypes, "supportedTypes");
        return supportedTypes;
    }
}
