package com.checkout.components.card.operations.network;

import Nd.c;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import kotlin.Metadata;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/operations/network/NetworkApiClient;", "", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "request", "Lokhttp3/Headers;", "headers", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "sendCardTokenRequest", "(Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;Lokhttp3/Headers;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "sendCardMetaDataRequest", "(Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;LNd/c;)Ljava/lang/Object;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NetworkApiClient {
    @Nullable
    Object sendCardMetaDataRequest(@NotNull CardMetaDataRequest cardMetaDataRequest, @NotNull c<? super NetworkApiResponse<CardMetaDataResponse>> cVar);

    @Nullable
    Object sendCardTokenRequest(@NotNull TokenRequest tokenRequest, @Nullable Headers headers, @NotNull c<? super NetworkApiResponse<TokenDetailsResponse>> cVar);
}
