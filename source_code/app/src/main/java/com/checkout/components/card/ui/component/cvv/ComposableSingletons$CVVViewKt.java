package com.checkout.components.card.ui.component.cvv;

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
import ud.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CVVViewKt {

    @NotNull
    public static final ComposableSingletons$CVVViewKt INSTANCE = new ComposableSingletons$CVVViewKt();

    /* renamed from: a */
    private static final b f4493a = new d(new f(5), -1754571327, false);

    public static /* synthetic */ Unit alpha(InterfaceC0581m interfaceC0581m, int i4) {
        return lambda__1754571327$lambda$0(interfaceC0581m, i4);
    }

    public static final Unit lambda__1754571327$lambda$0(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            CVVViewKt.CVVComponent(new Injector() { // from class: com.checkout.components.card.ui.component.cvv.ComposableSingletons$CVVViewKt$lambda$-1754571327$1$1
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
    /* renamed from: getLambda$-1754571327$card_standardRelease */
    public final l m81getLambda$1754571327$card_standardRelease() {
        return f4493a;
    }
}
