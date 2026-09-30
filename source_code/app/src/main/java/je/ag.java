package je;

import ge.InterfaceC1783o;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.C2033a;
import ke.InterfaceC2037e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import s6.AbstractC2671h6;

/* loaded from: classes2.dex */
public final class ag extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ah purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(ah ahVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = ahVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        Object obj;
        InterfaceC2037e sVar;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        GenericDeclaration zulu;
        int collectionSizeOrDefault4;
        InterfaceC2037e interfaceC2037e;
        ah ahVar = this.purple;
        switch (this.alpha) {
            case 0:
                Ne.b bVar = Y.alpha;
                V charlie = Y.charlie(ahVar.tango());
                boolean z2 = charlie instanceof C1970i;
                af afVar = ahVar.white;
                if (z2) {
                    if (ahVar.uniform()) {
                        Class golf = afVar.golf();
                        List parameters = ahVar.getParameters();
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((av) ((InterfaceC1783o) it.next())).getName();
                            Intrinsics.checkNotNull(name);
                            arrayList.add(name);
                        }
                        return new C2033a(golf, arrayList, 2);
                    }
                    Me.e eVar = ((C1970i) charlie).purple;
                    afVar.getClass();
                    String desc = eVar.charlie;
                    Intrinsics.echo(desc, "desc");
                    obj = af.zulu(afVar.golf(), afVar.whiskey(desc));
                } else if (charlie instanceof C1971j) {
                    Me.e eVar2 = ((C1971j) charlie).purple;
                    obj = afVar.papa(eVar2.bravo, eVar2.charlie);
                } else if (charlie instanceof C1969h) {
                    obj = ((C1969h) charlie).purple;
                } else if (charlie instanceof C1968g) {
                    obj = ((C1968g) charlie).purple;
                } else {
                    if (charlie instanceof C1967f) {
                        Class golf2 = afVar.golf();
                        List list = ((C1967f) charlie).purple;
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C2033a(golf2, arrayList2, 2, 1, list);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (obj instanceof Constructor) {
                    sVar = ah.whiskey(ahVar, (Constructor) obj, ahVar.tango(), false);
                } else if (obj instanceof Method) {
                    Method method = (Method) obj;
                    boolean isStatic = Modifier.isStatic(method.getModifiers());
                    Object obj2 = ahVar.f12894a;
                    if (!isStatic) {
                        if (ahVar.victor()) {
                            sVar = new ke.p(method, AbstractC2671h6.alpha(obj2, ahVar.tango()));
                        } else {
                            sVar = new ke.s(method, 0);
                        }
                    } else if (((G3.a) ahVar.tango()).getAnnotations().gray(a0.alpha) != null) {
                        if (ahVar.victor()) {
                            sVar = new ke.q(method);
                        } else {
                            sVar = new ke.s(method, 1);
                        }
                    } else if (ahVar.victor()) {
                        sVar = new ke.r(method, AbstractC2671h6.alpha(obj2, ahVar.tango()));
                    } else {
                        sVar = new ke.s(method, 2);
                    }
                } else {
                    throw new Q("Could not compute caller for function: " + ahVar.tango() + " (member = " + obj + ')');
                }
                return AbstractC2671h6.bravo(sVar, ahVar.tango(), false);
            default:
                Ne.b bVar2 = Y.alpha;
                V charlie2 = Y.charlie(ahVar.tango());
                boolean z10 = charlie2 instanceof C1971j;
                af afVar2 = ahVar.white;
                if (z10) {
                    Me.e eVar3 = ((C1971j) charlie2).purple;
                    Member bravo = ahVar.quebec().bravo();
                    Intrinsics.checkNotNull(bravo);
                    boolean isStatic2 = Modifier.isStatic(bravo.getModifiers());
                    boolean z11 = !isStatic2;
                    afVar2.getClass();
                    String name2 = eVar3.bravo;
                    Intrinsics.echo(name2, "name");
                    String desc2 = eVar3.charlie;
                    Intrinsics.echo(desc2, "desc");
                    if (!Intrinsics.areEqual(name2, "<init>")) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!isStatic2) {
                            arrayList3.add(afVar2.golf());
                        }
                        afVar2.oscar(arrayList3, desc2, false);
                        zulu = af.xray(afVar2.uniform(), name2.concat("$default"), (Class[]) arrayList3.toArray(new Class[0]), afVar2.yankee(StringsKt.emerald(desc2, ')', 0, 6) + 1, desc2.length(), desc2), z11);
                    }
                    zulu = null;
                } else if (charlie2 instanceof C1970i) {
                    if (ahVar.uniform()) {
                        Class golf3 = afVar2.golf();
                        List parameters2 = ahVar.getParameters();
                        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
                        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
                        Iterator it3 = parameters2.iterator();
                        while (it3.hasNext()) {
                            String name3 = ((av) ((InterfaceC1783o) it3.next())).getName();
                            Intrinsics.checkNotNull(name3);
                            arrayList4.add(name3);
                        }
                        return new C2033a(golf3, arrayList4, 1);
                    }
                    Me.e eVar4 = ((C1970i) charlie2).purple;
                    afVar2.getClass();
                    String desc3 = eVar4.charlie;
                    Intrinsics.echo(desc3, "desc");
                    Class golf4 = afVar2.golf();
                    ArrayList arrayList5 = new ArrayList();
                    afVar2.oscar(arrayList5, desc3, true);
                    zulu = af.zulu(golf4, arrayList5);
                } else {
                    if (charlie2 instanceof C1967f) {
                        Class golf5 = afVar2.golf();
                        List list2 = ((C1967f) charlie2).purple;
                        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new C2033a(golf5, arrayList6, 1, 1, list2);
                    }
                    zulu = null;
                }
                if (zulu instanceof Constructor) {
                    interfaceC2037e = ah.whiskey(ahVar, (Constructor) zulu, ahVar.tango(), true);
                } else if (zulu instanceof Method) {
                    if (((G3.a) ahVar.tango()).getAnnotations().gray(a0.alpha) != null) {
                        InterfaceC2335k lima = ahVar.tango().lima();
                        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (!((InterfaceC2330f) lima).uniform()) {
                            Method method2 = (Method) zulu;
                            if (ahVar.victor()) {
                                interfaceC2037e = new ke.q(method2);
                            } else {
                                interfaceC2037e = new ke.s(method2, 1);
                            }
                        }
                    }
                    Method method3 = (Method) zulu;
                    if (ahVar.victor()) {
                        interfaceC2037e = new ke.r(method3, AbstractC2671h6.alpha(ahVar.f12894a, ahVar.tango()));
                    } else {
                        interfaceC2037e = new ke.s(method3, 2);
                    }
                } else {
                    interfaceC2037e = null;
                }
                if (interfaceC2037e == null) {
                    return null;
                }
                return AbstractC2671h6.bravo(interfaceC2037e, ahVar.tango(), true);
        }
    }
}
