package com.checkout.components.kmp.rememberme.view.ui;

import F.AbstractC0127k2;
import P.d;
import S4.b;
import Vc.i;
import Xd.l;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$InfoTextViewKt {

    @NotNull
    public static final ComposableSingletons$InfoTextViewKt INSTANCE = new ComposableSingletons$InfoTextViewKt();

    /* renamed from: lambda$-735642676 */
    @NotNull
    private static l f2lambda$735642676 = new d(new b(10), -735642676, false);

    /* renamed from: lambda$-1937116729 */
    @NotNull
    private static l f1lambda$1937116729 = new d(new b(11), -1937116729, false);

    public static /* synthetic */ Unit alpha(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__735642676$lambda$2(interfaceC0581m, i4);
    }

    public static /* synthetic */ Unit charlie(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__1937116729$lambda$3(interfaceC0581m, i4);
    }

    public static final Unit lambda__1937116729$lambda$3(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(null, null, 0L, 0L, 0.0f, 0.0f, null, f2lambda$735642676, c0585q, 12582912, 127);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__735642676$lambda$2(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            DesignTokens designTokens = DesignTokens.INSTANCE.getDEFAULT();
            ResourceProvider resourceProvider = ResourceProvider.INSTANCE.getDEFAULT();
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new i(13);
                c0585q.f(jade);
            }
            InfoTextViewKt.InfoTextView(resourceProvider, designTokens, null, (Function0) jade, c0585q, 3120, 4);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-1937116729$rememberme_release */
    public final l m121getLambda$1937116729$rememberme_release() {
        return f1lambda$1937116729;
    }

    @NotNull
    /* renamed from: getLambda$-735642676$rememberme_release */
    public final l m122getLambda$735642676$rememberme_release() {
        return f2lambda$735642676;
    }
}
