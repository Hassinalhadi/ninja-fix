package Xe;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import s6.Q6;
import t6.X1;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class a implements n {
    public final String bravo;
    public final n[] charlie;

    public a(String str, n[] nVarArr) {
        this.bravo = str;
        this.charlie = nVarArr;
    }

    @Override // Xe.p
    public final Collection alpha(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        n[] nVarArr = this.charlie;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = Q6.bravo(collection, nVar.alpha(kindFilter, nameFilter));
                }
                if (collection == null) {
                    return kotlin.collections.u.alpha;
                }
                return collection;
            }
            return nVarArr[0].alpha(kindFilter, nameFilter);
        }
        return CollectionsKt.emptyList();
    }

    @Override // Xe.n
    public final Set bravo() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.charlie) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, nVar.bravo());
        }
        return linkedHashSet;
    }

    @Override // Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        n[] nVarArr = this.charlie;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = Q6.bravo(collection, nVar.charlie(name, enumC3339b));
                }
                if (collection == null) {
                    return kotlin.collections.u.alpha;
                }
                return collection;
            }
            return nVarArr[0].charlie(name, enumC3339b);
        }
        return CollectionsKt.emptyList();
    }

    @Override // Xe.n
    public final Set delta() {
        return X1.alpha(ArraysKt.romeo(this.charlie));
    }

    @Override // Xe.n
    public final Set echo() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.charlie) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, nVar.echo());
        }
        return linkedHashSet;
    }

    @Override // Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        n[] nVarArr = this.charlie;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = Q6.bravo(collection, nVar.foxtrot(name, enumC3339b));
                }
                if (collection == null) {
                    return kotlin.collections.u.alpha;
                }
                return collection;
            }
            return nVarArr[0].foxtrot(name, enumC3339b);
        }
        return CollectionsKt.emptyList();
    }

    @Override // Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        InterfaceC2332h interfaceC2332h = null;
        for (n nVar : this.charlie) {
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

    public final String toString() {
        return this.bravo;
    }
}
