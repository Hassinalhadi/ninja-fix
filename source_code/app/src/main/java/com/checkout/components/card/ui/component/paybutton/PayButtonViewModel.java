package com.checkout.components.card.ui.component.paybutton;

import Kd.a;
import T1.c;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.card.Q;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.component.PayButtonViewModelSubComponent;
import com.checkout.components.card.di.component.p;
import com.checkout.components.card.operations.network.error.ErrorMessages;
import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;
import yf.AbstractC3428A;
import yf.D;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001=B¥\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u001e\u0010\u0018\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0014\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0012H\u0001¢\u0006\u0004\b!\u0010 R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00160-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00109\u001a\b\u0012\u0004\u0012\u00020\u0016038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010 \u001a\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u00101¨\u0006>"}, d2 = {"Lcom/checkout/components/card/ui/component/paybutton/PayButtonViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "style", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "buttonStyleMapper", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "buttonStateMapper", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "tokenRepository", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "paymentButtonAction", "Lkotlin/Function0;", "", "onButtonClick", "Lkotlin/Function1;", "LNd/c;", "", "", "handlePayButtonTap", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "<init>", "(Lcom/checkout/components/ui/model/style/base/ButtonStyle;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/component/PaymentButtonAction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;)V", "pay", "()V", "handleInvalidCardComponentError$card_standardRelease", "handleInvalidCardComponentError", "i", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "getButtonState", "()Lcom/checkout/components/ui/model/state/InternalButtonState;", "buttonState", "j", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "getButtonStyle", "()Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "buttonStyle", "Lyf/L;", "m", "Lyf/L;", "isReadyForTokenization$card_standardRelease", "()Lyf/L;", "isReadyForTokenization", "Landroidx/compose/runtime/D0;", "l", "Landroidx/compose/runtime/D0;", "isButtonReady$card_standardRelease", "()Landroidx/compose/runtime/D0;", "isButtonReady$card_standardRelease$annotations", "isButtonReady", "Lcom/checkout/components/interfaces/model/PaymentState;", "getPaymentState$card_standardRelease", "paymentState", "PayButtonFactory", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayButtonViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final PaymentStateManager f4519a;

    /* renamed from: b, reason: collision with root package name */
    private final TokenRepository f4520b;

    /* renamed from: c, reason: collision with root package name */
    private final ResourceProvider f4521c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentButtonAction f4522d;
    private final Function0 e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f4523f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f4524g;

    /* renamed from: h, reason: collision with root package name */
    private final LogDetails f4525h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InternalButtonState buttonState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InternalButtonViewStyle buttonStyle;

    /* renamed from: k, reason: collision with root package name */
    private final ax f4528k;

    /* renamed from: l, reason: collision with root package name */
    private final ax f4529l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final L isReadyForTokenization;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/card/ui/component/paybutton/PayButtonViewModel$PayButtonFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/card/di/base/InjectionClient;", "Lcom/checkout/components/card/di/base/Injector;", "injector", "<init>", "(Lcom/checkout/components/card/di/base/Injector;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LKd/a;", "Lcom/checkout/components/card/di/component/PayButtonViewModelSubComponent$Builder;", "subComponentProvider", "LKd/a;", "getSubComponentProvider", "()LKd/a;", "setSubComponentProvider", "(LKd/a;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PayButtonFactory implements a0, InjectionClient {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name */
        private final Injector f4531a;
        public a subComponentProvider;

        public PayButtonFactory(@NotNull Injector injector) {
            Intrinsics.echo(injector, "injector");
            this.f4531a = injector;
        }

        @Override // androidx.lifecycle.a0
        @NotNull
        public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
            return P0.bravo(this, interfaceC1772d, cVar);
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
            Intrinsics.echo(modelClass, "modelClass");
            this.f4531a.inject(this);
            PayButtonViewModel payButtonViewModel = ((p) ((PayButtonViewModelSubComponent.Builder) getSubComponentProvider().get()).build()).getPayButtonViewModel();
            Intrinsics.charlie(payButtonViewModel, "null cannot be cast to non-null type T of com.checkout.components.card.ui.component.paybutton.PayButtonViewModel.PayButtonFactory.create");
            return payButtonViewModel;
        }
    }

    public PayButtonViewModel(@NotNull ButtonStyle style, @NotNull Mapper<ButtonStyle, InternalButtonViewStyle> buttonStyleMapper, @NotNull Mapper<ButtonStyle, InternalButtonState> buttonStateMapper, @NotNull PaymentStateManager paymentStateManager, @NotNull TokenRepository tokenRepository, @NotNull ResourceProvider resourceProvider, @NotNull PaymentButtonAction paymentButtonAction, @NotNull Function0<Unit> onButtonClick, @Nullable Function1<? super Nd.c<? super Boolean>, ? extends Object> function1, @Nullable Function1<? super CheckoutError, Unit> function12, @NotNull LogDetails logDetails) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(buttonStyleMapper, "buttonStyleMapper");
        Intrinsics.echo(buttonStateMapper, "buttonStateMapper");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(tokenRepository, "tokenRepository");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
        Intrinsics.echo(onButtonClick, "onButtonClick");
        Intrinsics.echo(logDetails, "logDetails");
        this.f4519a = paymentStateManager;
        this.f4520b = tokenRepository;
        this.f4521c = resourceProvider;
        this.f4522d = paymentButtonAction;
        this.e = onButtonClick;
        this.f4523f = function1;
        this.f4524g = function12;
        this.f4525h = logDetails;
        InternalButtonState map = buttonStateMapper.map(style);
        this.buttonState = map;
        this.buttonStyle = buttonStyleMapper.map(style);
        Boolean bool = Boolean.TRUE;
        ax zulu = C0564b.zulu(bool);
        this.f4528k = zulu;
        this.f4529l = zulu;
        this.isReadyForTokenization = AbstractC3428A.romeo(paymentStateManager.isReadyForTokenization(), T.hotel(this), D.alpha, Boolean.FALSE);
        map.isEnabled().setValue(bool);
        ad.zulu(T.hotel(this), null, null, new com.checkout.components.card.T(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(PayButtonViewModel payButtonViewModel) {
        payButtonViewModel.a(payButtonViewModel.f4522d == PaymentButtonAction.TOKENIZE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(PayButtonViewModel payButtonViewModel) {
        payButtonViewModel.a(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void isButtonReady$card_standardRelease$annotations() {
    }

    @NotNull
    public final InternalButtonState getButtonState() {
        return this.buttonState;
    }

    @NotNull
    public final InternalButtonViewStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @NotNull
    public final L getPaymentState$card_standardRelease() {
        return this.f4519a.getPaymentState();
    }

    public final void handleInvalidCardComponentError$card_standardRelease() {
        Function1 function1;
        if (CommonExtensionsKt.hasInvalidCardFieldsForComponentSubmit(this.f4519a) && (function1 = this.f4524g) != null) {
            function1.invoke(new CheckoutError.Submit(ErrorMessages.CARD_FIELDS_INVALID, CheckoutErrorCode.COMPONENT_INVALID, new CheckoutErrorDetails.Submit(this.f4525h.getMobileSessionId(), this.f4525h.getPaymentSessionId(), this.f4525h.getType())));
        }
    }

    @NotNull
    public final D0 isButtonReady$card_standardRelease() {
        return this.f4529l;
    }

    @NotNull
    /* renamed from: isReadyForTokenization$card_standardRelease, reason: from getter */
    public final L getIsReadyForTokenization() {
        return this.isReadyForTokenization;
    }

    public final void pay() {
        N n5;
        Object value;
        Boolean bool;
        if (!this.f4519a.isPaymentInProgressOrCompleted() && ((Boolean) this.f4528k.getValue()).booleanValue()) {
            this.f4528k.setValue(Boolean.FALSE);
            at isCardValidationTriggered = this.f4519a.getIsCardValidationTriggered();
            do {
                n5 = (N) isCardValidationTriggered;
                value = n5.getValue();
                ((Boolean) value).getClass();
                bool = Boolean.TRUE;
            } while (!n5.hotel(value, bool));
            boolean z2 = false;
            if (((Boolean) this.isReadyForTokenization.getValue()).booleanValue()) {
                this.e.invoke();
                PaymentStateManager paymentStateManager = this.f4519a;
                if (paymentStateManager.rememberMeJWTTokenOrNull() != null) {
                    z2 = true;
                }
                TokenRequest tokenRequest = CommonExtensionsKt.toTokenRequest(paymentStateManager, Boolean.valueOf(z2));
                final int i4 = 0;
                final int i5 = 1;
                ad.zulu(T.hotel(this), null, null, new Q(this, new CardTokenRequest(tokenRequest, new Function0(this) { // from class: y4.a
                    public final /* synthetic */ PayButtonViewModel purple;

                    {
                        this.purple = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit a6;
                        Unit b2;
                        switch (i4) {
                            case 0:
                                a6 = PayButtonViewModel.a(this.purple);
                                return a6;
                            default:
                                b2 = PayButtonViewModel.b(this.purple);
                                return b2;
                        }
                    }
                }, new Function0(this) { // from class: y4.a
                    public final /* synthetic */ PayButtonViewModel purple;

                    {
                        this.purple = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit a6;
                        Unit b2;
                        switch (i5) {
                            case 0:
                                a6 = PayButtonViewModel.a(this.purple);
                                return a6;
                            default:
                                b2 = PayButtonViewModel.b(this.purple);
                                return b2;
                        }
                    }
                }, (String) ((N) this.f4519a.getRememberMeJWTToken()).getValue()), null), 3);
                return;
            }
            if (this.f4522d == PaymentButtonAction.TOKENIZE) {
                z2 = true;
            }
            a(z2);
            this.f4528k.setValue(bool);
            handleInvalidCardComponentError$card_standardRelease();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z2) {
        N n5;
        Object value;
        at isCardValidationTriggered = this.f4519a.getIsCardValidationTriggered();
        do {
            n5 = (N) isCardValidationTriggered;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        if (z2) {
            this.f4528k.setValue(Boolean.TRUE);
        }
    }
}
