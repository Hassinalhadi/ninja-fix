package Xe;

import ef.C1661i;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.C2257l;
import pe.InterfaceC2332h;
import pe.al;
import s6.K4;
import se.ak;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class r extends o {
    public static final /* synthetic */ ge.v[] echo;
    public final C1661i bravo;
    public final ff.i charlie;
    public final ff.i delta;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        echo = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(r.class), "functions", "getFunctions()Ljava/util/List;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(ff.l storageManager, C1661i c1661i) {
        Intrinsics.echo(storageManager, "storageManager");
        this.bravo = c1661i;
        this.charlie = storageManager.bravo(new q(this, 0));
        this.delta = storageManager.bravo(new q(this, 1));
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        ff.i iVar = this.charlie;
        ge.v[] vVarArr = echo;
        return CollectionsKt.a((List) K4.alpha(iVar, vVarArr[0]), (List) K4.alpha(this.delta, vVarArr[1]));
    }

    @Override // Xe.o, Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        List list = (List) K4.alpha(this.charlie, echo[0]);
        C2257l c2257l = new C2257l();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((ak) obj).getName(), name)) {
                c2257l.add(obj);
            }
        }
        return c2257l;
    }

    @Override // Xe.o, Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        List list = (List) K4.alpha(this.delta, echo[1]);
        C2257l c2257l = new C2257l();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((al) obj).getName(), name)) {
                c2257l.add(obj);
            }
        }
        return c2257l;
    }

    @Override // Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return null;
    }
}
