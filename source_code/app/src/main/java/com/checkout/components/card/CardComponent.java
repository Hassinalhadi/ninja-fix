package com.checkout.components.card;

import N2.ae;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import bz.af;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.CardComponentViewRenderer;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.injector.CardInjector;
import com.checkout.components.card.model.CardComponentCallbacks;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.BasePaymentMethodComponent;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.SelectedPaymentMethod;
import com.checkout.components.rememberme.model.SubmitAddCardPayload;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.clevertap.android.sdk.Constants;
import h5.C1809a;
import java.util.Locale;
import java.util.Map;
import k4.C2007a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012(\u0010\u0018\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011j\u0002`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0017¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b3\u0010*J\u0017\u00106\u001a\u0002042\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u0010:\u001a\u00020\u0016H\u0001¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020\u0016H\u0007¢\u0006\u0004\b;\u00101J.\u0010@\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160>H\u0087@¢\u0006\u0004\b@\u0010AJ\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010B\u001a\u00020\u0006H\u0087@¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020\u0015H\u0007¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bJ\u0010KR!\u0010R\u001a\u00020L8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u00109\u001a\u0004\bO\u0010PR!\u0010X\u001a\u00020S8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bT\u0010N\u0012\u0004\bW\u00109\u001a\u0004\bU\u0010VR!\u0010^\u001a\u00020Y8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bZ\u0010N\u0012\u0004\b]\u00109\u001a\u0004\b[\u0010\\R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/checkout/components/card/CardComponent;", "Lcom/checkout/components/interfaces/component/BasePaymentMethodComponent;", "Lcom/checkout/components/card/model/CardComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/interfaces/Environment;", "environment", "", "publicKey", "Landroid/content/Context;", "context", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "", "Lcom/checkout/components/card/model/OnTokenResult;", "onTokenResult", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "Lcom/checkout/components/ui/data/DisplayCvvRepository;", "displayCvvRepository", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Ljava/util/Locale;", "locale", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "paymentButtonAction", "<init>", "(Lcom/checkout/components/card/model/CardComponentConfig;Lcom/checkout/components/interfaces/Environment;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;Lyf/L;LXd/l;Lcom/checkout/components/ui/data/SupportedSchemesRepository;Lcom/checkout/components/ui/data/DisplayCvvRepository;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Locale;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/component/PaymentButtonAction;)V", "isValid", "(LNd/c;)Ljava/lang/Object;", "isAvailable", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "updateDetails", "update", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)V", "Render", "(Landroidx/compose/runtime/m;I)V", "tokenize", "submit", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "triggerOnChange$card_standardRelease", "()V", "triggerOnChange", "RenderAddCardView", "jwtToken", "setAsDefaultPaymentMethod", "Lkotlin/Function0;", "onReadyForTokenizationCheckFailed", "submitWithRememberMe", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LNd/c;)Ljava/lang/Object;", "bin", "Lkotlin/Result;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onSendCardMetaDataRequest-gIAlu-s", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "onSendCardMetaDataRequest", "isTokenizationInProgress", "()Z", "getCurrentCardMetadata", "()Lcom/checkout/components/interfaces/model/CardMetadata;", "Lcom/checkout/components/card/CardComponentViewRenderer;", "l", "Lkotlin/Lazy;", "getRenderer$card_standardRelease", "()Lcom/checkout/components/card/CardComponentViewRenderer;", "getRenderer$card_standardRelease$annotations", "renderer", "Lcom/checkout/components/card/operations/PaymentOperationManager;", "m", "getPaymentOperationManager$card_standardRelease", "()Lcom/checkout/components/card/operations/PaymentOperationManager;", "getPaymentOperationManager$card_standardRelease$annotations", "paymentOperationManager", "Lcom/checkout/components/card/di/base/Injector;", "o", "getDiInjector$card_standardRelease", "()Lcom/checkout/components/card/di/base/Injector;", "getDiInjector$card_standardRelease$annotations", "diInjector", "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", "name", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardComponent extends BasePaymentMethodComponent {
    public static final int $stable = 8;

    /* renamed from: a */
    private final CardComponentConfig f3923a;

    /* renamed from: b */
    private final Environment f3924b;

    /* renamed from: c */
    private final String f3925c;

    /* renamed from: d */
    private final Map f3926d;
    private final yf.L e;

    /* renamed from: f */
    private final Xd.l f3927f;

    /* renamed from: g */
    private final DesignTokens f3928g;

    /* renamed from: h */
    private final Locale f3929h;

    /* renamed from: i */
    private final Logger f3930i;

    /* renamed from: j */
    private final LogDetails f3931j;

    /* renamed from: k */
    private final PaymentButtonAction f3932k;

    /* renamed from: l, reason: from kotlin metadata */
    private final Lazy renderer;

    /* renamed from: m, reason: from kotlin metadata */
    private final Lazy paymentOperationManager;

    /* renamed from: n */
    private final Context f3935n;

    /* renamed from: o, reason: from kotlin metadata */
    private final Lazy diInjector;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectedPaymentMethod.values().length];
            try {
                iArr[SelectedPaymentMethod.ADD_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedPaymentMethod.SAVED_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectedPaymentMethod.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CardComponent(CardComponentConfig cardComponentConfig, Environment environment, String str, Context context, Map map, yf.L l10, Xd.l lVar, SupportedSchemesRepository supportedSchemesRepository, DisplayCvvRepository displayCvvRepository, DesignTokens designTokens, Locale locale, Logger logger, LogDetails logDetails, PaymentButtonAction paymentButtonAction, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardComponentConfig, environment, str, context, map, l10, lVar, supportedSchemesRepository, displayCvvRepository, (i4 & 512) != 0 ? null : designTokens, locale, logger, logDetails, paymentButtonAction);
    }

    public static final Unit a(CardComponent cardComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        cardComponent.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(CardComponent cardComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        cardComponent.RenderAddCardView(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getDiInjector$card_standardRelease$annotations() {
    }

    public static /* synthetic */ void getPaymentOperationManager$card_standardRelease$annotations() {
    }

    public static /* synthetic */ void getRenderer$card_standardRelease$annotations() {
    }

    public static final Unit provideView$lambda$18$lambda$17(CardComponent cardComponent, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            cardComponent.Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2048295767);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            getRenderer$card_standardRelease().Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k4.b(this, i4, 1);
        }
    }

    public final void RenderAddCardView(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1074567767);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            getRenderer$card_standardRelease().RenderAddCardView(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k4.b(this, i4, 0);
        }
    }

    @Nullable
    public final CardMetadata getCurrentCardMetadata() {
        Injector diInjector$card_standardRelease = getDiInjector$card_standardRelease();
        Intrinsics.charlie(diInjector$card_standardRelease, "null cannot be cast to non-null type com.checkout.components.card.di.injector.CardInjector");
        return (CardMetadata) ((yf.N) ((CardInjector) diInjector$card_standardRelease).paymentStateManager().getCardMetadata()).getValue();
    }

    @NotNull
    public final Injector getDiInjector$card_standardRelease() {
        return (Injector) this.diInjector.getValue();
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public ComponentName getName() {
        RememberMeScreen rememberMeScreen;
        CheckoutRememberMe rememberMe$card_standardRelease = this.f3923a.getRememberMe$card_standardRelease();
        if (rememberMe$card_standardRelease != null) {
            rememberMeScreen = rememberMe$card_standardRelease.currentScreen();
        } else {
            rememberMeScreen = null;
        }
        return ExtensionsKt.mapToComponentName(rememberMeScreen, PaymentMethodName.INSTANCE.getCard());
    }

    @NotNull
    public final PaymentOperationManager getPaymentOperationManager$card_standardRelease() {
        return (PaymentOperationManager) this.paymentOperationManager.getValue();
    }

    @NotNull
    public final CardComponentViewRenderer getRenderer$card_standardRelease() {
        return (CardComponentViewRenderer) this.renderer.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isAvailable(@NotNull Nd.c<? super Boolean> cVar) {
        C0896l c0896l;
        int i4;
        if (cVar instanceof C0896l) {
            c0896l = (C0896l) cVar;
            int i5 = c0896l.f4204c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0896l.f4204c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0896l.f4202a;
                Od.a aVar = Od.a.alpha;
                i4 = c0896l.f4204c;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    CheckoutRememberMe rememberMe$card_standardRelease = this.f3923a.getRememberMe$card_standardRelease();
                    if (rememberMe$card_standardRelease != null) {
                        c0896l.f4204c = 1;
                        if (rememberMe$card_standardRelease.checkPrefilledData(c0896l) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Boolean.TRUE;
            }
        }
        c0896l = new C0896l(this, cVar);
        Object obj2 = c0896l.f4202a;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0896l.f4204c;
        if (i4 == 0) {
        }
        return Boolean.TRUE;
    }

    public final boolean isTokenizationInProgress() {
        Injector diInjector$card_standardRelease = getDiInjector$card_standardRelease();
        Intrinsics.charlie(diInjector$card_standardRelease, "null cannot be cast to non-null type com.checkout.components.card.di.injector.CardInjector");
        return ((Boolean) ((yf.N) ((CardInjector) diInjector$card_standardRelease).paymentStateManager().getIsCardValidationTriggered()).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r7 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isValid(@NotNull Nd.c<? super Boolean> cVar) {
        C0897m c0897m;
        int i4;
        boolean z2;
        CheckoutRememberMe rememberMe$card_standardRelease;
        if (cVar instanceof C0897m) {
            c0897m = (C0897m) cVar;
            int i5 = c0897m.f4208d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0897m.f4208d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0897m.f4206b;
                Od.a aVar = Od.a.alpha;
                i4 = c0897m.f4208d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        return obj;
                    }
                } else {
                    ResultKt.alpha(obj);
                    ComponentName name = getName();
                    PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
                    if (Intrinsics.areEqual(name, companion.getCard())) {
                        PaymentOperationManager paymentOperationManager$card_standardRelease = getPaymentOperationManager$card_standardRelease();
                        c0897m.f4208d = 1;
                        Object isValid = paymentOperationManager$card_standardRelease.isValid(c0897m);
                        if (isValid != aVar) {
                            return isValid;
                        }
                    } else {
                        if (Intrinsics.areEqual(name, companion.getRememberMe()) && (rememberMe$card_standardRelease = this.f3923a.getRememberMe$card_standardRelease()) != null) {
                            if (WhenMappings.$EnumSwitchMapping$0[rememberMe$card_standardRelease.selectedPaymentMethod().ordinal()] == 1) {
                                PaymentOperationManager paymentOperationManager$card_standardRelease2 = getPaymentOperationManager$card_standardRelease();
                                c0897m.f4205a = null;
                                c0897m.f4208d = 2;
                                obj = paymentOperationManager$card_standardRelease2.isValid(c0897m);
                            } else {
                                z2 = rememberMe$card_standardRelease.isValid();
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                    return aVar;
                }
                z2 = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z2);
            }
        }
        c0897m = new C0897m(this, cVar);
        Object obj2 = c0897m.f4206b;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0897m.f4208d;
        if (i4 == 0) {
        }
        z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /* renamed from: onSendCardMetaDataRequest-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67onSendCardMetaDataRequestgIAlus(@NotNull String str, @NotNull Nd.c<? super Result<CardMetadata>> cVar) {
        C0898n c0898n;
        int i4;
        if (cVar instanceof C0898n) {
            c0898n = (C0898n) cVar;
            int i5 = c0898n.f4254d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0898n.f4254d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0898n.f4252b;
                Od.a aVar = Od.a.alpha;
                i4 = c0898n.f4254d;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                Injector diInjector$card_standardRelease = getDiInjector$card_standardRelease();
                Intrinsics.charlie(diInjector$card_standardRelease, "null cannot be cast to non-null type com.checkout.components.card.di.injector.CardInjector");
                CardMetaDataRepository cardMetaDataRepository = ((CardInjector) diInjector$card_standardRelease).cardMetaDataRepository();
                CardMetaDataRequest cardMetaDataRequest = new CardMetaDataRequest(str);
                c0898n.f4251a = null;
                c0898n.f4254d = 1;
                Object mo76sendCardMetaDataRequestgIAlus = cardMetaDataRepository.mo76sendCardMetaDataRequestgIAlus(cardMetaDataRequest, c0898n);
                if (mo76sendCardMetaDataRequestgIAlus == aVar) {
                    return aVar;
                }
                return mo76sendCardMetaDataRequestgIAlus;
            }
        }
        c0898n = new C0898n(this, cVar);
        Object obj2 = c0898n.f4252b;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0898n.f4254d;
        if (i4 == 0) {
        }
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public View provideView(@NotNull View container) {
        Intrinsics.echo(container, "container");
        Context context = container.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new P.d(new af(13, this), 1920457457, true));
        return composeView;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    public Object submit(@NotNull Nd.c<? super Unit> cVar) {
        CheckoutRememberMe rememberMe$card_standardRelease;
        Function1<PaymentMethodComponent, Unit> onSubmit = getComponentCallback().getOnSubmit();
        if (onSubmit != null) {
            onSubmit.invoke(this);
        }
        ComponentName name = getName();
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(name, companion.getCard())) {
            Object submit = getPaymentOperationManager$card_standardRelease().submit(cVar);
            if (submit == Od.a.alpha) {
                return submit;
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(name, companion.getRememberMe()) && (rememberMe$card_standardRelease = this.f3923a.getRememberMe$card_standardRelease()) != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[rememberMe$card_standardRelease.selectedPaymentMethod().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    Object submitSavedCard = rememberMe$card_standardRelease.submitSavedCard(cVar);
                    if (submitSavedCard == Od.a.alpha) {
                        return submitSavedCard;
                    }
                }
            } else {
                SubmitAddCardPayload submitAddCardPayload = rememberMe$card_standardRelease.getSubmitAddCardPayload();
                Object submitWithRememberMe = submitWithRememberMe(submitAddCardPayload.getJwtToken(), submitAddCardPayload.getSetAsDefaultPaymentMethod(), new C1809a(9), cVar);
                if (submitWithRememberMe == Od.a.alpha) {
                    return submitWithRememberMe;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object submitWithRememberMe(@NotNull String str, boolean z2, @NotNull Function0<Unit> function0, @NotNull Nd.c<? super Unit> cVar) {
        Object submitWithRememberMe = getPaymentOperationManager$card_standardRelease().submitWithRememberMe(str, z2, function0, cVar);
        if (submitWithRememberMe == Od.a.alpha) {
            return submitWithRememberMe;
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    public Object tokenize(@NotNull Nd.c<? super Unit> cVar) {
        if (Intrinsics.areEqual(getName(), PaymentMethodName.INSTANCE.getCard())) {
            Object obj = getPaymentOperationManager$card_standardRelease().tokenize(cVar);
            if (obj == Od.a.alpha) {
                return obj;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void triggerOnChange$card_standardRelease() {
        Function1<PaymentMethodComponent, Unit> onChange = getComponentCallback().getOnChange();
        if (onChange != null) {
            onChange.invoke(this);
        }
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public void update(@NotNull UpdateDetails updateDetails) {
        Intrinsics.echo(updateDetails, "updateDetails");
        Xd.l onError = getComponentCallback().getOnError();
        if (onError != null) {
            onError.invoke(this, ErrorExtensionsKt.toMethodNotSupportedError(this.f3931j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardComponent(@NotNull CardComponentConfig config, @NotNull Environment environment, @NotNull String publicKey, @NotNull Context context, @Nullable Map<ComponentTranslationKey, String> map, @NotNull yf.L paymentStateFlow, @NotNull Xd.l onTokenResult, @NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull DisplayCvvRepository displayCvvRepository, @Nullable DesignTokens designTokens, @NotNull Locale locale, @NotNull Logger logger, @NotNull LogDetails logDetails, @NotNull PaymentButtonAction paymentButtonAction) {
        super(config.getComponentCallback$card_standardRelease());
        Intrinsics.echo(config, "config");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(onTokenResult, "onTokenResult");
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        Intrinsics.echo(displayCvvRepository, "displayCvvRepository");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
        this.f3923a = config;
        this.f3924b = environment;
        this.f3925c = publicKey;
        this.f3926d = map;
        this.e = paymentStateFlow;
        this.f3927f = onTokenResult;
        this.f3928g = designTokens;
        this.f3929h = locale;
        this.f3930i = logger;
        this.f3931j = logDetails;
        this.f3932k = paymentButtonAction;
        final int i4 = 0;
        this.renderer = LazyKt.lazy(new Function0(this) { // from class: k4.c
            public final /* synthetic */ CardComponent purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CardComponentViewRenderer b2;
                PaymentOperationManager a6;
                switch (i4) {
                    case 0:
                        b2 = CardComponent.b(this.purple);
                        return b2;
                    default:
                        a6 = CardComponent.a(this.purple);
                        return a6;
                }
            }
        });
        final int i5 = 1;
        this.paymentOperationManager = LazyKt.lazy(new Function0(this) { // from class: k4.c
            public final /* synthetic */ CardComponent purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CardComponentViewRenderer b2;
                PaymentOperationManager a6;
                switch (i5) {
                    case 0:
                        b2 = CardComponent.b(this.purple);
                        return b2;
                    default:
                        a6 = CardComponent.a(this.purple);
                        return a6;
                }
            }
        });
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f3935n = context.createConfigurationContext(configuration);
        this.diInjector = LazyKt.lazy(new Ac.l(this, supportedSchemesRepository, displayCvvRepository, 14));
    }

    public static final PaymentOperationManager a(CardComponent cardComponent) {
        Injector diInjector$card_standardRelease = cardComponent.getDiInjector$card_standardRelease();
        Intrinsics.charlie(diInjector$card_standardRelease, "null cannot be cast to non-null type com.checkout.components.card.di.injector.CardInjector");
        return ((CardInjector) diInjector$card_standardRelease).getOrCreatePaymentOperationManager();
    }

    public static final CardComponentViewRenderer b(CardComponent cardComponent) {
        return new CardComponentViewRenderer(cardComponent.f3923a, cardComponent, cardComponent.getDiInjector$card_standardRelease());
    }

    public static final Injector a(CardComponent cardComponent, SupportedSchemesRepository supportedSchemesRepository, DisplayCvvRepository displayCvvRepository) {
        SupportedTypesRepository supportedTypesRepository;
        C0893i c0893i;
        C0894j c0894j;
        Xd.l lVar;
        C2007a c2007a;
        CardComponentConfig cardComponentConfig = cardComponent.f3923a;
        CardInjector.Companion companion = CardInjector.INSTANCE;
        SupportedTypesRepository supportedTypesRepository$card_standardRelease = cardComponentConfig.getSupportedTypesRepository$card_standardRelease();
        Environment environment = cardComponent.f3924b;
        String str = cardComponent.f3925c;
        Context contextWithLocale = cardComponent.f3935n;
        Intrinsics.delta(contextWithLocale, "contextWithLocale");
        Map<ComponentTranslationKey, String> map = cardComponent.f3926d;
        yf.L l10 = cardComponent.e;
        DesignTokens designTokens = cardComponent.f3928g;
        LogDetails logDetails = cardComponent.f3931j;
        Logger logger = cardComponent.f3930i;
        PaymentButtonAction paymentButtonAction = cardComponent.f3932k;
        AddressConfiguration addressConfiguration$card_standardRelease = cardComponent.f3923a.getAddressConfiguration$card_standardRelease();
        CheckoutRememberMe rememberMe$card_standardRelease = cardComponent.f3923a.getRememberMe$card_standardRelease();
        Locale locale = cardComponent.f3929h;
        CardConfiguration cardConfiguration$card_standardRelease = cardComponent.f3923a.getCardConfiguration$card_standardRelease();
        Xd.l onTokenized = cardComponentConfig.getComponentCallback$card_standardRelease().getOnTokenized();
        if (onTokenized != null) {
            supportedTypesRepository = supportedTypesRepository$card_standardRelease;
            c0893i = new C0893i(onTokenized, null);
        } else {
            supportedTypesRepository = supportedTypesRepository$card_standardRelease;
            c0893i = null;
        }
        Function1<CardMetadata, CallbackResult> onCardBinChanged = cardComponentConfig.getComponentCallback$card_standardRelease().getOnCardBinChanged();
        ae aeVar = onCardBinChanged != null ? new ae(8, onCardBinChanged) : null;
        C0894j c0894j2 = new C0894j(cardComponent);
        Xd.l lVar2 = cardComponent.f3927f;
        Xd.l onError = cardComponentConfig.getComponentCallback$card_standardRelease().getOnError();
        if (onError != null) {
            c0894j = c0894j2;
            lVar = lVar2;
            c2007a = new C2007a(0, onError, cardComponent);
        } else {
            c0894j = c0894j2;
            lVar = lVar2;
            c2007a = null;
        }
        Xd.l handleTap = cardComponentConfig.getComponentCallback$card_standardRelease().getHandleTap();
        return companion.create$card_standardRelease(supportedTypesRepository, supportedSchemesRepository, displayCvvRepository, environment, str, contextWithLocale, map, l10, designTokens, logDetails, logger, paymentButtonAction, addressConfiguration$card_standardRelease, rememberMe$card_standardRelease, locale, new CardComponentCallbacks(c0894j, new Yb.F(19, cardComponentConfig, cardComponent), lVar, c2007a, c0893i, aeVar, handleTap != null ? new C0895k(handleTap, cardComponent, null) : null), cardConfiguration$card_standardRelease);
    }

    public static final Unit a(CardComponentConfig cardComponentConfig, CardComponent cardComponent) {
        Function1<PaymentMethodComponent, Unit> onSubmit = cardComponentConfig.getComponentCallback$card_standardRelease().getOnSubmit();
        if (onSubmit != null) {
            onSubmit.invoke(cardComponent);
        }
        return Unit.INSTANCE;
    }

    public static final CallbackResult a(Function1 function1, CardMetadata cardMetadata) {
        Intrinsics.echo(cardMetadata, "cardMetadata");
        return (CallbackResult) function1.invoke(cardMetadata);
    }

    public static final Unit a(Xd.l lVar, CardComponent cardComponent, CheckoutError error) {
        Intrinsics.echo(error, "error");
        lVar.invoke(cardComponent, error);
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
