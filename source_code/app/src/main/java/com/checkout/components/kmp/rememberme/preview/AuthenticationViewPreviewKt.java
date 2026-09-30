package com.checkout.components.kmp.rememberme.preview;

import F.AbstractC0149q0;
import F4.g;
import Q0.c;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import eg.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.u;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "AuthenticationViewPreview", "(Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationViewPreviewKt {
    private static final void AuthenticationViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-814628712);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(1 & i4, z2)) {
            KoinInitializer koinInitializer = KoinInitializer.INSTANCE;
            if (!koinInitializer.isInitialized()) {
                koinInitializer.initialize(PreviewConstants.INSTANCE.getCONFIG());
            }
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
                a koin$rememberme_release = koinInitializer.getKoin$rememberme_release();
                if (koin$rememberme_release != null) {
                    try {
                        jade = (AuthInfoRepository) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(AuthInfoRepository.class), null);
                        c0585q.f(jade);
                    } catch (Exception e) {
                        throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(AuthInfoRepository.class).kilo(), ": ", e.getMessage()));
                    }
                } else {
                    throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
                }
            }
            AuthInfoRepository authInfoRepository = (AuthInfoRepository) jade;
            authInfoRepository.updateEmail(PreviewConstants.EMAIL);
            authInfoRepository.updateHints(PreviewConstants.INSTANCE.getHINTS());
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$AuthenticationViewPreviewKt.INSTANCE.getLambda$1623638340$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 5);
        }
    }

    public static final Unit AuthenticationViewPreview$lambda$1(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AuthenticationViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
