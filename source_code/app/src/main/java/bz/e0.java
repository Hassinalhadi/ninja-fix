package bz;

import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class e0 {
    public static final a5.c alpha = new a5.c(16);
    public static final Object bravo = LazyKt.alpha(kotlin.i.purple, new b.c0(1));

    public static final void alpha(a0 a0Var, X x4, Object obj, Object obj2, aa aaVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean india;
        int i10;
        boolean india2;
        int i11;
        boolean india3;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(867041821);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(a0Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(x4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if ((i4 & 512) == 0) {
                india3 = c0585q.golf(obj);
            } else {
                india3 = c0585q.india(obj);
            }
            if (india3) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if ((i4 & 4096) == 0) {
                india2 = c0585q.golf(obj2);
            } else {
                india2 = c0585q.india(obj2);
            }
            if (india2) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if ((32768 & i4) == 0) {
                india = c0585q.golf(aaVar);
            } else {
                india = c0585q.india(aaVar);
            }
            if (india) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        if ((i5 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if (a0Var.hotel()) {
                x4.hotel(obj, obj2, aaVar);
            } else {
                x4.india(obj2, aaVar);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.b(a0Var, x4, obj, obj2, aaVar, i4, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final U bravo(a0 a0Var, g0 g0Var, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T t5;
        if ((i5 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean golf = ((C0585q) interfaceC0581m).golf(a0Var);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = new U(a0Var, g0Var, str);
            c0585q.f(jade);
        }
        U u4 = (U) jade;
        boolean golf2 = c0585q.golf(a0Var) | c0585q.india(u4);
        Object jade2 = c0585q.jade();
        if (golf2 || jade2 == asVar) {
            jade2 = new C0393r(19, a0Var, u4);
            c0585q.f(jade2);
        }
        C0564b.delta(u4, (Function1) jade2, c0585q);
        if (a0Var.hotel() && (t5 = (T) ((t0) u4.bravo).getValue()) != null) {
            ?? r22 = t5.red;
            a0 a0Var2 = u4.charlie;
            t5.alpha.hotel(r22.invoke(a0Var2.foxtrot().alpha()), t5.red.invoke(a0Var2.foxtrot().charlie()), (aa) t5.purple.invoke(a0Var2.foxtrot()));
        }
        return u4;
    }

    public static final X charlie(a0 a0Var, Object obj, Object obj2, aa aaVar, g0 g0Var, InterfaceC0581m interfaceC0581m, int i4) {
        Function1 function1;
        boolean golf = ((C0585q) interfaceC0581m).golf(a0Var);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            try {
                r rVar = (r) g0Var.alpha.invoke(obj2);
                rVar.delta();
                X x4 = new X(a0Var, obj, rVar, g0Var);
                r6.u.juliet(echo, foxtrot, function1);
                c0585q.f(x4);
                jade = x4;
            } catch (Throwable th) {
                r6.u.juliet(echo, foxtrot, function1);
                throw th;
            }
        }
        X x5 = (X) jade;
        alpha(a0Var, x5, obj, obj2, aaVar, c0585q, 0);
        boolean golf2 = c0585q.golf(a0Var) | c0585q.golf(x5);
        Object jade2 = c0585q.jade();
        if (golf2 || jade2 == asVar) {
            jade2 = new C0393r(17, a0Var, x5);
            c0585q.f(jade2);
        }
        C0564b.delta(x5, (Function1) jade2, c0585q);
        return x5;
    }

    public static final a0 delta(G3.a aVar, String str, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Function1 function1;
        int i5 = (i4 & 14) ^ 6;
        boolean z10 = true;
        if ((i5 > 4 && ((C0585q) interfaceC0581m).golf(aVar)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        Object obj = C0580l.alpha;
        if (z2 || jade == obj) {
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            try {
                Object a0Var = new a0(aVar, null, str);
                r6.u.juliet(echo, foxtrot, function1);
                c0585q.f(a0Var);
                jade = a0Var;
            } catch (Throwable th) {
                r6.u.juliet(echo, foxtrot, function1);
                throw th;
            }
        }
        a0 a0Var2 = (a0) jade;
        if (aVar instanceof F) {
            c0585q.purple(-1357588631);
            F f5 = (F) aVar;
            Object value = ((t0) f5.red).getValue();
            Object value2 = ((t0) f5.purple).getValue();
            if ((i5 <= 4 || !c0585q.golf(aVar)) && (i4 & 6) != 4) {
                z10 = false;
            }
            Object jade2 = c0585q.jade();
            if (z10 || jade2 == obj) {
                jade2 = new c0(aVar, null);
                c0585q.f(jade2);
            }
            C0564b.golf(value, value2, (Xd.l) jade2, c0585q);
            c0585q.quebec(false);
        } else {
            c0585q.purple(-1357127072);
            a0Var2.alpha(aVar.N(), c0585q, 0);
            c0585q.quebec(false);
        }
        boolean golf = c0585q.golf(a0Var2);
        Object jade3 = c0585q.jade();
        if (golf || jade3 == obj) {
            jade3 = new b0(a0Var2, 1);
            c0585q.f(jade3);
        }
        C0564b.delta(a0Var2, (Function1) jade3, c0585q);
        return a0Var2;
    }

    public static final a0 echo(Object obj, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = new a0(new an(obj), null, str);
            c0585q.f(jade);
        }
        a0 a0Var = (a0) jade;
        a0Var.alpha(obj, c0585q, (i4 & 8) | 48 | (i4 & 14));
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = new b0(a0Var, 0);
            c0585q.f(jade2);
        }
        C0564b.delta(a0Var, (Function1) jade2, c0585q);
        return a0Var;
    }
}
