package s6;

import T.p;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2754r0;
import s6.AbstractC2763s0;
import s6.AbstractC2781u0;
import s6.AbstractC2790v0;
import s6.AbstractC2808x0;
import t6.AbstractC3071v3;

/* renamed from: s6.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2808x0 {
    public static final void alpha(final String str, final String str2, final String str3, final Ld.c infoCards, final String str4, final String str5, final String str6, final String str7, final Function0 onAccept, final Function0 onReject, boolean z2, InterfaceC0581m interfaceC0581m, final int i4) {
        final String str8;
        final String str9;
        final String str10;
        final String str11;
        boolean z10;
        Intrinsics.echo(infoCards, "infoCards");
        Intrinsics.echo(onAccept, "onAccept");
        Intrinsics.echo(onReject, "onReject");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-991655278);
        int i5 = (c0585q.golf(str) ? 4 : 2) | i4 | (c0585q.golf(str2) ? 32 : 16) | (c0585q.golf(str3) ? Barcode.FORMAT_QR_CODE : 128) | (c0585q.india(infoCards) ? 2048 : Barcode.FORMAT_UPC_E);
        if ((i4 & 24576) == 0) {
            str8 = str4;
            i5 |= c0585q.golf(str8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            str8 = str4;
        }
        if ((196608 & i4) == 0) {
            str9 = str5;
            i5 |= c0585q.golf(str9) ? 131072 : 65536;
        } else {
            str9 = str5;
        }
        if ((1572864 & i4) == 0) {
            str10 = str6;
            i5 |= c0585q.golf(str10) ? 1048576 : 524288;
        } else {
            str10 = str6;
        }
        if ((12582912 & i4) == 0) {
            str11 = str7;
            i5 |= c0585q.golf(str11) ? 8388608 : 4194304;
        } else {
            str11 = str7;
        }
        if ((100663296 & i4) == 0) {
            i5 |= c0585q.india(onAccept) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i5 |= c0585q.india(onReject) ? 536870912 : 268435456;
        }
        if (c0585q.magenta(i5 & 1, (306783379 & i5) != 306783378)) {
            float f5 = 24;
            t6.N3.alpha(t6.R3.charlie(androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f), 3, AbstractC3071v3.alpha(c0585q, R.color.design_default_color_secondary), AbstractC2094g.bravo(f5)), AbstractC2094g.bravo(f5), 0, P.e.echo(-1724767793, new Xd.l() { // from class: Bb.g
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    int collectionSizeOrDefault;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.magenta(intValue & 1, z11)) {
                        p pVar = p.alpha;
                        float f10 = 16;
                        s sierra = AbstractC0538d.sierra(pVar, f10);
                        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q2, 48);
                        int romeo = C0564b.romeo(c0585q2);
                        I mike = c0585q2.mike();
                        s charlie = T.a.charlie(sierra, c0585q2);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(c2550j);
                        } else {
                            c0585q2.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
                        C0564b.blue(C2551k.echo, c0585q2, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                            ad.blue(romeo, c0585q2, romeo, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q2, charlie);
                        AbstractC2790v0.alpha(str, str2, str3, null, c0585q2, 0, 8);
                        AbstractC0538d.echo(V.echo(pVar, 20), c0585q2);
                        Ld.c cVar = infoCards;
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cVar, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                        ListIterator listIterator = cVar.listIterator(0);
                        while (true) {
                            Ld.a aVar = (Ld.a) listIterator;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) aVar.next();
                            arrayList.add(new f((String) pair.first, (String) pair.second, null));
                        }
                        AbstractC2763s0.alpha(arrayList, c0585q2, 0);
                        AbstractC0538d.echo(V.echo(pVar, f10), c0585q2);
                        AbstractC2781u0.alpha(str8, str9, c0585q2, 0);
                        c0585q2.purple(-751920886);
                        AbstractC0538d.echo(V.echo(pVar, 24), c0585q2);
                        AbstractC2754r0.alpha(str10, str11, onAccept, onReject, c0585q2, 0);
                        c0585q2.quebec(false);
                        c0585q2.quebec(true);
                    } else {
                        c0585q2.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q), c0585q);
            z10 = true;
        } else {
            c0585q.ochre();
            z10 = z2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final boolean z11 = z10;
            uniform.delta = new Xd.l() { // from class: Bb.h
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str12 = str2;
                    String str13 = str3;
                    String str14 = str4;
                    String str15 = str6;
                    String str16 = str7;
                    Function0 function0 = onReject;
                    boolean z12 = z11;
                    AbstractC2808x0.alpha(str, str12, str13, infoCards, str14, str5, str15, str16, onAccept, function0, z12, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final String bravo(Comparable comparable, Comparable comparable2) {
        return "Random range is empty: [" + comparable + ", " + comparable2 + ").";
    }
}
