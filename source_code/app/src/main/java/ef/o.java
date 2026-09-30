package ef;

import B9.K;
import cf.C0853i;
import ge.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2262q;
import pe.InterfaceC2332h;
import s6.K4;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class o extends Xe.o {
    public static final /* synthetic */ v[] foxtrot;
    public final D5.s bravo;
    public final n charlie;
    public final ff.i delta;
    public final ff.h echo;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        foxtrot = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(o.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(o.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public o(D5.s c3, List functionList, List propertyList, List typeAliasList, Function0 classNames) {
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(functionList, "functionList");
        Intrinsics.echo(propertyList, "propertyList");
        Intrinsics.echo(typeAliasList, "typeAliasList");
        Intrinsics.echo(classNames, "classNames");
        this.bravo = c3;
        K k6 = (K) c3.alpha;
        ((C0853i) k6.charlie).getClass();
        this.charlie = new n(this, functionList, propertyList, typeAliasList);
        ff.l lVar = (ff.l) k6.alpha;
        this.delta = lVar.bravo(new F2.e(classNames, 2));
        Xe.s sVar = new Xe.s(14, this);
        lVar.getClass();
        this.echo = new ff.h(lVar, sVar);
    }

    @Override // Xe.o, Xe.n
    public final Set bravo() {
        return (Set) K4.alpha(this.charlie.golf, n.juliet[0]);
    }

    @Override // Xe.o, Xe.n
    public Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        n nVar = this.charlie;
        nVar.getClass();
        Intrinsics.echo(name, "name");
        if (!((Set) K4.alpha(nVar.golf, n.juliet[0])).contains(name)) {
            return CollectionsKt.emptyList();
        }
        return (Collection) nVar.delta.invoke(name);
    }

    @Override // Xe.o, Xe.n
    public final Set delta() {
        ff.h hVar = this.echo;
        v p4 = foxtrot[1];
        Intrinsics.echo(hVar, "<this>");
        Intrinsics.echo(p4, "p");
        return (Set) hVar.invoke();
    }

    @Override // Xe.o, Xe.n
    public final Set echo() {
        return (Set) K4.alpha(this.charlie.hotel, n.juliet[1]);
    }

    @Override // Xe.o, Xe.n
    public Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        n nVar = this.charlie;
        nVar.getClass();
        Intrinsics.echo(name, "name");
        if (!((Set) K4.alpha(nVar.hotel, n.juliet[1])).contains(name)) {
            return CollectionsKt.emptyList();
        }
        return (Collection) nVar.echo.invoke(name);
    }

    @Override // Xe.o, Xe.p
    public InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        if (quebec(name)) {
            return ((K) this.bravo.alpha).bravo(lima(name));
        }
        n nVar = this.charlie;
        if (nVar.charlie.keySet().contains(name)) {
            nVar.getClass();
            return (s) nVar.foxtrot.invoke(name);
        }
        return null;
    }

    public abstract void hotel(ArrayList arrayList, Function1 function1);

    public final List india(Xe.f kindFilter, Function1 nameFilter) {
        Object obj;
        Object obj2;
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.alpha(Xe.f.foxtrot)) {
            hotel(arrayList, nameFilter);
        }
        n nVar = this.charlie;
        nVar.getClass();
        boolean alpha = kindFilter.alpha(Xe.f.juliet);
        Qe.h hVar = Qe.h.purple;
        if (alpha) {
            ff.i iVar = nVar.hotel;
            Set<Ne.f> set = (Set) K4.alpha(iVar, n.juliet[1]);
            ArrayList arrayList2 = new ArrayList();
            for (Ne.f name : set) {
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    Intrinsics.echo(name, "name");
                    if (!((Set) K4.alpha(iVar, n.juliet[1])).contains(name)) {
                        obj2 = CollectionsKt.emptyList();
                    } else {
                        obj2 = (Collection) nVar.echo.invoke(name);
                    }
                    arrayList2.addAll(obj2);
                }
            }
            kotlin.collections.p.romeo(arrayList2, hVar);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.alpha(Xe.f.india)) {
            ff.i iVar2 = nVar.golf;
            Set<Ne.f> set2 = (Set) K4.alpha(iVar2, n.juliet[0]);
            ArrayList arrayList3 = new ArrayList();
            for (Ne.f name2 : set2) {
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    Intrinsics.echo(name2, "name");
                    if (!((Set) K4.alpha(iVar2, n.juliet[0])).contains(name2)) {
                        obj = CollectionsKt.emptyList();
                    } else {
                        obj = (Collection) nVar.delta.invoke(name2);
                    }
                    arrayList3.addAll(obj);
                }
            }
            kotlin.collections.p.romeo(arrayList3, hVar);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.alpha(Xe.f.lima)) {
            for (Ne.f fVar : mike()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    AbstractC2262q.alpha(arrayList, ((K) this.bravo.alpha).bravo(lima(fVar)));
                }
            }
        }
        if (kindFilter.alpha(Xe.f.golf)) {
            for (Ne.f name3 : nVar.charlie.keySet()) {
                if (((Boolean) nameFilter.invoke(name3)).booleanValue()) {
                    nVar.getClass();
                    Intrinsics.echo(name3, "name");
                    AbstractC2262q.alpha(arrayList, (s) nVar.foxtrot.invoke(name3));
                }
            }
        }
        return AbstractC2262q.delta(arrayList);
    }

    public void juliet(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
    }

    public void kilo(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
    }

    public abstract Ne.b lima(Ne.f fVar);

    public final Set mike() {
        return (Set) K4.alpha(this.delta, foxtrot[0]);
    }

    public abstract Set november();

    public abstract Set oscar();

    public abstract Set papa();

    public boolean quebec(Ne.f name) {
        Intrinsics.echo(name, "name");
        return mike().contains(name);
    }

    public boolean romeo(r rVar) {
        return true;
    }
}
