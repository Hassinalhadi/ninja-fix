package com.checkout.components.card.ui.component.cardnumber;

import T.s;
import a0.ao;
import android.text.TextUtils;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.B;
import com.checkout.components.card.C0905u;
import com.checkout.components.card.C0907w;
import com.checkout.components.card.C0909y;
import com.checkout.components.card.D;
import com.checkout.components.card.F;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.model.CardNumberComponentStyle;
import com.checkout.components.card.model.CardNumberComponentViewStyleState;
import com.checkout.components.card.model.InfoBottomSheetViewStyleState;
import com.checkout.components.card.model.RetryCardMataDataApiContext;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.operations.validator.CardTypeValidator;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.operations.extensions.ValidationResultExtensionsKt;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.error.ValidationError;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bû\u0001\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012 \u0010\u001f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020#2\u0006\u0010.\u001a\u00020\u001dH\u0000¢\u0006\u0004\b/\u00100J\u0017\u00107\u001a\u0002042\u0006\u00103\u001a\u000202H\u0010¢\u0006\u0004\b5\u00106J\u0017\u0010<\u001a\u00020#2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020#0>2\u0006\u0010=\u001a\u000208H\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010D\u001a\u00020#H\u0001¢\u0006\u0004\bB\u0010CR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR%\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00028\u0006¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010C\u001a\u0004\bS\u0010TR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R1\u0010\u001f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001a8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR%\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR&\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0k0j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR,\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lcom/checkout/components/card/ui/component/cardnumber/CardNumberViewModel;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "styleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "stateMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "labelStyleMapper", "Lcom/checkout/components/ui/model/state/TextLabelState;", "labelStateMapper", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "containerMapper", "Lcom/checkout/components/card/operations/api/CardValidator;", "cardValidator", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/card/model/CardNumberComponentStyle;", "cardNumberStyle", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "cardMetaDataRepository", "Lcom/checkout/components/interfaces/usecase/UseCase;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "schemeChoiceUiVisibilityUseCase", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "Lkotlin/Function0;", "", "onChangeInvocation", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onCardBinChangedCallback", "Ljava/util/Locale;", "locale", "Lcom/checkout/components/card/operations/validator/CardTypeValidator;", "cardTypeValidator", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/operations/api/CardValidator;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/card/model/CardNumberComponentStyle;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;Lcom/checkout/components/interfaces/usecase/UseCase;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/util/Locale;Lcom/checkout/components/card/operations/validator/CardTypeValidator;)V", "cardScheme", "onCardSchemeSelected$card_standardRelease", "(Lcom/checkout/components/ui/model/CardScheme;)V", "onCardSchemeSelected", "", "char", "", "inputTextChangeFilter$card_standardRelease", "(C)Z", "inputTextChangeFilter", "", "validInputText", "onValidInputTextChanged$card_standardRelease", "(Ljava/lang/String;)V", "onValidInputTextChanged", "inputText", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate$card_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "resetIsValidCallbackTriggered$card_standardRelease", "()V", "resetIsValidCallbackTriggered", "g", "Lcom/checkout/components/interfaces/mapper/Mapper;", "getLabelStyleMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "h", "getLabelStateMapper", "i", "getContainerMapper", "k", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "getPaymentStateManager", "()Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "l", "Lcom/checkout/components/card/model/CardNumberComponentStyle;", "getCardNumberStyle", "()Lcom/checkout/components/card/model/CardNumberComponentStyle;", "getCardNumberStyle$annotations", "m", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "getResourceProvider", "()Lcom/checkout/components/interfaces/ui/ResourceProvider;", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "getCardMetaDataRepository", "()Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "o", "Lcom/checkout/components/interfaces/usecase/UseCase;", "getSchemeChoiceUiVisibilityUseCase", "()Lcom/checkout/components/interfaces/usecase/UseCase;", "p", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "q", "Lkotlin/jvm/functions/Function1;", "getOnCardBinChangedCallback", "()Lkotlin/jvm/functions/Function1;", "Lyf/at;", "", "s", "Lyf/at;", "getCardSchemeIconImageStyles$card_standardRelease", "()Lyf/at;", "cardSchemeIconImageStyles", "Lyf/L;", "u", "Lyf/L;", "getCardSchemeSelectionIconImageStyles$card_standardRelease", "()Lyf/L;", "cardSchemeSelectionIconImageStyles", "Lcom/checkout/components/card/model/CardNumberComponentViewStyleState;", "getViewStyleState$card_standardRelease", "()Lcom/checkout/components/card/model/CardNumberComponentViewStyleState;", "viewStyleState", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardNumberViewModel extends InputComponentViewModel {
    public static final int $stable = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Mapper labelStyleMapper;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Mapper labelStateMapper;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Mapper containerMapper;

    /* renamed from: j, reason: collision with root package name */
    private final CardValidator f4448j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PaymentStateManager paymentStateManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CardNumberComponentStyle cardNumberStyle;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ResourceProvider resourceProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CardMetaDataRepository cardMetaDataRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final UseCase schemeChoiceUiVisibilityUseCase;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final DesignTokens appearance;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCardBinChangedCallback;

    /* renamed from: r, reason: collision with root package name */
    private final CardTypeValidator f4456r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final at cardSchemeIconImageStyles;

    /* renamed from: t, reason: collision with root package name */
    private final at f4458t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final L cardSchemeSelectionIconImageStyles;

    /* renamed from: v, reason: collision with root package name */
    private final ax f4460v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberViewModel(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> labelStyleMapper, @NotNull Mapper<TextLabelStyle, TextLabelState> labelStateMapper, @NotNull Mapper<ContainerStyle, s> containerMapper, @NotNull CardValidator cardValidator, @NotNull PaymentStateManager paymentStateManager, @CardNumberStyle @NotNull CardNumberComponentStyle cardNumberStyle, @NotNull ResourceProvider resourceProvider, @NotNull CardMetaDataRepository cardMetaDataRepository, @NotNull UseCase<CardMetadata, Map<CardScheme, ImageStyle>> schemeChoiceUiVisibilityUseCase, @Nullable DesignTokens designTokens, @NotNull Function0<Unit> onChangeInvocation, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function1, @NotNull Locale locale, @NotNull CardTypeValidator cardTypeValidator) {
        super(styleMapper, stateMapper, cardNumberStyle.getInputStyle(), paymentStateManager, resourceProvider, onChangeInvocation);
        long j5;
        ColorTokens colorTokens;
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(labelStyleMapper, "labelStyleMapper");
        Intrinsics.echo(labelStateMapper, "labelStateMapper");
        Intrinsics.echo(containerMapper, "containerMapper");
        Intrinsics.echo(cardValidator, "cardValidator");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(cardNumberStyle, "cardNumberStyle");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(cardMetaDataRepository, "cardMetaDataRepository");
        Intrinsics.echo(schemeChoiceUiVisibilityUseCase, "schemeChoiceUiVisibilityUseCase");
        Intrinsics.echo(onChangeInvocation, "onChangeInvocation");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(cardTypeValidator, "cardTypeValidator");
        this.labelStyleMapper = labelStyleMapper;
        this.labelStateMapper = labelStateMapper;
        this.containerMapper = containerMapper;
        this.f4448j = cardValidator;
        this.paymentStateManager = paymentStateManager;
        this.cardNumberStyle = cardNumberStyle;
        this.resourceProvider = resourceProvider;
        this.cardMetaDataRepository = cardMetaDataRepository;
        this.schemeChoiceUiVisibilityUseCase = schemeChoiceUiVisibilityUseCase;
        this.appearance = designTokens;
        this.onCardBinChangedCallback = function1;
        this.f4456r = cardTypeValidator;
        this.cardSchemeIconImageStyles = AbstractC3428A.charlie(CollectionsKt.emptyList());
        N charlie = AbstractC3428A.charlie(t.alpha);
        this.f4458t = charlie;
        this.cardSchemeSelectionIconImageStyles = new av(charlie);
        TextLabelViewStyle map = labelStyleMapper.map(cardNumberStyle.getInfoTextStyle());
        ImageStyle infoImageStyle = cardNumberStyle.getInfoImageStyle();
        s map2 = containerMapper.map(cardNumberStyle.getContainerStyle());
        TextLabelState map3 = labelStateMapper.map(cardNumberStyle.getInfoTextStyle());
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            j5 = colorTokens.getColorAction();
        } else {
            j5 = 4279790335L;
        }
        this.f4460v = C0564b.zulu(new CardNumberComponentViewStyleState(map, map3, infoImageStyle, map2, ao.delta(j5), new InfoBottomSheetViewStyleState(labelStyleMapper.map(cardNumberStyle.getInfoBottomSheetStyle().getTitleStyle()), labelStateMapper.map(cardNumberStyle.getInfoBottomSheetStyle().getTitleStyle()), labelStyleMapper.map(cardNumberStyle.getInfoBottomSheetStyle().getDescriptionStyle()), labelStateMapper.map(cardNumberStyle.getInfoBottomSheetStyle().getDescriptionStyle()), cardNumberStyle.getInfoBottomSheetStyle().getCloseIconImageStyle(), ao.delta(cardNumberStyle.getInfoBottomSheetStyle().getContainerColor()), null), null));
        updateStyle$card_standardRelease(InputComponentViewStyle.copy$default(getStyle$card_standardRelease(), InputFieldViewStyle.copy$default(getStyle$card_standardRelease().getInputFieldStyle(), null, false, false, null, null, null, new CardNumberTransformation(paymentStateManager.getCardScheme(), TextUtils.getLayoutDirectionFromLocale(locale) == 1), null, null, false, 0, 0, null, null, null, 32703, null), null, null, 6, null));
        ad.zulu(T.hotel(this), null, null, new B(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new C0909y(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new F(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new D(this, null), 3);
    }

    private final ValidationResult a(String str, boolean z2, boolean z10) {
        if (!z2 && !z10) {
            CardValidator cardValidator = this.f4448j;
            CardMetadata cardMetadata = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
            String scheme = cardMetadata != null ? cardMetadata.getScheme() : null;
            CardMetadata cardMetadata2 = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
            return cardValidator.validatePartialCardNumber(str, scheme, cardMetadata2 != null ? cardMetadata2.getSchemeLocal() : null);
        }
        CardValidator cardValidator2 = this.f4448j;
        CardMetadata cardMetadata3 = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
        String scheme2 = cardMetadata3 != null ? cardMetadata3.getScheme() : null;
        CardMetadata cardMetadata4 = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
        return cardValidator2.validateFullCardNumber(str, scheme2, cardMetadata4 != null ? cardMetadata4.getSchemeLocal() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$executeWithRetry(CardNumberViewModel cardNumberViewModel, Function1 function1, Nd.c cVar) {
        C0905u c0905u;
        Object obj;
        Od.a aVar;
        int i4;
        Object obj2;
        RetryCardMataDataApiContext retryCardMataDataApiContext;
        RetryCardMataDataApiContext retryCardMataDataApiContext2;
        cardNumberViewModel.getClass();
        if (cVar instanceof C0905u) {
            c0905u = (C0905u) cVar;
            int i5 = c0905u.f4402f;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0905u.f4402f = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = c0905u.f4401d;
                aVar = Od.a.alpha;
                i4 = c0905u.f4402f;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            retryCardMataDataApiContext2 = c0905u.f4400c;
                            ResultKt.alpha(obj);
                            obj2 = ((Result) obj).alpha;
                            retryCardMataDataApiContext = RetryCardMataDataApiContext.copy$default(retryCardMataDataApiContext2, true, false, 2, null);
                            if ((obj2 instanceof k) && cardNumberViewModel.cardMetaDataRepository.isLastErrorRetryable()) {
                                retryCardMataDataApiContext = RetryCardMataDataApiContext.copy$default(retryCardMataDataApiContext, false, true, 1, null);
                            }
                            return new Pair(new Result(obj2), retryCardMataDataApiContext);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) c0905u.f4398a;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    c0905u.f4398a = function1;
                    c0905u.f4402f = 1;
                    obj = function1.invoke(c0905u);
                }
                obj2 = ((Result) obj).alpha;
                retryCardMataDataApiContext = new RetryCardMataDataApiContext(false, false);
                if ((obj2 instanceof k) && cardNumberViewModel.cardMetaDataRepository.isLastErrorRetryable()) {
                    c0905u.f4398a = null;
                    c0905u.f4399b = null;
                    c0905u.f4400c = retryCardMataDataApiContext;
                    c0905u.f4402f = 2;
                    obj = function1.invoke(c0905u);
                    if (obj != aVar) {
                        retryCardMataDataApiContext2 = retryCardMataDataApiContext;
                        obj2 = ((Result) obj).alpha;
                        retryCardMataDataApiContext = RetryCardMataDataApiContext.copy$default(retryCardMataDataApiContext2, true, false, 2, null);
                        if (obj2 instanceof k) {
                            retryCardMataDataApiContext = RetryCardMataDataApiContext.copy$default(retryCardMataDataApiContext, false, true, 1, null);
                        }
                    }
                    return aVar;
                }
                return new Pair(new Result(obj2), retryCardMataDataApiContext);
            }
        }
        c0905u = new C0905u(cardNumberViewModel, cVar);
        obj = c0905u.f4401d;
        aVar = Od.a.alpha;
        i4 = c0905u.f4402f;
        if (i4 == 0) {
        }
        obj2 = ((Result) obj).alpha;
        retryCardMataDataApiContext = new RetryCardMataDataApiContext(false, false);
        if (obj2 instanceof k) {
            c0905u.f4398a = null;
            c0905u.f4399b = null;
            c0905u.f4400c = retryCardMataDataApiContext;
            c0905u.f4402f = 2;
            obj = function1.invoke(c0905u);
            if (obj != aVar) {
            }
            return aVar;
        }
        return new Pair(new Result(obj2), retryCardMataDataApiContext);
    }

    public static final void access$handleCardMetaDataResult(CardNumberViewModel cardNumberViewModel, Object obj, RetryCardMataDataApiContext retryCardMataDataApiContext, String str, String str2) {
        N n5;
        Object value;
        N n10;
        Object value2;
        N n11;
        Object value3;
        N n12;
        Object value4;
        N n13;
        Object value5;
        cardNumberViewModel.getClass();
        Result.Companion companion = Result.INSTANCE;
        if (!(obj instanceof k)) {
            ((N) cardNumberViewModel.paymentStateManager.getCardMetadata()).india((CardMetadata) obj);
            cardNumberViewModel.validate$card_standardRelease(str2);
        }
        if (Result.m207exceptionOrNullimpl(obj) != null) {
            if (((Boolean) ((N) cardNumberViewModel.paymentStateManager.getIsValidCallbackTriggered()).getValue()).booleanValue()) {
                cardNumberViewModel.a(str2);
            }
            if (retryCardMataDataApiContext.getSecondTimeRetryable()) {
                ValidationResult a6 = cardNumberViewModel.a(str2, ((Boolean) cardNumberViewModel.getIsOnFocusChangedInvoked().getValue()).booleanValue(), ((Boolean) ((N) cardNumberViewModel.paymentStateManager.getIsCardValidationTriggered()).getValue()).booleanValue());
                if (a6 instanceof ValidationResult.Success) {
                    ValidationResult.Success success = (ValidationResult.Success) a6;
                    CardScheme cardScheme = (CardScheme) success.getValue();
                    at cardScheme2 = cardNumberViewModel.paymentStateManager.getCardScheme();
                    do {
                        n11 = (N) cardScheme2;
                        value3 = n11.getValue();
                    } while (!n11.hotel(value3, cardScheme));
                    N n14 = (N) cardNumberViewModel.paymentStateManager.getMerchantCardNotSupportedErrorMessage();
                    n14.getClass();
                    n14.juliet(null, "");
                    cardNumberViewModel.getState$card_standardRelease().getInputFieldState().getMaxLength().setValue(CollectionsKt.plum(((CardScheme) success.getValue()).getLengths()));
                    at isCardNumberValid = cardNumberViewModel.paymentStateManager.getIsCardNumberValid();
                    do {
                        n12 = (N) isCardNumberValid;
                        value4 = n12.getValue();
                        ((Boolean) value4).getClass();
                    } while (!n12.hotel(value4, Boolean.valueOf(ValidationResultExtensionsKt.isValid(a6))));
                    at cardMetadata = cardNumberViewModel.paymentStateManager.getCardMetadata();
                    do {
                        n13 = (N) cardMetadata;
                        value5 = n13.getValue();
                    } while (!n13.hotel(value5, new CardMetadata(CardSchemeExtensionsKt.toSchemeName((CardScheme) success.getValue()), null, null, null, null, null, null, null, null, null, null, null, str, null, null, 28670, null)));
                    return;
                }
                if (a6 instanceof ValidationResult.Failure) {
                    at isCardNumberValid2 = cardNumberViewModel.paymentStateManager.getIsCardNumberValid();
                    do {
                        n10 = (N) isCardNumberValid2;
                        value2 = n10.getValue();
                        ((Boolean) value2).getClass();
                    } while (!n10.hotel(value2, Boolean.FALSE));
                    cardNumberViewModel.showError$card_standardRelease(((ValidationResult.Failure) a6).getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            at cardMetadata2 = cardNumberViewModel.paymentStateManager.getCardMetadata();
            do {
                n5 = (N) cardMetadata2;
                value = n5.getValue();
            } while (!n5.hotel(value, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$processCardBinChangedCallback(CardNumberViewModel cardNumberViewModel, CardMetadata cardMetadata) {
        CallbackResult callbackResult;
        Function1 function1 = cardNumberViewModel.onCardBinChangedCallback;
        String str = null;
        if (function1 != null) {
            callbackResult = (CallbackResult) function1.invoke(cardMetadata);
        } else {
            callbackResult = null;
        }
        if (!(callbackResult instanceof CallbackResult.Accepted) && callbackResult != null) {
            if (callbackResult instanceof CallbackResult.Rejected) {
                String errorMessage = ((CallbackResult.Rejected) callbackResult).getErrorMessage();
                if (errorMessage != null) {
                    if (errorMessage.length() > 0) {
                        str = errorMessage;
                    }
                }
                str = CommonExtensionsKt.prepareCardSchemeNotSupportedMessage((CardScheme) ((N) cardNumberViewModel.paymentStateManager.getCardScheme()).getValue(), cardNumberViewModel.resourceProvider);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            str = "";
        }
        ((N) cardNumberViewModel.paymentStateManager.getMerchantCardNotSupportedErrorMessage()).india(str);
    }

    @CardNumberStyle
    public static /* synthetic */ void getCardNumberStyle$annotations() {
    }

    @Nullable
    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    @NotNull
    public final CardMetaDataRepository getCardMetaDataRepository() {
        return this.cardMetaDataRepository;
    }

    @NotNull
    public final CardNumberComponentStyle getCardNumberStyle() {
        return this.cardNumberStyle;
    }

    @NotNull
    /* renamed from: getCardSchemeIconImageStyles$card_standardRelease, reason: from getter */
    public final at getCardSchemeIconImageStyles() {
        return this.cardSchemeIconImageStyles;
    }

    @NotNull
    /* renamed from: getCardSchemeSelectionIconImageStyles$card_standardRelease, reason: from getter */
    public final L getCardSchemeSelectionIconImageStyles() {
        return this.cardSchemeSelectionIconImageStyles;
    }

    @NotNull
    public final Mapper<ContainerStyle, s> getContainerMapper() {
        return this.containerMapper;
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelState> getLabelStateMapper() {
        return this.labelStateMapper;
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelViewStyle> getLabelStyleMapper() {
        return this.labelStyleMapper;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> getOnCardBinChangedCallback() {
        return this.onCardBinChangedCallback;
    }

    @NotNull
    public final PaymentStateManager getPaymentStateManager() {
        return this.paymentStateManager;
    }

    @NotNull
    public final ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @NotNull
    public final UseCase<CardMetadata, Map<CardScheme, ImageStyle>> getSchemeChoiceUiVisibilityUseCase() {
        return this.schemeChoiceUiVisibilityUseCase;
    }

    @NotNull
    public final CardNumberComponentViewStyleState getViewStyleState$card_standardRelease() {
        return (CardNumberComponentViewStyleState) this.f4460v.getValue();
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final boolean inputTextChangeFilter$card_standardRelease(char r12) {
        return Character.isDigit(r12);
    }

    public final void onCardSchemeSelected$card_standardRelease(@NotNull CardScheme cardScheme) {
        Intrinsics.echo(cardScheme, "cardScheme");
        N n5 = (N) this.paymentStateManager.getPreferredCardScheme();
        n5.getClass();
        n5.juliet(null, cardScheme);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final void onValidInputTextChanged$card_standardRelease(@NotNull String validInputText) {
        N n5;
        Object value;
        N n10;
        Object value2;
        Intrinsics.echo(validInputText, "validInputText");
        PaymentStateManager paymentStateManager = this.paymentStateManager;
        if (validInputText.length() >= 8 && ((N) paymentStateManager.getCardMetadata()).getValue() == null && ((CharSequence) ((N) paymentStateManager.getCardNumber()).getValue()).length() == 0) {
            ad.zulu(T.hotel(this), null, null, new C0907w(validInputText, this, null), 3);
        } else if (validInputText.length() == 8 && ((N) paymentStateManager.getCardMetadata()).getValue() == null) {
            ad.zulu(T.hotel(this), null, null, new C0907w(validInputText, this, null), 3);
        } else if (validInputText.length() < 8) {
            at cardMetadata = paymentStateManager.getCardMetadata();
            do {
                n5 = (N) cardMetadata;
                value = n5.getValue();
            } while (!n5.hotel(value, null));
        }
        getState$card_standardRelease().getInputFieldState().getText().setValue(validInputText);
        at cardNumber = paymentStateManager.getCardNumber();
        do {
            n10 = (N) cardNumber;
            value2 = n10.getValue();
        } while (!n10.hotel(value2, validInputText));
    }

    public final void resetIsValidCallbackTriggered$card_standardRelease() {
        N n5;
        Object value;
        if (((Boolean) ((N) this.paymentStateManager.getIsValidCallbackTriggered()).getValue()).booleanValue()) {
            at isValidCallbackTriggered = this.paymentStateManager.getIsValidCallbackTriggered();
            do {
                n5 = (N) isValidCallbackTriggered;
                value = n5.getValue();
                ((Boolean) value).getClass();
            } while (!n5.hotel(value, Boolean.FALSE));
        }
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    @NotNull
    public final ValidationResult<Unit> validate$card_standardRelease(@NotNull String inputText) {
        N n5;
        Object value;
        N n10;
        Object value2;
        N n11;
        Object value3;
        Intrinsics.echo(inputText, "inputText");
        if (((Boolean) ((N) this.paymentStateManager.getIsValidCallbackTriggered()).getValue()).booleanValue()) {
            a(inputText);
        }
        ValidationResult a6 = a(inputText, ((Boolean) getIsOnFocusChangedInvoked().getValue()).booleanValue(), ((Boolean) ((N) this.paymentStateManager.getIsCardValidationTriggered()).getValue()).booleanValue());
        if (a6 instanceof ValidationResult.Success) {
            if (inputText.length() < 8) {
                CardScheme cardScheme = (CardScheme) ((ValidationResult.Success) a6).getValue();
                at cardScheme2 = this.paymentStateManager.getCardScheme();
                do {
                    n11 = (N) cardScheme2;
                    value3 = n11.getValue();
                } while (!n11.hotel(value3, cardScheme));
                N n12 = (N) this.paymentStateManager.getMerchantCardNotSupportedErrorMessage();
                n12.getClass();
                n12.juliet(null, "");
            } else if (((N) this.paymentStateManager.getPreferredCardScheme()).getValue() == CardScheme.UNKNOWN && inputText.length() >= 8 && ((N) this.paymentStateManager.getCardMetadata()).getValue() != null) {
                CardScheme cardScheme3 = (CardScheme) ((ValidationResult.Success) a6).getValue();
                at cardScheme4 = this.paymentStateManager.getCardScheme();
                do {
                    n10 = (N) cardScheme4;
                    value2 = n10.getValue();
                } while (!n10.hotel(value2, cardScheme3));
            }
            getState$card_standardRelease().getInputFieldState().getMaxLength().setValue(CollectionsKt.plum(((CardScheme) ((ValidationResult.Success) a6).getValue()).getLengths()));
            return a(new ValidationResult.Success(Unit.INSTANCE));
        }
        if (a6 instanceof ValidationResult.Failure) {
            at isCardNumberValid = this.paymentStateManager.getIsCardNumberValid();
            do {
                n5 = (N) isCardNumberValid;
                value = n5.getValue();
                ((Boolean) value).getClass();
            } while (!n5.hotel(value, Boolean.FALSE));
            return a(a6);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ValidationResult a(ValidationResult validationResult) {
        N n5;
        Object value;
        N n10;
        Object value2;
        if (((CharSequence) ((N) this.paymentStateManager.getMerchantCardNotSupportedErrorMessage()).getValue()).length() == 0) {
            at isCardNumberValid = this.paymentStateManager.getIsCardNumberValid();
            do {
                n10 = (N) isCardNumberValid;
                value2 = n10.getValue();
                ((Boolean) value2).getClass();
            } while (!n10.hotel(value2, Boolean.valueOf(ValidationResultExtensionsKt.isValid(validationResult))));
            return validationResult;
        }
        at isCardNumberValid2 = this.paymentStateManager.getIsCardNumberValid();
        do {
            n5 = (N) isCardNumberValid2;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        return new ValidationResult.Failure(new ValidationError(ValidationError.CARD_NOT_SUPPORTED, (String) ((N) this.paymentStateManager.getMerchantCardNotSupportedErrorMessage()).getValue()));
    }

    private final void a(String str) {
        N n5;
        Object value;
        N n10;
        Object value2;
        CardValidator cardValidator = this.f4448j;
        CardMetadata cardMetadata = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
        String scheme = cardMetadata != null ? cardMetadata.getScheme() : null;
        CardMetadata cardMetadata2 = (CardMetadata) ((N) this.paymentStateManager.getCardMetadata()).getValue();
        ValidationResult<CardScheme> validateFullCardNumber = cardValidator.validateFullCardNumber(str, scheme, cardMetadata2 != null ? cardMetadata2.getSchemeLocal() : null);
        if (validateFullCardNumber instanceof ValidationResult.Success) {
            at isCardNumberValidForFullCardValidation = this.paymentStateManager.getIsCardNumberValidForFullCardValidation();
            do {
                n10 = (N) isCardNumberValidForFullCardValidation;
                value2 = n10.getValue();
                ((Boolean) value2).getClass();
            } while (!n10.hotel(value2, Boolean.TRUE));
            resetIsValidCallbackTriggered$card_standardRelease();
            return;
        }
        if (validateFullCardNumber instanceof ValidationResult.Failure) {
            at isCardNumberValidForFullCardValidation2 = this.paymentStateManager.getIsCardNumberValidForFullCardValidation();
            do {
                n5 = (N) isCardNumberValidForFullCardValidation2;
                value = n5.getValue();
                ((Boolean) value).getClass();
            } while (!n5.hotel(value, Boolean.FALSE));
            resetIsValidCallbackTriggered$card_standardRelease();
            hideError$card_standardRelease();
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
