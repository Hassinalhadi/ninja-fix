package com.checkout.components.core.common.components;

import N4.a;
import com.checkout.address.AddressComponent;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.api.StandaloneComponent;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.ComponentConfig;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.StandaloneComponentName;
import com.checkout.components.interfaces.utils.ExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\r\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0013J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/checkout/components/core/common/components/StandaloneCheckoutComponents;", "Lcom/checkout/components/interfaces/api/CheckoutComponents;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "configuration", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;)V", "Lcom/checkout/components/interfaces/model/ComponentName$Flow;", "componentName", "Lcom/checkout/components/interfaces/component/ComponentOption;", "specificOptions", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "create", "(Lcom/checkout/components/interfaces/model/ComponentName$Flow;Lcom/checkout/components/interfaces/component/ComponentOption;)Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "(Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/interfaces/component/ComponentOption;)Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "Lcom/checkout/components/interfaces/api/StandaloneComponent;", "(Lcom/checkout/components/interfaces/model/StandaloneComponentName;)Lcom/checkout/components/interfaces/api/StandaloneComponent;", "name", "Lcom/checkout/components/interfaces/model/ComponentConfig;", "createComponentConfig$core_standardRelease", "(Lcom/checkout/components/interfaces/model/StandaloneComponentName;)Lcom/checkout/components/interfaces/model/ComponentConfig;", "createComponentConfig", "", "resultCode", "", "paymentData", "", "handleActivityResult", "(ILjava/lang/String;)Ljava/lang/Void;", "Lcom/checkout/components/interfaces/localisation/Locale;", "c", "Lcom/checkout/components/interfaces/localisation/Locale;", "getComponentLocale", "()Lcom/checkout/components/interfaces/localisation/Locale;", "componentLocale", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandaloneCheckoutComponents implements CheckoutComponents {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Logger f4720a;

    /* renamed from: b, reason: collision with root package name */
    private final CheckoutComponentConfiguration f4721b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Locale componentLocale;

    public StandaloneCheckoutComponents(@NotNull Logger logger, @NotNull CheckoutComponentConfiguration configuration) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(configuration, "configuration");
        this.f4720a = logger;
        this.f4721b = configuration;
        Locale locale = configuration.getLocale();
        this.componentLocale = locale == null ? Locale.En.INSTANCE : locale;
    }

    private final CheckoutError.Integration a(ComponentName componentName) {
        CheckoutError.Integration integration = new CheckoutError.Integration(CommonErrorMessages.ERROR_MESSAGE_PAYMENT_SESSION_NULL, CheckoutErrorCode.CONFIGURATION_INVALID, new CheckoutErrorDetails.Integration(this.f4720a.getF5107b(), "", componentName));
        a.alpha(this.f4720a, integration, null, false, 6, null);
        return integration;
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final PaymentMethodComponent create(@NotNull ComponentName.Flow componentName, @Nullable ComponentOption specificOptions) {
        Intrinsics.echo(componentName, "componentName");
        throw a(componentName);
    }

    @Nullable
    public final ComponentConfig createComponentConfig$core_standardRelease(@NotNull StandaloneComponentName name) {
        Map<ComponentTranslationKey, String> map;
        Intrinsics.echo(name, "name");
        if (name instanceof ComponentName.Address) {
            ComponentName.Address address = (ComponentName.Address) name;
            java.util.Locale mapToLocale = ExtensionsKt.mapToLocale(this.componentLocale);
            Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4721b.getTranslations();
            if (translations != null) {
                map = translations.get(this.componentLocale);
            } else {
                map = null;
            }
            return new AddressComponentConfig(address, mapToLocale, map, this.f4721b.getAppearance(), true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final Locale getComponentLocale() {
        return this.componentLocale;
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    /* renamed from: handleActivityResult, reason: collision with other method in class */
    public final void mo83handleActivityResult(int i4, String paymentData) {
        Intrinsics.echo(paymentData, "paymentData");
        throw a(null);
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final PaymentMethodComponent create(@NotNull PaymentMethodName componentName, @Nullable ComponentOption specificOptions) {
        Intrinsics.echo(componentName, "componentName");
        throw a(componentName);
    }

    @Override // com.checkout.components.interfaces.api.StandaloneComponentFactory
    @NotNull
    public final StandaloneComponent create(@NotNull StandaloneComponentName componentName) {
        Intrinsics.echo(componentName, "componentName");
        if (!(componentName instanceof ComponentName.Address)) {
            throw new NoWhenBranchMatchedException();
        }
        ComponentConfig createComponentConfig$core_standardRelease = createComponentConfig$core_standardRelease(componentName);
        Intrinsics.charlie(createComponentConfig$core_standardRelease, "null cannot be cast to non-null type com.checkout.components.interfaces.model.AddressComponentConfig");
        return new AddressComponent((AddressComponentConfig) createComponentConfig$core_standardRelease);
    }

    @NotNull
    public final Void handleActivityResult(int resultCode, @NotNull String paymentData) {
        Intrinsics.echo(paymentData, "paymentData");
        throw a(null);
    }
}
