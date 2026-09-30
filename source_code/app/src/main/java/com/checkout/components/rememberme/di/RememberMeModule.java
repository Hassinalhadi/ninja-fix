package com.checkout.components.rememberme.di;

import Xd.l;
import Ya.c;
import b.c0;
import bz.h0;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.checkout.components.kmp.rememberme.shared.model.TranslationKey;
import com.checkout.components.rememberme.AbstractC0952j0;
import com.checkout.components.rememberme.logger.RememberMeLoggerImpl;
import com.checkout.components.rememberme.utils.KMPExtensionsKt;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import com.checkout.components.ui.model.CardScheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJQ\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2$\b\u0001\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jq\u0010*\u001a\u00020)2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010&\u001a\u00020\u001b2\u0010\b\u0001\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/checkout/components/rememberme/di/RememberMeModule;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "onError", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", "Lcom/checkout/components/ui/model/CardScheme;", "supportedSchemes", "(Ljava/util/List;)Ljava/util/List;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedTypes", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "onPayRememberMe", "(LXd/l;)LXd/l;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "rememberMeLogger", "(Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;", "clickHandler", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "publicKey", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "jwtTokenRepository", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "kmpRememberMe", "(Ljava/util/Map;Lcom/checkout/components/interfaces/localisation/Locale;Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/lang/String;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeModule {
    public static final int $stable = 0;

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit alpha(ClickTarget clickTarget) {
        return a(clickTarget);
    }

    public static /* synthetic */ Unit charlie() {
        return a();
    }

    @NotNull
    public final CheckoutKMPRememberMe kmpRememberMe(@Nullable Map<ComponentTranslationKey, String> translation, @NotNull Locale locale, @NotNull KMPRememberMeClickHandler clickHandler, @NotNull Environment environment, @Nullable DesignTokens designTokens, @NotNull String publicKey, @NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull RememberMeLogger rememberMeLogger) {
        Map<TranslationKey, String> map;
        RememberMeEnvironment rememberMeEnvironment;
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(clickHandler, "clickHandler");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(rememberMeLogger, "rememberMeLogger");
        clickHandler.setInfoTextNavigator$rememberme_standardRelease(new c0(2));
        com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens designTokens2 = null;
        if (translation != null) {
            map = KMPExtensionsKt.mapToKMPRememberMeTranslation(translation);
        } else {
            map = null;
        }
        CheckoutLocale mapToKMPRememberLocale = KMPExtensionsKt.mapToKMPRememberLocale(locale);
        if (designTokens != null) {
            designTokens2 = KMPExtensionsKt.mapToKMPDesignTokens(designTokens);
        }
        com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens designTokens3 = designTokens2;
        int i4 = AbstractC0952j0.f5965a[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                rememberMeEnvironment = RememberMeEnvironment.PROD;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            rememberMeEnvironment = RememberMeEnvironment.SANDBOX;
        }
        return new CheckoutKMPRememberMe(new RememberMeConfig(rememberMeEnvironment, new h0(8), publicKey, "CheckoutAndroidComponents", "2.1.0", new c(20, jwtTokenRepository), designTokens3, mapToKMPRememberLocale, map, rememberMeLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Function1<CheckoutError, Unit> onError(@Nullable Function1<? super CheckoutError, Unit> onError) {
        return onError;
    }

    @NotNull
    public final l onPayRememberMe(@NotNull l onPayRememberMe) {
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        return onPayRememberMe;
    }

    @NotNull
    public final RememberMeLogger rememberMeLogger(@NotNull Logger logger) {
        Intrinsics.echo(logger, "logger");
        return new RememberMeLoggerImpl(logger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<CardScheme> supportedSchemes(@NotNull List<? extends CardScheme> supportedSchemes) {
        Intrinsics.echo(supportedSchemes, "supportedSchemes");
        return supportedSchemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<CardTypeName> supportedTypes(@NotNull List<? extends CardTypeName> supportedTypes) {
        Intrinsics.echo(supportedTypes, "supportedTypes");
        return supportedTypes;
    }

    public static final Unit a(ClickTarget target) {
        Intrinsics.echo(target, "target");
        KMPRememberMeClickHandler.INSTANCE.staticOnClick$rememberme_standardRelease(target);
        return Unit.INSTANCE;
    }

    public static final Unit a(PrimitiveStateFlowRepository primitiveStateFlowRepository, String token) {
        Intrinsics.echo(token, "token");
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) token);
        return Unit.INSTANCE;
    }
}
