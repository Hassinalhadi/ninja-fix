package A2;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import bv.au;
import bx.C0769g;
import bz.a0;
import bz.e0;
import bz.f0;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.C1725e;
import g0.C1726f;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class ai {
    public static C1726f alpha;

    public static final void alpha(a0 a0Var, T.s sVar, f0 f0Var, Function1 function1, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function1 function12;
        char c3;
        Object obj;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1877370462);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(a0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(f0Var)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        int i14 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i14 |= i10;
        }
        if ((i14 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            as asVar = C0580l.alpha;
            Object jade = c0585q.jade();
            if (jade == asVar) {
                jade = bx.af.alpha;
                c0585q.f(jade);
            }
            Function1 function13 = (Function1) jade;
            Object jade2 = c0585q.jade();
            G3.a aVar = a0Var.alpha;
            if (jade2 == asVar) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                c3 = ' ';
                snapshotStateList.add(aVar.L());
                c0585q.f(snapshotStateList);
                obj = snapshotStateList;
            } else {
                c3 = ' ';
                obj = jade2;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                long[] jArr = au.alpha;
                jade3 = new bv.al();
                c0585q.f(jade3);
            }
            bv.al alVar = (bv.al) jade3;
            Object L4 = aVar.L();
            t0 t0Var = (t0) a0Var.delta;
            if (Intrinsics.areEqual(L4, t0Var.getValue())) {
                c0585q.purple(321189832);
                if (snapshotStateList2.size() == 1 && Intrinsics.areEqual(snapshotStateList2.get(0), t0Var.getValue())) {
                    c0585q.purple(321514464);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(321324186);
                    if ((i14 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object jade4 = c0585q.jade();
                    if (z11 || jade4 == asVar) {
                        jade4 = new C0769g(2, a0Var);
                        c0585q.f(jade4);
                    }
                    CollectionsKt.d(snapshotStateList2, (Function1) jade4);
                    alVar.alpha();
                    c0585q.quebec(false);
                }
                c0585q.quebec(false);
            } else {
                c0585q.purple(321520416);
                c0585q.quebec(false);
            }
            if (!alVar.bravo(t0Var.getValue())) {
                c0585q.purple(321581083);
                ListIterator listIterator = snapshotStateList2.listIterator();
                int i15 = 0;
                while (true) {
                    Ld.a aVar2 = (Ld.a) listIterator;
                    z10 = z12;
                    if (aVar2.hasNext()) {
                        if (Intrinsics.areEqual(function13.invoke(aVar2.next()), function13.invoke(t0Var.getValue()))) {
                            break;
                        }
                        i15++;
                        z12 = z10;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                if (i15 == -1) {
                    snapshotStateList2.add(t0Var.getValue());
                } else {
                    snapshotStateList2.set(i15, t0Var.getValue());
                }
                alVar.alpha();
                int size = snapshotStateList2.size();
                for (int i16 = 0; i16 < size; i16++) {
                    Object obj2 = snapshotStateList2.get(i16);
                    alVar.mike(obj2, P.e.echo(-934471669, new bx.ah(a0Var, f0Var, obj2, dVar), c0585q));
                }
                c0585q.quebec(false);
            } else {
                z10 = true;
                c0585q.purple(322323936);
                c0585q.quebec(false);
            }
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i17 = (int) (j5 ^ (j5 >>> c3));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            c0585q.purple(-1312707512);
            int size2 = snapshotStateList2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                Object obj3 = snapshotStateList2.get(i18);
                c0585q.pink(1171574969, function13.invoke(obj3));
                Xd.l lVar = (Xd.l) alVar.golf(obj3);
                if (lVar == null) {
                    c0585q.purple(1959122128);
                } else {
                    c0585q.purple(1171576145);
                    lVar.invoke(c0585q, 0);
                }
                c0585q.quebec(false);
                c0585q.quebec(false);
            }
            c0585q.quebec(false);
            c0585q.quebec(z10);
            function12 = function13;
        } else {
            c0585q.ochre();
            function12 = function1;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new bx.z(a0Var, sVar, f0Var, function12, dVar, i4);
        }
    }

    public static final void bravo(Boolean bool, T.p pVar, f0 f0Var, String str, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.p pVar2;
        String str2;
        int i10;
        int i11;
        boolean india;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-513216493);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(bool);
            } else {
                india = c0585q.india(bool);
            }
            if (india) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        int i13 = i5 | 48;
        if ((i4 & 384) == 0) {
            if (c0585q.india(f0Var)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i13 |= i11;
        }
        int i14 = i13 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i14 |= i10;
        }
        if ((i14 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            alpha(e0.echo(bool, "Crossfade", c0585q, (i14 & 14) | ((i14 >> 6) & 112), 0), pVar3, f0Var, null, dVar, c0585q, i14 & 58352);
            str2 = "Crossfade";
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new bx.z(bool, pVar2, f0Var, str2, dVar, i4, 1);
        }
    }

    public static final C1726f charlie() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(20.0f, 11.0f);
        bVar.foxtrot(7.83f);
        bVar.india(5.59f, -5.59f);
        bVar.hotel(12.0f, 4.0f);
        bVar.india(-8.0f, 8.0f);
        bVar.india(8.0f, 8.0f);
        bVar.india(1.41f, -1.41f);
        bVar.hotel(7.83f, 13.0f);
        bVar.foxtrot(20.0f);
        bVar.november(-2.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }
}
