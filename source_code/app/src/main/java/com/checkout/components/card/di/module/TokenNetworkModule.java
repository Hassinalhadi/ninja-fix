package com.checkout.components.card.di.module;

import Xd.l;
import com.checkout.components.card.mapper.TokenDetailsResponseToTokenDetails;
import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepositoryImpl;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJµ\u0001\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2(\u0010\u0017\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0010j\u0002`\u00162\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00182$\u0010\u001d\u001a \b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00102\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/checkout/components/card/di/module/TokenNetworkModule;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/checkout/components/interfaces/model/TokenDetails;", "provideTokenDetailsResponseToTokenDetails", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;", "apiClientImpl", "cagApiClient", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "", "Lcom/checkout/components/card/model/OnTokenResult;", "onResult", "Lkotlin/Function1;", "onError", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "mapper", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "provideTokenRepository", "(Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;Lcom/checkout/components/interfaces/insight/Logger;LXd/l;Lkotlin/jvm/functions/Function1;LXd/l;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/ui/manager/PaymentStateManager;)Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenNetworkModule {
    public static final int $stable = 0;

    @NotNull
    public final Mapper<TokenDetailsResponse, TokenDetails> provideTokenDetailsResponseToTokenDetails() {
        return new TokenDetailsResponseToTokenDetails();
    }

    @NotNull
    public final TokenRepository provideTokenRepository(@NotNull LogDetails logDetails, @NotNull NetworkApiClientImpl apiClientImpl, @NotNull NetworkApiClientImpl cagApiClient, @NotNull Logger logger, @NotNull l onResult, @Nullable Function1<? super CheckoutError, Unit> onError, @Nullable l onTokenized, @NotNull Mapper<TokenDetailsResponse, TokenDetails> mapper, @NotNull PaymentStateManager paymentStateManager) {
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(apiClientImpl, "apiClientImpl");
        Intrinsics.echo(cagApiClient, "cagApiClient");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(onResult, "onResult");
        Intrinsics.echo(mapper, "mapper");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        return new TokenRepositoryImpl(apiClientImpl, cagApiClient, onResult, logger, logDetails, onError, onTokenized, mapper, paymentStateManager, null, 512, null);
    }
}
