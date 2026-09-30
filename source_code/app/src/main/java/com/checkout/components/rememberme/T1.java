package com.checkout.components.rememberme;

import Yb.C0312j0;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.lifecycle.InterfaceC0651v;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.T1;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.WalletCvvViewState;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import com.checkout.components.rememberme.wallet.WalletScreenViewModelFactory;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F7;

/* loaded from: classes3.dex */
public abstract class T1 {
    public static final Unit a(boolean z2, DesignTokens designTokens, CheckoutKMPRememberMe checkoutKMPRememberMe, String str, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, ButtonItem buttonItem, ImageStyle imageStyle, List list, Function0 function0, Function0 function02, yf.L l10, TextLabelViewItem textLabelViewItem4, boolean z10, Function1 function1, WalletCvvViewState walletCvvViewState, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(z2, designTokens, checkoutKMPRememberMe, str, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, buttonItem, imageStyle, list, function0, function02, l10, textLabelViewItem4, z10, function1, walletCvvViewState, interfaceC0581m, C0564b.cyan(i4 | 1), C0564b.cyan(i5));
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, NavControllerWrapper navControllerWrapper, Xd.l lVar, Xd.n nVar, Xd.l lVar2, Function0 function0, Function0 function02, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(diComponent, navControllerWrapper, lVar, nVar, lVar2, function0, function02, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(DiComponent di, NavControllerWrapper navControllerWrapper, Xd.l addCardView, Xd.n onSubmitNewCard, Xd.l onSendCardMetaDataRequest, Function0 isTokenizationInProgress, Function0 rememberMeAddCardMetadataProvider, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q;
        T1.c cVar;
        Intrinsics.echo(di, "di");
        Intrinsics.echo(navControllerWrapper, "navControllerWrapper");
        Intrinsics.echo(addCardView, "addCardView");
        Intrinsics.echo(onSubmitNewCard, "onSubmitNewCard");
        Intrinsics.echo(onSendCardMetaDataRequest, "onSendCardMetaDataRequest");
        Intrinsics.echo(isTokenizationInProgress, "isTokenizationInProgress");
        Intrinsics.echo(rememberMeAddCardMetadataProvider, "rememberMeAddCardMetadataProvider");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(403558166);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q2.golf(di) : c0585q2.india(di) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q2.india(navControllerWrapper) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q2.india(addCardView) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q2.india(onSubmitNewCard) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q2.india(onSendCardMetaDataRequest) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q2.india(isTokenizationInProgress) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q2.india(rememberMeAddCardMetadataProvider) ? 1048576 : 524288;
        }
        if (c0585q2.magenta(i5 & 1, (599187 & i5) != 599186)) {
            KMPRememberMeClickHandler kmpRememberMeClickHandler = di.kmpRememberMeClickHandler();
            boolean india = c0585q2.india(navControllerWrapper);
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (india || jade == asVar) {
                jade = new C0312j0(5, navControllerWrapper);
                c0585q2.f(jade);
            }
            kmpRememberMeClickHandler.setInfoTextNavigator$rememberme_standardRelease((Function0) jade);
            String valueOf = String.valueOf(di.hashCode());
            WalletScreenViewModelFactory walletScreenViewModelFactory = new WalletScreenViewModelFactory(di, addCardView, onSubmitNewCard, onSendCardMetaDataRequest, isTokenizationInProgress, rememberMeAddCardMetadataProvider);
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q2);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                c0585q = c0585q2;
                WalletScreenViewModel walletScreenViewModel = (WalletScreenViewModel) F7.bravo(kotlin.jvm.internal.u.alpha.bravo(WalletScreenViewModel.class), alpha, valueOf, walletScreenViewModelFactory, cVar, c0585q);
                yf.L paymentStateFlow = walletScreenViewModel.getPaymentStateFlow();
                WalletScreenViewState walletScreenViewState = (WalletScreenViewState) C0564b.mike(walletScreenViewModel.getState(), c0585q, 0).getValue();
                if (walletScreenViewState == null) {
                    c0585q.purple(789221928);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(789221929);
                    boolean showPayButton = walletScreenViewState.getShowPayButton();
                    DesignTokens designTokens = di.designTokens();
                    CheckoutKMPRememberMe kmpRememberMe = di.kmpRememberMe();
                    String selectedMethodId = walletScreenViewState.getSelectedMethodId();
                    TextLabelViewItem logoutItem = walletScreenViewState.getLogoutItem();
                    TextLabelViewItem emailItem = walletScreenViewState.getEmailItem();
                    ButtonItem buttonItem = walletScreenViewState.getButtonItem();
                    ImageStyle overflowImageStyle = walletScreenViewState.getOverflowImageStyle();
                    List<WalletListItem> walletListItems = walletScreenViewState.getWalletListItems();
                    boolean india2 = c0585q.india(walletScreenViewModel);
                    Object jade2 = c0585q.jade();
                    if (india2 || jade2 == asVar) {
                        jade2 = new O1(walletScreenViewModel);
                        c0585q.f(jade2);
                    }
                    Function0 function0 = (Function0) jade2;
                    boolean india3 = c0585q.india(walletScreenViewModel);
                    Object jade3 = c0585q.jade();
                    if (india3 || jade3 == asVar) {
                        jade3 = new P1(walletScreenViewModel);
                        c0585q.f(jade3);
                    }
                    InterfaceC1775g interfaceC1775g = (InterfaceC1775g) jade3;
                    TextLabelViewItem defaultPaymentItem = walletScreenViewState.getDefaultPaymentItem();
                    boolean defaultPaymentChecked = walletScreenViewState.getDefaultPaymentChecked();
                    boolean india4 = c0585q.india(walletScreenViewModel);
                    Object jade4 = c0585q.jade();
                    if (india4 || jade4 == asVar) {
                        jade4 = new Q1(walletScreenViewModel);
                        c0585q.f(jade4);
                    }
                    InterfaceC1775g interfaceC1775g2 = (InterfaceC1775g) jade4;
                    TextLabelViewItem errorLabelViewItem = walletScreenViewState.getErrorLabelViewItem();
                    InputComponentViewStyle style = walletScreenViewModel.getCvvComponent$rememberme_standardRelease().getStyle();
                    InputComponentState state = walletScreenViewModel.getCvvComponent$rememberme_standardRelease().getState();
                    boolean india5 = c0585q.india(walletScreenViewModel);
                    Object jade5 = c0585q.jade();
                    if (india5 || jade5 == asVar) {
                        jade5 = new R1(walletScreenViewModel);
                        c0585q.f(jade5);
                    }
                    Function1 function1 = (Function1) ((InterfaceC1775g) jade5);
                    boolean india6 = c0585q.india(walletScreenViewModel);
                    Object jade6 = c0585q.jade();
                    if (india6 || jade6 == asVar) {
                        jade6 = new S1(walletScreenViewModel);
                        c0585q.f(jade6);
                    }
                    WalletCvvViewState walletCvvViewState = new WalletCvvViewState(style, state, function1, (Function1) ((InterfaceC1775g) jade6));
                    int i10 = (DesignTokens.$stable << 3) | (CheckoutKMPRememberMe.$stable << 6);
                    int i11 = TextLabelViewItem.$stable;
                    a(showPayButton, designTokens, kmpRememberMe, selectedMethodId, logoutItem, emailItem, errorLabelViewItem, buttonItem, overflowImageStyle, walletListItems, function0, (Function0) interfaceC1775g, paymentStateFlow, defaultPaymentItem, defaultPaymentChecked, (Function1) interfaceC1775g2, walletCvvViewState, c0585q, i10 | (i11 << 12) | (i11 << 15) | (i11 << 18) | (ButtonItem.$stable << 21) | (ImageStyle.$stable << 24), (i11 << 9) | ((InputComponentViewStyle.$stable | InputComponentState.$stable) << 18));
                    c0585q.quebec(false);
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F4.f(di, navControllerWrapper, addCardView, onSubmitNewCard, onSendCardMetaDataRequest, isTokenizationInProgress, rememberMeAddCardMetadataProvider, i4, 2);
        }
    }

    public static final Unit a(NavControllerWrapper navControllerWrapper) {
        navControllerWrapper.navigateToDialog(RememberMeScreen.GetToKnowUsDialog.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final void a(final boolean z2, final DesignTokens designTokens, final CheckoutKMPRememberMe checkoutKMPRememberMe, final String str, final TextLabelViewItem textLabelViewItem, final TextLabelViewItem textLabelViewItem2, final TextLabelViewItem textLabelViewItem3, final ButtonItem buttonItem, final ImageStyle imageStyle, final List list, final Function0 function0, final Function0 function02, final yf.L l10, final TextLabelViewItem textLabelViewItem4, final boolean z10, final Function1 function1, final WalletCvvViewState walletCvvViewState, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        String str2;
        int i11;
        List list2;
        int i12;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-463843557);
        if ((i4 & 6) == 0) {
            i10 = (c0585q2.hotel(z2) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q2.golf(designTokens) : c0585q2.india(designTokens) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= (i4 & 512) == 0 ? c0585q2.golf(checkoutKMPRememberMe) : c0585q2.india(checkoutKMPRememberMe) ? 256 : 128;
        }
        int i13 = i4 & 3072;
        int i14 = Barcode.FORMAT_UPC_E;
        if (i13 == 0) {
            str2 = str;
            i10 |= c0585q2.golf(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i4 & 24576) == 0) {
            i10 |= (32768 & i4) == 0 ? c0585q2.golf(textLabelViewItem) : c0585q2.india(textLabelViewItem) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i10 |= (i4 & 262144) == 0 ? c0585q2.golf(textLabelViewItem2) : c0585q2.india(textLabelViewItem2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= (i4 & 2097152) == 0 ? c0585q2.golf(textLabelViewItem3) : c0585q2.india(textLabelViewItem3) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i10 |= (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? c0585q2.golf(buttonItem) : c0585q2.india(buttonItem) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i10 |= (i4 & 134217728) == 0 ? c0585q2.golf(imageStyle) : c0585q2.india(imageStyle) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i11 = 196608;
            list2 = list;
            i10 |= c0585q2.india(list2) ? 536870912 : 268435456;
        } else {
            i11 = 196608;
            list2 = list;
        }
        if ((i5 & 6) == 0) {
            i12 = i5 | (c0585q2.india(function0) ? 4 : 2);
        } else {
            i12 = i5;
        }
        if ((i5 & 48) == 0) {
            i12 |= c0585q2.india(function02) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i12 |= c0585q2.india(l10) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            if ((i5 & 4096) == 0 ? c0585q2.golf(textLabelViewItem4) : c0585q2.india(textLabelViewItem4)) {
                i14 = 2048;
            }
            i12 |= i14;
        }
        if ((i5 & 24576) == 0) {
            i12 |= c0585q2.hotel(z10) ? 16384 : 8192;
        }
        if ((i5 & i11) == 0) {
            i12 |= c0585q2.india(function1) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i12 |= (i5 & 2097152) == 0 ? c0585q2.golf(walletCvvViewState) : c0585q2.india(walletCvvViewState) ? 1048576 : 524288;
        }
        int i15 = i12;
        if (c0585q2.magenta(i10 & 1, ((i10 & 306783379) == 306783378 && (i15 & 599187) == 599186) ? false : true)) {
            T.s alpha = androidx.compose.ui.platform.a.alpha(T.p.alpha, "rm_wallet_screen");
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(16), T.d.f2062f, c0585q2, 6);
            long j5 = c0585q2.magenta;
            int i16 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(alpha, c0585q2);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q2, alpha2, c0585q2, mike);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                AbstractC0990w.a(i16, c0585q2, i16, a6);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            int i17 = i10 >> 3;
            int i18 = DesignTokens.$stable | (i17 & 14) | (CheckoutKMPRememberMe.$stable << 3) | (i17 & 112) | (i17 & 896);
            int i19 = TextLabelViewItem.$stable;
            int i20 = i18 | (i19 << 9) | (i17 & 7168) | (i19 << 12) | (i17 & 57344) | (ImageStyle.$stable << 15);
            int i21 = i10 >> 9;
            int i22 = i20 | (458752 & i21) | (i21 & 3670016) | ((i15 << 18) & 29360128) | (i19 << 24);
            int i23 = i15 << 15;
            int i24 = i22 | (234881024 & i23) | (i23 & 1879048192);
            int i25 = i15 >> 15;
            c0585q = c0585q2;
            N1.a(designTokens, checkoutKMPRememberMe, str2, textLabelViewItem, textLabelViewItem2, imageStyle, list2, function02, textLabelViewItem4, z10, function1, walletCvvViewState, c0585q, i24, (i25 & 112) | (i25 & 14) | ((InputComponentViewStyle.$stable | InputComponentState.$stable) << 3));
            if (z2) {
                c0585q.purple(-244217579);
                F1.a(buttonItem.getStyle(), buttonItem.getState(), function0, l10, c0585q, InternalButtonViewStyle.$stable | (InternalButtonState.$stable << 3) | ((i15 << 6) & 896) | ((i15 << 3) & 7168));
            } else {
                c0585q.purple(-250350371);
            }
            c0585q.quebec(false);
            TextLabelViewKt.TextLabelView(textLabelViewItem3.getStyle(), textLabelViewItem3.getState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: a5.o
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    return T1.a(z2, designTokens, checkoutKMPRememberMe, str, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, buttonItem, imageStyle, list, function0, function02, l10, textLabelViewItem4, z10, function1, walletCvvViewState, i4, i5, (InterfaceC0581m) obj, intValue);
                }
            };
        }
    }
}
