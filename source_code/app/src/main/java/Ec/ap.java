package Ec;

import F.AbstractC0141o0;
import F.G1;
import F.G2;
import F.K1;
import F.O;
import F.S2;
import F.T2;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.app.network.network.models.ShiftSummary;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import g0.C1726f;
import i.AbstractC1876y;
import i.C1874w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2620c0;
import s6.AbstractC2634d5;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.Z;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;

/* loaded from: classes2.dex */
public abstract class ap {
    public static final long alpha = a0.ao.delta(4294938634L);
    public static final long bravo = a0.ao.delta(4282090230L);
    public static final long charlie = a0.ao.delta(4289222135L);
    public static final long delta = a0.ao.delta(4279673674L);
    public static final long echo = a0.ao.delta(4292617766L);
    public static final long foxtrot = a0.ao.delta(4279673674L);
    public static final long golf = a0.ao.delta(4293983732L);
    public static final long hotel = a0.ao.delta(4280468830L);
    public static final long india = a0.ao.delta(4294243573L);
    public static final long juliet = a0.ao.delta(4294243573L);
    public static final long kilo = a0.ao.delta(4292138200L);
    public static final long lima = a0.ao.delta(4280756010L);
    public static final long mike = a0.ao.delta(4285624698L);

    public static final void alpha(String str, String str2, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-357596421);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.golf(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q2.golf(sVar)) {
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
        if (c0585q2.magenta(i14 & 1, z2)) {
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(4), T.d.f2063g, c0585q2, 54);
            long j5 = c0585q2.magenta;
            int i15 = (int) ((j5 >>> 32) ^ j5);
            I mike2 = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
            C0564b.blue(C2551k.echo, c0585q2, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q2, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            G2.bravo(str, null, lima, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(0L, AbstractC2636d7.charlie(16), H0.v.f1409c, null, null, 0L, 0, 0L, 0, 16777209), c0585q2, (i14 & 14) | 384, 1572864, 65018);
            G2.bravo(str2, null, mike, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q2.kilo(T2.alpha)).lima, 0L, AbstractC2636d7.charlie(12), null, null, 0L, 0, 0L, null, null, 16777213), c0585q2, ((i14 >> 3) & 14) | 384, 0, 65018);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(str, str2, sVar, i4, 1);
        }
    }

    public static final void bravo(ShiftSummary shiftSummary, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C2550j c2550j;
        C2549i c2549i;
        int i11;
        String amber;
        String str;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1819153467);
        if (c0585q.india(shiftSummary)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            C0540f golf2 = AbstractC0542h.golf(8);
            T.p pVar = T.p.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q, alpha2);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q, mike2);
            C2549i c2549i4 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i4);
            }
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q, charlie2);
            T.j jVar = T.d.f2061d;
            float f5 = 4;
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), jVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i14 = (int) (j6 ^ (j6 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha3);
            C0564b.blue(c2549i3, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie3);
            String branchName = shiftSummary.getBranchName();
            if (Intrinsics.areEqual(branchName, "-")) {
                branchName = null;
            }
            if (branchName == null) {
                branchName = shiftSummary.getZoneName();
                if (Intrinsics.areEqual(branchName, "-")) {
                    branchName = null;
                }
                if (branchName == null) {
                    branchName = "-";
                }
            }
            G2.bravo(branchName, null, lima, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(0L, AbstractC2636d7.charlie(16), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777177), c0585q, 384, 0, 65530);
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(pVar, golf, AbstractC2094g.bravo(100)), 6, 3);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j7 = c0585q.magenta;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            I mike4 = c0585q.mike();
            T.s charlie4 = T.a.charlie(tango, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c2550j = c2550j2;
                c0585q.lima(c2550j);
            } else {
                c2550j = c2550j2;
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, delta2);
            C0564b.blue(c2549i3, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                c2549i = c2549i4;
                ao.ad.blue(i15, c0585q, i15, c2549i);
            } else {
                c2549i = c2549i4;
            }
            C0564b.blue(c2549i5, c0585q, charlie4);
            String status = shiftSummary.getStatus();
            if (status != null) {
                if (status.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String valueOf = String.valueOf(status.charAt(0));
                    Intrinsics.charlie(valueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = valueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                    sb2.append((Object) upperCase);
                    String substring = status.substring(1);
                    Intrinsics.delta(substring, "substring(...)");
                    sb2.append(substring);
                    status = sb2.toString();
                }
            } else {
                status = null;
            }
            if (status == null) {
                i11 = 0;
                status = Q0.c.oscar(c0585q, -215432579, R.string.completed, c0585q, false);
            } else {
                i11 = 0;
                c0585q.purple(-215435028);
                c0585q.quebec(false);
            }
            long charlie5 = AbstractC2636d7.charlie(14);
            H0.i[] iVarArr = new H0.i[1];
            iVarArr[i11] = AbstractC2715m5.alpha(R.font.circularstd, null, i11, 14);
            C2549i c2549i6 = c2549i;
            C2550j c2550j3 = c2550j;
            G2.bravo(status, null, hotel, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(0L, charlie5, new H0.v(700), null, new H0.n(ArraysKt.sierra(iVarArr)), 0L, 2, 0L, 0, 16744409), c0585q, 384, 0, 65530);
            c0585q.quebec(true);
            c0585q.quebec(true);
            S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), jVar, c0585q, 54);
            long j10 = c0585q.magenta;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            I mike5 = c0585q.mike();
            T.s charlie6 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j3);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha4);
            C0564b.blue(c2549i3, c0585q, mike5);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i6);
            }
            C0564b.blue(c2549i5, c0585q, charlie6);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_shift_calendar, c0585q, 6), null, V.kilo(pVar, 16), C0366t.kilo, c0585q, 3504, 0);
            String todayLabel = AbstractC3086y3.bravo(c0585q, R.string.today);
            String yesterdayLabel = AbstractC3086y3.bravo(c0585q, R.string.yesterday);
            Intrinsics.echo(todayLabel, "todayLabel");
            Intrinsics.echo(yesterdayLabel, "yesterdayLabel");
            Date shiftStartedAt = shiftSummary.getShiftStartedAt();
            if (shiftStartedAt == null && (shiftStartedAt = shiftSummary.getCreatedAt()) == null) {
                str = "-";
            } else {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(shiftStartedAt);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.add(6, -1);
                if (calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                    if (calendar3.get(1) == calendar2.get(1) && calendar3.get(6) == calendar2.get(6)) {
                        todayLabel = yesterdayLabel;
                    } else {
                        todayLabel = null;
                    }
                }
                String format = new SimpleDateFormat("d MMM", Locale.getDefault()).format(shiftStartedAt);
                String format2 = new SimpleDateFormat("hh:mm aa", Locale.getDefault()).format(shiftStartedAt);
                Intrinsics.delta(format2, "format(...)");
                String upperCase2 = format2.toUpperCase(Locale.ROOT);
                Intrinsics.delta(upperCase2, "toUpperCase(...)");
                if (todayLabel != null) {
                    amber = todayLabel + " " + format + ", " + upperCase2;
                } else {
                    amber = ao.ad.amber(format, ", ", upperCase2);
                }
                str = amber;
            }
            G2.bravo(str, null, mike, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(0L, AbstractC2636d7.charlie(12), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777177), c0585q, 384, 0, 65530);
            c0585q = c0585q;
            i10 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            i10 = 1;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(shiftSummary, i4, i10);
        }
    }

    public static final void charlie(ShiftSummary shiftSummary, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        String str;
        String str2;
        String str3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-692658649);
        if (c0585q.india(shiftSummary)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            float f5 = 12;
            C0540f golf2 = AbstractC0542h.golf(f5);
            T.p pVar = T.p.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.delivery_performance), null, lima, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(T2.alpha)).hotel, 0L, AbstractC2636d7.charlie(14), H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777209), c0585q, 384, 0, 65530);
            c0585q = c0585q;
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            long j6 = juliet;
            T.s sierra = AbstractC0538d.sierra(R3.charlie(V.charlie(pVar, 1.0f), 1, j6, bravo2), f5);
            B b2 = B.alpha;
            T.s november = AbstractC0538d.november(sierra);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.foxtrot, T.d.f2061d, c0585q, 54);
            long j7 = c0585q.magenta;
            int i12 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            String quebec = quebec(shiftSummary.getPickupOnTimePercentage());
            String pickupCounts = shiftSummary.getPickupCounts();
            if (pickupCounts == null) {
                str = "-";
            } else {
                str = pickupCounts;
            }
            delta(quebec, str, AbstractC3086y3.bravo(c0585q, R.string.summary_pick_up), alpha, P0.maroon(1.0f), c0585q, 3072);
            FillElement fillElement = V.bravo;
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            String quebec2 = quebec(shiftSummary.getDeliveryOnTimePercentage());
            String deliveryCounts = shiftSummary.getDeliveryCounts();
            if (deliveryCounts == null) {
                str2 = "-";
            } else {
                str2 = deliveryCounts;
            }
            delta(quebec2, str2, AbstractC3086y3.bravo(c0585q, R.string.summary_delivery), bravo, P0.maroon(1.0f), c0585q, 3072);
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            String quebec3 = quebec(shiftSummary.getReturningOnTimePercentage());
            String returningCounts = shiftSummary.getReturningCounts();
            if (returningCounts == null) {
                str3 = "-";
            } else {
                str3 = returningCounts;
            }
            delta(quebec3, str3, AbstractC3086y3.bravo(c0585q, R.string.summary_return), charlie, P0.maroon(1.0f), c0585q, 3072);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(shiftSummary, i4, 3);
        }
    }

    public static final void delta(final String str, final String str2, final String str3, final long j5, final T.s sVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1068515008);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q2.golf(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q2.golf(str3)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q2.golf(sVar)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i16 = i15 | i12;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(4), T.d.f2063g, c0585q2, 54);
            long j6 = c0585q2.magenta;
            int i17 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
            C0564b.blue(C2551k.echo, c0585q2, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q2, i17, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            D0.d dVar = new D0.d();
            int echo2 = dVar.echo(new D0.af(j5, AbstractC2636d7.charlie(16), H0.v.f1409c, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (a0.ar) null, 65528));
            try {
                dVar.bravo(str + " ");
                dVar.delta(echo2);
                long charlie3 = AbstractC2636d7.charlie(10);
                long j7 = mike;
                echo2 = dVar.echo(new D0.af(j7, charlie3, (H0.v) null, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (a0.ar) null, 65532));
                try {
                    dVar.bravo(str2);
                    dVar.delta(echo2);
                    G2.charlie(dVar.foxtrot(), null, 0L, 0L, null, null, null, 0L, null, new O0.k(3), 0L, 0, false, 0, 0, null, null, null, c0585q2, 0, 261630);
                    G2.bravo(str3, null, j7, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q2.kilo(T2.alpha)).lima, 0L, AbstractC2636d7.charlie(12), null, null, 0L, 0, 0L, null, null, 16777213), c0585q2, ((i16 >> 6) & 14) | 384, 0, 65018);
                    c0585q = c0585q2;
                    c0585q.quebec(true);
                } finally {
                }
            } finally {
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(str, str2, str3, j5, sVar, i4) { // from class: Ec.y
                public final /* synthetic */ String alpha;
                public final /* synthetic */ String purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ long silver;
                public final /* synthetic */ T.s teal;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(3073);
                    String str4 = this.purple;
                    long j10 = this.silver;
                    T.s sVar2 = this.teal;
                    ap.delta(this.alpha, str4, this.red, j10, sVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void echo(T.s sVar, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str2;
        int i11;
        int i12;
        boolean z2;
        String str3;
        String str4;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1530418301);
        if (c0585q.golf(sVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i4;
        int i14 = i5 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
            str2 = str;
        } else {
            str2 = str;
            if (c0585q.golf(str2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 = i13 | i11;
        }
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            if (i14 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i15 = (int) ((j5 >>> 32) ^ j5);
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            if (str3 == null) {
                str4 = Q0.c.oscar(c0585q, -1487346695, R.string.no_shifts, c0585q, false);
            } else {
                c0585q.purple(-1487346943);
                c0585q.quebec(false);
                str4 = str3;
            }
            G2.bravo(str4, null, ((O) c0585q.kilo(F.Q.alpha)).sierra, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(T2.alpha)).juliet, c0585q, 0, 0, 65018);
            c0585q = c0585q;
            c0585q.quebec(true);
            str2 = str3;
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, i5, sVar, str2);
        }
    }

    public static final void foxtrot(final List list, boolean z2, final boolean z10, Function0 function0, final Function0 function02, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        boolean z11;
        boolean z12;
        Function0 function03;
        int i11;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1000926390);
        if (c0585q.india(list)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i5 | i4;
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i14 |= i13;
        }
        if (c0585q.hotel(z10)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i15 = i14 | i10;
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function0)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i15 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(function02)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        boolean z13 = true;
        if ((i15 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i15 & 1, z11)) {
            C1874w alpha2 = AbstractC1876y.alpha(c0585q);
            boolean golf2 = c0585q.golf(alpha2);
            if ((57344 & i15) != 16384) {
                z13 = false;
            }
            boolean z14 = golf2 | z13;
            Object jade = c0585q.jade();
            if (z14 || jade == C0580l.alpha) {
                jade = new ao(alpha2, function02, null);
                c0585q.f(jade);
            }
            C0564b.foxtrot((Xd.l) jade, c0585q, alpha2);
            z12 = z2;
            function03 = function0;
            G.l.alpha(z12, function03, V.charlie, null, null, null, P.e.echo(-1776565724, new ab(alpha2, list, z10, 0), c0585q), c0585q, ((i15 >> 3) & 14) | 1573248 | ((i15 >> 6) & 112));
        } else {
            z12 = z2;
            function03 = function0;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final boolean z15 = z12;
            final Function0 function04 = function03;
            uniform.delta = new Xd.l() { // from class: Ec.ac
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    Function0 function05 = function04;
                    Function0 function06 = function02;
                    ap.foxtrot(list, z15, z10, function05, function06, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void golf(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-169314334);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.s uniform = AbstractC0538d.uniform(V.charlie(T.p.alpha, 1.0f), 0.0f, 4, 1);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(12), T.d.f2061d, c0585q, 54);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(uniform, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            T.s maroon = P0.maroon(1.0f);
            long j6 = juliet;
            K1.echo(maroon, 0.0f, j6, c0585q, 384, 2);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(az.alpha, AbstractC2636d7.charlie(16), new H0.v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, i10 & 14, 0, 65534);
            c0585q = c0585q;
            K1.echo(P0.maroon(1.0f), 0.0f, j6, c0585q, 384, 2);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Ac.i(str, i4, 3);
        }
    }

    public static final void hotel(boolean z2, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z10;
        String oscar;
        C1726f bravo2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1967901288);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i12 & 1, z10)) {
            T.p pVar = T.p.alpha;
            float f5 = 12;
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.echo(15, AbstractC3087z.alpha(R3.charlie(V.echo(V.charlie(pVar, 1.0f), 44), 1, kilo, AbstractC2094g.bravo(f5)), AbstractC2094g.bravo(f5)), null, function0, false), 16, 0.0f, 2);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(uniform, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            if (z2) {
                oscar = Q0.c.oscar(c0585q, 1822068493, R.string.hide_performance, c0585q, false);
            } else {
                oscar = Q0.c.oscar(c0585q, 1822070381, R.string.view_performance, c0585q, false);
            }
            D0.an alpha3 = D0.an.alpha(((S2) c0585q.kilo(T2.alpha)).golf, 0L, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777209);
            long j6 = lima;
            G2.bravo(oscar, null, j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, alpha3, c0585q, 384, 0, 65530);
            c0585q = c0585q;
            AbstractC0538d.echo(V.oscar(pVar, 4), c0585q);
            if (z2) {
                bravo2 = AbstractC2620c0.bravo();
            } else {
                bravo2 = Z.bravo();
            }
            AbstractC0141o0.bravo(bravo2, null, V.kilo(pVar, 22), j6, c0585q, 3504, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new x(z2, function0, i4, 0);
        }
    }

    public static final void india(String str, String str2, long j5, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1708311814);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.golf(str2)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i13 = i12 | i10;
        if (c0585q.golf(sVar)) {
            i11 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i11 = 8192;
        }
        int i14 = i13 | i11;
        if ((i14 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(4), T.d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            D0.d dVar = new D0.d();
            int echo2 = dVar.echo(new D0.af(j5, AbstractC2636d7.charlie(16), H0.v.f1409c, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (a0.ar) null, 65528));
            try {
                dVar.bravo(str + " ");
                dVar.delta(echo2);
                long charlie3 = AbstractC2636d7.charlie(10);
                long j7 = mike;
                echo2 = dVar.echo(new D0.af(j7, charlie3, (H0.v) null, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (a0.ar) null, 65532));
                try {
                    dVar.bravo("");
                    dVar.delta(echo2);
                    G2.charlie(dVar.foxtrot(), null, 0L, 0L, null, null, null, 0L, null, new O0.k(3), 0L, 0, false, 0, 0, null, null, null, c0585q, 0, 261630);
                    G2.bravo(str2, null, j7, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(T2.alpha)).lima, 0L, AbstractC2636d7.charlie(12), null, null, 0L, 0, 0L, null, null, 16777213), c0585q, ((i14 >> 6) & 14) | 384, 0, 65018);
                    c0585q.quebec(true);
                } finally {
                }
            } finally {
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new am(str, str2, j5, sVar, i4);
        }
    }

    public static final void juliet(Dc.k uiState, boolean z2, Function0 onRefresh, Function0 onLoadMore, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(uiState, "uiState");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onLoadMore, "onLoadMore");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1757080809);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(uiState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(onRefresh)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onLoadMore)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            if (uiState instanceof Dc.i) {
                c0585q.purple(-1866759568);
                FillElement fillElement = V.charlie;
                q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                long j5 = c0585q.magenta;
                int i14 = (int) (j5 ^ (j5 >>> 32));
                I mike2 = c0585q.mike();
                T.s charlie2 = T.a.charlie(fillElement, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta2);
                C0564b.blue(C2551k.echo, c0585q, mike2);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                    ao.ad.blue(i14, c0585q, i14, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                G1.bravo(null, mike, 0.0f, 0L, 0, c0585q, 48, 29);
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.h) {
                c0585q.purple(-1866544552);
                int i15 = i5 >> 3;
                G.l.alpha(z2, onRefresh, V.charlie, null, null, null, P.e.echo(-1164852252, new Cb.d(2, uiState), c0585q), c0585q, (i15 & 112) | (i15 & 14) | 1573248);
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.g) {
                c0585q.purple(-1866124502);
                int i16 = i5 >> 3;
                G.l.alpha(z2, onRefresh, V.charlie, null, null, null, t.juliet, c0585q, (i16 & 14) | 1573248 | (i16 & 112));
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.j) {
                c0585q.purple(-1865782355);
                Dc.j jVar = (Dc.j) uiState;
                int i17 = i5 & 112;
                int i18 = i5 << 3;
                foxtrot(jVar.alpha, z2, jVar.charlie, onRefresh, onLoadMore, c0585q, i17 | (i18 & 7168) | (i18 & 57344));
                c0585q.quebec(false);
            } else {
                throw ao.ad.black(c0585q, 632517868, false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(uiState, z2, onRefresh, onLoadMore, i4, 0);
        }
    }

    public static final void kilo(final ShiftSummary shiftSummary, final boolean z2, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(677243926);
        if (c0585q.india(shiftSummary)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i4;
        int i13 = i5 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i12 & 1, z10)) {
            if (i13 != 0) {
                z2 = false;
            }
            Object[] objArr = new Object[0];
            if ((i12 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade = c0585q.jade();
            if (z11 || jade == C0580l.alpha) {
                jade = new ae(0, z2);
                c0585q.f(jade);
            }
            float f5 = 16;
            K1.charlie(R3.charlie(V.charlie(T.p.alpha, 1.0f), 1, juliet, AbstractC2094g.bravo(f5)), AbstractC2094g.bravo(f5), K1.lima(C0366t.echo, c0585q, 6), K1.mike(2, 62), null, P.e.echo(978834276, new af(0, shiftSummary, (androidx.compose.runtime.ax) R.l.echo(objArr, (Function0) jade, c0585q, 0)), c0585q), c0585q, 196608, 16);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Ec.ag
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    ap.kilo(ShiftSummary.this, z2, (InterfaceC0581m) obj, cyan, i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void lima(int i4, int i5, long j5, T.s sVar, InterfaceC0581m interfaceC0581m, String str, String str2) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1070444972);
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i10 | i5;
        if (c0585q.golf(str2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if ((i5 & 3072) == 0) {
            if (c0585q.foxtrot(j5)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i16 |= i14;
        }
        if (c0585q.golf(sVar)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i17 = i16 | i12;
        if ((i17 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i17 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 4;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i18 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                ao.ad.blue(i18, c0585q, i18, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), T.d.f2061d, c0585q, 54);
            long j7 = c0585q.magenta;
            int i19 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                ao.ad.blue(i19, c0585q, i19, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            i13 = i4;
            AbstractC1680b charlie4 = AbstractC3076w3.charlie(i13, c0585q, 6);
            T.s kilo2 = V.kilo(pVar, 12);
            long j10 = mike;
            AbstractC0141o0.alpha(charlie4, null, kilo2, j10, c0585q, 3504, 0);
            int i20 = i17 >> 3;
            G2.bravo(str, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(0L, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777177), c0585q, (i20 & 14) | 384, 3072, 57338);
            c0585q.quebec(true);
            G2.bravo(str2, null, j5, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(0L, AbstractC2636d7.charlie(18), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744409), c0585q, ((i17 >> 6) & 14) | (i20 & 896), 0, 65018);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            i13 = i4;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ak(i13, i5, j5, sVar, str, str2);
        }
    }

    public static final void mike(ShiftSummary shiftSummary, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        String str;
        boolean z10;
        String str2;
        String str3;
        String str4;
        BigDecimal stripTrailingZeros;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(37748256);
        if (c0585q.india(shiftSummary)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.currency_sar);
            T.p pVar = T.p.alpha;
            T.s charlie2 = V.charlie(pVar, 1.0f);
            float f5 = 12;
            C2093f bravo3 = AbstractC2094g.bravo(f5);
            long j5 = india;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(charlie2, j5, bravo3), f5);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            T.s charlie4 = V.charlie(pVar, 1.0f);
            long j7 = C0366t.echo;
            float f10 = 6;
            float f11 = 8;
            T.s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(charlie4, j7, AbstractC2094g.bravo(f10)), f11);
            B b2 = B.alpha;
            T.s november = AbstractC0538d.november(sierra2);
            T.j jVar = T.d.f2061d;
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 48);
            long j10 = c0585q.magenta;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.shift_summary_delivered_orders);
            Integer totalDeliveredOrders = shiftSummary.getTotalDeliveredOrders();
            if (totalDeliveredOrders == null || (str = totalDeliveredOrders.toString()) == null) {
                str = "-";
            }
            T.s maroon = P0.maroon(1.0f);
            long j11 = lima;
            lima(R.drawable.ic_shift_delivered, 3078, j11, maroon, c0585q, bravo4, str);
            FillElement fillElement = V.bravo;
            K1.kilo(fillElement, 0.0f, j5, c0585q, 390);
            String bravo5 = AbstractC3086y3.bravo(c0585q, R.string.shift_summary_earnings);
            String earnings = shiftSummary.getEarnings();
            if (!Intrinsics.areEqual(earnings, "-")) {
                earnings = ao.ad.amber(earnings, " ", bravo2);
            }
            lima(R.drawable.ic_shift_earnings, 6, Db.c.peach, P0.maroon(1.0f), c0585q, bravo5, earnings);
            c0585q = c0585q;
            Double totalCollectedCash = shiftSummary.getTotalCollectedCash();
            if (totalCollectedCash == null || totalCollectedCash.doubleValue() == 0.0d) {
                z10 = false;
                c0585q.purple(-1492404772);
            } else {
                c0585q.purple(-1477661451);
                K1.kilo(fillElement, 0.0f, j5, c0585q, 390);
                String bravo6 = AbstractC3086y3.bravo(c0585q, R.string.total_collected_cash);
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(totalCollectedCash.doubleValue()));
                if (bigDecimal.signum() == 0) {
                    stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    stripTrailingZeros = bigDecimal.stripTrailingZeros();
                }
                String plainString = stripTrailingZeros.toPlainString();
                Intrinsics.delta(plainString, "toPlainString(...)");
                if (!Intrinsics.areEqual(plainString, "-")) {
                    plainString = ao.ad.amber(plainString, " ", bravo2);
                }
                lima(R.drawable.ic_shift_cash, 3078, j11, P0.maroon(1.0f), c0585q, bravo6, plainString);
                c0585q = c0585q;
                z10 = false;
            }
            c0585q.quebec(z10);
            c0585q.quebec(true);
            T.s november2 = AbstractC0538d.november(AbstractC0538d.tango(androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), j7, AbstractC2094g.bravo(f10)), 4, f11));
            S alpha4 = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 48);
            long j12 = c0585q.magenta;
            int i13 = (int) (j12 ^ (j12 >>> 32));
            I mike4 = c0585q.mike();
            T.s charlie6 = T.a.charlie(november2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            String bravo7 = AbstractC3086y3.bravo(c0585q, R.string.shift_starts_time);
            Date shiftStartedAt = shiftSummary.getShiftStartedAt();
            if (shiftStartedAt == null) {
                str2 = "-";
            } else {
                str2 = AbstractC2634d5.delta(shiftStartedAt);
            }
            oscar(R.drawable.ic_shift_timer, bravo7, str2, P0.maroon(1.0f), c0585q, 6);
            K1.kilo(fillElement, 0.0f, j5, c0585q, 390);
            String bravo8 = AbstractC3086y3.bravo(c0585q, R.string.shift_ends);
            Date shiftCompletedAt = shiftSummary.getShiftCompletedAt();
            if (shiftCompletedAt == null) {
                str3 = "-";
            } else {
                str3 = AbstractC2634d5.delta(shiftCompletedAt);
            }
            oscar(R.drawable.ic_shift_timer_end, bravo8, str3, P0.maroon(1.0f), c0585q, 6);
            K1.kilo(fillElement, 0.0f, j5, c0585q, 390);
            String bravo9 = AbstractC3086y3.bravo(c0585q, R.string.started_at);
            Date firstInAreaAt = shiftSummary.getFirstInAreaAt();
            if (firstInAreaAt == null) {
                str4 = "-";
            } else {
                str4 = AbstractC2634d5.delta(firstInAreaAt);
            }
            oscar(R.drawable.ic_shift_timer_filled, bravo9, str4, P0.maroon(1.0f), c0585q, 6);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(shiftSummary, i4, 0);
        }
    }

    public static final void november(ShiftSummary shiftSummary, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        String str;
        String str2;
        String romeo;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-773620683);
        if (c0585q.india(shiftSummary)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            float f5 = 12;
            C0540f golf2 = AbstractC0542h.golf(f5);
            T.p pVar = T.p.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.time_accumulation), null, lima, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(T2.alpha)).hotel, 0L, AbstractC2636d7.charlie(14), H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777209), c0585q, 384, 0, 65530);
            c0585q = c0585q;
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            long j6 = juliet;
            T.s sierra = AbstractC0538d.sierra(R3.charlie(V.charlie(pVar, 1.0f), 1, j6, bravo2), f5);
            B b2 = B.alpha;
            T.s november = AbstractC0538d.november(sierra);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.foxtrot, T.d.f2061d, c0585q, 54);
            long j7 = c0585q.magenta;
            int i12 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            Integer tango = tango(shiftSummary.getBusyTimeInHours());
            String str3 = "-";
            if (tango == null || (str = romeo(Integer.valueOf(tango.intValue()))) == null) {
                str = "-";
            }
            alpha(str, AbstractC3086y3.bravo(c0585q, R.string.busy), P0.maroon(1.0f), c0585q, 0);
            FillElement fillElement = V.bravo;
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            Integer tango2 = tango(shiftSummary.getSlackTimeInHours());
            if (tango2 == null || (str2 = romeo(Integer.valueOf(tango2.intValue()))) == null) {
                str2 = "-";
            }
            alpha(str2, AbstractC3086y3.bravo(c0585q, R.string.slack), P0.maroon(1.0f), c0585q, 0);
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            Integer tango3 = tango(shiftSummary.getActiveTimeInHours());
            if (tango3 != null && (romeo = romeo(Integer.valueOf(tango3.intValue()))) != null) {
                str3 = romeo;
            }
            alpha(str3, AbstractC3086y3.bravo(c0585q, R.string.active), P0.maroon(1.0f), c0585q, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(shiftSummary, i4, 4);
        }
    }

    public static final void oscar(int i4, String str, String str2, T.s sVar, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1349273394);
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i5 | i10;
        if (c0585q.golf(str2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (c0585q.golf(sVar)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 4;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2063g, c0585q, 54);
            long j5 = c0585q.magenta;
            int i16 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), T.d.f2061d, c0585q, 54);
            long j6 = c0585q.magenta;
            int i17 = (int) (j6 ^ (j6 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(i4, c0585q, 6), null, V.kilo(pVar, 12), C0366t.kilo, c0585q, 3504, 0);
            E0 e02 = T2.alpha;
            G2.bravo(str, null, mike, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(e02)).lima, 0L, AbstractC2636d7.charlie(12), null, null, 0L, 0, 0L, null, null, 16777213), c0585q, ((i15 >> 3) & 14) | 384, 0, 65530);
            c0585q.quebec(true);
            G2.bravo(str2, null, lima, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(e02)).hotel, 0L, AbstractC2636d7.charlie(14), H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777209), c0585q, ((i15 >> 6) & 14) | 384, 0, 65530);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(i4, str, str2, sVar, i5);
        }
    }

    public static final void papa(ShiftSummary shiftSummary, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        String str;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1672131648);
        if (c0585q.india(shiftSummary)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        int i11 = 0;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            float f5 = 12;
            C0540f golf2 = AbstractC0542h.golf(f5);
            T.p pVar = T.p.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.time_performance), null, lima, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((S2) c0585q.kilo(T2.alpha)).hotel, 0L, AbstractC2636d7.charlie(14), H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777209), c0585q, 384, 0, 65530);
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            long j6 = juliet;
            T.s sierra = AbstractC0538d.sierra(R3.charlie(V.charlie(pVar, 1.0f), 1, j6, bravo2), f5);
            B b2 = B.alpha;
            T.s november = AbstractC0538d.november(sierra);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.foxtrot, T.d.f2061d, c0585q, 54);
            long j7 = c0585q.magenta;
            int i13 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            Date shiftStartedAt = shiftSummary.getShiftStartedAt();
            Integer num = null;
            if (shiftStartedAt != null) {
                long time = shiftStartedAt.getTime();
                Date firstInAreaAt = shiftSummary.getFirstInAreaAt();
                if (firstInAreaAt != null) {
                    int time2 = (int) ((firstInAreaAt.getTime() - time) / 1000);
                    if (time2 >= 0) {
                        i11 = time2;
                    }
                    num = Integer.valueOf(i11);
                }
            }
            if (num == null || (str = romeo(Integer.valueOf(num.intValue()))) == null) {
                str = "-";
            }
            india(str, AbstractC3086y3.bravo(c0585q, R.string.delay), delta, P0.maroon(1.0f), c0585q, 3120);
            FillElement fillElement = V.bravo;
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            india(romeo(shiftSummary.getTotalRoamingFreelyTimeInSeconds()), AbstractC3086y3.bravo(c0585q, R.string.roaming), echo, P0.maroon(1.0f), c0585q, 3120);
            K1.kilo(fillElement, 0.0f, j6, c0585q, 390);
            c0585q = c0585q;
            india(romeo(shiftSummary.getTotalDisconnectedTimeInSeconds()), AbstractC3086y3.bravo(c0585q, R.string.disconnected), foxtrot, P0.maroon(1.0f), c0585q, 3120);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(shiftSummary, i4, 2);
        }
    }

    public static final String quebec(String str) {
        BigDecimal stripTrailingZeros;
        String plainString;
        if (str != null) {
            String obj = StringsKt.b(kotlin.text.r.oscar(str, "%", "")).toString();
            if (obj.length() == 0) {
                return "-";
            }
            Double romeo = kotlin.text.r.romeo(obj);
            if (romeo != null) {
                double doubleValue = romeo.doubleValue();
                long j5 = (long) doubleValue;
                if (doubleValue == j5) {
                    plainString = String.valueOf(j5);
                } else {
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleValue));
                    if (bigDecimal.signum() == 0) {
                        stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        stripTrailingZeros = bigDecimal.stripTrailingZeros();
                    }
                    plainString = stripTrailingZeros.toPlainString();
                }
                return P0.crimson(plainString, "%");
            }
            return obj.concat("%");
        }
        return "-";
    }

    public static final String romeo(Integer num) {
        int i4;
        int i5 = 0;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        if (i4 >= 0) {
            i5 = i4;
        }
        int i10 = i5 / 86400;
        int i11 = (i5 % 86400) / 3600;
        int i12 = (i5 % 3600) / 60;
        if (i10 > 0) {
            return i10 + "d " + i11 + "h";
        }
        if (i11 > 0) {
            return i11 + "h " + i12 + "m";
        }
        return i12 + "m";
    }

    public static final String sierra(ShiftSummary shiftSummary) {
        Date shiftStartedAt = shiftSummary.getShiftStartedAt();
        if (shiftStartedAt == null && (shiftStartedAt = shiftSummary.getCreatedAt()) == null) {
            return "";
        }
        String format = new SimpleDateFormat("MMM yyyy", Locale.getDefault()).format(shiftStartedAt);
        Intrinsics.delta(format, "format(...)");
        return format;
    }

    public static final Integer tango(String str) {
        Integer tango;
        Integer tango2;
        int i4;
        Integer tango3;
        if (str != null && !StringsKt.gray(str)) {
            List maroon = StringsKt.maroon(str, new String[]{":"}, 6);
            if (maroon.size() >= 2) {
                int i5 = 0;
                String str2 = (String) CollectionsKt.jade(0, maroon);
                if (str2 != null && (tango = kotlin.text.r.tango(str2)) != null) {
                    int intValue = tango.intValue();
                    String str3 = (String) CollectionsKt.jade(1, maroon);
                    if (str3 != null && (tango2 = kotlin.text.r.tango(str3)) != null) {
                        int intValue2 = tango2.intValue();
                        String str4 = (String) CollectionsKt.jade(2, maroon);
                        if (str4 != null && (tango3 = kotlin.text.r.tango(str4)) != null) {
                            i4 = tango3.intValue();
                        } else {
                            i4 = 0;
                        }
                        int foxtrot2 = A0.z.foxtrot(intValue2, 60, intValue * 3600, i4);
                        if (foxtrot2 >= 0) {
                            i5 = foxtrot2;
                        }
                        return Integer.valueOf(i5);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
