package s6;

import F.AbstractC0128l;
import F.AbstractC0141o0;
import P.d;
import T.p;
import a0.C0366t;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import gb.C1762a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m.AbstractC2094g;
import ob.AbstractC2216i;
import ob.AbstractC2217j;
import ob.C2211d;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2787u6;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* renamed from: s6.u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2787u6 implements Decoder, Mf.a {
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12.jade(), java.lang.Integer.valueOf(r15)) == false) goto L98;
     */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void blue(final String title, final long j5, T.p pVar, int i4, final String str, final String str2, final String str3, final boolean z2, final String str4, P.d dVar, final String str5, P.d dVar2, InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        int i11;
        P.d dVar3;
        P.d dVar4;
        final T.p pVar2;
        C0585q c0585q;
        final int i12;
        int i13;
        int i14;
        T.p pVar3;
        boolean z10;
        T.p pVar4;
        T.p pVar5;
        ?? r15;
        T.s sVar;
        float f5;
        T.i iVar;
        C0585q c0585q2;
        int i15;
        int i16;
        androidx.compose.runtime.E0 e02;
        C2550j c2550j;
        C2549i c2549i;
        C2549i c2549i2;
        C2549i c2549i3;
        C0585q c0585q3;
        C2549i c2549i4;
        String str6;
        Intrinsics.echo(title, "title");
        C0585q c0585q4 = (C0585q) interfaceC0581m;
        c0585q4.silver(1247817596);
        int i17 = i5 | (c0585q4.golf(title) ? 4 : 2) | (c0585q4.foxtrot(j5) ? 32 : 16) | 1408 | (c0585q4.golf(str) ? 16384 : 8192) | 14352384 | (c0585q4.golf(str2) ? 67108864 : 33554432) | 805306368;
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0585q4.golf(str3) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0585q4.hotel(z2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0585q4.golf(str4) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0585q4.india(dVar) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0585q4.golf(str5) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i11 |= c0585q4.india(dVar2) ? 131072 : 65536;
        }
        int i18 = i11;
        if (c0585q4.magenta(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 74899) == 74898) ? false : true)) {
            c0585q4.orange();
            int i19 = i5 & 1;
            T.p pVar6 = T.p.alpha;
            if (i19 == 0 || c0585q4.beige()) {
                int i20 = i17 & (-7169);
                i13 = R.drawable.ic_ninja_bag;
                i14 = i20;
                pVar3 = pVar6;
            } else {
                c0585q4.ochre();
                int i21 = i17 & (-7169);
                i13 = i4;
                i14 = i21;
                pVar3 = pVar;
            }
            c0585q4.romeo();
            Object jade = c0585q4.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q4.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            if (((Boolean) axVar.getValue()).booleanValue() && str != null) {
                c0585q4.purple(793014357);
                Object jade2 = c0585q4.jade();
                if (jade2 == asVar) {
                    jade2 = new Cb.u(axVar, 26);
                    c0585q4.f(jade2);
                }
                bronze(str, (Function0) jade2, c0585q4, ((i14 >> 12) & 14) | 48);
                z10 = false;
            } else {
                z10 = false;
                c0585q4.purple(789669798);
            }
            c0585q4.quebec(z10);
            T.s romeo = androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f));
            C0537c c0537c = AbstractC0542h.alpha;
            float f10 = C2211d.bravo;
            C0540f golf = AbstractC0542h.golf(C2211d.juliet);
            T.i iVar2 = T.d.f2062f;
            C0554u alpha = AbstractC0553t.alpha(golf, iVar2, c0585q4, 0);
            int romeo2 = C0564b.romeo(c0585q4);
            androidx.compose.runtime.I mike = c0585q4.mike();
            T.s charlie = T.a.charlie(romeo, c0585q4);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j2);
            } else {
                c0585q4.i();
            }
            C2549i c2549i5 = C2551k.foxtrot;
            C0564b.blue(c2549i5, c0585q4, alpha);
            C2549i c2549i6 = C2551k.echo;
            C0564b.blue(c2549i6, c0585q4, mike);
            C2549i c2549i7 = C2551k.golf;
            if (c0585q4.lime) {
                pVar4 = pVar3;
            } else {
                pVar4 = pVar3;
            }
            ao.ad.blue(romeo2, c0585q4, romeo2, c2549i7);
            C2549i c2549i8 = C2551k.delta;
            C0564b.blue(c2549i8, c0585q4, charlie);
            T.s romeo3 = androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.charlie(pVar6, 1.0f));
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(C2211d.kilo), jVar, c0585q4, 48);
            int romeo4 = C0564b.romeo(c0585q4);
            androidx.compose.runtime.I mike2 = c0585q4.mike();
            T.s charlie2 = T.a.charlie(romeo3, c0585q4);
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j2);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i5, c0585q4, alpha2);
            C0564b.blue(c2549i6, c0585q4, mike2);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo4))) {
                ao.ad.blue(romeo4, c0585q4, romeo4, c2549i7);
            }
            C0564b.blue(c2549i8, c0585q4, charlie2);
            float f11 = C2211d.cyan;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar6, f11);
            float f12 = C2211d.emerald;
            long j6 = C2211d.crimson;
            float f13 = C2211d.fuchsia;
            T.s alpha3 = AbstractC3087z.alpha(t6.R3.charlie(kilo, f12, j6, AbstractC2094g.bravo(f13)), AbstractC2094g.bravo(f13));
            if (str != null) {
                c0585q4.purple(1158353735);
                Object jade3 = c0585q4.jade();
                if (jade3 == asVar) {
                    jade3 = new Cb.u(axVar, 27);
                    c0585q4.f(jade3);
                }
                sVar = androidx.compose.foundation.a.delta(pVar6, false, null, null, (Function0) jade3, 7);
                pVar5 = pVar6;
                r15 = 0;
                c0585q4.quebec(false);
            } else {
                pVar5 = pVar6;
                r15 = 0;
                c0585q4.purple(1158458732);
                c0585q4.quebec(false);
                sVar = pVar5;
            }
            T.s then = alpha3.then(sVar);
            if (str != null) {
                f5 = C2211d.gold * ((float) r15);
            } else {
                f5 = C2211d.gold;
            }
            T.s sierra = AbstractC0538d.sierra(then, f5);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, r15);
            int romeo5 = C0564b.romeo(c0585q4);
            androidx.compose.runtime.I mike3 = c0585q4.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q4);
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j2);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i5, c0585q4, delta);
            C0564b.blue(c2549i6, c0585q4, mike3);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo5))) {
                ao.ad.blue(romeo5, c0585q4, romeo5, c2549i7);
            }
            C0564b.blue(c2549i8, c0585q4, charlie3);
            if (str != null) {
                c0585q4.purple(1265331506);
                X2.g gVar = new X2.g((Context) c0585q4.kilo(AndroidCompositionLocals_androidKt.bravo));
                gVar.charlie = str;
                gVar.bravo();
                X2.h alpha4 = gVar.alpha();
                float f14 = C2211d.bravo;
                i15 = i13;
                iVar = iVar2;
                N2.p.bravo(alpha4, null, AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(pVar5, f11), AbstractC2094g.bravo(f13)), null, AbstractC3076w3.charlie(i13, c0585q4, 0), C2391j.alpha, c0585q4, 48, 64488);
                c0585q2 = c0585q4;
                c0585q2.quebec(false);
                i16 = 0;
            } else {
                iVar = iVar2;
                c0585q2 = c0585q4;
                i15 = i13;
                c0585q2.purple(1266105793);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(i15, c0585q2, 0), null, androidx.compose.foundation.layout.V.kilo(pVar5, C2211d.gray), C0366t.kilo, c0585q2, 3120, 0);
                i16 = 0;
                c0585q2.quebec(false);
            }
            c0585q2.quebec(true);
            T.s romeo6 = androidx.compose.foundation.layout.V.romeo(androidx.appcompat.widget.P0.maroon(1.0f));
            C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(C2211d.green), iVar, c0585q2, i16);
            int romeo7 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike4 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(romeo6, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i5, c0585q2, alpha5);
            C0564b.blue(c2549i6, c0585q2, mike4);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo7))) {
                ao.ad.blue(romeo7, c0585q2, romeo7, c2549i7);
            }
            C0564b.blue(c2549i8, c0585q2, charlie4);
            c0585q2.purple(-110124172);
            androidx.compose.runtime.E0 e03 = F.T2.alpha;
            C0585q c0585q5 = c0585q2;
            T.p pVar7 = pVar5;
            int i22 = i15;
            T.p pVar8 = pVar4;
            F.G2.bravo(title, null, j5, 0L, H0.v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, ((F.S2) c0585q2.kilo(e03)).hotel, c0585q5, (i14 & 14) | 196608, 0, 65498);
            c0585q5.quebec(false);
            String str7 = (str2 == null || StringsKt.gray(str2)) ? null : str2;
            if (str7 == null) {
                c0585q5.purple(-109555571);
                c0585q5.quebec(false);
                e02 = e03;
            } else {
                c0585q5.purple(-109555570);
                e02 = e03;
                F.G2.bravo(str7, null, j5, 0L, H0.v.f1409c, null, 0L, null, C2211d.indigo, 0, false, 0, 0, null, ((F.S2) c0585q5.kilo(e02)).hotel, c0585q5, 196608, 0, 64474);
                c0585q5.quebec(false);
            }
            c0585q5.quebec(true);
            dVar4 = dVar2;
            if (dVar4 == null) {
                c0585q5.purple(1162301987);
                c0585q5.quebec(false);
            } else {
                c0585q5.purple(1700061598);
                androidx.appcompat.widget.P0.indigo((i18 >> 15) & 14, dVar4, c0585q5, false);
            }
            c0585q5.quebec(true);
            if (str3 == null && !z2 && dVar == null) {
                if (!StringsKt.gray(str5)) {
                    c0585q5.purple(-1357206942);
                    F.G2.bravo(str5, null, j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((F.S2) c0585q5.kilo(e02)).kilo, c0585q5, ((i18 >> 12) & 14) | ((i14 << 3) & 896), 0, 65530);
                } else {
                    c0585q5.purple(-1368947696);
                }
                c0585q5.quebec(false);
                c0585q3 = c0585q5;
                dVar3 = dVar;
            } else {
                c0585q5.purple(-1360303935);
                T.s romeo8 = androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.charlie(pVar7, 1.0f));
                T.j jVar2 = T.d.f2060c;
                float f15 = C2211d.lima;
                androidx.compose.foundation.layout.S alpha6 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f15), jVar2, c0585q5, 48);
                int romeo9 = C0564b.romeo(c0585q5);
                androidx.compose.runtime.I mike5 = c0585q5.mike();
                T.s charlie5 = T.a.charlie(romeo8, c0585q5);
                c0585q5.white();
                if (c0585q5.lime) {
                    c2550j = c2550j2;
                    c0585q5.lima(c2550j);
                } else {
                    c2550j = c2550j2;
                    c0585q5.i();
                }
                C0564b.blue(c2549i5, c0585q5, alpha6);
                C0564b.blue(c2549i6, c0585q5, mike5);
                if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(romeo9))) {
                    c2549i = c2549i7;
                    ao.ad.blue(romeo9, c0585q5, romeo9, c2549i);
                } else {
                    c2549i = c2549i7;
                }
                C0564b.blue(c2549i8, c0585q5, charlie5);
                T.s maroon = androidx.appcompat.widget.P0.maroon(1.0f);
                androidx.compose.foundation.layout.S alpha7 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f15), jVar, c0585q5, 48);
                int romeo10 = C0564b.romeo(c0585q5);
                androidx.compose.runtime.I mike6 = c0585q5.mike();
                T.s charlie6 = T.a.charlie(maroon, c0585q5);
                c0585q5.white();
                if (c0585q5.lime) {
                    c0585q5.lima(c2550j);
                } else {
                    c0585q5.i();
                }
                C0564b.blue(c2549i5, c0585q5, alpha7);
                C0564b.blue(c2549i6, c0585q5, mike6);
                if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(romeo10))) {
                    ao.ad.blue(romeo10, c0585q5, romeo10, c2549i);
                }
                C0564b.blue(c2549i8, c0585q5, charlie6);
                String str8 = (str3 == null || StringsKt.gray(str3)) ? null : str3;
                if (str8 == null) {
                    c0585q5.purple(-395605156);
                    c0585q5.quebec(false);
                    c2549i4 = c2549i6;
                    c2549i2 = c2549i;
                    c2549i3 = c2549i8;
                    c0585q3 = c0585q5;
                    dVar3 = dVar;
                } else {
                    c0585q5.purple(-395605155);
                    c2549i2 = c2549i;
                    c2549i3 = c2549i8;
                    c0585q3 = c0585q5;
                    c2549i4 = c2549i6;
                    dVar3 = dVar;
                    T4.alpha(null, AbstractC3086y3.alpha(R.string.store_type_format, new Object[]{str8}, c0585q5), str8, new C1762a(AbstractC2216i.alpha, AbstractC2216i.bravo, AbstractC2216i.charlie, AbstractC2216i.delta, AbstractC2216i.echo, AbstractC2216i.foxtrot, AbstractC2216i.golf), 0, c0585q3, 0, 17);
                    c0585q3.quebec(false);
                }
                if (dVar3 == null) {
                    c0585q3.purple(-394688796);
                    c0585q3.quebec(false);
                } else {
                    c0585q3.purple(1788383421);
                    androidx.appcompat.widget.P0.indigo((i18 >> 9) & 14, dVar3, c0585q3, false);
                }
                c0585q3.quebec(true);
                if (z2) {
                    c0585q3.purple(-1419972157);
                    T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.tango(pVar7, 3)), AbstractC2094g.bravo(C2211d.victor)), AbstractC2217j.alpha, a0.ao.alpha), C2211d.whiskey, C2211d.xray);
                    q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo11 = C0564b.romeo(c0585q3);
                    androidx.compose.runtime.I mike7 = c0585q3.mike();
                    T.s charlie7 = T.a.charlie(tango, c0585q3);
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(c2549i5, c0585q3, delta2);
                    C0564b.blue(c2549i4, c0585q3, mike7);
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo11))) {
                        ao.ad.blue(romeo11, c0585q3, romeo11, c2549i2);
                    }
                    C0564b.blue(c2549i3, c0585q3, charlie7);
                    if (str4 == null) {
                        str6 = Q0.c.oscar(c0585q3, 40573944, R.string.pay_as_you_go, c0585q3, false);
                    } else {
                        c0585q3.purple(40573231);
                        c0585q3.quebec(false);
                        str6 = str4;
                    }
                    F.G2.bravo(str6, androidx.compose.foundation.layout.V.tango(pVar7, 3), AbstractC2217j.bravo, 0L, null, null, 0L, null, C2211d.ivory, 0, false, 0, 0, null, ((F.S2) c0585q3.kilo(e02)).oscar, c0585q3, 432, 0, 64504);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.purple(-1430591951);
                }
                c0585q3.quebec(false);
                c0585q3.quebec(true);
                c0585q3.tango();
            }
            c0585q3.sierra();
            c0585q = c0585q3;
            pVar2 = pVar8;
            i12 = i22;
        } else {
            dVar3 = dVar;
            dVar4 = dVar2;
            c0585q4.ochre();
            pVar2 = pVar;
            c0585q = c0585q4;
            i12 = i4;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final P.d dVar5 = dVar3;
            final P.d dVar6 = dVar4;
            uniform.delta = new Xd.l(title, j5, pVar2, i12, str, str2, str3, z2, str4, dVar5, str5, dVar6, i5, i10) { // from class: lb.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f12953a;
                public final /* synthetic */ String alpha;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f12954b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f12955c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f12956d;
                public final /* synthetic */ d e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f12957f;
                public final /* synthetic */ long purple;
                public final /* synthetic */ p red;
                public final /* synthetic */ int silver;
                public final /* synthetic */ String teal;
                public final /* synthetic */ String white;
                public final /* synthetic */ String yellow;

                {
                    this.f12957f = i10;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    int cyan2 = C0564b.cyan(this.f12957f);
                    String str9 = this.f12956d;
                    d dVar7 = this.e;
                    AbstractC2787u6.blue(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f12953a, this.f12954b, this.f12955c, str9, dVar7, (InterfaceC0581m) obj, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bronze(String str, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function0 function0;
        int i10;
        int i11;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(420356776);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onDismiss)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            function0 = onDismiss;
            AbstractC0128l.delta(function0, null, new U0.t(4, true), P.e.echo(-1868580126, new Ac.i(str, 13), c0585q), c0585q, ((i5 >> 3) & 14) | 3456, 2);
        } else {
            function0 = onDismiss;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.r(i4, 1, str, function0);
        }
    }

    public void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
    }

    @Override // Mf.a
    public double amber(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return black();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short azure() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) coral).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float beige() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) coral).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double black() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) coral).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Mf.a charlie(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        return this;
    }

    public Object coral() {
        throw new SerializationException(kotlin.jvm.internal.u.alpha.bravo(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean delta() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) coral).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char echo() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) coral).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int foxtrot(SerialDescriptor enumDescriptor) {
        Intrinsics.echo(enumDescriptor, "enumDescriptor");
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) coral).intValue();
    }

    @Override // Mf.a
    public long golf(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return november();
    }

    @Override // Mf.a
    public Decoder hotel(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return victor(descriptor.uniform(i4));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int juliet() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) coral).intValue();
    }

    @Override // Mf.a
    public int kilo(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return juliet();
    }

    @Override // Mf.a
    public byte lima(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return xray();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String mike() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.String");
        return (String) coral;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long november() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) coral).longValue();
    }

    @Override // Mf.a
    public boolean oscar(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return delta();
    }

    @Override // Mf.a
    public String papa(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return mike();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean quebec() {
        return true;
    }

    @Override // Mf.a
    public float romeo(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return beige();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object tango(KSerializer deserializer) {
        Intrinsics.echo(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // Mf.a
    public Object uniform(SerialDescriptor descriptor, String str) {
        Nf.P p4 = Nf.P.alpha;
        Intrinsics.echo(descriptor, "descriptor");
        Nf.P.bravo.getClass();
        if (quebec()) {
            return tango(p4);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder victor(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        return this;
    }

    public Object whiskey(SerialDescriptor descriptor, int i4, KSerializer deserializer, Object obj) {
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(deserializer, "deserializer");
        return tango(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte xray() {
        Object coral = coral();
        Intrinsics.charlie(coral, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) coral).byteValue();
    }

    @Override // Mf.a
    public short yankee(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return azure();
    }

    @Override // Mf.a
    public char zulu(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return echo();
    }
}
