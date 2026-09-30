package com.checkout.components.card.di.component;

import android.content.Context;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.ui.component.address.AddressViewModelFactory;
import com.checkout.components.card.ui.component.base.InputComponentViewModelFactory;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModelFactory;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/CardDIComponent;", "", "inject", "", "factory", "Lcom/checkout/components/card/ui/component/paybutton/PayButtonViewModel$PayButtonFactory;", "errorLabelViewModelFactory", "Lcom/checkout/components/card/ui/component/errorlabel/ErrorLabelViewModel$ErrorLabelViewModelFactory;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModelFactory;", "Lcom/checkout/components/card/operations/PaymentOperationManager$PaymentOperationManagerFactory;", "Lcom/checkout/components/card/ui/component/address/AddressViewModelFactory;", "Lcom/checkout/components/card/ui/component/savecard/SaveCardContainerViewModelFactory;", "cardMetaDataRepository", "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "paymentStateManager", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "Builder", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CardDIComponent {

    @Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH'¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00002\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010'\u001a\u00020\u00002(\u0010&\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fj\u0002`%H'¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H'¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u00002\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202H'¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000206H'¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u000209H'¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<H'¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H'¢\u0006\u0004\b@\u0010AJ7\u0010E\u001a\u00020\u00002&\b\u0002\u0010&\u001a \b\u0001\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001fH'¢\u0006\u0004\bE\u0010(J'\u0010I\u001a\u00020\u00002\u0016\b\u0002\u0010H\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020D\u0018\u00010FH'¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\u00002\u000e\b\u0001\u0010L\u001a\b\u0012\u0004\u0012\u00020$0KH'¢\u0006\u0004\bM\u0010NJ'\u0010O\u001a\u00020\u00002\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$\u0018\u00010FH'¢\u0006\u0004\bO\u0010JJ\u001d\u0010Q\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020$0KH'¢\u0006\u0004\bQ\u0010NJ1\u0010S\u001a\u00020\u00002 \b\u0002\u0010R\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0C\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010FH'¢\u0006\u0004\bS\u0010JJ\u0019\u0010U\u001a\u00020\u00002\b\u0010U\u001a\u0004\u0018\u00010TH'¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010WH'¢\u0006\u0004\bX\u0010YJ\u0019\u0010[\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010ZH'¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H&¢\u0006\u0004\b^\u0010_ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006`À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "", "Lcom/checkout/components/ui/data/SupportedTypesRepository;", "supportedTypesRepository", "(Lcom/checkout/components/ui/data/SupportedTypesRepository;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "(Lcom/checkout/components/ui/data/SupportedSchemesRepository;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/ui/data/DisplayCvvRepository;", "displayCvvRepository", "(Lcom/checkout/components/ui/data/DisplayCvvRepository;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "", Constants.KEY_URL, "baseUrl", "(Ljava/lang/String;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "cagBaseUrl", "cardMetaDataBaseUrl", Constants.KEY_KEY, "publicKey", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/Environment;", "environment", "(Lcom/checkout/components/interfaces/Environment;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translations", "translation", "(Ljava/util/Map;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "", "Lcom/checkout/components/card/model/OnTokenResult;", "onResult", "onTokenResult", "(LXd/l;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentResultFlow", "paymentStateFlow", "(Lyf/L;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "appearance", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/insight/LogDetails;", "details", "logDetails", "(Lcom/checkout/components/interfaces/insight/LogDetails;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "(Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Ljava/util/Locale;", "locale", "(Ljava/util/Locale;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "cardConfiguration", "(Lcom/checkout/components/interfaces/component/CardConfiguration;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "paymentButtonAction", "(Lcom/checkout/components/interfaces/component/PaymentButtonAction;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onCardBinChangedCallback", "onCardBinChanged", "(Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lkotlin/Function0;", "onChangeInvocation", "onChange", "(Lkotlin/jvm/functions/Function0;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "onError", "onClick", "onButtonClick", "invoke", "handlePayButtonTap", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "addressConfiguration", "(Lcom/checkout/components/interfaces/component/AddressConfiguration;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "rememberMeConfiguration", "(Lcom/checkout/components/interfaces/component/RememberMeConfiguration;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "(Lcom/checkout/components/rememberme/CheckoutRememberMe;)Lcom/checkout/components/card/di/component/CardDIComponent$Builder;", "Lcom/checkout/components/card/di/component/CardDIComponent;", "build", "()Lcom/checkout/components/card/di/component/CardDIComponent;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Builder {
        @NotNull
        Builder addressConfiguration(@Nullable AddressConfiguration addressConfiguration);

        @NotNull
        Builder appearance(@Nullable DesignTokens designTokens);

        @NotNull
        Builder baseUrl(@NotNull String url);

        @NotNull
        CardDIComponent build();

        @NotNull
        Builder cagBaseUrl(@NotNull String url);

        @NotNull
        Builder cardConfiguration(@Nullable CardConfiguration cardConfiguration);

        @NotNull
        Builder cardMetaDataBaseUrl(@NotNull String url);

        @NotNull
        Builder context(@NotNull Context context);

        @NotNull
        Builder displayCvvRepository(@NotNull DisplayCvvRepository displayCvvRepository);

        @NotNull
        Builder environment(@NotNull Environment environment);

        @NotNull
        Builder handlePayButtonTap(@Nullable Function1<? super Nd.c<? super Boolean>, ? extends Object> invoke);

        @NotNull
        Builder locale(@NotNull Locale locale);

        @NotNull
        Builder logDetails(@NotNull LogDetails details);

        @NotNull
        Builder logger(@NotNull Logger logger);

        @NotNull
        Builder onButtonClick(@NotNull Function0<Unit> onClick);

        @NotNull
        Builder onCardBinChanged(@Nullable Function1<? super CardMetadata, ? extends CallbackResult> onCardBinChangedCallback);

        @NotNull
        Builder onChange(@NotNull Function0<Unit> onChangeInvocation);

        @NotNull
        Builder onError(@Nullable Function1<? super CheckoutError, Unit> onResult);

        @NotNull
        Builder onTokenResult(@NotNull Xd.l onResult);

        @NotNull
        Builder onTokenized(@Nullable Xd.l onResult);

        @NotNull
        Builder paymentButtonAction(@NotNull PaymentButtonAction paymentButtonAction);

        @NotNull
        Builder paymentStateFlow(@NotNull L paymentResultFlow);

        @NotNull
        Builder publicKey(@NotNull String key);

        @NotNull
        Builder rememberMe(@Nullable CheckoutRememberMe rememberMe);

        @NotNull
        Builder rememberMeConfiguration(@Nullable RememberMeConfiguration rememberMeConfiguration);

        @NotNull
        Builder supportedSchemesRepository(@NotNull SupportedSchemesRepository supportedSchemesRepository);

        @NotNull
        Builder supportedTypesRepository(@NotNull SupportedTypesRepository supportedTypesRepository);

        @NotNull
        Builder translation(@Nullable Map<ComponentTranslationKey, String> translations);
    }

    @NotNull
    CardMetaDataRepository cardMetaDataRepository();

    void inject(@NotNull PaymentOperationManager.PaymentOperationManagerFactory factory);

    void inject(@NotNull AddressViewModelFactory factory);

    void inject(@NotNull InputComponentViewModelFactory factory);

    void inject(@NotNull ErrorLabelViewModel.ErrorLabelViewModelFactory errorLabelViewModelFactory);

    void inject(@NotNull PayButtonViewModel.PayButtonFactory factory);

    void inject(@NotNull SaveCardContainerViewModelFactory factory);

    @NotNull
    PaymentStateManager paymentStateManager();
}
