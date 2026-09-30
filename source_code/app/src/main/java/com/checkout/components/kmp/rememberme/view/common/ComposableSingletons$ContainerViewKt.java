package com.checkout.components.kmp.rememberme.view.common;

import P.d;
import S4.b;
import T.p;
import T.s;
import Xd.l;
import a0.ao;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ContainerViewKt {

    @NotNull
    public static final ComposableSingletons$ContainerViewKt INSTANCE = new ComposableSingletons$ContainerViewKt();

    @NotNull
    private static l lambda$1700125514 = new d(new b(4), 1700125514, false);

    /* renamed from: lambda$-596465334 */
    @NotNull
    private static l f0lambda$596465334 = new d(new b(5), -596465334, false);

    public static /* synthetic */ Unit alpha(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda_1700125514$lambda$0(interfaceC0581m, i4);
    }

    public static /* synthetic */ Unit bravo(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__596465334$lambda$2(interfaceC0581m, i4);
    }

    public static final Unit lambda_1700125514$lambda$0(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            DesignTokens.Companion companion = DesignTokens.INSTANCE;
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(companion.getDEFAULT()), companion.getDEFAULT().getFonts().getSubheading(), "this is the main content of the container view", 0, (O0.l) null, c0585q, 3456, 49);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__596465334$lambda$2(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            s sierra = AbstractC0538d.sierra(a.bravo(p.alpha, ExtensionsKt.backgroundColor(DesignTokens.INSTANCE.getDEFAULT()), ao.alpha), 12);
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
            ContainerViewKt.ContainerView("jordan.smith@email.com", lambda$1700125514, c0585q, 54);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-596465334$rememberme_release */
    public final l m120getLambda$596465334$rememberme_release() {
        return f0lambda$596465334;
    }

    @NotNull
    public final l getLambda$1700125514$rememberme_release() {
        return lambda$1700125514;
    }
}
