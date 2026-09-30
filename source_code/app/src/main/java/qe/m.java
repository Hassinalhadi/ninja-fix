package qe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.aw;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2472h {
    public final InterfaceC2472h alpha;
    public final aw purple;

    public m(InterfaceC2472h interfaceC2472h, aw awVar) {
        this.alpha = interfaceC2472h;
        this.purple = awVar;
    }

    @Override // qe.InterfaceC2472h
    public final boolean D(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        if (((Boolean) this.purple.invoke(fqName)).booleanValue()) {
            return this.alpha.D(fqName);
        }
        return false;
    }

    @Override // qe.InterfaceC2472h
    public final InterfaceC2466b gray(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        if (((Boolean) this.purple.invoke(fqName)).booleanValue()) {
            return this.alpha.gray(fqName);
        }
        return null;
    }

    @Override // qe.InterfaceC2472h
    public final boolean isEmpty() {
        InterfaceC2472h interfaceC2472h = this.alpha;
        if ((interfaceC2472h instanceof Collection) && ((Collection) interfaceC2472h).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC2472h.iterator();
        while (it.hasNext()) {
            Ne.c alpha = ((InterfaceC2466b) it.next()).alpha();
            if (alpha != null && ((Boolean) this.purple.invoke(alpha)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.alpha) {
            Ne.c alpha = ((InterfaceC2466b) obj).alpha();
            if (alpha != null && ((Boolean) this.purple.invoke(alpha)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
