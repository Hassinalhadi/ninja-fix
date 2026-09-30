package com.checkout.components.rememberme;

import D0.an;
import F.AbstractC0148q;
import F.AbstractC0152r0;
import F.C0156s0;
import a5.C0405a;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class I {
    public static final Unit a(TextLabelViewItem textLabelViewItem, boolean z2, Function0 function0, Function0 function02, T.s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(textLabelViewItem, z2, function0, function02, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(TextLabelViewItem textViewItem, boolean z2, Function0 onDismiss, Function0 onClick, T.s sVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        T.s sVar3;
        androidx.compose.runtime.Q uniform;
        Intrinsics.echo(textViewItem, "textViewItem");
        Intrinsics.echo(onDismiss, "onDismiss");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2126146017);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q.golf(textViewItem) : c0585q.india(textViewItem) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q.hotel(z2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q.india(onDismiss) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q.india(onClick) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        int i11 = i5 & 16;
        if (i11 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            sVar2 = sVar;
            i10 |= c0585q.golf(sVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            if (!c0585q.magenta(i10 & 1, (i10 & 9363) == 9362)) {
                T.s sVar4 = i11 != 0 ? T.p.alpha : sVar2;
                AbstractC0148q.alpha(z2, onDismiss, null, 0L, null, null, null, Utils.INSTANCE.m191toComposeColorvNxB06k(4294967295L), 0.0f, 0.0f, P.e.echo(-1227616058, new Vc.o(textViewItem, onClick, sVar4, 1), c0585q), c0585q, (i10 >> 3) & 126, 1916);
                sVar3 = sVar4;
            } else {
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0405a(textViewItem, z2, onDismiss, onClick, sVar3, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if (!c0585q.magenta(i10 & 1, (i10 & 9363) == 9362)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            TextLabelViewKt.TextLabelView(textLabelViewItem.getStyle(), textLabelViewItem.getState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, Function0 function0, T.s sVar, InterfaceC0555v DropdownMenu, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(DropdownMenu, "$this$DropdownMenu");
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 17) != 16)) {
            C0156s0 alpha = AbstractC0152r0.alpha(c0585q);
            an style = textLabelViewItem.getStyle().getStyle();
            long bravo = style != null ? style.bravo() : Utils.INSTANCE.m191toComposeColorvNxB06k(4278190080L);
            if (bravo == 16) {
                bravo = alpha.alpha;
            }
            C0156s0 c0156s0 = new C0156s0(bravo, alpha.bravo, alpha.charlie, alpha.delta, alpha.echo, alpha.foxtrot);
            float f5 = 16;
            AbstractC0148q.bravo(P.e.echo(1764856566, new Ac.k(22, textLabelViewItem), c0585q), function0, sVar, false, c0156s0, new androidx.compose.foundation.layout.M(f5, f5, f5, f5), c0585q, 12582918, 312);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
