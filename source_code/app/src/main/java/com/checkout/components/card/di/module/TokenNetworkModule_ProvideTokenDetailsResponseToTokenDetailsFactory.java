package com.checkout.components.card.di.module;

import com.checkout.components.card.mapper.TokenDetailsResponseToTokenDetails;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final TokenNetworkModule f4171a;

    public TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory(TokenNetworkModule tokenNetworkModule) {
        this.f4171a = tokenNetworkModule;
    }

    public static TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory create(TokenNetworkModule tokenNetworkModule) {
        return new TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory(tokenNetworkModule);
    }

    public static Mapper<TokenDetailsResponse, TokenDetails> provideTokenDetailsResponseToTokenDetails(TokenNetworkModule tokenNetworkModule) {
        tokenNetworkModule.getClass();
        return new TokenDetailsResponseToTokenDetails();
    }

    @Override // Kd.a
    public final Mapper<TokenDetailsResponse, TokenDetails> get() {
        return provideTokenDetailsResponseToTokenDetails(this.f4171a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideTokenDetailsResponseToTokenDetails(this.f4171a);
    }
}
