package Ce;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import s6.K4;
import s6.Q6;
import t6.X1;
import t6.X2;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class d implements Xe.n {
    public static final /* synthetic */ ge.v[] foxtrot;
    public final B9.ab bravo;
    public final r charlie;
    public final w delta;
    public final ff.i echo;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        foxtrot = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public d(B9.ab abVar, ve.aa aaVar, r packageFragment) {
        Intrinsics.echo(packageFragment, "packageFragment");
        this.bravo = abVar;
        this.charlie = packageFragment;
        this.delta = new w(abVar, aaVar, packageFragment);
        this.echo = ((Be.a) abVar.purple).alpha.bravo(new Aa.g(9, this));
    }

    @Override // Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        Xe.n[] hotel = hotel();
        Collection alpha = this.delta.alpha(kindFilter, nameFilter);
        for (Xe.n nVar : hotel) {
            alpha = Q6.bravo(alpha, nVar.alpha(kindFilter, nameFilter));
        }
        if (alpha == null) {
            return kotlin.collections.u.alpha;
        }
        return alpha;
    }

    @Override // Xe.n
    public final Set bravo() {
        Xe.n[] hotel = hotel();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Xe.n nVar : hotel) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, nVar.bravo());
        }
        linkedHashSet.addAll(this.delta.bravo());
        return linkedHashSet;
    }

    @Override // Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        india(name, enumC3339b);
        Xe.n[] hotel = hotel();
        Collection charlie = this.delta.charlie(name, enumC3339b);
        for (Xe.n nVar : hotel) {
            charlie = Q6.bravo(charlie, nVar.charlie(name, enumC3339b));
        }
        if (charlie == null) {
            return kotlin.collections.u.alpha;
        }
        return charlie;
    }

    @Override // Xe.n
    public final Set delta() {
        HashSet alpha = X1.alpha(ArraysKt.romeo(hotel()));
        if (alpha != null) {
            alpha.addAll(this.delta.delta());
            return alpha;
        }
        return null;
    }

    @Override // Xe.n
    public final Set echo() {
        Xe.n[] hotel = hotel();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Xe.n nVar : hotel) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, nVar.echo());
        }
        linkedHashSet.addAll(this.delta.echo());
        return linkedHashSet;
    }

    @Override // Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        india(name, enumC3339b);
        Xe.n[] hotel = hotel();
        this.delta.getClass();
        Collection emptyList = CollectionsKt.emptyList();
        for (Xe.n nVar : hotel) {
            emptyList = Q6.bravo(emptyList, nVar.foxtrot(name, enumC3339b));
        }
        if (emptyList == null) {
            return kotlin.collections.u.alpha;
        }
        return emptyList;
    }

    @Override // Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        india(name, location);
        w wVar = this.delta;
        wVar.getClass();
        InterfaceC2332h interfaceC2332h = null;
        InterfaceC2330f victor = wVar.victor(name, null);
        if (victor != null) {
            return victor;
        }
        for (Xe.n nVar : hotel()) {
            InterfaceC2332h golf = nVar.golf(name, location);
            if (golf != null) {
                if ((golf instanceof InterfaceC2333i) && ((InterfaceC2333i) golf).emerald()) {
                    if (interfaceC2332h == null) {
                        interfaceC2332h = golf;
                    }
                } else {
                    return golf;
                }
            }
        }
        return interfaceC2332h;
    }

    public final Xe.n[] hotel() {
        return (Xe.n[]) K4.alpha(this.echo, foxtrot[0]);
    }

    public final void india(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        Be.a aVar = (Be.a) this.bravo.purple;
        X2.bravo(aVar.november, location, this.charlie, name);
    }

    public final String toString() {
        return "scope for " + this.charlie;
    }
}
