package com.checkout.components.kmp.rememberme.view.ui;

import F.AbstractC0127k2;
import P.d;
import S4.b;
import Xd.l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SecuredTextViewKt {

    @NotNull
    public static final ComposableSingletons$SecuredTextViewKt INSTANCE = new ComposableSingletons$SecuredTextViewKt();

    /* renamed from: lambda$-559040040 */
    @NotNull
    private static l f3lambda$559040040 = new d(new b(12), -559040040, false);

    @NotNull
    private static l lambda$2046887827 = new d(new b(13), 2046887827, false);

    public static /* synthetic */ Unit alpha(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda_2046887827$lambda$1(interfaceC0581m, i4);
    }

    public static /* synthetic */ Unit bravo(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__559040040$lambda$0(interfaceC0581m, i4);
    }

    public static final Unit lambda_2046887827$lambda$1(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(null, null, 0L, 0L, 0.0f, 0.0f, null, f3lambda$559040040, c0585q, 12582912, 127);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__559040040$lambda$0(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            SecuredTextViewKt.SecuredTextView(DesignTokens.INSTANCE.getDEFAULT(), null, c0585q, 6, 2);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-559040040$rememberme_release */
    public final l m123getLambda$559040040$rememberme_release() {
        return f3lambda$559040040;
    }

    @NotNull
    public final l getLambda$2046887827$rememberme_release() {
        return lambda$2046887827;
    }
}
