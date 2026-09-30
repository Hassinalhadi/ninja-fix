package Be;

import Aa.i;
import B9.ab;
import Ce.r;
import ff.g;
import ff.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2325ah;
import ve.aa;

/* loaded from: classes2.dex */
public final class d implements InterfaceC2325ah {
    public final ab alpha;
    public final ff.e bravo;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public d(a aVar) {
        this.alpha = new ab(aVar, b.bravo, (Lazy) new Object());
        l lVar = aVar.alpha;
        lVar.getClass();
        this.bravo = new ff.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new Object(), 0);
    }

    @Override // pe.InterfaceC2325ah
    public final boolean alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        ((a) this.alpha.purple).bravo.getClass();
        return false;
    }

    @Override // pe.InterfaceC2325ah
    public final void bravo(Ne.c fqName, ArrayList arrayList) {
        Intrinsics.echo(fqName, "fqName");
        arrayList.add(charlie(fqName));
    }

    public final r charlie(Ne.c fqName) {
        ((a) this.alpha.purple).bravo.getClass();
        Intrinsics.echo(fqName, "fqName");
        i iVar = new i(6, this, new aa(fqName));
        ff.e eVar = this.bravo;
        eVar.getClass();
        Object invoke = eVar.invoke(new g(fqName, iVar));
        if (invoke != null) {
            return (r) invoke;
        }
        ff.e.alpha(3);
        throw null;
    }

    @Override // pe.InterfaceC2325ah
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        List list = (List) charlie(fqName).e.invoke();
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.alpha.purple).oscar;
    }
}
