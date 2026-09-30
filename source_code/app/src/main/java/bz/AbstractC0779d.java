package bz;

import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.C2889G;

/* renamed from: bz.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0779d {
    public static final C0789n alpha = new C0789n(Float.POSITIVE_INFINITY);
    public static final C0790o bravo = new C0790o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C0791p charlie = new C0791p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C0792q delta = new C0792q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C0789n echo = new C0789n(Float.NEGATIVE_INFINITY);
    public static final C0790o foxtrot = new C0790o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C0791p golf = new C0791p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C0792q hotel = new C0792q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] india = new float[91];
    public static final g0 juliet = new g0(new a5.c(18), new h0(5));
    public static final g0 kilo = new g0(new a5.c(19), new a5.c(20));
    public static final g0 lima = new g0(new a5.c(21), new a5.c(22));
    public static final g0 mike = new g0(new a5.c(23), new a5.c(24));
    public static final g0 november = new g0(new a5.c(25), new a5.c(26));
    public static final g0 oscar = new g0(new a5.c(27), new a5.c(28));
    public static final g0 papa = new g0(new a5.c(29), new h0(0));
    public static final g0 quebec = new g0(new h0(1), new h0(2));
    public static final g0 romeo = new g0(new h0(3), new h0(4));

    public static C0778c alpha(float f5) {
        return new C0778c(Float.valueOf(f5), juliet, Float.valueOf(0.01f), 8);
    }

    public static C0788m bravo(int i4, float f5, float f10) {
        if ((i4 & 2) != 0) {
            f10 = 0.0f;
        }
        return new C0788m(juliet, Float.valueOf(f5), new C0789n(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final ag charlie(aj ajVar, float f5, ae aeVar, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        if ((i5 & 8) != 0) {
            str = "FloatAnimation";
        }
        return delta(ajVar, Float.valueOf(0.0f), Float.valueOf(f5), juliet, aeVar, str, interfaceC0581m, (i4 & 1022) | 32768 | ((i4 << 3) & 458752), 0);
    }

    public static final ag delta(aj ajVar, Number number, Number number2, g0 g0Var, ae aeVar, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        aj ajVar2;
        Number number3;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (jade == asVar) {
            ajVar2 = ajVar;
            ag agVar = new ag(ajVar2, number, number2, g0Var, aeVar);
            number3 = number2;
            c0585q.f(agVar);
            jade = agVar;
        } else {
            ajVar2 = ajVar;
            number3 = number2;
        }
        ag agVar2 = (ag) jade;
        boolean z10 = true;
        if ((((i4 & 896) ^ 384) > 256 && c0585q.india(number3)) || (i4 & 384) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((57344 & i4) ^ 24576) <= 16384 || !c0585q.india(aeVar)) && (i4 & 24576) != 16384) {
            z10 = false;
        }
        boolean z11 = z2 | z10;
        Object jade2 = c0585q.jade();
        if (z11 || jade2 == asVar) {
            F4.b bVar = new F4.b(number, agVar2, number3, aeVar, 2);
            c0585q.f(bVar);
            jade2 = bVar;
        }
        C0564b.juliet((Function0) jade2, c0585q);
        boolean india2 = c0585q.india(ajVar2);
        Object jade3 = c0585q.jade();
        if (india2 || jade3 == asVar) {
            jade3 = new C0393r(15, ajVar2, agVar2);
            c0585q.f(jade3);
        }
        C0564b.delta(agVar2, (Function1) jade3, c0585q);
        return agVar2;
    }

    public static final r echo(r rVar) {
        r charlie2 = rVar.charlie();
        int bravo2 = charlie2.bravo();
        for (int i4 = 0; i4 < bravo2; i4++) {
            charlie2.echo(rVar.alpha(i4), i4);
        }
        return charlie2;
    }

    public static C0788m foxtrot(C0788m c0788m, float f5) {
        float f10 = ((C0789n) c0788m.red).alpha;
        return new C0788m(c0788m.alpha, Float.valueOf(f5), new C0789n(f10), c0788m.silver, c0788m.teal, c0788m.white);
    }

    public static ae golf(InterfaceC0798x interfaceC0798x, int i4) {
        return new ae(interfaceC0798x, at.alpha, 0);
    }

    public static final am hotel(Function1 function1) {
        al alVar = new al();
        function1.invoke(alVar);
        return new am(alVar);
    }

    public static final aj india(String str, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = new aj();
            c0585q.f(jade);
        }
        aj ajVar = (aj) jade;
        ajVar.alpha(c0585q, 0);
        return ajVar;
    }

    public static I juliet(float f5, Object obj, int i4) {
        if ((i4 & 2) != 0) {
            f5 = 1500.0f;
        }
        if ((i4 & 4) != 0) {
            obj = null;
        }
        return new I(1.0f, f5, obj);
    }

    public static f0 kilo(int i4, int i5, InterfaceC0799y interfaceC0799y, int i10) {
        if ((i10 & 1) != 0) {
            i4 = 300;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            interfaceC0799y = AbstractC0800z.alpha;
        }
        return new f0(i4, i5, interfaceC0799y);
    }

    public static final Object lima(Function1 function1, Nd.c cVar) {
        if (cVar.getContext().get(C2889G.silver) == null) {
            return C0564b.sierra(cVar.getContext()).blue(function1, cVar);
        }
        throw new ClassCastException();
    }
}
