package com.checkout.components.kmp.rememberme.view.authentication;

import P.d;
import T.s;
import Xd.l;
import a0.ao;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import b.c0;
import com.checkout.components.kmp.rememberme.di.b;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AuthenticationViewKt {

    @NotNull
    public static final ComposableSingletons$AuthenticationViewKt INSTANCE = new ComposableSingletons$AuthenticationViewKt();

    @NotNull
    private static l lambda$784198697 = new d(new b(8), 784198697, false);

    public static final Unit lambda_784198697$lambda$3(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            FillElement fillElement = V.charlie;
            DesignTokens.Companion companion = DesignTokens.INSTANCE;
            s sierra = AbstractC0538d.sierra(a.bravo(fillElement, ExtensionsKt.backgroundColor(companion.getDEFAULT()), ao.alpha), 12);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
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
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            ResourceProvider resourceProvider = ResourceProvider.INSTANCE.getDEFAULT();
            DesignTokens designTokens = companion.getDEFAULT();
            AuthenticationViewType authenticationViewType = AuthenticationViewType.OTP;
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new c0(13);
                c0585q.f(jade);
            }
            AuthenticationViewKt.AuthenticationView(resourceProvider, designTokens, "jordan.smith@email.com", authenticationViewType, null, (Function0) jade, c0585q, 224688);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$784198697$rememberme_release() {
        return lambda$784198697;
    }
}
