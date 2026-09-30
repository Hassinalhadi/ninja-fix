package com.checkout.components.core.di.module;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048AX\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068AX\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/core/di/module/RememberMeModule;", "", "", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)V", "Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;", "checkoutRememberMeFactory", "()Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;", "a", "Ljava/lang/String;", "getPublicKey$core_standardRelease", "()Ljava/lang/String;", "b", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment$core_standardRelease", "()Lcom/checkout/components/interfaces/Environment;", "c", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getDesignTokens$core_standardRelease", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeModule {
    public static final int $stable = DesignTokens.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String publicKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Environment environment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DesignTokens designTokens;

    public RememberMeModule(@NotNull String publicKey, @NotNull Environment environment, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        this.publicKey = publicKey;
        this.environment = environment;
        this.designTokens = designTokens;
    }

    @NotNull
    public final CheckoutRememberMeFactory checkoutRememberMeFactory() {
        return new CheckoutRememberMeFactory(this.publicKey, this.environment, this.designTokens);
    }

    @Nullable
    /* renamed from: getDesignTokens$core_standardRelease, reason: from getter */
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    /* renamed from: getEnvironment$core_standardRelease, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* renamed from: getPublicKey$core_standardRelease, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }
}
