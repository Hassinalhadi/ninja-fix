package com.checkout.components.card.ui.component.paybutton;

import Nd.c;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class PayButtonViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4532a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4533b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4534c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4535d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4536f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4537g;

    /* renamed from: h, reason: collision with root package name */
    private final d f4538h;

    /* renamed from: i, reason: collision with root package name */
    private final d f4539i;

    /* renamed from: j, reason: collision with root package name */
    private final d f4540j;

    /* renamed from: k, reason: collision with root package name */
    private final d f4541k;

    public PayButtonViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11) {
        this.f4532a = dVar;
        this.f4533b = dVar2;
        this.f4534c = dVar3;
        this.f4535d = dVar4;
        this.e = dVar5;
        this.f4536f = dVar6;
        this.f4537g = dVar7;
        this.f4538h = dVar8;
        this.f4539i = dVar9;
        this.f4540j = dVar10;
        this.f4541k = dVar11;
    }

    public static PayButtonViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11) {
        return new PayButtonViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11);
    }

    public static PayButtonViewModel newInstance(ButtonStyle buttonStyle, Mapper<ButtonStyle, InternalButtonViewStyle> mapper, Mapper<ButtonStyle, InternalButtonState> mapper2, PaymentStateManager paymentStateManager, TokenRepository tokenRepository, ResourceProvider resourceProvider, PaymentButtonAction paymentButtonAction, Function0<Unit> function0, Function1<? super c<? super Boolean>, ?> function1, Function1<? super CheckoutError, Unit> function12, LogDetails logDetails) {
        return new PayButtonViewModel(buttonStyle, mapper, mapper2, paymentStateManager, tokenRepository, resourceProvider, paymentButtonAction, function0, function1, function12, logDetails);
    }

    @Override // Kd.a
    public final PayButtonViewModel get() {
        return new PayButtonViewModel((ButtonStyle) this.f4532a.get(), (Mapper) this.f4533b.get(), (Mapper) this.f4534c.get(), (PaymentStateManager) this.f4535d.get(), (TokenRepository) this.e.get(), (ResourceProvider) this.f4536f.get(), (PaymentButtonAction) this.f4537g.get(), (Function0) this.f4538h.get(), (Function1) this.f4539i.get(), (Function1) this.f4540j.get(), (LogDetails) this.f4541k.get());
    }
}
