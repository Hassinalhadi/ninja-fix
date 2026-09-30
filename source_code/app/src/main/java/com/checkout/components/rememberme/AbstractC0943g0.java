package com.checkout.components.rememberme;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: com.checkout.components.rememberme.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0943g0 {
    public static final Unit a(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, Function0 function0, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(textLabelViewItem, textLabelViewItem2, textLabelViewItem3, function0, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(TextLabelViewItem labelItem, TextLabelViewItem textItem, TextLabelViewItem editItem, Function0 onEditClick, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str2;
        androidx.compose.runtime.Q uniform;
        Intrinsics.echo(labelItem, "labelItem");
        Intrinsics.echo(textItem, "textItem");
        Intrinsics.echo(editItem, "editItem");
        Intrinsics.echo(onEditClick, "onEditClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2001762483);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q.golf(labelItem) : c0585q.india(labelItem) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q.golf(textItem) : c0585q.india(textItem) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= (i4 & 512) == 0 ? c0585q.golf(editItem) : c0585q.india(editItem) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q.india(onEditClick) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        int i11 = i5 & 16;
        if (i11 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            str2 = str;
            i10 |= c0585q.golf(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            if (!c0585q.magenta(i10 & 1, (i10 & 9363) == 9362)) {
                if (i11 != 0) {
                    str2 = null;
                }
                float f5 = 16;
                T.s charlie = androidx.compose.foundation.layout.V.charlie(AbstractC0538d.whiskey(T.p.alpha, f5, f5, f5, 0.0f, 8), 1.0f);
                androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.hotel, T.d.f2061d, c0585q, 54);
                long j5 = c0585q.magenta;
                int i12 = (int) (j5 ^ (j5 >>> 32));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie2 = T.a.charlie(charlie, c0585q);
                C2551k c2551k = InterfaceC2552l.maroon;
                c2551k.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                    AbstractC0990w.a(i12, c0585q, i12, a6);
                }
                C2549i c2549i = C2551k.delta;
                C0564b.blue(c2549i, c0585q, charlie2);
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(8), T.d.f2062f, c0585q, 6);
                long j6 = c0585q.magenta;
                int i13 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie3 = T.a.charlie(layoutWeightElement, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                Xd.l a8 = AbstractC0987v.a(c2551k, c0585q, alpha2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                    AbstractC0990w.a(i13, c0585q, i13, a8);
                }
                C0564b.blue(c2549i, c0585q, charlie3);
                TextLabelState state = labelItem.getState();
                TextLabelViewStyle style = labelItem.getStyle();
                int i14 = TextLabelViewStyle.$stable | (TextLabelState.$stable << 3);
                TextLabelViewKt.TextLabelView(style, state, c0585q, i14);
                TextLabelViewKt.TextLabelView(textItem.getStyle(), textItem.getState(), c0585q, i14);
                c0585q.quebec(true);
                TextLabelState state2 = editItem.getState();
                TextLabelViewStyle style2 = editItem.getStyle();
                T.s modifier = editItem.getStyle().getModifier();
                boolean z2 = (i10 & 7168) == 2048;
                Object jade = c0585q.jade();
                if (z2 || jade == C0580l.alpha) {
                    jade = new Bb.a(onEditClick, 25);
                    c0585q.f(jade);
                }
                TextLabelViewKt.TextLabelView(TextLabelViewStyle.m180copyQstMH_w$default(style2, ModifierExtensionsKt.optionalTestTag(androidx.compose.foundation.a.echo(15, modifier, null, (Function0) jade, false), str2), 0, false, 0, null, null, false, 126, null), state2, c0585q, i14);
                c0585q.quebec(true);
            } else {
                c0585q.ochre();
            }
            String str3 = str2;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new W4.a(labelItem, textItem, editItem, onEditClick, str3, i4, i5, 1);
                return;
            }
            return;
        }
        str2 = str;
        if (!c0585q.magenta(i10 & 1, (i10 & 9363) == 9362)) {
        }
        String str32 = str2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
