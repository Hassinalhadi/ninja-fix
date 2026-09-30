package com.checkout.components.rememberme;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.di.NetworkModule;
import com.checkout.components.rememberme.di.RMStateManagerModule;
import com.checkout.components.rememberme.di.RTLModule;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.di.RepositoryModule;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.ui.model.CardScheme;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.at;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ¿\u0001\u0010+\u001a\u00020*2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bj\u0004\u0018\u0001`\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f\u0018\u00010#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;", "", "", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)V", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", Constants.KEY_CONFIG, "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "", "onPayRememberMe", "", "Lcom/checkout/components/ui/model/CardScheme;", "supportedSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedTypes", "Lyf/at;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Landroid/content/Context;", "context", "Lcom/checkout/components/rememberme/model/RememberMeCallback;", "callback", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "create", "(Lcom/checkout/components/interfaces/component/RememberMeConfiguration;LXd/l;Ljava/util/List;Ljava/util/List;Lyf/at;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;Landroid/content/Context;Lcom/checkout/components/rememberme/model/RememberMeCallback;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutRememberMeFactory {
    public static final int $stable = DesignTokens.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final String f5735a;

    /* renamed from: b, reason: collision with root package name */
    private final Environment f5736b;

    /* renamed from: c, reason: collision with root package name */
    private final DesignTokens f5737c;

    public CheckoutRememberMeFactory(@NotNull String publicKey, @NotNull Environment environment, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        this.f5735a = publicKey;
        this.f5736b = environment;
        this.f5737c = designTokens;
    }

    @NotNull
    public final CheckoutRememberMe create(@Nullable RememberMeConfiguration config, @NotNull Xd.l onPayRememberMe, @NotNull List<? extends CardScheme> supportedSchemes, @NotNull List<? extends CardTypeName> supportedTypes, @NotNull at paymentStateFlow, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> translation, @NotNull Context context, @NotNull RememberMeCallback callback, @Nullable Function1<? super CheckoutError, Unit> onError, @NotNull LogDetails logDetails, @NotNull Logger logger) {
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        Intrinsics.echo(supportedSchemes, "supportedSchemes");
        Intrinsics.echo(supportedTypes, "supportedTypes");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(callback, "callback");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(logger, "logger");
        Environment environment = this.f5736b;
        environment.getClass();
        String str = this.f5735a;
        str.getClass();
        return new CheckoutRememberMe(new C0978s(new RTLModule(), new StyleModule(), new NetworkModule(), new RepositoryModule(), new UseCaseModule(), new RememberMeModule(), new RMStateManagerModule(), str, environment, context, config, supportedSchemes, supportedTypes, this.f5737c, onPayRememberMe, paymentStateFlow, translation, logger, callback, locale, onError, logDetails));
    }
}
