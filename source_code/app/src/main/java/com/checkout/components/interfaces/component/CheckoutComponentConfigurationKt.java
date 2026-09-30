package com.checkout.components.interfaces.component;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentSessionResponse;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a¦\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122(\b\u0002\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\u000bj\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122(\b\u0002\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\u000bj\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¨\u0006\u001a"}, d2 = {"CheckoutComponentConfiguration", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "context", "Landroid/content/Context;", "publicKey", "", "environment", "Lcom/checkout/components/interfaces/Environment;", "paymentSession", "Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "componentOptions", "", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/components/interfaces/component/ComponentOption;", "Lcom/checkout/components/interfaces/component/ComponentOptions;", "flowCoordinators", "Lcom/checkout/components/interfaces/component/FlowCoordinator;", "locale", "Lcom/checkout/components/interfaces/localisation/Locale;", "translations", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translations;", "appearance", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "componentCallback", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "interfaces_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutComponentConfigurationKt {
    @CkoPublicApi
    @NotNull
    public static final CheckoutComponentConfiguration CheckoutComponentConfiguration(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @NotNull PaymentSessionResponse paymentSession, @NotNull Map<PaymentMethodName, ComponentOption> componentOptions, @NotNull Map<PaymentMethodName, ? extends FlowCoordinator> flowCoordinators, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> map, @Nullable DesignTokens designTokens, @Nullable ComponentCallback componentCallback) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(componentOptions, "componentOptions");
        Intrinsics.echo(flowCoordinators, "flowCoordinators");
        return new CheckoutComponentConfiguration.Payment(context, publicKey, environment, locale, map, designTokens, paymentSession, componentOptions, flowCoordinators, componentCallback);
    }

    public static /* synthetic */ CheckoutComponentConfiguration CheckoutComponentConfiguration$default(Context context, String str, Environment environment, PaymentSessionResponse paymentSessionResponse, Map map, Map map2, Locale locale, Map map3, DesignTokens designTokens, ComponentCallback componentCallback, int i4, Object obj) {
        int i5 = i4 & 16;
        t tVar = t.alpha;
        if (i5 != 0) {
            map = tVar;
        }
        if ((i4 & 32) != 0) {
            map2 = tVar;
        }
        if ((i4 & 64) != 0) {
            locale = null;
        }
        if ((i4 & 128) != 0) {
            map3 = null;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            designTokens = null;
        }
        if ((i4 & 512) != 0) {
            componentCallback = null;
        }
        return CheckoutComponentConfiguration(context, str, environment, paymentSessionResponse, map, map2, locale, map3, designTokens, componentCallback);
    }

    @CkoPublicApi
    @NotNull
    public static final CheckoutComponentConfiguration CheckoutComponentConfiguration(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> map, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        return new CheckoutComponentConfiguration.Standalone(context, publicKey, environment, locale, map, designTokens);
    }

    public static /* synthetic */ CheckoutComponentConfiguration CheckoutComponentConfiguration$default(Context context, String str, Environment environment, Locale locale, Map map, DesignTokens designTokens, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            locale = null;
        }
        if ((i4 & 16) != 0) {
            map = null;
        }
        if ((i4 & 32) != 0) {
            designTokens = null;
        }
        return CheckoutComponentConfiguration(context, str, environment, locale, map, designTokens);
    }
}
