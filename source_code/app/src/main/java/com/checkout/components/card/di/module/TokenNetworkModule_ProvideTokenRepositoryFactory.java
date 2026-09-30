package com.checkout.components.card.di.module;

import Xd.l;
import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class TokenNetworkModule_ProvideTokenRepositoryFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final TokenNetworkModule f4172a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4173b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4174c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4175d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4176f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4177g;

    /* renamed from: h, reason: collision with root package name */
    private final d f4178h;

    /* renamed from: i, reason: collision with root package name */
    private final d f4179i;

    /* renamed from: j, reason: collision with root package name */
    private final d f4180j;

    public TokenNetworkModule_ProvideTokenRepositoryFactory(TokenNetworkModule tokenNetworkModule, d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9) {
        this.f4172a = tokenNetworkModule;
        this.f4173b = dVar;
        this.f4174c = dVar2;
        this.f4175d = dVar3;
        this.e = dVar4;
        this.f4176f = dVar5;
        this.f4177g = dVar6;
        this.f4178h = dVar7;
        this.f4179i = dVar8;
        this.f4180j = dVar9;
    }

    public static TokenNetworkModule_ProvideTokenRepositoryFactory create(TokenNetworkModule tokenNetworkModule, d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9) {
        return new TokenNetworkModule_ProvideTokenRepositoryFactory(tokenNetworkModule, dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9);
    }

    public static TokenRepository provideTokenRepository(TokenNetworkModule tokenNetworkModule, LogDetails logDetails, NetworkApiClientImpl networkApiClientImpl, NetworkApiClientImpl networkApiClientImpl2, Logger logger, l lVar, Function1<? super CheckoutError, Unit> function1, l lVar2, Mapper<TokenDetailsResponse, TokenDetails> mapper, PaymentStateManager paymentStateManager) {
        TokenRepository provideTokenRepository = tokenNetworkModule.provideTokenRepository(logDetails, networkApiClientImpl, networkApiClientImpl2, logger, lVar, function1, lVar2, mapper, paymentStateManager);
        AbstractC2763s0.delta(provideTokenRepository);
        return provideTokenRepository;
    }

    @Override // Kd.a
    public final TokenRepository get() {
        TokenRepository provideTokenRepository = this.f4172a.provideTokenRepository((LogDetails) this.f4173b.get(), (NetworkApiClientImpl) this.f4174c.get(), (NetworkApiClientImpl) this.f4175d.get(), (Logger) this.e.get(), (l) this.f4176f.get(), (Function1) this.f4177g.get(), (l) this.f4178h.get(), (Mapper) this.f4179i.get(), (PaymentStateManager) this.f4180j.get());
        AbstractC2763s0.delta(provideTokenRepository);
        return provideTokenRepository;
    }
}
