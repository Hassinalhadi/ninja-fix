package com.checkout.components.card.ui.component.errorlabel;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class ErrorLabelViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4500a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4501b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4502c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4503d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4504f;

    public ErrorLabelViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        this.f4500a = dVar;
        this.f4501b = dVar2;
        this.f4502c = dVar3;
        this.f4503d = dVar4;
        this.e = dVar5;
        this.f4504f = dVar6;
    }

    public static ErrorLabelViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        return new ErrorLabelViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6);
    }

    public static ErrorLabelViewModel newInstance(TextLabelStyle textLabelStyle, Mapper<TextLabelStyle, TextLabelViewStyle> mapper, Mapper<TextLabelStyle, TextLabelState> mapper2, PaymentStateManager paymentStateManager, ResourceProvider resourceProvider, CheckoutRememberMe checkoutRememberMe) {
        return new ErrorLabelViewModel(textLabelStyle, mapper, mapper2, paymentStateManager, resourceProvider, checkoutRememberMe);
    }

    @Override // Kd.a
    public final ErrorLabelViewModel get() {
        return new ErrorLabelViewModel((TextLabelStyle) this.f4500a.get(), (Mapper) this.f4501b.get(), (Mapper) this.f4502c.get(), (PaymentStateManager) this.f4503d.get(), (ResourceProvider) this.e.get(), (CheckoutRememberMe) this.f4504f.get());
    }
}
