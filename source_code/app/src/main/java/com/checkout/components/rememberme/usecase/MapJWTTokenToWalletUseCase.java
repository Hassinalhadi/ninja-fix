package com.checkout.components.rememberme.usecase;

import Cf.d;
import Cf.e;
import Nd.c;
import Yb.C0312j0;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.L;
import com.checkout.components.rememberme.O;
import com.checkout.components.rememberme.S;
import com.checkout.components.rememberme.V;
import com.checkout.components.rememberme.Y;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.utils.JWTDecoder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC3220y;
import vf.ao;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0080B¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "", "Lcom/checkout/components/rememberme/utils/JWTDecoder;", "jwtDecoder", "Lcom/checkout/components/rememberme/data/ConsumerRepository;", "consumerRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "jwtTokenRepository", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lvf/y;", "networkScope", "<init>", "(Lcom/checkout/components/rememberme/utils/JWTDecoder;Lcom/checkout/components/rememberme/data/ConsumerRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;Lvf/y;)V", "Lyf/i;", "Lkotlin/Result;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "invoke$rememberme_standardRelease", "(LNd/c;)Ljava/lang/Object;", "invoke", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapJWTTokenToWalletUseCase {
    public static final int $stable = 8;

    /* renamed from: a */
    private final JWTDecoder f6333a;

    /* renamed from: b */
    private final ConsumerRepository f6334b;

    /* renamed from: c */
    private final PrimitiveStateFlowRepository f6335c;

    /* renamed from: d */
    private final Logger f6336d;
    private final LogDetails e;

    /* renamed from: f */
    private final AbstractC3220y f6337f;

    /* renamed from: g */
    private final Lazy f6338g;

    public MapJWTTokenToWalletUseCase(@NotNull JWTDecoder jwtDecoder, @NotNull ConsumerRepository consumerRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull Logger logger, @NotNull LogDetails logDetails, @NotNull AbstractC3220y networkScope) {
        Intrinsics.echo(jwtDecoder, "jwtDecoder");
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(networkScope, "networkScope");
        this.f6333a = jwtDecoder;
        this.f6334b = consumerRepository;
        this.f6335c = jwtTokenRepository;
        this.f6336d = logger;
        this.e = logDetails;
        this.f6337f = networkScope;
        this.f6338g = LazyKt.lazy(new C0312j0(23, this));
    }

    public static final CheckoutError.Validation a(MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        return new CheckoutError.Validation("Failed to decode consumer token", CheckoutErrorCode.VALIDATION_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(mapJWTTokenToWalletUseCase.e));
    }

    public static final CheckoutError.Validation access$getConsumerDecodeError(MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        return (CheckoutError.Validation) mapJWTTokenToWalletUseCase.f6338g.getValue();
    }

    public static /* synthetic */ CheckoutError.Validation alpha(MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        return a(mapJWTTokenToWalletUseCase);
    }

    @Nullable
    public final Object invoke$rememberme_standardRelease(@NotNull c<? super InterfaceC3439i> cVar) {
        return new V(new S(new O(AbstractC3428A.lima(new L(new Y(this.f6335c.getFlow()))), this), this), this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MapJWTTokenToWalletUseCase(JWTDecoder jWTDecoder, ConsumerRepository consumerRepository, PrimitiveStateFlowRepository primitiveStateFlowRepository, Logger logger, LogDetails logDetails, AbstractC3220y abstractC3220y, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(jWTDecoder, consumerRepository, primitiveStateFlowRepository, logger, logDetails, abstractC3220y);
        if ((i4 & 32) != 0) {
            e eVar = ao.alpha;
            abstractC3220y = d.purple;
        }
    }
}
