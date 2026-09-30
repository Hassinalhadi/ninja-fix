package com.checkout.components.kmp.rememberme.view.common;

import Ec.aa;
import F.AbstractC0149q0;
import F4.g;
import Q0.c;
import T.d;
import T.j;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import ao.ad;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.InfoTextViewKt;
import com.checkout.components.kmp.rememberme.view.ui.SecuredTextViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.clevertap.android.sdk.Constants;
import eg.a;
import h.AbstractC1797a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.R3;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "email", "Lkotlin/Function0;", "", Constants.KEY_CONTENT, "ContainerView", "(Ljava/lang/String;LXd/l;Landroidx/compose/runtime/m;I)V", "ContainerViewPreview", "(Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContainerViewKt {
    public static final void ContainerView(@NotNull String str, @NotNull l content, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        l lVar;
        int i10;
        int i11;
        String email = str;
        Intrinsics.echo(email, "email");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-259836386);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(email)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(content)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        int i12 = i5;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
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
                        jade3 = (Function1) koin$rememberme_release3.charlie.delta.alpha(u.alpha.bravo(Function1.class), null);
                        c0585q.f(jade3);
                    } catch (Exception e5) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(Function1.class).kilo(), ": ", e5.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            Function1 function1 = (Function1) jade3;
            p pVar = p.alpha;
            s charlie = V.charlie(pVar, 1.0f);
            C0537c c0537c = AbstractC0542h.charlie;
            C0554u alpha = AbstractC0553t.alpha(c0537c, d.f2062f, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            s charlie3 = R3.charlie(androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), ExtensionsKt.backgroundColor(designTokens), ExtensionsKt.formShape(designTokens)), 1, ExtensionsKt.borderColor(designTokens), ExtensionsKt.formShape(designTokens));
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, d.f2063g, c0585q, 48);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            float f5 = 8;
            float f10 = 16;
            s victor = AbstractC0538d.victor(pVar, f10, f5, f5, f5);
            j jVar = d.f2061d;
            S alpha3 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            int romeo3 = C0564b.romeo(c0585q);
            I mike3 = c0585q.mike();
            s charlie5 = T.a.charlie(victor, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            email = str;
            TextViewKt.m126TextView7O2jLU0(new LayoutWeightElement(1.0f, true), ExtensionsKt.primaryColor(designTokens), designTokens.getFonts().getSubheading(), email, 0, (O0.l) null, c0585q, ((i12 << 9) & 7168) | 384, 48);
            s sierra = AbstractC0538d.sierra(androidx.compose.ui.platform.a.alpha(pVar, TestTags.AUTH_CHANGE_BUTTON), 6);
            String string = resourceProvider.getString(String0_commonMainKt.getCko_remember_me_change(Res.string.INSTANCE), c0585q, 0);
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new Cb.j(3, function1);
                c0585q.f(jade4);
            }
            TextButtonViewKt.TextButtonView(string, designTokens, sierra, (Function0) jade4, c0585q, 3504, 0);
            c0585q.quebec(true);
            ContainerDividerViewKt.ContainerDivider(designTokens, c0585q, 6);
            lVar = content;
            lVar.invoke(c0585q, Integer.valueOf((i12 >> 3) & 14));
            ContainerDividerViewKt.ContainerDivider(designTokens, c0585q, 6);
            s charlie6 = V.charlie(AbstractC0538d.sierra(pVar, f10), 1.0f);
            S alpha4 = Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            int romeo4 = C0564b.romeo(c0585q);
            I mike4 = c0585q.mike();
            s charlie7 = T.a.charlie(charlie6, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ad.blue(romeo4, c0585q, romeo4, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            SecuredTextViewKt.SecuredTextView(designTokens, null, c0585q, 6, 2);
            s alpha5 = androidx.compose.ui.platform.a.alpha(pVar, TestTags.GET_TO_KNOW_US_SHEET);
            Object jade5 = c0585q.jade();
            if (jade5 == asVar) {
                jade5 = new Cb.j(4, function1);
                c0585q.f(jade5);
            }
            InfoTextViewKt.InfoTextView(resourceProvider, designTokens, alpha5, (Function0) jade5, c0585q, 3504, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
            ContainerFooterViewKt.ContainerFooterView(designTokens, resourceProvider, function1, c0585q, 390);
            c0585q.quebec(true);
        } else {
            lVar = content;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(email, lVar, i4, 7);
        }
    }

    public static final Unit ContainerView$lambda$10$lambda$9$lambda$5$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(ClickTarget.CHANGE_TEXT);
        return Unit.INSTANCE;
    }

    public static final Unit ContainerView$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(Function1 function1) {
        function1.invoke(ClickTarget.INFO_TEXT);
        return Unit.INSTANCE;
    }

    public static final Unit ContainerView$lambda$11(String str, l lVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ContainerView(str, lVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final void ContainerViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(448221558);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$ContainerViewKt.INSTANCE.m120getLambda$596465334$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 15);
        }
    }

    public static final Unit ContainerViewPreview$lambda$12(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ContainerViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
