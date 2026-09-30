package com.checkout.components.card.ui.component.cvv;

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
public final class CVVViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4487a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4488b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4489c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4490d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4491f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4492g;

    public CVVViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7) {
        this.f4487a = dVar;
        this.f4488b = dVar2;
        this.f4489c = dVar3;
        this.f4490d = dVar4;
        this.e = dVar5;
        this.f4491f = dVar6;
        this.f4492g = dVar7;
    }

    public static CVVViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7) {
        return new CVVViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7);
    }

    public static CVVViewModel newInstance(Mapper<InputComponentStyle, InputComponentViewStyle> mapper, Mapper<InputComponentStyle, InputComponentState> mapper2, CardValidator cardValidator, PaymentStateManager paymentStateManager, InputComponentStyle inputComponentStyle, ResourceProvider resourceProvider, Function0<Unit> function0) {
        return new CVVViewModel(mapper, mapper2, cardValidator, paymentStateManager, inputComponentStyle, resourceProvider, function0);
    }

    @Override // Kd.a
    public final CVVViewModel get() {
        return new CVVViewModel((Mapper) this.f4487a.get(), (Mapper) this.f4488b.get(), (CardValidator) this.f4489c.get(), (PaymentStateManager) this.f4490d.get(), (InputComponentStyle) this.e.get(), (ResourceProvider) this.f4491f.get(), (Function0) this.f4492g.get());
    }
}
