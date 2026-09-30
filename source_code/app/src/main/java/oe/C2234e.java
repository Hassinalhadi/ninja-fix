package oe;

import ge.v;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import of.InterfaceC2247b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;

/* renamed from: oe.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2234e implements InterfaceC2247b {
    public static final C2234e alpha = new Object();

    public static InterfaceC2330f alpha(InterfaceC2330f interfaceC2330f) {
        Ne.e golf = Qe.e.golf(interfaceC2330f);
        String str = C2233d.alpha;
        Ne.c cVar = (Ne.c) C2233d.kilo.get(golf);
        if (cVar != null) {
            return Ue.e.echo(interfaceC2330f).india(cVar);
        }
        throw new IllegalArgumentException("Given class " + interfaceC2330f + " is not a read-only collection");
    }

    public static InterfaceC2330f bravo(Ne.c cVar, AbstractC2120h builtIns) {
        Intrinsics.echo(builtIns, "builtIns");
        String str = C2233d.alpha;
        Ne.b bVar = (Ne.b) C2233d.hotel.get(cVar.india());
        if (bVar != null) {
            return builtIns.india(bVar.bravo());
        }
        return null;
    }

    @Override // of.InterfaceC2247b
    public Iterable golf(Object obj) {
        v[] vVarArr = C2243n.golf;
        return ((InterfaceC2328d) obj).alpha().mike();
    }
}
