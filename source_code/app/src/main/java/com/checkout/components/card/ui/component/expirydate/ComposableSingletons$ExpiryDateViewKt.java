package com.checkout.components.card.ui.component.expirydate;

import P.b;
import P.d;
import Xd.l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ExpiryDateViewKt {

    @NotNull
    public static final ComposableSingletons$ExpiryDateViewKt INSTANCE = new ComposableSingletons$ExpiryDateViewKt();

    /* renamed from: a */
    private static final b f4505a = new d(new S4.b(27), -1266434309, false);

    public static /* synthetic */ Unit alpha(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__1266434309$lambda$0(interfaceC0581m, i4);
    }

    public static final Unit lambda__1266434309$lambda$0(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            ExpiryDateViewKt.ExpiryDateComponent(new Injector() { // from class: com.checkout.components.card.ui.component.expirydate.ComposableSingletons$ExpiryDateViewKt$lambda$-1266434309$1$1
                @Override // com.checkout.components.card.di.base.Injector
                public final void inject(InjectionClient client) {
                    Intrinsics.echo(client, "client");
                }
            }, "", c0585q, 48);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-1266434309$card_standardRelease */
    public final l m82getLambda$1266434309$card_standardRelease() {
        return f4505a;
    }
}
