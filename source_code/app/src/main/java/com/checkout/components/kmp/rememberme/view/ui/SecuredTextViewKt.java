package com.checkout.components.kmp.rememberme.view.ui;

import F.AbstractC0149q0;
import F4.g;
import Lb.af;
import T.p;
import T.s;
import Wf.m;
import a0.C0360n;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.generated.resources.Drawable0_commonMainKt;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.W3;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "LT/s;", "modifier", "", "SecuredTextView", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;LT/s;Landroidx/compose/runtime/m;II)V", "SecuredTextViewPreview", "(Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecuredTextViewKt {
    public static final void SecuredTextView(@NotNull DesignTokens designTokens, @Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        s sVar3;
        int i12;
        Intrinsics.echo(designTokens, "designTokens");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1322163298);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(designTokens)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i4;
        } else {
            i10 = i4;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                sVar3 = p.alpha;
            } else {
                sVar3 = sVar;
            }
            W3.alpha(m.alpha(Drawable0_commonMainKt.getCko_secured_text(Res.drawable.INSTANCE), c0585q, 0), "Secured by Checkout.com", sVar3, null, null, 0.0f, new C0360n(ExtensionsKt.secondaryColor(designTokens), 5), c0585q, ((i10 << 3) & 896) | 48, 56);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(designTokens, sVar2, i4, i5, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecuredTextView$lambda$0(DesignTokens designTokens, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        SecuredTextView(designTokens, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void SecuredTextViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1203392577);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$SecuredTextViewKt.INSTANCE.getLambda$2046887827$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecuredTextViewPreview$lambda$1(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        SecuredTextViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
