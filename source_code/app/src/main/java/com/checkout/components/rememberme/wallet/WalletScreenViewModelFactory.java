package com.checkout.components.rememberme.wallet;

import T1.c;
import Xd.l;
import Xd.n;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.WalletScreenStyle;
import com.checkout.components.rememberme.o2;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.state.InternalButtonState;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00124\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u0012*\u0010\u0010\u001a&\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/rememberme/wallet/WalletScreenViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/rememberme/di/DiComponent;", "di", "Lkotlin/Function0;", "", "addCardView", "Lkotlin/Function4;", "", "", "LNd/c;", "", "onSubmitNewCard", "Lkotlin/Function2;", "Lkotlin/Result;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onSendCardMetaDataRequest", "isTokenizationInProgress", "rememberMeAddCardMetadataProvider", "<init>", "(Lcom/checkout/components/rememberme/di/DiComponent;LXd/l;LXd/n;LXd/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletScreenViewModelFactory implements a0 {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DiComponent f6399a;

    /* renamed from: b, reason: collision with root package name */
    private final l f6400b;

    /* renamed from: c, reason: collision with root package name */
    private final n f6401c;

    /* renamed from: d, reason: collision with root package name */
    private final l f6402d;
    private final Function0 e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6403f;

    public WalletScreenViewModelFactory(@NotNull DiComponent di, @NotNull l addCardView, @NotNull n onSubmitNewCard, @NotNull l onSendCardMetaDataRequest, @NotNull Function0<Boolean> isTokenizationInProgress, @NotNull Function0<CardMetadata> rememberMeAddCardMetadataProvider) {
        Intrinsics.echo(di, "di");
        Intrinsics.echo(addCardView, "addCardView");
        Intrinsics.echo(onSubmitNewCard, "onSubmitNewCard");
        Intrinsics.echo(onSendCardMetaDataRequest, "onSendCardMetaDataRequest");
        Intrinsics.echo(isTokenizationInProgress, "isTokenizationInProgress");
        Intrinsics.echo(rememberMeAddCardMetadataProvider, "rememberMeAddCardMetadataProvider");
        this.f6399a = di;
        this.f6400b = addCardView;
        this.f6401c = onSubmitNewCard;
        this.f6402d = onSendCardMetaDataRequest;
        this.e = isTokenizationInProgress;
        this.f6403f = rememberMeAddCardMetadataProvider;
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull Class cls, @NotNull c cVar) {
        return P0.charlie(this, cls, cVar);
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public final <T extends Y> T create(@NotNull Class<T> modelClass) {
        Boolean showPayButton;
        Intrinsics.echo(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(WalletScreenViewModel.class)) {
            DefaultStyleProvider styleProvider = this.f6399a.styleProvider();
            l lVar = this.f6402d;
            RememberMeConfiguration config = this.f6399a.config();
            boolean booleanValue = (config == null || (showPayButton = config.getShowPayButton()) == null) ? true : showPayButton.booleanValue();
            DesignTokens designTokens = this.f6399a.designTokens();
            ResourceProvider resourceProvider = this.f6399a.resourceProvider();
            PrimitiveStateFlowRepository<GetWalletResponse> walletRepository = this.f6399a.walletRepository();
            PaymentStateRepository paymentStateRepository = this.f6399a.paymentStateRepository();
            InternalButtonState map = this.f6399a.buttonStyleToInternalStateMapper().map(styleProvider.getPayButtonItem$rememberme_standardRelease());
            map.isEnabled().setValue(Boolean.TRUE);
            WalletScreenStyle walletScreenStyle = new WalletScreenStyle(o2.a(styleProvider.getWalletEmailHeading$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getErrorLabel$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getPrimaryCenterLabel$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getSetDefaultPaymentStyle$rememberme_standardRelease(), this.f6399a), new ButtonItem(this.f6399a.buttonStyleToInternalStyleMapper().map(styleProvider.getPayButtonItem$rememberme_standardRelease()), map), styleProvider.getOverflowImageStyle$rememberme_standardRelease(), o2.a(styleProvider.getWalletItemExpiredLabelStyle$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getWalletItemDefaultLabelStyle$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getActionHeading$rememberme_standardRelease(), this.f6399a), o2.a(styleProvider.getSecondaryFootnote$rememberme_standardRelease(), this.f6399a), styleProvider.getWalletItemInfoImageStyle$rememberme_standardRelease());
            LogoutUseCase logoutUseCase = this.f6399a.logoutUseCase();
            List<CardScheme> supportedSchemes = this.f6399a.supportedSchemes();
            l lVar2 = this.f6400b;
            return new WalletScreenViewModel(designTokens, new WalletCvvDelegate(new InputComponentViewItem(styleProvider.getInputComponentStateMapper$rememberme_standardRelease().map(styleProvider.getCvvInputFieldComponent$rememberme_standardRelease()), styleProvider.getInputComponentViewStyleMapper$rememberme_standardRelease().map(styleProvider.getCvvInputFieldComponent$rememberme_standardRelease())), this.f6399a.resourceProvider()), resourceProvider, walletRepository, walletScreenStyle, lVar, paymentStateRepository, logoutUseCase, null, null, supportedSchemes, this.f6399a.supportedTypes(), booleanValue, this.f6399a.walletScreenViewStateRepository(), this.f6399a.cardMetadataRepository(), this.f6399a.rememberMeCallback(), lVar2, this.f6399a.rmStateManager(), new WalletButtonDelegate(this.f6399a.jwtTokenRepository(), this.f6401c, this.e, this.f6399a.submitSavedCardUseCase(), this.f6399a.walletScreenViewStateRepository(), this.f6399a.paymentStateRepository(), this.f6399a.rememberMeCallback()), this.f6399a.screenEventNavigationRepository(), this.f6403f, null, 2097920, null);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
