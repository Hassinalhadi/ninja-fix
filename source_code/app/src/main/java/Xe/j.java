package Xe;

import F.C0090b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2326b;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class j implements n {
    public final /* synthetic */ int bravo = 1;
    public final Object charlie;

    public j(n nVar) {
        this.charlie = nVar;
    }

    @Override // Xe.p
    public Collection alpha(f kindFilter, Function1 nameFilter) {
        switch (this.bravo) {
            case 1:
                Intrinsics.echo(kindFilter, "kindFilter");
                Intrinsics.echo(nameFilter, "nameFilter");
                Collection india = india(kindFilter, nameFilter);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : india) {
                    if (((InterfaceC2335k) obj) instanceof InterfaceC2326b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return CollectionsKt.a(Qe.l.oscar(arrayList, u.alpha), arrayList2);
            default:
                return india(kindFilter, nameFilter);
        }
    }

    @Override // Xe.n
    public final Set bravo() {
        return lima().bravo();
    }

    @Override // Xe.n
    public Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        switch (this.bravo) {
            case 1:
                Intrinsics.echo(name, "name");
                return Qe.l.oscar(juliet(name, enumC3339b), v.alpha);
            default:
                return juliet(name, enumC3339b);
        }
    }

    @Override // Xe.n
    public final Set delta() {
        return lima().delta();
    }

    @Override // Xe.n
    public final Set echo() {
        return lima().echo();
    }

    @Override // Xe.n
    public Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        switch (this.bravo) {
            case 1:
                Intrinsics.echo(name, "name");
                return Qe.l.oscar(kilo(name, enumC3339b), w.alpha);
            default:
                return kilo(name, enumC3339b);
        }
    }

    @Override // Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return lima().golf(name, location);
    }

    public final n hotel() {
        if (lima() instanceof j) {
            n lima = lima();
            Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((j) lima).hotel();
        }
        return lima();
    }

    public final Collection india(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return lima().alpha(kindFilter, nameFilter);
    }

    public final Collection juliet(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return lima().charlie(name, enumC3339b);
    }

    public final Collection kilo(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return lima().foxtrot(name, enumC3339b);
    }

    public final n lima() {
        switch (this.bravo) {
            case 0:
                return (n) ((ff.i) this.charlie).invoke();
            default:
                return (n) this.charlie;
        }
    }

    public j(ff.o storageManager, Function0 function0) {
        Intrinsics.echo(storageManager, "storageManager");
        this.charlie = ((ff.l) storageManager).bravo(new C0090b1(function0, 4));
    }
}
