package pe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;

/* renamed from: pe.ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2324ag implements InterfaceC2325ah {
    public final ArrayList alpha;

    public C2324ag(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    @Override // pe.InterfaceC2325ah
    public final boolean alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        ArrayList arrayList = this.alpha;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((se.ab) ((InterfaceC2321ad) it.next())).teal, fqName)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // pe.InterfaceC2325ah
    public final void bravo(Ne.c fqName, ArrayList arrayList) {
        Intrinsics.echo(fqName, "fqName");
        for (Object obj : this.alpha) {
            if (Intrinsics.areEqual(((se.ab) ((InterfaceC2321ad) obj)).teal, fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // pe.InterfaceC2325ah
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        return AbstractC2360j.quebec(AbstractC2360j.golf(AbstractC2360j.oscar(CollectionsKt.beige(this.alpha), C2322ae.alpha), new C2323af(fqName, 0)));
    }
}
