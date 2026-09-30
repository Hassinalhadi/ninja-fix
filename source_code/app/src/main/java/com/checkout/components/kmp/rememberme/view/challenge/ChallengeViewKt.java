package com.checkout.components.kmp.rememberme.view.challenge;

import F.G1;
import F4.g;
import Q0.c;
import T.p;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.model.ChallengeViewState;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001ag\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\u000fH\u0003¢\u0006\u0004\b\u0001\u0010\u0011¨\u0006\u0012"}, d2 = {"", "ChallengeView", "(Landroidx/compose/runtime/m;I)V", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "isLoading", "Lkotlin/Function0;", "cancelChallengeRequest", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "whatsappHint", "emailHint", "phoneHint", "Lkotlin/Function1;", "createChallenge", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;ZLkotlin/jvm/functions/Function0;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChallengeViewKt {
    public static final void ChallengeView(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1306668090);
        if (c0585q.magenta(1 & i4, i4 != 0)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
                eg.a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release != null) {
                    try {
                        jade = (ResourceProvider) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(ResourceProvider.class), null);
                        c0585q.f(jade);
                    } catch (Exception e) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(ResourceProvider.class).kilo(), ": ", e.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            ResourceProvider resourceProvider = (ResourceProvider) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                DependencyResolver dependencyResolver2 = DependencyResolver.INSTANCE;
                eg.a koin$rememberme_release2 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release2 != null) {
                    try {
                        jade2 = (DesignTokens) koin$rememberme_release2.charlie.delta.alpha(u.alpha.bravo(DesignTokens.class), null);
                        c0585q.f(jade2);
                    } catch (Exception e4) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(DesignTokens.class).kilo(), ": ", e4.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            DesignTokens designTokens = (DesignTokens) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                DependencyResolver dependencyResolver3 = DependencyResolver.INSTANCE;
                eg.a koin$rememberme_release3 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release3 != null) {
                    try {
                        jade3 = (AuthInfoRepository) koin$rememberme_release3.charlie.delta.alpha(u.alpha.bravo(AuthInfoRepository.class), null);
                        c0585q.f(jade3);
                    } catch (Exception e5) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(AuthInfoRepository.class).kilo(), ": ", e5.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            AuthInfoRepository authInfoRepository = (AuthInfoRepository) jade3;
            boolean golf = c0585q.golf((String) C0564b.mike(authInfoRepository.getEmail(), c0585q, 0).getValue()) | c0585q.golf((String) C0564b.mike(authInfoRepository.getHintId(), c0585q, 0).getValue());
            Object jade4 = c0585q.jade();
            if (golf || jade4 == asVar) {
                DependencyResolver dependencyResolver4 = DependencyResolver.INSTANCE;
                eg.a koin$rememberme_release4 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release4 != null) {
                    try {
                        jade4 = (ChallengeViewModel) koin$rememberme_release4.charlie.delta.alpha(u.alpha.bravo(ChallengeViewModel.class), null);
                        c0585q.f(jade4);
                    } catch (Exception e10) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(ChallengeViewModel.class).kilo(), ": ", e10.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            ChallengeViewModel challengeViewModel = (ChallengeViewModel) jade4;
            ChallengeViewState challengeViewState = (ChallengeViewState) C0564b.mike(challengeViewModel.getState$rememberme_release(), c0585q, 0).getValue();
            Hint emailHint = challengeViewState.getEmailHint();
            Hint phoneHint = challengeViewState.getPhoneHint();
            Hint whatsappHint = challengeViewState.getWhatsappHint();
            boolean isLoading = challengeViewState.isLoading();
            boolean india = c0585q.india(challengeViewModel);
            Object jade5 = c0585q.jade();
            if (india || jade5 == asVar) {
                jade5 = new ChallengeViewKt$ChallengeView$1$1$1(challengeViewModel);
                c0585q.f(jade5);
            }
            InterfaceC1775g interfaceC1775g = (InterfaceC1775g) jade5;
            boolean india2 = c0585q.india(challengeViewModel);
            Object jade6 = c0585q.jade();
            if (india2 || jade6 == asVar) {
                jade6 = new ChallengeViewKt$ChallengeView$1$2$1(challengeViewModel);
                c0585q.f(jade6);
            }
            ChallengeView(resourceProvider, designTokens, isLoading, (Function0) ((InterfaceC1775g) jade6), whatsappHint, emailHint, phoneHint, (Function1) interfaceC1775g, c0585q, 48);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 26);
        }
    }

    public static final Unit ChallengeView$lambda$7(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ChallengeView(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ChallengeView$lambda$8(ResourceProvider resourceProvider, DesignTokens designTokens, boolean z2, Function0 function0, Hint hint, Hint hint2, Hint hint3, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ChallengeView(resourceProvider, designTokens, z2, function0, hint, hint2, hint3, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void ChallengeView(ResourceProvider resourceProvider, DesignTokens designTokens, boolean z2, Function0<Unit> function0, Hint hint, Hint hint2, Hint hint3, Function1<? super Hint, Unit> function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        DesignTokens designTokens2;
        Function0<Unit> function02;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-965538989);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(resourceProvider) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            designTokens2 = designTokens;
            i5 |= c0585q.golf(designTokens2) ? 32 : 16;
        } else {
            designTokens2 = designTokens;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.hotel(z2) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            function02 = function0;
            i5 |= c0585q.india(function02) ? 2048 : Barcode.FORMAT_UPC_E;
        } else {
            function02 = function0;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q.golf(hint) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q.golf(hint2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q.golf(hint3) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= c0585q.india(function1) ? 8388608 : 4194304;
        }
        if (!c0585q.magenta(i5 & 1, (4793491 & i5) != 4793490)) {
            c0585q.ochre();
        } else if (z2) {
            c0585q.purple(-975723475);
            p pVar = p.alpha;
            G1.bravo(V.oscar(pVar, 32), ExtensionsKt.secondaryColor(designTokens2), 0.0f, ExtensionsKt.backgroundColor(designTokens2), 0, c0585q, 6, 20);
            TextButtonViewKt.TextButtonView(resourceProvider.getString(String0_commonMainKt.getCko_otp_different_method(Res.string.INSTANCE), c0585q, (i5 << 3) & 112), designTokens2, androidx.compose.ui.platform.a.alpha(pVar, TestTags.OTP_DIFFERENT_METHOD_BUTTON), function02, c0585q, (i5 & 7168) | (i5 & 112) | 384, 0);
            c0585q = c0585q;
            c0585q.quebec(false);
        } else {
            c0585q.purple(-975245176);
            int i10 = i5 & 126;
            int i11 = i5 >> 6;
            ChallengeButtonsViewKt.ChallengeButtonsView(resourceProvider, designTokens, hint, hint2, hint3, function1, c0585q, i10 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
            c0585q.quebec(false);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(resourceProvider, designTokens, z2, function0, hint, hint2, hint3, function1, i4);
        }
    }
}
