package com.checkout.components.core.utils.extension;

import D0.z;
import F4.h;
import Q0.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import as.b;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.network.model.response.DeclineReason;
import com.checkout.components.core.network.model.response.ResultWrapper;
import com.checkout.components.core.utils.constants.CoreConstants;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.Phone;
import com.checkout.components.ui.R;
import com.checkout.risk.RiskEnvironment;
import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b*\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010 \u001a\u00020\u001f*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010!\u001a1\u0010%\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00002\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\"H\u0000¢\u0006\u0004\b%\u0010&\u001a1\u0010)\u001a\u00020\b*\u00020'2\u0006\u0010\u0011\u001a\u00020\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010-\u001a\u00020,*\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0015\u00100\u001a\u0004\u0018\u00010/*\u00020\bH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u000202*\u00020\u0007H\u0000¢\u0006\u0004\b3\u00104\u001a5\u0010<\u001a\u00020;*\u0004\u0018\u0001052\u0006\u00107\u001a\u0002062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Landroid/content/Context;", "Landroid/app/Activity;", "findActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "", "isCustomTabAvailable", "(Landroid/content/Context;)Z", "Lcom/checkout/components/interfaces/Environment;", "", "baseUrl", "(Lcom/checkout/components/interfaces/Environment;)Ljava/lang/String;", "Lcom/checkout/components/interfaces/model/ComponentName;", "", "getPaymentMethodIcon", "(Lcom/checkout/components/interfaces/model/ComponentName;)I", "shouldTintPaymentMethodIcon", "(Lcom/checkout/components/interfaces/model/ComponentName;)Z", "context", "getPaymentMethodSubtitle", "(Lcom/checkout/components/interfaces/model/ComponentName;Landroid/content/Context;)Ljava/lang/String;", "Lcom/checkout/components/core/network/model/response/ResultWrapper$Error;", "toStackTraceString", "(Lcom/checkout/components/core/network/model/response/ResultWrapper$Error;)Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "toLogLine", "(Ljava/lang/StackTraceElement;)Ljava/lang/String;", "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "code", Constants.KEY_MESSAGE, "mobileSessionId", "paymentSessionId", "", "validateConfigurationField", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "translation", "toTranslatedName", "(Lcom/checkout/components/interfaces/model/ComponentName;Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;", "Lcom/checkout/components/core/network/model/response/DeclineReason;", "translations", "getPaymentDeclinedMessage", "(Lcom/checkout/components/core/network/model/response/DeclineReason;Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;", "Lcom/checkout/components/interfaces/localisation/Locale;", "LQ0/n;", "getLayoutDirection", "(Lcom/checkout/components/interfaces/localisation/Locale;)LQ0/n;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "toKnownPaymentMethodName", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/risk/RiskEnvironment;", "toRiskSDKEnvironment", "(Lcom/checkout/components/interfaces/Environment;)Lcom/checkout/risk/RiskEnvironment;", "Lcom/checkout/components/interfaces/component/ComponentOption;", "Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;", "forwardingEmailsDisabledGuard", "email", "Lcom/checkout/components/interfaces/model/Phone;", "phone", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "createInheritedRememberMeConfiguration", "(Lcom/checkout/components/interfaces/component/ComponentOption;Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;Ljava/lang/String;Lcom/checkout/components/interfaces/model/Phone;)Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {

    /* renamed from: a */
    private static final Map f5083a;

    /* renamed from: b */
    private static final Lazy f5084b;

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
            int[] iArr2 = new int[DeclineReason.values().length];
            try {
                iArr2[DeclineReason.NotEnoughFunds.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DeclineReason.InvalidPaymentSessionData.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DeclineReason.InvalidCustomerData.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DeclineReason.MerchantMisconfiguration.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DeclineReason.TryAgain.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        Pair pair = new Pair(companion.getCard(), Integer.valueOf(R.drawable.cko_ic_card));
        Pair pair2 = new Pair(companion.getGooglePay(), Integer.valueOf(com.checkout.components.core.R.drawable.cko_ic_google_pay));
        CoreConstants coreConstants = CoreConstants.INSTANCE;
        f5083a = y.sierra(pair, pair2, new Pair(coreConstants.getTabbyPaymentMethod(), Integer.valueOf(R.drawable.cko_ic_tabby)), new Pair(coreConstants.getTamaraPaymentMethod(), Integer.valueOf(R.drawable.cko_ic_tamara)));
        f5084b = LazyKt.lazy(new h(6));
    }

    public static final CharSequence a(StackTraceElement element) {
        Intrinsics.echo(element, "element");
        return toLogLine(element);
    }

    public static /* synthetic */ CharSequence alpha(StackTraceElement stackTraceElement) {
        return a(stackTraceElement);
    }

    @NotNull
    public static final String baseUrl(@NotNull Environment environment) {
        String str;
        Intrinsics.echo(environment, "<this>");
        if (environment == Environment.SANDBOX && (str = ApiBaseUrlOverrideProvider.get()) != null) {
            return str;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return "https://devices.api.checkout.com/";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://devices.api.sandbox.checkout.com/";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RememberMeConfiguration createInheritedRememberMeConfiguration(@Nullable ComponentOption componentOption, @NotNull ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard, @Nullable String str, @Nullable Phone phone) {
        CardConfiguration cardConfiguration;
        RememberMeConfiguration rememberMeConfiguration;
        List<CardSchemeName> list;
        List<CardSchemeName> acceptedCardSchemes;
        List<CardTypeName> list2;
        List<CardTypeName> acceptedCardTypes;
        String str2;
        Phone phone2;
        RememberMeConfiguration.Data data;
        RememberMeConfiguration rememberMeConfiguration2;
        RememberMeConfiguration.Data data2;
        Intrinsics.echo(forwardingEmailsDisabledGuard, "forwardingEmailsDisabledGuard");
        RememberMeConfiguration.Data data3 = null;
        if (componentOption != null) {
            cardConfiguration = componentOption.getCardConfiguration();
        } else {
            cardConfiguration = null;
        }
        if (componentOption != null) {
            rememberMeConfiguration = componentOption.getRememberMeConfiguration();
        } else {
            rememberMeConfiguration = null;
        }
        if (rememberMeConfiguration == null || (acceptedCardSchemes = rememberMeConfiguration.getAcceptedCardSchemes()) == null) {
            if (cardConfiguration != null) {
                acceptedCardSchemes = cardConfiguration.getAcceptedCardSchemes();
            } else {
                list = null;
                if (rememberMeConfiguration != null || (acceptedCardTypes = rememberMeConfiguration.getAcceptedCardTypes()) == null) {
                    if (cardConfiguration == null) {
                        acceptedCardTypes = cardConfiguration.getAcceptedCardTypes();
                    } else {
                        list2 = null;
                        if (forwardingEmailsDisabledGuard.getF4799a()) {
                            str2 = str;
                        } else {
                            str2 = null;
                        }
                        if (forwardingEmailsDisabledGuard.getF4799a()) {
                            phone2 = phone;
                        } else {
                            phone2 = null;
                        }
                        if (rememberMeConfiguration == null && (data2 = rememberMeConfiguration.getData()) != null) {
                            data = data2;
                        } else {
                            if (str2 == null || phone2 != null) {
                                data3 = new RememberMeConfiguration.Data(str2, phone2);
                            }
                            data = data3;
                        }
                        if (rememberMeConfiguration != null) {
                            rememberMeConfiguration2 = new RememberMeConfiguration(null, null, null, null, 15, null);
                        } else {
                            rememberMeConfiguration2 = rememberMeConfiguration;
                        }
                        return RememberMeConfiguration.copy$default(rememberMeConfiguration2, data, null, list, list2, 2, null);
                    }
                }
                list2 = acceptedCardTypes;
                if (forwardingEmailsDisabledGuard.getF4799a()) {
                }
                if (forwardingEmailsDisabledGuard.getF4799a()) {
                }
                if (rememberMeConfiguration == null) {
                }
                if (str2 == null) {
                }
                data3 = new RememberMeConfiguration.Data(str2, phone2);
                data = data3;
                if (rememberMeConfiguration != null) {
                }
                return RememberMeConfiguration.copy$default(rememberMeConfiguration2, data, null, list, list2, 2, null);
            }
        }
        list = acceptedCardSchemes;
        if (rememberMeConfiguration != null) {
        }
        if (cardConfiguration == null) {
        }
    }

    public static /* synthetic */ RememberMeConfiguration createInheritedRememberMeConfiguration$default(ComponentOption componentOption, ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard, String str, Phone phone, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            phone = null;
        }
        return createInheritedRememberMeConfiguration(componentOption, forwardingEmailsDisabledGuard, str, phone);
    }

    @Nullable
    public static final Activity findActivity(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.delta(context, "getBaseContext(...)");
        }
        return null;
    }

    @NotNull
    public static final n getLayoutDirection(@NotNull Locale locale) {
        Intrinsics.echo(locale, "<this>");
        if (Intrinsics.areEqual(locale, Locale.Ar.INSTANCE)) {
            return n.purple;
        }
        return n.alpha;
    }

    @NotNull
    public static final String getPaymentDeclinedMessage(@NotNull DeclineReason declineReason, @NotNull Context context, @Nullable Map<ComponentTranslationKey, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.echo(declineReason, "<this>");
        Intrinsics.echo(context, "context");
        int i4 = WhenMappings.$EnumSwitchMapping$1[declineReason.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            if (map != null && (str5 = map.get(ComponentTranslationKey.PaymentDeclinedTryAgain)) != null) {
                                return str5;
                            }
                            String string = context.getString(com.checkout.components.core.R.string.cko_payment_declined_try_again);
                            Intrinsics.delta(string, "getString(...)");
                            return string;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (map != null && (str4 = map.get(ComponentTranslationKey.PaymentDeclinedMerchantMisconfiguration)) != null) {
                        return str4;
                    }
                    String string2 = context.getString(com.checkout.components.core.R.string.cko_payment_declined_merchant_misconfiguration);
                    Intrinsics.delta(string2, "getString(...)");
                    return string2;
                }
                if (map != null && (str3 = map.get(ComponentTranslationKey.PaymentDeclinedInvalidCustomerData)) != null) {
                    return str3;
                }
                String string3 = context.getString(com.checkout.components.core.R.string.cko_payment_declined_invalid_customer_data);
                Intrinsics.delta(string3, "getString(...)");
                return string3;
            }
            if (map != null && (str2 = map.get(ComponentTranslationKey.PaymentDeclinedInvalidPaymentSessionData)) != null) {
                return str2;
            }
            String string4 = context.getString(com.checkout.components.core.R.string.cko_payment_declined_invalid_payment_session_data);
            Intrinsics.delta(string4, "getString(...)");
            return string4;
        }
        if (map != null && (str = map.get(ComponentTranslationKey.PaymentDeclinedNotEnoughFunds)) != null) {
            return str;
        }
        String string5 = context.getString(com.checkout.components.core.R.string.cko_payment_declined_not_enough_funds);
        Intrinsics.delta(string5, "getString(...)");
        return string5;
    }

    public static final int getPaymentMethodIcon(@NotNull ComponentName componentName) {
        Intrinsics.echo(componentName, "<this>");
        Integer num = (Integer) f5083a.get(componentName);
        if (num != null) {
            return num.intValue();
        }
        return R.drawable.cko_ic_card;
    }

    @Nullable
    public static final String getPaymentMethodSubtitle(@NotNull ComponentName componentName, @NotNull Context context) {
        Intrinsics.echo(componentName, "<this>");
        Intrinsics.echo(context, "context");
        if (Intrinsics.areEqual(componentName, CoreConstants.INSTANCE.getTamaraPaymentMethod())) {
            return context.getString(com.checkout.components.core.R.string.cko_tamara_split_payments);
        }
        return null;
    }

    public static final boolean isCustomTabAvailable(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        try {
            if (findActivity(context) != null) {
                if (b.alpha(context, CollectionsKt.emptyList()) != null) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean shouldTintPaymentMethodIcon(@NotNull ComponentName componentName) {
        Intrinsics.echo(componentName, "<this>");
        if (!Intrinsics.areEqual(componentName, PaymentMethodName.INSTANCE.getGooglePay())) {
            CoreConstants coreConstants = CoreConstants.INSTANCE;
            if (!Intrinsics.areEqual(componentName, coreConstants.getTabbyPaymentMethod()) && !Intrinsics.areEqual(componentName, coreConstants.getTamaraPaymentMethod())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Nullable
    public static final PaymentMethodName toKnownPaymentMethodName(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        return (PaymentMethodName) ((Map) f5084b.getValue()).get(str);
    }

    @NotNull
    public static final String toLogLine(@NotNull StackTraceElement stackTraceElement) {
        String fileName;
        Intrinsics.echo(stackTraceElement, "<this>");
        if (stackTraceElement.getLineNumber() < 0 && (fileName = stackTraceElement.getFileName()) != null && !StringsKt.gray(fileName)) {
            return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + " - " + stackTraceElement.getFileName();
        }
        String stackTraceElement2 = stackTraceElement.toString();
        Intrinsics.checkNotNull(stackTraceElement2);
        return stackTraceElement2;
    }

    @NotNull
    public static final RiskEnvironment toRiskSDKEnvironment(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return RiskEnvironment.PRODUCTION;
            }
            throw new NoWhenBranchMatchedException();
        }
        return RiskEnvironment.SANDBOX;
    }

    @Nullable
    public static final String toStackTraceString(@NotNull ResultWrapper.Error error) {
        List<StackTraceElement> list;
        Intrinsics.echo(error, "<this>");
        List<StackTraceElement> stacktrace = error.getStacktrace();
        if (stacktrace != null) {
            if (!stacktrace.isEmpty()) {
                list = stacktrace;
            } else {
                list = null;
            }
            if (list != null) {
                return CollectionsKt.maroon(list, "\n", null, null, new z(26), 30);
            }
        }
        return null;
    }

    @NotNull
    public static final String toTranslatedName(@NotNull ComponentName componentName, @NotNull Context context, @Nullable Map<ComponentTranslationKey, String> map) {
        String str;
        Intrinsics.echo(componentName, "<this>");
        Intrinsics.echo(context, "context");
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(componentName, companion.getCard())) {
            if (map != null && (str = map.get(ComponentTranslationKey.Card)) != null) {
                return str;
            }
            String string = context.getString(com.checkout.components.core.R.string.cko_card);
            Intrinsics.delta(string, "getString(...)");
            return string;
        }
        if (Intrinsics.areEqual(componentName, companion.getGooglePay())) {
            String string2 = context.getString(com.checkout.components.core.R.string.cko_google_pay);
            Intrinsics.delta(string2, "getString(...)");
            return string2;
        }
        CoreConstants coreConstants = CoreConstants.INSTANCE;
        if (Intrinsics.areEqual(componentName, coreConstants.getTamaraPaymentMethod())) {
            String string3 = context.getString(com.checkout.components.core.R.string.cko_tamara);
            Intrinsics.delta(string3, "getString(...)");
            return string3;
        }
        if (Intrinsics.areEqual(componentName, coreConstants.getTabbyPaymentMethod())) {
            String string4 = context.getString(com.checkout.components.core.R.string.cko_tabby);
            Intrinsics.delta(string4, "getString(...)");
            return string4;
        }
        String value = componentName.getValue();
        if (value.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String valueOf = String.valueOf(value.charAt(0));
            Intrinsics.charlie(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.delta(upperCase, "toUpperCase(...)");
            sb2.append((Object) upperCase);
            String substring = value.substring(1);
            Intrinsics.delta(substring, "substring(...)");
            sb2.append(substring);
            return sb2.toString();
        }
        return value;
    }

    public static final void validateConfigurationField(@NotNull String str, @NotNull CheckoutErrorCode code, @NotNull String message, @NotNull String mobileSessionId, @NotNull String paymentSessionId) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(code, "code");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        if (!StringsKt.gray(str)) {
        } else {
            throw new CheckoutError.Integration(message, code, new CheckoutErrorDetails.Integration(mobileSessionId, paymentSessionId, null));
        }
    }

    public static final Map a() {
        int collectionSizeOrDefault;
        List<PaymentMethodName> entries = PaymentMethodName.INSTANCE.getEntries();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Object obj : entries) {
            linkedHashMap.put(((PaymentMethodName) obj).getValue(), obj);
        }
        return linkedHashMap;
    }
}
