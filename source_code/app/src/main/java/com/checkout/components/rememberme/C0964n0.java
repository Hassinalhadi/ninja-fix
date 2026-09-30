package com.checkout.components.rememberme;

import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.logger.RememberMeLoggerImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0964n0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f6152a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6153b;

    public C0964n0(RememberMeModule rememberMeModule, dagger.internal.b bVar) {
        this.f6152a = rememberMeModule;
        this.f6153b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RememberMeModule rememberMeModule = this.f6152a;
        Logger logger = (Logger) this.f6153b.get();
        rememberMeModule.getClass();
        Intrinsics.echo(logger, "logger");
        return new RememberMeLoggerImpl(logger);
    }
}
