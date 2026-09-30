package com.checkout.components.kmp.rememberme.view.otp;

import F4.g;
import Lb.F;
import O0.l;
import P.e;
import T.p;
import T.s;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.aj;
import androidx.compose.foundation.layout.as;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import b.c0;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "timeLeftInSeconds", "Lkotlin/Function0;", "", "resendChallenge", "OTPCountDownView", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;I)V", "OTPCountDownViewCountingPreview", "(Landroidx/compose/runtime/m;I)V", "OTPCountDownViewResendPreview", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OTPCountDownViewKt {
    public static final void OTPCountDownView(@NotNull ResourceProvider resourceProvider, @NotNull DesignTokens designTokens, int i4, @NotNull Function0<Unit> resendChallenge, @Nullable InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(resendChallenge, "resendChallenge");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-454319260);
        if ((i5 & 6) == 0) {
            if (c0585q.india(resourceProvider)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.echo(i4)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q.india(resendChallenge)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i4 > 0) {
                c0585q.purple(-1182905141);
                TextViewKt.m125TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(designTokens), designTokens.getFonts().getLabel(), ExtensionsKt.m118emboldenPartialTextmxwnekA(ExtensionsKt.buildTextForEmbolden(resourceProvider, String0_commonMainKt.getCko_otp_resend_countdown(Res.string.INSTANCE), c0585q, i10 & 14), String.valueOf(i4), ExtensionsKt.primaryColor(designTokens)), 0, (l) null, c0585q, 0, 49);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1182553942);
                aj.alpha(null, null, null, null, 0, 0, e.echo(-79707141, new W4.d(resourceProvider, designTokens, resendChallenge), c0585q), c0585q, 1572864, 63);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F(resourceProvider, designTokens, i4, resendChallenge, i5);
        }
    }

    public static final Unit OTPCountDownView$lambda$2(ResourceProvider resourceProvider, DesignTokens designTokens, Function0 function0, as FlowRow, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(FlowRow, "$this$FlowRow");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            Res.string stringVar = Res.string.INSTANCE;
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(designTokens), designTokens.getFonts().getLabel(), P0.crimson(resourceProvider.getString(String0_commonMainKt.getCko_otp_resend_description(stringVar), c0585q, 0), " "), 0, (l) null, c0585q, 0, 49);
            s alpha = androidx.compose.ui.platform.a.alpha(p.alpha, TestTags.OTP_RESEND_BUTTON);
            boolean golf = c0585q.golf(function0);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 28);
                c0585q.f(jade);
            }
            TextViewKt.m126TextView7O2jLU0(androidx.compose.foundation.a.delta(alpha, false, null, null, (Function0) jade, 7), ExtensionsKt.actionColor(designTokens), designTokens.getFonts().getLabel(), resourceProvider.getString(String0_commonMainKt.getCko_otp_resend_cta(stringVar), c0585q, 0), 0, (l) null, c0585q, 0, 48);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OTPCountDownView$lambda$2$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit OTPCountDownView$lambda$3(ResourceProvider resourceProvider, DesignTokens designTokens, int i4, Function0 function0, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        OTPCountDownView(resourceProvider, designTokens, i4, function0, interfaceC0581m, C0564b.cyan(i5 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPCountDownViewCountingPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1130730037);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            ResourceProvider resourceProvider = ResourceProvider.INSTANCE.getDEFAULT();
            DesignTokens designTokens = DesignTokens.INSTANCE.getDEFAULT();
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new c0(14);
                c0585q.f(jade);
            }
            OTPCountDownView(resourceProvider, designTokens, 25, (Function0) jade, c0585q, 3504);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 27);
        }
    }

    public static final Unit OTPCountDownViewCountingPreview$lambda$6(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPCountDownViewCountingPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void OTPCountDownViewResendPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1733217837);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            ResourceProvider resourceProvider = ResourceProvider.INSTANCE.getDEFAULT();
            DesignTokens designTokens = DesignTokens.INSTANCE.getDEFAULT();
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new c0(15);
                c0585q.f(jade);
            }
            OTPCountDownView(resourceProvider, designTokens, 0, (Function0) jade, c0585q, 3504);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 28);
        }
    }

    public static final Unit OTPCountDownViewResendPreview$lambda$9(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        OTPCountDownViewResendPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
