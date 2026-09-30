package com.checkout.components.card.ui.manager;

import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.CardScheme;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.InterfaceC3439i;
import yf.L;
import yf.at;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 @2\u00020\u0001:\u0001@J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0010R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0010R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0010R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0010R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0010R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0010R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006AÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "", "", "isPaymentInProgressOrCompleted", "()Z", "", "rememberMeJWTTokenOrNull", "()Ljava/lang/String;", "isCvvValid", "isCvvRequiredScheme", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "displayCvvConfiguration", "isCvvAccepted", "(ZZLcom/checkout/components/interfaces/model/DisplayCvvConfiguration;)Z", "Lyf/at;", "getCardNumber", "()Lyf/at;", "cardNumber", "getExpiryDate", "expiryDate", "getCvv", Constants.CVV_TYPE, "getCardHolderName", "cardHolderName", "", "Lcom/checkout/components/ui/model/CardScheme;", "getSupportedCardSchemeList", "()Ljava/util/List;", "supportedCardSchemeList", "getDisplayCvvConfiguration", "()Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "getCardScheme", "cardScheme", "getPreferredCardScheme", "preferredCardScheme", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "getContactData", "contactData", "Lcom/checkout/components/interfaces/model/CardMetadata;", "getCardMetadata", "cardMetadata", "isCardNumberValidForFullCardValidation", "Lyf/i;", "isCardFieldsValid", "()Lyf/i;", "isCardNumberValid", "isExpiryDateValid", "isCardHolderNameValid", "isCardValidationTriggered", "isCardSchemeValid", "isAddressValid", "getRememberMeJWTToken", "rememberMeJWTToken", "isValidCallbackTriggered", "getUiPaymentErrorMessage", "uiPaymentErrorMessage", "getMerchantCardNotSupportedErrorMessage", "merchantCardNotSupportedErrorMessage", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "getPaymentState", "()Lyf/L;", "paymentState", "isReadyForTokenization", "Companion", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentStateManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f4601a;

    @NotNull
    public static final String SAVE_CARD_UNCHECKED = "save_card_unchecked";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/card/ui/manager/PaymentStateManager$Companion;", "", "", "SAVE_CARD_UNCHECKED", "Ljava/lang/String;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        @NotNull
        public static final String SAVE_CARD_UNCHECKED = "save_card_unchecked";

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4601a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    at getCardHolderName();

    @NotNull
    at getCardMetadata();

    @NotNull
    at getCardNumber();

    @NotNull
    at getCardScheme();

    @NotNull
    at getContactData();

    @NotNull
    at getCvv();

    @Nullable
    DisplayCvvConfiguration getDisplayCvvConfiguration();

    @NotNull
    at getExpiryDate();

    @NotNull
    at getMerchantCardNotSupportedErrorMessage();

    @NotNull
    L getPaymentState();

    @NotNull
    at getPreferredCardScheme();

    @NotNull
    at getRememberMeJWTToken();

    @NotNull
    List<CardScheme> getSupportedCardSchemeList();

    @NotNull
    at getUiPaymentErrorMessage();

    @NotNull
    at isAddressValid();

    @NotNull
    InterfaceC3439i isCardFieldsValid();

    @NotNull
    at isCardHolderNameValid();

    @NotNull
    at isCardNumberValid();

    @NotNull
    at isCardNumberValidForFullCardValidation();

    @NotNull
    at isCardSchemeValid();

    @NotNull
    at isCardValidationTriggered();

    boolean isCvvAccepted(boolean isCvvValid, boolean isCvvRequiredScheme, @Nullable DisplayCvvConfiguration displayCvvConfiguration);

    @NotNull
    at isCvvRequiredScheme();

    @NotNull
    at isCvvValid();

    @NotNull
    at isExpiryDateValid();

    boolean isPaymentInProgressOrCompleted();

    @NotNull
    InterfaceC3439i isReadyForTokenization();

    @NotNull
    at isValidCallbackTriggered();

    @Nullable
    String rememberMeJWTTokenOrNull();
}
