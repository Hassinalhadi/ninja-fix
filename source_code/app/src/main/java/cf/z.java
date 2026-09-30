package cf;

import B9.K;
import Ie.an;
import Ie.ao;
import Ie.aq;
import Ie.av;
import com.google.mlkit.vision.barcode.common.Barcode;
import ef.C1653a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ai;
import kotlin.reflect.jvm.internal.impl.types.aj;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.az;
import me.AbstractC2120h;
import ne.EnumC2181e;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2349y;
import pf.AbstractC2360j;
import pf.C2364n;
import qe.C2471g;
import qe.C2473i;
import qe.InterfaceC2472h;
import re.C2517a;
import s6.AbstractC2626c6;
import s6.D6;
import s6.O5;

/* loaded from: classes2.dex */
public final class z {
    public final D5.s alpha;
    public final z bravo;
    public final String charlie;
    public final String delta;
    public final ff.j echo;
    public final ff.j foxtrot;
    public final Object golf;

    public z(D5.s c3, z zVar, List typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(typeParameterProtos, "typeParameterProtos");
        Intrinsics.echo(debugName, "debugName");
        this.alpha = c3;
        this.bravo = zVar;
        this.charlie = debugName;
        this.delta = str;
        K k6 = (K) c3.alpha;
        this.echo = ((ff.l) k6.alpha).delta(new w(this, 0));
        this.foxtrot = ((ff.l) k6.alpha).delta(new w(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kotlin.collections.t.alpha;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                av avVar = (av) it.next();
                linkedHashMap.put(Integer.valueOf(avVar.silver), new ef.t(this.alpha, avVar, i4));
                i4++;
            }
        }
        this.golf = linkedHashMap;
    }

    public static ae alpha(ae aeVar, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        int collectionSizeOrDefault;
        AbstractC2120h echo = O5.echo(aeVar);
        InterfaceC2472h annotations = aeVar.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.y foxtrot = D6.foxtrot(aeVar);
        List delta = D6.delta(aeVar);
        List cyan = CollectionsKt.cyan(D6.golf(aeVar));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = cyan.iterator();
        while (it.hasNext()) {
            arrayList.add(((as) it.next()).bravo());
        }
        return D6.bravo(echo, annotations, foxtrot, delta, arrayList, yVar, true).pink(aeVar.indigo());
    }

    public static final ArrayList echo(aq aqVar, z zVar) {
        List list;
        List argumentList = aqVar.silver;
        Intrinsics.delta(argumentList, "argumentList");
        aq foxtrot = AbstractC2626c6.foxtrot(aqVar, (G6.j) zVar.alpha.delta);
        if (foxtrot != null) {
            list = echo(foxtrot, zVar);
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return CollectionsKt.a(argumentList, list);
    }

    public static al foxtrot(List list, InterfaceC2472h interfaceC2472h, ap apVar, InterfaceC2335k interfaceC2335k) {
        int collectionSizeOrDefault;
        al echo;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.types.n) it.next()).getClass();
            if (interfaceC2472h.isEmpty()) {
                al.purple.getClass();
                echo = al.red;
            } else {
                com.google.android.play.core.integrity.k kVar = al.purple;
                List juliet = ab.juliet(new kotlin.reflect.jvm.internal.impl.types.j(interfaceC2472h));
                kVar.getClass();
                echo = com.google.android.play.core.integrity.k.echo(juliet);
            }
            arrayList.add(echo);
        }
        ArrayList indigo = CollectionsKt.indigo(arrayList);
        al.purple.getClass();
        return com.google.android.play.core.integrity.k.echo(indigo);
    }

    public static final InterfaceC2330f hotel(z zVar, aq aqVar, int i4) {
        Ne.b alpha = Zd.a.alpha((Ke.e) zVar.alpha.bravo, i4);
        C2364n oscar = AbstractC2360j.oscar(AbstractC2360j.lima(aqVar, new w(zVar, 2)), y.alpha);
        ArrayList arrayList = new ArrayList();
        Iterator it = oscar.alpha.iterator();
        while (it.hasNext()) {
            arrayList.add(oscar.bravo.invoke(it.next()));
        }
        int echo = AbstractC2360j.echo(AbstractC2360j.lima(alpha, x.alpha));
        while (arrayList.size() < echo) {
            arrayList.add(0);
        }
        return ((J2.i) ((K) zVar.alpha.alpha).lima).alpha(alpha, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final List bravo() {
        return CollectionsKt.z(this.golf.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final pe.aq charlie(int i4) {
        pe.aq aqVar = (pe.aq) this.golf.get(Integer.valueOf(i4));
        if (aqVar == null) {
            z zVar = this.bravo;
            if (zVar != null) {
                return zVar.charlie(i4);
            }
            return null;
        }
        return aqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a2  */
    /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.reflect.jvm.internal.impl.types.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ae delta(aq proto, boolean z2) {
        ap delta;
        InterfaceC2332h interfaceC2332h;
        Object obj;
        int collectionSizeOrDefault;
        aq aqVar;
        ae computedType;
        ae oscar;
        EnumC2181e enumC2181e;
        as asVar;
        kotlin.reflect.jvm.internal.impl.types.y bravo;
        Ne.c cVar;
        InterfaceC2326b interfaceC2326b;
        Ne.c cVar2;
        int size;
        int collectionSizeOrDefault2;
        InterfaceC2472h c2473i;
        boolean z10;
        int i4;
        aq aqVar2;
        Object atVar;
        int i5 = 1;
        Intrinsics.echo(proto, "proto");
        boolean papa = proto.papa();
        D5.s sVar = this.alpha;
        if (papa) {
            if (Zd.a.alpha((Ke.e) sVar.bravo, proto.f1475b).charlie) {
                ((C0853i) ((K) sVar.alpha).golf).getClass();
            }
        } else if ((proto.red & 128) == 128) {
            if (Zd.a.alpha((Ke.e) sVar.bravo, proto.e).charlie) {
                ((C0853i) ((K) sVar.alpha).golf).getClass();
            }
        }
        if (proto.papa()) {
            interfaceC2332h = (InterfaceC2332h) this.echo.invoke(Integer.valueOf(proto.f1475b));
            if (interfaceC2332h == null) {
                interfaceC2332h = hotel(this, proto, proto.f1475b);
            }
        } else {
            int i10 = proto.red;
            if ((i10 & 32) == 32) {
                interfaceC2332h = charlie(proto.f1476c);
                if (interfaceC2332h == null) {
                    hf.i iVar = hf.i.alpha;
                    delta = hf.i.delta(hf.h.f12728h, String.valueOf(proto.f1476c), this.delta);
                }
            } else if ((i10 & 64) == 64) {
                String string = ((Ke.e) sVar.bravo).getString(proto.f1477d);
                Iterator it = bravo().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((pe.aq) obj).getName().bravo(), string)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                pe.aq aqVar3 = (pe.aq) obj;
                if (aqVar3 == null) {
                    hf.i iVar2 = hf.i.alpha;
                    delta = hf.i.delta(hf.h.f12729i, string, ((InterfaceC2335k) sVar.charlie).toString());
                } else {
                    interfaceC2332h = aqVar3;
                }
            } else if ((i10 & 128) == 128) {
                interfaceC2332h = (InterfaceC2332h) this.foxtrot.invoke(Integer.valueOf(proto.e));
                if (interfaceC2332h == null) {
                    interfaceC2332h = hotel(this, proto, proto.e);
                }
            } else {
                hf.i iVar3 = hf.i.alpha;
                delta = hf.i.delta(hf.h.f12731k, new String[0]);
            }
            if (!hf.i.foxtrot(delta.kilo())) {
                hf.i iVar4 = hf.i.alpha;
                return hf.i.echo(hf.h.f12736p, CollectionsKt.emptyList(), delta, (String[]) Arrays.copyOf(new String[]{delta.toString()}, 1));
            }
            C1653a c1653a = new C1653a((ff.l) ((K) sVar.alpha).alpha, new Xa.f(6, this, proto));
            K k6 = (K) sVar.alpha;
            List list = (List) k6.sierra;
            InterfaceC2335k interfaceC2335k = (InterfaceC2335k) sVar.charlie;
            al foxtrot = foxtrot(list, c1653a, delta, interfaceC2335k);
            ArrayList echo = echo(proto, this);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(echo, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = echo.iterator();
            int i11 = 0;
            while (true) {
                boolean hasNext = it2.hasNext();
                G6.j jVar = (G6.j) sVar.delta;
                if (hasNext) {
                    Object next = it2.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ao aoVar = (ao) next;
                    List parameters = delta.getParameters();
                    Intrinsics.delta(parameters, "constructor.parameters");
                    pe.aq aqVar4 = (pe.aq) CollectionsKt.jade(i11, parameters);
                    an anVar = aoVar.red;
                    if (anVar == an.STAR) {
                        if (aqVar4 == null) {
                            atVar = new ai(((InterfaceC2349y) k6.bravo).juliet());
                        } else {
                            atVar = new aj(aqVar4);
                        }
                    } else {
                        Intrinsics.delta(anVar, "typeArgumentProto.projection");
                        int ordinal = anVar.ordinal();
                        if (ordinal != 0) {
                            i4 = 3;
                            if (ordinal != i5) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + anVar);
                                }
                                i4 = 1;
                            }
                        } else {
                            i4 = 2;
                        }
                        int i13 = aoVar.purple;
                        if ((i13 & 2) == 2) {
                            aqVar2 = aoVar.silver;
                        } else if ((i13 & 4) == 4) {
                            aqVar2 = jVar.alpha(aoVar.teal);
                        } else {
                            aqVar2 = null;
                        }
                        if (aqVar2 == null) {
                            atVar = new at(1, hf.i.charlie(hf.h.f12741u, aoVar.toString()));
                        } else {
                            atVar = new at(i4, golf(aqVar2));
                        }
                    }
                    arrayList.add(atVar);
                    i11 = i12;
                    i5 = 1;
                } else {
                    List arguments = CollectionsKt.z(arrayList);
                    InterfaceC2332h kilo = delta.kilo();
                    if (z2 && (kilo instanceof ef.s)) {
                        ef.s sVar2 = (ef.s) kilo;
                        int i14 = kotlin.reflect.jvm.internal.impl.types.ab.alpha;
                        Intrinsics.echo(sVar2, "<this>");
                        Intrinsics.echo(arguments, "arguments");
                        ?? obj2 = new Object();
                        List parameters2 = sVar2.yellow.getParameters();
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                        Iterator it3 = parameters2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((pe.aq) it3.next()).alpha());
                        }
                        aqVar = null;
                        J2.i iVar5 = new J2.i(aqVar, sVar2, arguments, kotlin.collections.y.yankee(CollectionsKt.H(arrayList2, arguments)));
                        al.purple.getClass();
                        al attributes = al.red;
                        Intrinsics.echo(attributes, "attributes");
                        ae hotel = obj2.hotel(iVar5, attributes, false, 0, true);
                        List list2 = (List) k6.sierra;
                        ArrayList yellow = CollectionsKt.yellow(c1653a, hotel.getAnnotations());
                        if (yellow.isEmpty()) {
                            c2473i = C2471g.alpha;
                        } else {
                            c2473i = new C2473i(0, yellow);
                        }
                        al foxtrot2 = foxtrot(list2, c2473i, delta, interfaceC2335k);
                        if (!az.foxtrot(hotel) && !proto.teal) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        computedType = hotel.pink(z10).white(foxtrot2);
                    } else {
                        aqVar = null;
                        if (Ke.d.alpha.echo(proto.f1482j).booleanValue()) {
                            boolean z11 = proto.teal;
                            int size2 = delta.getParameters().size() - arguments.size();
                            if (size2 != 0) {
                                if (size2 == 1 && (size = arguments.size() - 1) >= 0) {
                                    ap tango = delta.juliet().uniform(size).tango();
                                    Intrinsics.delta(tango, "functionTypeConstructor.…on(arity).typeConstructor");
                                    oscar = kotlin.reflect.jvm.internal.impl.types.ab.charlie(arguments, foxtrot, tango, z11);
                                    if (oscar == null) {
                                        hf.i iVar6 = hf.i.alpha;
                                        computedType = hf.i.echo(hf.h.f12730j, arguments, delta, new String[0]);
                                    }
                                    computedType = oscar;
                                }
                                oscar = null;
                                if (oscar == null) {
                                }
                                computedType = oscar;
                            } else {
                                oscar = kotlin.reflect.jvm.internal.impl.types.ab.charlie(arguments, foxtrot, delta, z11);
                                InterfaceC2332h kilo2 = oscar.green().kilo();
                                if (kilo2 != null) {
                                    enumC2181e = D6.echo(kilo2);
                                } else {
                                    enumC2181e = null;
                                }
                                if (enumC2181e == EnumC2181e.silver && (asVar = (as) CollectionsKt.olive(D6.golf(oscar))) != null && (bravo = asVar.bravo()) != null) {
                                    InterfaceC2332h kilo3 = bravo.green().kilo();
                                    if (kilo3 != null) {
                                        cVar = Ue.e.golf(kilo3);
                                    } else {
                                        cVar = null;
                                    }
                                    if (bravo.cyan().size() == 1 && (Intrinsics.areEqual(cVar, me.n.foxtrot) || Intrinsics.areEqual(cVar, aa.alpha))) {
                                        kotlin.reflect.jvm.internal.impl.types.y bravo2 = ((as) CollectionsKt.k(bravo.cyan())).bravo();
                                        Intrinsics.delta(bravo2, "continuationArgumentType.arguments.single().type");
                                        if (interfaceC2335k instanceof InterfaceC2326b) {
                                            interfaceC2326b = (InterfaceC2326b) interfaceC2335k;
                                        } else {
                                            interfaceC2326b = null;
                                        }
                                        if (interfaceC2326b != null) {
                                            cVar2 = Ue.e.charlie(interfaceC2326b);
                                        } else {
                                            cVar2 = null;
                                        }
                                        oscar = Intrinsics.areEqual(cVar2, v.alpha) ? alpha(oscar, bravo2) : alpha(oscar, bravo2);
                                    }
                                    if (oscar == null) {
                                    }
                                    computedType = oscar;
                                }
                                oscar = null;
                                if (oscar == null) {
                                }
                                computedType = oscar;
                            }
                        } else {
                            computedType = kotlin.reflect.jvm.internal.impl.types.ab.charlie(arguments, foxtrot, delta, proto.teal);
                            if (Ke.d.bravo.echo(proto.f1482j).booleanValue()) {
                                oscar = kotlin.reflect.jvm.internal.impl.types.e.oscar(computedType, true);
                                if (oscar == null) {
                                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + computedType + '\'').toString());
                                }
                                computedType = oscar;
                            }
                        }
                    }
                    int i15 = proto.red;
                    if ((i15 & Barcode.FORMAT_UPC_E) == 1024) {
                        aqVar = proto.f1480h;
                    } else if ((i15 & 2048) == 2048) {
                        aqVar = jVar.alpha(proto.f1481i);
                    }
                    if (aqVar != null) {
                        computedType = kotlin.reflect.jvm.internal.impl.types.c.zulu(computedType, delta(aqVar, false));
                    }
                    if (proto.papa()) {
                        Zd.a.alpha((Ke.e) sVar.bravo, proto.f1475b);
                        ((C2517a) k6.romeo).getClass();
                        Intrinsics.echo(computedType, "computedType");
                    }
                    return computedType;
                }
            }
        }
        delta = interfaceC2332h.tango();
        Intrinsics.delta(delta, "classifier.typeConstructor");
        if (!hf.i.foxtrot(delta.kilo())) {
        }
    }

    public final kotlin.reflect.jvm.internal.impl.types.y golf(aq proto) {
        boolean z2;
        aq aqVar;
        Intrinsics.echo(proto, "proto");
        boolean z10 = false;
        if ((proto.red & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            D5.s sVar = this.alpha;
            String string = ((Ke.e) sVar.bravo).getString(proto.white);
            ae delta = delta(proto, true);
            G6.j jVar = (G6.j) sVar.delta;
            int i4 = proto.red;
            if ((i4 & 4) == 4) {
                z10 = true;
            }
            if (z10) {
                aqVar = proto.yellow;
            } else if ((i4 & 8) == 8) {
                aqVar = jVar.alpha(proto.f1474a);
            } else {
                aqVar = null;
            }
            Intrinsics.checkNotNull(aqVar);
            return ((InterfaceC0855k) ((K) sVar.alpha).juliet).alpha(proto, string, delta, delta(aqVar, true));
        }
        return delta(proto, true);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.charlie);
        z zVar = this.bravo;
        if (zVar == null) {
            str = "";
        } else {
            str = ". Child of " + zVar.charlie;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
