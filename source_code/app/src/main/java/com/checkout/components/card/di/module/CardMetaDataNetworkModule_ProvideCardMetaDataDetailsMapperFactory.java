package com.checkout.components.card.di.module;

import com.checkout.components.card.mapper.CardMetaDataDetailsMapper;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final CardMetaDataNetworkModule f4109a;

    public CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory(CardMetaDataNetworkModule cardMetaDataNetworkModule) {
        this.f4109a = cardMetaDataNetworkModule;
    }

    public static CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory create(CardMetaDataNetworkModule cardMetaDataNetworkModule) {
        return new CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory(cardMetaDataNetworkModule);
    }

    public static Mapper<CardMetaDataResponse, CardMetadata> provideCardMetaDataDetailsMapper(CardMetaDataNetworkModule cardMetaDataNetworkModule) {
        cardMetaDataNetworkModule.getClass();
        return new CardMetaDataDetailsMapper();
    }

    @Override // Kd.a
    public final Mapper<CardMetaDataResponse, CardMetadata> get() {
        return provideCardMetaDataDetailsMapper(this.f4109a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideCardMetaDataDetailsMapper(this.f4109a);
    }
}
