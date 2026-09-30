package com.checkout.components.card;

import com.checkout.components.card.operations.model.LoggingEventIdentifiers;
import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.network.error.ErrorMessages;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepositoryImpl;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0904t extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardMetaDataRepositoryImpl f4396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardMetaDataRequest f4397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904t(CardMetaDataRepositoryImpl cardMetaDataRepositoryImpl, CardMetaDataRequest cardMetaDataRequest, Nd.c cVar) {
        super(2, cVar);
        this.f4396b = cardMetaDataRepositoryImpl;
        this.f4397c = cardMetaDataRequest;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0904t(this.f4396b, this.f4397c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0904t(this.f4396b, this.f4397c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        NetworkApiClientImpl networkApiClientImpl;
        Mapper mapper;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4395a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                networkApiClientImpl = this.f4396b.f4314a;
                CardMetaDataRequest cardMetaDataRequest = this.f4397c;
                this.f4395a = 1;
                obj = networkApiClientImpl.sendCardMetaDataRequest(cardMetaDataRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkApiResponse networkApiResponse = (NetworkApiResponse) obj;
            if (networkApiResponse instanceof NetworkApiResponse.Success) {
                mapper = this.f4396b.f4315b;
                CardMetadata cardMetadata = (CardMetadata) mapper.map(((NetworkApiResponse.Success) networkApiResponse).getBody());
                this.f4396b.f4317d = null;
                m206constructorimpl = Result.m206constructorimpl(cardMetadata);
            } else if (networkApiResponse instanceof NetworkApiResponse.Error) {
                this.f4396b.f4317d = (NetworkApiResponse.Error) networkApiResponse;
                Throwable access$mapNetworkError = CardMetaDataRepositoryImpl.access$mapNetworkError(this.f4396b, (NetworkApiResponse.Error) networkApiResponse);
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(access$mapNetworkError));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            CardMetaDataRepositoryImpl.logCardMetadataWarning$card_standardRelease$default(this.f4396b, LoggingEventIdentifiers.CARD_METADATA_RESPONSE_ERROR, ErrorMessages.CARD_METADATA_ERROR_MESSAGE, e, null, 8, null);
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(e));
        }
        return new Result(m206constructorimpl);
    }
}
