package com.checkout.components.core.di.module;

import com.checkout.components.interfaces.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/di/module/EnvironmentModule;", "", "Lcom/checkout/components/interfaces/Environment;", "environment", "<init>", "(Lcom/checkout/components/interfaces/Environment;)V", "provideEnvironment", "()Lcom/checkout/components/interfaces/Environment;", "a", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment$core_standardRelease", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvironmentModule {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Environment environment;

    public EnvironmentModule(@NotNull Environment environment) {
        Intrinsics.echo(environment, "environment");
        this.environment = environment;
    }

    @NotNull
    /* renamed from: getEnvironment$core_standardRelease, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final Environment provideEnvironment() {
        return this.environment;
    }
}
