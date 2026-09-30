package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* renamed from: bz.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0778c {
    public final g0 alpha;
    public final Object bravo;
    public final C0788m charlie;
    public final androidx.compose.runtime.ax delta;
    public final androidx.compose.runtime.ax echo;
    public final ar foxtrot;
    public final I golf;
    public final r hotel;
    public final r india;
    public final r juliet;
    public final r kilo;

    public C0778c(Object obj, g0 g0Var, Object obj2) {
        r rVar;
        r rVar2;
        this.alpha = g0Var;
        this.bravo = obj2;
        C0788m c0788m = new C0788m(g0Var, obj, null, 60);
        this.charlie = c0788m;
        this.delta = C0564b.zulu(Boolean.FALSE);
        this.echo = C0564b.zulu(obj);
        this.foxtrot = new ar();
        this.golf = new I(obj2);
        r rVar3 = c0788m.red;
        boolean z2 = rVar3 instanceof C0789n;
        if (z2) {
            rVar = AbstractC0779d.echo;
        } else if (rVar3 instanceof C0790o) {
            rVar = AbstractC0779d.foxtrot;
        } else {
            rVar = rVar3 instanceof C0791p ? AbstractC0779d.golf : AbstractC0779d.hotel;
        }
        this.hotel = rVar;
        if (z2) {
            rVar2 = AbstractC0779d.alpha;
        } else if (rVar3 instanceof C0790o) {
            rVar2 = AbstractC0779d.bravo;
        } else {
            rVar2 = rVar3 instanceof C0791p ? AbstractC0779d.charlie : AbstractC0779d.delta;
        }
        this.india = rVar2;
        this.juliet = rVar;
        this.kilo = rVar2;
    }

    public static final Object alpha(C0778c c0778c, Object obj) {
        r rVar = c0778c.hotel;
        r rVar2 = c0778c.juliet;
        boolean areEqual = Intrinsics.areEqual(rVar2, rVar);
        r rVar3 = c0778c.kilo;
        if (!areEqual || !Intrinsics.areEqual(rVar3, c0778c.india)) {
            g0 g0Var = c0778c.alpha;
            r rVar4 = (r) g0Var.alpha.invoke(obj);
            int bravo = rVar4.bravo();
            boolean z2 = false;
            for (int i4 = 0; i4 < bravo; i4++) {
                if (rVar4.alpha(i4) < rVar2.alpha(i4) || rVar4.alpha(i4) > rVar3.alpha(i4)) {
                    rVar4.echo(J4.charlie(rVar4.alpha(i4), rVar2.alpha(i4), rVar3.alpha(i4)), i4);
                    z2 = true;
                }
            }
            if (z2) {
                return g0Var.bravo.invoke(rVar4);
            }
        }
        return obj;
    }

    public static final void bravo(C0778c c0778c) {
        C0788m c0788m = c0778c.charlie;
        c0788m.red.delta();
        c0788m.silver = Long.MIN_VALUE;
        ((t0) c0778c.delta).setValue(Boolean.FALSE);
    }

    public static Object charlie(C0778c c0778c, Object obj, InterfaceC0787l interfaceC0787l, Function1 function1, Nd.c cVar, int i4) {
        if ((i4 & 2) != 0) {
            interfaceC0787l = c0778c.golf;
        }
        InterfaceC0787l interfaceC0787l2 = interfaceC0787l;
        Object invoke = c0778c.alpha.bravo.invoke(c0778c.charlie.red);
        if ((i4 & 8) != 0) {
            function1 = null;
        }
        Object delta = c0778c.delta();
        g0 g0Var = c0778c.alpha;
        return ar.alpha(c0778c.foxtrot, new C0776a(c0778c, invoke, new Q(interfaceC0787l2, g0Var, delta, obj, (r) g0Var.alpha.invoke(invoke)), c0778c.charlie.silver, function1, null), cVar);
    }

    public final Object delta() {
        return ((t0) this.charlie.purple).getValue();
    }

    public final boolean echo() {
        return ((Boolean) ((t0) this.delta).getValue()).booleanValue();
    }

    public final Object foxtrot(Nd.c cVar, Object obj) {
        Object alpha = ar.alpha(this.foxtrot, new C0777b(this, obj, null), cVar);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0778c(Object obj, g0 g0Var, Object obj2, int i4) {
        this(obj, g0Var, (i4 & 4) != 0 ? null : obj2);
    }
}
