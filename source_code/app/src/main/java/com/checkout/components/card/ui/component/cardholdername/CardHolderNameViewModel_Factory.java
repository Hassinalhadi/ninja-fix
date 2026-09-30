package com.checkout.components.card.ui.component.cardholdername;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class CardHolderNameViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4436a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4437b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4438c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4439d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4440f;

    public CardHolderNameViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        this.f4436a = dVar;
        this.f4437b = dVar2;
        this.f4438c = dVar3;
        this.f4439d = dVar4;
        this.e = dVar5;
        this.f4440f = dVar6;
    }

    public static CardHolderNameViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        return new CardHolderNameViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6);
    }

    public static CardHolderNameViewModel newInstance(Mapper<InputComponentStyle, InputComponentViewStyle> mapper, Mapper<InputComponentStyle, InputComponentState> mapper2, PaymentStateManager paymentStateManager, InputComponentStyle inputComponentStyle, ResourceProvider resourceProvider, Function0<Unit> function0) {
        return new CardHolderNameViewModel(mapper, mapper2, paymentStateManager, inputComponentStyle, resourceProvider, function0);
    }

    @Override // Kd.a
    public final CardHolderNameViewModel get() {
        return new CardHolderNameViewModel((Mapper) this.f4436a.get(), (Mapper) this.f4437b.get(), (PaymentStateManager) this.f4438c.get(), (InputComponentStyle) this.f4439d.get(), (ResourceProvider) this.e.get(), (Function0) this.f4440f.get());
    }
}
