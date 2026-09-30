package com.checkout.components.kmp.rememberme.view.otp;

import Cb.h;
import D0.an;
import F.AbstractC0127k2;
import F.AbstractC0149q0;
import F.C0143o2;
import F.C0150q1;
import F.G1;
import F.O;
import F4.g;
import H0.r;
import P.e;
import T.p;
import T.s;
import Xd.l;
import Yb.C0312j0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import b.c0;
import bz.af;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.Extensions_androidKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u008d\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u00152\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u000f\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u000f\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0004\b \u0010\u0019\u001a\u0017\u0010\"\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\fH\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkotlin/Function0;", "", "goToChallengeView", "OTPView", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;I)V", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "email", "", "", "otpCodes", "Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "errorCode", "", "fieldsEnabled", "isLoading", "timeLeftInSeconds", "resendChallenge", "Lkotlin/Function2;", "updateOTPCode", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Ljava/lang/String;Ljava/util/List;Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;ZZILkotlin/jvm/functions/Function0;LXd/l;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "OTPView150Preview", "(Landroidx/compose/runtime/m;I)V", "OTPView200Preview", "OTPView250Preview", "OTPView300Preview", "OTPView350Preview", "OTPView400Preview", "OTPView450Preview", "OTPView500Preview", "containerWidth", "OTPViewPreview", "(ILandroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OTPViewKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                iArr[ErrorCode.OTP_INCORRECT_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorCode.OTP_MAX_RETRIES_REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorCode.OTP_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorCode.BLANK_CLIENT_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorCode.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OTPView(@NotNull Function0<Unit> goToChallengeView, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(goToChallengeView, "goToChallengeView");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2063555550);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(goToChallengeView) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if (c0585q.magenta(1 & i5, (i5 & 3) != 2)) {
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
                        throw new IllegalStateException(Q0.c.papa("Failed to resolve dependency ", u.alpha.bravo(ResourceProvider.class).kilo(), ": ", e.getMessage()));
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
                        throw new IllegalStateException(Q0.c.papa("Failed to resolve dependency ", u.alpha.bravo(DesignTokens.class).kilo(), ": ", e4.getMessage()));
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
                        throw new IllegalStateException(Q0.c.papa("Failed to resolve dependency ", u.alpha.bravo(AuthInfoRepository.class).kilo(), ": ", e5.getMessage()));
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
                eg.a koin$rememberme_release4 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release4 != null) {
                    try {
                        jade4 = (OTPViewModel) koin$rememberme_release4.charlie.delta.alpha(u.alpha.bravo(OTPViewModel.class), null);
                        c0585q.f(jade4);
                    } catch (Exception e10) {
                        throw new IllegalStateException(Q0.c.papa("Failed to resolve dependency ", u.alpha.bravo(OTPViewModel.class).kilo(), ": ", e10.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            OTPViewModel oTPViewModel = (OTPViewModel) jade4;
            ax mike3 = C0564b.mike(oTPViewModel.getState$rememberme_release(), c0585q, 0);
            String str2 = (String) mike.getValue();
            List<Integer> otpCodes = ((OTPViewState) mike3.getValue()).getOtpCodes();
            ErrorCode errorCode = ((OTPViewState) mike3.getValue()).getErrorCode();
            boolean fieldsEnabled = ((OTPViewState) mike3.getValue()).getFieldsEnabled();
            boolean isLoading = ((OTPViewState) mike3.getValue()).isLoading();
            int timeLeftInSeconds = ((OTPViewState) mike3.getValue()).getTimeLeftInSeconds();
            boolean india = c0585q.india(oTPViewModel);
            Object jade5 = c0585q.jade();
            if (india || jade5 == asVar) {
                jade5 = new C0312j0(15, oTPViewModel);
                c0585q.f(jade5);
            }
            Function0 function0 = (Function0) jade5;
            boolean india2 = c0585q.india(oTPViewModel);
            Object jade6 = c0585q.jade();
            if (india2 || jade6 == asVar) {
                jade6 = new af(3, oTPViewModel);
                c0585q.f(jade6);
            }
            OTPView(resourceProvider, designTokens, str2, otpCodes, errorCode, fieldsEnabled, isLoading, timeLeftInSeconds, function0, (l) jade6, goToChallengeView, c0585q, 48, i5 & 14);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(i4, 3, goToChallengeView);
        }
    }

    public static final Unit OTPView$lambda$14(ResourceProvider resourceProvider, DesignTokens designTokens, String str, List list, ErrorCode errorCode, boolean z2, boolean z10, int i4, Function0 function0, l lVar, Function0 function02, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        OTPView(resourceProvider, designTokens, str, list, errorCode, z2, z10, i4, function0, lVar, function02, interfaceC0581m, C0564b.cyan(i5 | 1), C0564b.cyan(i10));
        return Unit.INSTANCE;
    }

    public static final Unit OTPView$lambda$5$lambda$4(OTPViewModel oTPViewModel) {
        oTPViewModel.resendChallenge$rememberme_release();
        return Unit.INSTANCE;
    }

    public static final boolean OTPView$lambda$7$lambda$6(OTPViewModel oTPViewModel, int i4, String value) {
        Intrinsics.echo(value, "value");
        return oTPViewModel.updateOTPCode(i4, value);
    }

    public static final Unit OTPView$lambda$8(Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView(function0, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView150Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1237701098);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(150, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 7);
        }
    }

    public static final Unit OTPView150Preview$lambda$15(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView150Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView200Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1280962436);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(200, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 1);
        }
    }

    public static final Unit OTPView200Preview$lambda$16(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView200Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView250Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1849348023);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(250, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 3);
        }
    }

    public static final Unit OTPView250Preview$lambda$17(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView250Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView300Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1806086685);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(300, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 8);
        }
    }

    public static final Unit OTPView300Preview$lambda$18(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView300Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView350Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-641429848);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(350, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 5);
        }
    }

    public static final Unit OTPView350Preview$lambda$19(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView350Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView400Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-598168510);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(HttpConstants.HTTP_BAD_REQUEST, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 2);
        }
    }

    public static final Unit OTPView400Preview$lambda$20(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView400Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView450Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(566488327);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(HttpConstants.HTTP_BLOCKED, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 4);
        }
    }

    public static final Unit OTPView450Preview$lambda$21(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView450Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPView500Preview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(609749665);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            OTPViewPreview(HttpConstants.HTTP_INTERNAL_ERROR, c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 0);
        }
    }

    public static final Unit OTPView500Preview$lambda$22(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPView500Preview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPViewPreview(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-874972409);
        if ((i5 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i5;
        } else {
            i10 = i5;
        }
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, e.echo(1083863259, new c(i4, 6), c0585q), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new S4.a(i4, i5, 1);
        }
    }

    public static final Unit OTPViewPreview$lambda$31(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        boolean z2;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, z2)) {
            AbstractC0127k2.alpha(null, null, 0L, 0L, 0.0f, 0.0f, null, e.echo(489988768, new g(i4, 29), c0585q), c0585q, 12582912, 127);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OTPViewPreview$lambda$31$lambda$30(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        boolean z2;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, z2)) {
            s sierra = AbstractC0538d.sierra(V.oscar(p.alpha, i4), 16);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q, 48);
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
            ResourceProvider resourceProvider = new ResourceProvider(null);
            DesignTokens designTokens = new DesignTokens(null, null, null, null, 15, null);
            List listOf = CollectionsKt.listOf(0, 0, 0, 0, 0, 0);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new c0(16);
                c0585q.f(jade);
            }
            Function0 function0 = (Function0) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new com.checkout.components.kmp.rememberme.di.b(9);
                c0585q.f(jade2);
            }
            l lVar = (l) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new c0(17);
                c0585q.f(jade3);
            }
            OTPView(resourceProvider, designTokens, "test@checkout.com", listOf, null, true, false, 59, function0, lVar, (Function0) jade3, c0585q, 920350080, 6);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final boolean OTPViewPreview$lambda$31$lambda$30$lambda$29$lambda$26$lambda$25(int i4, String str) {
        Intrinsics.echo(str, "<unused var>");
        return true;
    }

    public static final Unit OTPViewPreview$lambda$32(int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        OTPViewPreview(i4, interfaceC0581m, C0564b.cyan(i5 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0145, code lost:
    
        if (r13 == androidx.compose.runtime.C0580l.alpha) goto L291;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OTPView(@NotNull ResourceProvider resourceProvider, @NotNull final DesignTokens designTokens, @NotNull final String email, @NotNull final List<Integer> list, @Nullable final ErrorCode errorCode, final boolean z2, final boolean z10, final int i4, @NotNull final Function0<Unit> resendChallenge, @NotNull final l lVar, @NotNull final Function0<Unit> goToChallengeView, @Nullable InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        boolean z11;
        ResourceProvider resourceProvider2;
        C0585q c0585q;
        Q uniform;
        Object obj;
        String string;
        p pVar;
        List<Integer> otpCodes = list;
        l updateOTPCode = lVar;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(email, "email");
        Intrinsics.echo(otpCodes, "otpCodes");
        Intrinsics.echo(resendChallenge, "resendChallenge");
        Intrinsics.echo(updateOTPCode, "updateOTPCode");
        Intrinsics.echo(goToChallengeView, "goToChallengeView");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(495532926);
        int i11 = (i5 & 6) == 0 ? (c0585q2.india(resourceProvider) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i11 |= c0585q2.golf(designTokens) ? 32 : 16;
        }
        boolean z12 = true;
        int i12 = 3;
        if ((i5 & 384) == 0) {
            i11 |= c0585q2.golf(email) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= c0585q2.india(otpCodes) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i5 & 24576) == 0) {
            i11 |= c0585q2.echo(errorCode == null ? -1 : errorCode.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i5) == 0) {
            i11 |= c0585q2.hotel(z2) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i11 |= c0585q2.hotel(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i11 |= c0585q2.echo(i4) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i11 |= c0585q2.india(resendChallenge) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i11 |= c0585q2.india(updateOTPCode) ? 536870912 : 268435456;
        }
        int i13 = (i10 & 6) == 0 ? i10 | (c0585q2.india(goToChallengeView) ? 4 : 2) : i10;
        if ((i11 & 306783379) == 306783378 && (i13 & 3) == 2) {
            z11 = false;
            if (!c0585q2.magenta(i11 & 1, z11)) {
                boolean z13 = (i11 & 896) == 256;
                Object jade = c0585q2.jade();
                if (!z13) {
                    obj = jade;
                }
                int size = otpCodes.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList.add(new Y.s());
                }
                c0585q2.f(arrayList);
                obj = arrayList;
                List list2 = (List) obj;
                int i15 = i11;
                boolean z14 = errorCode != null;
                long errorColor = ExtensionsKt.errorColor(designTokens);
                C0150q1 c0150q1 = C0150q1.alpha;
                C0143o2 delta = C0150q1.delta((O) c0585q2.kilo(F.Q.alpha), c0585q2);
                long primaryColor = z14 ? errorColor : ExtensionsKt.primaryColor(designTokens);
                long primaryColor2 = z14 ? errorColor : ExtensionsKt.primaryColor(designTokens);
                long disabledColor = z14 ? errorColor : ExtensionsKt.disabledColor(designTokens);
                long formBorderColor = z14 ? errorColor : ExtensionsKt.formBorderColor(designTokens);
                int i16 = i15;
                C0143o2 alpha = delta.alpha(primaryColor, primaryColor2, ExtensionsKt.disabledColor(designTokens), z14 ? errorColor : ExtensionsKt.primaryColor(designTokens), ExtensionsKt.formBackgroundColor(designTokens), ExtensionsKt.formBackgroundColor(designTokens), delta.golf, ExtensionsKt.formBackgroundColor(designTokens), ExtensionsKt.primaryColor(designTokens), errorColor, delta.kilo, z14 ? errorColor : ExtensionsKt.actionColor(designTokens), formBorderColor, disabledColor, delta.oscar, delta.papa, delta.quebec, delta.romeo, delta.sierra, delta.tango, delta.uniform, delta.victor, delta.whiskey, delta.xray, delta.yankee, delta.zulu, delta.amber, delta.azure, delta.beige, delta.black, delta.blue, delta.bronze, delta.coral, delta.crimson, delta.cyan, delta.emerald, delta.fuchsia, delta.gold, delta.gray, delta.green, delta.indigo, delta.ivory, delta.jade);
                if (!z2) {
                    errorColor = ExtensionsKt.disabledColor(designTokens);
                } else if (!z14) {
                    errorColor = ExtensionsKt.primaryColor(designTokens);
                }
                an anVar = new an(errorColor, AbstractC2636d7.charlie(designTokens.getFonts().getInput().getFontSize()), ExtensionsKt.toComposeFontWeight(designTokens.getFonts().getInput().getFontWeight()), new r(ExtensionsKt.toComposeFontStyle(designTokens.getFonts().getInput().getFontStyle())), Extensions_androidKt.toComposeFontFamily(designTokens.getFonts().getInput().getFontFamily()), 0L, 3, ExtensionsKt.toComposeLineHeight(designTokens.getFonts().getInput().getLineHeight(), designTokens.getFonts().getInput().getFontSize()), 0, 16613328);
                p pVar2 = p.alpha;
                s charlie = V.charlie(pVar2, 1.0f);
                C0537c c0537c = AbstractC0542h.alpha;
                S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.hotel(6, T.d.f2063g), T.d.f2060c, c0585q2, 6);
                int romeo = C0564b.romeo(c0585q2);
                I mike = c0585q2.mike();
                s charlie2 = T.a.charlie(charlie, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie2);
                U u4 = U.alpha;
                c0585q2.purple(529298643);
                int i17 = 0;
                C0585q c0585q3 = c0585q2;
                while (i17 < 6) {
                    int i18 = i17 + 1;
                    C0585q c0585q4 = c0585q3;
                    int i19 = i12;
                    List list3 = list2;
                    OTPTextFieldViewKt.OTPTextFieldView(u4, otpCodes.get(i17).intValue() == -1 ? "" : String.valueOf(otpCodes.get(i17).intValue()), updateOTPCode, i17, z2, otpCodes, z14, alpha, anVar, list3, androidx.compose.ui.platform.a.alpha(pVar2, TestTags.OTP_INPUT + i18), c0585q4, 6 | ((i16 >> 21) & 896) | ((i16 >> 3) & 57344) | ((i16 << 6) & 458752), 0, 0);
                    otpCodes = list;
                    updateOTPCode = lVar;
                    i17 = i18;
                    list2 = list3;
                    c0585q3 = c0585q4;
                    z12 = z12;
                    i12 = i19;
                    i16 = i16;
                }
                C0585q c0585q5 = c0585q3;
                int i20 = i16;
                boolean z15 = z12;
                int i21 = i12;
                c0585q5.quebec(false);
                c0585q5.quebec(z15);
                if (errorCode == null) {
                    c0585q5.purple(621903665);
                    c0585q5.quebec(false);
                    c0585q = c0585q5;
                } else {
                    c0585q5.purple(621903666);
                    int i22 = WhenMappings.$EnumSwitchMapping$0[errorCode.ordinal()];
                    if (i22 == z15) {
                        c0585q5.purple(-173677322);
                        string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_error(Res.string.INSTANCE), c0585q5, (i20 << 3) & 112);
                        c0585q5.quebec(false);
                    } else if (i22 == 2) {
                        c0585q5.purple(-173673897);
                        string = resourceProvider.getString(String0_commonMainKt.getCko_otp_max_retries(Res.string.INSTANCE), c0585q5, (i20 << 3) & 112);
                        c0585q5.quebec(false);
                    } else if (i22 != i21) {
                        if (i22 != 4 && i22 != 5) {
                            throw ad.black(c0585q5, -173679481, false);
                        }
                        c0585q5.purple(-173666347);
                        c0585q5.quebec(false);
                        string = errorCode.getMessage();
                    } else {
                        c0585q5.purple(-173670824);
                        string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_expired(Res.string.INSTANCE), c0585q5, (i20 << 3) & 112);
                        c0585q5.quebec(false);
                    }
                    TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.errorColor(designTokens), designTokens.getFonts().getFootnote(), string, 0, (O0.l) null, c0585q5, 0, 49);
                    c0585q = c0585q5;
                    c0585q.quebec(false);
                }
                if (z10) {
                    c0585q.purple(622532470);
                    G1.bravo(V.oscar(pVar2, 24), ExtensionsKt.secondaryColor(designTokens), 0.0f, ExtensionsKt.backgroundColor(designTokens), 0, c0585q, 6, 20);
                    c0585q.quebec(false);
                    resourceProvider2 = resourceProvider;
                    pVar = pVar2;
                } else {
                    c0585q.purple(622739488);
                    int i23 = i20 >> 15;
                    pVar = pVar2;
                    OTPCountDownViewKt.OTPCountDownView(resourceProvider, designTokens, i4, resendChallenge, c0585q, (i23 & 7168) | (i20 & 126) | (i23 & 896));
                    resourceProvider2 = resourceProvider;
                    c0585q.quebec(false);
                }
                TextButtonViewKt.TextButtonView(resourceProvider2.getString(String0_commonMainKt.getCko_otp_different_method(Res.string.INSTANCE), c0585q, (i20 << 3) & 112), designTokens, androidx.compose.ui.platform.a.alpha(pVar, TestTags.OTP_DIFFERENT_METHOD_BUTTON), goToChallengeView, c0585q, (i20 & 112) | 384 | ((i13 << 9) & 7168), 0);
            } else {
                resourceProvider2 = resourceProvider;
                c0585q = c0585q2;
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                final ResourceProvider resourceProvider3 = resourceProvider2;
                uniform.delta = new l() { // from class: com.checkout.components.kmp.rememberme.view.otp.d
                    @Override // Xd.l
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit OTPView$lambda$14;
                        int intValue = ((Integer) obj3).intValue();
                        ResourceProvider resourceProvider4 = ResourceProvider.this;
                        DesignTokens designTokens2 = designTokens;
                        String str = email;
                        List list4 = list;
                        Function0 function0 = resendChallenge;
                        l lVar2 = lVar;
                        Function0 function02 = goToChallengeView;
                        int i24 = i5;
                        int i25 = i10;
                        OTPView$lambda$14 = OTPViewKt.OTPView$lambda$14(resourceProvider4, designTokens2, str, list4, errorCode, z2, z10, i4, function0, lVar2, function02, i24, i25, (InterfaceC0581m) obj2, intValue);
                        return OTPView$lambda$14;
                    }
                };
                return;
            }
            return;
        }
        z11 = true;
        if (!c0585q2.magenta(i11 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
