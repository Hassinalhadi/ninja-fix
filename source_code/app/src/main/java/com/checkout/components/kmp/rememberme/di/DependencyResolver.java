package com.checkout.components.kmp.rememberme.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/kmp/rememberme/di/DependencyResolver;", "", "<init>", "()V", "T", "Llg/a;", "qualifier", "get", "(Llg/a;)Ljava/lang/Object;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DependencyResolver {
    public static final int $stable = 0;

    @NotNull
    public static final DependencyResolver INSTANCE = new DependencyResolver();

    private DependencyResolver() {
    }

    public static Object get$default(DependencyResolver dependencyResolver, lg.a aVar, int i4, Object obj) {
        eg.a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release == null) {
            throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
        }
        try {
            og.a aVar2 = koin$rememberme_release.charlie.delta;
            Intrinsics.juliet();
            throw null;
        } catch (Exception unused) {
            Intrinsics.juliet();
            throw null;
        }
    }

    public final <T> T get(lg.a qualifier) {
        eg.a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release == null) {
            throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
        }
        try {
            og.a aVar = koin$rememberme_release.charlie.delta;
            Intrinsics.juliet();
            throw null;
        } catch (Exception unused) {
            Intrinsics.juliet();
            throw null;
        }
    }
}
