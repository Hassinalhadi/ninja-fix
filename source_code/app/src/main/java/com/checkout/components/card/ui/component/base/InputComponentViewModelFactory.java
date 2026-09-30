package com.checkout.components.card.ui.component.base;

import Kd.a;
import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.di.ExpiryDateStyle;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.component.InputComponentViewModelSubComponent;
import com.checkout.components.card.di.component.n;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewModel;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001b\u0010\u0010\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001f\u0010\u0010\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/checkout/components/card/ui/component/base/InputComponentViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/card/di/base/InjectionClient;", "Lcom/checkout/components/card/di/base/Injector;", "injector", "<init>", "(Lcom/checkout/components/card/di/base/Injector;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LKd/a;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "cardNumberViewModelProvider", "LKd/a;", "getCardNumberViewModelProvider", "()LKd/a;", "setCardNumberViewModelProvider", "(LKd/a;)V", "getCardNumberViewModelProvider$annotations", "()V", "cvvViewModelProvider", "getCvvViewModelProvider", "setCvvViewModelProvider", "getCvvViewModelProvider$annotations", "expiryDateViewModelProvider", "getExpiryDateViewModelProvider", "setExpiryDateViewModelProvider", "getExpiryDateViewModelProvider$annotations", "cardHolderNameViewModelProvider", "getCardHolderNameViewModelProvider", "setCardHolderNameViewModelProvider", "getCardHolderNameViewModelProvider$annotations", "Lcom/checkout/components/card/di/component/InputComponentViewModelSubComponent$Builder;", "subComponentProvider", "getSubComponentProvider", "setSubComponentProvider", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputComponentViewModelFactory implements a0, InjectionClient {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Injector f4428a;
    public a cardHolderNameViewModelProvider;
    public a cardNumberViewModelProvider;
    public a cvvViewModelProvider;
    public a expiryDateViewModelProvider;
    public a subComponentProvider;

    public InputComponentViewModelFactory(@NotNull Injector injector) {
        Intrinsics.echo(injector, "injector");
        this.f4428a = injector;
    }

    @CardHolderNameStyle
    public static /* synthetic */ void getCardHolderNameViewModelProvider$annotations() {
    }

    @CardNumberStyle
    public static /* synthetic */ void getCardNumberViewModelProvider$annotations() {
    }

    @CVVStyle
    public static /* synthetic */ void getCvvViewModelProvider$annotations() {
    }

    @ExpiryDateStyle
    public static /* synthetic */ void getExpiryDateViewModelProvider$annotations() {
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
    }

    @NotNull
    public final a getCardHolderNameViewModelProvider() {
        a aVar = this.cardHolderNameViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.lima("cardHolderNameViewModelProvider");
        throw null;
    }

    @NotNull
    public final a getCardNumberViewModelProvider() {
        a aVar = this.cardNumberViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.lima("cardNumberViewModelProvider");
        throw null;
    }

    @NotNull
    public final a getCvvViewModelProvider() {
        a aVar = this.cvvViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.lima("cvvViewModelProvider");
        throw null;
    }

    @NotNull
    public final a getExpiryDateViewModelProvider() {
        a aVar = this.expiryDateViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.lima("expiryDateViewModelProvider");
        throw null;
    }

    @NotNull
    public final a getSubComponentProvider() {
        a aVar = this.subComponentProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.lima("subComponentProvider");
        throw null;
    }

    public final void setCardHolderNameViewModelProvider(@NotNull a aVar) {
        Intrinsics.echo(aVar, "<set-?>");
        this.cardHolderNameViewModelProvider = aVar;
    }

    public final void setCardNumberViewModelProvider(@NotNull a aVar) {
        Intrinsics.echo(aVar, "<set-?>");
        this.cardNumberViewModelProvider = aVar;
    }

    public final void setCvvViewModelProvider(@NotNull a aVar) {
        Intrinsics.echo(aVar, "<set-?>");
        this.cvvViewModelProvider = aVar;
    }

    public final void setExpiryDateViewModelProvider(@NotNull a aVar) {
        Intrinsics.echo(aVar, "<set-?>");
        this.expiryDateViewModelProvider = aVar;
    }

    public final void setSubComponentProvider(@NotNull a aVar) {
        Intrinsics.echo(aVar, "<set-?>");
        this.subComponentProvider = aVar;
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull Class cls, @NotNull c cVar) {
        return P0.charlie(this, cls, cVar);
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public final <T extends Y> T create(@NotNull Class<T> modelClass) {
        InputComponentViewModel cardHolderNameViewModel;
        Intrinsics.echo(modelClass, "modelClass");
        this.f4428a.inject(this);
        InputComponentViewModelSubComponent build = ((InputComponentViewModelSubComponent.Builder) getSubComponentProvider().get()).build();
        if (Intrinsics.areEqual(modelClass, CardNumberViewModel.class)) {
            cardHolderNameViewModel = ((n) build).getCardNumberViewModel();
        } else if (Intrinsics.areEqual(modelClass, CVVViewModel.class)) {
            cardHolderNameViewModel = ((n) build).getCvvViewModel();
        } else if (Intrinsics.areEqual(modelClass, ExpiryDateViewModel.class)) {
            cardHolderNameViewModel = ((n) build).getExpiryDateViewModel();
        } else {
            if (!Intrinsics.areEqual(modelClass, CardHolderNameViewModel.class)) {
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
            cardHolderNameViewModel = ((n) build).getCardHolderNameViewModel();
        }
        Intrinsics.charlie(cardHolderNameViewModel, "null cannot be cast to non-null type T of com.checkout.components.card.ui.component.base.InputComponentViewModelFactory.create");
        return cardHolderNameViewModel;
    }
}
