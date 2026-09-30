package com.checkout.components.card.di.module;

import com.checkout.components.card.mapper.CardMetaDataDetailsMapper;
import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepositoryImpl;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007J.\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/card/di/module/CardMetaDataNetworkModule;", "", "<init>", "()V", "provideCardMetaDataDetailsMapper", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "provideCardMetaDataRepository", "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "apiClientImpl", "Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;", "cardMetadataMapper", "logger", "Lcom/checkout/components/interfaces/insight/Logger;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMetaDataNetworkModule {
    public static final int $stable = 0;

    @NotNull
    public final Mapper<CardMetaDataResponse, CardMetadata> provideCardMetaDataDetailsMapper() {
        return new CardMetaDataDetailsMapper();
    }

    @NotNull
    public final CardMetaDataRepository provideCardMetaDataRepository(@NotNull NetworkApiClientImpl apiClientImpl, @NotNull Mapper<CardMetaDataResponse, CardMetadata> cardMetadataMapper, @NotNull Logger logger) {
        Intrinsics.echo(apiClientImpl, "apiClientImpl");
        Intrinsics.echo(cardMetadataMapper, "cardMetadataMapper");
        Intrinsics.echo(logger, "logger");
        return new CardMetaDataRepositoryImpl(apiClientImpl, cardMetadataMapper, logger);
    }
}
