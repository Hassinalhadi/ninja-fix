package com.checkout.components.kmp.rememberme.view.common;

import Ec.ar;
import T.p;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.R3;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "ContainerDivider", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContainerDividerViewKt {
    public static final void ContainerDivider(@NotNull DesignTokens designTokens, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        Intrinsics.echo(designTokens, "designTokens");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-492957453);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(designTokens)) {
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
            float f5 = 1;
            AbstractC0538d.echo(R3.charlie(V.charlie(V.echo(p.alpha, f5), 1.0f), f5, ExtensionsKt.borderColor(designTokens), ao.alpha), c0585q);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(designTokens, i4, 2);
        }
    }

    public static final Unit ContainerDivider$lambda$0(DesignTokens designTokens, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ContainerDivider(designTokens, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
