package com.checkout.components.kmp.rememberme.view.ui;

import G4.b;
import P.e;
import Q0.c;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.O;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.utils.LayoutDirectionStateRepository;
import com.checkout.components.kmp.rememberme.utils.LocaleProvider;
import com.checkout.components.kmp.rememberme.utils.LocaleStateRepository;
import com.clevertap.android.sdk.Constants;
import eg.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.AbstractC2901T;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", Constants.KEY_CONTENT, "EnvironmentProviderView", "(LXd/l;Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvironmentProviderViewKt {
    public static final void EnvironmentProviderView(@NotNull l content, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1580503810);
        if ((i4 & 6) == 0) {
            if (c0585q.india(content)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
                a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release != null) {
                    try {
                        jade = (LocaleStateRepository) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(LocaleStateRepository.class), null);
                        c0585q.f(jade);
                    } catch (Exception e) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(LocaleStateRepository.class).kilo(), ": ", e.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            LocaleStateRepository localeStateRepository = (LocaleStateRepository) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                DependencyResolver dependencyResolver2 = DependencyResolver.INSTANCE;
                a koin$rememberme_release2 = KoinInitializer.INSTANCE.getKoin$rememberme_release();
                if (koin$rememberme_release2 != null) {
                    try {
                        jade2 = (LayoutDirectionStateRepository) koin$rememberme_release2.charlie.delta.alpha(u.alpha.bravo(LayoutDirectionStateRepository.class), null);
                        c0585q.f(jade2);
                    } catch (Exception e4) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(LayoutDirectionStateRepository.class).kilo(), ": ", e4.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            C0564b.bravo(new O[]{LocaleProvider.INSTANCE.provides(localeStateRepository.getState$rememberme_release(), c0585q, 48), AbstractC2901T.november.alpha(((LayoutDirectionStateRepository) jade2).getState$rememberme_release())}, e.echo(758790082, new Cb.a(16, localeStateRepository, content), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(content, i4, 1);
        }
    }

    public static final Unit EnvironmentProviderView$lambda$2(LocaleStateRepository localeStateRepository, l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            c0585q.pink(-947171132, localeStateRepository.getState$rememberme_release());
            lVar.invoke(c0585q, 0);
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EnvironmentProviderView$lambda$3(l lVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        EnvironmentProviderView(lVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
