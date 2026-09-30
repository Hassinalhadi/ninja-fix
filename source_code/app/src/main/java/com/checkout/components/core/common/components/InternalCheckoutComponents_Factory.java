package com.checkout.components.core.common.components;

import com.checkout.components.card.CardComponentFactory;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.mapper.PaymentSessionSubmissionResultToResponseMapper;
import com.checkout.components.core.network.PayRequestBuilder;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.core.ui.FlowComponentFactory;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.checkout.components.wallet.WalletComponentFactory;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import vf.ab;

/* loaded from: classes3.dex */
public final class InternalCheckoutComponents_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4701a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4702b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4703c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4704d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4705f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4706g;

    /* renamed from: h, reason: collision with root package name */
    private final d f4707h;

    /* renamed from: i, reason: collision with root package name */
    private final d f4708i;

    /* renamed from: j, reason: collision with root package name */
    private final d f4709j;

    /* renamed from: k, reason: collision with root package name */
    private final d f4710k;

    /* renamed from: l, reason: collision with root package name */
    private final d f4711l;

    /* renamed from: m, reason: collision with root package name */
    private final d f4712m;

    /* renamed from: n, reason: collision with root package name */
    private final d f4713n;

    /* renamed from: o, reason: collision with root package name */
    private final d f4714o;

    /* renamed from: p, reason: collision with root package name */
    private final d f4715p;

    /* renamed from: q, reason: collision with root package name */
    private final d f4716q;

    /* renamed from: r, reason: collision with root package name */
    private final d f4717r;

    /* renamed from: s, reason: collision with root package name */
    private final d f4718s;

    /* renamed from: t, reason: collision with root package name */
    private final d f4719t;

    public InternalCheckoutComponents_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, d dVar12, d dVar13, d dVar14, d dVar15, d dVar16, d dVar17, d dVar18, d dVar19, d dVar20) {
        this.f4701a = dVar;
        this.f4702b = dVar2;
        this.f4703c = dVar3;
        this.f4704d = dVar4;
        this.e = dVar5;
        this.f4705f = dVar6;
        this.f4706g = dVar7;
        this.f4707h = dVar8;
        this.f4708i = dVar9;
        this.f4709j = dVar10;
        this.f4710k = dVar11;
        this.f4711l = dVar12;
        this.f4712m = dVar13;
        this.f4713n = dVar14;
        this.f4714o = dVar15;
        this.f4715p = dVar16;
        this.f4716q = dVar17;
        this.f4717r = dVar18;
        this.f4718s = dVar19;
        this.f4719t = dVar20;
    }

    public static InternalCheckoutComponents_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, d dVar12, d dVar13, d dVar14, d dVar15, d dVar16, d dVar17, d dVar18, d dVar19, d dVar20) {
        return new InternalCheckoutComponents_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20);
    }

    public static InternalCheckoutComponents newInstance(CheckoutComponentConfiguration.Payment payment, PaymentSession paymentSession, PayPaymentSessionUseCase payPaymentSessionUseCase, Moshi moshi, Mapper<DesignTokens, ComposeStyle> mapper, Logger logger, FlowComponentFactory flowComponentFactory, WalletComponentFactory walletComponentFactory, CardSchemePolicy cardSchemePolicy, CardComponentFactory cardComponentFactory, RedirectDelegate.Factory factory, CustomTabsEnabledGuard customTabsEnabledGuard, ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard, StandaloneCheckoutComponents standaloneCheckoutComponents, RiskManager riskManager, ab abVar, CheckoutRememberMeFactory checkoutRememberMeFactory, PayRequestBuilder payRequestBuilder, PaymentSessionSubmissionResultToResponseMapper paymentSessionSubmissionResultToResponseMapper, DynamicComponentFactoriesProvider dynamicComponentFactoriesProvider) {
        return new InternalCheckoutComponents(payment, paymentSession, payPaymentSessionUseCase, moshi, mapper, logger, flowComponentFactory, walletComponentFactory, cardSchemePolicy, cardComponentFactory, factory, customTabsEnabledGuard, forwardingEmailsDisabledGuard, standaloneCheckoutComponents, riskManager, abVar, checkoutRememberMeFactory, payRequestBuilder, paymentSessionSubmissionResultToResponseMapper, dynamicComponentFactoriesProvider);
    }

    @Override // Kd.a
    public final InternalCheckoutComponents get() {
        return new InternalCheckoutComponents((CheckoutComponentConfiguration.Payment) this.f4701a.get(), (PaymentSession) this.f4702b.get(), (PayPaymentSessionUseCase) this.f4703c.get(), (Moshi) this.f4704d.get(), (Mapper) this.e.get(), (Logger) this.f4705f.get(), (FlowComponentFactory) this.f4706g.get(), (WalletComponentFactory) this.f4707h.get(), (CardSchemePolicy) this.f4708i.get(), (CardComponentFactory) this.f4709j.get(), (RedirectDelegate.Factory) this.f4710k.get(), (CustomTabsEnabledGuard) this.f4711l.get(), (ForwardingEmailsDisabledGuard) this.f4712m.get(), (StandaloneCheckoutComponents) this.f4713n.get(), (RiskManager) this.f4714o.get(), (ab) this.f4715p.get(), (CheckoutRememberMeFactory) this.f4716q.get(), (PayRequestBuilder) this.f4717r.get(), (PaymentSessionSubmissionResultToResponseMapper) this.f4718s.get(), (DynamicComponentFactoriesProvider) this.f4719t.get());
    }
}
