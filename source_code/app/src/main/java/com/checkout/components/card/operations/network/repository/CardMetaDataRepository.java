package com.checkout.components.card.operations.network.repository;

import Nd.c;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.interfaces.model.CardMetadata;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "", "Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;", "request", "Lkotlin/Result;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "sendCardMetaDataRequest-gIAlu-s", "(Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;LNd/c;)Ljava/lang/Object;", "sendCardMetaDataRequest", "", "isLastErrorRetryable", "()Z", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CardMetaDataRepository {
    boolean isLastErrorRetryable();

    @Nullable
    /* renamed from: sendCardMetaDataRequest-gIAlu-s, reason: not valid java name */
    Object mo76sendCardMetaDataRequestgIAlus(@NotNull CardMetaDataRequest cardMetaDataRequest, @NotNull c<? super Result<CardMetadata>> cVar);
}
