package com.checkout.components.card.operations.tokenisation.repository;

import A0.z;
import Cf.d;
import Cf.e;
import Nd.c;
import Xd.l;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.b0;
import com.checkout.components.card.c0;
import com.checkout.components.card.operations.network.NetworkApiClient;
import com.checkout.components.card.operations.network.error.ErrorMessages;
import com.checkout.components.card.operations.network.model.ErrorResponse;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTokenDetails;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.ComponentResult;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.interfaces.model.TokenizationResult;
import com.checkout.components.ui.model.CardScheme;
import com.google.maps.android.BuildConfig;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;
import vf.U;
import vf.aa;
import vf.ab;
import vf.ad;
import vf.ao;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012(\u0010\f\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011\u0012$\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0005\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J'\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010*0)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepositoryImpl;", "Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "Lcom/checkout/components/card/operations/network/NetworkApiClient;", "networkApiClient", "cagApiClient", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "", "Lcom/checkout/components/card/model/OnTokenResult;", "onTokenResult", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lkotlin/Function1;", "onError", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "", "onTokenized", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/checkout/components/interfaces/model/TokenDetails;", "mapper", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lvf/ab;", "networkCoroutineScope", "<init>", "(Lcom/checkout/components/card/operations/network/NetworkApiClient;Lcom/checkout/components/card/operations/network/NetworkApiClient;LXd/l;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;Lkotlin/jvm/functions/Function1;LXd/l;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lvf/ab;)V", "Lcom/checkout/components/card/operations/tokenisation/network/model/CardTokenRequest;", "request", "sendCardTokenRequest", "(Lcom/checkout/components/card/operations/tokenisation/network/model/CardTokenRequest;)V", "sendCardTokenOnly", "", "token", "Lkotlin/Pair;", "Lokhttp3/Headers;", "getClientAndHeaders$card_standardRelease", "(Ljava/lang/String;)Lkotlin/Pair;", "getClientAndHeaders", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenRepositoryImpl implements TokenRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkApiClient f4353a;

    /* renamed from: b, reason: collision with root package name */
    private final NetworkApiClient f4354b;

    /* renamed from: c, reason: collision with root package name */
    private final l f4355c;

    /* renamed from: d, reason: collision with root package name */
    private final Logger f4356d;
    private final LogDetails e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f4357f;

    /* renamed from: g, reason: collision with root package name */
    private final l f4358g;

    /* renamed from: h, reason: collision with root package name */
    private final Mapper f4359h;

    /* renamed from: i, reason: collision with root package name */
    private final PaymentStateManager f4360i;

    /* renamed from: j, reason: collision with root package name */
    private final ab f4361j;

    public TokenRepositoryImpl(@NotNull NetworkApiClient networkApiClient, @NotNull NetworkApiClient cagApiClient, @NotNull l onTokenResult, @NotNull Logger logger, @NotNull LogDetails logDetails, @Nullable Function1<? super CheckoutError, Unit> function1, @Nullable l lVar, @NotNull Mapper<TokenDetailsResponse, TokenDetails> mapper, @NotNull PaymentStateManager paymentStateManager, @NotNull ab networkCoroutineScope) {
        Intrinsics.echo(networkApiClient, "networkApiClient");
        Intrinsics.echo(cagApiClient, "cagApiClient");
        Intrinsics.echo(onTokenResult, "onTokenResult");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(mapper, "mapper");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(networkCoroutineScope, "networkCoroutineScope");
        this.f4353a = networkApiClient;
        this.f4354b = cagApiClient;
        this.f4355c = onTokenResult;
        this.f4356d = logger;
        this.e = logDetails;
        this.f4357f = function1;
        this.f4358g = lVar;
        this.f4359h = mapper;
        this.f4360i = paymentStateManager;
        this.f4361j = networkCoroutineScope;
    }

    public static void a(TokenRepositoryImpl tokenRepositoryImpl, CardTokenRequest cardTokenRequest, boolean z2, NetworkApiClient networkApiClient) {
        ad.zulu(tokenRepositoryImpl.f4361j, null, null, new b0(networkApiClient, cardTokenRequest, null, tokenRepositoryImpl, z2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSuccess(TokenRepositoryImpl tokenRepositoryImpl, TokenDetailsResponse tokenDetailsResponse, Headers headers, Function0 function0, boolean z2, c cVar) {
        c0 c0Var;
        int i4;
        String str;
        String str2;
        CardTokenDetails cardTokenDetails;
        boolean z10;
        CallbackResult callbackResult;
        CardTokenDetails cardTokenDetails2;
        String name;
        tokenRepositoryImpl.getClass();
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i5 = c0Var.f4008j;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0Var.f4008j = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0Var.f4006h;
                Od.a aVar = Od.a.alpha;
                i4 = c0Var.f4008j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        z10 = c0Var.f4005g;
                        cardTokenDetails2 = c0Var.f4004f;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    TokenDetails tokenDetails = (TokenDetails) tokenRepositoryImpl.f4359h.map(tokenDetailsResponse);
                    CardMetadata cardMetadata = (CardMetadata) ((N) tokenRepositoryImpl.f4360i.getCardMetadata()).getValue();
                    Object value = ((N) tokenRepositoryImpl.f4360i.getPreferredCardScheme()).getValue();
                    if (((CardScheme) value) == CardScheme.UNKNOWN) {
                        value = null;
                    }
                    CardScheme cardScheme = (CardScheme) value;
                    if (cardScheme != null && (name = cardScheme.name()) != null) {
                        str = name.toLowerCase(Locale.ROOT);
                        Intrinsics.delta(str, "toLowerCase(...)");
                    } else {
                        str = null;
                    }
                    TokenizationResult tokenizationResult = new TokenizationResult("card", tokenDetails, cardMetadata, str);
                    function0.invoke();
                    String token = tokenDetails.getToken();
                    String bin = tokenDetails.getBin();
                    if (headers != null) {
                        str2 = headers.get("X-Tokenizationreference");
                    } else {
                        str2 = null;
                    }
                    cardTokenDetails = new CardTokenDetails(token, bin, tokenDetailsResponse.getBillingAddress(), tokenDetailsResponse.getPhone(), tokenizationResult.getPreferredScheme(), str2);
                    l lVar = tokenRepositoryImpl.f4358g;
                    if (lVar != null) {
                        c0Var.f4000a = null;
                        c0Var.f4001b = null;
                        c0Var.f4002c = null;
                        c0Var.f4003d = null;
                        c0Var.e = null;
                        c0Var.f4004f = cardTokenDetails;
                        c0Var.f4005g = z2;
                        c0Var.f4008j = 1;
                        Object invoke = lVar.invoke(tokenizationResult, c0Var);
                        if (invoke == aVar) {
                            return aVar;
                        }
                        obj = invoke;
                        z10 = z2;
                        cardTokenDetails2 = cardTokenDetails;
                    } else {
                        z10 = z2;
                        callbackResult = null;
                        if ((callbackResult instanceof CallbackResult.Accepted) && callbackResult != null) {
                            if (callbackResult instanceof CallbackResult.Rejected) {
                                at uiPaymentErrorMessage = tokenRepositoryImpl.f4360i.getUiPaymentErrorMessage();
                                String errorMessage = ((CallbackResult.Rejected) callbackResult).getErrorMessage();
                                if (errorMessage == null) {
                                    errorMessage = "";
                                }
                                N n5 = (N) uiPaymentErrorMessage;
                                n5.getClass();
                                n5.juliet(null, errorMessage);
                                tokenRepositoryImpl.f4355c.invoke(new ComponentResult.Success(cardTokenDetails), Boolean.FALSE);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            tokenRepositoryImpl.f4355c.invoke(new ComponentResult.Success(cardTokenDetails), Boolean.valueOf(z10));
                        }
                        return Unit.INSTANCE;
                    }
                }
                callbackResult = (CallbackResult) obj;
                cardTokenDetails = cardTokenDetails2;
                if (callbackResult instanceof CallbackResult.Accepted) {
                }
                tokenRepositoryImpl.f4355c.invoke(new ComponentResult.Success(cardTokenDetails), Boolean.valueOf(z10));
                return Unit.INSTANCE;
            }
        }
        c0Var = new c0(tokenRepositoryImpl, cVar);
        Object obj2 = c0Var.f4006h;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0Var.f4008j;
        if (i4 == 0) {
        }
        callbackResult = (CallbackResult) obj2;
        cardTokenDetails = cardTokenDetails2;
        if (callbackResult instanceof CallbackResult.Accepted) {
        }
        tokenRepositoryImpl.f4355c.invoke(new ComponentResult.Success(cardTokenDetails), Boolean.valueOf(z10));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Pair<NetworkApiClient, Headers> getClientAndHeaders$card_standardRelease(@Nullable String token) {
        String str;
        Headers of2;
        if (token != null) {
            if (!StringsKt.gray(token) && !Intrinsics.areEqual(token, "save_card_unchecked")) {
                str = token;
            } else {
                str = null;
            }
            if (str != null && (of2 = Headers.INSTANCE.of(OkHttpConstants.HEADER_CONSUMER_AUTHORIZATION, str, "Cko-Service-Name", "CheckoutAndroidComponents", "Cko-Service-Version", "2.1.0")) != null) {
                return new Pair<>(this.f4354b, of2);
            }
        }
        return new Pair<>(this.f4353a, null);
    }

    @Override // com.checkout.components.card.operations.tokenisation.repository.TokenRepository
    public final void sendCardTokenOnly(@NotNull CardTokenRequest request) {
        Intrinsics.echo(request, "request");
        if (this.f4358g == null) {
            Function1 function1 = this.f4357f;
            if (function1 != null) {
                function1.invoke(new CheckoutError.Integration(ErrorMessages.ON_TOKENIZED_CALLBACK_NULL, CheckoutErrorCode.CALLBACK_NOT_PROVIDED, new CheckoutErrorDetails.Integration(this.e.getMobileSessionId(), this.e.getPaymentSessionId(), this.e.getType())));
                return;
            }
            return;
        }
        Pair<NetworkApiClient, Headers> clientAndHeaders$card_standardRelease = getClientAndHeaders$card_standardRelease(request.getRememberMeJWTToken());
        ad.zulu(this.f4361j, null, null, new b0((NetworkApiClient) clientAndHeaders$card_standardRelease.first, request, (Headers) clientAndHeaders$card_standardRelease.second, this, false, null), 3);
    }

    @Override // com.checkout.components.card.operations.tokenisation.repository.TokenRepository
    public final void sendCardTokenRequest(@NotNull CardTokenRequest request) {
        Intrinsics.echo(request, "request");
        Pair<NetworkApiClient, Headers> clientAndHeaders$card_standardRelease = getClientAndHeaders$card_standardRelease(request.getRememberMeJWTToken());
        ad.zulu(this.f4361j, null, null, new b0((NetworkApiClient) clientAndHeaders$card_standardRelease.first, request, (Headers) clientAndHeaders$card_standardRelease.second, this, true, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkApiResponse.Error error, Function0 function0) {
        CheckoutError internal;
        String str;
        List<String> errorCodes;
        boolean z2 = error instanceof NetworkApiResponse.Error.ServerError;
        String str2 = null;
        if (z2) {
            CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED;
            String mobileSessionId = this.e.getMobileSessionId();
            String paymentSessionId = this.e.getPaymentSessionId();
            ComponentName type = this.e.getType();
            NetworkApiResponse.Error.ServerError serverError = (NetworkApiResponse.Error.ServerError) error;
            ErrorResponse body = serverError.getBody();
            List<String> errorCodes2 = body != null ? body.getErrorCodes() : null;
            ErrorResponse body2 = serverError.getBody();
            internal = new CheckoutError.Request(ErrorMessages.TOKEN_REQUEST_FAILED, checkoutErrorCode, new CheckoutErrorDetails.Request(mobileSessionId, paymentSessionId, type, null, errorCodes2, body2 != null ? body2.getRequestId() : null, Integer.valueOf(serverError.getCode())));
        } else if (error instanceof NetworkApiResponse.Error.NetworkError) {
            internal = new CheckoutError.Request(ErrorMessages.NETWORK_REQUEST_ERROR, CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED, new CheckoutErrorDetails.Request(this.e.getMobileSessionId(), this.e.getPaymentSessionId(), this.e.getType(), null, null, null, null));
        } else if (error instanceof NetworkApiResponse.Error.InternalError) {
            internal = new CheckoutError.Internal(ErrorMessages.INTERNAL_ERROR_ON_TOKEN_REQUEST, CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED, ErrorExtensionsKt.toInternalErrorDetails(this.e));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutError checkoutError = internal;
        if (error instanceof NetworkApiResponse.Error.InternalError) {
            Throwable throwable = ((NetworkApiResponse.Error.InternalError) error).getThrowable();
            if (throwable != null) {
                str2 = AbstractC2689j6.echo(throwable);
            }
        } else if (error instanceof NetworkApiResponse.Error.NetworkError) {
            str2 = AbstractC2689j6.echo(((NetworkApiResponse.Error.NetworkError) error).getThrowable());
        } else if (z2) {
            NetworkApiResponse.Error.ServerError serverError2 = (NetworkApiResponse.Error.ServerError) error;
            int code = serverError2.getCode();
            ErrorResponse body3 = serverError2.getBody();
            Object obj = BuildConfig.TRAVIS;
            if (body3 == null || (str = body3.getErrorType()) == null) {
                str = BuildConfig.TRAVIS;
            }
            ErrorResponse body4 = serverError2.getBody();
            if (body4 != null && (errorCodes = body4.getErrorCodes()) != null) {
                obj = errorCodes;
            }
            StringBuilder lima = z.lima("serverError: httpStatus=", " errorType=", str, " errorCodes=", code);
            lima.append(obj);
            str2 = lima.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String str3 = str2;
        function0.invoke();
        N4.a.alpha(this.f4356d, checkoutError, str3, false, 4, null);
        this.f4355c.invoke(new ComponentResult.Error(checkoutError), Boolean.FALSE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TokenRepositoryImpl(NetworkApiClient networkApiClient, NetworkApiClient networkApiClient2, l lVar, Logger logger, LogDetails logDetails, Function1 function1, l lVar2, Mapper mapper, PaymentStateManager paymentStateManager, ab abVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkApiClient, networkApiClient2, lVar, logger, logDetails, function1, lVar2, mapper, paymentStateManager, r11);
        ab abVar2;
        if ((i4 & 512) != 0) {
            aa aaVar = new aa(com.checkout.components.card.BuildConfig.LIBRARY_PACKAGE_NAME);
            e eVar = ao.alpha;
            abVar2 = ad.charlie(aaVar.plus(d.purple).plus(U.alpha));
        } else {
            abVar2 = abVar;
        }
    }
}
