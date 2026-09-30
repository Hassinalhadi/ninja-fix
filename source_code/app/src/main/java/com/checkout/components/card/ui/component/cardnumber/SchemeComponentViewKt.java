package com.checkout.components.card.ui.component.cardnumber;

import Cb.d;
import Lb.af;
import P.e;
import T.p;
import T.s;
import androidx.compose.foundation.layout.aj;
import androidx.compose.foundation.layout.as;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "cardSchemeIcons", "LT/s;", "modifier", "", "SchemeComponentView", "(Ljava/util/List;LT/s;Landroidx/compose/runtime/m;II)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemeComponentViewKt {
    public static final void SchemeComponentView(@NotNull List<ImageStyle> cardSchemeIcons, @Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        int i12;
        Intrinsics.echo(cardSchemeIcons, "cardSchemeIcons");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(604862030);
        if ((i4 & 6) == 0) {
            if (c0585q.india(cardSchemeIcons)) {
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
                sVar = p.alpha;
            }
            s sVar3 = sVar;
            aj.alpha(sVar3, null, null, null, 0, 0, e.echo(1825121395, new d(13, cardSchemeIcons), c0585q), c0585q, ((i10 >> 3) & 14) | 1572864, 62);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(cardSchemeIcons, sVar2, i4, i5, 4);
        }
    }

    public static final Unit SchemeComponentView$lambda$1(List list, as FlowRow, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(FlowRow, "$this$FlowRow");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StyledImageViewKt.StyledImageView((ImageStyle) it.next(), null, c0585q, ImageStyle.$stable, 2);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(List list, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        SchemeComponentView(list, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit bravo(List list, as asVar, InterfaceC0581m interfaceC0581m, int i4) {
        return SchemeComponentView$lambda$1(list, asVar, interfaceC0581m, i4);
    }
}
