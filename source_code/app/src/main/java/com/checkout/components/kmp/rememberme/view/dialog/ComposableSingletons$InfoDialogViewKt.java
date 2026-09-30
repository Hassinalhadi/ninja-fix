package com.checkout.components.kmp.rememberme.view.dialog;

import P.d;
import Xd.m;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.generated.resources.Drawable0_commonMainKt;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import i.InterfaceC1854c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.W3;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$InfoDialogViewKt {

    @NotNull
    public static final ComposableSingletons$InfoDialogViewKt INSTANCE = new ComposableSingletons$InfoDialogViewKt();

    @NotNull
    private static m lambda$1676766272 = new d(new Vc.d(1), 1676766272, false);

    public static /* synthetic */ Unit alpha(InterfaceC1854c interfaceC1854c, InterfaceC0581m interfaceC0581m, int i4) {
        return lambda_1676766272$lambda$0(interfaceC1854c, interfaceC0581m, i4);
    }

    public static final Unit lambda_1676766272$lambda$0(InterfaceC1854c item, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(item, "$this$item");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            W3.alpha(Wf.m.alpha(Drawable0_commonMainKt.getCko_logo(Res.drawable.INSTANCE), c0585q, 0), null, null, null, null, 0.0f, null, c0585q, 48, 124);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final m getLambda$1676766272$rememberme_release() {
        return lambda$1676766272;
    }
}
