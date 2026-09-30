package com.checkout.components.card.ui.component.cardnumber;

import A0.ab;
import A0.o;
import Ec.af;
import F.AbstractC0122j1;
import F.C0103e2;
import F.K1;
import P.e;
import T.d;
import T.p;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import bz.h0;
import com.checkout.components.card.model.InfoBottomSheetViewStyleState;
import com.checkout.components.card.utils.constants.TestTags;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "LF/e2;", "sheetState", "Lcom/checkout/components/card/model/InfoBottomSheetViewStyleState;", "viewStyleState", "LT/s;", "modifier", "InfoBottomSheetView", "(Lkotlin/jvm/functions/Function0;LF/e2;Lcom/checkout/components/card/model/InfoBottomSheetViewStyleState;LT/s;Landroidx/compose/runtime/m;II)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoBottomSheetViewKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBottomSheetView(@NotNull Function0<Unit> onDismissRequest, @NotNull C0103e2 sheetState, @NotNull InfoBottomSheetViewStyleState viewStyleState, @Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        C0585q c0585q;
        s sVar3;
        Q uniform;
        s sVar4;
        boolean india;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(sheetState, "sheetState");
        Intrinsics.echo(viewStyleState, "viewStyleState");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-127485433);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(onDismissRequest)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sheetState)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i4 & 384) == 0) {
            if ((i4 & 512) == 0) {
                india = c0585q2.golf(viewStyleState);
            } else {
                india = c0585q2.india(viewStyleState);
            }
            if (india) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        int i15 = i5 & 8;
        if (i15 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            if ((i10 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i10 & 1, z2)) {
                if (i15 != 0) {
                    sVar4 = p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                float f5 = 24;
                C2093f delta = AbstractC2094g.delta(f5, f5);
                long m75getContainerColor0d7_KjU = viewStyleState.m75getContainerColor0d7_KjU();
                Object jade = c0585q2.jade();
                if (jade == C0580l.alpha) {
                    jade = new h0(12);
                    c0585q2.f(jade);
                }
                c0585q = c0585q2;
                AbstractC0122j1.alpha(onDismissRequest, androidx.compose.ui.platform.a.alpha(o.bravo(sVar4, false, (Function1) jade), TestTags.INFO_BOTTOM_SHEET), sheetState, 0.0f, delta, m75getContainerColor0d7_KjU, 0L, 0.0f, 0L, null, null, null, e.echo(-1575712284, new af(7, onDismissRequest, viewStyleState), c0585q2), c0585q, (i10 & 14) | ((i10 << 3) & 896), 4040);
                sVar3 = sVar4;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Bb.e(onDismissRequest, sheetState, viewStyleState, sVar3, i4, i5, 4);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i10 & 1171) == 1170) {
        }
        if (!c0585q2.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit InfoBottomSheetView$lambda$6(Function0 function0, InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, InterfaceC0555v ModalBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            p pVar = p.alpha;
            s romeo = V.romeo(AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 16, 0.0f, 2));
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(romeo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            s then = AbstractC0538d.whiskey(pVar, 0.0f, 0.0f, 0.0f, 8, 7).then(new HorizontalAlignElement(d.f2064h));
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new h0(13);
                c0585q.f(jade);
            }
            K1.foxtrot(function0, androidx.compose.ui.platform.a.alpha(o.bravo(then, false, (Function1) jade), TestTags.BOTTOM_SHEET_CLOSE_BUTTON), false, null, e.echo(-2003751759, new bz.af(2, infoBottomSheetViewStyleState), c0585q), c0585q, 196608, 28);
            TextLabelViewStyle titleStyle = infoBottomSheetViewStyleState.getTitleStyle();
            TextLabelState titleState = infoBottomSheetViewStyleState.getTitleState();
            int i10 = TextLabelViewStyle.$stable | (TextLabelState.$stable << 3);
            TextLabelViewKt.TextLabelView(titleStyle, titleState, c0585q, i10);
            AbstractC0538d.echo(V.echo(pVar, 10), c0585q);
            TextLabelViewKt.TextLabelView(infoBottomSheetViewStyleState.getDescriptionStyle(), infoBottomSheetViewStyleState.getDescriptionState(), c0585q, i10);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoBottomSheetView$lambda$6$lambda$5$lambda$4(InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            StyledImageViewKt.StyledImageView(infoBottomSheetViewStyleState.getCloseIconImageStyle(), null, c0585q, ImageStyle.$stable, 2);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Function0 function0, C0103e2 c0103e2, InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InfoBottomSheetView(function0, c0103e2, infoBottomSheetViewStyleState, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit b(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }
}
