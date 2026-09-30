package Xe;

import Lb.C;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.C2257l;
import pe.al;
import s6.K4;
import se.AbstractC2852b;
import se.ak;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class h extends o {
    public static final /* synthetic */ ge.v[] delta;
    public final AbstractC2852b bravo;
    public final ff.i charlie;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        delta = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(ff.l lVar, AbstractC2852b abstractC2852b) {
        this.bravo = abstractC2852b;
        this.charlie = lVar.bravo(new C(29, this));
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        if (!kindFilter.alpha(f.november.bravo)) {
            return CollectionsKt.emptyList();
        }
        return (List) K4.alpha(this.charlie, delta[0]);
    }

    @Override // Xe.o, Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        List list = (List) K4.alpha(this.charlie, delta[0]);
        C2257l c2257l = new C2257l();
        for (Object obj : list) {
            if ((obj instanceof ak) && Intrinsics.areEqual(((ak) obj).getName(), name)) {
                c2257l.add(obj);
            }
        }
        return c2257l;
    }

    @Override // Xe.o, Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        List list = (List) K4.alpha(this.charlie, delta[0]);
        C2257l c2257l = new C2257l();
        for (Object obj : list) {
            if ((obj instanceof al) && Intrinsics.areEqual(((al) obj).getName(), name)) {
                c2257l.add(obj);
            }
        }
        return c2257l;
    }

    public abstract List hotel();
}
