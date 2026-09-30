package com.checkout.components.rememberme.di;

import Xd.l;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.data.TokeniseRepository;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailablePrefilledUseCase;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailableUseCase;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import com.checkout.components.rememberme.utils.JWTDecoder;
import com.checkout.components.rememberme.utils.TokenDetailsResponseToTokenDetails;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0004\b\"\u0010#J1\u0010'\u001a\u00020&2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\r2\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0007¢\u0006\u0004\b'\u0010(Jó\u0001\u0010?\u001a\u00020>2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\b\u0001\u0010+\u001a\u00020\u000e2$\b\u0001\u0010/\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0.\u0012\u0006\u0012\u0004\u0018\u00010\u00010,2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\r2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\r2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0001\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001c\u0018\u0001032\u0006\u0010\u0011\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00109\u001a\u0002082\u0006\u0010\u0013\u001a\u00020\u00122\u001a\b\u0001\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020<0;0:H\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020>H\u0007¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/checkout/components/rememberme/di/UseCaseModule;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/checkout/components/interfaces/model/TokenDetails;", "provideTokenDetailsResponseToTokenDetails", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/rememberme/utils/JWTDecoder;", "jwtDecoder", "Lcom/checkout/components/rememberme/data/ConsumerRepository;", "consumerRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "jwtTokenRepository", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "mapJWTTokenToWalletUseCase", "(Lcom/checkout/components/rememberme/utils/JWTDecoder;Lcom/checkout/components/rememberme/data/ConsumerRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "kmpRememberMe", "", "isAccountAvailableRepository", "Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "", "checkIsAccountAvailablePrefilledUseCase", "(Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;)Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "screenEventNavigationRepository", "checkIsAccountAvailableUseCase", "(Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;)Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "logoutUseCase", "(Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;)Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "Lcom/checkout/components/rememberme/data/TokeniseRepository;", "tokeniseRepository", "publicKey", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "onPayRememberMe", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "walletScreenViewStateRepository", "mapper", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "Lcom/checkout/components/rememberme/model/RememberMeCallback;", "rememberMeCallback", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "rmStateManager", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "", "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadataRepository", "Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;", "provideSubmitSavedCardUseCaseRequest", "(Lcom/checkout/components/rememberme/utils/JWTDecoder;Lcom/checkout/components/rememberme/data/ConsumerRepository;Lcom/checkout/components/rememberme/data/TokeniseRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Ljava/lang/String;LXd/l;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/mapper/Mapper;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/rememberme/model/RememberMeCallback;Lcom/checkout/components/rememberme/ui/manager/RMStateManager;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;)Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;", "request", "Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "submitSavedCardUseCase", "(Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;)Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UseCaseModule {
    public static final int $stable = 0;

    @NotNull
    public final SuspendUseCase<String, Unit> checkIsAccountAvailablePrefilledUseCase(@NotNull CheckoutKMPRememberMe kmpRememberMe, @NotNull PrimitiveStateFlowRepository<Boolean> isAccountAvailableRepository) {
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(isAccountAvailableRepository, "isAccountAvailableRepository");
        return new CheckIsAccountAvailablePrefilledUseCase(kmpRememberMe, isAccountAvailableRepository, null, 4, null);
    }

    @NotNull
    public final SuspendUseCase<String, Unit> checkIsAccountAvailableUseCase(@NotNull CheckoutKMPRememberMe kmpRememberMe, @NotNull PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository) {
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(screenEventNavigationRepository, "screenEventNavigationRepository");
        return new CheckIsAccountAvailableUseCase(kmpRememberMe, screenEventNavigationRepository, null, 4, null);
    }

    @NotNull
    public final LogoutUseCase logoutUseCase(@NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository) {
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        return new LogoutUseCase(walletRepository, jwtTokenRepository);
    }

    @NotNull
    public final MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase(@NotNull JWTDecoder jwtDecoder, @NotNull ConsumerRepository consumerRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull LogDetails logDetails, @NotNull Logger logger) {
        Intrinsics.echo(jwtDecoder, "jwtDecoder");
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(logger, "logger");
        return new MapJWTTokenToWalletUseCase(jwtDecoder, consumerRepository, jwtTokenRepository, logger, logDetails, null, 32, null);
    }

    @NotNull
    public final SubmitSavedCardUseCaseRequest provideSubmitSavedCardUseCaseRequest(@NotNull JWTDecoder jwtDecoder, @NotNull ConsumerRepository consumerRepository, @NotNull TokeniseRepository tokeniseRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull String publicKey, @NotNull l onPayRememberMe, @NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull PrimitiveStateFlowRepository<WalletScreenViewState> walletScreenViewStateRepository, @NotNull Mapper<TokenDetailsResponse, TokenDetails> mapper, @Nullable Function1<? super CheckoutError, Unit> onError, @NotNull LogDetails logDetails, @Nullable RememberMeCallback rememberMeCallback, @NotNull RMStateManager rmStateManager, @NotNull Logger logger, @NotNull PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository) {
        l lVar;
        Intrinsics.echo(jwtDecoder, "jwtDecoder");
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(tokeniseRepository, "tokeniseRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(walletScreenViewStateRepository, "walletScreenViewStateRepository");
        Intrinsics.echo(mapper, "mapper");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(rmStateManager, "rmStateManager");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(cardMetadataRepository, "cardMetadataRepository");
        if (rememberMeCallback != null) {
            lVar = rememberMeCallback.getOnTokenized();
        } else {
            lVar = null;
        }
        return new SubmitSavedCardUseCaseRequest(jwtDecoder, consumerRepository, tokeniseRepository, jwtTokenRepository, publicKey, walletRepository, walletScreenViewStateRepository, null, mapper, onPayRememberMe, onError, logDetails, lVar, rmStateManager, logger, cardMetadataRepository, 128, null);
    }

    @NotNull
    public final Mapper<TokenDetailsResponse, TokenDetails> provideTokenDetailsResponseToTokenDetails() {
        return new TokenDetailsResponseToTokenDetails();
    }

    @NotNull
    public final SubmitSavedCardUseCase submitSavedCardUseCase(@NotNull SubmitSavedCardUseCaseRequest request) {
        Intrinsics.echo(request, "request");
        return new SubmitSavedCardUseCase(request);
    }
}
