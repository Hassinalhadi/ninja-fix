package com.checkout.components.kmp.rememberme.view.common;

import Cb.j;
import Ec.al;
import O0.l;
import T.a;
import T.d;
import T.p;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lkotlin/Function1;", "Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "", "clickHandler", "ContainerFooterView", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContainerFooterViewKt {
    public static final void ContainerFooterView(@NotNull DesignTokens designTokens, @NotNull ResourceProvider resourceProvider, @NotNull Function1<? super ClickTarget, Unit> clickHandler, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(clickHandler, "clickHandler");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1957036750);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(designTokens)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(resourceProvider)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(clickHandler)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar = p.alpha;
            s uniform = AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 0.0f, 4, 1);
            ap delta = AbstractC0547m.delta(d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = a.charlie(uniform, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            s alpha = androidx.compose.ui.platform.a.alpha(pVar, TestTags.AUTH_CONTINUE_WITHOUT_SAVED_DETAILS);
            String string = resourceProvider.getString(String0_commonMainKt.getCko_remember_me_continue_without_saved_details(Res.string.INSTANCE), c0585q, i5 & 112);
            boolean z10 = false;
            l lVar = l.charlie;
            Font label = designTokens.getFonts().getLabel();
            long secondaryColor = ExtensionsKt.secondaryColor(designTokens);
            if ((i5 & 896) == 256) {
                z10 = true;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new j(2, clickHandler);
                c0585q.f(jade);
            }
            TextButtonViewKt.m124TextButtonViewFU0evQE(string, label, secondaryColor, lVar, alpha, (Function0) jade, c0585q, 27648, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new al(designTokens, resourceProvider, clickHandler, i4, 6);
        }
    }

    public static final Unit ContainerFooterView$lambda$2$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(ClickTarget.CONTINUE_WITHOUT_SAVED_DETAILS_TEXT);
        return Unit.INSTANCE;
    }

    public static final Unit ContainerFooterView$lambda$3(DesignTokens designTokens, ResourceProvider resourceProvider, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ContainerFooterView(designTokens, resourceProvider, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
