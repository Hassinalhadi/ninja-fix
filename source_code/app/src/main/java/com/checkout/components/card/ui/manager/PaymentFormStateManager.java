package com.checkout.components.card.ui.manager;

import J8.ah;
import Nd.c;
import Pd.e;
import Pd.i;
import Xd.m;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.U;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.L;
import yf.N;
import yf.at;
import zf.b;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 R \u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010 R \u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 R \u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u0010 R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010 R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010 R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010 R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010\u001e\u001a\u0004\b\u0012\u0010 R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\u001e\u001a\u0004\b\u0013\u0010 R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010\u001e\u001a\u0004\bE\u0010 R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010\u001e\u001a\u0004\bG\u0010 R \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010\u001e\u001a\u0004\bI\u0010 R\"\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010\u001e\u001a\u0004\bK\u0010 R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\u001e\u001a\u0004\bN\u0010 R \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010\u001e\u001a\u0004\bP\u0010 R \u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010\u001e\u001a\u0004\bS\u0010 R!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR!\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020%0\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lcom/checkout/components/card/ui/manager/PaymentFormStateManager;", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "", "defaultCardholderNameValid", "Lcom/checkout/components/ui/data/DisplayCvvRepository;", "displayCvvRepository", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentState", "<init>", "(ZLcom/checkout/components/ui/data/DisplayCvvRepository;Lcom/checkout/components/ui/data/SupportedSchemesRepository;Lyf/L;)V", "isPaymentInProgressOrCompleted", "()Z", "", "rememberMeJWTTokenOrNull", "()Ljava/lang/String;", "isCvvValid", "isCvvRequiredScheme", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "displayCvvConfiguration", "isCvvAccepted", "(ZZLcom/checkout/components/interfaces/model/DisplayCvvConfiguration;)Z", "c", "Lyf/L;", "getPaymentState", "()Lyf/L;", "Lyf/at;", Constants.INAPP_DATA_TAG, "Lyf/at;", "getCardNumber", "()Lyf/at;", "cardNumber", "e", "getExpiryDate", "expiryDate", "Lcom/checkout/components/ui/model/CardScheme;", "f", "getCardScheme", "cardScheme", "g", "getPreferredCardScheme", "preferredCardScheme", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "h", "getContactData", "contactData", "Lcom/checkout/components/interfaces/model/CardMetadata;", "i", "getCardMetadata", "cardMetadata", "j", "getCvv", com.checkout.components.rememberme.utils.Constants.CVV_TYPE, "k", "getCardHolderName", "cardHolderName", "l", "isCardNumberValid", "m", "isCardNumberValidForFullCardValidation", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "isCardSchemeValid", "o", "isExpiryDateValid", "p", "q", "r", "isCardHolderNameValid", "s", "isCardValidationTriggered", "t", "isAddressValid", "u", "getRememberMeJWTToken", "rememberMeJWTToken", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "isValidCallbackTriggered", Constants.INAPP_WINDOW, "getUiPaymentErrorMessage", "uiPaymentErrorMessage", "x", "getMerchantCardNotSupportedErrorMessage", "merchantCardNotSupportedErrorMessage", "Lyf/i;", CtApi.QUERY_PARAM_Z_KEY, "Lkotlin/Lazy;", "isReadyForTokenization", "()Lyf/i;", "A", "isCardFieldsValid", "", "getSupportedCardSchemeList", "()Ljava/util/List;", "supportedCardSchemeList", "getDisplayCvvConfiguration", "()Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentFormStateManager implements PaymentStateManager {
    public static final int $stable = 8;

    /* renamed from: A, reason: from kotlin metadata */
    private final Lazy isCardFieldsValid;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCvvRepository f4558a;

    /* renamed from: b, reason: collision with root package name */
    private final SupportedSchemesRepository f4559b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final L paymentState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final at cardNumber;

    /* renamed from: e, reason: from kotlin metadata */
    private final at expiryDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final at cardScheme;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final at preferredCardScheme;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final at contactData;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final at cardMetadata;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final at cvv;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final at cardHolderName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final at isCardNumberValid;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final at isCardNumberValidForFullCardValidation;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final at isCardSchemeValid;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final at isExpiryDateValid;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final at isCvvValid;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final at isCvvRequiredScheme;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final at isCardHolderNameValid;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final at isCardValidationTriggered;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final at isAddressValid;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final at rememberMeJWTToken;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final at isValidCallbackTriggered;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final at uiPaymentErrorMessage;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final at merchantCardNotSupportedErrorMessage;

    /* renamed from: y, reason: collision with root package name */
    private final Lazy f4581y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy isReadyForTokenization;

    public PaymentFormStateManager(boolean z2, @NotNull DisplayCvvRepository displayCvvRepository, @NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull L paymentState) {
        Intrinsics.echo(displayCvvRepository, "displayCvvRepository");
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        Intrinsics.echo(paymentState, "paymentState");
        this.f4558a = displayCvvRepository;
        this.f4559b = supportedSchemesRepository;
        this.paymentState = paymentState;
        this.cardNumber = AbstractC3428A.charlie("");
        this.expiryDate = AbstractC3428A.charlie("");
        this.cardScheme = AbstractC3428A.charlie(CardScheme.UNKNOWN);
        this.preferredCardScheme = AbstractC3428A.charlie(CardScheme.CARTES_BANCAIRES);
        this.contactData = AbstractC3428A.charlie(null);
        this.cardMetadata = AbstractC3428A.charlie(null);
        this.cvv = AbstractC3428A.charlie("");
        this.cardHolderName = AbstractC3428A.charlie("");
        Boolean bool = Boolean.FALSE;
        this.isCardNumberValid = AbstractC3428A.charlie(bool);
        this.isCardNumberValidForFullCardValidation = AbstractC3428A.charlie(bool);
        this.isCardSchemeValid = AbstractC3428A.charlie(bool);
        this.isExpiryDateValid = AbstractC3428A.charlie(bool);
        this.isCvvValid = AbstractC3428A.charlie(bool);
        this.isCvvRequiredScheme = AbstractC3428A.charlie(bool);
        this.isCardHolderNameValid = AbstractC3428A.charlie(Boolean.valueOf(z2));
        this.isCardValidationTriggered = AbstractC3428A.charlie(bool);
        this.isAddressValid = AbstractC3428A.charlie(Boolean.TRUE);
        this.rememberMeJWTToken = AbstractC3428A.charlie("save_card_unchecked");
        this.isValidCallbackTriggered = AbstractC3428A.charlie(bool);
        this.uiPaymentErrorMessage = AbstractC3428A.charlie("");
        this.merchantCardNotSupportedErrorMessage = AbstractC3428A.charlie("");
        final int i4 = 0;
        this.f4581y = LazyKt.lazy(new Function0(this) { // from class: com.checkout.components.card.ui.manager.a
            public final /* synthetic */ PaymentFormStateManager purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC3439i a6;
                InterfaceC3439i c3;
                InterfaceC3439i b2;
                switch (i4) {
                    case 0:
                        a6 = PaymentFormStateManager.a(this.purple);
                        return a6;
                    case 1:
                        c3 = PaymentFormStateManager.c(this.purple);
                        return c3;
                    default:
                        b2 = PaymentFormStateManager.b(this.purple);
                        return b2;
                }
            }
        });
        final int i5 = 1;
        this.isReadyForTokenization = LazyKt.lazy(new Function0(this) { // from class: com.checkout.components.card.ui.manager.a
            public final /* synthetic */ PaymentFormStateManager purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC3439i a6;
                InterfaceC3439i c3;
                InterfaceC3439i b2;
                switch (i5) {
                    case 0:
                        a6 = PaymentFormStateManager.a(this.purple);
                        return a6;
                    case 1:
                        c3 = PaymentFormStateManager.c(this.purple);
                        return c3;
                    default:
                        b2 = PaymentFormStateManager.b(this.purple);
                        return b2;
                }
            }
        });
        final int i10 = 2;
        this.isCardFieldsValid = LazyKt.lazy(new Function0(this) { // from class: com.checkout.components.card.ui.manager.a
            public final /* synthetic */ PaymentFormStateManager purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC3439i a6;
                InterfaceC3439i c3;
                InterfaceC3439i b2;
                switch (i10) {
                    case 0:
                        a6 = PaymentFormStateManager.a(this.purple);
                        return a6;
                    case 1:
                        c3 = PaymentFormStateManager.c(this.purple);
                        return c3;
                    default:
                        b2 = PaymentFormStateManager.b(this.purple);
                        return b2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3439i a(PaymentFormStateManager paymentFormStateManager) {
        at atVar = paymentFormStateManager.isExpiryDateValid;
        at atVar2 = paymentFormStateManager.isCardHolderNameValid;
        at atVar3 = paymentFormStateManager.isCardSchemeValid;
        at atVar4 = paymentFormStateManager.isCvvValid;
        at atVar5 = paymentFormStateManager.isCvvRequiredScheme;
        return new ah(3, new InterfaceC3439i[]{atVar, atVar2, atVar3, atVar4, atVar5}, new U(paymentFormStateManager, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3439i b(PaymentFormStateManager paymentFormStateManager) {
        final InterfaceC3439i[] interfaceC3439iArr = {(InterfaceC3439i) paymentFormStateManager.f4581y.getValue(), paymentFormStateManager.isCardNumberValidForFullCardValidation};
        return new InterfaceC3439i() { // from class: com.checkout.components.card.ui.manager.PaymentFormStateManager$isCardFieldsValid_delegate$lambda$6$$inlined$combine$1

            @e(c = "com.checkout.components.card.ui.manager.PaymentFormStateManager$isCardFieldsValid_delegate$lambda$6$$inlined$combine$1$3", f = "PaymentFormStateManager.kt", l = {234}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lyf/j;", "", "it", "", "<anonymous>", "(Lyf/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 2, 0})
            /* renamed from: com.checkout.components.card.ui.manager.PaymentFormStateManager$isCardFieldsValid_delegate$lambda$6$$inlined$combine$1$3, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass3 extends i implements m {

                /* renamed from: a, reason: collision with root package name */
                int f4585a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f4586b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f4587c;

                public AnonymousClass3(c cVar) {
                    super(3, cVar);
                }

                @Override // Pd.a
                public final Object invokeSuspend(Object obj) {
                    Od.a aVar = Od.a.alpha;
                    int i4 = this.f4585a;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.f4586b;
                        Boolean[] boolArr = (Boolean[]) ((Object[]) this.f4587c);
                        int length = boolArr.length;
                        boolean z2 = false;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (!boolArr[i5].booleanValue()) {
                                    break;
                                }
                                i5++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        Boolean valueOf = Boolean.valueOf(z2);
                        this.f4586b = null;
                        this.f4587c = null;
                        this.f4585a = 1;
                        if (interfaceC3440j.emit(valueOf, this) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // Xd.m
                public final Object invoke(InterfaceC3440j interfaceC3440j, Boolean[] boolArr, c<? super Unit> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
                    anonymousClass3.f4586b = interfaceC3440j;
                    anonymousClass3.f4587c = boolArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // yf.InterfaceC3439i
            public final Object collect(InterfaceC3440j interfaceC3440j, c cVar) {
                final InterfaceC3439i[] interfaceC3439iArr2 = interfaceC3439iArr;
                Object alpha = b.alpha(cVar, new AnonymousClass3(null), new Function0<Boolean[]>() { // from class: com.checkout.components.card.ui.manager.PaymentFormStateManager$isCardFieldsValid_delegate$lambda$6$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean[] invoke() {
                        return new Boolean[interfaceC3439iArr2.length];
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Boolean[] invoke2() {
                        return new Boolean[interfaceC3439iArr2.length];
                    }
                }, interfaceC3440j, interfaceC3439iArr2);
                if (alpha == Od.a.alpha) {
                    return alpha;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3439i c(PaymentFormStateManager paymentFormStateManager) {
        InterfaceC3439i interfaceC3439i = (InterfaceC3439i) paymentFormStateManager.f4581y.getValue();
        at atVar = paymentFormStateManager.isCardNumberValid;
        final at atVar2 = paymentFormStateManager.rememberMeJWTToken;
        final InterfaceC3439i[] interfaceC3439iArr = {interfaceC3439i, atVar, new InterfaceC3439i() { // from class: com.checkout.components.card.ui.manager.PaymentFormStateManager$isRememberMeViewValid$$inlined$map$1

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.checkout.components.card.ui.manager.PaymentFormStateManager$isRememberMeViewValid$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3440j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3440j f4594a;

                @e(c = "com.checkout.components.card.ui.manager.PaymentFormStateManager$isRememberMeViewValid$$inlined$map$1$2", f = "PaymentFormStateManager.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.checkout.components.card.ui.manager.PaymentFormStateManager$isRememberMeViewValid$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends Pd.c {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f4595a;

                    /* renamed from: b, reason: collision with root package name */
                    int f4596b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f4597c;
                    Object e;

                    /* renamed from: f, reason: collision with root package name */
                    Object f4599f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f4600g;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // Pd.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4595a = obj;
                        this.f4596b |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3440j interfaceC3440j) {
                    this.f4594a = interfaceC3440j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // yf.InterfaceC3440j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i4;
                    boolean z2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i5 = anonymousClass1.f4596b;
                        if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                            anonymousClass1.f4596b = i5 - RecyclerView.UNDEFINED_DURATION;
                            Object obj2 = anonymousClass1.f4595a;
                            Od.a aVar = Od.a.alpha;
                            i4 = anonymousClass1.f4596b;
                            if (i4 == 0) {
                                if (i4 == 1) {
                                    ResultKt.alpha(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.alpha(obj2);
                                InterfaceC3440j interfaceC3440j = this.f4594a;
                                String str = (String) obj;
                                if (!Intrinsics.areEqual(str, "save_card_unchecked") && str == null) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z2);
                                anonymousClass1.f4597c = null;
                                anonymousClass1.e = null;
                                anonymousClass1.f4599f = null;
                                anonymousClass1.f4600g = null;
                                anonymousClass1.f4596b = 1;
                                if (interfaceC3440j.emit(valueOf, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f4595a;
                    Od.a aVar2 = Od.a.alpha;
                    i4 = anonymousClass1.f4596b;
                    if (i4 == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // yf.InterfaceC3439i
            public final Object collect(InterfaceC3440j interfaceC3440j, c cVar) {
                Object collect = InterfaceC3439i.this.collect(new AnonymousClass2(interfaceC3440j), cVar);
                if (collect == Od.a.alpha) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, paymentFormStateManager.isAddressValid};
        return new InterfaceC3439i() { // from class: com.checkout.components.card.ui.manager.PaymentFormStateManager$isReadyForTokenization_delegate$lambda$3$$inlined$combine$1

            @e(c = "com.checkout.components.card.ui.manager.PaymentFormStateManager$isReadyForTokenization_delegate$lambda$3$$inlined$combine$1$3", f = "PaymentFormStateManager.kt", l = {234}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lyf/j;", "", "it", "", "<anonymous>", "(Lyf/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 2, 0})
            /* renamed from: com.checkout.components.card.ui.manager.PaymentFormStateManager$isReadyForTokenization_delegate$lambda$3$$inlined$combine$1$3, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass3 extends i implements m {

                /* renamed from: a, reason: collision with root package name */
                int f4590a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f4591b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f4592c;

                public AnonymousClass3(c cVar) {
                    super(3, cVar);
                }

                @Override // Pd.a
                public final Object invokeSuspend(Object obj) {
                    Od.a aVar = Od.a.alpha;
                    int i4 = this.f4590a;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.f4591b;
                        Boolean[] boolArr = (Boolean[]) ((Object[]) this.f4592c);
                        int length = boolArr.length;
                        boolean z2 = false;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (!boolArr[i5].booleanValue()) {
                                    break;
                                }
                                i5++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        Boolean valueOf = Boolean.valueOf(z2);
                        this.f4591b = null;
                        this.f4592c = null;
                        this.f4590a = 1;
                        if (interfaceC3440j.emit(valueOf, this) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // Xd.m
                public final Object invoke(InterfaceC3440j interfaceC3440j, Boolean[] boolArr, c<? super Unit> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
                    anonymousClass3.f4591b = interfaceC3440j;
                    anonymousClass3.f4592c = boolArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // yf.InterfaceC3439i
            public final Object collect(InterfaceC3440j interfaceC3440j, c cVar) {
                final InterfaceC3439i[] interfaceC3439iArr2 = interfaceC3439iArr;
                Object alpha = b.alpha(cVar, new AnonymousClass3(null), new Function0<Boolean[]>() { // from class: com.checkout.components.card.ui.manager.PaymentFormStateManager$isReadyForTokenization_delegate$lambda$3$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean[] invoke() {
                        return new Boolean[interfaceC3439iArr2.length];
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Boolean[] invoke2() {
                        return new Boolean[interfaceC3439iArr2.length];
                    }
                }, interfaceC3440j, interfaceC3439iArr2);
                if (alpha == Od.a.alpha) {
                    return alpha;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getCardHolderName() {
        return this.cardHolderName;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getCardMetadata() {
        return this.cardMetadata;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getCardNumber() {
        return this.cardNumber;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getCardScheme() {
        return this.cardScheme;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getContactData() {
        return this.contactData;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getCvv() {
        return this.cvv;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @Nullable
    public final DisplayCvvConfiguration getDisplayCvvConfiguration() {
        return this.f4558a.item();
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getExpiryDate() {
        return this.expiryDate;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getMerchantCardNotSupportedErrorMessage() {
        return this.merchantCardNotSupportedErrorMessage;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final L getPaymentState() {
        return this.paymentState;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getPreferredCardScheme() {
        return this.preferredCardScheme;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getRememberMeJWTToken() {
        return this.rememberMeJWTToken;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final List<CardScheme> getSupportedCardSchemeList() {
        return this.f4559b.items();
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final at getUiPaymentErrorMessage() {
        return this.uiPaymentErrorMessage;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isAddressValid, reason: from getter */
    public final at getIsAddressValid() {
        return this.isAddressValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final InterfaceC3439i isCardFieldsValid() {
        return (InterfaceC3439i) this.isCardFieldsValid.getValue();
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCardHolderNameValid, reason: from getter */
    public final at getIsCardHolderNameValid() {
        return this.isCardHolderNameValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCardNumberValid, reason: from getter */
    public final at getIsCardNumberValid() {
        return this.isCardNumberValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCardNumberValidForFullCardValidation, reason: from getter */
    public final at getIsCardNumberValidForFullCardValidation() {
        return this.isCardNumberValidForFullCardValidation;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCardSchemeValid, reason: from getter */
    public final at getIsCardSchemeValid() {
        return this.isCardSchemeValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCardValidationTriggered, reason: from getter */
    public final at getIsCardValidationTriggered() {
        return this.isCardValidationTriggered;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    public final boolean isCvvAccepted(boolean isCvvValid, boolean isCvvRequiredScheme, @Nullable DisplayCvvConfiguration displayCvvConfiguration) {
        if (CommonExtensionsKt.isCvvFieldDisplayed(displayCvvConfiguration, isCvvRequiredScheme) && !isCvvValid) {
            return false;
        }
        return true;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCvvRequiredScheme, reason: from getter */
    public final at getIsCvvRequiredScheme() {
        return this.isCvvRequiredScheme;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isCvvValid, reason: from getter */
    public final at getIsCvvValid() {
        return this.isCvvValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isExpiryDateValid, reason: from getter */
    public final at getIsExpiryDateValid() {
        return this.isExpiryDateValid;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    public final boolean isPaymentInProgressOrCompleted() {
        if (!Intrinsics.areEqual(this.paymentState.getValue(), PaymentState.Completed.INSTANCE) && !Intrinsics.areEqual(this.paymentState.getValue(), PaymentState.InProgress.INSTANCE)) {
            return false;
        }
        return true;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    public final InterfaceC3439i isReadyForTokenization() {
        return (InterfaceC3439i) this.isReadyForTokenization.getValue();
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @NotNull
    /* renamed from: isValidCallbackTriggered, reason: from getter */
    public final at getIsValidCallbackTriggered() {
        return this.isValidCallbackTriggered;
    }

    @Override // com.checkout.components.card.ui.manager.PaymentStateManager
    @Nullable
    public final String rememberMeJWTTokenOrNull() {
        if (Intrinsics.areEqual(((N) this.rememberMeJWTToken).getValue(), "save_card_unchecked")) {
            return null;
        }
        return (String) ((N) this.rememberMeJWTToken).getValue();
    }

    public /* synthetic */ PaymentFormStateManager(boolean z2, DisplayCvvRepository displayCvvRepository, SupportedSchemesRepository supportedSchemesRepository, L l10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z2, displayCvvRepository, supportedSchemesRepository, l10);
    }
}
