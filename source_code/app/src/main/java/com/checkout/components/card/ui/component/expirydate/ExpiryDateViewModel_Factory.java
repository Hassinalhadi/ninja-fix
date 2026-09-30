package com.checkout.components.card.ui.component.expirydate;

import com.checkout.components.card.operations.api.CardValidator;
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
public final class ExpiryDateViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4509a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4510b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4511c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4512d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4513f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4514g;

    public ExpiryDateViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7) {
        this.f4509a = dVar;
        this.f4510b = dVar2;
        this.f4511c = dVar3;
        this.f4512d = dVar4;
        this.e = dVar5;
        this.f4513f = dVar6;
        this.f4514g = dVar7;
    }

    public static ExpiryDateViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7) {
        return new ExpiryDateViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7);
    }

    public static ExpiryDateViewModel newInstance(Mapper<InputComponentStyle, InputComponentViewStyle> mapper, Mapper<InputComponentStyle, InputComponentState> mapper2, CardValidator cardValidator, PaymentStateManager paymentStateManager, InputComponentStyle inputComponentStyle, ResourceProvider resourceProvider, Function0<Unit> function0) {
        return new ExpiryDateViewModel(mapper, mapper2, cardValidator, paymentStateManager, inputComponentStyle, resourceProvider, function0);
    }

    @Override // Kd.a
    public final ExpiryDateViewModel get() {
        return new ExpiryDateViewModel((Mapper) this.f4509a.get(), (Mapper) this.f4510b.get(), (CardValidator) this.f4511c.get(), (PaymentStateManager) this.f4512d.get(), (InputComponentStyle) this.e.get(), (ResourceProvider) this.f4513f.get(), (Function0) this.f4514g.get());
    }
}
