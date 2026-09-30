package pf;

import Lb.am;
import av.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import s6.AbstractC2770s7;

/* renamed from: pf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2360j extends AbstractC2770s7 {
    public static InterfaceC2358h charlie(Iterator it) {
        Intrinsics.echo(it, "<this>");
        return delta(new o(5, it));
    }

    public static InterfaceC2358h delta(InterfaceC2358h interfaceC2358h) {
        if (interfaceC2358h instanceof C2351a) {
            return interfaceC2358h;
        }
        return new C2351a(interfaceC2358h);
    }

    public static int echo(InterfaceC2358h interfaceC2358h) {
        Iterator it = interfaceC2358h.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            it.next();
            i4++;
            if (i4 < 0) {
                CollectionsKt.t();
                throw null;
            }
        }
        return i4;
    }

    public static InterfaceC2358h foxtrot(InterfaceC2358h interfaceC2358h, int i4) {
        if (i4 >= 0) {
            if (i4 == 0) {
                return interfaceC2358h;
            }
            if (interfaceC2358h instanceof InterfaceC2353c) {
                return ((InterfaceC2353c) interfaceC2358h).alpha(i4);
            }
            return new C2352b(interfaceC2358h, i4);
        }
        throw new IllegalArgumentException(q.delta(i4, "Requested element count ", " is less than zero.").toString());
    }

    public static C2356f golf(InterfaceC2358h interfaceC2358h, Function1 predicate) {
        Intrinsics.echo(predicate, "predicate");
        return new C2356f(interfaceC2358h, true, predicate);
    }

    public static C2356f hotel(InterfaceC2358h interfaceC2358h, Function1 predicate) {
        Intrinsics.echo(predicate, "predicate");
        return new C2356f(interfaceC2358h, false, predicate);
    }

    public static Object india(C2356f c2356f) {
        C2355e c2355e = new C2355e(c2356f);
        if (!c2355e.hasNext()) {
            return null;
        }
        return c2355e.next();
    }

    public static C2357g juliet(InterfaceC2358h interfaceC2358h, Function1 transform) {
        Intrinsics.echo(transform, "transform");
        return new C2357g(interfaceC2358h, transform, C2362l.alpha);
    }

    public static final C2357g kilo(InterfaceC2358h interfaceC2358h) {
        C2361k c2361k = new C2361k(0);
        if (interfaceC2358h instanceof C2364n) {
            C2364n c2364n = (C2364n) interfaceC2358h;
            return new C2357g(c2364n.alpha, c2364n.bravo, c2361k);
        }
        return new C2357g(interfaceC2358h, new am(15), c2361k);
    }

    public static InterfaceC2358h lima(Object obj, Function1 nextFunction) {
        Intrinsics.echo(nextFunction, "nextFunction");
        if (obj == null) {
            return C2354d.alpha;
        }
        return new kotlin.io.h(new kotlin.collections.n(15, obj), nextFunction);
    }

    public static InterfaceC2358h mike(Function0 nextFunction) {
        Intrinsics.echo(nextFunction, "nextFunction");
        return delta(new kotlin.io.h(nextFunction, new Y(nextFunction)));
    }

    public static Object november(InterfaceC2358h interfaceC2358h) {
        Iterator it = interfaceC2358h.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static C2364n oscar(InterfaceC2358h interfaceC2358h, Function1 transform) {
        Intrinsics.echo(interfaceC2358h, "<this>");
        Intrinsics.echo(transform, "transform");
        return new C2364n(interfaceC2358h, transform);
    }

    public static C2356f papa(InterfaceC2358h interfaceC2358h, Function1 transform) {
        Intrinsics.echo(transform, "transform");
        return hotel(new C2364n(interfaceC2358h, transform), new C2361k(1));
    }

    public static List quebec(InterfaceC2358h interfaceC2358h) {
        Intrinsics.echo(interfaceC2358h, "<this>");
        Iterator it = interfaceC2358h.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ab.juliet(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
