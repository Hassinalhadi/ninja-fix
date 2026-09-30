package com.checkout.components.rememberme.model;

import Cf.d;
import Cf.e;
import Xd.l;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.data.TokeniseRepository;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.utils.JWTDecoder;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import vf.AbstractC3220y;
import vf.ao;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b0\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012$\u0010\"\u001a \b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0(0'¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bHÆ\u0003¢\u0006\u0004\b7\u00104J\u0018\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\bHÆ\u0003¢\u0006\u0004\b8\u00104J\u0010\u00109\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012HÆ\u0003¢\u0006\u0004\b;\u0010<J,\u0010=\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u001e\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bA\u0010BJ.\u0010C\u001a \b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bC\u0010>J\u0010\u0010D\u001a\u00020#HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020%HÆ\u0003¢\u0006\u0004\bF\u0010GJ\"\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0(0'HÆ\u0003¢\u0006\u0004\bH\u0010IJ®\u0002\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122$\b\u0002\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2&\b\u0002\u0010\"\u001a \b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00162\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\u001a\b\u0002\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0(0'HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bL\u00106J\u0010\u0010N\u001a\u00020MHÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u00102R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u00104R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u00106R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0006¢\u0006\f\n\u0004\bc\u0010^\u001a\u0004\bd\u00104R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b8\u0006¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010:R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010<R3\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010>R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010@R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010BR5\u0010\"\u001a \b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bv\u0010n\u001a\u0004\bw\u0010>R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010ER\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010GR*\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0(0'8\u0006¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010I¨\u0006\u0081\u0001"}, d2 = {"Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;", "", "Lcom/checkout/components/rememberme/utils/JWTDecoder;", "jwtDecoder", "Lcom/checkout/components/rememberme/data/ConsumerRepository;", "consumerRepository", "Lcom/checkout/components/rememberme/data/TokeniseRepository;", "tokeniseRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "jwtTokenRepository", "publicKey", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "walletScreenViewStateRepository", "Lvf/y;", "dispatcher", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/checkout/components/interfaces/model/TokenDetails;", "tokenMapper", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "", "onPayRememberMe", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "rmStateManager", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "", "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadataRepository", "<init>", "(Lcom/checkout/components/rememberme/utils/JWTDecoder;Lcom/checkout/components/rememberme/data/ConsumerRepository;Lcom/checkout/components/rememberme/data/TokeniseRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Ljava/lang/String;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lvf/y;Lcom/checkout/components/interfaces/mapper/Mapper;LXd/l;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;LXd/l;Lcom/checkout/components/rememberme/ui/manager/RMStateManager;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;)V", "component1", "()Lcom/checkout/components/rememberme/utils/JWTDecoder;", "component2", "()Lcom/checkout/components/rememberme/data/ConsumerRepository;", "component3", "()Lcom/checkout/components/rememberme/data/TokeniseRepository;", "component4", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "()Lvf/y;", "component9", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "component10", "()LXd/l;", "component11", "()Lkotlin/jvm/functions/Function1;", "component12", "()Lcom/checkout/components/interfaces/insight/LogDetails;", "component13", "component14", "()Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "component15", "()Lcom/checkout/components/interfaces/insight/Logger;", "component16", "()Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", Constants.COPY_TYPE, "(Lcom/checkout/components/rememberme/utils/JWTDecoder;Lcom/checkout/components/rememberme/data/ConsumerRepository;Lcom/checkout/components/rememberme/data/TokeniseRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Ljava/lang/String;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lvf/y;Lcom/checkout/components/interfaces/mapper/Mapper;LXd/l;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;LXd/l;Lcom/checkout/components/rememberme/ui/manager/RMStateManager;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;)Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/rememberme/utils/JWTDecoder;", "getJwtDecoder", "b", "Lcom/checkout/components/rememberme/data/ConsumerRepository;", "getConsumerRepository", "c", "Lcom/checkout/components/rememberme/data/TokeniseRepository;", "getTokeniseRepository", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "getJwtTokenRepository", "e", "Ljava/lang/String;", "getPublicKey", "f", "getWalletRepository", "g", "getWalletScreenViewStateRepository", "h", "Lvf/y;", "getDispatcher", "i", "Lcom/checkout/components/interfaces/mapper/Mapper;", "getTokenMapper", "j", "LXd/l;", "getOnPayRememberMe", "k", "Lkotlin/jvm/functions/Function1;", "getOnError", "l", "Lcom/checkout/components/interfaces/insight/LogDetails;", "getLogDetails", "m", "getOnTokenized", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "getRmStateManager", "o", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger", "p", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "getCardMetadataRepository", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitSavedCardUseCaseRequest {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JWTDecoder jwtDecoder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConsumerRepository consumerRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TokeniseRepository tokeniseRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PrimitiveStateFlowRepository jwtTokenRepository;

    /* renamed from: e, reason: from kotlin metadata */
    private final String publicKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PrimitiveStateFlowRepository walletRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PrimitiveStateFlowRepository walletScreenViewStateRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3220y dispatcher;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Mapper tokenMapper;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l onPayRememberMe;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1 onError;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final LogDetails logDetails;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l onTokenized;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RMStateManager rmStateManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final PrimitiveStateRepository cardMetadataRepository;

    public SubmitSavedCardUseCaseRequest(@NotNull JWTDecoder jwtDecoder, @NotNull ConsumerRepository consumerRepository, @NotNull TokeniseRepository tokeniseRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull String publicKey, @NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull PrimitiveStateFlowRepository<WalletScreenViewState> walletScreenViewStateRepository, @NotNull AbstractC3220y dispatcher, @NotNull Mapper<TokenDetailsResponse, TokenDetails> tokenMapper, @NotNull l onPayRememberMe, @Nullable Function1<? super CheckoutError, Unit> function1, @NotNull LogDetails logDetails, @Nullable l lVar, @NotNull RMStateManager rmStateManager, @NotNull Logger logger, @NotNull PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository) {
        Intrinsics.echo(jwtDecoder, "jwtDecoder");
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(tokeniseRepository, "tokeniseRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(walletScreenViewStateRepository, "walletScreenViewStateRepository");
        Intrinsics.echo(dispatcher, "dispatcher");
        Intrinsics.echo(tokenMapper, "tokenMapper");
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(rmStateManager, "rmStateManager");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(cardMetadataRepository, "cardMetadataRepository");
        this.jwtDecoder = jwtDecoder;
        this.consumerRepository = consumerRepository;
        this.tokeniseRepository = tokeniseRepository;
        this.jwtTokenRepository = jwtTokenRepository;
        this.publicKey = publicKey;
        this.walletRepository = walletRepository;
        this.walletScreenViewStateRepository = walletScreenViewStateRepository;
        this.dispatcher = dispatcher;
        this.tokenMapper = tokenMapper;
        this.onPayRememberMe = onPayRememberMe;
        this.onError = function1;
        this.logDetails = logDetails;
        this.onTokenized = lVar;
        this.rmStateManager = rmStateManager;
        this.logger = logger;
        this.cardMetadataRepository = cardMetadataRepository;
    }

    public static /* synthetic */ SubmitSavedCardUseCaseRequest copy$default(SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest, JWTDecoder jWTDecoder, ConsumerRepository consumerRepository, TokeniseRepository tokeniseRepository, PrimitiveStateFlowRepository primitiveStateFlowRepository, String str, PrimitiveStateFlowRepository primitiveStateFlowRepository2, PrimitiveStateFlowRepository primitiveStateFlowRepository3, AbstractC3220y abstractC3220y, Mapper mapper, l lVar, Function1 function1, LogDetails logDetails, l lVar2, RMStateManager rMStateManager, Logger logger, PrimitiveStateRepository primitiveStateRepository, int i4, Object obj) {
        JWTDecoder jWTDecoder2;
        ConsumerRepository consumerRepository2;
        TokeniseRepository tokeniseRepository2;
        PrimitiveStateFlowRepository primitiveStateFlowRepository4;
        String str2;
        PrimitiveStateFlowRepository primitiveStateFlowRepository5;
        PrimitiveStateFlowRepository primitiveStateFlowRepository6;
        AbstractC3220y abstractC3220y2;
        Mapper mapper2;
        l lVar3;
        Function1 function12;
        LogDetails logDetails2;
        l lVar4;
        RMStateManager rMStateManager2;
        Logger logger2;
        PrimitiveStateRepository primitiveStateRepository2;
        if ((i4 & 1) != 0) {
            jWTDecoder2 = submitSavedCardUseCaseRequest.jwtDecoder;
        } else {
            jWTDecoder2 = jWTDecoder;
        }
        if ((i4 & 2) != 0) {
            consumerRepository2 = submitSavedCardUseCaseRequest.consumerRepository;
        } else {
            consumerRepository2 = consumerRepository;
        }
        if ((i4 & 4) != 0) {
            tokeniseRepository2 = submitSavedCardUseCaseRequest.tokeniseRepository;
        } else {
            tokeniseRepository2 = tokeniseRepository;
        }
        if ((i4 & 8) != 0) {
            primitiveStateFlowRepository4 = submitSavedCardUseCaseRequest.jwtTokenRepository;
        } else {
            primitiveStateFlowRepository4 = primitiveStateFlowRepository;
        }
        if ((i4 & 16) != 0) {
            str2 = submitSavedCardUseCaseRequest.publicKey;
        } else {
            str2 = str;
        }
        if ((i4 & 32) != 0) {
            primitiveStateFlowRepository5 = submitSavedCardUseCaseRequest.walletRepository;
        } else {
            primitiveStateFlowRepository5 = primitiveStateFlowRepository2;
        }
        if ((i4 & 64) != 0) {
            primitiveStateFlowRepository6 = submitSavedCardUseCaseRequest.walletScreenViewStateRepository;
        } else {
            primitiveStateFlowRepository6 = primitiveStateFlowRepository3;
        }
        if ((i4 & 128) != 0) {
            abstractC3220y2 = submitSavedCardUseCaseRequest.dispatcher;
        } else {
            abstractC3220y2 = abstractC3220y;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            mapper2 = submitSavedCardUseCaseRequest.tokenMapper;
        } else {
            mapper2 = mapper;
        }
        if ((i4 & 512) != 0) {
            lVar3 = submitSavedCardUseCaseRequest.onPayRememberMe;
        } else {
            lVar3 = lVar;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            function12 = submitSavedCardUseCaseRequest.onError;
        } else {
            function12 = function1;
        }
        if ((i4 & 2048) != 0) {
            logDetails2 = submitSavedCardUseCaseRequest.logDetails;
        } else {
            logDetails2 = logDetails;
        }
        if ((i4 & 4096) != 0) {
            lVar4 = submitSavedCardUseCaseRequest.onTokenized;
        } else {
            lVar4 = lVar2;
        }
        if ((i4 & 8192) != 0) {
            rMStateManager2 = submitSavedCardUseCaseRequest.rmStateManager;
        } else {
            rMStateManager2 = rMStateManager;
        }
        JWTDecoder jWTDecoder3 = jWTDecoder2;
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            logger2 = submitSavedCardUseCaseRequest.logger;
        } else {
            logger2 = logger;
        }
        if ((i4 & 32768) != 0) {
            primitiveStateRepository2 = submitSavedCardUseCaseRequest.cardMetadataRepository;
        } else {
            primitiveStateRepository2 = primitiveStateRepository;
        }
        return submitSavedCardUseCaseRequest.copy(jWTDecoder3, consumerRepository2, tokeniseRepository2, primitiveStateFlowRepository4, str2, primitiveStateFlowRepository5, primitiveStateFlowRepository6, abstractC3220y2, mapper2, lVar3, function12, logDetails2, lVar4, rMStateManager2, logger2, primitiveStateRepository2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final JWTDecoder getJwtDecoder() {
        return this.jwtDecoder;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final l getOnPayRememberMe() {
        return this.onPayRememberMe;
    }

    @Nullable
    public final Function1<CheckoutError, Unit> component11() {
        return this.onError;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final RMStateManager getRmStateManager() {
        return this.rmStateManager;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final PrimitiveStateRepository<Map<String, CardMetadata>> component16() {
        return this.cardMetadataRepository;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ConsumerRepository getConsumerRepository() {
        return this.consumerRepository;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TokeniseRepository getTokeniseRepository() {
        return this.tokeniseRepository;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<String> component4() {
        return this.jwtTokenRepository;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<GetWalletResponse> component6() {
        return this.walletRepository;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<WalletScreenViewState> component7() {
        return this.walletScreenViewStateRepository;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AbstractC3220y getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Mapper<TokenDetailsResponse, TokenDetails> component9() {
        return this.tokenMapper;
    }

    @NotNull
    public final SubmitSavedCardUseCaseRequest copy(@NotNull JWTDecoder jwtDecoder, @NotNull ConsumerRepository consumerRepository, @NotNull TokeniseRepository tokeniseRepository, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull String publicKey, @NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull PrimitiveStateFlowRepository<WalletScreenViewState> walletScreenViewStateRepository, @NotNull AbstractC3220y dispatcher, @NotNull Mapper<TokenDetailsResponse, TokenDetails> tokenMapper, @NotNull l onPayRememberMe, @Nullable Function1<? super CheckoutError, Unit> onError, @NotNull LogDetails logDetails, @Nullable l onTokenized, @NotNull RMStateManager rmStateManager, @NotNull Logger logger, @NotNull PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository) {
        Intrinsics.echo(jwtDecoder, "jwtDecoder");
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(tokeniseRepository, "tokeniseRepository");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(walletScreenViewStateRepository, "walletScreenViewStateRepository");
        Intrinsics.echo(dispatcher, "dispatcher");
        Intrinsics.echo(tokenMapper, "tokenMapper");
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(rmStateManager, "rmStateManager");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(cardMetadataRepository, "cardMetadataRepository");
        return new SubmitSavedCardUseCaseRequest(jwtDecoder, consumerRepository, tokeniseRepository, jwtTokenRepository, publicKey, walletRepository, walletScreenViewStateRepository, dispatcher, tokenMapper, onPayRememberMe, onError, logDetails, onTokenized, rmStateManager, logger, cardMetadataRepository);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSavedCardUseCaseRequest)) {
            return false;
        }
        SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest = (SubmitSavedCardUseCaseRequest) other;
        return Intrinsics.areEqual(this.jwtDecoder, submitSavedCardUseCaseRequest.jwtDecoder) && Intrinsics.areEqual(this.consumerRepository, submitSavedCardUseCaseRequest.consumerRepository) && Intrinsics.areEqual(this.tokeniseRepository, submitSavedCardUseCaseRequest.tokeniseRepository) && Intrinsics.areEqual(this.jwtTokenRepository, submitSavedCardUseCaseRequest.jwtTokenRepository) && Intrinsics.areEqual(this.publicKey, submitSavedCardUseCaseRequest.publicKey) && Intrinsics.areEqual(this.walletRepository, submitSavedCardUseCaseRequest.walletRepository) && Intrinsics.areEqual(this.walletScreenViewStateRepository, submitSavedCardUseCaseRequest.walletScreenViewStateRepository) && Intrinsics.areEqual(this.dispatcher, submitSavedCardUseCaseRequest.dispatcher) && Intrinsics.areEqual(this.tokenMapper, submitSavedCardUseCaseRequest.tokenMapper) && Intrinsics.areEqual(this.onPayRememberMe, submitSavedCardUseCaseRequest.onPayRememberMe) && Intrinsics.areEqual(this.onError, submitSavedCardUseCaseRequest.onError) && Intrinsics.areEqual(this.logDetails, submitSavedCardUseCaseRequest.logDetails) && Intrinsics.areEqual(this.onTokenized, submitSavedCardUseCaseRequest.onTokenized) && Intrinsics.areEqual(this.rmStateManager, submitSavedCardUseCaseRequest.rmStateManager) && Intrinsics.areEqual(this.logger, submitSavedCardUseCaseRequest.logger) && Intrinsics.areEqual(this.cardMetadataRepository, submitSavedCardUseCaseRequest.cardMetadataRepository);
    }

    @NotNull
    public final PrimitiveStateRepository<Map<String, CardMetadata>> getCardMetadataRepository() {
        return this.cardMetadataRepository;
    }

    @NotNull
    public final ConsumerRepository getConsumerRepository() {
        return this.consumerRepository;
    }

    @NotNull
    public final AbstractC3220y getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final JWTDecoder getJwtDecoder() {
        return this.jwtDecoder;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<String> getJwtTokenRepository() {
        return this.jwtTokenRepository;
    }

    @NotNull
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    public final Function1<CheckoutError, Unit> getOnError() {
        return this.onError;
    }

    @NotNull
    public final l getOnPayRememberMe() {
        return this.onPayRememberMe;
    }

    @Nullable
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final RMStateManager getRmStateManager() {
        return this.rmStateManager;
    }

    @NotNull
    public final Mapper<TokenDetailsResponse, TokenDetails> getTokenMapper() {
        return this.tokenMapper;
    }

    @NotNull
    public final TokeniseRepository getTokeniseRepository() {
        return this.tokeniseRepository;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<GetWalletResponse> getWalletRepository() {
        return this.walletRepository;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<WalletScreenViewState> getWalletScreenViewStateRepository() {
        return this.walletScreenViewStateRepository;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.onPayRememberMe.hashCode() + ((this.tokenMapper.hashCode() + ((this.dispatcher.hashCode() + ((this.walletScreenViewStateRepository.hashCode() + ((this.walletRepository.hashCode() + AbstractC2327c.sierra((this.jwtTokenRepository.hashCode() + ((this.tokeniseRepository.hashCode() + ((this.consumerRepository.hashCode() + (this.jwtDecoder.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.publicKey)) * 31)) * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.onError;
        int i4 = 0;
        if (function1 == null) {
            hashCode = 0;
        } else {
            hashCode = function1.hashCode();
        }
        int hashCode3 = (this.logDetails.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        l lVar = this.onTokenized;
        if (lVar != null) {
            i4 = lVar.hashCode();
        }
        return this.cardMetadataRepository.hashCode() + ((this.logger.hashCode() + ((this.rmStateManager.hashCode() + ((hashCode3 + i4) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "SubmitSavedCardUseCaseRequest(jwtDecoder=" + this.jwtDecoder + ", consumerRepository=" + this.consumerRepository + ", tokeniseRepository=" + this.tokeniseRepository + ", jwtTokenRepository=" + this.jwtTokenRepository + ", publicKey=" + this.publicKey + ", walletRepository=" + this.walletRepository + ", walletScreenViewStateRepository=" + this.walletScreenViewStateRepository + ", dispatcher=" + this.dispatcher + ", tokenMapper=" + this.tokenMapper + ", onPayRememberMe=" + this.onPayRememberMe + ", onError=" + this.onError + ", logDetails=" + this.logDetails + ", onTokenized=" + this.onTokenized + ", rmStateManager=" + this.rmStateManager + ", logger=" + this.logger + ", cardMetadataRepository=" + this.cardMetadataRepository + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SubmitSavedCardUseCaseRequest(JWTDecoder jWTDecoder, ConsumerRepository consumerRepository, TokeniseRepository tokeniseRepository, PrimitiveStateFlowRepository primitiveStateFlowRepository, String str, PrimitiveStateFlowRepository primitiveStateFlowRepository2, PrimitiveStateFlowRepository primitiveStateFlowRepository3, AbstractC3220y abstractC3220y, Mapper mapper, l lVar, Function1 function1, LogDetails logDetails, l lVar2, RMStateManager rMStateManager, Logger logger, PrimitiveStateRepository primitiveStateRepository, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(jWTDecoder, consumerRepository, tokeniseRepository, primitiveStateFlowRepository, str, primitiveStateFlowRepository2, primitiveStateFlowRepository3, r9, mapper, lVar, function1, logDetails, lVar2, rMStateManager, logger, primitiveStateRepository);
        AbstractC3220y abstractC3220y2;
        if ((i4 & 128) != 0) {
            e eVar = ao.alpha;
            abstractC3220y2 = d.purple;
        } else {
            abstractC3220y2 = abstractC3220y;
        }
    }
}
