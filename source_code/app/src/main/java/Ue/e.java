package Ue;

import Ne.f;
import gf.AbstractC1792g;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import me.AbstractC2120h;
import of.AbstractC2262q;
import pe.InterfaceC2321ad;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2349y;
import pe.ak;
import pe.al;
import qe.InterfaceC2466b;
import se.af;
import se.aq;

/* loaded from: classes2.dex */
public abstract class e {
    public static final /* synthetic */ int alpha = 0;

    static {
        f.echo("value");
    }

    public static final boolean alpha(aq aqVar) {
        Boolean golf = AbstractC2262q.golf(ab.juliet(aqVar), a.purple, b.alpha);
        Intrinsics.delta(golf, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return golf.booleanValue();
    }

    public static InterfaceC2328d bravo(InterfaceC2328d interfaceC2328d, Function1 predicate) {
        Intrinsics.echo(interfaceC2328d, "<this>");
        Intrinsics.echo(predicate, "predicate");
        return (InterfaceC2328d) AbstractC2262q.echo(ab.juliet(interfaceC2328d), new a(1), new c(new Ref.ObjectRef(), predicate));
    }

    public static final Ne.c charlie(InterfaceC2336l interfaceC2336l) {
        Intrinsics.echo(interfaceC2336l, "<this>");
        Ne.e hotel = hotel(interfaceC2336l);
        if (!hotel.delta()) {
            hotel = null;
        }
        if (hotel == null) {
            return null;
        }
        return hotel.golf();
    }

    public static final InterfaceC2330f delta(InterfaceC2466b interfaceC2466b) {
        Intrinsics.echo(interfaceC2466b, "<this>");
        InterfaceC2332h kilo = interfaceC2466b.getType().green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            return (InterfaceC2330f) kilo;
        }
        return null;
    }

    public static final AbstractC2120h echo(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        return juliet(interfaceC2335k).juliet();
    }

    public static final Ne.b foxtrot(InterfaceC2332h interfaceC2332h) {
        InterfaceC2335k lima;
        Ne.b foxtrot;
        if (interfaceC2332h != null && (lima = interfaceC2332h.lima()) != null) {
            if (lima instanceof InterfaceC2321ad) {
                return new Ne.b(((se.ab) ((InterfaceC2321ad) lima)).teal, interfaceC2332h.getName());
            }
            if ((lima instanceof InterfaceC2333i) && (foxtrot = foxtrot((InterfaceC2332h) lima)) != null) {
                return foxtrot.delta(interfaceC2332h.getName());
            }
            return null;
        }
        return null;
    }

    public static final Ne.c golf(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        Ne.c hotel = Qe.e.hotel(interfaceC2335k);
        if (hotel == null) {
            hotel = Qe.e.golf(interfaceC2335k.lima()).bravo(interfaceC2335k.getName()).golf();
        }
        if (hotel != null) {
            return hotel;
        }
        Qe.e.alpha(4);
        throw null;
    }

    public static final Ne.e hotel(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        Ne.e golf = Qe.e.golf(interfaceC2335k);
        Intrinsics.delta(golf, "getFqName(this)");
        return golf;
    }

    public static final void india(InterfaceC2349y interfaceC2349y) {
        Intrinsics.echo(interfaceC2349y, "<this>");
        if (interfaceC2349y.silver(AbstractC1792g.alpha) == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC2349y juliet(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        InterfaceC2349y delta = Qe.e.delta(interfaceC2335k);
        Intrinsics.delta(delta, "getContainingModule(this)");
        return delta;
    }

    public static final InterfaceC2328d kilo(InterfaceC2328d interfaceC2328d) {
        Intrinsics.echo(interfaceC2328d, "<this>");
        if (interfaceC2328d instanceof ak) {
            al correspondingProperty = ((af) ((ak) interfaceC2328d)).Z();
            Intrinsics.delta(correspondingProperty, "correspondingProperty");
            return correspondingProperty;
        }
        return interfaceC2328d;
    }
}
