package com.checkout.components.interfaces.component;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.b;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentSessionResponse;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u001c\u001dR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R2\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0002\u001e\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "publicKey", "", "getPublicKey", "()Ljava/lang/String;", "environment", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment", "()Lcom/checkout/components/interfaces/Environment;", "locale", "Lcom/checkout/components/interfaces/localisation/Locale;", "getLocale", "()Lcom/checkout/components/interfaces/localisation/Locale;", "translations", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translations;", "getTranslations", "()Ljava/util/Map;", "appearance", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Payment", "Standalone", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Standalone;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface CheckoutComponentConfiguration {

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u0014\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J0\u0010$\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u0014HÆ\u0003¢\u0006\u0004\b*\u0010%J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\nHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b,\u0010-J¶\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2(\b\u0002\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010#R:\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010)R'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u00148\u0006¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010%R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\n8\u0006¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010-¨\u0006U"}, d2 = {"Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "Landroid/content/Context;", "context", "", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translations;", "translations", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "paymentSession", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/components/interfaces/component/ComponentOption;", "Lcom/checkout/components/interfaces/component/ComponentOptions;", "componentOptions", "Lcom/checkout/components/interfaces/component/FlowCoordinator;", "flowCoordinators", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/model/PaymentSessionResponse;Ljava/util/Map;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ComponentCallback;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/checkout/components/interfaces/Environment;", "component4", "()Lcom/checkout/components/interfaces/localisation/Locale;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "component7", "()Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "component8", "component9", "component10", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", Constants.COPY_TYPE, "(Landroid/content/Context;Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/model/PaymentSessionResponse;Ljava/util/Map;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ComponentCallback;)Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "getContext", "b", "Ljava/lang/String;", "getPublicKey", "c", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/localisation/Locale;", "getLocale", "e", "Ljava/util/Map;", "getTranslations", "f", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "g", "Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "getPaymentSession", "h", "getComponentOptions", "i", "getFlowCoordinators", "j", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getComponentCallback", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Payment implements CheckoutComponentConfiguration {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String publicKey;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Environment environment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Locale locale;

        /* renamed from: e, reason: from kotlin metadata */
        private final Map translations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DesignTokens appearance;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final PaymentSessionResponse paymentSession;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Map componentOptions;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Map flowCoordinators;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ComponentCallback componentCallback;

        public Payment(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> map, @Nullable DesignTokens designTokens, @NotNull PaymentSessionResponse paymentSession, @NotNull Map<PaymentMethodName, ComponentOption> componentOptions, @NotNull Map<PaymentMethodName, ? extends FlowCoordinator> flowCoordinators, @Nullable ComponentCallback componentCallback) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(environment, "environment");
            Intrinsics.echo(paymentSession, "paymentSession");
            Intrinsics.echo(componentOptions, "componentOptions");
            Intrinsics.echo(flowCoordinators, "flowCoordinators");
            this.context = context;
            this.publicKey = publicKey;
            this.environment = environment;
            this.locale = locale;
            this.translations = map;
            this.appearance = designTokens;
            this.paymentSession = paymentSession;
            this.componentOptions = componentOptions;
            this.flowCoordinators = flowCoordinators;
            this.componentCallback = componentCallback;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, Context context, String str, Environment environment, Locale locale, Map map, DesignTokens designTokens, PaymentSessionResponse paymentSessionResponse, Map map2, Map map3, ComponentCallback componentCallback, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                context = payment.context;
            }
            if ((i4 & 2) != 0) {
                str = payment.publicKey;
            }
            if ((i4 & 4) != 0) {
                environment = payment.environment;
            }
            if ((i4 & 8) != 0) {
                locale = payment.locale;
            }
            if ((i4 & 16) != 0) {
                map = payment.translations;
            }
            if ((i4 & 32) != 0) {
                designTokens = payment.appearance;
            }
            if ((i4 & 64) != 0) {
                paymentSessionResponse = payment.paymentSession;
            }
            if ((i4 & 128) != 0) {
                map2 = payment.componentOptions;
            }
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
                map3 = payment.flowCoordinators;
            }
            if ((i4 & 512) != 0) {
                componentCallback = payment.componentCallback;
            }
            Map map4 = map3;
            ComponentCallback componentCallback2 = componentCallback;
            PaymentSessionResponse paymentSessionResponse2 = paymentSessionResponse;
            Map map5 = map2;
            Map map6 = map;
            DesignTokens designTokens2 = designTokens;
            return payment.copy(context, str, environment, locale, map6, designTokens2, paymentSessionResponse2, map5, map4, componentCallback2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final ComponentCallback getComponentCallback() {
            return this.componentCallback;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @Nullable
        public final Map<Locale, Map<ComponentTranslationKey, String>> component5() {
            return this.translations;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final DesignTokens getAppearance() {
            return this.appearance;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final PaymentSessionResponse getPaymentSession() {
            return this.paymentSession;
        }

        @NotNull
        public final Map<PaymentMethodName, ComponentOption> component8() {
            return this.componentOptions;
        }

        @NotNull
        public final Map<PaymentMethodName, FlowCoordinator> component9() {
            return this.flowCoordinators;
        }

        @NotNull
        public final Payment copy(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> translations, @Nullable DesignTokens appearance, @NotNull PaymentSessionResponse paymentSession, @NotNull Map<PaymentMethodName, ComponentOption> componentOptions, @NotNull Map<PaymentMethodName, ? extends FlowCoordinator> flowCoordinators, @Nullable ComponentCallback componentCallback) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(environment, "environment");
            Intrinsics.echo(paymentSession, "paymentSession");
            Intrinsics.echo(componentOptions, "componentOptions");
            Intrinsics.echo(flowCoordinators, "flowCoordinators");
            return new Payment(context, publicKey, environment, locale, translations, appearance, paymentSession, componentOptions, flowCoordinators, componentCallback);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.areEqual(this.context, payment.context) && Intrinsics.areEqual(this.publicKey, payment.publicKey) && this.environment == payment.environment && Intrinsics.areEqual(this.locale, payment.locale) && Intrinsics.areEqual(this.translations, payment.translations) && Intrinsics.areEqual(this.appearance, payment.appearance) && Intrinsics.areEqual(this.paymentSession, payment.paymentSession) && Intrinsics.areEqual(this.componentOptions, payment.componentOptions) && Intrinsics.areEqual(this.flowCoordinators, payment.flowCoordinators) && Intrinsics.areEqual(this.componentCallback, payment.componentCallback);
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final DesignTokens getAppearance() {
            return this.appearance;
        }

        @Nullable
        public final ComponentCallback getComponentCallback() {
            return this.componentCallback;
        }

        @NotNull
        public final Map<PaymentMethodName, ComponentOption> getComponentOptions() {
            return this.componentOptions;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final Environment getEnvironment() {
            return this.environment;
        }

        @NotNull
        public final Map<PaymentMethodName, FlowCoordinator> getFlowCoordinators() {
            return this.flowCoordinators;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final Locale getLocale() {
            return this.locale;
        }

        @NotNull
        public final PaymentSessionResponse getPaymentSession() {
            return this.paymentSession;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final String getPublicKey() {
            return this.publicKey;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final Map<Locale, Map<ComponentTranslationKey, String>> getTranslations() {
            return this.translations;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = (this.environment.hashCode() + b.a(this.publicKey, this.context.hashCode() * 31, 31)) * 31;
            Locale locale = this.locale;
            int i4 = 0;
            if (locale == null) {
                hashCode = 0;
            } else {
                hashCode = locale.hashCode();
            }
            int i5 = (hashCode4 + hashCode) * 31;
            Map map = this.translations;
            if (map == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = map.hashCode();
            }
            int i10 = (i5 + hashCode2) * 31;
            DesignTokens designTokens = this.appearance;
            if (designTokens == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = designTokens.hashCode();
            }
            int hashCode5 = (this.flowCoordinators.hashCode() + ((this.componentOptions.hashCode() + ((this.paymentSession.hashCode() + ((i10 + hashCode3) * 31)) * 31)) * 31)) * 31;
            ComponentCallback componentCallback = this.componentCallback;
            if (componentCallback != null) {
                i4 = componentCallback.hashCode();
            }
            return hashCode5 + i4;
        }

        @NotNull
        public final String toString() {
            return "Payment(context=" + this.context + ", publicKey=" + this.publicKey + ", environment=" + this.environment + ", locale=" + this.locale + ", translations=" + this.translations + ", appearance=" + this.appearance + ", paymentSession=" + this.paymentSession + ", componentOptions=" + this.componentOptions + ", flowCoordinators=" + this.flowCoordinators + ", componentCallback=" + this.componentCallback + ")";
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJp\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2(\b\u0002\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0019R:\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001d¨\u0006;"}, d2 = {"Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Standalone;", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "Landroid/content/Context;", "context", "", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translations;", "translations", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/checkout/components/interfaces/Environment;", "component4", "()Lcom/checkout/components/interfaces/localisation/Locale;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", Constants.COPY_TYPE, "(Landroid/content/Context;Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Standalone;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "getContext", "b", "Ljava/lang/String;", "getPublicKey", "c", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/localisation/Locale;", "getLocale", "e", "Ljava/util/Map;", "getTranslations", "f", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Standalone implements CheckoutComponentConfiguration {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String publicKey;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Environment environment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Locale locale;

        /* renamed from: e, reason: from kotlin metadata */
        private final Map translations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DesignTokens appearance;

        public Standalone(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> map, @Nullable DesignTokens designTokens) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(environment, "environment");
            this.context = context;
            this.publicKey = publicKey;
            this.environment = environment;
            this.locale = locale;
            this.translations = map;
            this.appearance = designTokens;
        }

        public static /* synthetic */ Standalone copy$default(Standalone standalone, Context context, String str, Environment environment, Locale locale, Map map, DesignTokens designTokens, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                context = standalone.context;
            }
            if ((i4 & 2) != 0) {
                str = standalone.publicKey;
            }
            if ((i4 & 4) != 0) {
                environment = standalone.environment;
            }
            if ((i4 & 8) != 0) {
                locale = standalone.locale;
            }
            if ((i4 & 16) != 0) {
                map = standalone.translations;
            }
            if ((i4 & 32) != 0) {
                designTokens = standalone.appearance;
            }
            Map map2 = map;
            DesignTokens designTokens2 = designTokens;
            return standalone.copy(context, str, environment, locale, map2, designTokens2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @Nullable
        public final Map<Locale, Map<ComponentTranslationKey, String>> component5() {
            return this.translations;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final DesignTokens getAppearance() {
            return this.appearance;
        }

        @NotNull
        public final Standalone copy(@NotNull Context context, @NotNull String publicKey, @NotNull Environment environment, @Nullable Locale locale, @Nullable Map<Locale, ? extends Map<ComponentTranslationKey, String>> translations, @Nullable DesignTokens appearance) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(environment, "environment");
            return new Standalone(context, publicKey, environment, locale, translations, appearance);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standalone)) {
                return false;
            }
            Standalone standalone = (Standalone) other;
            return Intrinsics.areEqual(this.context, standalone.context) && Intrinsics.areEqual(this.publicKey, standalone.publicKey) && this.environment == standalone.environment && Intrinsics.areEqual(this.locale, standalone.locale) && Intrinsics.areEqual(this.translations, standalone.translations) && Intrinsics.areEqual(this.appearance, standalone.appearance);
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final DesignTokens getAppearance() {
            return this.appearance;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final Locale getLocale() {
            return this.locale;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @NotNull
        public final String getPublicKey() {
            return this.publicKey;
        }

        @Override // com.checkout.components.interfaces.component.CheckoutComponentConfiguration
        @Nullable
        public final Map<Locale, Map<ComponentTranslationKey, String>> getTranslations() {
            return this.translations;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = (this.environment.hashCode() + b.a(this.publicKey, this.context.hashCode() * 31, 31)) * 31;
            Locale locale = this.locale;
            int i4 = 0;
            if (locale == null) {
                hashCode = 0;
            } else {
                hashCode = locale.hashCode();
            }
            int i5 = (hashCode3 + hashCode) * 31;
            Map map = this.translations;
            if (map == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = map.hashCode();
            }
            int i10 = (i5 + hashCode2) * 31;
            DesignTokens designTokens = this.appearance;
            if (designTokens != null) {
                i4 = designTokens.hashCode();
            }
            return i10 + i4;
        }

        @NotNull
        public final String toString() {
            return "Standalone(context=" + this.context + ", publicKey=" + this.publicKey + ", environment=" + this.environment + ", locale=" + this.locale + ", translations=" + this.translations + ", appearance=" + this.appearance + ")";
        }
    }

    @Nullable
    DesignTokens getAppearance();

    @NotNull
    Context getContext();

    @NotNull
    Environment getEnvironment();

    @Nullable
    Locale getLocale();

    @NotNull
    String getPublicKey();

    @Nullable
    Map<Locale, Map<ComponentTranslationKey, String>> getTranslations();
}
