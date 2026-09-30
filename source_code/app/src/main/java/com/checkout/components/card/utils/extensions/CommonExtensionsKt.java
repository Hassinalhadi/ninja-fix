package com.checkout.components.card.utils.extensions;

import com.checkout.components.card.operations.model.ExpiryDate;
import com.checkout.components.card.operations.tokenisation.network.model.ConsumerWallet;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.model.contact.Name;
import com.checkout.components.interfaces.model.contact.Phone;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.CardScheme;
import fe.C1713e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.N;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0001H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\u0016\u0010\u001b\u001a\u00020\t*\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0000\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0007H\u0000¨\u0006\u001f"}, d2 = {"baseUrl", "", "Lcom/checkout/components/interfaces/Environment;", "cagBaseUrl", "cardMetaDataBaseUrl", "toTokenRequest", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "setAsDefaultPaymentMethod", "", "(Lcom/checkout/components/card/ui/manager/PaymentStateManager;Ljava/lang/Boolean;)Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "toBillingAddressNetworkEntity", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "Lcom/checkout/components/interfaces/model/contact/Address;", "toPhoneNetworkEntity", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "Lcom/checkout/components/interfaces/model/contact/Phone;", "toExpiryDate", "Lcom/checkout/components/card/operations/model/ExpiryDate;", "prepareCardSchemeNotSupportedMessage", "Lcom/checkout/components/ui/model/CardScheme;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "isFieldInvalid", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "fieldName", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "isCvvFieldDisplayed", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "isCvvRequiredScheme", "hasInvalidCardFieldsForComponentSubmit", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonExtensionsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.SANDBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AddressField.Companion.Name.values().length];
            try {
                iArr2[AddressField.Companion.Name.AddressLine1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AddressField.Companion.Name.AddressLine2.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AddressField.Companion.Name.City.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AddressField.Companion.Name.State.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AddressField.Companion.Name.Zip.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AddressField.Companion.Name.Country.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AddressField.Companion.Name.Email.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AddressField.Companion.Name.FirstName.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AddressField.Companion.Name.LastName.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AddressField.Companion.Name.Phone.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final String baseUrl(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return "https://api.checkout.com/tokens";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://api.sandbox.checkout.com/tokens";
    }

    @NotNull
    public static final String cagBaseUrl(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return "https://card-acquisition-gateway.checkout.com/tokens";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://card-acquisition-gateway.sandbox.checkout.com/tokens";
    }

    @NotNull
    public static final String cardMetaDataBaseUrl(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return "https://card-acquisition-gateway.checkout.com/card-metadata";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://card-acquisition-gateway.sandbox.checkout.com/card-metadata";
    }

    public static final boolean hasInvalidCardFieldsForComponentSubmit(@NotNull PaymentStateManager paymentStateManager) {
        Intrinsics.echo(paymentStateManager, "<this>");
        if (((Boolean) ((N) paymentStateManager.getIsCardNumberValid()).getValue()).booleanValue() && ((Boolean) ((N) paymentStateManager.getIsExpiryDateValid()).getValue()).booleanValue() && paymentStateManager.isCvvAccepted(((Boolean) ((N) paymentStateManager.getIsCvvValid()).getValue()).booleanValue(), ((Boolean) ((N) paymentStateManager.getIsCvvRequiredScheme()).getValue()).booleanValue(), paymentStateManager.getDisplayCvvConfiguration()) && ((Boolean) ((N) paymentStateManager.getIsCardHolderNameValid()).getValue()).booleanValue() && ((Boolean) ((N) paymentStateManager.getIsCardSchemeValid()).getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean isCvvFieldDisplayed(@Nullable DisplayCvvConfiguration displayCvvConfiguration, boolean z2) {
        if (displayCvvConfiguration == null) {
            displayCvvConfiguration = DisplayCvvConfiguration.SHOW;
        }
        if (displayCvvConfiguration != DisplayCvvConfiguration.SHOW && !z2) {
            return false;
        }
        return true;
    }

    public static final boolean isFieldInvalid(@NotNull ContactData contactData, @NotNull AddressField.Companion.Name fieldName) {
        Intrinsics.echo(contactData, "<this>");
        Intrinsics.echo(fieldName, "fieldName");
        String str = null;
        switch (WhenMappings.$EnumSwitchMapping$1[fieldName.ordinal()]) {
            case 1:
                String addressLine1 = contactData.getAddress().getAddressLine1();
                if (addressLine1 == null || StringsKt.gray(addressLine1)) {
                    return true;
                }
                return false;
            case 2:
                String addressLine2 = contactData.getAddress().getAddressLine2();
                if (addressLine2 == null || StringsKt.gray(addressLine2)) {
                    return true;
                }
                return false;
            case 3:
                String city = contactData.getAddress().getCity();
                if (city == null || StringsKt.gray(city)) {
                    return true;
                }
                return false;
            case 4:
                String state = contactData.getAddress().getState();
                if (state == null || StringsKt.gray(state)) {
                    return true;
                }
                return false;
            case 5:
                String zip = contactData.getAddress().getZip();
                if (zip == null || StringsKt.gray(zip)) {
                    return true;
                }
                return false;
            case 6:
                return false;
            case 7:
                String email = contactData.getEmail();
                if (email == null || StringsKt.gray(email)) {
                    return true;
                }
                return false;
            case 8:
                Name name = contactData.getName();
                if (name != null) {
                    str = name.getFirstName();
                }
                if (str == null || StringsKt.gray(str)) {
                    return true;
                }
                return false;
            case 9:
                Name name2 = contactData.getName();
                if (name2 != null) {
                    str = name2.getLastName();
                }
                if (str == null || StringsKt.gray(str)) {
                    return true;
                }
                return false;
            case 10:
                Phone phone = contactData.getPhone();
                if (phone != null) {
                    str = phone.getNumber();
                }
                if (str == null || StringsKt.gray(str)) {
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final String prepareCardSchemeNotSupportedMessage(@NotNull CardScheme cardScheme, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(cardScheme, "<this>");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        if (cardScheme != CardScheme.UNKNOWN) {
            return resourceProvider.getString(R.string.cko_card_number_not_supported, cardScheme.name());
        }
        return resourceProvider.getString(R.string.cko_card_number_not_supported, resourceProvider.getString(com.checkout.components.card.R.string.cko_card));
    }

    @NotNull
    public static final BillingAddressNetworkEntity toBillingAddressNetworkEntity(@NotNull Address address) {
        Intrinsics.echo(address, "<this>");
        return new BillingAddressNetworkEntity(address.getAddressLine1(), address.getAddressLine2(), address.getCity(), address.getState(), address.getZip(), address.getCountry().getIso3166Alpha2());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fe.g, fe.e] */
    @NotNull
    public static final ExpiryDate toExpiryDate(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        if (length == 3) {
            return new ExpiryDate(Integer.parseInt(String.valueOf(str.charAt(0))), Integer.parseInt(StringsKt.peach(new C1713e(1, 2, 1), str)) + 2000);
        }
        if (length == 4) {
            return new ExpiryDate(Integer.parseInt(StringsKt.peach(new C1713e(0, 1, 1), str)), Integer.parseInt(StringsKt.peach(new C1713e(2, 3, 1), str)) + 2000);
        }
        return new ExpiryDate(0, 0);
    }

    @NotNull
    public static final PhoneNetworkEntity toPhoneNetworkEntity(@NotNull Phone phone) {
        Intrinsics.echo(phone, "<this>");
        return new PhoneNetworkEntity(phone.getCountry().getDialingCode(), phone.getNumber());
    }

    @NotNull
    public static final TokenRequest toTokenRequest(@NotNull PaymentStateManager paymentStateManager, @Nullable Boolean bool) {
        BillingAddressNetworkEntity billingAddressNetworkEntity;
        PhoneNetworkEntity phoneNetworkEntity;
        ConsumerWallet consumerWallet;
        Phone phone;
        Address address;
        Intrinsics.echo(paymentStateManager, "<this>");
        ExpiryDate expiryDate = toExpiryDate((String) ((N) paymentStateManager.getExpiryDate()).getValue());
        int month = expiryDate.getMonth();
        int year = expiryDate.getYear();
        String str = (String) ((N) paymentStateManager.getCardNumber()).getValue();
        String str2 = (String) ((N) paymentStateManager.getCardHolderName()).getValue();
        String str3 = (String) ((N) paymentStateManager.getCom.checkout.components.rememberme.utils.Constants.CVV_TYPE java.lang.String()).getValue();
        ContactData contactData = (ContactData) ((N) paymentStateManager.getContactData()).getValue();
        if (contactData != null && (address = contactData.getAddress()) != null) {
            billingAddressNetworkEntity = toBillingAddressNetworkEntity(address);
        } else {
            billingAddressNetworkEntity = null;
        }
        ContactData contactData2 = (ContactData) ((N) paymentStateManager.getContactData()).getValue();
        if (contactData2 != null && (phone = contactData2.getPhone()) != null) {
            phoneNetworkEntity = new PhoneNetworkEntity(phone.getCountry().getDialingCode(), phone.getNumber());
        } else {
            phoneNetworkEntity = null;
        }
        if (bool != null) {
            consumerWallet = new ConsumerWallet(bool.booleanValue(), null, 2, null);
        } else {
            consumerWallet = null;
        }
        return new TokenRequest("card", str, month, year, str2, str3, billingAddressNetworkEntity, phoneNetworkEntity, consumerWallet);
    }

    public static /* synthetic */ TokenRequest toTokenRequest$default(PaymentStateManager paymentStateManager, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = null;
        }
        return toTokenRequest(paymentStateManager, bool);
    }
}
