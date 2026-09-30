package com.checkout.components.ui.view;

import F.G2;
import P.d;
import Xd.l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import g4.C1752a;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$InputContainerViewKt {

    @NotNull
    public static final ComposableSingletons$InputContainerViewKt INSTANCE = new ComposableSingletons$InputContainerViewKt();

    /* renamed from: lambda$-345239535 */
    @NotNull
    private static l f4lambda$345239535 = new d(new C1752a(15), -345239535, false);

    @NotNull
    private static l lambda$1584991314 = new d(new C1752a(16), 1584991314, false);

    public static final Unit lambda_1584991314$lambda$1(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            G2.bravo("Placeholder", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 6, 0, 131070);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__345239535$lambda$0(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            G2.bravo("Label", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 6, 0, 131070);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-345239535$ui_standardRelease */
    public final l m193getLambda$345239535$ui_standardRelease() {
        return f4lambda$345239535;
    }

    @NotNull
    public final l getLambda$1584991314$ui_standardRelease() {
        return lambda$1584991314;
    }
}
