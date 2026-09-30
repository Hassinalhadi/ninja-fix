package Ec;

import F.AbstractC0141o0;
import F.G2;
import F.K1;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.Shift;
import com.app.network.network.models.Zone;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.S3;

/* loaded from: classes2.dex */
public abstract class c {
    /* JADX WARN: Can't wrap try/catch for region: R(63:37|(1:39)|40|(1:42)(1:182)|43|(1:45)(1:181)|46|(1:48)(1:180)|49|(1:51)(1:179)|52|53|(1:55)(1:178)|56|57|(1:59)(1:177)|60|(1:176)|64|(1:66)(1:175)|67|(1:174)|71|(1:73)(1:173)|74|(1:172)|78|(3:166|(1:168)(1:171)|(32:170|83|(1:85)(1:165)|86|(1:164)|90|(1:92)(1:163)|93|94|95|96|(1:98)|99|100|101|102|(1:104)(1:156)|105|(1:107)(1:155)|108|(1:154)|112|(1:114)|115|(1:117)(1:153)|118|119|(1:152)(3:123|(1:125)(1:151)|126)|127|128|(7:130|(1:132)|133|(1:149)(1:136)|137|(1:139)(1:148)|140)(1:150)|141))|82|83|(0)(0)|86|(1:88)|164|90|(0)(0)|93|94|95|96|(0)|99|100|101|102|(0)(0)|105|(0)(0)|108|(1:110)|154|112|(0)|115|(0)(0)|118|119|(1:121)|152|127|128|(0)(0)|141) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03d6, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b9, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(Shift shift, List leaveReasons, Function0 onShiftLocation, Function1 function1, Function0 onTakeBreak, InterfaceC0581m interfaceC0581m, int i4) {
        List list;
        long j5;
        long j6;
        String name;
        String str;
        int i5;
        Object m206constructorimpl;
        int i10;
        int i11;
        float f5;
        long j7;
        boolean z2;
        androidx.compose.runtime.as asVar;
        androidx.compose.runtime.ax axVar;
        boolean z10;
        boolean z11;
        Function1 onLeaveShift = function1;
        Intrinsics.echo(shift, "shift");
        Intrinsics.echo(leaveReasons, "leaveReasons");
        Intrinsics.echo(onShiftLocation, "onShiftLocation");
        Intrinsics.echo(onLeaveShift, "onLeaveShift");
        Intrinsics.echo(onTakeBreak, "onTakeBreak");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(798931823);
        int i12 = (c0585q.india(shift) ? 4 : 2) | i4;
        if ((i4 & 48) == 0) {
            i12 |= c0585q.india(leaveReasons) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i12 |= c0585q.india(onShiftLocation) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i12 |= c0585q.india(onLeaveShift) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i12 |= c0585q.india(onTakeBreak) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i13 = i12;
        if (c0585q.magenta(i13 & 1, (i13 & 9363) != 9362)) {
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar2 = C0580l.alpha;
            if (jade == asVar2) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade;
            boolean areEqual = Intrinsics.areEqual(shift.getStatus(), "CURRENTLY_ACTIVE");
            if (areEqual) {
                j5 = ay.golf;
            } else {
                j5 = C0366t.juliet;
            }
            long j10 = j5;
            if (areEqual) {
                j6 = ay.golf;
            } else {
                j6 = ay.hotel;
            }
            long j11 = j6;
            String bravo = AbstractC3086y3.bravo(c0585q, areEqual ? R.string.status_active : R.string.status_upcoming);
            long delta = a0.ao.delta(areEqual ? 4292672743L : 4294964200L);
            C2093f bravo2 = AbstractC2094g.bravo(16);
            T.p pVar = T.p.alpha;
            float f10 = 1;
            T.s bravo3 = androidx.compose.foundation.a.bravo(R3.charlie(t6.ac.alpha(V.charlie(pVar, 1.0f), areEqual ? 0 : 2, bravo2, 0L, 0L, 28), f10, j10, bravo2), ay.alpha, bravo2);
            float f11 = ay.sierra;
            T.s sierra = AbstractC0538d.sierra(bravo3, f11);
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.india(f11, T.d.f2060c), T.d.f2062f, c0585q, 54);
            long j12 = c0585q.magenta;
            int i14 = (int) (j12 ^ (j12 >>> 32));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            T.s charlie2 = V.charlie(pVar, 1.0f);
            T.j jVar = T.d.f2061d;
            S alpha2 = Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            long j13 = c0585q.magenta;
            int i15 = (int) (j13 ^ (j13 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            S alpha3 = Q.alpha(AbstractC0542h.golf(ay.papa), jVar, c0585q, 54);
            long j14 = c0585q.magenta;
            int i16 = (int) (j14 ^ (j14 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie4 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            Shift.Branch branch = shift.getBranch();
            if (branch == null || (name = branch.getName()) == null) {
                Zone zone = shift.getZone();
                name = zone != null ? zone.getName() : null;
                if (name == null) {
                    str = "-";
                    long charlie5 = AbstractC2636d7.charlie(16);
                    H0.n nVar = ay.tango;
                    G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(ay.echo, charlie5, new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                    float f12 = 8;
                    G2.bravo(bravo, AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar, AbstractC2094g.bravo(20)), delta, a0.ao.alpha), f12, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(12), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65532);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    S alpha4 = Q.alpha(AbstractC0542h.golf(ay.oscar), jVar, c0585q, 54);
                    long j15 = c0585q.magenta;
                    i5 = (int) (j15 ^ (j15 >>> 32));
                    I mike4 = c0585q.mike();
                    T.s charlie6 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (!c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha4);
                    C0564b.blue(c2549i2, c0585q, mike4);
                    if (!c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q, i5, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie6);
                    AbstractC1680b charlie7 = AbstractC3076w3.charlie(R.drawable.timecalendernewgray, c0585q, 6);
                    long j16 = ay.foxtrot;
                    AbstractC0141o0.alpha(charlie7, null, V.kilo(pVar, 13), j16, c0585q, 3504, 0);
                    String dayOfWeek = shift.getDayOfWeek();
                    G2.bravo(dayOfWeek != null ? "-" : dayOfWeek, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j16, AbstractC2636d7.charlie(12), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                    c0585q.quebec(true);
                    Result.Companion companion = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(shift.get12HourFormatStartAt());
                    if (m206constructorimpl instanceof kotlin.k) {
                        m206constructorimpl = "-";
                    }
                    String str2 = (String) m206constructorimpl;
                    Object m206constructorimpl2 = Result.m206constructorimpl(shift.get12HourFormatFinishAt());
                    t.echo(str2, (String) (!(m206constructorimpl2 instanceof kotlin.k) ? "-" : m206constructorimpl2), c0585q, 0);
                    T.s charlie8 = V.charlie(pVar, 1.0f);
                    C0537c c0537c2 = AbstractC0542h.alpha;
                    float f13 = ay.romeo;
                    S alpha5 = Q.alpha(AbstractC0542h.golf(f13), jVar, c0585q, 54);
                    long j17 = c0585q.magenta;
                    i10 = (int) (j17 ^ (j17 >>> 32));
                    I mike5 = c0585q.mike();
                    T.s charlie9 = T.a.charlie(charlie8, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q.white();
                    if (!c0585q.lime) {
                        c0585q.lima(c2550j2);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha5);
                    C0564b.blue(C2551k.echo, c0585q, mike5);
                    C2549i c2549i5 = C2551k.golf;
                    if (!c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                        ao.ad.blue(i10, c0585q, i10, c2549i5);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie9);
                    if (1.0f <= 0.0d) {
                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                    }
                    float f14 = 44;
                    float f15 = 0;
                    T.s alpha6 = t6.ac.alpha(V.echo(new LayoutWeightElement(1.0f, true), f14), f15, AbstractC2094g.bravo(f12), 0L, 0L, 28);
                    C2093f bravo4 = AbstractC2094g.bravo(f12);
                    float f16 = ay.sierra;
                    M m4 = new M(f16, f13, f16, f13);
                    M m5 = F.al.alpha;
                    long j18 = ay.alpha;
                    long j19 = ay.echo;
                    F.ak delta2 = F.al.delta(j18, j19, 0L, 0L, c0585q, 12);
                    long j20 = ay.charlie;
                    c0585q = c0585q;
                    K1.hotel(onShiftLocation, alpha6, false, bravo4, delta2, null, S3.alpha(f10, j20), m4, t.alpha, c0585q, ((i13 >> 6) & 14) | 819462144, 292);
                    if (!shift.getCanTakeBreak()) {
                        c0585q.purple(-1075265066);
                        f5 = f15;
                        i11 = -1082200603;
                        c0585q = c0585q;
                        j7 = j20;
                        K1.hotel(onTakeBreak, t6.ac.alpha(V.echo(V.oscar(pVar, 52), f14), f15, AbstractC2094g.bravo(f12), 0L, 0L, 28), false, AbstractC2094g.bravo(f12), F.al.delta(j18, j19, 0L, 0L, c0585q, 12), null, S3.alpha(f10, j20), new M(f15, f15, f15, f15), t.bravo, c0585q, ((i13 >> 12) & 14) | 819462144, 292);
                        z2 = false;
                    } else {
                        i11 = -1082200603;
                        f5 = f15;
                        j7 = j20;
                        z2 = false;
                        c0585q.purple(-1082200603);
                    }
                    c0585q.quebec(z2);
                    if (!Intrinsics.areEqual(shift.getCanLeave(), Boolean.TRUE) && !leaveReasons.isEmpty()) {
                        c0585q.purple(-1074165310);
                        T.s alpha7 = t6.ac.alpha(V.echo(V.oscar(pVar, 52), f14), f5, AbstractC2094g.bravo(f12), 0L, 0L, 28);
                        float f17 = f5;
                        C2093f bravo5 = AbstractC2094g.bravo(f12);
                        M m8 = new M(f17, f17, f17, f17);
                        F.ak delta3 = F.al.delta(j18, j19, 0L, 0L, c0585q, 12);
                        b.ab alpha8 = S3.alpha(f10, j7);
                        Object jade2 = c0585q.jade();
                        asVar = asVar2;
                        if (jade2 == asVar) {
                            axVar = axVar2;
                            jade2 = new Cb.u(axVar, 2);
                            c0585q.f(jade2);
                        } else {
                            axVar = axVar2;
                        }
                        K1.hotel((Function0) jade2, alpha7, false, bravo5, delta3, null, alpha8, m8, t.charlie, c0585q, 819462150, 292);
                        z10 = false;
                    } else {
                        asVar = asVar2;
                        axVar = axVar2;
                        z10 = false;
                        c0585q.purple(i11);
                    }
                    c0585q.quebec(z10);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    if (!((Boolean) axVar.getValue()).booleanValue()) {
                        c0585q.purple(-1723534777);
                        boolean z12 = (i13 & 7168) == 2048;
                        Object jade3 = c0585q.jade();
                        if (z12 || jade3 == asVar) {
                            onLeaveShift = function1;
                            jade3 = new a(onLeaveShift, axVar);
                            c0585q.f(jade3);
                        } else {
                            onLeaveShift = function1;
                        }
                        Function1 function12 = (Function1) jade3;
                        Object jade4 = c0585q.jade();
                        if (jade4 == asVar) {
                            jade4 = new Cb.u(axVar, 3);
                            c0585q.f(jade4);
                        }
                        list = leaveReasons;
                        w.alpha(list, function12, (Function0) jade4, c0585q, ((i13 >> 3) & 14) | 384);
                        z11 = false;
                    } else {
                        list = leaveReasons;
                        onLeaveShift = function1;
                        z11 = false;
                        c0585q.purple(-1732576237);
                    }
                    c0585q.quebec(z11);
                }
            }
            str = name;
            long charlie52 = AbstractC2636d7.charlie(16);
            H0.n nVar2 = ay.tango;
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(ay.echo, charlie52, new H0.v(700), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            float f122 = 8;
            G2.bravo(bravo, AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar, AbstractC2094g.bravo(20)), delta, a0.ao.alpha), f122, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(12), new H0.v(700), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65532);
            c0585q.quebec(true);
            c0585q.quebec(true);
            S alpha42 = Q.alpha(AbstractC0542h.golf(ay.oscar), jVar, c0585q, 54);
            long j152 = c0585q.magenta;
            i5 = (int) (j152 ^ (j152 >>> 32));
            I mike42 = c0585q.mike();
            T.s charlie62 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (!c0585q.lime) {
            }
            C0564b.blue(c2549i, c0585q, alpha42);
            C0564b.blue(c2549i2, c0585q, mike42);
            if (!c0585q.lime) {
            }
            ao.ad.blue(i5, c0585q, i5, c2549i3);
            C0564b.blue(c2549i4, c0585q, charlie62);
            AbstractC1680b charlie72 = AbstractC3076w3.charlie(R.drawable.timecalendernewgray, c0585q, 6);
            long j162 = ay.foxtrot;
            AbstractC0141o0.alpha(charlie72, null, V.kilo(pVar, 13), j162, c0585q, 3504, 0);
            String dayOfWeek2 = shift.getDayOfWeek();
            G2.bravo(dayOfWeek2 != null ? "-" : dayOfWeek2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j162, AbstractC2636d7.charlie(12), new H0.v(700), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q.quebec(true);
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(shift.get12HourFormatStartAt());
            if (m206constructorimpl instanceof kotlin.k) {
            }
            String str22 = (String) m206constructorimpl;
            Object m206constructorimpl22 = Result.m206constructorimpl(shift.get12HourFormatFinishAt());
            t.echo(str22, (String) (!(m206constructorimpl22 instanceof kotlin.k) ? "-" : m206constructorimpl22), c0585q, 0);
            T.s charlie82 = V.charlie(pVar, 1.0f);
            C0537c c0537c22 = AbstractC0542h.alpha;
            float f132 = ay.romeo;
            S alpha52 = Q.alpha(AbstractC0542h.golf(f132), jVar, c0585q, 54);
            long j172 = c0585q.magenta;
            i10 = (int) (j172 ^ (j172 >>> 32));
            I mike52 = c0585q.mike();
            T.s charlie92 = T.a.charlie(charlie82, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j22 = C2551k.bravo;
            c0585q.white();
            if (!c0585q.lime) {
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha52);
            C0564b.blue(C2551k.echo, c0585q, mike52);
            C2549i c2549i52 = C2551k.golf;
            if (!c0585q.lime) {
            }
            ao.ad.blue(i10, c0585q, i10, c2549i52);
            C0564b.blue(C2551k.delta, c0585q, charlie92);
            if (1.0f <= 0.0d) {
            }
            float f142 = 44;
            float f152 = 0;
            T.s alpha62 = t6.ac.alpha(V.echo(new LayoutWeightElement(1.0f, true), f142), f152, AbstractC2094g.bravo(f122), 0L, 0L, 28);
            C2093f bravo42 = AbstractC2094g.bravo(f122);
            float f162 = ay.sierra;
            M m42 = new M(f162, f132, f162, f132);
            M m52 = F.al.alpha;
            long j182 = ay.alpha;
            long j192 = ay.echo;
            F.ak delta22 = F.al.delta(j182, j192, 0L, 0L, c0585q, 12);
            long j202 = ay.charlie;
            c0585q = c0585q;
            K1.hotel(onShiftLocation, alpha62, false, bravo42, delta22, null, S3.alpha(f10, j202), m42, t.alpha, c0585q, ((i13 >> 6) & 14) | 819462144, 292);
            if (!shift.getCanTakeBreak()) {
            }
            c0585q.quebec(z2);
            if (!Intrinsics.areEqual(shift.getCanLeave(), Boolean.TRUE)) {
            }
            asVar = asVar2;
            axVar = axVar2;
            z10 = false;
            c0585q.purple(i11);
            c0585q.quebec(z10);
            c0585q.quebec(true);
            c0585q.quebec(true);
            if (!((Boolean) axVar.getValue()).booleanValue()) {
            }
            c0585q.quebec(z11);
        } else {
            list = leaveReasons;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(shift, list, onShiftLocation, onLeaveShift, onTakeBreak, i4);
        }
    }
}
