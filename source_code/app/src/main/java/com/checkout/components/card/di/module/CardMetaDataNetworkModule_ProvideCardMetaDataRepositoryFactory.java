package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final CardMetaDataNetworkModule f4110a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4111b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4112c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4113d;

    public CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory(CardMetaDataNetworkModule cardMetaDataNetworkModule, d dVar, d dVar2, d dVar3) {
        this.f4110a = cardMetaDataNetworkModule;
        this.f4111b = dVar;
        this.f4112c = dVar2;
        this.f4113d = dVar3;
    }

    public static CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory create(CardMetaDataNetworkModule cardMetaDataNetworkModule, d dVar, d dVar2, d dVar3) {
        return new CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory(cardMetaDataNetworkModule, dVar, dVar2, dVar3);
    }

    public static CardMetaDataRepository provideCardMetaDataRepository(CardMetaDataNetworkModule cardMetaDataNetworkModule, NetworkApiClientImpl networkApiClientImpl, Mapper<CardMetaDataResponse, CardMetadata> mapper, Logger logger) {
        CardMetaDataRepository provideCardMetaDataRepository = cardMetaDataNetworkModule.provideCardMetaDataRepository(networkApiClientImpl, mapper, logger);
        AbstractC2763s0.delta(provideCardMetaDataRepository);
        return provideCardMetaDataRepository;
    }

    @Override // Kd.a
    public final CardMetaDataRepository get() {
        CardMetaDataRepository provideCardMetaDataRepository = this.f4110a.provideCardMetaDataRepository((NetworkApiClientImpl) this.f4111b.get(), (Mapper) this.f4112c.get(), (Logger) this.f4113d.get());
        AbstractC2763s0.delta(provideCardMetaDataRepository);
        return provideCardMetaDataRepository;
    }
}
