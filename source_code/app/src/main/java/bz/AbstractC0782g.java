package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3017k3;

/* renamed from: bz.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0782g {
    public static final I alpha = AbstractC0779d.juliet(0.0f, null, 7);

    static {
        Object obj = o0.alpha;
        AbstractC0779d.juliet(0.0f, new Q0.g(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final D0 alpha(float f5, f0 f0Var, InterfaceC0581m interfaceC0581m) {
        return charlie(new Q0.g(f5), AbstractC0779d.lima, f0Var, null, "DpAnimation", interfaceC0581m, 384, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bz.I] */
    public static final D0 bravo(float f5, f0 f0Var, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        InterfaceC0787l interfaceC0787l;
        int i10 = i5 & 2;
        ?? r12 = alpha;
        if (i10 != 0) {
            f0Var = r12;
        }
        if ((i5 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (f0Var == r12) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(1144108831);
            boolean delta = c0585q.delta(0.01f);
            Object jade = c0585q.jade();
            if (delta || jade == C0580l.alpha) {
                jade = AbstractC0779d.juliet(0.0f, Float.valueOf(0.01f), 3);
                c0585q.f(jade);
            }
            c0585q.quebec(false);
            interfaceC0787l = (I) jade;
        } else {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(1144218757);
            c0585q2.quebec(false);
            interfaceC0787l = f0Var;
        }
        return charlie(Float.valueOf(f5), AbstractC0779d.juliet, interfaceC0787l, Float.valueOf(0.01f), str2, interfaceC0581m, (i4 << 3) & 57344, 0);
    }

    public static final D0 charlie(Object obj, g0 g0Var, InterfaceC0787l interfaceC0787l, Float f5, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Object obj2 = C0580l.alpha;
        if ((i5 & 8) != 0) {
            f5 = null;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == obj2) {
            jade = C0564b.zulu(null);
            c0585q.f(jade);
        }
        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == obj2) {
            jade2 = new C0778c(obj, g0Var, f5);
            c0585q.f(jade2);
        }
        C0778c c0778c = (C0778c) jade2;
        androidx.compose.runtime.ax black = C0564b.black(null, c0585q);
        if (f5 != null && (interfaceC0787l instanceof I)) {
            I i10 = (I) interfaceC0787l;
            if (!Intrinsics.areEqual(i10.charlie, f5)) {
                interfaceC0787l = new I(i10.alpha, i10.bravo, f5);
            }
        }
        androidx.compose.runtime.ax black2 = C0564b.black(interfaceC0787l, c0585q);
        Object jade3 = c0585q.jade();
        if (jade3 == obj2) {
            jade3 = AbstractC3017k3.bravo(-1, 6, null);
            c0585q.f(jade3);
        }
        xf.i iVar = (xf.i) jade3;
        boolean india = c0585q.india(iVar) | c0585q.india(obj);
        Object jade4 = c0585q.jade();
        if (india || jade4 == obj2) {
            jade4 = new Yb.F(10, iVar, obj);
            c0585q.f(jade4);
        }
        C0564b.juliet((Function0) jade4, c0585q);
        boolean india2 = c0585q.india(iVar) | c0585q.india(c0778c) | c0585q.golf(black2) | c0585q.golf(black);
        Object jade5 = c0585q.jade();
        if (india2 || jade5 == obj2) {
            Object c0781f = new C0781f(iVar, c0778c, black2, black, null);
            c0585q.f(c0781f);
            jade5 = c0781f;
        }
        C0564b.foxtrot((Xd.l) jade5, c0585q, iVar);
        D0 d02 = (D0) axVar.getValue();
        if (d02 == null) {
            return c0778c.charlie;
        }
        return d02;
    }
}
