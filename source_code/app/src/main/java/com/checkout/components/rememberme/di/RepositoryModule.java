package com.checkout.components.rememberme.di;

import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.rememberme.A0;
import com.checkout.components.rememberme.B0;
import com.checkout.components.rememberme.C0;
import com.checkout.components.rememberme.C0994x0;
import com.checkout.components.rememberme.C0997y0;
import com.checkout.components.rememberme.C1000z0;
import com.checkout.components.rememberme.D0;
import com.checkout.components.rememberme.E0;
import com.checkout.components.rememberme.F0;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.utils.JWTTokenEncoder;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.at;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0007J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010+\u001a\u00020*2\b\b\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0016\b\u0001\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0007¢\u0006\u0004\b-\u0010\u000eJ\u0017\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0004H\u0007¢\u0006\u0004\b/\u0010\u0007J!\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000201000\fH\u0007¢\u0006\u0004\b2\u0010\u000e¨\u00063"}, d2 = {"Lcom/checkout/components/rememberme/di/RepositoryModule;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "isAccountAvailableRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "screenEventNavigationRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "hasInitialCheckedRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "", "jwtTokenRepository", "Lyf/at;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "paymentStateRepository", "(Lyf/at;)Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", Constants.KEY_CONFIG, "configRepository", "(Lcom/checkout/components/interfaces/component/RememberMeConfiguration;)Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "isRTL", "Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider", "Lcom/checkout/components/rememberme/utils/JWTTokenEncoder;", "jwtTokenEncoder", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "onError", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "saveCardViewStateRepository", "(ZLcom/checkout/components/rememberme/di/DefaultStyleProvider;Lcom/checkout/components/rememberme/utils/JWTTokenEncoder;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "screenRepository", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "walletScreenViewStateRepository", "", "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadataRepository", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepositoryModule {
    public static final int $stable = 0;

    @NotNull
    public final PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository() {
        return new C0994x0(t.alpha);
    }

    @NotNull
    public final PrimitiveStateFlowRepository<RememberMeConfiguration> configRepository(@Nullable RememberMeConfiguration config) {
        return new C0997y0(config);
    }

    @NotNull
    public final PrimitiveStateRepository<Boolean> hasInitialCheckedRepository() {
        return new C1000z0();
    }

    @NotNull
    public final PrimitiveStateFlowRepository<Boolean> isAccountAvailableRepository() {
        return new A0();
    }

    @NotNull
    public final PrimitiveStateFlowRepository<String> jwtTokenRepository() {
        return new B0();
    }

    @NotNull
    public final PaymentStateRepository paymentStateRepository(@NotNull at paymentStateFlow) {
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        return new PaymentStateRepository(paymentStateFlow);
    }

    @NotNull
    public final SaveCardViewStateRepository saveCardViewStateRepository(boolean isRTL, @NotNull DefaultStyleProvider styleProvider, @NotNull JWTTokenEncoder jwtTokenEncoder, @Nullable Function1<? super CheckoutError, Unit> onError, @NotNull LogDetails logDetails, @NotNull Logger logger) {
        Intrinsics.echo(styleProvider, "styleProvider");
        Intrinsics.echo(jwtTokenEncoder, "jwtTokenEncoder");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(logger, "logger");
        return new SaveCardViewStateRepository(isRTL, styleProvider, jwtTokenEncoder, onError, logger, logDetails);
    }

    @NotNull
    public final PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository() {
        return new C0();
    }

    @NotNull
    public final PrimitiveStateRepository<RememberMeScreen> screenRepository() {
        return new D0(RememberMeScreen.Alternative.INSTANCE);
    }

    @NotNull
    public final PrimitiveStateFlowRepository<GetWalletResponse> walletRepository() {
        return new E0();
    }

    @NotNull
    public final PrimitiveStateFlowRepository<WalletScreenViewState> walletScreenViewStateRepository() {
        return new F0();
    }
}
