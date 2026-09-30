package com.checkout.components.kmp.rememberme.shared.model;

import Lb.am;
import Q0.c;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b'\u0010(J\u009e\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u0010\u001dR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b;\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010$R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010(¨\u0006D"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", "", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "environment", "Lkotlin/Function1;", "Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "", "onClick", "", "publicKey", "serviceName", "serviceVersion", "onAuthenticated", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "locale", "", "Lcom/checkout/components/kmp/rememberme/shared/model/TranslationKey;", "translation", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "logger", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;Ljava/util/Map;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)V", "component1", "()Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "component8", "()Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "component9", "()Ljava/util/Map;", "component10", "()Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", Constants.COPY_TYPE, "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;Ljava/util/Map;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "getEnvironment", "Lkotlin/jvm/functions/Function1;", "getOnClick", "Ljava/lang/String;", "getPublicKey", "getServiceName", "getServiceVersion", "getOnAuthenticated", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "getDesignTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "getLocale", "Ljava/util/Map;", "getTranslation", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "getLogger", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RememberMeConfig {
    public static final int $stable = 8;

    @Nullable
    private final DesignTokens designTokens;

    @NotNull
    private final RememberMeEnvironment environment;

    @NotNull
    private final CheckoutLocale locale;

    @Nullable
    private final RememberMeLogger logger;

    @NotNull
    private final Function1<String, Unit> onAuthenticated;

    @NotNull
    private final Function1<ClickTarget, Unit> onClick;

    @NotNull
    private final String publicKey;

    @NotNull
    private final String serviceName;

    @NotNull
    private final String serviceVersion;

    @Nullable
    private final Map<TranslationKey, String> translation;

    /* JADX WARN: Multi-variable type inference failed */
    public RememberMeConfig(@NotNull RememberMeEnvironment environment, @NotNull Function1<? super ClickTarget, Unit> onClick, @NotNull String publicKey, @NotNull String serviceName, @NotNull String serviceVersion, @NotNull Function1<? super String, Unit> onAuthenticated, @Nullable DesignTokens designTokens, @NotNull CheckoutLocale locale, @Nullable Map<TranslationKey, String> map, @Nullable RememberMeLogger rememberMeLogger) {
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(serviceName, "serviceName");
        Intrinsics.echo(serviceVersion, "serviceVersion");
        Intrinsics.echo(onAuthenticated, "onAuthenticated");
        Intrinsics.echo(locale, "locale");
        this.environment = environment;
        this.onClick = onClick;
        this.publicKey = publicKey;
        this.serviceName = serviceName;
        this.serviceVersion = serviceVersion;
        this.onAuthenticated = onAuthenticated;
        this.designTokens = designTokens;
        this.locale = locale;
        this.translation = map;
        this.logger = rememberMeLogger;
    }

    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RememberMeConfig copy$default(RememberMeConfig rememberMeConfig, RememberMeEnvironment rememberMeEnvironment, Function1 function1, String str, String str2, String str3, Function1 function12, DesignTokens designTokens, CheckoutLocale checkoutLocale, Map map, RememberMeLogger rememberMeLogger, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            rememberMeEnvironment = rememberMeConfig.environment;
        }
        if ((i4 & 2) != 0) {
            function1 = rememberMeConfig.onClick;
        }
        if ((i4 & 4) != 0) {
            str = rememberMeConfig.publicKey;
        }
        if ((i4 & 8) != 0) {
            str2 = rememberMeConfig.serviceName;
        }
        if ((i4 & 16) != 0) {
            str3 = rememberMeConfig.serviceVersion;
        }
        if ((i4 & 32) != 0) {
            function12 = rememberMeConfig.onAuthenticated;
        }
        if ((i4 & 64) != 0) {
            designTokens = rememberMeConfig.designTokens;
        }
        if ((i4 & 128) != 0) {
            checkoutLocale = rememberMeConfig.locale;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            map = rememberMeConfig.translation;
        }
        if ((i4 & 512) != 0) {
            rememberMeLogger = rememberMeConfig.logger;
        }
        Map map2 = map;
        RememberMeLogger rememberMeLogger2 = rememberMeLogger;
        DesignTokens designTokens2 = designTokens;
        CheckoutLocale checkoutLocale2 = checkoutLocale;
        String str4 = str3;
        Function1 function13 = function12;
        return rememberMeConfig.copy(rememberMeEnvironment, function1, str, str2, str4, function13, designTokens2, checkoutLocale2, map2, rememberMeLogger2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RememberMeEnvironment getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final RememberMeLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Function1<ClickTarget, Unit> component2() {
        return this.onClick;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getServiceVersion() {
        return this.serviceVersion;
    }

    @NotNull
    public final Function1<String, Unit> component6() {
        return this.onAuthenticated;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CheckoutLocale getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<TranslationKey, String> component9() {
        return this.translation;
    }

    @NotNull
    public final RememberMeConfig copy(@NotNull RememberMeEnvironment environment, @NotNull Function1<? super ClickTarget, Unit> onClick, @NotNull String publicKey, @NotNull String serviceName, @NotNull String serviceVersion, @NotNull Function1<? super String, Unit> onAuthenticated, @Nullable DesignTokens designTokens, @NotNull CheckoutLocale locale, @Nullable Map<TranslationKey, String> map, @Nullable RememberMeLogger rememberMeLogger) {
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(serviceName, "serviceName");
        Intrinsics.echo(serviceVersion, "serviceVersion");
        Intrinsics.echo(onAuthenticated, "onAuthenticated");
        Intrinsics.echo(locale, "locale");
        return new RememberMeConfig(environment, onClick, publicKey, serviceName, serviceVersion, onAuthenticated, designTokens, locale, map, rememberMeLogger);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberMeConfig)) {
            return false;
        }
        RememberMeConfig rememberMeConfig = (RememberMeConfig) other;
        return this.environment == rememberMeConfig.environment && Intrinsics.areEqual(this.onClick, rememberMeConfig.onClick) && Intrinsics.areEqual(this.publicKey, rememberMeConfig.publicKey) && Intrinsics.areEqual(this.serviceName, rememberMeConfig.serviceName) && Intrinsics.areEqual(this.serviceVersion, rememberMeConfig.serviceVersion) && Intrinsics.areEqual(this.onAuthenticated, rememberMeConfig.onAuthenticated) && Intrinsics.areEqual(this.designTokens, rememberMeConfig.designTokens) && Intrinsics.areEqual(this.locale, rememberMeConfig.locale) && Intrinsics.areEqual(this.translation, rememberMeConfig.translation) && Intrinsics.areEqual(this.logger, rememberMeConfig.logger);
    }

    @Nullable
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    public final RememberMeEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final CheckoutLocale getLocale() {
        return this.locale;
    }

    @Nullable
    public final RememberMeLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Function1<String, Unit> getOnAuthenticated() {
        return this.onAuthenticated;
    }

    @NotNull
    public final Function1<ClickTarget, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final String getServiceVersion() {
        return this.serviceVersion;
    }

    @Nullable
    public final Map<TranslationKey, String> getTranslation() {
        return this.translation;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.onAuthenticated.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra((this.onClick.hashCode() + (this.environment.hashCode() * 31)) * 31, 31, this.publicKey), 31, this.serviceName), 31, this.serviceVersion)) * 31;
        DesignTokens designTokens = this.designTokens;
        int i4 = 0;
        if (designTokens == null) {
            hashCode = 0;
        } else {
            hashCode = designTokens.hashCode();
        }
        int hashCode4 = (this.locale.hashCode() + ((hashCode3 + hashCode) * 31)) * 31;
        Map<TranslationKey, String> map = this.translation;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i5 = (hashCode4 + hashCode2) * 31;
        RememberMeLogger rememberMeLogger = this.logger;
        if (rememberMeLogger != null) {
            i4 = rememberMeLogger.hashCode();
        }
        return i5 + i4;
    }

    @NotNull
    public String toString() {
        RememberMeEnvironment rememberMeEnvironment = this.environment;
        Function1<ClickTarget, Unit> function1 = this.onClick;
        String str = this.publicKey;
        String str2 = this.serviceName;
        String str3 = this.serviceVersion;
        Function1<String, Unit> function12 = this.onAuthenticated;
        DesignTokens designTokens = this.designTokens;
        CheckoutLocale checkoutLocale = this.locale;
        Map<TranslationKey, String> map = this.translation;
        RememberMeLogger rememberMeLogger = this.logger;
        StringBuilder sb2 = new StringBuilder("RememberMeConfig(environment=");
        sb2.append(rememberMeEnvironment);
        sb2.append(", onClick=");
        sb2.append(function1);
        sb2.append(", publicKey=");
        c.azure(sb2, str, ", serviceName=", str2, ", serviceVersion=");
        sb2.append(str3);
        sb2.append(", onAuthenticated=");
        sb2.append(function12);
        sb2.append(", designTokens=");
        sb2.append(designTokens);
        sb2.append(", locale=");
        sb2.append(checkoutLocale);
        sb2.append(", translation=");
        sb2.append(map);
        sb2.append(", logger=");
        sb2.append(rememberMeLogger);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ RememberMeConfig(RememberMeEnvironment rememberMeEnvironment, Function1 function1, String str, String str2, String str3, Function1 function12, DesignTokens designTokens, CheckoutLocale checkoutLocale, Map map, RememberMeLogger rememberMeLogger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberMeEnvironment, function1, str, str2, str3, (i4 & 32) != 0 ? new am(21) : function12, (i4 & 64) != 0 ? null : designTokens, (i4 & 128) != 0 ? CheckoutLocale.En.INSTANCE : checkoutLocale, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : map, (i4 & 512) != 0 ? null : rememberMeLogger);
    }
}
