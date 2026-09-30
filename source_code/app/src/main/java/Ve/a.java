package Ve;

import B9.ab;
import Ce.j;
import Ne.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public final class a implements e {
    public final List bravo;

    public a(List inner) {
        Intrinsics.echo(inner, "inner");
        this.bravo = inner;
    }

    public final void alpha(ab _context_receiver_0, InterfaceC2330f thisDescriptor, ArrayList arrayList) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).alpha(_context_receiver_0, thisDescriptor, arrayList);
        }
    }

    public final void bravo(ab _context_receiver_0, InterfaceC2330f thisDescriptor, f name, ArrayList arrayList) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        Intrinsics.echo(name, "name");
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).bravo(_context_receiver_0, thisDescriptor, name, arrayList);
        }
    }

    public final void charlie(ab _context_receiver_0, InterfaceC2330f thisDescriptor, f name, Ld.c cVar) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        Intrinsics.echo(name, "name");
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).charlie(_context_receiver_0, thisDescriptor, name, cVar);
        }
    }

    public final void delta(ab _context_receiver_0, j thisDescriptor, f name, ArrayList arrayList) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        Intrinsics.echo(name, "name");
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            ((a) ((e) it.next())).delta(_context_receiver_0, thisDescriptor, name, arrayList);
        }
    }

    public final ArrayList echo(ab _context_receiver_0, InterfaceC2330f thisDescriptor) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            CollectionsKt.zulu(arrayList, ((a) ((e) it.next())).echo(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    public final ArrayList foxtrot(ab _context_receiver_0, InterfaceC2330f thisDescriptor) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            CollectionsKt.zulu(arrayList, ((a) ((e) it.next())).foxtrot(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    public final ArrayList golf(ab _context_receiver_0, j thisDescriptor) {
        Intrinsics.echo(_context_receiver_0, "_context_receiver_0");
        Intrinsics.echo(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            CollectionsKt.zulu(arrayList, ((a) ((e) it.next())).golf(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }
}
