package com.checkout.components.rememberme.di;

import Xd.l;
import androidx.annotation.Keep;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%j\u0002`(H&¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0%j\u0002`-H&¢\u0006\u0004\b.\u0010*J\u000f\u00100\u001a\u00020/H&¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H&¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H&¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H'¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H&¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020;0AH'¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u000eH&¢\u0006\u0004\bE\u0010\u0011J\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH&¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH&¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020;0\u000eH'¢\u0006\u0004\bO\u0010\u0011J\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0PH&¢\u0006\u0004\bR\u0010SJ+\u0010W\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020U\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150V\u0012\u0006\u0012\u0004\u0018\u00010\u00010TH&¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH&¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H&¢\u0006\u0004\b^\u0010_J\u0015\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\\H&¢\u0006\u0004\ba\u0010_J\u000f\u0010c\u001a\u00020bH&¢\u0006\u0004\bc\u0010dJ\u0011\u0010f\u001a\u0004\u0018\u00010eH&¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH&¢\u0006\u0004\bi\u0010jJ\u0015\u0010k\u001a\b\u0012\u0004\u0012\u00020Q0AH&¢\u0006\u0004\bk\u0010CJ\u001d\u0010n\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u0015\u0018\u00010lH&¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u00020pH&¢\u0006\u0004\bq\u0010rJ!\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020t0s0AH'¢\u0006\u0004\bu\u0010Cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006vÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/rememberme/di/DiComponent;", "", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", Constants.KEY_CONFIG, "()Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "screenHeaderStyleUtils", "()Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "kmpRememberMe", "()Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "mapJWTTokenToWalletUseCase", "()Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "jwtTokenRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "walletScreenViewStateRepository", "Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "", "checkIsAccountAvailableUseCase", "()Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "checkIsAccountAvailablePrefilledUseCase", "Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "submitSavedCardUseCase", "()Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "Lcom/checkout/components/rememberme/model/RememberMeCallback;", "rememberMeCallback", "()Lcom/checkout/components/rememberme/model/RememberMeCallback;", "Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "logoutUseCase", "()Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "inputFieldStateMapper", "()Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelViewStyleMapper", "Lcom/checkout/components/ui/mapper/ButtonStyleToInternalStateMapper;", "buttonStyleToInternalStateMapper", "()Lcom/checkout/components/ui/mapper/ButtonStyleToInternalStateMapper;", "Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "buttonStyleToInternalStyleMapper", "()Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStateMapper", "()Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "countryPickerStyleUtils", "()Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "", "isRTL", "()Z", "Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "saveCardViewStateRepository", "()Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "hasInitialCheckedRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "()Lcom/checkout/components/interfaces/ui/ResourceProvider;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "()Lcom/checkout/components/interfaces/insight/Logger;", "Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "paymentStateRepository", "()Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "isAccountAvailableRepository", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "screenEventNavigationRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "onPayRememberMe", "()LXd/l;", "Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider", "()Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "", "Lcom/checkout/components/ui/model/CardScheme;", "supportedSchemes", "()Ljava/util/List;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedTypes", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "rmStateManager", "()Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;", "kmpRememberMeClickHandler", "()Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;", "screenRepository", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "()Lkotlin/jvm/functions/Function1;", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "()Lcom/checkout/components/interfaces/insight/LogDetails;", "", "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadataRepository", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DiComponent {
    @NotNull
    ButtonStyleToInternalStateMapper buttonStyleToInternalStateMapper();

    @NotNull
    ButtonStyleToInternalViewStyleMapper buttonStyleToInternalStyleMapper();

    @NotNull
    PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository();

    @NotNull
    SuspendUseCase<String, Unit> checkIsAccountAvailablePrefilledUseCase();

    @NotNull
    SuspendUseCase<String, Unit> checkIsAccountAvailableUseCase();

    @Nullable
    RememberMeConfiguration config();

    @NotNull
    CountryPickerStyleUtils countryPickerStyleUtils();

    @Nullable
    DesignTokens designTokens();

    @NotNull
    PrimitiveStateRepository<Boolean> hasInitialCheckedRepository();

    @NotNull
    InputFieldStyleToInputFieldStateMapper inputFieldStateMapper();

    @NotNull
    Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper();

    @NotNull
    PrimitiveStateFlowRepository<Boolean> isAccountAvailableRepository();

    boolean isRTL();

    @NotNull
    PrimitiveStateFlowRepository<String> jwtTokenRepository();

    @NotNull
    CheckoutKMPRememberMe kmpRememberMe();

    @NotNull
    KMPRememberMeClickHandler kmpRememberMeClickHandler();

    @NotNull
    LogDetails logDetails();

    @NotNull
    Logger logger();

    @NotNull
    LogoutUseCase logoutUseCase();

    @NotNull
    MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase();

    @Nullable
    Function1<CheckoutError, Unit> onError();

    @NotNull
    l onPayRememberMe();

    @NotNull
    PaymentStateRepository paymentStateRepository();

    @NotNull
    RememberMeCallback rememberMeCallback();

    @NotNull
    ResourceProvider resourceProvider();

    @NotNull
    RMStateManager rmStateManager();

    @NotNull
    SaveCardViewStateRepository saveCardViewStateRepository();

    @NotNull
    PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository();

    @NotNull
    ScreenHeaderStyleUtils screenHeaderStyleUtils();

    @NotNull
    PrimitiveStateRepository<RememberMeScreen> screenRepository();

    @NotNull
    DefaultStyleProvider styleProvider();

    @NotNull
    SubmitSavedCardUseCase submitSavedCardUseCase();

    @NotNull
    List<CardScheme> supportedSchemes();

    @NotNull
    List<CardTypeName> supportedTypes();

    @NotNull
    TextLabelStyleToStateMapper textLabelStateMapper();

    @NotNull
    Mapper<TextLabelStyle, TextLabelViewStyle> textLabelViewStyleMapper();

    @NotNull
    PrimitiveStateFlowRepository<GetWalletResponse> walletRepository();

    @NotNull
    PrimitiveStateFlowRepository<WalletScreenViewState> walletScreenViewStateRepository();
}
