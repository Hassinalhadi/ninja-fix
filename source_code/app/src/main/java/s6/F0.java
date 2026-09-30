package s6;

import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F0;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class F0 {
    public static final void alpha(final T.s sVar, final float f5, final String str, final String str2, final String str3, String str4, String str5, String str6, String str7, final String str8, String str9, final String str10, final int i4, final Function0 onViewAssetsClick, final String str11, final Function0 function0, String str12, final boolean z2, InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        final String str13;
        final String str14;
        final String str15;
        final String str16;
        final String str17;
        final String str18;
        String bravo;
        String str19;
        String str20;
        String str21;
        int i11;
        String str22;
        int i12;
        String str23;
        boolean z10;
        boolean z11;
        int i13;
        String str24;
        Intrinsics.echo(onViewAssetsClick, "onViewAssetsClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1554382893);
        int i14 = i5 | (c0585q.golf(str) ? Barcode.FORMAT_QR_CODE : 128) | (c0585q.golf(str2) ? 2048 : 1024) | (c0585q.golf(str3) ? 16384 : 8192) | 4784128;
        int i15 = (i10 & 6) == 0 ? i10 | 2 : i10;
        if ((i10 & 48) == 0) {
            i15 |= c0585q.golf(str10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i15 |= c0585q.echo(i4) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i10 & 3072) == 0) {
            i15 |= c0585q.india(onViewAssetsClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i15 |= c0585q.golf(str11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i15 |= c0585q.india(function0) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i15 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i15 |= c0585q.hotel(z2) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (c0585q.magenta(i14 & 1, ((i14 & 4793491) == 4793490 && (i16 & 4793491) == 4793490) ? false : true)) {
            c0585q.orange();
            if ((i5 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                str19 = str4;
                str20 = str5;
                str21 = str6;
                str22 = str7;
                bravo = str12;
                i11 = i16 & (-3670031);
                i12 = i14 & (-268369921);
                str23 = str9;
            } else {
                String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.estimated_earnings);
                String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.estimated_distance);
                String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.distance_unit_km);
                String bravo5 = AbstractC3086y3.bravo(c0585q, R.string.payment);
                String bravo6 = AbstractC3086y3.bravo(c0585q, R.string.order_status);
                bravo = AbstractC3086y3.bravo(c0585q, R.string.chat_with_customer);
                str19 = bravo2;
                str20 = bravo3;
                str21 = bravo4;
                i11 = i16 & (-3670031);
                str22 = bravo5;
                i12 = i14 & (-268369921);
                str23 = bravo6;
            }
            c0585q.romeo();
            String str25 = str22;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            String str26 = str23;
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            T.p pVar = T.p.alpha;
            int i17 = i12 >> 3;
            E4.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), str, str2, str3, str19, str20, str21, null, null, 0L, null, 0.0f, 0L, c0585q, (i17 & 112) | 6 | (i17 & 896) | (i17 & 7168));
            String str27 = str19;
            String str28 = str20;
            String str29 = str21;
            F4.alpha(com.google.android.material.datepicker.j.hotel(pVar, f5, c0585q, pVar, 1.0f), str26, str10, null, null, 0L, 0.0f, 0.0f, 0L, c0585q, 6 | ((i11 << 3) & 896));
            if (i4 > 0) {
                c0585q.purple(1281054324);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f5), c0585q);
                int i18 = i11 >> 6;
                D0.alpha(i4, onViewAssetsClick, androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), null, 0.0f, 0L, c0585q, (i18 & 112) | (i18 & 14) | 384);
                c0585q = c0585q;
                z10 = false;
            } else {
                z10 = false;
                c0585q.purple(1277735557);
            }
            c0585q.quebec(z10);
            if (str11 != null) {
                c0585q.purple(1281395820);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f5), c0585q);
                C0585q c0585q2 = c0585q;
                z11 = z10;
                E0.alpha(str11, androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 0L, 0L, null, 0.0f, 0L, c0585q2, ((i11 >> 12) & 14) | 48);
                c0585q = c0585q2;
                c0585q.quebec(z11);
                i13 = 1277735557;
            } else {
                z11 = z10;
                i13 = 1277735557;
                c0585q.purple(1277735557);
                c0585q.quebec(z11);
            }
            if (function0 != null) {
                c0585q.purple(1281679687);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f5), c0585q);
                str24 = bravo;
                D4.alpha(((i11 >> 9) & 57344) | ((i11 >> 15) & 14) | 48, androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), c0585q, str24, function0, z2);
            } else {
                str24 = bravo;
                c0585q.purple(i13);
            }
            c0585q.quebec(z11);
            c0585q.quebec(true);
            str16 = str25;
            str17 = str26;
            str14 = str28;
            str15 = str29;
            str18 = str24;
            str13 = str27;
        } else {
            c0585q.ochre();
            str13 = str4;
            str14 = str5;
            str15 = str6;
            str16 = str7;
            str17 = str9;
            str18 = str12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(f5, str, str2, str3, str13, str14, str15, str16, str8, str17, str10, i4, onViewAssetsClick, str11, function0, str18, z2, i5, i10) { // from class: eb.d

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12562a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f12563b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f12564c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f12565d;
                public final /* synthetic */ String e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f12566f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f12567g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f12568h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f12569i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ String f12570j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f12571k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f12572l;
                public final /* synthetic */ float purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ String silver;
                public final /* synthetic */ String teal;
                public final /* synthetic */ String white;
                public final /* synthetic */ String yellow;

                {
                    this.f12572l = i10;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(55);
                    int cyan2 = C0564b.cyan(this.f12572l);
                    String str30 = this.f12564c;
                    String str31 = this.e;
                    String str32 = this.f12570j;
                    boolean z12 = this.f12571k;
                    F0.alpha(s.this, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f12562a, this.f12563b, str30, this.f12565d, str31, this.f12566f, this.f12567g, this.f12568h, this.f12569i, str32, z12, (InterfaceC0581m) obj, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean bravo(pe.al alVar) {
        Intrinsics.echo(alVar, "<this>");
        if (alVar.bravo() == null) {
            return true;
        }
        return false;
    }
}
