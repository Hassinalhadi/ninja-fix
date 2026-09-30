package com.checkout.components.card.operations.network.repository;

import Cf.d;
import Cf.e;
import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.C0903s;
import com.checkout.components.card.C0904t;
import com.checkout.components.card.operations.model.LoggingEventIdentifiers;
import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.network.error.ErrorMessages;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.card.operations.network.model.ErrorResponse;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.ui.utils.constants.ErrorConstants;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepositoryImpl;", "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;", "networkApiClient", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadataMapper", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "<init>", "(Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/insight/Logger;)V", "Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;", "request", "Lkotlin/Result;", "sendCardMetaDataRequest-gIAlu-s", "(Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;LNd/c;)Ljava/lang/Object;", "sendCardMetaDataRequest", "", "isLastErrorRetryable", "()Z", "Lcom/checkout/components/card/operations/model/LoggingEventIdentifiers;", "eventIdentifier", "", "errorMessage", "", "exception", "errorDetails", "", "logCardMetadataWarning$card_standardRelease", "(Lcom/checkout/components/card/operations/model/LoggingEventIdentifiers;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "logCardMetadataWarning", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMetaDataRepositoryImpl implements CardMetaDataRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkApiClientImpl f4314a;

    /* renamed from: b, reason: collision with root package name */
    private final Mapper f4315b;

    /* renamed from: c, reason: collision with root package name */
    private final Logger f4316c;

    /* renamed from: d, reason: collision with root package name */
    private NetworkApiResponse.Error f4317d;

    public CardMetaDataRepositoryImpl(@NotNull NetworkApiClientImpl networkApiClient, @NotNull Mapper<CardMetaDataResponse, CardMetadata> cardMetadataMapper, @NotNull Logger logger) {
        Intrinsics.echo(networkApiClient, "networkApiClient");
        Intrinsics.echo(cardMetadataMapper, "cardMetadataMapper");
        Intrinsics.echo(logger, "logger");
        this.f4314a = networkApiClient;
        this.f4315b = cardMetadataMapper;
        this.f4316c = logger;
    }

    public static final Throwable access$mapNetworkError(CardMetaDataRepositoryImpl cardMetaDataRepositoryImpl, NetworkApiResponse.Error error) {
        String str;
        cardMetaDataRepositoryImpl.getClass();
        if (error instanceof NetworkApiResponse.Error.ServerError) {
            NetworkApiResponse.Error.ServerError serverError = (NetworkApiResponse.Error.ServerError) error;
            ErrorResponse body = serverError.getBody();
            List<String> list = null;
            if (body != null) {
                str = body.getErrorType();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            ErrorResponse body2 = serverError.getBody();
            if (body2 != null) {
                list = body2.getErrorCodes();
            }
            return new IOException(valueOf, new Throwable(String.valueOf(list)));
        }
        if (error instanceof NetworkApiResponse.Error.NetworkError) {
            NetworkApiResponse.Error.NetworkError networkError = (NetworkApiResponse.Error.NetworkError) error;
            logCardMetadataWarning$card_standardRelease$default(cardMetaDataRepositoryImpl, LoggingEventIdentifiers.CARD_METADATA_RESPONSE_ERROR, ErrorMessages.CARD_METADATA_ERROR_MESSAGE, networkError.getThrowable(), null, 8, null);
            return networkError.getThrowable();
        }
        if (error instanceof NetworkApiResponse.Error.InternalError) {
            Throwable throwable = ((NetworkApiResponse.Error.InternalError) error).getThrowable();
            if (throwable == null) {
                throwable = new IllegalStateException(ErrorMessages.CARD_METADATA_ERROR_MESSAGE);
            }
            Throwable th = throwable;
            logCardMetadataWarning$card_standardRelease$default(cardMetaDataRepositoryImpl, LoggingEventIdentifiers.CARD_METADATA_RESPONSE_ERROR, ErrorMessages.CARD_METADATA_ERROR_MESSAGE, th, null, 8, null);
            return th;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void logCardMetadataWarning$card_standardRelease$default(CardMetaDataRepositoryImpl cardMetaDataRepositoryImpl, LoggingEventIdentifiers loggingEventIdentifiers, String str, Throwable th, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        cardMetaDataRepositoryImpl.logCardMetadataWarning$card_standardRelease(loggingEventIdentifiers, str, th, str2);
    }

    @Override // com.checkout.components.card.operations.network.repository.CardMetaDataRepository
    public final boolean isLastErrorRetryable() {
        NetworkApiResponse.Error error = this.f4317d;
        if (error == null) {
            return false;
        }
        if (error instanceof NetworkApiResponse.Error.ServerError) {
            int code = ((NetworkApiResponse.Error.ServerError) error).getCode();
            if (code == 408 || code == 413 || code == 429 || code == 500) {
                return true;
            }
            if (502 > code || code >= 600) {
                return false;
            }
            return true;
        }
        if (error instanceof NetworkApiResponse.Error.NetworkError) {
            return true;
        }
        if (error instanceof NetworkApiResponse.Error.InternalError) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void logCardMetadataWarning$card_standardRelease(@NotNull LoggingEventIdentifiers eventIdentifier, @NotNull String errorMessage, @Nullable Throwable exception, @Nullable String errorDetails) {
        Intrinsics.echo(eventIdentifier, "eventIdentifier");
        Intrinsics.echo(errorMessage, "errorMessage");
        Logger logger = this.f4316c;
        String name = eventIdentifier.name();
        if (exception != null) {
            errorDetails = AbstractC2689j6.echo(exception);
        }
        logger.logWarning(ErrorConstants.INTERNAL_ERROR_TO_LOG, name, errorMessage, errorDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.card.operations.network.repository.CardMetaDataRepository
    @Nullable
    /* renamed from: sendCardMetaDataRequest-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo76sendCardMetaDataRequestgIAlus(@NotNull CardMetaDataRequest cardMetaDataRequest, @NotNull c<? super Result<CardMetadata>> cVar) {
        C0903s c0903s;
        int i4;
        if (cVar instanceof C0903s) {
            c0903s = (C0903s) cVar;
            int i5 = c0903s.f4394d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0903s.f4394d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0903s.f4392b;
                a aVar = a.alpha;
                i4 = c0903s.f4394d;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    e eVar = ao.alpha;
                    d dVar = d.purple;
                    C0904t c0904t = new C0904t(this, cardMetaDataRequest, null);
                    c0903s.f4391a = null;
                    c0903s.f4394d = 1;
                    obj = ad.blue(dVar, c0904t, c0903s);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ((Result) obj).alpha;
            }
        }
        c0903s = new C0903s(this, cVar);
        Object obj2 = c0903s.f4392b;
        a aVar2 = a.alpha;
        i4 = c0903s.f4394d;
        if (i4 == 0) {
        }
        return ((Result) obj2).alpha;
    }
}
