package com.checkout.components.card.ui.component.base;

import Kd.a;
import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.di.ExpiryDateStyle;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class InputComponentViewModelFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4429a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4430b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4431c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4432d;
    private final d e;

    public InputComponentViewModelFactory_MembersInjector(d dVar, d dVar2, d dVar3, d dVar4, d dVar5) {
        this.f4429a = dVar;
        this.f4430b = dVar2;
        this.f4431c = dVar3;
        this.f4432d = dVar4;
        this.e = dVar5;
    }

    public static InterfaceC3179a create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5) {
        return new InputComponentViewModelFactory_MembersInjector(dVar, dVar2, dVar3, dVar4, dVar5);
    }

    @CardHolderNameStyle
    public static void injectCardHolderNameViewModelProvider(InputComponentViewModelFactory inputComponentViewModelFactory, a aVar) {
        inputComponentViewModelFactory.cardHolderNameViewModelProvider = aVar;
    }

    @CardNumberStyle
    public static void injectCardNumberViewModelProvider(InputComponentViewModelFactory inputComponentViewModelFactory, a aVar) {
        inputComponentViewModelFactory.cardNumberViewModelProvider = aVar;
    }

    @CVVStyle
    public static void injectCvvViewModelProvider(InputComponentViewModelFactory inputComponentViewModelFactory, a aVar) {
        inputComponentViewModelFactory.cvvViewModelProvider = aVar;
    }

    @ExpiryDateStyle
    public static void injectExpiryDateViewModelProvider(InputComponentViewModelFactory inputComponentViewModelFactory, a aVar) {
        inputComponentViewModelFactory.expiryDateViewModelProvider = aVar;
    }

    public static void injectSubComponentProvider(InputComponentViewModelFactory inputComponentViewModelFactory, a aVar) {
        inputComponentViewModelFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(InputComponentViewModelFactory inputComponentViewModelFactory) {
        inputComponentViewModelFactory.cardNumberViewModelProvider = this.f4429a;
        inputComponentViewModelFactory.cvvViewModelProvider = this.f4430b;
        inputComponentViewModelFactory.expiryDateViewModelProvider = this.f4431c;
        inputComponentViewModelFactory.cardHolderNameViewModelProvider = this.f4432d;
        inputComponentViewModelFactory.subComponentProvider = this.e;
    }
}
