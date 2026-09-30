package ef;

import B9.K;
import Ce.ab;
import Ie.C0181a;
import Ie.E;
import Ie.ag;
import Ie.aq;
import Ie.as;
import Ie.y;
import aa.AbstractC0417a;
import cf.z;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.ae;
import of.AbstractC2262q;
import pe.C2339o;
import pe.InterfaceC2335k;
import pf.AbstractC2360j;
import qe.C2471g;
import qe.C2473i;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class m extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ n purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<y> emptyList;
        List<ag> emptyList2;
        int collectionSizeOrDefault;
        InterfaceC2472h c2473i;
        D5.s alpha;
        aq underlyingType;
        aq expandedType;
        switch (this.alpha) {
            case 0:
                Ne.f it = (Ne.f) obj;
                Intrinsics.echo(it, "it");
                n nVar = this.purple;
                LinkedHashMap linkedHashMap = nVar.alpha;
                C0181a PARSER = y.f1611o;
                Intrinsics.delta(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                o oVar = nVar.india;
                if (bArr == null || (emptyList = AbstractC2360j.quebec(AbstractC2360j.mike(new ab(PARSER, new ByteArrayInputStream(bArr), oVar, 6)))) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(emptyList.size());
                for (y it2 : emptyList) {
                    cf.q qVar = (cf.q) oVar.bravo.india;
                    Intrinsics.delta(it2, "it");
                    r echo = qVar.echo(it2);
                    if (!oVar.romeo(echo)) {
                        echo = null;
                    }
                    if (echo != null) {
                        arrayList.add(echo);
                    }
                }
                oVar.juliet(it, arrayList);
                return AbstractC2262q.delta(arrayList);
            case 1:
                Ne.f it3 = (Ne.f) obj;
                Intrinsics.echo(it3, "it");
                n nVar2 = this.purple;
                LinkedHashMap linkedHashMap2 = nVar2.bravo;
                C0181a PARSER2 = ag.f1445o;
                Intrinsics.delta(PARSER2, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it3);
                o oVar2 = nVar2.india;
                if (bArr2 == null || (emptyList2 = AbstractC2360j.quebec(AbstractC2360j.mike(new ab(PARSER2, new ByteArrayInputStream(bArr2), oVar2, 6)))) == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(emptyList2.size());
                for (ag it4 : emptyList2) {
                    cf.q qVar2 = (cf.q) oVar2.bravo.india;
                    Intrinsics.delta(it4, "it");
                    arrayList2.add(qVar2.foxtrot(it4));
                }
                oVar2.kilo(it3, arrayList2);
                return AbstractC2262q.delta(arrayList2);
            default:
                Ne.f it5 = (Ne.f) obj;
                Intrinsics.echo(it5, "it");
                n nVar3 = this.purple;
                byte[] bArr3 = (byte[]) nVar3.charlie.get(it5);
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    o oVar3 = nVar3.india;
                    as asVar = (as) as.f1491i.charlie(byteArrayInputStream, (Oe.h) ((K) oVar3.bravo.alpha).papa);
                    if (asVar != null) {
                        cf.q qVar3 = (cf.q) oVar3.bravo.india;
                        qVar3.getClass();
                        List list = asVar.f1495d;
                        Intrinsics.delta(list, "proto.annotationList");
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                        Iterator it6 = list.iterator();
                        while (true) {
                            boolean hasNext = it6.hasNext();
                            D5.s sVar = qVar3.alpha;
                            if (hasNext) {
                                Ie.g it7 = (Ie.g) it6.next();
                                Intrinsics.delta(it7, "it");
                                arrayList3.add(qVar3.bravo.lima(it7, (Ke.e) sVar.bravo));
                            } else {
                                if (arrayList3.isEmpty()) {
                                    c2473i = C2471g.alpha;
                                } else {
                                    c2473i = new C2473i(0, arrayList3);
                                }
                                InterfaceC2472h interfaceC2472h = c2473i;
                                C2339o alpha2 = AbstractC0417a.alpha((E) Ke.d.delta.echo(asVar.silver));
                                ff.l lVar = (ff.l) ((K) sVar.alpha).alpha;
                                Ne.f bravo = Zd.a.bravo((Ke.e) sVar.bravo, asVar.teal);
                                G6.j jVar = (G6.j) sVar.delta;
                                s sVar2 = new s(lVar, (InterfaceC2335k) sVar.charlie, interfaceC2472h, bravo, alpha2, asVar, (Ke.e) sVar.bravo, jVar, (Ke.f) sVar.echo, (Ge.g) sVar.golf);
                                List list2 = asVar.white;
                                Intrinsics.delta(list2, "proto.typeParameterList");
                                alpha = sVar.alpha(sVar2, list2, (Ke.e) sVar.bravo, (G6.j) sVar.delta, (Ke.f) sVar.echo, (Ke.a) sVar.foxtrot);
                                z zVar = (z) alpha.hotel;
                                List bravo2 = zVar.bravo();
                                int i4 = asVar.red;
                                if ((i4 & 4) == 4) {
                                    underlyingType = asVar.yellow;
                                    Intrinsics.delta(underlyingType, "underlyingType");
                                } else if ((i4 & 8) == 8) {
                                    underlyingType = jVar.alpha(asVar.f1492a);
                                } else {
                                    throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                }
                                ae delta = zVar.delta(underlyingType, false);
                                int i5 = asVar.red;
                                if ((i5 & 16) == 16) {
                                    expandedType = asVar.f1493b;
                                    Intrinsics.delta(expandedType, "expandedType");
                                } else if ((i5 & 32) == 32) {
                                    expandedType = jVar.alpha(asVar.f1494c);
                                } else {
                                    throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                }
                                sVar2.c0(bravo2, delta, zVar.delta(expandedType, false));
                                return sVar2;
                            }
                        }
                    }
                }
                return null;
        }
    }
}
