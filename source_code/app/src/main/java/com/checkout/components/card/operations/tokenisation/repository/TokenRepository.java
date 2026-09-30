package com.checkout.components.card.operations.tokenisation.repository;

import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "", "sendCardTokenRequest", "", "request", "Lcom/checkout/components/card/operations/tokenisation/network/model/CardTokenRequest;", "sendCardTokenOnly", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TokenRepository {
    void sendCardTokenOnly(@NotNull CardTokenRequest request);

    void sendCardTokenRequest(@NotNull CardTokenRequest request);
}
