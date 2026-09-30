package Ac;

import A0.z;
import F.AbstractC0141o0;
import F.AbstractC0148q;
import F.G2;
import F.K1;
import H0.v;
import a0.C0366t;
import a0.an;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.app.network.network.models.Shift;
import com.app.network.network.models.StartingPoint;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.Z;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.S3;
import t6.X3;

/* loaded from: classes2.dex */
public abstract class q {
    public static final long alpha = ao.delta(4280756010L);
    public static final long bravo = ao.delta(4285624698L);
    public static final long charlie = ao.delta(4292138200L);
    public static final long delta = ao.delta(4294243573L);
    public static final long echo = ao.delta(4293190887L);
    public static final long foxtrot = ao.delta(4294243573L);
    public static final long golf = ao.delta(4280756010L);
    public static final String[] hotel = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

    public static final void alpha(String str, boolean z2, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        C0585q c0585q;
        long j5;
        v vVar;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(2076093697);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q2.india(function0)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i14 & 1, z10)) {
            T.s sVar = T.p.alpha;
            float f5 = 10;
            T.s bravo2 = V.bravo(AbstractC3087z.alpha(sVar, AbstractC2094g.bravo(f5)), 80, 0.0f, 2);
            long j6 = alpha;
            if (z2) {
                j5 = j6;
            } else {
                j5 = foxtrot;
            }
            T.s bravo3 = androidx.compose.foundation.a.bravo(bravo2, j5, ao.alpha);
            if (!z2) {
                sVar = R3.charlie(sVar, 1, echo, AbstractC2094g.bravo(f5));
            }
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.echo(15, bravo3.then(sVar), null, function0, false), 16, f5);
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j7 = c0585q2.magenta;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q2, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            long charlie3 = AbstractC2636d7.charlie(14);
            if (z2) {
                vVar = v.f1409c;
            } else {
                vVar = v.yellow;
            }
            if (z2) {
                j6 = C0366t.echo;
            }
            G2.bravo(str, null, j6, charlie3, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, (i14 & 14) | 3072, 0, 131026);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f(str, z2, function0, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r8)) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final r currentFilters, List startingPoints, final Function1 onFiltersChanged, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        List list;
        T.p pVar;
        float f5;
        boolean z11;
        float f10;
        C0585q c0585q2;
        char c3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Intrinsics.echo(currentFilters, "currentFilters");
        Intrinsics.echo(startingPoints, "startingPoints");
        Intrinsics.echo(onFiltersChanged, "onFiltersChanged");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-1107164722);
        if (c0585q3.golf(currentFilters)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q3.india(startingPoints)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q3.india(onFiltersChanged)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q3.magenta(i14 & 1, z2)) {
            String allLabel = AbstractC3086y3.bravo(c0585q3, R.string.filter_all);
            String todayLabel = AbstractC3086y3.bravo(c0585q3, R.string.filter_today);
            String tomorrowLabel = AbstractC3086y3.bravo(c0585q3, R.string.filter_tomorrow);
            String bravo2 = AbstractC3086y3.bravo(c0585q3, R.string.filter_active);
            String bravo3 = AbstractC3086y3.bravo(c0585q3, R.string.filter_upcoming);
            boolean z19 = true;
            String bravo4 = AbstractC3086y3.bravo(c0585q3, R.string.filter_all_starting_points);
            boolean golf2 = c0585q3.golf(allLabel) | c0585q3.golf(todayLabel) | c0585q3.golf(tomorrowLabel);
            Object jade = c0585q3.jade();
            as asVar = C0580l.alpha;
            if (!golf2 && jade != asVar) {
                z10 = 0;
            } else {
                Intrinsics.echo(allLabel, "allLabel");
                Intrinsics.echo(todayLabel, "todayLabel");
                Intrinsics.echo(tomorrowLabel, "tomorrowLabel");
                Calendar calendar = Calendar.getInstance();
                ArrayList arrayList = new ArrayList();
                z10 = 0;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM", Locale.getDefault());
                arrayList.add(new c(allLabel, null));
                int i15 = calendar.get(7);
                int i16 = 7;
                String[] strArr = hotel;
                arrayList.add(new c(todayLabel, strArr[i15 - 1]));
                arrayList.add(new c(tomorrowLabel, strArr[i15 % 7]));
                int i17 = 2;
                while (true) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.add(6, i17);
                    int i18 = calendar2.get(i16) - 1;
                    String format = simpleDateFormat.format(calendar2.getTime());
                    Intrinsics.delta(format, "format(...)");
                    arrayList.add(new c(format, strArr[i18]));
                    if (i17 == 6) {
                        break;
                    }
                    i17++;
                    i16 = 7;
                }
                c0585q3.f(arrayList);
                jade = arrayList;
            }
            List<c> list2 = (List) jade;
            Pair pair = new Pair(s.alpha, allLabel);
            Pair pair2 = new Pair(s.purple, bravo2);
            Pair pair3 = new Pair(s.red, bravo3);
            Pair[] pairArr = new Pair[3];
            pairArr[z10] = pair;
            pairArr[1] = pair2;
            pairArr[2] = pair3;
            List listOf = CollectionsKt.listOf(pairArr);
            T.p pVar2 = T.p.alpha;
            float f11 = 12;
            T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.a.bravo(V.charlie(pVar2, 1.0f), C0366t.echo, ao.alpha), 0.0f, f11, 0.0f, f11, 5);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), T.d.f2062f, c0585q3, 6);
            long j5 = c0585q3.magenta;
            int i19 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q3.mike();
            T.s charlie2 = T.a.charlie(whiskey, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q3, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q3, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q3.lime) {
                list = listOf;
            } else {
                list = listOf;
            }
            ad.blue(i19, c0585q3, i19, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q3, charlie2);
            float f12 = 16;
            T.s uniform = AbstractC0538d.uniform(X3.bravo(pVar2, X3.alpha(c0585q3), z10), f12, 0.0f, 2);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), T.d.f2061d, c0585q3, 54);
            long j6 = c0585q3.magenta;
            int i20 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q3.mike();
            T.s charlie3 = T.a.charlie(uniform, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i, c0585q3, alpha3);
            C0564b.blue(c2549i2, c0585q3, mike2);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i20))) {
                ad.blue(i20, c0585q3, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q3, charlie3);
            c0585q3.purple(-1115162560);
            for (c cVar : list2) {
                String str = cVar.alpha;
                boolean areEqual = Intrinsics.areEqual(currentFilters.alpha.bravo, cVar.bravo);
                if ((i14 & 896) == 256) {
                    z16 = z19;
                } else {
                    z16 = false;
                }
                if ((i14 & 14) == 4) {
                    z17 = z19;
                } else {
                    z17 = false;
                }
                boolean golf3 = z16 | z17 | c0585q3.golf(cVar);
                Object jade2 = c0585q3.jade();
                if (!golf3 && jade2 != asVar) {
                    z18 = z19;
                } else {
                    z18 = z19;
                    jade2 = new l(onFiltersChanged, currentFilters, cVar, z18 ? 1 : 0);
                    c0585q3.f(jade2);
                }
                alpha(str, areEqual, (Function0) jade2, c0585q3, 0);
                z19 = z18;
            }
            c0585q3.quebec(false);
            c0585q3.quebec(z19);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : startingPoints) {
                StartingPoint startingPoint = (StartingPoint) obj;
                if (startingPoint.getName() != null && startingPoint.getId() != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                c0585q3.purple(-2011942217);
                if ((i14 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i14 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z20 = z13 | z14;
                Object jade3 = c0585q3.jade();
                if (!z20 && jade3 != asVar) {
                    z15 = false;
                } else {
                    z15 = false;
                    final boolean z21 = false ? 1 : 0;
                    jade3 = new Function1() { // from class: Ac.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (z21) {
                                case 0:
                                    onFiltersChanged.invoke(r.alpha(currentFilters, null, (Long) obj2, null, 5));
                                    return Unit.INSTANCE;
                                default:
                                    s it = (s) obj2;
                                    Intrinsics.echo(it, "it");
                                    onFiltersChanged.invoke(r.alpha(currentFilters, null, null, it, 3));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    c0585q3.f(jade3);
                }
                Function1 function1 = (Function1) jade3;
                pVar = pVar2;
                C0585q c0585q4 = c0585q3;
                f10 = 0.0f;
                f5 = f12;
                delta(arrayList2, currentFilters.bravo, bravo4, function1, AbstractC0538d.uniform(pVar, f12, 0.0f, 2), c0585q4, 24576);
                z11 = z15;
                c0585q2 = c0585q4;
            } else {
                pVar = pVar2;
                f5 = f12;
                C0585q c0585q5 = c0585q3;
                z11 = false;
                f10 = 0.0f;
                c0585q5.purple(-2026296054);
                c0585q2 = c0585q5;
            }
            c0585q2.quebec(z11);
            if ((i14 & 896) == 256) {
                c3 = 1;
            } else {
                c3 = z11 ? 1 : 0;
            }
            ?? r02 = z11;
            if ((i14 & 14) == 4) {
                r02 = 1;
            }
            int i21 = r02 | c3;
            Object jade4 = c0585q2.jade();
            if (i21 == 0 && jade4 != asVar) {
                z12 = true;
            } else {
                z12 = true;
                final boolean z22 = true ? 1 : 0;
                jade4 = new Function1() { // from class: Ac.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (z22) {
                            case 0:
                                onFiltersChanged.invoke(r.alpha(currentFilters, null, (Long) obj2, null, 5));
                                return Unit.INSTANCE;
                            default:
                                s it = (s) obj2;
                                Intrinsics.echo(it, "it");
                                onFiltersChanged.invoke(r.alpha(currentFilters, null, null, it, 3));
                                return Unit.INSTANCE;
                        }
                    }
                };
                c0585q2.f(jade4);
            }
            C0585q c0585q6 = c0585q2;
            echo(currentFilters.charlie, list, (Function1) jade4, AbstractC0538d.uniform(pVar, f5, f10, 2), c0585q6, 3072);
            c0585q = c0585q6;
            c0585q.quebec(z12);
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new n(currentFilters, startingPoints, onFiltersChanged, i4, 0);
        }
    }

    public static final void charlie(Shift shift, Function0 onLocationClick, Function0 onBookShiftClick, Function0 onShiftRulesClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        Intrinsics.echo(onLocationClick, "onLocationClick");
        Intrinsics.echo(onBookShiftClick, "onBookShiftClick");
        Intrinsics.echo(onShiftRulesClick, "onShiftRulesClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-763703772);
        if (c0585q.india(shift)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.india(onLocationClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(onBookShiftClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.india(onShiftRulesClick)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            float f5 = 16;
            float f10 = 0;
            K1.charlie(AbstractC0538d.tango(V.charlie(T.p.alpha, 1.0f), f5, 8), AbstractC2094g.bravo(f5), K1.lima(C0366t.echo, c0585q, 6), K1.mike(f10, 62), S3.alpha(f10, C0366t.juliet), P.e.echo(1495182486, new d(shift, onShiftRulesClick, onLocationClick, onBookShiftClick, 0), c0585q), c0585q, 221190, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(shift, onLocationClick, onBookShiftClick, onShiftRulesClick, i4, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0097, code lost:
    
        if (r6 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(ArrayList arrayList, Long l10, String str, Function1 function1, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        char c3;
        Object obj;
        String name;
        long j5;
        ax axVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(471816076);
        if (c0585q.india(arrayList)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.golf(l10)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.golf(str)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.india(function1)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            T.p pVar = T.p.alpha;
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade);
            }
            ax axVar2 = (ax) jade;
            if (l10 == null) {
                c3 = ' ';
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        c3 = ' ';
                        if (Intrinsics.areEqual(((StartingPoint) obj).getId(), l10)) {
                            break;
                        }
                    } else {
                        c3 = ' ';
                        obj = null;
                        break;
                    }
                }
                StartingPoint startingPoint = (StartingPoint) obj;
                if (startingPoint != null) {
                    name = startingPoint.getName();
                }
            }
            name = str;
            T.s charlie2 = V.charlie(sVar, 1.0f);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q.magenta;
            int i17 = (int) (j6 ^ (j6 >>> c3));
            I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            float f5 = 12;
            T.s alpha2 = AbstractC3087z.alpha(V.golf(V.charlie(pVar, 1.0f), 44, 0.0f, 2), AbstractC2094g.bravo(f5));
            long j7 = C0366t.echo;
            an anVar = ao.alpha;
            String str2 = name;
            T.s charlie4 = R3.charlie(androidx.compose.foundation.a.bravo(alpha2, j7, anVar), 1, echo, AbstractC2094g.bravo(f5));
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new o(axVar2, 0);
                c0585q.f(jade2);
            }
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.echo(15, charlie4, null, (Function0) jade2, false), 16, 0.0f, 2);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q, 54);
            long j10 = c0585q.magenta;
            int i18 = (int) (j10 ^ (j10 >>> c3));
            I mike2 = c0585q.mike();
            T.s charlie5 = T.a.charlie(uniform, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                ad.blue(i18, c0585q, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            long charlie6 = AbstractC2636d7.charlie(14);
            v vVar = v.yellow;
            if (l10 == null) {
                j5 = bravo;
            } else {
                j5 = alpha;
            }
            G2.bravo(str2, null, j5, charlie6, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 199680, 0, 131026);
            AbstractC0141o0.bravo(Z.bravo(), null, null, alpha, c0585q, 3120, 4);
            c0585q.quebec(true);
            boolean booleanValue = ((Boolean) axVar2.getValue()).booleanValue();
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                axVar = axVar2;
                jade3 = new o(axVar, 1);
                c0585q.f(jade3);
            } else {
                axVar = axVar2;
            }
            AbstractC0148q.alpha(booleanValue, (Function0) jade3, androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), j7, anVar), 0L, null, null, null, 0L, 0.0f, 0.0f, P.e.echo(598199937, new d(function1, arrayList, str, axVar, 1), c0585q), c0585q, 432, 2040);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new e(arrayList, l10, str, function1, sVar, i4, 0);
        }
    }

    public static final void echo(s sVar, List list, Function1 function1, T.s sVar2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        long j5;
        boolean z11;
        v vVar;
        long j6;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-352055995);
        if (c0585q2.echo(sVar.ordinal())) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.india(list)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q2.india(function1)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 1.0f;
            T.s alpha2 = AbstractC3087z.alpha(V.charlie(sVar2, 1.0f), AbstractC2094g.bravo(12));
            an anVar = ao.alpha;
            T.s sierra = AbstractC0538d.sierra(V.golf(androidx.compose.foundation.a.bravo(alpha2, foxtrot, anVar), 44, 0.0f, 2), 4);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j7 = c0585q2.magenta;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q2, i15, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            T.s charlie3 = V.charlie(pVar, 1.0f);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 0);
            long j10 = c0585q2.magenta;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            I mike2 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q2, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie4);
            c0585q2.purple(1741227593);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                s sVar3 = (s) pair.first;
                String str = (String) pair.second;
                if (sVar == sVar3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f5 <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                T.s alpha4 = AbstractC3087z.alpha(V.golf(new LayoutWeightElement(f5, true), 36, 0.0f, 2), AbstractC2094g.bravo(10));
                if (z10) {
                    j5 = C0366t.echo;
                } else {
                    j5 = C0366t.juliet;
                }
                T.s bravo2 = androidx.compose.foundation.a.bravo(alpha4, j5, anVar);
                if ((i14 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean echo2 = c0585q2.echo(sVar3.ordinal()) | z11;
                Object jade = c0585q2.jade();
                if (echo2 || jade == C0580l.alpha) {
                    jade = new g(0, function1, sVar3);
                    c0585q2.f(jade);
                }
                T.s echo3 = androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false);
                ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                long j11 = c0585q2.magenta;
                int i17 = (int) (j11 ^ (j11 >>> 32));
                I mike3 = c0585q2.mike();
                T.s charlie5 = T.a.charlie(echo3, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j2);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, delta3);
                C0564b.blue(C2551k.echo, c0585q2, mike3);
                C2549i c2549i5 = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                    ad.blue(i17, c0585q2, i17, c2549i5);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie5);
                long charlie6 = AbstractC2636d7.charlie(14);
                if (z10) {
                    vVar = v.f1408b;
                } else {
                    vVar = v.yellow;
                }
                v vVar2 = vVar;
                if (z10) {
                    j6 = alpha;
                } else {
                    j6 = bravo;
                }
                C0585q c0585q3 = c0585q2;
                G2.bravo(str, null, j6, charlie6, vVar2, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 3072, 0, 131026);
                c0585q3.quebec(true);
                c0585q2 = c0585q3;
                f5 = 1.0f;
                anVar = anVar;
            }
            c0585q = c0585q2;
            z.papa(c0585q, false, true, true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(sVar, list, function1, sVar2, i4, 0);
        }
    }
}
