package com.checkout.components.rememberme.wallet;

import Af.n;
import Cb.ac;
import Cf.d;
import Cf.e;
import F4.b;
import Lb.ae;
import Xd.l;
import Yb.C0312j0;
import androidx.compose.runtime.C0564b;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.f2;
import com.checkout.components.rememberme.j2;
import com.checkout.components.rememberme.k2;
import com.checkout.components.rememberme.l2;
import com.checkout.components.rememberme.model.CardDetails;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.PaymentMethod;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.SchemeImageStyle;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.model.WalletScreenStyle;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.n2;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import com.checkout.components.ui.utils.extensions.CardTypeExtensionsKt;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1534h0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC3220y;
import vf.I;
import vf.ad;
import vf.ao;
import yf.L;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B§\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012*\u0010\u0013\u001a&\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b\u0012\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110&0%\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020201\u0012\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110*\u0012\b\b\u0002\u00105\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J)\u0010=\u001a\u00020+2\b\u00108\u001a\u0004\u0018\u00010\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000eH\u0001¢\u0006\u0004\b;\u0010<J\u0017\u0010A\u001a\u00020+2\u0006\u0010>\u001a\u00020\u000eH\u0001¢\u0006\u0004\b?\u0010@J\u000f\u0010D\u001a\u00020+H\u0001¢\u0006\u0004\bB\u0010CJ\u000f\u0010H\u001a\u00020EH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010M\u001a\u00020!2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bK\u0010LJ\u000f\u0010O\u001a\u00020+H\u0000¢\u0006\u0004\bN\u0010CJ\u0017\u0010S\u001a\u00020+2\u0006\u0010P\u001a\u00020!H\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020+2\u0006\u0010T\u001a\u00020!H\u0000¢\u0006\u0004\bU\u0010RJ\u0017\u0010Y\u001a\u00020+2\u0006\u0010W\u001a\u00020\u000eH\u0000¢\u0006\u0004\bX\u0010@R\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010g\u001a\b\u0012\u0004\u0012\u00020d0^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010bR\u0014\u0010k\u001a\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lcom/checkout/components/rememberme/wallet/WalletScreenViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/rememberme/wallet/WalletCvvDelegate;", "walletCvvDelegate", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "Lcom/checkout/components/rememberme/model/WalletScreenStyle;", "style", "Lkotlin/Function2;", "", "LNd/c;", "Lkotlin/Result;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "", "onSendCardMetaDataRequest", "Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "paymentStateRepository", "Lcom/checkout/components/rememberme/usecase/LogoutUseCase;", "logoutUseCase", "Lvf/y;", "mainDispatcher", "Ljava/util/Calendar;", "utcCalendar", "", "Lcom/checkout/components/ui/model/CardScheme;", "supportedSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedTypes", "", "showPayButton", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "stateRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "", "cardMetadataRepository", "Lcom/checkout/components/rememberme/model/RememberMeCallback;", "rememberMeCallback", "Lkotlin/Function0;", "", "addCardView", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "rmStateManager", "Lcom/checkout/components/rememberme/wallet/WalletButtonDelegate;", "walletButtonDelegate", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "screenEventNavigationRepository", "rememberMeAddCardMetadataProvider", "ioDispatcher", "<init>", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/rememberme/wallet/WalletCvvDelegate;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/rememberme/model/WalletScreenStyle;LXd/l;Lcom/checkout/components/rememberme/data/PaymentStateRepository;Lcom/checkout/components/rememberme/usecase/LogoutUseCase;Lvf/y;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;ZLcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;Lcom/checkout/components/rememberme/model/RememberMeCallback;LXd/l;Lcom/checkout/components/rememberme/ui/manager/RMStateManager;Lcom/checkout/components/rememberme/wallet/WalletButtonDelegate;Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;Lkotlin/jvm/functions/Function0;Lvf/y;)V", "rejectedMessage", "cardScheme", "unsupportedCardId", "handleUnsupportedCard$rememberme_standardRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "handleUnsupportedCard", Constants.KEY_MESSAGE, "updateErrorMessage$rememberme_standardRelease", "(Ljava/lang/String;)V", "updateErrorMessage", "onRetriggerCardBinChanged$rememberme_standardRelease", "()V", "onRetriggerCardBinChanged", "Lvf/I;", "onPayButtonClick$rememberme_standardRelease", "()Lvf/I;", "onPayButtonClick", "Lcom/checkout/components/rememberme/model/CardDetails;", "cardDetails", "isCardExpired$rememberme_standardRelease", "(Lcom/checkout/components/rememberme/model/CardDetails;)Z", "isCardExpired", "onLogoutClick$rememberme_standardRelease", "onLogoutClick", "checked", "onDefaultPaymentCheckedChange$rememberme_standardRelease", "(Z)V", "onDefaultPaymentCheckedChange", "isFocused", "onCvvFocusChanged$rememberme_standardRelease", "onCvvFocusChanged", "inputText", "onCvvInputTextChanged$rememberme_standardRelease", "onCvvInputTextChanged", "k", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "getStateRepository$rememberme_standardRelease", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lyf/L;", "s", "Lyf/L;", "getState$rememberme_standardRelease", "()Lyf/L;", "state", "Lcom/checkout/components/interfaces/model/PaymentState;", "t", "getPaymentStateFlow$rememberme_standardRelease", "paymentStateFlow", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "getCvvComponent$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/InputComponentViewItem;", "cvvComponent", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletScreenViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: v */
    private static final int f6378v = R.drawable.cko_ic_card;

    /* renamed from: a */
    private final WalletCvvDelegate f6379a;

    /* renamed from: b */
    private final ResourceProvider f6380b;

    /* renamed from: c */
    private final PrimitiveStateFlowRepository f6381c;

    /* renamed from: d */
    private final WalletScreenStyle f6382d;
    private final l e;

    /* renamed from: f */
    private final LogoutUseCase f6383f;

    /* renamed from: g */
    private final Calendar f6384g;

    /* renamed from: h */
    private final List f6385h;

    /* renamed from: i */
    private final List f6386i;

    /* renamed from: j */
    private final boolean f6387j;

    /* renamed from: k, reason: from kotlin metadata */
    private final PrimitiveStateFlowRepository stateRepository;

    /* renamed from: l */
    private final PrimitiveStateRepository f6389l;

    /* renamed from: m */
    private final RememberMeCallback f6390m;

    /* renamed from: n */
    private final RMStateManager f6391n;

    /* renamed from: o */
    private final WalletButtonDelegate f6392o;

    /* renamed from: p */
    private final PrimitiveSharedFlowRepository f6393p;

    /* renamed from: q */
    private final Function0 f6394q;

    /* renamed from: r */
    private final AbstractC3220y f6395r;

    /* renamed from: s, reason: from kotlin metadata */
    private final L state;

    /* renamed from: t, reason: from kotlin metadata */
    private final L paymentStateFlow;

    /* renamed from: u */
    private final WalletListItem f6398u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WalletScreenViewModel(DesignTokens designTokens, WalletCvvDelegate walletCvvDelegate, ResourceProvider resourceProvider, PrimitiveStateFlowRepository primitiveStateFlowRepository, WalletScreenStyle walletScreenStyle, l lVar, PaymentStateRepository paymentStateRepository, LogoutUseCase logoutUseCase, AbstractC3220y abstractC3220y, Calendar calendar, List list, List list2, boolean z2, PrimitiveStateFlowRepository primitiveStateFlowRepository2, PrimitiveStateRepository primitiveStateRepository, RememberMeCallback rememberMeCallback, l lVar2, RMStateManager rMStateManager, WalletButtonDelegate walletButtonDelegate, PrimitiveSharedFlowRepository primitiveSharedFlowRepository, Function0 function0, AbstractC3220y abstractC3220y2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(designTokens, walletCvvDelegate, resourceProvider, primitiveStateFlowRepository, walletScreenStyle, lVar, paymentStateRepository, logoutUseCase, r11, r12, list, list2, z2, primitiveStateFlowRepository2, primitiveStateRepository, rememberMeCallback, lVar2, rMStateManager, walletButtonDelegate, primitiveSharedFlowRepository, function0, r24);
        AbstractC3220y abstractC3220y3;
        Calendar calendar2;
        AbstractC3220y abstractC3220y4;
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            e eVar = ao.alpha;
            abstractC3220y3 = n.alpha;
        } else {
            abstractC3220y3 = abstractC3220y;
        }
        if ((i4 & 512) != 0) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(new Date());
            calendar2 = calendar3;
        } else {
            calendar2 = calendar;
        }
        if ((i4 & 2097152) != 0) {
            e eVar2 = ao.alpha;
            abstractC3220y4 = d.purple;
        } else {
            abstractC3220y4 = abstractC3220y2;
        }
    }

    public static final Unit a(WalletScreenViewModel walletScreenViewModel) {
        walletScreenViewModel.f6379a.resetInputState$rememberme_standardRelease();
        walletScreenViewModel.onRetriggerCardBinChanged$rememberme_standardRelease();
        PrimitiveStateFlowRepository primitiveStateFlowRepository = walletScreenViewModel.stateRepository;
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) primitiveStateFlowRepository.getFlow().getValue();
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) (walletScreenViewState != null ? WalletScreenViewState.copy$default(walletScreenViewState, com.checkout.components.rememberme.utils.Constants.ADD_CARD_ITEM_ID, null, null, null, null, null, false, null, null, false, null, 2046, null) : null));
        RememberMeCallback rememberMeCallback = walletScreenViewModel.f6390m;
        if (rememberMeCallback != null) {
            rememberMeCallback.getOnChange().invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit bravo(WalletScreenViewModel walletScreenViewModel) {
        return a(walletScreenViewModel);
    }

    public static /* synthetic */ Unit delta(WalletScreenViewModel walletScreenViewModel, String str) {
        return a(walletScreenViewModel, str);
    }

    @NotNull
    public final InputComponentViewItem getCvvComponent$rememberme_standardRelease() {
        return this.f6379a.getCvvComponent$rememberme_standardRelease().getState();
    }

    @NotNull
    /* renamed from: getPaymentStateFlow$rememberme_standardRelease, reason: from getter */
    public final L getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    @NotNull
    /* renamed from: getState$rememberme_standardRelease, reason: from getter */
    public final L getState() {
        return this.state;
    }

    @NotNull
    public final PrimitiveStateFlowRepository<WalletScreenViewState> getStateRepository$rememberme_standardRelease() {
        return this.stateRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleUnsupportedCard$rememberme_standardRelease(@Nullable String rejectedMessage, @NotNull String cardScheme, @NotNull String unsupportedCardId) {
        Intrinsics.echo(cardScheme, "cardScheme");
        Intrinsics.echo(unsupportedCardId, "unsupportedCardId");
        String str = null;
        if (rejectedMessage != null) {
            if (StringsKt.gray(rejectedMessage)) {
                rejectedMessage = null;
            }
        }
        ResourceProvider resourceProvider = this.f6380b;
        int i4 = R.string.cko_card_number_not_supported;
        CardScheme cardScheme2 = CardSchemeExtensionsKt.toCardScheme(CardSchemeExtensionsKt.normalizeSchemeName(cardScheme));
        if (cardScheme2 != null) {
            str = cardScheme2.name();
        }
        if (str == null) {
            str = "";
        }
        rejectedMessage = resourceProvider.getString(i4, str);
        this.stateRepository.update((Function1) new ac(unsupportedCardId, this, rejectedMessage));
    }

    public final boolean isCardExpired$rememberme_standardRelease(@NotNull CardDetails cardDetails) {
        Integer expiryYear;
        Intrinsics.echo(cardDetails, "cardDetails");
        if (cardDetails.getExpiryMonth() == null || cardDetails.getExpiryYear() == null) {
            return false;
        }
        int i4 = this.f6384g.get(1);
        int i5 = this.f6384g.get(2) + 1;
        if (cardDetails.getExpiryYear().intValue() >= i4 && ((expiryYear = cardDetails.getExpiryYear()) == null || expiryYear.intValue() != i4 || cardDetails.getExpiryMonth().intValue() >= i5)) {
            return false;
        }
        return true;
    }

    public final void onCvvFocusChanged$rememberme_standardRelease(boolean isFocused) {
        this.f6379a.onFocusChanged$rememberme_standardRelease(isFocused);
    }

    public final void onCvvInputTextChanged$rememberme_standardRelease(@NotNull String inputText) {
        Intrinsics.echo(inputText, "inputText");
        this.f6379a.onInputTextChanged(inputText, new C1534h0(7, this));
    }

    public final void onDefaultPaymentCheckedChange$rememberme_standardRelease(boolean checked) {
        WalletScreenViewState walletScreenViewState;
        PrimitiveStateFlowRepository primitiveStateFlowRepository = this.stateRepository;
        WalletScreenViewState walletScreenViewState2 = (WalletScreenViewState) primitiveStateFlowRepository.getFlow().getValue();
        if (walletScreenViewState2 != null) {
            walletScreenViewState = WalletScreenViewState.copy$default(walletScreenViewState2, null, null, null, null, null, null, checked, null, null, false, null, 1983, null);
        } else {
            walletScreenViewState = null;
        }
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) walletScreenViewState);
    }

    public final void onLogoutClick$rememberme_standardRelease() {
        ad.zulu(T.hotel(this), null, null, new k2(this, null), 3);
    }

    @NotNull
    public final I onPayButtonClick$rememberme_standardRelease() {
        return ad.zulu(T.hotel(this), null, null, new l2(this, null), 3);
    }

    public final void onRetriggerCardBinChanged$rememberme_standardRelease() {
        String str;
        CardMetadata cardMetadata;
        RememberMeCallback rememberMeCallback;
        Function1<CardMetadata, CallbackResult> onCardBinChanged;
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.state.getValue();
        if (walletScreenViewState != null) {
            str = walletScreenViewState.getSelectedMethodId();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, com.checkout.components.rememberme.utils.Constants.ADD_CARD_ITEM_ID) && (cardMetadata = (CardMetadata) this.f6394q.invoke()) != null && (rememberMeCallback = this.f6390m) != null && (onCardBinChanged = rememberMeCallback.getOnCardBinChanged()) != null) {
            onCardBinChanged.invoke(cardMetadata);
        }
    }

    public final void updateErrorMessage$rememberme_standardRelease(@NotNull String r19) {
        Intrinsics.echo(r19, "message");
        PrimitiveStateFlowRepository primitiveStateFlowRepository = this.stateRepository;
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.state.getValue();
        WalletScreenViewState walletScreenViewState2 = null;
        if (walletScreenViewState != null) {
            walletScreenViewState2 = WalletScreenViewState.copy$default(walletScreenViewState, null, null, TextLabelViewItem.copy$default(this.f6382d.getErrorLabelViewItem(), null, TextLabelState.copy$default(this.f6382d.getErrorLabelViewItem().getState(), C0564b.zulu(r19), null, null, 6, null), 1, null), null, null, null, false, null, null, false, null, 2043, null);
        }
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) walletScreenViewState2);
    }

    public static final WalletScreenViewState a(String str, WalletScreenViewModel walletScreenViewModel, String str2, WalletScreenViewState walletScreenViewState) {
        int collectionSizeOrDefault;
        if (walletScreenViewState == null) {
            return null;
        }
        List<WalletListItem> walletListItems = walletScreenViewState.getWalletListItems();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(walletListItems, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WalletListItem walletListItem : walletListItems) {
            if (Intrinsics.areEqual(walletListItem.getId(), str)) {
                walletListItem = WalletListItem.copy$default(walletListItem, null, null, null, false, false, false, null, null, null, null, TextLabelViewItem.copy$default(walletScreenViewModel.f6382d.getInfoLabelViewItem(), null, TextLabelState.copy$default(walletScreenViewModel.f6382d.getInfoLabelViewItem().getState(), C0564b.zulu(str2), null, null, 6, null), 1, null), null, false, null, 15343, null);
            }
            arrayList.add(walletListItem);
        }
        return WalletScreenViewState.copy$default(walletScreenViewState, "", null, null, null, null, null, false, null, arrayList, false, null, 1790, null);
    }

    public WalletScreenViewModel(@Nullable DesignTokens designTokens, @NotNull WalletCvvDelegate walletCvvDelegate, @NotNull ResourceProvider resourceProvider, @NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull WalletScreenStyle style, @NotNull l onSendCardMetaDataRequest, @NotNull PaymentStateRepository paymentStateRepository, @NotNull LogoutUseCase logoutUseCase, @NotNull AbstractC3220y mainDispatcher, @NotNull Calendar utcCalendar, @NotNull List<? extends CardScheme> supportedSchemes, @NotNull List<? extends CardTypeName> supportedTypes, boolean z2, @NotNull PrimitiveStateFlowRepository<WalletScreenViewState> stateRepository, @NotNull PrimitiveStateRepository<Map<String, CardMetadata>> cardMetadataRepository, @Nullable RememberMeCallback rememberMeCallback, @NotNull l addCardView, @NotNull RMStateManager rmStateManager, @NotNull WalletButtonDelegate walletButtonDelegate, @NotNull PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository, @NotNull Function0<CardMetadata> rememberMeAddCardMetadataProvider, @NotNull AbstractC3220y ioDispatcher) {
        Intrinsics.echo(walletCvvDelegate, "walletCvvDelegate");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(onSendCardMetaDataRequest, "onSendCardMetaDataRequest");
        Intrinsics.echo(paymentStateRepository, "paymentStateRepository");
        Intrinsics.echo(logoutUseCase, "logoutUseCase");
        Intrinsics.echo(mainDispatcher, "mainDispatcher");
        Intrinsics.echo(utcCalendar, "utcCalendar");
        Intrinsics.echo(supportedSchemes, "supportedSchemes");
        Intrinsics.echo(supportedTypes, "supportedTypes");
        Intrinsics.echo(stateRepository, "stateRepository");
        Intrinsics.echo(cardMetadataRepository, "cardMetadataRepository");
        Intrinsics.echo(addCardView, "addCardView");
        Intrinsics.echo(rmStateManager, "rmStateManager");
        Intrinsics.echo(walletButtonDelegate, "walletButtonDelegate");
        Intrinsics.echo(screenEventNavigationRepository, "screenEventNavigationRepository");
        Intrinsics.echo(rememberMeAddCardMetadataProvider, "rememberMeAddCardMetadataProvider");
        Intrinsics.echo(ioDispatcher, "ioDispatcher");
        this.f6379a = walletCvvDelegate;
        this.f6380b = resourceProvider;
        this.f6381c = walletRepository;
        this.f6382d = style;
        this.e = onSendCardMetaDataRequest;
        this.f6383f = logoutUseCase;
        this.f6384g = utcCalendar;
        this.f6385h = supportedSchemes;
        this.f6386i = supportedTypes;
        this.f6387j = z2;
        this.stateRepository = stateRepository;
        this.f6389l = cardMetadataRepository;
        this.f6390m = rememberMeCallback;
        this.f6391n = rmStateManager;
        this.f6392o = walletButtonDelegate;
        this.f6393p = screenEventNavigationRepository;
        this.f6394q = rememberMeAddCardMetadataProvider;
        this.f6395r = ioDispatcher;
        this.state = stateRepository.getFlow();
        this.paymentStateFlow = paymentStateRepository.getFlow();
        this.f6398u = new WalletListItem(com.checkout.components.rememberme.utils.Constants.ADD_CARD_ITEM_ID, null, new SchemeImageStyle(new ImageStyle(Integer.valueOf(f6378v), Long.valueOf(Utils.INSTANCE.primaryColor(designTokens)), null, null, null, null, null, null, 252, null), null), false, true, false, style.getExpiredLabelViewItem(), style.getDefaultLabelViewItem(), TextLabelViewItem.copy$default(style.getTextLabelViewItem(), null, TextLabelState.copy$default(style.getTextLabelViewItem().getState(), C0564b.zulu(resourceProvider.getString(com.checkout.components.rememberme.R.string.cko_remember_me_card)), null, null, 6, null), 1, null), style.getInfoImageStyle(), style.getInfoLabelViewItem(), new C0312j0(27, this), false, addCardView, 2, null);
        ad.zulu(T.hotel(this), mainDispatcher, null, new j2(this, null), 2);
        ad.zulu(T.hotel(this), null, null, new n2(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new f2(this, null), 3);
    }

    public final WalletScreenViewState a(GetWalletResponse getWalletResponse) {
        Object obj;
        String str;
        int collectionSizeOrDefault;
        ImageStyle imageStyle;
        String string;
        boolean z2;
        TextLabelViewItem infoLabelViewItem;
        Integer imageId;
        CardScheme determineCvvSupportedLocalScheme;
        String normalizeSchemeName;
        if (getWalletResponse == null) {
            return null;
        }
        Iterator<T> it = getWalletResponse.getPaymentMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            List list = this.f6385h;
            String scheme = paymentMethod.getCardDetails().getScheme();
            if (CollectionsKt.bronze(list, (scheme == null || (normalizeSchemeName = CardSchemeExtensionsKt.normalizeSchemeName(scheme)) == null) ? null : CardSchemeExtensionsKt.toCardScheme(normalizeSchemeName)) && CollectionsKt.bronze(this.f6386i, CardTypeName.INSTANCE.fromString(paymentMethod.getCardDetails().getCardType()))) {
                break;
            }
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) obj;
        if (paymentMethod2 == null || (str = paymentMethod2.getId()) == null) {
            str = com.checkout.components.rememberme.utils.Constants.ADD_CARD_ITEM_ID;
        }
        String str2 = str;
        CardScheme determineScheme = paymentMethod2 != null ? ExtensionsKt.determineScheme(paymentMethod2) : null;
        if (paymentMethod2 != null && (determineCvvSupportedLocalScheme = ExtensionsKt.determineCvvSupportedLocalScheme(paymentMethod2)) != null) {
            WalletCvvDelegate walletCvvDelegate = this.f6379a;
            walletCvvDelegate.setMaxCvvLength$rememberme_standardRelease(Integer.valueOf(walletCvvDelegate.findMaxCvvLength$rememberme_standardRelease(determineScheme, determineCvvSupportedLocalScheme)));
        }
        RememberMeCallback rememberMeCallback = this.f6390m;
        if (rememberMeCallback != null) {
            rememberMeCallback.getOnChange().invoke();
        }
        TextLabelViewItem emailItem = this.f6382d.getEmailItem();
        TextLabelState state = this.f6382d.getEmailItem().getState();
        String email = getWalletResponse.getEmail();
        if (email == null) {
            email = "";
        }
        TextLabelViewItem copy$default = TextLabelViewItem.copy$default(emailItem, null, TextLabelState.copy$default(state, C0564b.zulu(email), null, null, 6, null), 1, null);
        TextLabelViewItem errorLabelViewItem = this.f6382d.getErrorLabelViewItem();
        TextLabelViewItem logoutItem = this.f6382d.getLogoutItem();
        ButtonItem buttonItem = this.f6382d.getButtonItem();
        ImageStyle overflowImageStyle = this.f6382d.getOverflowImageStyle();
        TextLabelViewItem defaultPaymentItem = this.f6382d.getDefaultPaymentItem();
        boolean z10 = this.f6387j;
        List<PaymentMethod> paymentMethods = getWalletResponse.getPaymentMethods();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(paymentMethods, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PaymentMethod paymentMethod3 : paymentMethods) {
            boolean isCardExpired$rememberme_standardRelease = isCardExpired$rememberme_standardRelease(paymentMethod3.getCardDetails());
            CardScheme determineScheme2 = ExtensionsKt.determineScheme(paymentMethod3);
            CardScheme determineCvvSupportedLocalScheme2 = ExtensionsKt.determineCvvSupportedLocalScheme(paymentMethod3);
            CardTypeName fromString = CardTypeName.INSTANCE.fromString(paymentMethod3.getCardDetails().getCardType());
            String id2 = paymentMethod3.getId();
            String bin = paymentMethod3.getCardDetails().getBin();
            ImageStyle imageStyle2 = new ImageStyle(Integer.valueOf((determineScheme2 == null || (imageId = determineScheme2.getImageId()) == null) ? f6378v : imageId.intValue()), null, null, null, null, null, null, null, 254, null);
            if (determineCvvSupportedLocalScheme2 != null) {
                Integer imageId2 = determineCvvSupportedLocalScheme2.getImageId();
                imageStyle = new ImageStyle(Integer.valueOf(imageId2 != null ? imageId2.intValue() : f6378v), null, null, null, null, null, null, null, 254, null);
            } else {
                imageStyle = null;
            }
            String str3 = str2;
            SchemeImageStyle schemeImageStyle = new SchemeImageStyle(imageStyle2, imageStyle);
            boolean isDefaultPaymentMethod = isCardExpired$rememberme_standardRelease ? false : paymentMethod3.isDefaultPaymentMethod();
            boolean z11 = CollectionsKt.bronze(this.f6385h, determineScheme2) && CollectionsKt.bronze(this.f6386i, fromString);
            TextLabelViewItem expiredLabelViewItem = this.f6382d.getExpiredLabelViewItem();
            TextLabelViewItem defaultLabelViewItem = this.f6382d.getDefaultLabelViewItem();
            ArrayList arrayList2 = arrayList;
            TextLabelViewItem copy$default2 = TextLabelViewItem.copy$default(this.f6382d.getTextLabelViewItem(), null, TextLabelState.copy$default(this.f6382d.getTextLabelViewItem().getState(), C0564b.zulu("···· " + paymentMethod3.getCardDetails().getLast4()), null, null, 6, null), 1, null);
            ImageStyle infoImageStyle = this.f6382d.getInfoImageStyle();
            if (fromString == null || this.f6386i.contains(fromString)) {
                string = (determineScheme2 == null || this.f6385h.contains(determineScheme2)) ? null : this.f6380b.getString(R.string.cko_card_number_not_supported, determineScheme2.name());
            } else {
                string = CardTypeExtensionsKt.buildNotSupportedErrorMessage(fromString, this.f6380b);
            }
            if (string != null) {
                z2 = true;
                infoLabelViewItem = TextLabelViewItem.copy$default(this.f6382d.getInfoLabelViewItem(), null, TextLabelState.copy$default(this.f6382d.getInfoLabelViewItem().getState(), C0564b.zulu(string), null, null, 6, null), 1, null);
            } else {
                z2 = true;
                infoLabelViewItem = this.f6382d.getInfoLabelViewItem();
            }
            arrayList2.add(new WalletListItem(id2, bin, schemeImageStyle, isDefaultPaymentMethod, z11, isCardExpired$rememberme_standardRelease, expiredLabelViewItem, defaultLabelViewItem, copy$default2, infoImageStyle, infoLabelViewItem, new b(this, paymentMethod3, determineCvvSupportedLocalScheme2, determineScheme2, 4), determineCvvSupportedLocalScheme2 != null ? z2 : false, null, 8192, null));
            arrayList = arrayList2;
            str2 = str3;
        }
        return new WalletScreenViewState(str2, copy$default, errorLabelViewItem, logoutItem, buttonItem, defaultPaymentItem, false, overflowImageStyle, CollectionsKt.plus(arrayList, this.f6398u), z10, "");
    }

    public static final Unit a(WalletScreenViewModel walletScreenViewModel, PaymentMethod paymentMethod, CardScheme cardScheme, CardScheme cardScheme2) {
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) walletScreenViewModel.state.getValue();
        if (!Intrinsics.areEqual(walletScreenViewState != null ? walletScreenViewState.getSelectedMethodId() : null, paymentMethod.getId()) && cardScheme != null) {
            WalletCvvDelegate walletCvvDelegate = walletScreenViewModel.f6379a;
            walletCvvDelegate.setMaxCvvLength$rememberme_standardRelease(Integer.valueOf(walletCvvDelegate.findMaxCvvLength$rememberme_standardRelease(cardScheme2, cardScheme)));
            walletScreenViewModel.f6379a.resetInputState$rememberme_standardRelease();
            PrimitiveStateFlowRepository primitiveStateFlowRepository = walletScreenViewModel.stateRepository;
            WalletScreenViewState walletScreenViewState2 = (WalletScreenViewState) primitiveStateFlowRepository.getFlow().getValue();
            primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) (walletScreenViewState2 != null ? WalletScreenViewState.copy$default(walletScreenViewState2, null, null, null, null, null, null, false, null, null, false, "", 1023, null) : null));
        }
        PrimitiveStateFlowRepository primitiveStateFlowRepository2 = walletScreenViewModel.stateRepository;
        WalletScreenViewState walletScreenViewState3 = (WalletScreenViewState) primitiveStateFlowRepository2.getFlow().getValue();
        primitiveStateFlowRepository2.update((PrimitiveStateFlowRepository) (walletScreenViewState3 != null ? WalletScreenViewState.copy$default(walletScreenViewState3, paymentMethod.getId(), null, null, null, null, null, false, null, null, false, null, 2046, null) : null));
        RememberMeCallback rememberMeCallback = walletScreenViewModel.f6390m;
        if (rememberMeCallback != null) {
            rememberMeCallback.getOnChange().invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(WalletScreenViewModel walletScreenViewModel, String it) {
        Intrinsics.echo(it, "it");
        walletScreenViewModel.stateRepository.update((Function1) new ae(it, 10));
        return Unit.INSTANCE;
    }

    public static final WalletScreenViewState a(String str, WalletScreenViewState walletScreenViewState) {
        if (walletScreenViewState != null) {
            return WalletScreenViewState.copy$default(walletScreenViewState, null, null, null, null, null, null, false, null, null, false, str, 1023, null);
        }
        return null;
    }
}
