package com.checkout.components.card.operations;

import Kd.a;
import Nd.c;
import Yb.F;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.V;
import com.checkout.components.card.W;
import com.checkout.components.card.X;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.component.PaymentOperationManagerSubComponent;
import com.checkout.components.card.di.component.r;
import com.checkout.components.card.di.injector.CardInjector;
import com.checkout.components.card.operations.network.error.ErrorMessages;
import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.LogDetails;
import h5.C1809a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fBW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J.\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/checkout/components/card/operations/PaymentOperationManager;", "", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;", "tokenRepository", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "onError", "LNd/c;", "", "handlePayButtonTap", "<init>", "(Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/card/operations/tokenisation/repository/TokenRepository;Lcom/checkout/components/interfaces/insight/LogDetails;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "isValid", "(LNd/c;)Ljava/lang/Object;", "tokenize", "", "jwtToken", "setAsDefaultPaymentMethod", "Lkotlin/Function0;", "onReadyForTokenizationCheckFailed", "submitWithRememberMe", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LNd/c;)Ljava/lang/Object;", "submit", "handleInvalidCardComponentError$card_standardRelease", "()V", "handleInvalidCardComponentError", "PaymentOperationManagerFactory", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentOperationManager {
    public static final int $stable = 8;

    /* renamed from: a */
    private final PaymentStateManager f4259a;

    /* renamed from: b */
    private final TokenRepository f4260b;

    /* renamed from: c */
    private final LogDetails f4261c;

    /* renamed from: d */
    private final Function1 f4262d;
    private final Function1 e;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/card/operations/PaymentOperationManager$PaymentOperationManagerFactory;", "Lcom/checkout/components/card/di/base/InjectionClient;", "Lcom/checkout/components/card/di/injector/CardInjector;", "injector", "<init>", "(Lcom/checkout/components/card/di/injector/CardInjector;)V", "Lcom/checkout/components/card/operations/PaymentOperationManager;", "create", "()Lcom/checkout/components/card/operations/PaymentOperationManager;", "LKd/a;", "Lcom/checkout/components/card/di/component/PaymentOperationManagerSubComponent$Builder;", "subComponentProvider", "LKd/a;", "getSubComponentProvider", "()LKd/a;", "setSubComponentProvider", "(LKd/a;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PaymentOperationManagerFactory implements InjectionClient {
        public static final int $stable = 8;

        /* renamed from: a */
        private final CardInjector f4263a;
        public a subComponentProvider;

        public PaymentOperationManagerFactory(@NotNull CardInjector injector) {
            Intrinsics.echo(injector, "injector");
            this.f4263a = injector;
        }

        @NotNull
        public final PaymentOperationManager create() {
            this.f4263a.inject(this);
            return ((r) ((PaymentOperationManagerSubComponent.Builder) getSubComponentProvider().get()).build()).getPaymentOperationManager();
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
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentButtonAction.values().length];
            try {
                iArr[PaymentButtonAction.TOKENIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentButtonAction.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentOperationManager(@NotNull PaymentStateManager paymentStateManager, @NotNull TokenRepository tokenRepository, @NotNull LogDetails logDetails, @Nullable Function1<? super CheckoutError, Unit> function1, @Nullable Function1<? super c<? super Boolean>, ? extends Object> function12) {
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(tokenRepository, "tokenRepository");
        Intrinsics.echo(logDetails, "logDetails");
        this.f4259a = paymentStateManager;
        this.f4260b = tokenRepository;
        this.f4261c = logDetails;
        this.f4262d = function1;
        this.e = function12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentButtonAction paymentButtonAction, Boolean bool, Function0 function0, c cVar) {
        V v4;
        Object obj;
        int i4;
        N n5;
        Object value;
        N n10;
        Object value2;
        if (cVar instanceof V) {
            v4 = (V) cVar;
            int i5 = v4.f3975f;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                v4.f3975f = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = v4.f3974d;
                Od.a aVar = Od.a.alpha;
                i4 = v4.f3975f;
                if (i4 != 0) {
                    ResultKt.alpha(obj);
                    at isCardValidationTriggered = this.f4259a.isCardValidationTriggered();
                    do {
                        n5 = (N) isCardValidationTriggered;
                        value = n5.getValue();
                        ((Boolean) value).getClass();
                    } while (!n5.hotel(value, Boolean.TRUE));
                    InterfaceC3439i isReadyForTokenization = this.f4259a.isReadyForTokenization();
                    v4.f3971a = paymentButtonAction;
                    v4.f3972b = bool;
                    v4.f3973c = function0;
                    v4.f3975f = 1;
                    obj = AbstractC3428A.november(isReadyForTokenization, v4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function0 = v4.f3973c;
                    bool = v4.f3972b;
                    paymentButtonAction = v4.f3971a;
                    ResultKt.alpha(obj);
                }
                Function0 function02 = function0;
                if (!((Boolean) obj).booleanValue()) {
                    CardTokenRequest cardTokenRequest = new CardTokenRequest(CommonExtensionsKt.toTokenRequest(this.f4259a, bool), new n(2, this), new F(21, this, function02), (String) ((N) this.f4259a.getRememberMeJWTToken()).getValue());
                    int i10 = WhenMappings.$EnumSwitchMapping$0[paymentButtonAction.ordinal()];
                    if (i10 == 1) {
                        this.f4260b.sendCardTokenOnly(cardTokenRequest);
                    } else if (i10 == 2) {
                        this.f4260b.sendCardTokenRequest(cardTokenRequest);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    handleInvalidCardComponentError$card_standardRelease();
                    at isCardValidationTriggered2 = this.f4259a.isCardValidationTriggered();
                    do {
                        n10 = (N) isCardValidationTriggered2;
                        value2 = n10.getValue();
                        ((Boolean) value2).getClass();
                    } while (!n10.hotel(value2, Boolean.FALSE));
                    function02.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        v4 = new V(this, cVar);
        obj = v4.f3974d;
        Od.a aVar2 = Od.a.alpha;
        i4 = v4.f3975f;
        if (i4 != 0) {
        }
        Function0 function022 = function0;
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit bravo(PaymentOperationManager paymentOperationManager, Function0 function0) {
        return a(paymentOperationManager, function0);
    }

    public static /* synthetic */ Unit charlie(PaymentOperationManager paymentOperationManager) {
        return a(paymentOperationManager);
    }

    public final void handleInvalidCardComponentError$card_standardRelease() {
        Function1 function1;
        if (CommonExtensionsKt.hasInvalidCardFieldsForComponentSubmit(this.f4259a) && (function1 = this.f4262d) != null) {
            function1.invoke(new CheckoutError.Submit(ErrorMessages.CARD_FIELDS_INVALID, CheckoutErrorCode.COMPONENT_INVALID, new CheckoutErrorDetails.Submit(this.f4261c.getMobileSessionId(), this.f4261c.getPaymentSessionId(), this.f4261c.getType())));
        }
    }

    @Nullable
    public final Object isValid(@NotNull c<? super Boolean> cVar) {
        N n5;
        Object value;
        at isValidCallbackTriggered = this.f4259a.isValidCallbackTriggered();
        do {
            n5 = (N) isValidCallbackTriggered;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.TRUE));
        return AbstractC3428A.november(this.f4259a.isCardFieldsValid(), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (a(r5, r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r6 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submit(@NotNull c<? super Unit> cVar) {
        W w4;
        Object obj;
        int i4;
        if (cVar instanceof W) {
            w4 = (W) cVar;
            int i5 = w4.f3978c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                w4.f3978c = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = w4.f3976a;
                Od.a aVar = Od.a.alpha;
                i4 = w4.f3978c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    Function1 function1 = this.e;
                    if (function1 != null) {
                        w4.f3978c = 1;
                        obj = function1.invoke(w4);
                    }
                    PaymentButtonAction paymentButtonAction = PaymentButtonAction.PAYMENT;
                    w4.f3978c = 2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                PaymentButtonAction paymentButtonAction2 = PaymentButtonAction.PAYMENT;
                w4.f3978c = 2;
            }
        }
        w4 = new W(this, cVar);
        obj = w4.f3976a;
        Od.a aVar2 = Od.a.alpha;
        i4 = w4.f3978c;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        PaymentButtonAction paymentButtonAction22 = PaymentButtonAction.PAYMENT;
        w4.f3978c = 2;
    }

    @Nullable
    public final Object submitWithRememberMe(@NotNull String str, boolean z2, @NotNull Function0<Unit> function0, @NotNull c<? super Unit> cVar) {
        ((N) this.f4259a.getRememberMeJWTToken()).india(str);
        Object a6 = a(PaymentButtonAction.PAYMENT, Boolean.valueOf(z2), function0, cVar);
        if (a6 == Od.a.alpha) {
            return a6;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (a(r5, r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r6 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tokenize(@NotNull c<? super Unit> cVar) {
        X x4;
        Object obj;
        int i4;
        if (cVar instanceof X) {
            x4 = (X) cVar;
            int i5 = x4.f3981c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                x4.f3981c = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = x4.f3979a;
                Od.a aVar = Od.a.alpha;
                i4 = x4.f3981c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    Function1 function1 = this.e;
                    if (function1 != null) {
                        x4.f3981c = 1;
                        obj = function1.invoke(x4);
                    }
                    PaymentButtonAction paymentButtonAction = PaymentButtonAction.TOKENIZE;
                    x4.f3981c = 2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                PaymentButtonAction paymentButtonAction2 = PaymentButtonAction.TOKENIZE;
                x4.f3981c = 2;
            }
        }
        x4 = new X(this, cVar);
        obj = x4.f3979a;
        Od.a aVar2 = Od.a.alpha;
        i4 = x4.f3981c;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        PaymentButtonAction paymentButtonAction22 = PaymentButtonAction.TOKENIZE;
        x4.f3981c = 2;
    }

    public static /* synthetic */ Object a(PaymentOperationManager paymentOperationManager, PaymentButtonAction paymentButtonAction, Pd.c cVar) {
        return paymentOperationManager.a(paymentButtonAction, null, new C1809a(17), cVar);
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(PaymentOperationManager paymentOperationManager) {
        N n5;
        Object value;
        at isCardValidationTriggered = paymentOperationManager.f4259a.isCardValidationTriggered();
        do {
            n5 = (N) isCardValidationTriggered;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        return Unit.INSTANCE;
    }

    public static final Unit a(PaymentOperationManager paymentOperationManager, Function0 function0) {
        N n5;
        Object value;
        at isCardValidationTriggered = paymentOperationManager.f4259a.isCardValidationTriggered();
        do {
            n5 = (N) isCardValidationTriggered;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        function0.invoke();
        return Unit.INSTANCE;
    }
}
