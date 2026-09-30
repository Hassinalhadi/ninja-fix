package com.checkout.components.kmp.rememberme.view.authentication;

import F.AbstractC0149q0;
import F4.g;
import Jb.C0195c;
import O0.l;
import P.e;
import Q0.c;
import T.d;
import T.p;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewState;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.challenge.ChallengeViewKt;
import com.checkout.components.kmp.rememberme.view.common.ContainerViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;
import com.checkout.components.kmp.rememberme.view.ui.EnvironmentProviderViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import eg.a;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aG\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\rH\u0003¢\u0006\u0004\b\u0001\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0002¨\u0006\u0011"}, d2 = {"", "AuthenticationView", "(Landroidx/compose/runtime/m;I)V", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "email", "Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;", "viewType", "Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", "requestedChallengeType", "Lkotlin/Function0;", "goToChallengeView", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;Lcom/checkout/components/kmp/rememberme/shared/model/HintType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;I)V", "AuthenticationViewPreview", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationViewKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HintType.values().length];
            try {
                iArr[HintType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HintType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HintType.WHATSAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuthenticationViewType.values().length];
            try {
                iArr2[AuthenticationViewType.CHALLENGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AuthenticationViewType.OTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void AuthenticationView(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1546573027);
        if (c0585q.magenta(1 & i4, i4 != 0)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
                a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
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
                a koin$rememberme_release2 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
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
                a koin$rememberme_release3 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
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
            ax mike = C0564b.mike(authInfoRepository.getEmail(), c0585q, 0);
            ax mike2 = C0564b.mike(authInfoRepository.getHintId(), c0585q, 0);
            String str = (String) mike.getValue();
            boolean golf = c0585q.golf((String) mike2.getValue()) | c0585q.golf(str);
            Object jade4 = c0585q.jade();
            if (golf || jade4 == asVar) {
                DependencyResolver dependencyResolver4 = DependencyResolver.INSTANCE;
                a koin$rememberme_release4 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release4 != null) {
                    try {
                        jade4 = (AuthenticationViewModel) koin$rememberme_release4.charlie.delta.alpha(u.alpha.bravo(AuthenticationViewModel.class), null);
                        c0585q.f(jade4);
                    } catch (Exception e10) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(AuthenticationViewModel.class).kilo(), ": ", e10.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            AuthenticationViewModel authenticationViewModel = (AuthenticationViewModel) jade4;
            Object jade5 = c0585q.jade();
            if (jade5 == asVar) {
                DependencyResolver dependencyResolver5 = DependencyResolver.INSTANCE;
                a koin$rememberme_release5 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release5 != null) {
                    try {
                        jade5 = (ChallengeRepository) koin$rememberme_release5.charlie.delta.alpha(u.alpha.bravo(ChallengeRepository.class), null);
                        c0585q.f(jade5);
                    } catch (Exception e11) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(ChallengeRepository.class).kilo(), ": ", e11.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            EnvironmentProviderViewKt.EnvironmentProviderView(e.echo(-1888248731, new C0195c(resourceProvider, designTokens, mike, C0564b.mike(authenticationViewModel.getState$rememberme_release(), c0585q, 0), C0564b.mike(((ChallengeRepository) jade5).getHintType(), c0585q, 0), authenticationViewModel), c0585q), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 24);
        }
    }

    public static final Unit AuthenticationView$lambda$12(DesignTokens designTokens, ResourceProvider resourceProvider, HintType hintType, AuthenticationViewType authenticationViewType, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        String string;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            float f5 = 16;
            s sierra = AbstractC0538d.sierra(p.alpha, f5);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f5), d.f2063g, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            long primaryColor = ExtensionsKt.primaryColor(designTokens);
            Font heading = designTokens.getFonts().getHeading();
            Res.string stringVar = Res.string.INSTANCE;
            TextViewKt.m126TextView7O2jLU0((s) null, primaryColor, heading, resourceProvider.getString(String0_commonMainKt.getCko_remember_me_use_saved_details(stringVar), c0585q, 0), 0, (l) null, c0585q, 0, 49);
            if (hintType == null) {
                c0585q.purple(-1396849290);
            } else {
                c0585q.purple(-1396849289);
                long secondaryColor = ExtensionsKt.secondaryColor(designTokens);
                Font subheading = designTokens.getFonts().getSubheading();
                int i5 = WhenMappings.$EnumSwitchMapping$0[hintType.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            c0585q.purple(1096950298);
                            string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_description_whatsapp(stringVar), c0585q, 0);
                            c0585q.quebec(false);
                        } else {
                            throw ad.black(c0585q, 1096939660, false);
                        }
                    } else {
                        c0585q.purple(1096945463);
                        string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_description_phone(stringVar), c0585q, 0);
                        c0585q.quebec(false);
                    }
                } else {
                    c0585q.purple(1096941751);
                    string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_description_email(stringVar), c0585q, 0);
                    c0585q.quebec(false);
                }
                TextViewKt.m126TextView7O2jLU0((s) null, secondaryColor, subheading, string, 0, (l) null, c0585q, 0, 49);
            }
            c0585q.quebec(false);
            int i10 = WhenMappings.$EnumSwitchMapping$1[authenticationViewType.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    c0585q.purple(1617532645);
                    boolean golf = c0585q.golf(function0);
                    Object jade = c0585q.jade();
                    if (golf || jade == C0580l.alpha) {
                        jade = new Bb.a(function0, 27);
                        c0585q.f(jade);
                    }
                    OTPViewKt.OTPView((Function0) jade, c0585q, 0);
                    c0585q.quebec(false);
                } else {
                    throw ad.black(c0585q, 1617529718, false);
                }
            } else {
                c0585q.purple(1617531200);
                ChallengeViewKt.ChallengeView(c0585q, 0);
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuthenticationView$lambda$12$lambda$11$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AuthenticationView$lambda$13(ResourceProvider resourceProvider, DesignTokens designTokens, String str, AuthenticationViewType authenticationViewType, HintType hintType, Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AuthenticationView(resourceProvider, designTokens, str, authenticationViewType, hintType, function0, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit AuthenticationView$lambda$6(ResourceProvider resourceProvider, DesignTokens designTokens, D0 d02, D0 d03, D0 d04, AuthenticationViewModel authenticationViewModel, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            String str = (String) d02.getValue();
            AuthenticationViewType viewType = ((AuthenticationViewState) d03.getValue()).getViewType();
            HintType hintType = (HintType) d04.getValue();
            boolean india = c0585q.india(authenticationViewModel);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new AuthenticationViewKt$AuthenticationView$1$1$1(authenticationViewModel);
                c0585q.f(jade);
            }
            AuthenticationView(resourceProvider, designTokens, str, viewType, hintType, (Function0) ((InterfaceC1775g) jade), c0585q, 48);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuthenticationView$lambda$7(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AuthenticationView(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void AuthenticationViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(225534293);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$AuthenticationViewKt.INSTANCE.getLambda$784198697$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 25);
        }
    }

    public static final Unit AuthenticationViewPreview$lambda$14(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AuthenticationViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void AuthenticationView(ResourceProvider resourceProvider, DesignTokens designTokens, String str, AuthenticationViewType authenticationViewType, HintType hintType, Function0<Unit> function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(134036693);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(resourceProvider) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(designTokens) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.golf(str) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.echo(authenticationViewType.ordinal()) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q.echo(hintType == null ? -1 : hintType.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q.india(function0) ? 131072 : 65536;
        }
        if (c0585q.magenta(i5 & 1, (74899 & i5) != 74898)) {
            ContainerViewKt.ContainerView(str, e.echo(1978674715, new Ac.e(designTokens, resourceProvider, hintType, authenticationViewType, function0, 5), c0585q), c0585q, ((i5 >> 6) & 14) | 48);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.e(resourceProvider, designTokens, str, authenticationViewType, hintType, function0, i4, 2);
        }
    }
}
