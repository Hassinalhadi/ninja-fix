package com.checkout.components.rememberme;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class J1 {
    public static final Unit a(T.s sVar, String str, Xd.l lVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(sVar, str, lVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void a(T.s sVar, String str, Xd.l content, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str2;
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-449523463);
        int i11 = i5 & 1;
        if (i11 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i10 = (c0585q.golf(sVar) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        int i12 = i5 & 2;
        if (i12 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            i10 |= c0585q.golf(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q.india(content) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if (c0585q.magenta(i10 & 1, (i10 & 147) != 146)) {
            if (i11 != 0) {
                sVar = T.p.alpha;
            }
            String str3 = i12 != 0 ? null : str;
            T.s optionalTestTag = ModifierExtensionsKt.optionalTestTag(AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 24), str3);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(optionalTestTag, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                AbstractC0990w.a(i13, c0585q, i13, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            content.invoke(c0585q, Integer.valueOf((i10 >> 6) & 14));
            c0585q.quebec(true);
            str2 = str3;
        } else {
            c0585q.ochre();
            str2 = str;
        }
        T.s sVar2 = sVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.F(sVar2, str2, content, i4, i5, 1);
        }
    }
}
