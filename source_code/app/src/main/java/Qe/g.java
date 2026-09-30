package Qe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.C2346v;
import pe.C2350z;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.al;
import pe.au;
import pe.aw;
import se.ai;

/* loaded from: classes2.dex */
public abstract class g {
    static {
        Ne.b.juliet(new Ne.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean alpha(InterfaceC2328d interfaceC2328d) {
        Intrinsics.echo(interfaceC2328d, "<this>");
        if (interfaceC2328d instanceof ai) {
            al correspondingProperty = ((ai) interfaceC2328d).Z();
            Intrinsics.delta(correspondingProperty, "correspondingProperty");
            if (delta(correspondingProperty)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean bravo(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        if ((interfaceC2335k instanceof InterfaceC2330f) && (((InterfaceC2330f) interfaceC2335k).t() instanceof C2346v)) {
            return true;
        }
        return false;
    }

    public static final boolean charlie(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo != null) {
            return bravo(kilo);
        }
        return false;
    }

    public static final boolean delta(aw awVar) {
        InterfaceC2330f interfaceC2330f;
        C2346v c2346v;
        if (awVar.g() == null) {
            InterfaceC2335k lima = awVar.lima();
            Ne.f fVar = null;
            if (lima instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) lima;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                int i4 = Ue.e.alpha;
                au t5 = interfaceC2330f.t();
                if (t5 instanceof C2346v) {
                    c2346v = (C2346v) t5;
                } else {
                    c2346v = null;
                }
                if (c2346v != null) {
                    fVar = c2346v.alpha;
                }
            }
            if (Intrinsics.areEqual(fVar, awVar.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean echo(InterfaceC2335k interfaceC2335k) {
        if (!bravo(interfaceC2335k)) {
            if (!(interfaceC2335k instanceof InterfaceC2330f) || !(((InterfaceC2330f) interfaceC2335k).t() instanceof C2350z)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final ae foxtrot(y yVar) {
        InterfaceC2330f interfaceC2330f;
        C2346v c2346v;
        Intrinsics.echo(yVar, "<this>");
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) kilo;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null) {
            int i4 = Ue.e.alpha;
            au t5 = interfaceC2330f.t();
            if (t5 instanceof C2346v) {
                c2346v = (C2346v) t5;
            } else {
                c2346v = null;
            }
            if (c2346v != null) {
                return (ae) c2346v.bravo;
            }
        }
        return null;
    }
}
