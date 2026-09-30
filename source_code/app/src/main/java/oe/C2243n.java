package oe;

import Ce.ag;
import Ie.y;
import bx.C0769g;
import ef.C1661i;
import ef.r;
import g.C1718a;
import ge.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import je.ab;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.ac;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import me.AbstractC2120h;
import of.AbstractC2262q;
import of.C2259n;
import pe.AbstractC2340p;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import s6.AbstractC2643e5;
import s6.AbstractC2661g5;
import s6.AbstractC2672h7;
import s6.K4;
import se.AbstractC2870t;
import se.C2859i;
import se.C2861k;
import se.C2869s;
import se.ak;
import se.aq;
import se.z;
import xe.EnumC3339b;

/* renamed from: oe.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2243n implements InterfaceC2518b, InterfaceC2520d {
    public static final /* synthetic */ v[] golf;
    public final z alpha;
    public final ff.i bravo;
    public final ae charlie;
    public final ff.i delta;
    public final ff.e echo;
    public final ff.i foxtrot;

    static {
        kotlin.jvm.internal.v vVar = u.alpha;
        golf = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2243n.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2243n.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2243n.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public C2243n(z zVar, ff.l lVar, ab abVar) {
        this.alpha = zVar;
        this.bravo = lVar.bravo(abVar);
        C2861k c2861k = new C2861k(new C2240k(zVar, new Ne.c("java.io"), 0), Ne.f.echo("Serializable"), 4, 2, kotlin.collections.ab.juliet(new ac(lVar, new C2241l(this, 0))), lVar);
        c2861k.cyan(Xe.m.bravo, kotlin.collections.u.alpha, null);
        this.charlie = c2861k.oscar();
        this.delta = lVar.bravo(new Xa.f(27, this, lVar));
        this.echo = new ff.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new Object(), 0);
        this.foxtrot = lVar.bravo(new C2241l(this, 1));
    }

    @Override // re.InterfaceC2518b
    public final Collection alpha(InterfaceC2330f classDescriptor) {
        Set bravo;
        Intrinsics.echo(classDescriptor, "classDescriptor");
        golf().getClass();
        Set set = kotlin.collections.u.alpha;
        Ce.j foxtrot = foxtrot(classDescriptor);
        if (foxtrot != null && (bravo = foxtrot.cyan().bravo()) != null) {
            set = bravo;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x02d8, code lost:
    
        if (r6 != 3) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7 A[SYNTHETIC] */
    @Override // re.InterfaceC2518b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List bravo(Ne.f name, InterfaceC2330f classDescriptor) {
        Set listOf;
        Object obj;
        InterfaceC2330f interfaceC2330f;
        int collectionSizeOrDefault;
        ak akVar;
        List<ak> list;
        boolean booleanValue;
        boolean z2;
        boolean z10;
        ak akVar2;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(classDescriptor, "classDescriptor");
        boolean areEqual = Intrinsics.areEqual(name, C2230a.echo);
        v[] vVarArr = golf;
        if (areEqual && (classDescriptor instanceof C1661i)) {
            Ne.f fVar = AbstractC2120h.echo;
            if (AbstractC2120h.bravo(classDescriptor, me.m.golf) || AbstractC2120h.quebec(classDescriptor) != null) {
                C1661i c1661i = (C1661i) classDescriptor;
                List list2 = c1661i.teal.f1569j;
                Intrinsics.delta(list2, "classDescriptor.classProto.functionList");
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(Zd.a.bravo((Ke.e) c1661i.e.bravo, ((y) it.next()).white), C2230a.echo)) {
                            return CollectionsKt.emptyList();
                        }
                    }
                }
                InterfaceC2344t w4 = ((ak) CollectionsKt.j(((ae) K4.alpha(this.delta, vVarArr[1])).olive().charlie(name, EnumC3339b.alpha))).w();
                w4.romeo(c1661i);
                w4.oscar(AbstractC2340p.echo);
                w4.hotel(c1661i.oscar());
                w4.india(c1661i.C());
                InterfaceC2345u build = w4.build();
                Intrinsics.checkNotNull(build);
                return kotlin.collections.ab.juliet((ak) build);
            }
        }
        golf().getClass();
        ag agVar = new ag(name, 1);
        Ce.j foxtrot = foxtrot(classDescriptor);
        if (foxtrot == null) {
            list = CollectionsKt.emptyList();
        } else {
            Ne.c golf2 = Ue.e.golf(foxtrot);
            C2231b builtIns = C2231b.foxtrot;
            Intrinsics.echo(builtIns, "builtIns");
            InterfaceC2330f bravo = C2234e.bravo(golf2, builtIns);
            if (bravo == null) {
                listOf = kotlin.collections.u.alpha;
            } else {
                String str = C2233d.alpha;
                Ne.c cVar = (Ne.c) C2233d.kilo.get(Ue.e.hotel(bravo));
                if (cVar == null) {
                    listOf = kotlin.collections.ab.oscar(bravo);
                } else {
                    listOf = CollectionsKt.listOf(bravo, builtIns.india(cVar));
                }
            }
            Iterable iterable = listOf;
            Intrinsics.echo(iterable, "<this>");
            if (iterable instanceof List) {
                List list3 = (List) iterable;
                if (!list3.isEmpty()) {
                    obj = list3.get(list3.size() - 1);
                    interfaceC2330f = (InterfaceC2330f) obj;
                    if (interfaceC2330f != null) {
                        list = CollectionsKt.emptyList();
                    } else {
                        int i4 = C2259n.red;
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Ue.e.golf((InterfaceC2330f) it2.next()));
                        }
                        C2259n c2259n = new C2259n();
                        c2259n.addAll(arrayList);
                        String str2 = C2233d.alpha;
                        boolean containsKey = C2233d.juliet.containsKey(Qe.e.golf(classDescriptor));
                        Ne.c golf3 = Ue.e.golf(foxtrot);
                        Xa.f fVar2 = new Xa.f(28, foxtrot, interfaceC2330f);
                        ff.e eVar = this.echo;
                        eVar.getClass();
                        Object invoke = eVar.invoke(new ff.g(golf3, fVar2));
                        if (invoke != null) {
                            Xe.n x4 = ((InterfaceC2330f) invoke).x();
                            Intrinsics.delta(x4, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                            Iterable iterable2 = (Iterable) agVar.invoke(x4);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : iterable2) {
                                ak akVar3 = (ak) obj2;
                                if (akVar3.november() == 1 && akVar3.getVisibility().alpha.bravo && !AbstractC2120h.azure(akVar3)) {
                                    Collection mike = akVar3.mike();
                                    if (!(mike instanceof Collection) || !mike.isEmpty()) {
                                        Iterator it3 = mike.iterator();
                                        while (it3.hasNext()) {
                                            InterfaceC2335k lima = ((InterfaceC2345u) it3.next()).lima();
                                            Intrinsics.delta(lima, "it.containingDeclaration");
                                            if (c2259n.contains(Ue.e.golf(lima))) {
                                                break;
                                            }
                                        }
                                    }
                                    InterfaceC2335k lima2 = akVar3.lima();
                                    Intrinsics.charlie(lima2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (C2245p.delta.contains(AbstractC2643e5.foxtrot((InterfaceC2330f) lima2, AbstractC2661g5.delta(akVar3, 3))) ^ containsKey) {
                                        booleanValue = true;
                                    } else {
                                        Boolean golf4 = AbstractC2262q.golf(kotlin.collections.ab.juliet(akVar3), C2234e.alpha, new C0769g(14, this));
                                        Intrinsics.delta(golf4, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        booleanValue = golf4.booleanValue();
                                    }
                                    if (!booleanValue) {
                                        z2 = true;
                                        if (!z2) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                }
                            }
                            akVar = null;
                            list = arrayList2;
                            ArrayList arrayList3 = new ArrayList();
                            for (ak akVar4 : list) {
                                InterfaceC2335k lima3 = akVar4.lima();
                                Intrinsics.charlie(lima3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                InterfaceC2345u delta = akVar4.delta(new ax(AbstractC2672h7.bravo((InterfaceC2330f) lima3, classDescriptor)));
                                Intrinsics.charlie(delta, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                                InterfaceC2344t w10 = ((ak) delta).w();
                                w10.romeo(classDescriptor);
                                w10.india(classDescriptor.C());
                                w10.echo();
                                InterfaceC2335k lima4 = akVar4.lima();
                                Intrinsics.charlie(lima4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                Object echo = AbstractC2262q.echo(kotlin.collections.ab.juliet((InterfaceC2330f) lima4), new C1718a(13, this), new C2242m(AbstractC2661g5.delta(akVar4, 3), new Ref.ObjectRef()));
                                Intrinsics.delta(echo, "jvmDescriptor = computeJ…CONSIDERED\n            })");
                                int ordinal = ((EnumC2239j) echo).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 2) {
                                        w10.victor((InterfaceC2472h) K4.alpha(this.foxtrot, vVarArr[2]));
                                    }
                                    InterfaceC2345u build2 = w10.build();
                                    Intrinsics.checkNotNull(build2);
                                    akVar2 = (ak) build2;
                                } else {
                                    if (classDescriptor.golf() == 1 && classDescriptor.c() != 3) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        w10.lima();
                                        InterfaceC2345u build22 = w10.build();
                                        Intrinsics.checkNotNull(build22);
                                        akVar2 = (ak) build22;
                                    }
                                    akVar2 = akVar;
                                }
                                if (akVar2 != null) {
                                    arrayList3.add(akVar2);
                                }
                            }
                            return arrayList3;
                        }
                        ff.e.alpha(3);
                        throw null;
                    }
                }
                obj = null;
                interfaceC2330f = (InterfaceC2330f) obj;
                if (interfaceC2330f != null) {
                }
            } else {
                Iterator it4 = iterable.iterator();
                if (it4.hasNext()) {
                    Object next = it4.next();
                    while (it4.hasNext()) {
                        next = it4.next();
                    }
                    obj = next;
                    interfaceC2330f = (InterfaceC2330f) obj;
                    if (interfaceC2330f != null) {
                    }
                }
                obj = null;
                interfaceC2330f = (InterfaceC2330f) obj;
                if (interfaceC2330f != null) {
                }
            }
        }
        akVar = null;
        ArrayList arrayList32 = new ArrayList();
        while (r1.hasNext()) {
        }
        return arrayList32;
    }

    @Override // re.InterfaceC2518b
    public final List charlie(InterfaceC2330f classDescriptor) {
        int collectionSizeOrDefault;
        Intrinsics.echo(classDescriptor, "classDescriptor");
        if (classDescriptor.c() == 1) {
            golf().getClass();
            Ce.j foxtrot = foxtrot(classDescriptor);
            if (foxtrot == null) {
                return CollectionsKt.emptyList();
            }
            InterfaceC2330f bravo = C2234e.bravo(Ue.e.golf(foxtrot), C2231b.foxtrot);
            if (bravo == null) {
                return CollectionsKt.emptyList();
            }
            ax axVar = new ax(AbstractC2672h7.bravo(bravo, foxtrot));
            List list = (List) foxtrot.f915j.quebec.invoke();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                Ne.e eVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C2859i c2859i = (C2859i) next;
                C2859i c2859i2 = c2859i;
                if (c2859i2.getVisibility().alpha.bravo) {
                    Collection xray = bravo.xray();
                    Intrinsics.delta(xray, "defaultKotlinVersion.constructors");
                    Collection<C2859i> collection = xray;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        for (C2859i it2 : collection) {
                            Intrinsics.delta(it2, "it");
                            if (Qe.k.juliet(it2, c2859i.delta(axVar)) == 1) {
                                break;
                            }
                        }
                    }
                    if (c2859i2.peach().size() == 1) {
                        List valueParameters = c2859i2.peach();
                        Intrinsics.delta(valueParameters, "valueParameters");
                        InterfaceC2332h kilo = ((aq) CollectionsKt.k(valueParameters)).getType().green().kilo();
                        if (kilo != null) {
                            eVar = Ue.e.hotel(kilo);
                        }
                        if (Intrinsics.areEqual(eVar, Ue.e.hotel(classDescriptor))) {
                        }
                    }
                    if (!AbstractC2120h.azure(c2859i) && !C2245p.echo.contains(AbstractC2643e5.foxtrot(foxtrot, AbstractC2661g5.delta(c2859i, 3)))) {
                        arrayList.add(next);
                    }
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C2859i c2859i3 = (C2859i) it3.next();
                C2859i c2859i4 = c2859i3;
                c2859i4.getClass();
                C2869s f02 = c2859i4.f0(ax.bravo);
                f02.purple = classDescriptor;
                f02.hotel(classDescriptor.oscar());
                f02.f13766h = true;
                av foxtrot2 = axVar.foxtrot();
                if (foxtrot2 != null) {
                    f02.alpha = foxtrot2;
                    if (!C2245p.foxtrot.contains(AbstractC2643e5.foxtrot(foxtrot, AbstractC2661g5.delta(c2859i3, 3)))) {
                        f02.victor((InterfaceC2472h) K4.alpha(this.foxtrot, golf[2]));
                    }
                    AbstractC2870t c02 = f02.f13775q.c0(f02);
                    Intrinsics.charlie(c02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((C2859i) c02);
                } else {
                    C2869s.alpha(37);
                    throw null;
                }
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }

    @Override // re.InterfaceC2520d
    public final boolean delta(InterfaceC2330f classDescriptor, r rVar) {
        Intrinsics.echo(classDescriptor, "classDescriptor");
        Ce.j foxtrot = foxtrot(classDescriptor);
        if (foxtrot != null && rVar.getAnnotations().D(re.e.alpha)) {
            golf().getClass();
            String delta = AbstractC2661g5.delta(rVar, 3);
            Ce.p cyan = foxtrot.cyan();
            Ne.f name = rVar.getName();
            Intrinsics.delta(name, "functionDescriptor.name");
            Collection charlie = cyan.charlie(name, EnumC3339b.alpha);
            if (!(charlie instanceof Collection) || !charlie.isEmpty()) {
                Iterator it = charlie.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(AbstractC2661g5.delta((ak) it.next(), 3), delta)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // re.InterfaceC2518b
    public final List echo(InterfaceC2330f classDescriptor) {
        boolean z2;
        boolean z10 = true;
        Intrinsics.echo(classDescriptor, "classDescriptor");
        Ne.e hotel = Ue.e.hotel(classDescriptor);
        LinkedHashSet linkedHashSet = C2245p.alpha;
        Ne.e eVar = me.m.golf;
        if (!Intrinsics.areEqual(hotel, eVar) && me.m.purple.get(hotel) == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        ae aeVar = this.charlie;
        if (z2) {
            ae cloneableType = (ae) K4.alpha(this.delta, golf[1]);
            Intrinsics.delta(cloneableType, "cloneableType");
            return CollectionsKt.listOf(cloneableType, aeVar);
        }
        if (!Intrinsics.areEqual(hotel, eVar) && me.m.purple.get(hotel) == null) {
            String str = C2233d.alpha;
            Ne.b foxtrot = C2233d.foxtrot(hotel);
            if (foxtrot != null) {
                try {
                    z10 = Serializable.class.isAssignableFrom(Class.forName(foxtrot.bravo().bravo()));
                } catch (ClassNotFoundException unused) {
                }
            }
            z10 = false;
        }
        if (z10) {
            return kotlin.collections.ab.juliet(aeVar);
        }
        return CollectionsKt.emptyList();
    }

    public final Ce.j foxtrot(InterfaceC2330f interfaceC2330f) {
        if (interfaceC2330f != null) {
            Ne.f fVar = AbstractC2120h.echo;
            if (!AbstractC2120h.bravo(interfaceC2330f, me.m.alpha) && AbstractC2120h.crimson(interfaceC2330f)) {
                Ne.e hotel = Ue.e.hotel(interfaceC2330f);
                if (hotel.delta()) {
                    String str = C2233d.alpha;
                    Ne.b foxtrot = C2233d.foxtrot(hotel);
                    if (foxtrot != null) {
                        InterfaceC2330f juliet = AbstractC2347w.juliet(golf().alpha, foxtrot.bravo());
                        if (juliet instanceof Ce.j) {
                            return (Ce.j) juliet;
                        }
                    }
                }
            }
            return null;
        }
        AbstractC2120h.alpha(108);
        throw null;
    }

    public final C2237h golf() {
        return (C2237h) K4.alpha(this.bravo, golf[0]);
    }
}
