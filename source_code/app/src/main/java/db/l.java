package db;

import Ec.aa;
import Ec.ae;
import Ec.al;
import Ec.ar;
import Ec.aw;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import H0.v;
import a0.C0366t;
import a0.an;
import a0.ao;
import a0.au;
import android.content.res.Resources;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import b.b0;
import bx.C0769g;
import bx.F;
import bz.AbstractC0782g;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import d5.C1589a;
import delivery.samurai.android.R;
import fe.C1712d;
import g0.C1725e;
import g0.C1726f;
import g0.ah;
import h.AbstractC1797a;
import i.AbstractC1876y;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1869r;
import i0.InterfaceC1878a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import s6.AbstractC2647f0;
import s6.AbstractC2715m5;
import s6.J4;
import s6.Z;
import t0.AbstractC2901T;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.X3;
import t6.ac;

/* loaded from: classes2.dex */
public abstract class l {
    public static final long alpha = ao.delta(4279673674L);
    public static final long bravo = ao.delta(4294898631L);
    public static final long charlie = ao.delta(4294759245L);
    public static final long delta = ao.delta(4287774734L);
    public static final List echo = CollectionsKt.listOf(new C1603c("Triple Cheeseburger", "تربل برجر بالجبن", 1, CollectionsKt.listOf(new m(1, "Fries without Salt", "بدون ملح"), new m(1, "Well Done", "جيد الاستواء"), new m(1, "Water", "مياه"), new m(1, "Extra Sauce", "صوص زيادة"))), new C1603c("Veggie Burger", "برجر نباتي", 2, CollectionsKt.listOf(new m(1, "Sweet Potato Fries", "بطاطا حلوة مقلية"), new m(1, "Medium Rare", "قليل الاستواء"), new m(2, "Lemonade", "ليموناضة"), new m(1, "Garlic Dip", "صوص ثوم"))), new C1603c("Grilled Chicken Wrap", "لفافة دجاج مشوي", 1, CollectionsKt.listOf(new m(1, "Onion Rings", "حلقات بصل"), new m(1, "Medium", "متوسط"), new m(1, "Iced Tea", "شاي مثلج"), new m(1, "Spicy Mayo", "صوص حار"))));

    public static final void alpha(C1603c c1603c, C1602b c1602b, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        boolean z2;
        String str3;
        String str4;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1582222454);
        if (c0585q.india(c1603c)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i4 | i10;
        if (c0585q.golf(c1602b)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        int i16 = i5 & 4;
        if (i16 != 0) {
            i13 = i15 | 384;
            str2 = str;
        } else {
            str2 = str;
            if (c0585q.golf(str2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i13 = i15 | i12;
        }
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            String str5 = null;
            if (i16 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            T.p pVar = T.p.alpha;
            float f5 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(AbstractC3087z.alpha(V.charlie(pVar, 1.0f), AbstractC2094g.bravo(f5)), 1, Db.c.beige, AbstractC2094g.bravo(f5)), C0366t.echo, ao.alpha), c1602b.bravo);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f golf = AbstractC0542h.golf(c1602b.charlie);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf, iVar, c0585q, 0);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            String str6 = str4;
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            T.j jVar = T.d.f2060c;
            C0540f golf2 = AbstractC0542h.golf(c1602b.delta);
            T.s charlie4 = V.charlie(pVar, 1.0f);
            S alpha3 = Q.alpha(golf2, jVar, c0585q, 48);
            int romeo3 = C0564b.romeo(c0585q);
            I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(charlie4, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            echo(c1602b, c0585q, (i13 >> 3) & 14);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(c1602b.india), iVar, c0585q, 0);
            int romeo4 = C0564b.romeo(c0585q);
            I mike4 = c0585q.mike();
            T.s charlie6 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ad.blue(romeo4, c0585q, romeo4, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            String str7 = c1603c.alpha;
            v vVar = v.f1409c;
            long j5 = Db.c.bronze;
            int i17 = i13;
            G2.bravo(str7, null, j5, c1602b.golf, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 196992, 0, 131026);
            C0585q c0585q2 = c0585q;
            String str8 = c1603c.bravo;
            if (str8 != null && !StringsKt.gray(str8)) {
                str5 = str8;
            }
            if (str5 == null) {
                c0585q2.purple(-762712613);
            } else {
                c0585q2.purple(-762712612);
                G2.bravo(str5, null, Db.c.black, c1602b.hotel, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 384, 0, 131058);
                c0585q2 = c0585q2;
            }
            c0585q2.quebec(false);
            c0585q2.quebec(true);
            C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(2), T.d.f2064h, c0585q2, 54);
            int romeo5 = C0564b.romeo(c0585q2);
            I mike5 = c0585q2.mike();
            T.s charlie7 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha5);
            C0564b.blue(c2549i2, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo5))) {
                ad.blue(romeo5, c0585q2, romeo5, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie7);
            if (str6 == null) {
                c0585q2.purple(-1754022506);
            } else {
                c0585q2.purple(-1754022505);
                C0585q c0585q3 = c0585q2;
                G2.bravo(str6, null, Db.c.black, AbstractC2636d7.charlie(12), v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 200064, 0, 131026);
                c0585q2 = c0585q3;
            }
            c0585q2.quebec(false);
            C0585q c0585q4 = c0585q2;
            G2.bravo("x" + c1603c.charlie, null, j5, c1602b.juliet, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, 196992, 0, 131026);
            c0585q = c0585q4;
            c0585q.quebec(true);
            c0585q.quebec(true);
            List list = c1603c.delta;
            if (!list.isEmpty()) {
                c0585q.purple(1879536604);
                golf(list, c1602b, c0585q, i17 & 112);
            } else {
                c0585q.purple(1852805180);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            c0585q.quebec(true);
            str3 = str6;
        } else {
            c0585q.ochre();
            str3 = str2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(c1603c, c1602b, str3, i4, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final List items, final Function0 onDone, T.s sVar, Function0 function0, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        Function0 function02;
        int i13;
        int i14;
        String str2;
        int i15;
        boolean z2;
        T.s sVar3;
        Function0 function03;
        final String str3;
        androidx.compose.runtime.Q uniform;
        T.s sVar4;
        final Function0 function04;
        int i16;
        Intrinsics.echo(items, "items");
        Intrinsics.echo(onDone, "onDone");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1591927256);
        if (c0585q.india(items)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i10 | i4;
        if ((i4 & 48) == 0) {
            if (c0585q.india(onDone)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 |= i16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i17 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i17 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i17 |= 3072;
            } else if ((i4 & 3072) == 0) {
                function02 = function0;
                if (c0585q.india(function02)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i17 |= i13;
                i14 = i5 & 16;
                if (i14 != 0) {
                    i17 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    str2 = str;
                    if (c0585q.golf(str2)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i17 |= i15;
                    char c3 = 0;
                    if ((i17 & 9363) == 9362) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!c0585q.magenta(i17 & 1, z2)) {
                        if (i18 != 0) {
                            sVar4 = T.p.alpha;
                        } else {
                            sVar4 = sVar2;
                        }
                        if (i12 != 0) {
                            function04 = null;
                        } else {
                            function04 = function02;
                        }
                        if (i14 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (str3 == null || StringsKt.gray(str3)) {
                            c3 = 1;
                        }
                        final boolean z10 = c3 ^ 1;
                        final int size = items.size() + (z10 ? 1 : 0);
                        AbstractC0538d.alpha(androidx.compose.foundation.a.bravo(V.charlie(sVar4, 1.0f), C0366t.echo, ao.alpha), null, false, P.e.echo(-1185870014, new Xd.m() { // from class: db.f
                            /* JADX WARN: Removed duplicated region for block: B:69:0x0621  */
                            /* JADX WARN: Removed duplicated region for block: B:76:0x0673  */
                            /* JADX WARN: Removed duplicated region for block: B:91:0x06f2  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0625  */
                            @Override // Xd.m
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                boolean z11;
                                C1602b c1602b;
                                as asVar;
                                FillElement fillElement;
                                C1602b c1602b2;
                                C2549i c2549i;
                                C2549i c2549i2;
                                boolean z12;
                                boolean z13;
                                List list;
                                C1602b c1602b3;
                                C2549i c2549i3;
                                boolean z14;
                                float charlie2;
                                ax axVar;
                                T.p pVar;
                                boolean z15;
                                C2549i c2549i4;
                                float f5;
                                float f10;
                                boolean z16;
                                C2549i c2549i5;
                                C2549i c2549i6;
                                boolean z17;
                                int romeo;
                                boolean z18;
                                long j5;
                                int i19;
                                int i20;
                                C1606f c1606f = this;
                                C0552s BoxWithConstraints = (C0552s) obj;
                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                Intrinsics.echo(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((intValue & 6) == 0) {
                                    if (((C0585q) interfaceC0581m2).golf(BoxWithConstraints)) {
                                        i20 = 4;
                                    } else {
                                        i20 = 2;
                                    }
                                    intValue |= i20;
                                }
                                if ((intValue & 19) != 18) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                if (c0585q2.magenta(intValue & 1, z11)) {
                                    float bravo2 = BoxWithConstraints.bravo();
                                    final int i21 = size;
                                    boolean delta2 = c0585q2.delta(bravo2) | c0585q2.echo(i21);
                                    Object jade = c0585q2.jade();
                                    as asVar2 = C0580l.alpha;
                                    if (delta2 || jade == asVar2) {
                                        float f11 = ((Q0.g) J4.alpha(new Q0.g(BoxWithConstraints.bravo() - 224), new Q0.g(0))).alpha;
                                        if (i21 > 0) {
                                            f11 /= i21;
                                        }
                                        if (i21 == 1 && Float.compare(f11, HttpConstants.HTTP_BAD_REQUEST) >= 0) {
                                            c1602b = C1602b.sierra;
                                        } else if (2 <= i21 && i21 < 4 && Float.compare(f11, 180) >= 0) {
                                            c1602b = C1602b.romeo;
                                        } else {
                                            c1602b = C1602b.quebec;
                                        }
                                        jade = c1602b;
                                        c0585q2.f(jade);
                                    }
                                    C1602b c1602b4 = (C1602b) jade;
                                    T.p pVar2 = T.p.alpha;
                                    FillElement fillElement2 = V.charlie;
                                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                                    int romeo2 = C0564b.romeo(c0585q2);
                                    I mike = c0585q2.mike();
                                    T.s charlie3 = T.a.charlie(fillElement2, c0585q2);
                                    InterfaceC2552l.maroon.getClass();
                                    C2550j c2550j = C2551k.bravo;
                                    c0585q2.white();
                                    if (c0585q2.lime) {
                                        c0585q2.lima(c2550j);
                                    } else {
                                        c0585q2.i();
                                    }
                                    C2549i c2549i7 = C2551k.foxtrot;
                                    C0564b.blue(c2549i7, c0585q2, alpha2);
                                    C2549i c2549i8 = C2551k.echo;
                                    C0564b.blue(c2549i8, c0585q2, mike);
                                    C2549i c2549i9 = C2551k.golf;
                                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                                        ad.blue(romeo2, c0585q2, romeo2, c2549i9);
                                    }
                                    C2549i c2549i10 = C2551k.delta;
                                    C0564b.blue(c2549i10, c0585q2, charlie3);
                                    T.j jVar = T.d.f2061d;
                                    Function0 function05 = function04;
                                    if (function05 != null) {
                                        c0585q2.purple(-1206492960);
                                        float f12 = 8;
                                        T.s whiskey = AbstractC0538d.whiskey(V.charlie(pVar2, 1.0f), 4, f12, f12, 0.0f, 8);
                                        S alpha3 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q2, 48);
                                        int romeo3 = C0564b.romeo(c0585q2);
                                        I mike2 = c0585q2.mike();
                                        T.s charlie4 = T.a.charlie(whiskey, c0585q2);
                                        c0585q2.white();
                                        fillElement = fillElement2;
                                        if (c0585q2.lime) {
                                            c0585q2.lima(c2550j);
                                        } else {
                                            c0585q2.i();
                                        }
                                        C0564b.blue(c2549i7, c0585q2, alpha3);
                                        C0564b.blue(c2549i8, c0585q2, mike2);
                                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                                            ad.blue(romeo3, c0585q2, romeo3, c2549i9);
                                        }
                                        C0564b.blue(c2549i10, c0585q2, charlie4);
                                        c2549i = c2549i8;
                                        c2549i2 = c2549i9;
                                        asVar = asVar2;
                                        c1602b2 = c1602b4;
                                        K1.foxtrot(function05, null, false, null, n.alpha, c0585q2, 196608, 30);
                                        c0585q2 = c0585q2;
                                        c0585q2.quebec(true);
                                        z12 = false;
                                    } else {
                                        asVar = asVar2;
                                        fillElement = fillElement2;
                                        c1602b2 = c1602b4;
                                        c2549i = c2549i8;
                                        c2549i2 = c2549i9;
                                        z12 = false;
                                        c0585q2.purple(-1215775786);
                                    }
                                    c0585q2.quebec(z12);
                                    float f13 = 16;
                                    float f14 = 8;
                                    T.s tango = AbstractC0538d.tango(V.charlie(pVar2, 1.0f), f13, f14);
                                    float f15 = 12;
                                    S alpha4 = Q.alpha(AbstractC0542h.golf(f15), jVar, c0585q2, 54);
                                    int romeo4 = C0564b.romeo(c0585q2);
                                    I mike3 = c0585q2.mike();
                                    T.s charlie5 = T.a.charlie(tango, c0585q2);
                                    c0585q2.white();
                                    if (c0585q2.lime) {
                                        c0585q2.lima(c2550j);
                                    } else {
                                        c0585q2.i();
                                    }
                                    C0564b.blue(c2549i7, c0585q2, alpha4);
                                    C0564b.blue(c2549i, c0585q2, mike3);
                                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo4))) {
                                        ad.blue(romeo4, c0585q2, romeo4, c2549i2);
                                    }
                                    C0564b.blue(c2549i10, c0585q2, charlie5);
                                    String bravo3 = AbstractC3086y3.bravo(c0585q2, R.string.cashier_screen_title);
                                    long charlie6 = AbstractC2636d7.charlie(22);
                                    v vVar = v.f1409c;
                                    C0585q c0585q3 = c0585q2;
                                    long j6 = Db.c.bronze;
                                    if (1.0f <= 0.0d) {
                                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                                    }
                                    G2.bravo(bravo3, new LayoutWeightElement(1.0f, true), j6, charlie6, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 200064, 0, 131024);
                                    C0585q c0585q4 = c0585q3;
                                    List list2 = items;
                                    int size2 = list2.size();
                                    final boolean z19 = z10;
                                    l.charlie(size2, z19, null, c0585q4, 0);
                                    c0585q4.quebec(true);
                                    if (i21 > 4) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    Object[] objArr = {Integer.valueOf(i21)};
                                    Object jade2 = c0585q4.jade();
                                    if (jade2 == asVar) {
                                        list = list2;
                                        jade2 = new C1589a(6);
                                        c0585q4.f(jade2);
                                    } else {
                                        list = list2;
                                    }
                                    ax axVar2 = (ax) R.l.echo(objArr, (Function0) jade2, c0585q4, 48);
                                    Object[] objArr2 = {Integer.valueOf(i21)};
                                    boolean hotel = c0585q4.hotel(z13);
                                    Object jade3 = c0585q4.jade();
                                    if (hotel || jade3 == asVar) {
                                        jade3 = new ae(1, z13);
                                        c0585q4.f(jade3);
                                    }
                                    ax axVar3 = (ax) R.l.echo(objArr2, (Function0) jade3, c0585q4, 0);
                                    if (list.size() == 1 && !z19) {
                                        c1602b3 = c1602b2;
                                        if (c1602b3.alpha == EnumC1601a.alpha) {
                                            c0585q4.purple(-1203934096);
                                            T.s navy = P0.navy(AbstractC0538d.uniform(V.charlie(pVar2, 1.0f), f13, 0.0f, 2));
                                            ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                                            int romeo5 = C0564b.romeo(c0585q4);
                                            I mike4 = c0585q4.mike();
                                            T.s charlie7 = T.a.charlie(navy, c0585q4);
                                            c0585q4.white();
                                            if (c0585q4.lime) {
                                                c0585q4.lima(c2550j);
                                            } else {
                                                c0585q4.i();
                                            }
                                            C0564b.blue(c2549i7, c0585q4, delta3);
                                            C0564b.blue(c2549i, c0585q4, mike4);
                                            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo5))) {
                                                ad.blue(romeo5, c0585q4, romeo5, c2549i2);
                                            }
                                            C0564b.blue(c2549i10, c0585q4, charlie7);
                                            l.alpha((C1603c) CollectionsKt.gold(list), c1602b3, null, c0585q4, 0, 4);
                                            c0585q4.quebec(true);
                                            c0585q4.quebec(false);
                                            c2549i5 = c2549i10;
                                            axVar = axVar3;
                                            f10 = f14;
                                            z16 = z13;
                                            c2549i6 = c2549i2;
                                            pVar = pVar2;
                                            T.s sierra = AbstractC0538d.sierra(pVar, f13);
                                            C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), T.d.f2063g, c0585q4, 54);
                                            romeo = C0564b.romeo(c0585q4);
                                            I mike5 = c0585q4.mike();
                                            T.s charlie8 = T.a.charlie(sierra, c0585q4);
                                            c0585q4.white();
                                            if (!c0585q4.lime) {
                                                c0585q4.lima(c2550j);
                                            } else {
                                                c0585q4.i();
                                            }
                                            C0564b.blue(c2549i7, c0585q4, alpha5);
                                            C0564b.blue(c2549i, c0585q4, mike5);
                                            if (!c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo))) {
                                                ad.blue(romeo, c0585q4, romeo, c2549i6);
                                            }
                                            C0564b.blue(c2549i5, c0585q4, charlie8);
                                            C0585q c0585q5 = c0585q4;
                                            AbstractC2715m5.bravo(AbstractC3086y3.bravo(c0585q4, R.string.done_action), onDone, V.charlie(pVar, 1.0f), ((Boolean) axVar.getValue()).booleanValue(), null, false, true, c0585q5, 1573248, 48);
                                            C0585q c0585q6 = c0585q5;
                                            if (!z16) {
                                                c0585q6.purple(-699892702);
                                                if (((Boolean) axVar.getValue()).booleanValue()) {
                                                    j5 = l.alpha;
                                                } else {
                                                    j5 = Db.c.black;
                                                }
                                                D0 alpha6 = F.alpha(j5, null, c0585q6, 384, 10);
                                                if (((Boolean) axVar.getValue()).booleanValue()) {
                                                    i19 = R.string.all_items_reviewed;
                                                } else {
                                                    i19 = R.string.scroll_to_enable_done;
                                                }
                                                G2.bravo(AbstractC3086y3.bravo(c0585q6, i19), V.charlie(pVar, 1.0f), ((C0366t) alpha6.getValue()).alpha, AbstractC2636d7.charlie(13), v.f1407a, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q6, 199728, 0, 130512);
                                                c0585q6 = c0585q6;
                                                z18 = false;
                                            } else {
                                                z18 = false;
                                                c0585q6.purple(-718282708);
                                            }
                                            c0585q6.quebec(z18);
                                            c0585q6.quebec(true);
                                            c0585q6.quebec(true);
                                        } else {
                                            axVar3 = axVar3;
                                        }
                                    } else {
                                        c1602b3 = c1602b2;
                                    }
                                    c0585q4.purple(-1203265860);
                                    C1874w alpha7 = AbstractC1876y.alpha(c0585q4);
                                    list.size();
                                    final C1602b c1602b5 = c1602b3;
                                    Object jade4 = c0585q4.jade();
                                    if (jade4 == asVar) {
                                        jade4 = C0564b.quebec(new Ec.f(alpha7, 3));
                                        c0585q4.f(jade4);
                                    }
                                    D0 d02 = (D0) jade4;
                                    Integer valueOf = Integer.valueOf(((Number) d02.getValue()).intValue());
                                    boolean golf = c0585q4.golf(axVar2);
                                    Object jade5 = c0585q4.jade();
                                    if (!golf && jade5 != asVar) {
                                        c2549i3 = c2549i2;
                                    } else {
                                        c2549i3 = c2549i2;
                                        jade5 = new C1607g(d02, axVar2, null);
                                        c0585q4.f(jade5);
                                    }
                                    C0564b.foxtrot((Xd.l) jade5, c0585q4, valueOf);
                                    Boolean valueOf2 = Boolean.valueOf(z13);
                                    boolean hotel2 = c0585q4.hotel(z13) | c0585q4.golf(alpha7) | c0585q4.golf(axVar3);
                                    Object jade6 = c0585q4.jade();
                                    if (hotel2 || jade6 == asVar) {
                                        jade6 = new i(z13, alpha7, axVar3, null);
                                        c0585q4.f(jade6);
                                    }
                                    C0564b.golf(alpha7, valueOf2, (Xd.l) jade6, c0585q4);
                                    InterfaceC1878a interfaceC1878a = (InterfaceC1878a) c0585q4.kilo(AbstractC2901T.lima);
                                    Boolean bool = (Boolean) axVar3.getValue();
                                    bool.getClass();
                                    boolean golf2 = c0585q4.golf(axVar3) | c0585q4.hotel(z13) | c0585q4.india(interfaceC1878a);
                                    Object jade7 = c0585q4.jade();
                                    if (golf2 || jade7 == asVar) {
                                        jade7 = new j(z13, interfaceC1878a, axVar3, null);
                                        c0585q4.f(jade7);
                                    }
                                    C0564b.foxtrot((Xd.l) jade7, c0585q4, bool);
                                    boolean golf3 = c0585q4.golf(alpha7) | c0585q4.echo(i21);
                                    Object jade8 = c0585q4.jade();
                                    if (golf3 || jade8 == asVar) {
                                        jade8 = C0564b.quebec(new aw(alpha7, i21, 3));
                                        c0585q4.f(jade8);
                                    }
                                    D0 d03 = (D0) jade8;
                                    if (i21 <= 1) {
                                        charlie2 = 1.0f;
                                        z14 = false;
                                    } else {
                                        int intValue2 = ((Number) axVar2.getValue()).intValue();
                                        if (intValue2 < 0) {
                                            intValue2 = 0;
                                        }
                                        z14 = false;
                                        charlie2 = J4.charlie(intValue2 / (i21 - 1), 0.0f, 1.0f);
                                    }
                                    final List list3 = list;
                                    axVar = axVar3;
                                    pVar = pVar2;
                                    D0 bravo4 = AbstractC0782g.bravo(charlie2, null, "cashierScrollProgress", c0585q4, 3072, 22);
                                    if (z13) {
                                        c0585q4.purple(-1201052243);
                                        l.india(((Number) bravo4.getValue()).floatValue(), AbstractC0538d.tango(V.charlie(pVar, 1.0f), f13, f14), c0585q4, 48);
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                        c0585q4.purple(-1215775786);
                                    }
                                    c0585q4.quebec(z15);
                                    T.s navy2 = P0.navy(V.charlie(pVar, 1.0f));
                                    T.k kVar = T.d.alpha;
                                    ap delta4 = AbstractC0547m.delta(kVar, z15);
                                    int romeo6 = C0564b.romeo(c0585q4);
                                    I mike6 = c0585q4.mike();
                                    T.s charlie9 = T.a.charlie(navy2, c0585q4);
                                    c0585q4.white();
                                    if (c0585q4.lime) {
                                        c0585q4.lima(c2550j);
                                    } else {
                                        c0585q4.i();
                                    }
                                    C0564b.blue(c2549i7, c0585q4, delta4);
                                    C0564b.blue(c2549i, c0585q4, mike6);
                                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo6))) {
                                        c2549i4 = c2549i3;
                                        ad.blue(romeo6, c0585q4, romeo6, c2549i4);
                                    } else {
                                        c2549i4 = c2549i3;
                                    }
                                    C0564b.blue(c2549i10, c0585q4, charlie9);
                                    C0551q c0551q = C0551q.alpha;
                                    C2549i c2549i11 = c2549i4;
                                    T.s uniform2 = AbstractC0538d.uniform(fillElement, f13, 0.0f, 2);
                                    if (z13) {
                                        f5 = 56;
                                    } else {
                                        f5 = f14;
                                    }
                                    M delta5 = AbstractC0538d.delta(0.0f, f14, 0.0f, f5, 5);
                                    C0540f golf4 = AbstractC0542h.golf(c1602b5.papa);
                                    boolean india = c0585q4.india(list3) | c0585q4.golf(c1602b5) | c0585q4.hotel(z13) | c0585q4.echo(i21) | c0585q4.hotel(z19);
                                    f10 = f14;
                                    c1606f = this;
                                    final String str4 = str3;
                                    boolean golf5 = india | c0585q4.golf(str4);
                                    Object jade9 = c0585q4.jade();
                                    if (!golf5 && jade9 != asVar) {
                                        z16 = z13;
                                    } else {
                                        final boolean z20 = z13;
                                        Function1 function1 = new Function1() { // from class: db.d
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj4;
                                                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                                                List list4 = list3;
                                                int size3 = list4.size();
                                                C0769g c0769g = new C0769g(7, list4);
                                                C1602b c1602b6 = c1602b5;
                                                boolean z21 = z20;
                                                int i22 = i21;
                                                ((C1860i) LazyColumn).quebec(size3, null, c0769g, new P.d(new k(list4, c1602b6, z21, i22), -1091073711, true));
                                                if (z19) {
                                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "customer-note", new P.d(new Tb.b(str4, c1602b6, z21, list4, i22), -220295108, true), 2);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        z16 = z20;
                                        c0585q4.f(function1);
                                        jade9 = function1;
                                    }
                                    Function1 function12 = (Function1) jade9;
                                    c2549i5 = c2549i10;
                                    c2549i6 = c2549i11;
                                    AbstractC2616b5.bravo(uniform2, alpha7, delta5, golf4, null, null, false, function12, c0585q4, 6);
                                    c0585q4 = c0585q4;
                                    if (z16 && alpha7.delta() && ((Number) d03.getValue()).intValue() > 0) {
                                        c0585q4.purple(-705471308);
                                        T.s whiskey2 = AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.f2058a), 0.0f, 0.0f, 0.0f, f15, 7);
                                        ap delta6 = AbstractC0547m.delta(kVar, false);
                                        int romeo7 = C0564b.romeo(c0585q4);
                                        I mike7 = c0585q4.mike();
                                        T.s charlie10 = T.a.charlie(whiskey2, c0585q4);
                                        c0585q4.white();
                                        if (c0585q4.lime) {
                                            c0585q4.lima(c2550j);
                                        } else {
                                            c0585q4.i();
                                        }
                                        C0564b.blue(c2549i7, c0585q4, delta6);
                                        C0564b.blue(c2549i, c0585q4, mike7);
                                        if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo7))) {
                                            ad.blue(romeo7, c0585q4, romeo7, c2549i6);
                                        }
                                        C0564b.blue(c2549i5, c0585q4, charlie10);
                                        z17 = false;
                                        l.hotel(((Number) d03.getValue()).intValue(), null, c0585q4, 0);
                                        c0585q4.quebec(true);
                                    } else {
                                        z17 = false;
                                        c0585q4.purple(-722707401);
                                    }
                                    c0585q4.quebec(z17);
                                    c0585q4.quebec(true);
                                    c0585q4.quebec(z17);
                                    T.s sierra2 = AbstractC0538d.sierra(pVar, f13);
                                    C0554u alpha52 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), T.d.f2063g, c0585q4, 54);
                                    romeo = C0564b.romeo(c0585q4);
                                    I mike52 = c0585q4.mike();
                                    T.s charlie82 = T.a.charlie(sierra2, c0585q4);
                                    c0585q4.white();
                                    if (!c0585q4.lime) {
                                    }
                                    C0564b.blue(c2549i7, c0585q4, alpha52);
                                    C0564b.blue(c2549i, c0585q4, mike52);
                                    if (!c0585q4.lime) {
                                    }
                                    ad.blue(romeo, c0585q4, romeo, c2549i6);
                                    C0564b.blue(c2549i5, c0585q4, charlie82);
                                    C0585q c0585q52 = c0585q4;
                                    AbstractC2715m5.bravo(AbstractC3086y3.bravo(c0585q4, R.string.done_action), onDone, V.charlie(pVar, 1.0f), ((Boolean) axVar.getValue()).booleanValue(), null, false, true, c0585q52, 1573248, 48);
                                    C0585q c0585q62 = c0585q52;
                                    if (!z16) {
                                    }
                                    c0585q62.quebec(z18);
                                    c0585q62.quebec(true);
                                    c0585q62.quebec(true);
                                } else {
                                    c0585q2.ochre();
                                }
                                return Unit.INSTANCE;
                            }
                        }, c0585q), c0585q, 3072, 6);
                        function03 = function04;
                        sVar3 = sVar4;
                    } else {
                        c0585q.ochre();
                        sVar3 = sVar2;
                        function03 = function02;
                        str3 = str2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new W4.a(items, onDone, sVar3, function03, str3, i4, i5);
                        return;
                    }
                    return;
                }
                str2 = str;
                char c32 = 0;
                if ((i17 & 9363) == 9362) {
                }
                if (!c0585q.magenta(i17 & 1, z2)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            function02 = function0;
            i14 = i5 & 16;
            if (i14 != 0) {
            }
            str2 = str;
            char c322 = 0;
            if ((i17 & 9363) == 9362) {
            }
            if (!c0585q.magenta(i17 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        function02 = function0;
        i14 = i5 & 16;
        if (i14 != 0) {
        }
        str2 = str;
        char c3222 = 0;
        if ((i17 & 9363) == 9362) {
        }
        if (!c0585q.magenta(i17 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(final int i4, final boolean z2, T.p pVar, InterfaceC0581m interfaceC0581m, final int i5) {
        int i10;
        int i11;
        boolean z10;
        final T.p pVar2;
        String str;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1111587818);
        if (c0585q.echo(i4)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i5;
        if (c0585q.hotel(z2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11 | 384;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i13 & 1, z10)) {
            T.p pVar3 = T.p.alpha;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar3, AbstractC2094g.bravo(10)), Db.c.bronze, ao.alpha), 14, 8);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            String quantityString = ((Resources) c0585q.kilo(AndroidCompositionLocals_androidKt.charlie)).getQuantityString(R.plurals.ordered_items_count, i4, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            if (z2) {
                str = Q0.c.oscar(c0585q, 229024706, R.string.plus_one_note, c0585q, false);
            } else {
                c0585q.purple(-1490126174);
                c0585q.quebec(false);
                str = "";
            }
            pVar2 = pVar3;
            G2.bravo(P0.crimson(quantityString, str), null, C0366t.echo, AbstractC2636d7.charlie(18), v.f1409c, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131026);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(i4, z2, pVar2, i5) { // from class: db.e
                public final /* synthetic */ int alpha;
                public final /* synthetic */ boolean purple;
                public final /* synthetic */ T.p red;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    boolean z11 = this.purple;
                    T.p pVar4 = this.red;
                    l.charlie(this.alpha, z11, pVar4, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void delta(String str, C1602b c1602b, String str2, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        T.p pVar2;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1466768636);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.golf(c1602b)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q.golf(str2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11 | 3072;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            float f5 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(AbstractC3087z.alpha(V.charlie(pVar3, 1.0f), AbstractC2094g.bravo(f5)), 1, charlie, AbstractC2094g.bravo(f5)), bravo, ao.alpha), c1602b.bravo);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(c1602b.india), T.d.f2062f, c0585q, 0);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            S alpha3 = Q.alpha(AbstractC0542h.golf(8), T.d.f2061d, c0585q, 54);
            int romeo3 = C0564b.romeo(c0585q);
            I mike3 = c0585q.mike();
            T.s charlie4 = T.a.charlie(pVar3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            C1726f c1726f = AbstractC2647f0.alpha;
            if (c1726f != null) {
                Intrinsics.checkNotNull(c1726f);
            } else {
                C1725e c1725e = new C1725e("Filled.Notes", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = ah.alpha;
                au auVar = new au(C0366t.bravo);
                T3.b bVar = new T3.b(2, false);
                bVar.juliet(3.0f, 18.0f);
                bVar.golf(12.0f);
                bVar.november(-2.0f);
                bVar.hotel(3.0f, 16.0f);
                bVar.november(2.0f);
                bVar.charlie();
                bVar.juliet(3.0f, 6.0f);
                bVar.november(2.0f);
                bVar.golf(18.0f);
                bVar.hotel(21.0f, 6.0f);
                bVar.hotel(3.0f, 6.0f);
                bVar.charlie();
                bVar.juliet(3.0f, 13.0f);
                bVar.golf(18.0f);
                bVar.november(-2.0f);
                bVar.hotel(3.0f, 11.0f);
                bVar.november(2.0f);
                bVar.charlie();
                c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
                c1726f = c1725e.echo();
                AbstractC2647f0.alpha = c1726f;
                Intrinsics.checkNotNull(c1726f);
            }
            C1726f c1726f2 = c1726f;
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.cd_customer_note_card);
            T.s kilo = V.kilo(pVar3, 20);
            long j5 = delta;
            AbstractC0141o0.bravo(c1726f2, bravo2, kilo, j5, c0585q, 3456, 0);
            String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.customer_note_label);
            long charlie5 = AbstractC2636d7.charlie(15);
            v vVar = v.f1409c;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(bravo3, new LayoutWeightElement(1.0f, true), j5, charlie5, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131024);
            C0585q c0585q2 = c0585q;
            if (str2 == null) {
                c0585q2.purple(-790513755);
                z10 = false;
            } else {
                c0585q2.purple(-790513754);
                G2.bravo(str2, null, Db.c.black, AbstractC2636d7.charlie(12), v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 200064, 0, 131026);
                c0585q2 = c0585q2;
                z10 = false;
            }
            c0585q2.quebec(z10);
            c0585q2.quebec(true);
            C0585q c0585q3 = c0585q2;
            G2.bravo(str, null, Db.c.bronze, AbstractC2636d7.charlie(16), v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, (i14 & 14) | 200064, 0, 131026);
            c0585q = c0585q3;
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(str, c1602b, str2, pVar2, i4, 7);
        }
    }

    public static final void echo(C1602b c1602b, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2089145018);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(c1602b)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.kilo(pVar, c1602b.echo), AbstractC2094g.bravo(8)), Db.c.amber, ao.alpha);
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            C1726f c1726f = s6.V.alpha;
            if (c1726f != null) {
                Intrinsics.checkNotNull(c1726f);
            } else {
                C1725e c1725e = new C1725e("Filled.Fastfood", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = ah.alpha;
                au auVar = new au(C0366t.bravo);
                T3.b bVar = new T3.b(2, false);
                bVar.juliet(18.06f, 22.99f);
                bVar.golf(1.66f);
                bVar.echo(0.84f, 0.0f, 1.53f, -0.64f, 1.63f, -1.46f);
                bVar.hotel(23.0f, 5.05f);
                bVar.golf(-5.0f);
                bVar.hotel(18.0f, 1.0f);
                bVar.golf(-1.97f);
                bVar.november(4.05f);
                bVar.golf(-4.97f);
                bVar.india(0.3f, 2.34f);
                bVar.echo(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f);
                bVar.echo(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f);
                bVar.november(8.05f);
                bVar.charlie();
                bVar.juliet(1.0f, 21.99f);
                bVar.hotel(1.0f, 21.0f);
                bVar.golf(15.03f);
                bVar.november(0.99f);
                bVar.echo(0.0f, 0.55f, -0.45f, 1.0f, -1.01f, 1.0f);
                bVar.hotel(2.01f, 22.99f);
                bVar.echo(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.0f);
                bVar.charlie();
                bVar.juliet(16.03f, 14.99f);
                bVar.echo(0.0f, -8.0f, -15.03f, -8.0f, -15.03f, 0.0f);
                bVar.golf(15.03f);
                bVar.charlie();
                bVar.juliet(1.02f, 17.0f);
                bVar.golf(15.0f);
                bVar.november(2.0f);
                bVar.golf(-15.0f);
                bVar.charlie();
                c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
                c1726f = c1725e.echo();
                s6.V.alpha = c1726f;
                Intrinsics.checkNotNull(c1726f);
            }
            AbstractC0141o0.bravo(c1726f, null, V.kilo(pVar, c1602b.foxtrot), Db.c.blue, c0585q, 3120, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(c1602b, i4, 7);
        }
    }

    public static final void foxtrot(m mVar, C1602b c1602b, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1126160691);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(mVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(c1602b)) {
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
            T.p pVar = T.p.alpha;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar, AbstractC2094g.bravo(10)), Db.c.amber, ao.alpha), c1602b.kilo, c1602b.lima);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(4), T.d.f2062f, c0585q, 6);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            G2.bravo(mVar.alpha + " " + mVar.bravo, null, Db.c.bronze, c1602b.mike, v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 196992, 0, 131026);
            c0585q = c0585q;
            String str = null;
            String str2 = mVar.charlie;
            if (str2 != null && !StringsKt.gray(str2)) {
                str = str2;
            }
            if (str == null) {
                c0585q.purple(-712020093);
            } else {
                c0585q.purple(-712020092);
                G2.bravo(mVar.alpha + " " + str, null, Db.c.black, c1602b.november, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 384, 0, 131058);
                c0585q = c0585q;
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 17, mVar, c1602b);
        }
    }

    public static final void golf(List list, C1602b c1602b, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12 = 16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1619704109);
        if ((i4 & 6) == 0) {
            if (c0585q.india(list)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(c1602b)) {
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
            T.s bravo2 = X3.bravo(V.charlie(T.p.alpha, 1.0f), X3.alpha(c0585q), false);
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha2 = Q.alpha(AbstractC0542h.golf(c1602b.oscar), T.d.f2060c, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            c0585q.purple(-2037408988);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                foxtrot((m) it.next(), c1602b, c0585q, i5 & 112);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, i12, list, c1602b);
        }
    }

    public static final void hotel(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        T.p pVar2;
        int i11 = 8;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1874816085);
        if (c0585q.echo(i4)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i5 | 48;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            float f5 = 20;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(ac.alpha(pVar3, 4, AbstractC2094g.bravo(f5), 0L, 0L, 28), AbstractC2094g.bravo(f5)), Db.c.bronze, ao.alpha), 14, 8);
            S alpha2 = Q.alpha(AbstractC0542h.golf(6), T.d.f2061d, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            C1726f bravo2 = Z.bravo();
            long j5 = C0366t.echo;
            AbstractC0141o0.bravo(bravo2, null, V.kilo(pVar3, f5), j5, c0585q, 3504, 0);
            pVar2 = pVar3;
            G2.bravo(((Resources) c0585q.kilo(AndroidCompositionLocals_androidKt.charlie)).getQuantityString(R.plurals.scroll_more_items_below, i4, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)), null, j5, AbstractC2636d7.charlie(15), v.f1408b, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131026);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(pVar2, i4, i5, i11);
        }
    }

    public static final void india(float f5, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-998537692);
        if (c0585q.delta(f5)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float charlie2 = J4.charlie(f5, 0.0f, 1.0f);
            float f10 = 2;
            T.s alpha2 = AbstractC3087z.alpha(V.echo(sVar, 4), AbstractC2094g.bravo(f10));
            long j5 = Db.c.beige;
            an anVar = ao.alpha;
            T.s bravo2 = A0.o.bravo(androidx.compose.foundation.a.bravo(alpha2, j5, anVar), true, new b0(charlie2, new C1712d(1.0f)));
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie3);
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.charlie(pVar, charlie2).then(V.bravo), AbstractC2094g.bravo(f10)), Db.c.bronze, anVar), c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Sb.b(f5, i4, 1, sVar);
        }
    }
}
