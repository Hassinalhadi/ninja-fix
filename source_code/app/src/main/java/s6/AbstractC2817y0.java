package s6;

import T.p;
import T.s;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import de.AbstractC1618a;
import de.AbstractC1621d;
import delivery.samurai.android.R;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.ab;
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
import s6.AbstractC2790v0;
import s6.AbstractC2817y0;
import t6.AbstractC3071v3;

/* renamed from: s6.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2817y0 {
    public static final void alpha(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final Function0 onAccept, final Function0 onReject, final boolean z2, InterfaceC0581m interfaceC0581m, final int i4) {
        Intrinsics.echo(onAccept, "onAccept");
        Intrinsics.echo(onReject, "onReject");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-106135779);
        int i5 = i4 | (c0585q.golf(str) ? 4 : 2) | (c0585q.golf(str2) ? 32 : 16) | (c0585q.golf(str3) ? Barcode.FORMAT_QR_CODE : 128) | (c0585q.golf(str4) ? 2048 : Barcode.FORMAT_UPC_E) | (c0585q.golf(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (c0585q.golf(str6) ? 131072 : 65536) | (c0585q.golf(str7) ? 1048576 : 524288) | (c0585q.golf(str8) ? 8388608 : 4194304) | (c0585q.india(onAccept) ? 67108864 : 33554432) | (c0585q.india(onReject) ? 536870912 : 268435456);
        if (c0585q.magenta(i5 & 1, ((306783379 & i5) == 306783378 && ((c0585q.hotel(z2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final long alpha = AbstractC3071v3.alpha(c0585q, R.color.colorGreen);
            float f5 = 24;
            t6.N3.alpha(t6.R3.charlie(androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f), 3, AbstractC3071v3.alpha(c0585q, R.color.design_default_color_secondary), AbstractC2094g.bravo(f5)), AbstractC2094g.bravo(f5), 0, P.e.echo(-252626150, new Xd.l() { // from class: Bb.i
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    boolean z10;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.magenta(intValue & 1, z10)) {
                        p pVar = p.alpha;
                        s sierra = AbstractC0538d.sierra(pVar, 16);
                        C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q2, 48);
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
                        C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                        C0564b.blue(C2551k.echo, c0585q2, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                            ad.blue(romeo, c0585q2, romeo, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q2, charlie);
                        AbstractC2790v0.alpha(null, str, str2, Integer.valueOf(R.drawable.ic_reposition_arrows), c0585q2, 6, 0);
                        AbstractC0538d.echo(V.echo(pVar, 20), c0585q2);
                        Ld.c hotel = ab.hotel();
                        String str9 = str4;
                        if (str9 != null) {
                            hotel.add(new f(str9, str3, new C0366t(alpha)));
                        }
                        hotel.add(new f(str6, str5, null));
                        AbstractC2763s0.alpha(ab.alpha(hotel), c0585q2, 0);
                        if (z2) {
                            c0585q2.purple(1441222399);
                            AbstractC0538d.echo(V.echo(pVar, 24), c0585q2);
                            AbstractC2754r0.alpha(str7, str8, onAccept, onReject, c0585q2, 0);
                        } else {
                            c0585q2.purple(1439026142);
                        }
                        c0585q2.quebec(false);
                        c0585q2.quebec(true);
                    } else {
                        c0585q2.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q), c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(str, str2, str3, str4, str5, str6, str7, str8, onAccept, onReject, z2, i4) { // from class: Bb.j

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f765a;
                public final /* synthetic */ String alpha;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function0 f766b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f767c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f768d;
                public final /* synthetic */ String purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ String silver;
                public final /* synthetic */ String teal;
                public final /* synthetic */ String white;
                public final /* synthetic */ String yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    String str9 = this.alpha;
                    String str10 = this.purple;
                    String str11 = this.red;
                    String str12 = this.teal;
                    String str13 = this.white;
                    String str14 = this.yellow;
                    String str15 = this.f765a;
                    Function0 function0 = this.f767c;
                    boolean z10 = this.f768d;
                    AbstractC2817y0.alpha(str9, str10, str11, this.silver, str12, str13, str14, str15, this.f766b, function0, z10, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final int bravo() {
        AbstractC1618a abstractC1618a = AbstractC1621d.alpha;
        if (Integer.compare(-2147483521, RecyclerView.UNDEFINED_DURATION) > 0) {
            return UInt.m210constructorimpl(AbstractC1621d.alpha.charlie(RecyclerView.UNDEFINED_DURATION, -2147483521) ^ RecyclerView.UNDEFINED_DURATION);
        }
        throw new IllegalArgumentException(AbstractC2808x0.bravo(new UInt(0), new UInt(127)).toString());
    }
}
