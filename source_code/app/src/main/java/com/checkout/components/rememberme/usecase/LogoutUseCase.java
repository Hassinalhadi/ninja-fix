package com.checkout.components.rememberme.usecase;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.rememberme.model.GetWalletResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\tH\u0080\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "", "jwtTokenRepository", "<init>", "(Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;)V", "", "invoke$rememberme_standardRelease", "()V", "invoke", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogoutUseCase {
    public static final int $stable = PrimitiveStateFlowRepository.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveStateFlowRepository f6331a;

    /* renamed from: b, reason: collision with root package name */
    private final PrimitiveStateFlowRepository f6332b;

    public LogoutUseCase(@NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository) {
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        this.f6331a = walletRepository;
        this.f6332b = jwtTokenRepository;
    }

    public final void invoke$rememberme_standardRelease() {
        this.f6331a.update((PrimitiveStateFlowRepository) null);
        this.f6332b.update((PrimitiveStateFlowRepository) null);
    }
}
