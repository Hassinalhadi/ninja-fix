package s6;

import F.C0140o;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;

/* loaded from: classes2.dex */
public abstract class E7 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(Function0 function0, U0.t tVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Function0 function02;
        int i10;
        U0.t tVar2;
        int i11;
        int i12;
        boolean z2;
        androidx.compose.runtime.Q uniform;
        boolean z10;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(826668973);
        if ((i4 & 6) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            function02 = function0;
            i10 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            tVar2 = tVar;
            if (c0585q.golf(tVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                if (c0585q.india(dVar)) {
                    i13 = Barcode.FORMAT_QR_CODE;
                } else {
                    i13 = 128;
                }
                i10 |= i13;
            }
            i12 = i10;
            boolean z11 = true;
            if ((i12 & 147) == 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i12 & 1, z2)) {
                if (i15 != 0) {
                    tVar2 = new U0.t(7, false);
                }
                View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
                Q0.d dVar2 = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
                Q0.n nVar = (Q0.n) c0585q.kilo(AbstractC2901T.november);
                C0584p beige = C0564b.beige(c0585q);
                androidx.compose.runtime.ax black = C0564b.black(dVar, c0585q);
                Object[] objArr = new Object[0];
                Object jade = c0585q.jade();
                androidx.compose.runtime.as asVar = C0580l.alpha;
                if (jade == asVar) {
                    jade = U0.d.purple;
                    c0585q.f(jade);
                }
                UUID uuid = (UUID) R.l.echo(objArr, (Function0) jade, c0585q, 48);
                boolean golf = c0585q.golf(view) | c0585q.golf(dVar2);
                Object jade2 = c0585q.jade();
                if (golf || jade2 == asVar) {
                    U0.v vVar = new U0.v(function02, tVar2, view, nVar, dVar2, uuid);
                    P.d dVar3 = new P.d(new C0140o(black, 2), 346960332, true);
                    U0.s sVar = vVar.silver;
                    sVar.setParentCompositionContext(beige);
                    ((androidx.compose.runtime.t0) sVar.f2095c).setValue(dVar3);
                    sVar.f2098g = true;
                    sVar.charlie();
                    c0585q.f(vVar);
                    jade2 = vVar;
                }
                U0.v vVar2 = (U0.v) jade2;
                Unit unit = Unit.INSTANCE;
                boolean india = c0585q.india(vVar2);
                Object jade3 = c0585q.jade();
                if (india || jade3 == asVar) {
                    jade3 = new U0.a(vVar2, null);
                    c0585q.f(jade3);
                }
                C0564b.foxtrot((Xd.l) jade3, c0585q, unit);
                boolean india2 = c0585q.india(vVar2);
                Object jade4 = c0585q.jade();
                if (india2 || jade4 == asVar) {
                    jade4 = new U0.b(vVar2, 0);
                    c0585q.f(jade4);
                }
                C0564b.delta(vVar2, (Function1) jade4, c0585q);
                boolean india3 = c0585q.india(vVar2);
                if ((i12 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = india3 | z10;
                if ((i12 & 112) != 32) {
                    z11 = false;
                }
                boolean echo = z12 | z11 | c0585q.echo(nVar.ordinal());
                Object jade5 = c0585q.jade();
                if (echo || jade5 == asVar) {
                    U0.t tVar3 = tVar2;
                    F.S0 s02 = new F.S0((ae.p) vVar2, function0, (Object) tVar3, nVar, 2);
                    tVar2 = tVar3;
                    c0585q.f(s02);
                    jade5 = s02;
                }
                C0564b.juliet((Function0) jade5, c0585q);
            } else {
                c0585q.ochre();
            }
            U0.t tVar4 = tVar2;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new T0.m(function0, tVar4, dVar, i4, i5);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i4 & 384) == 0) {
        }
        i12 = i10;
        boolean z112 = true;
        if ((i12 & 147) == 146) {
        }
        if (!c0585q.magenta(i12 & 1, z2)) {
        }
        U0.t tVar42 = tVar2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(T.s sVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1090521195);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(lVar)) {
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
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = U0.f.bravo;
                c0585q.f(jade);
            }
            q0.ap apVar = (q0.ap) jade;
            long j5 = c0585q.magenta;
            int i12 = (int) ((j5 >>> 32) ^ j5);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            int i13 = (((((i5 << 3) & 112) | (((i5 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, apVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            lVar.invoke(c0585q, Integer.valueOf((i13 >> 6) & 14));
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F.C2(sVar, lVar, i4, 1);
        }
    }

    public static InterfaceC2466b charlie(InterfaceC2472h interfaceC2472h, Ne.c fqName) {
        Object obj;
        Intrinsics.echo(fqName, "fqName");
        Iterator it = interfaceC2472h.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((InterfaceC2466b) obj).alpha(), fqName)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (InterfaceC2466b) obj;
    }

    public static boolean delta(InterfaceC2472h interfaceC2472h, Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        if (interfaceC2472h.gray(fqName) != null) {
            return true;
        }
        return false;
    }
}
