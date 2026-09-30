package com.checkout.components.rememberme;

import a2.C0393r;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.lifecycle.InterfaceC0651v;
import bx.InterfaceC0775m;
import bx.aa;
import bz.an;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.Y0;
import com.checkout.components.rememberme.savecard.SaveCardViewModel;
import com.checkout.components.rememberme.savecard.SaveCardViewState;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.FlowAnimations;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1772d;
import ge.InterfaceC1775g;
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
public abstract class Y0 {
    public static final Unit a(DesignTokens designTokens, TextLabelViewItem textLabelViewItem, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, InputComponentViewItem inputComponentViewItem3, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, Function0 function03, boolean z10, boolean z11, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TextLabelViewItem textLabelViewItem4, TextLabelViewItem textLabelViewItem5, TextLabelViewItem textLabelViewItem6, boolean z12, CheckoutKMPRememberMe checkoutKMPRememberMe, TextLabelViewItem textLabelViewItem7, int i4, int i5, int i10, int i11, InterfaceC0581m interfaceC0581m, int i12) {
        a(designTokens, textLabelViewItem, inputComponentViewItem, inputComponentViewItem2, inputComponentViewItem3, z2, function1, function12, function13, function0, function14, function02, function03, z10, z11, textLabelViewItem2, textLabelViewItem3, textLabelViewItem4, textLabelViewItem5, textLabelViewItem6, z12, checkoutKMPRememberMe, textLabelViewItem7, interfaceC0581m, C0564b.cyan(i4 | 1), C0564b.cyan(i5), C0564b.cyan(i10), i11);
        return Unit.INSTANCE;
    }

    public static final Unit b(Function1 function1) {
        function1.invoke(Constants.PRIVACY_POLICY_URL);
        return Unit.INSTANCE;
    }

    public static final Unit a(DesignTokens designTokens, SuspendUseCase suspendUseCase, SaveCardViewStateRepository saveCardViewStateRepository, Function0 function0, Function1 function1, CheckoutKMPRememberMe checkoutKMPRememberMe, TextLabelViewItem textLabelViewItem, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(designTokens, suspendUseCase, saveCardViewStateRepository, function0, function1, checkoutKMPRememberMe, textLabelViewItem, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(DesignTokens designTokens, SuspendUseCase checkIsAccountAvailableUseCase, SaveCardViewStateRepository repository, Function0 goToCountryPicker, Function1 goToLegalWebView, CheckoutKMPRememberMe kmpRememberMe, TextLabelViewItem legalTextViewItem, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q;
        T1.c cVar;
        Intrinsics.echo(checkIsAccountAvailableUseCase, "checkIsAccountAvailableUseCase");
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(goToCountryPicker, "goToCountryPicker");
        Intrinsics.echo(goToLegalWebView, "goToLegalWebView");
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(legalTextViewItem, "legalTextViewItem");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1413236254);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q2.golf(designTokens) : c0585q2.india(designTokens) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q2.india(checkIsAccountAvailableUseCase) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q2.india(repository) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q2.india(goToCountryPicker) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q2.india(goToLegalWebView) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= (262144 & i4) == 0 ? c0585q2.golf(kmpRememberMe) : c0585q2.india(kmpRememberMe) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= (2097152 & i4) == 0 ? c0585q2.golf(legalTextViewItem) : c0585q2.india(legalTextViewItem) ? 1048576 : 524288;
        }
        if (c0585q2.magenta(i5 & 1, (599187 & i5) != 599186)) {
            boolean india = c0585q2.india(checkIsAccountAvailableUseCase) | c0585q2.india(repository);
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (india || jade == asVar) {
                jade = new C0393r(3, checkIsAccountAvailableUseCase, repository);
                c0585q2.f(jade);
            }
            Function1 function1 = (Function1) jade;
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q2);
            if (alpha != null) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                InterfaceC1772d bravo = vVar.bravo(SaveCardViewModel.class);
                Fe.t tVar = new Fe.t(1);
                tVar.alpha(vVar.bravo(SaveCardViewModel.class), function1);
                T1.d bravo2 = tVar.bravo();
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                SaveCardViewModel saveCardViewModel = (SaveCardViewModel) F7.bravo(bravo, alpha, null, bravo2, cVar, c0585q2);
                SaveCardViewState saveCardViewState = (SaveCardViewState) C0564b.mike(saveCardViewModel.getState$rememberme_standardRelease(), c0585q2, 0).getValue();
                TextLabelViewItem saveCardLabelItem = saveCardViewState.getSaveCardLabelItem();
                InputComponentViewItem emailViewItem = saveCardViewState.getEmailViewItem();
                InputComponentViewItem phoneNumberViewItem = saveCardViewState.getPhoneNumberViewItem();
                InputComponentViewItem countryCodeViewItem = saveCardViewState.getCountryCodeViewItem();
                int i10 = i5;
                boolean isChecked = saveCardViewState.isChecked();
                boolean india2 = c0585q2.india(saveCardViewModel);
                Object jade2 = c0585q2.jade();
                if (india2 || jade2 == asVar) {
                    jade2 = new T0(saveCardViewModel);
                    c0585q2.f(jade2);
                }
                InterfaceC1775g interfaceC1775g = (InterfaceC1775g) jade2;
                boolean india3 = c0585q2.india(saveCardViewModel);
                Object jade3 = c0585q2.jade();
                if (india3 || jade3 == asVar) {
                    jade3 = new U0(saveCardViewModel);
                    c0585q2.f(jade3);
                }
                InterfaceC1775g interfaceC1775g2 = (InterfaceC1775g) jade3;
                boolean india4 = c0585q2.india(saveCardViewModel);
                Object jade4 = c0585q2.jade();
                if (india4 || jade4 == asVar) {
                    jade4 = new V0(saveCardViewModel);
                    c0585q2.f(jade4);
                }
                InterfaceC1775g interfaceC1775g3 = (InterfaceC1775g) jade4;
                boolean india5 = c0585q2.india(saveCardViewModel);
                Object jade5 = c0585q2.jade();
                if (india5 || jade5 == asVar) {
                    jade5 = new W0(saveCardViewModel);
                    c0585q2.f(jade5);
                }
                InterfaceC1775g interfaceC1775g4 = (InterfaceC1775g) jade5;
                boolean india6 = c0585q2.india(saveCardViewModel);
                Object jade6 = c0585q2.jade();
                if (india6 || jade6 == asVar) {
                    jade6 = new X0(saveCardViewModel);
                    c0585q2.f(jade6);
                }
                boolean showPrefilledEmailView = saveCardViewState.getShowPrefilledEmailView();
                boolean showPrefilledPhoneView = saveCardViewState.getShowPrefilledPhoneView();
                TextLabelViewItem prefilledEmailLabelViewItem = saveCardViewState.getPrefilledEmailLabelViewItem();
                TextLabelViewItem prefilledEmailTextViewItem = saveCardViewState.getPrefilledEmailTextViewItem();
                TextLabelViewItem prefilledPhoneLabelViewItem = saveCardViewState.getPrefilledPhoneLabelViewItem();
                TextLabelViewItem prefilledPhoneTextViewItem = saveCardViewState.getPrefilledPhoneTextViewItem();
                TextLabelViewItem editLabelViewItem = saveCardViewState.getEditLabelViewItem();
                int i11 = DesignTokens.$stable | (i10 & 14);
                int i12 = TextLabelViewItem.$stable;
                int i13 = InputComponentViewItem.$stable;
                int i14 = i11 | (i12 << 3) | (i13 << 6) | (i13 << 9) | (i13 << 12) | ((i10 << 18) & 1879048192);
                int i15 = i10 >> 12;
                int i16 = (i15 & 14) | (i12 << 15) | (i12 << 18) | (i12 << 21) | (i12 << 24) | (i12 << 27);
                int i17 = (CheckoutKMPRememberMe.$stable << 3) | (i15 & 112) | (i12 << 6) | (i15 & 896);
                c0585q = c0585q2;
                a(designTokens, saveCardLabelItem, emailViewItem, phoneNumberViewItem, countryCodeViewItem, isChecked, (Function1) interfaceC1775g, (Function1) interfaceC1775g2, (Function1) interfaceC1775g3, goToCountryPicker, goToLegalWebView, (Function0) interfaceC1775g4, (Function0) ((InterfaceC1775g) jade6), showPrefilledEmailView, showPrefilledPhoneView, prefilledEmailLabelViewItem, prefilledEmailTextViewItem, prefilledPhoneLabelViewItem, prefilledPhoneTextViewItem, editLabelViewItem, false, kmpRememberMe, legalTextViewItem, c0585q, i14, i16, i17, 1048576);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F4.f(designTokens, checkIsAccountAvailableUseCase, repository, goToCountryPicker, goToLegalWebView, kmpRememberMe, legalTextViewItem, i4);
        }
    }

    public static final SaveCardViewModel a(SuspendUseCase suspendUseCase, SaveCardViewStateRepository saveCardViewStateRepository, T1.c viewModel) {
        Intrinsics.echo(viewModel, "$this$viewModel");
        return new SaveCardViewModel(suspendUseCase, saveCardViewStateRepository, null, 4, null);
    }

    public static final void a(final DesignTokens designTokens, final TextLabelViewItem saveCardLabelItem, final InputComponentViewItem emailInputFieldViewItem, final InputComponentViewItem numberViewItem, final InputComponentViewItem countryCodeViewItem, final boolean z2, final Function1 onCheckedChange, final Function1 onEmailChange, final Function1 onPhoneNumberChange, final Function0 goToCountryPicker, final Function1 goToLegalWebView, final Function0 onEmailEditClick, final Function0 onPhoneEditClick, final boolean z10, final boolean z11, final TextLabelViewItem prefilledEmailLabelViewItem, final TextLabelViewItem prefilledEmailTextViewItem, final TextLabelViewItem prefilledPhoneLabelViewItem, final TextLabelViewItem prefilledPhoneTextViewItem, final TextLabelViewItem editLabelViewItem, boolean z12, CheckoutKMPRememberMe kmpRememberMe, final TextLabelViewItem legalTextViewItem, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        CheckoutKMPRememberMe checkoutKMPRememberMe;
        C0585q c0585q;
        final boolean z14;
        Intrinsics.echo(saveCardLabelItem, "saveCardLabelItem");
        Intrinsics.echo(emailInputFieldViewItem, "emailInputFieldViewItem");
        Intrinsics.echo(numberViewItem, "numberViewItem");
        Intrinsics.echo(countryCodeViewItem, "countryCodeViewItem");
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        Intrinsics.echo(onEmailChange, "onEmailChange");
        Intrinsics.echo(onPhoneNumberChange, "onPhoneNumberChange");
        Intrinsics.echo(goToCountryPicker, "goToCountryPicker");
        Intrinsics.echo(goToLegalWebView, "goToLegalWebView");
        Intrinsics.echo(onEmailEditClick, "onEmailEditClick");
        Intrinsics.echo(onPhoneEditClick, "onPhoneEditClick");
        Intrinsics.echo(prefilledEmailLabelViewItem, "prefilledEmailLabelViewItem");
        Intrinsics.echo(prefilledEmailTextViewItem, "prefilledEmailTextViewItem");
        Intrinsics.echo(prefilledPhoneLabelViewItem, "prefilledPhoneLabelViewItem");
        Intrinsics.echo(prefilledPhoneTextViewItem, "prefilledPhoneTextViewItem");
        Intrinsics.echo(editLabelViewItem, "editLabelViewItem");
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(legalTextViewItem, "legalTextViewItem");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(18848332);
        if ((i4 & 6) == 0) {
            i12 = i4 | ((i4 & 8) == 0 ? c0585q2.golf(designTokens) : c0585q2.india(designTokens) ? 4 : 2);
        } else {
            i12 = i4;
        }
        if ((i4 & 48) == 0) {
            i12 |= (i4 & 64) == 0 ? c0585q2.golf(saveCardLabelItem) : c0585q2.india(saveCardLabelItem) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i12 |= (i4 & 512) == 0 ? c0585q2.golf(emailInputFieldViewItem) : c0585q2.india(emailInputFieldViewItem) ? 256 : 128;
        }
        int i17 = i4 & 3072;
        int i18 = Barcode.FORMAT_UPC_E;
        if (i17 == 0) {
            i12 |= (i4 & 4096) == 0 ? c0585q2.golf(numberViewItem) : c0585q2.india(numberViewItem) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i12 |= (32768 & i4) == 0 ? c0585q2.golf(countryCodeViewItem) : c0585q2.india(countryCodeViewItem) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i13 = 196608;
            z13 = z2;
            i12 |= c0585q2.hotel(z13) ? 131072 : 65536;
        } else {
            i13 = 196608;
            z13 = z2;
        }
        if ((i4 & 1572864) == 0) {
            i12 |= c0585q2.india(onCheckedChange) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i12 |= c0585q2.india(onEmailChange) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i12 |= c0585q2.india(onPhoneNumberChange) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i12 |= c0585q2.india(goToCountryPicker) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i14 = i5 | (c0585q2.india(goToLegalWebView) ? 4 : 2);
        } else {
            i14 = i5;
        }
        if ((i5 & 48) == 0) {
            i14 |= c0585q2.india(onEmailEditClick) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i14 |= c0585q2.india(onPhoneEditClick) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q2.hotel(z10)) {
                i18 = 2048;
            }
            i14 |= i18;
        }
        if ((i5 & 24576) == 0) {
            i14 |= c0585q2.hotel(z11) ? 16384 : 8192;
        }
        if ((i5 & i13) == 0) {
            i14 |= (i5 & 262144) == 0 ? c0585q2.golf(prefilledEmailLabelViewItem) : c0585q2.india(prefilledEmailLabelViewItem) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i14 |= (i5 & 2097152) == 0 ? c0585q2.golf(prefilledEmailTextViewItem) : c0585q2.india(prefilledEmailTextViewItem) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i14 |= (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? c0585q2.golf(prefilledPhoneLabelViewItem) : c0585q2.india(prefilledPhoneLabelViewItem) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i14 |= (i5 & 134217728) == 0 ? c0585q2.golf(prefilledPhoneTextViewItem) : c0585q2.india(prefilledPhoneTextViewItem) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i14 |= (i5 & 1073741824) == 0 ? c0585q2.golf(editLabelViewItem) : c0585q2.india(editLabelViewItem) ? 536870912 : 268435456;
        }
        int i19 = i11 & 1048576;
        if (i19 != 0) {
            i15 = i10;
            i16 = i15 | 6;
        } else {
            i15 = i10;
            if ((i15 & 6) == 0) {
                i16 = i15 | (c0585q2.hotel(z12) ? 4 : 2);
            } else {
                i16 = i15;
            }
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? c0585q2.golf(kmpRememberMe) : c0585q2.india(kmpRememberMe) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? c0585q2.golf(legalTextViewItem) : c0585q2.india(legalTextViewItem) ? 256 : 128;
        }
        int i20 = i16;
        if (c0585q2.magenta(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (i20 & 147) == 146) ? false : true)) {
            boolean z15 = i19 != 0 ? false : z12;
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new an(Boolean.valueOf(z15));
                c0585q2.f(jade);
            }
            an anVar = (an) jade;
            ((androidx.compose.runtime.t0) anVar.red).setValue(Boolean.valueOf(z13));
            boolean z16 = (i12 & 112) == 32 || ((i12 & 64) != 0 && c0585q2.golf(saveCardLabelItem));
            Object jade2 = c0585q2.jade();
            if (z16 || jade2 == asVar) {
                jade2 = TextLabelViewItem.copy$default(saveCardLabelItem, TextLabelViewStyle.m180copyQstMH_w$default(saveCardLabelItem.getStyle(), AbstractC0538d.whiskey(saveCardLabelItem.getStyle().getModifier(), 0.0f, 0.0f, 16, 0.0f, 11), 0, false, 0, null, null, false, 126, null), null, 2, null);
                c0585q2.f(jade2);
            }
            TextLabelViewItem textLabelViewItem = (TextLabelViewItem) jade2;
            T.p pVar = T.p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j5 = c0585q2.magenta;
            int i21 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(pVar, c0585q2);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q2, alpha, c0585q2, mike);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i21))) {
                AbstractC0990w.a(i21, c0585q2, i21, a6);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            int i22 = i12 >> 9;
            CheckboxLabelViewKt.CheckboxLabelView(designTokens, textLabelViewItem, z2, onCheckedChange, null, "rm_save_card_checkbox", c0585q2, DesignTokens.$stable | i13 | (i12 & 14) | (TextLabelViewItem.$stable << 3) | (i22 & 896) | (i22 & 7168), 16);
            FlowAnimations flowAnimations = FlowAnimations.INSTANCE;
            androidx.compose.animation.b.bravo(anVar, null, flowAnimations.getDefaultEnterTransition(), flowAnimations.getDefaultExitTransition(), null, P.e.echo(-1940500802, new Xd.m() { // from class: a5.p
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int intValue = ((Integer) obj3).intValue();
                    return Y0.a(z10, z11, legalTextViewItem, goToLegalWebView, prefilledEmailLabelViewItem, prefilledEmailTextViewItem, editLabelViewItem, onEmailEditClick, emailInputFieldViewItem, onEmailChange, prefilledPhoneLabelViewItem, prefilledPhoneTextViewItem, onPhoneEditClick, numberViewItem, countryCodeViewItem, onPhoneNumberChange, goToCountryPicker, (bx.aa) obj, (InterfaceC0581m) obj2, intValue);
                }
            }, c0585q2), c0585q2, 1572870);
            c0585q = c0585q2;
            float f5 = 0;
            checkoutKMPRememberMe = kmpRememberMe;
            AbstractC0926a1.a(checkoutKMPRememberMe, AbstractC0538d.whiskey(pVar, f5, 16, f5, 0.0f, 8), c0585q, CheckoutKMPRememberMe.$stable | 48 | ((i20 >> 3) & 14), 0);
            c0585q.quebec(true);
            z14 = z15;
        } else {
            checkoutKMPRememberMe = kmpRememberMe;
            c0585q = c0585q2;
            c0585q.ochre();
            z14 = z12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final CheckoutKMPRememberMe checkoutKMPRememberMe2 = checkoutKMPRememberMe;
            uniform.delta = new Xd.l() { // from class: a5.q
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    return Y0.a(DesignTokens.this, saveCardLabelItem, emailInputFieldViewItem, numberViewItem, countryCodeViewItem, z2, onCheckedChange, onEmailChange, onPhoneNumberChange, goToCountryPicker, goToLegalWebView, onEmailEditClick, onPhoneEditClick, z10, z11, prefilledEmailLabelViewItem, prefilledEmailTextViewItem, prefilledPhoneLabelViewItem, prefilledPhoneTextViewItem, editLabelViewItem, z14, checkoutKMPRememberMe2, legalTextViewItem, i4, i5, i10, i11, (InterfaceC0581m) obj, intValue);
                }
            };
        }
    }

    public static final Unit a(boolean z2, boolean z10, TextLabelViewItem textLabelViewItem, Function1 function1, final TextLabelViewItem textLabelViewItem2, final TextLabelViewItem textLabelViewItem3, final TextLabelViewItem textLabelViewItem4, final Function0 function0, final InputComponentViewItem inputComponentViewItem, final Function1 function12, final TextLabelViewItem textLabelViewItem5, final TextLabelViewItem textLabelViewItem6, final Function0 function02, final InputComponentViewItem inputComponentViewItem2, final InputComponentViewItem inputComponentViewItem3, final Function1 function13, final Function0 function03, aa AnimatedVisibility, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
        T.p pVar = T.p.alpha;
        T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(8), T.d.f2062f, interfaceC0581m, 6);
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        int i5 = (int) (j5 ^ (j5 >>> 32));
        androidx.compose.runtime.I mike = c0585q.mike();
        T.s charlie2 = T.a.charlie(charlie, interfaceC0581m);
        C2551k c2551k = InterfaceC2552l.maroon;
        c2551k.getClass();
        C2550j c2550j = C2551k.bravo;
        C1298c c1298c = c0585q.alpha;
        c0585q.white();
        if (c0585q.lime) {
            c0585q.lima(c2550j);
        } else {
            c0585q.i();
        }
        Xd.l a6 = AbstractC0987v.a(c2551k, interfaceC0581m, alpha, interfaceC0581m, mike);
        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
            AbstractC0990w.a(i5, interfaceC0581m, i5, a6);
        }
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie2);
        androidx.compose.animation.a.bravo(Boolean.valueOf(z2), null, null, null, "EmailViewSwitch", null, P.e.echo(-2053968859, new Xd.n() { // from class: a5.r
            @Override // Xd.n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj4).intValue();
                return Y0.a(TextLabelViewItem.this, textLabelViewItem3, textLabelViewItem4, function0, inputComponentViewItem, function12, (InterfaceC0775m) obj, ((Boolean) obj2).booleanValue(), (InterfaceC0581m) obj3, intValue);
            }
        }, interfaceC0581m), interfaceC0581m, 1597440, 46);
        androidx.compose.animation.a.bravo(Boolean.valueOf(z10), null, null, null, "PhoneViewSwitch", null, P.e.echo(1528618766, new Xd.n() { // from class: a5.s
            @Override // Xd.n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj4).intValue();
                return Y0.a(TextLabelViewItem.this, textLabelViewItem6, textLabelViewItem4, function02, inputComponentViewItem2, inputComponentViewItem3, function13, function03, (InterfaceC0775m) obj, ((Boolean) obj2).booleanValue(), (InterfaceC0581m) obj3, intValue);
            }
        }, interfaceC0581m), interfaceC0581m, 1597440, 46);
        boolean golf = c0585q.golf(function1);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = new Cb.j(5, function1);
            c0585q.f(jade);
        }
        Function0 function04 = (Function0) jade;
        boolean golf2 = c0585q.golf(function1);
        Object jade2 = c0585q.jade();
        if (golf2 || jade2 == asVar) {
            jade2 = new Cb.j(6, function1);
            c0585q.f(jade2);
        }
        H.a(pVar, textLabelViewItem, function04, (Function0) jade2, interfaceC0581m, (TextLabelViewItem.$stable << 3) | 6, 0);
        c0585q.quebec(true);
        return Unit.INSTANCE;
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, Function0 function0, InputComponentViewItem inputComponentViewItem, Function1 function1, InterfaceC0775m AnimatedContent, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedContent, "$this$AnimatedContent");
        if (z2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(612857922);
            int i5 = TextLabelViewItem.$stable;
            AbstractC0943g0.a(textLabelViewItem, textLabelViewItem2, textLabelViewItem3, function0, "rm_edit_email_text_button", c0585q, i5 | 24576 | (i5 << 3) | (i5 << 6), 0);
            c0585q.quebec(false);
        } else {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(613269819);
            InputContainerViewKt.InputComponentContainerView(inputComponentViewItem.getStyle(), inputComponentViewItem.getState(), function1, null, "rm_edit_email_input", c0585q2, InputComponentViewStyle.$stable | 24576 | (InputComponentState.$stable << 3), 8);
            c0585q2.quebec(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, Function0 function0, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, Function1 function1, Function0 function02, InterfaceC0775m AnimatedContent, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedContent, "$this$AnimatedContent");
        if (z2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(-456511303);
            int i5 = TextLabelViewItem.$stable;
            AbstractC0943g0.a(textLabelViewItem, textLabelViewItem2, textLabelViewItem3, function0, "rm_edit_phone_text_button", c0585q, (i5 << 6) | i5 | 24576 | (i5 << 3), 0);
            c0585q.quebec(false);
        } else {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(-456095531);
            boolean golf = c0585q2.golf(function1);
            Object jade = c0585q2.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new a5.t(0, function1);
                c0585q2.f(jade);
            }
            int i10 = InputComponentViewItem.$stable;
            PhoneFieldViewKt.PhoneFieldView(-1, inputComponentViewItem, inputComponentViewItem2, "rm_edit_phone_input", (Xd.l) jade, function02, c0585q2, (i10 << 3) | 3078 | (i10 << 6), 0);
            c0585q2.quebec(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, int i4, String number) {
        Intrinsics.echo(number, "number");
        function1.invoke(number);
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1) {
        function1.invoke(Constants.TERMS_OF_SERVICE_URL);
        return Unit.INSTANCE;
    }
}
