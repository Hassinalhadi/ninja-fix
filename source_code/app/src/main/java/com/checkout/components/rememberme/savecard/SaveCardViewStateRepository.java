package com.checkout.components.rememberme.savecard;

import N4.a;
import androidx.compose.runtime.ax;
import ao.ad;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.model.CustomerInfo;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.rememberme.utils.JWTTokenEncoder;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r1.AbstractC2484c;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010*\u001a\u00020\nH\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010)J\u0011\u0010/\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "", "", "isRTL", "Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider", "Lcom/checkout/components/rememberme/utils/JWTTokenEncoder;", "jwtTokenEncoder", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "onError", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "<init>", "(ZLcom/checkout/components/rememberme/di/DefaultStyleProvider;Lcom/checkout/components/rememberme/utils/JWTTokenEncoder;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;)V", "Lcom/checkout/components/rememberme/model/CustomerInfo;", "prefilled", "initiate$rememberme_standardRelease", "(Lcom/checkout/components/rememberme/model/CustomerInfo;)V", "initiate", "", "email", "onEmailChange$rememberme_standardRelease", "(Ljava/lang/String;)V", "onEmailChange", "phoneNumber", "onPhoneNumberChange$rememberme_standardRelease", "onPhoneNumberChange", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "onCountryChange$rememberme_standardRelease", "(Lcom/checkout/components/interfaces/model/contact/Country;)V", "onCountryChange", "isChecked", "onCheckedChange$rememberme_standardRelease", "(Z)V", "onCheckedChange", "onEmailEditClick$rememberme_standardRelease", "()V", "onEmailEditClick", "onPhoneEditClick$rememberme_standardRelease", "onPhoneEditClick", "validateOrGetJWTToken$rememberme_standardRelease", "()Ljava/lang/String;", "validateOrGetJWTToken", "Lyf/L;", "Lcom/checkout/components/rememberme/savecard/SaveCardViewState;", "h", "Lyf/L;", "getState$rememberme_standardRelease", "()Lyf/L;", "state", "isSaveCardChecked$rememberme_standardRelease", "()Z", "isSaveCardChecked", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveCardViewStateRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6286a;

    /* renamed from: b, reason: collision with root package name */
    private final DefaultStyleProvider f6287b;

    /* renamed from: c, reason: collision with root package name */
    private final JWTTokenEncoder f6288c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f6289d;
    private final Logger e;

    /* renamed from: f, reason: collision with root package name */
    private final LogDetails f6290f;

    /* renamed from: g, reason: collision with root package name */
    private final at f6291g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final L state;

    public SaveCardViewStateRepository(boolean z2, @NotNull DefaultStyleProvider styleProvider, @NotNull JWTTokenEncoder jwtTokenEncoder, @Nullable Function1<? super CheckoutError, Unit> function1, @NotNull Logger logger, @NotNull LogDetails logDetails) {
        Intrinsics.echo(styleProvider, "styleProvider");
        Intrinsics.echo(jwtTokenEncoder, "jwtTokenEncoder");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        this.f6286a = z2;
        this.f6287b = styleProvider;
        this.f6288c = jwtTokenEncoder;
        this.f6289d = function1;
        this.e = logger;
        this.f6290f = logDetails;
        N charlie = AbstractC3428A.charlie(a((CustomerInfo) null));
        this.f6291g = charlie;
        this.state = new av(charlie);
    }

    private static void a(InputComponentState inputComponentState) {
        inputComponentState.getErrorState().getText().setValue("");
        inputComponentState.getErrorState().isVisible().setValue(Boolean.FALSE);
    }

    @NotNull
    /* renamed from: getState$rememberme_standardRelease, reason: from getter */
    public final L getState() {
        return this.state;
    }

    public final void initiate$rememberme_standardRelease(@Nullable CustomerInfo prefilled) {
        ((N) this.f6291g).india(a(prefilled));
    }

    public final boolean isSaveCardChecked$rememberme_standardRelease() {
        return ((SaveCardViewState) ((N) this.f6291g).getValue()).isChecked();
    }

    public final void onCheckedChange$rememberme_standardRelease(boolean isChecked) {
        N n5;
        Object value;
        at atVar = this.f6291g;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, SaveCardViewState.copy$default((SaveCardViewState) value, isChecked, null, null, null, null, null, null, null, null, null, false, false, null, 8190, null)));
    }

    public final void onCountryChange$rememberme_standardRelease(@NotNull Country country) {
        Country country2 = country;
        Intrinsics.echo(country2, "country");
        at atVar = this.f6291g;
        while (true) {
            N n5 = (N) atVar;
            Object value = n5.getValue();
            at atVar2 = atVar;
            if (n5.hotel(value, SaveCardViewState.copy$default((SaveCardViewState) value, false, null, null, null, null, null, null, null, null, null, false, false, country2, 4095, null))) {
                ((SaveCardViewState) ((N) this.f6291g).getValue()).getCountryCodeViewItem().getState().getInputFieldState().getText().setValue(Utils.buildPhoneCountryText$default(Utils.INSTANCE, country, this.f6286a, false, 4, null));
                return;
            } else {
                country2 = country;
                atVar = atVar2;
            }
        }
    }

    public final void onEmailChange$rememberme_standardRelease(@NotNull String email) {
        Intrinsics.echo(email, "email");
        InputComponentState state = ((SaveCardViewState) ((N) this.f6291g).getValue()).getEmailViewItem().getState();
        a(state);
        state.getInputFieldState().getText().setValue(email);
    }

    public final void onEmailEditClick$rememberme_standardRelease() {
        N n5;
        Object value;
        at atVar = this.f6291g;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, SaveCardViewState.copy$default((SaveCardViewState) value, false, null, null, null, null, null, null, null, null, null, false, false, null, 7167, null)));
    }

    public final void onPhoneEditClick$rememberme_standardRelease() {
        N n5;
        Object value;
        at atVar = this.f6291g;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, SaveCardViewState.copy$default((SaveCardViewState) value, false, null, null, null, null, null, null, null, null, null, false, false, null, 6143, null)));
    }

    public final void onPhoneNumberChange$rememberme_standardRelease(@NotNull String phoneNumber) {
        Intrinsics.echo(phoneNumber, "phoneNumber");
        InputComponentState state = ((SaveCardViewState) ((N) this.f6291g).getValue()).getPhoneNumberViewItem().getState();
        a(state);
        state.getInputFieldState().getText().setValue(phoneNumber);
    }

    @Nullable
    public final String validateOrGetJWTToken$rememberme_standardRelease() {
        boolean z2;
        String str;
        String str2 = (String) ((SaveCardViewState) ((N) this.f6291g).getValue()).getEmailViewItem().getState().getInputFieldState().getText().getValue();
        String str3 = (String) ((SaveCardViewState) ((N) this.f6291g).getValue()).getPhoneNumberViewItem().getState().getInputFieldState().getText().getValue();
        boolean z10 = false;
        if (str2.length() > 0 && AbstractC2484c.alpha.matcher(str2).matches()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str3.length() > 0) {
            int i4 = 0;
            while (true) {
                if (i4 < str3.length()) {
                    if (!Character.isDigit(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    z10 = true;
                    break;
                }
            }
        }
        if (z2 && z10) {
            try {
                return this.f6288c.encode(str2, str3, ((SaveCardViewState) ((N) this.f6291g).getValue()).getCountry().getDialingCode());
            } catch (Exception e) {
                String kilo = u.alpha.bravo(e.getClass()).kilo();
                if (e instanceof SerializationException) {
                    str = "JSON serialization of JWT payload";
                } else if (e instanceof IllegalArgumentException) {
                    str = "Base64 encoding of JWT payload";
                } else {
                    str = "JWT token creation";
                }
                String amber = ad.amber(kilo, " at ", str);
                CheckoutError.Request request = new CheckoutError.Request("Could not create JWT token.", CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED, ErrorExtensionsKt.toRequestErrorDetails$default(this.f6290f, null, null, null, null, 15, null));
                Function1 function1 = this.f6289d;
                if (function1 != null) {
                    function1.invoke(request);
                }
                a.alpha(this.e, request, amber, false, 4, null);
                return null;
            }
        }
        if (!z2) {
            InputComponentState state = ((SaveCardViewState) ((N) this.f6291g).getValue()).getEmailViewItem().getState();
            state.getErrorState().getText().setValue("Must be a valid email address");
            state.getErrorState().isVisible().setValue(Boolean.TRUE);
        }
        if (!z10) {
            InputComponentState state2 = ((SaveCardViewState) ((N) this.f6291g).getValue()).getPhoneNumberViewItem().getState();
            state2.getErrorState().getText().setValue("Must be a valid phone number");
            state2.getErrorState().isVisible().setValue(Boolean.TRUE);
        }
        Function1 function12 = this.f6289d;
        if (function12 != null) {
            function12.invoke(new CheckoutError.Submit("Email and/or phone number fields are invalid", CheckoutErrorCode.COMPONENT_INVALID, new CheckoutErrorDetails.Submit(this.f6290f.getMobileSessionId(), this.f6290f.getPaymentSessionId(), this.f6290f.getType())));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SaveCardViewState a(CustomerInfo customerInfo) {
        String str;
        Country phoneCountry;
        boolean z2;
        String str2;
        Utils utils = Utils.INSTANCE;
        Country phoneCountry2 = customerInfo != null ? customerInfo.getPhoneCountry() : null;
        Constants constants = Constants.INSTANCE;
        if (!CollectionsKt.bronze(constants.getSUPPORTED_COUNTRIES(), phoneCountry2)) {
            phoneCountry2 = null;
        }
        Country deviceCountry = utils.getDeviceCountry(phoneCountry2);
        String email = customerInfo != null ? customerInfo.getEmail() : null;
        if (email == null) {
            email = "";
        }
        String str3 = (email.length() <= 0 || !AbstractC2484c.alpha.matcher(email).matches()) ? null : email;
        String phoneNumber = customerInfo != null ? customerInfo.getPhoneNumber() : null;
        if (phoneNumber == null) {
            phoneNumber = "";
        }
        if (phoneNumber.length() > 0) {
            for (int i4 = 0; i4 < phoneNumber.length(); i4++) {
                if (Character.isDigit(phoneNumber.charAt(i4))) {
                }
            }
            str = phoneNumber;
            phoneCountry = customerInfo == null ? customerInfo.getPhoneCountry() : null;
            if (!CollectionsKt.bronze(constants.getSUPPORTED_COUNTRIES(), phoneCountry)) {
                phoneCountry = null;
            }
            z2 = phoneCountry == null && str != null;
            boolean z10 = str3 == null;
            TextLabelViewItem saveCardLabelViewItem = this.f6287b.saveCardLabelViewItem();
            InputComponentViewItem emailInputViewItem = this.f6287b.emailInputViewItem();
            emailInputViewItem.getState().getInputFieldState().getText().setValue(str3 != null ? "" : str3);
            a(emailInputViewItem.getState());
            InputComponentViewItem phoneNumberViewItem = this.f6287b.phoneNumberViewItem();
            ax text = phoneNumberViewItem.getState().getInputFieldState().getText();
            str2 = z2 ? str : null;
            if (str2 == null) {
                str2 = "";
            }
            text.setValue(str2);
            a(phoneNumberViewItem.getState());
            InputComponentViewItem countryCodeViewItem = this.f6287b.countryCodeViewItem();
            countryCodeViewItem.getState().getInputFieldState().getText().setValue(Utils.buildPhoneCountryText$default(utils, deviceCountry, this.f6286a, false, 4, null));
            a(countryCodeViewItem.getState());
            TextLabelViewItem prefilledEmailLabelViewItem = this.f6287b.prefilledEmailLabelViewItem();
            TextLabelViewItem prefilledEmailTextViewItem = this.f6287b.prefilledEmailTextViewItem();
            prefilledEmailTextViewItem.getState().getText().setValue(str3 != null ? str3 : "");
            TextLabelViewItem prefilledPhoneLabelViewItem = this.f6287b.prefilledPhoneLabelViewItem();
            TextLabelViewItem prefilledPhoneTextViewItem = this.f6287b.prefilledPhoneTextViewItem();
            if (z2) {
                prefilledPhoneTextViewItem.getState().getText().setValue(utils.buildPhoneCountryText(deviceCountry, this.f6286a, false) + " " + str);
            }
            return new SaveCardViewState(false, saveCardLabelViewItem, emailInputViewItem, phoneNumberViewItem, countryCodeViewItem, prefilledEmailLabelViewItem, prefilledEmailTextViewItem, prefilledPhoneLabelViewItem, prefilledPhoneTextViewItem, this.f6287b.editLabelViewItem(), z10, z2, deviceCountry);
        }
        str = null;
        if (customerInfo == null) {
        }
        if (!CollectionsKt.bronze(constants.getSUPPORTED_COUNTRIES(), phoneCountry)) {
        }
        if (phoneCountry == null) {
        }
        if (str3 == null) {
        }
        TextLabelViewItem saveCardLabelViewItem2 = this.f6287b.saveCardLabelViewItem();
        InputComponentViewItem emailInputViewItem2 = this.f6287b.emailInputViewItem();
        emailInputViewItem2.getState().getInputFieldState().getText().setValue(str3 != null ? "" : str3);
        a(emailInputViewItem2.getState());
        InputComponentViewItem phoneNumberViewItem2 = this.f6287b.phoneNumberViewItem();
        ax text2 = phoneNumberViewItem2.getState().getInputFieldState().getText();
        if (z2) {
        }
        if (str2 == null) {
        }
        text2.setValue(str2);
        a(phoneNumberViewItem2.getState());
        InputComponentViewItem countryCodeViewItem2 = this.f6287b.countryCodeViewItem();
        countryCodeViewItem2.getState().getInputFieldState().getText().setValue(Utils.buildPhoneCountryText$default(utils, deviceCountry, this.f6286a, false, 4, null));
        a(countryCodeViewItem2.getState());
        TextLabelViewItem prefilledEmailLabelViewItem2 = this.f6287b.prefilledEmailLabelViewItem();
        TextLabelViewItem prefilledEmailTextViewItem2 = this.f6287b.prefilledEmailTextViewItem();
        prefilledEmailTextViewItem2.getState().getText().setValue(str3 != null ? str3 : "");
        TextLabelViewItem prefilledPhoneLabelViewItem2 = this.f6287b.prefilledPhoneLabelViewItem();
        TextLabelViewItem prefilledPhoneTextViewItem2 = this.f6287b.prefilledPhoneTextViewItem();
        if (z2) {
        }
        return new SaveCardViewState(false, saveCardLabelViewItem2, emailInputViewItem2, phoneNumberViewItem2, countryCodeViewItem2, prefilledEmailLabelViewItem2, prefilledEmailTextViewItem2, prefilledPhoneLabelViewItem2, prefilledPhoneTextViewItem2, this.f6287b.editLabelViewItem(), z10, z2, deviceCountry);
    }
}
