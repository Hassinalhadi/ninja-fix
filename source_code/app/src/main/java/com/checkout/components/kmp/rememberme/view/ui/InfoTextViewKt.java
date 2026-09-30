package com.checkout.components.kmp.rememberme.view.ui;

import Bb.a;
import F.AbstractC0149q0;
import F4.g;
import O0.l;
import P.e;
import T.d;
import T.p;
import T.s;
import W4.b;
import W4.c;
import Wf.m;
import a0.C0360n;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.kmp.rememberme.generated.resources.Drawable0_commonMainKt;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.W3;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "LT/s;", "modifier", "Lkotlin/Function0;", "", "onClick", "InfoTextView", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;LT/s;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "InfoTextViewPreview", "(Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoTextViewKt {
    public static final void InfoTextView(@NotNull ResourceProvider resourceProvider, @NotNull DesignTokens designTokens, @Nullable s sVar, @NotNull Function0<Unit> onClick, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-317544003);
        if ((i4 & 6) == 0) {
            if (c0585q.india(resourceProvider)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onClick)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i12;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i15 != 0) {
                sVar = p.alpha;
            }
            EnvironmentProviderViewKt.EnvironmentProviderView(e.echo(1085901631, new b(sVar, onClick, designTokens, resourceProvider), c0585q), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        s sVar2 = sVar;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(resourceProvider, designTokens, sVar2, onClick, i4, i5);
        }
    }

    public static final Unit InfoTextView$lambda$3(s sVar, Function0 function0, DesignTokens designTokens, ResourceProvider resourceProvider, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            boolean golf = c0585q.golf(function0);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new a(function0, 22);
                c0585q.f(jade);
            }
            s delta = androidx.compose.foundation.a.delta(sVar, false, null, null, (Function0) jade, 7);
            S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(4), d.f2061d, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = T.a.charlie(delta, c0585q);
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
            W3.alpha(m.alpha(Drawable0_commonMainKt.getCko_ic_info(Res.drawable.INSTANCE), c0585q, 0), null, V.kilo(p.alpha, 16), null, null, 0.0f, new C0360n(ExtensionsKt.secondaryColor(designTokens), 5), c0585q, 432, 56);
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(designTokens), designTokens.getFonts().getFootnote(), resourceProvider.getString(String0_commonMainKt.getCko_remember_me_modal_cta(Res.string.INSTANCE), c0585q, 0), 6, l.charlie, c0585q, 196608, 1);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoTextView$lambda$3$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit InfoTextView$lambda$4(ResourceProvider resourceProvider, DesignTokens designTokens, s sVar, Function0 function0, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InfoTextView(resourceProvider, designTokens, sVar, function0, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void InfoTextViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1691036403);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$InfoTextViewKt.INSTANCE.m121getLambda$1937116729$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 17);
        }
    }

    public static final Unit InfoTextViewPreview$lambda$5(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InfoTextViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
