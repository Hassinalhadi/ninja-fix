package com.checkout.components.ui.view;

import T.p;
import T.s;
import a0.C0360n;
import a0.InterfaceC0342ab;
import a0.ap;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.ui.graphics.a;
import bz.AbstractC0779d;
import bz.ag;
import bz.aj;
import bz.al;
import com.clevertap.android.sdk.Constants;
import d.C1534h0;
import f0.AbstractC1680b;
import hd.l;
import k5.C2012e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3076w3;
import t6.W3;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a!\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"", "iconId", "La0/t;", Constants.KEY_COLOR, "", "RotateIconView-RPmYEkk", "(IJLandroidx/compose/runtime/m;I)V", "RotateIconView", "", "angle", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RotateIconViewKt {
    /* renamed from: RotateIconView-RPmYEkk */
    public static final void m195RotateIconViewRPmYEkk(int i4, long j5, @Nullable InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(608460002);
        if ((i5 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i5 | i12;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.foxtrot(j5)) {
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
            aj india = AbstractC0779d.india("", c0585q, 0);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new l(28);
                c0585q.f(jade);
            }
            ag charlie = AbstractC0779d.charlie(india, 360.0f, AbstractC0779d.golf(AbstractC0779d.hotel((Function1) jade), 6), "", c0585q, 29112, 0);
            AbstractC1680b charlie2 = AbstractC3076w3.charlie(i4, c0585q, i10 & 14);
            s whiskey = AbstractC0538d.whiskey(p.alpha, 8, 0.0f, 0.0f, 0.0f, 14);
            boolean golf = c0585q.golf(charlie);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == asVar) {
                jade2 = new C1534h0(19, charlie);
                c0585q.f(jade2);
            }
            W3.alpha(charlie2, "", a.alpha(whiskey, (Function1) jade2), null, null, 0.0f, new C0360n(j5, 5), c0585q, 48, 56);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2012e(i4, i5, 0, j5);
        }
    }

    public static final Unit RotateIconView_RPmYEkk$lambda$1$lambda$0(al keyframes) {
        Intrinsics.echo(keyframes, "$this$keyframes");
        keyframes.alpha = 1000;
        return Unit.INSTANCE;
    }

    private static final float RotateIconView_RPmYEkk$lambda$2(D0 d02) {
        return ((Number) d02.getValue()).floatValue();
    }

    public static final Unit RotateIconView_RPmYEkk$lambda$4$lambda$3(D0 d02, InterfaceC0342ab graphicsLayer) {
        Intrinsics.echo(graphicsLayer, "$this$graphicsLayer");
        ((ap) graphicsLayer).golf(RotateIconView_RPmYEkk$lambda$2(d02));
        return Unit.INSTANCE;
    }

    public static final Unit RotateIconView_RPmYEkk$lambda$5(int i4, long j5, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m195RotateIconViewRPmYEkk(i4, j5, interfaceC0581m, C0564b.cyan(i5 | 1));
        return Unit.INSTANCE;
    }
}
