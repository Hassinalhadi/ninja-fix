package cf;

import A2.aj;
import B9.K;
import Ie.E;
import Ie.ag;
import Ie.aq;
import Ie.ay;
import aa.AbstractC0417a;
import com.google.mlkit.vision.barcode.common.Barcode;
import ef.C1653a;
import ef.C1655c;
import ef.C1661i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import pe.C2339o;
import pe.InterfaceC2321ad;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2349y;
import pe.an;
import pe.ao;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.AbstractC2626c6;
import se.C2871u;
import se.ab;
import se.ai;

/* loaded from: classes2.dex */
public final class q {
    public final D5.s alpha;
    public final J2.c bravo;

    public q(D5.s c3) {
        Intrinsics.echo(c3, "c");
        this.alpha = c3;
        K k6 = (K) c3.alpha;
        this.bravo = new J2.c((InterfaceC2349y) k6.bravo, (J2.i) k6.lima);
    }

    public final aj alpha(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k instanceof InterfaceC2321ad) {
            Ne.c cVar = ((ab) ((InterfaceC2321ad) interfaceC2335k)).teal;
            D5.s sVar = this.alpha;
            return new s(cVar, (Ke.e) sVar.bravo, (G6.j) sVar.delta, (Ge.g) sVar.golf);
        }
        if (interfaceC2335k instanceof C1661i) {
            return ((C1661i) interfaceC2335k).f12597p;
        }
        return null;
    }

    public final InterfaceC2472h bravo(Oe.l lVar, int i4, int i5) {
        if (!Ke.d.charlie.echo(i4).booleanValue()) {
            return C2471g.alpha;
        }
        return new ef.u((ff.l) ((K) this.alpha.alpha).alpha, new C0857m(this, lVar, i5, 0));
    }

    public final InterfaceC2472h charlie(ag agVar, boolean z2) {
        if (!Ke.d.charlie.echo(agVar.silver).booleanValue()) {
            return C2471g.alpha;
        }
        return new ef.u((ff.l) ((K) this.alpha.alpha).alpha, new n(this, z2, agVar));
    }

    public final C1655c delta(Ie.l lVar, boolean z2) {
        D5.s alpha;
        D5.s sVar = this.alpha;
        InterfaceC2335k interfaceC2335k = (InterfaceC2335k) sVar.charlie;
        Intrinsics.charlie(interfaceC2335k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC2330f interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
        C1655c c1655c = new C1655c(interfaceC2330f, null, bravo(lVar, lVar.silver, 1), z2, 1, lVar, (Ke.e) sVar.bravo, (G6.j) sVar.delta, (Ke.f) sVar.echo, (Ge.g) sVar.golf, null);
        alpha = sVar.alpha(c1655c, CollectionsKt.emptyList(), (Ke.e) sVar.bravo, (G6.j) sVar.delta, (Ke.f) sVar.echo, (Ke.a) sVar.foxtrot);
        List list = lVar.teal;
        Intrinsics.delta(list, "proto.valueParameterList");
        c1655c.n0(((q) alpha.india).golf(list, lVar, 1), AbstractC0417a.alpha((E) Ke.d.delta.echo(lVar.silver)));
        c1655c.j0(interfaceC2330f.oscar());
        c1655c.f13785k = interfaceC2330f.emerald();
        c1655c.f13789o = !Ke.d.november.echo(lVar.silver).booleanValue();
        return c1655c;
    }

    public final ef.r echo(Ie.y proto) {
        int i4;
        InterfaceC2472h c1653a;
        Ke.f fVar;
        D5.s alpha;
        C2871u c2871u;
        InterfaceC2330f interfaceC2330f;
        C2871u c2871u2;
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.y golf;
        Intrinsics.echo(proto, "proto");
        int i5 = 1;
        if ((proto.red & 1) == 1) {
            i4 = proto.silver;
        } else {
            int i10 = proto.teal;
            i4 = ((i10 >> 8) << 6) + (i10 & 63);
        }
        int i11 = i4;
        InterfaceC2472h bravo = bravo(proto, i11, 1);
        int i12 = proto.red;
        int i13 = i12 & 32;
        C2470f c2470f = C2471g.alpha;
        D5.s sVar = this.alpha;
        if (i13 == 32 || (i12 & 64) == 64) {
            c1653a = new C1653a((ff.l) ((K) sVar.alpha).alpha, new C0857m(this, proto, i5, 1));
        } else {
            c1653a = c2470f;
        }
        Ne.c golf2 = Ue.e.golf((InterfaceC2335k) sVar.charlie);
        int i14 = proto.white;
        Ke.e eVar = (Ke.e) sVar.bravo;
        if (Intrinsics.areEqual(golf2.charlie(Zd.a.bravo(eVar, i14)), v.alpha)) {
            fVar = Ke.f.alpha;
        } else {
            fVar = (Ke.f) sVar.echo;
        }
        Ke.f fVar2 = fVar;
        Ne.f bravo2 = Zd.a.bravo(eVar, proto.white);
        int charlie = AbstractC0417a.charlie((Ie.z) Ke.d.oscar.echo(i11));
        G6.j jVar = (G6.j) sVar.delta;
        InterfaceC2472h interfaceC2472h = c1653a;
        ef.r rVar = new ef.r((InterfaceC2335k) sVar.charlie, null, bravo, bravo2, charlie, proto, (Ke.e) sVar.bravo, jVar, fVar2, (Ge.g) sVar.golf, null);
        List list = proto.f1613b;
        Intrinsics.delta(list, "proto.typeParameterList");
        alpha = sVar.alpha(rVar, list, (Ke.e) sVar.bravo, (G6.j) sVar.delta, (Ke.f) sVar.echo, (Ke.a) sVar.foxtrot);
        aq golf3 = AbstractC2626c6.golf(proto, jVar);
        z zVar = (z) alpha.hotel;
        if (golf3 != null && (golf = zVar.golf(golf3)) != null) {
            c2871u = Qe.l.kilo(rVar, golf, interfaceC2472h);
        } else {
            c2871u = null;
        }
        InterfaceC2335k interfaceC2335k = (InterfaceC2335k) sVar.charlie;
        if (interfaceC2335k instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null) {
            c2871u2 = interfaceC2330f.C();
        } else {
            c2871u2 = null;
        }
        List list2 = proto.e;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> contextReceiverTypeIdList = proto.f1616f;
            Intrinsics.delta(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypeIdList, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Integer it : contextReceiverTypeIdList) {
                Intrinsics.delta(it, "it");
                arrayList.add(jVar.alpha(it.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C2871u echo = Qe.l.echo(rVar, zVar.golf((aq) obj), null, c2470f, i15);
            if (echo != null) {
                arrayList2.add(echo);
            }
            i15 = i16;
        }
        List bravo3 = zVar.bravo();
        List list3 = proto.f1618h;
        Intrinsics.delta(list3, "proto.valueParameterList");
        rVar.n0(c2871u, c2871u2, arrayList2, bravo3, ((q) alpha.india).golf(list3, proto, 1), zVar.golf(AbstractC2626c6.hotel(proto, jVar)), C0853i.echo((Ie.aa) Ke.d.echo.echo(i11)), AbstractC0417a.alpha((E) Ke.d.delta.echo(i11)), kotlin.collections.t.alpha);
        rVar.f13780f = Ke.d.papa.echo(i11).booleanValue();
        rVar.f13781g = Ke.d.quebec.echo(i11).booleanValue();
        rVar.f13782h = Ke.d.tango.echo(i11).booleanValue();
        rVar.f13783i = Ke.d.romeo.echo(i11).booleanValue();
        rVar.f13784j = Ke.d.sierra.echo(i11).booleanValue();
        rVar.f13788n = Ke.d.uniform.echo(i11).booleanValue();
        rVar.f13785k = Ke.d.victor.echo(i11).booleanValue();
        rVar.f13789o = !Ke.d.whiskey.echo(i11).booleanValue();
        ((C0853i) ((K) sVar.alpha).mike).getClass();
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c4  */
    /* JADX WARN: Type inference failed for: r0v30, types: [se.r, G3.a] */
    /* JADX WARN: Type inference failed for: r3v25, types: [se.r, G3.a] */
    /* JADX WARN: Type inference failed for: r3v29, types: [ff.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [se.ah, se.n, ef.q, pe.al, pe.b] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [se.aj] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ef.q foxtrot(ag proto) {
        int i4;
        D5.s alpha;
        q qVar;
        InterfaceC2472h interfaceC2472h;
        InterfaceC2335k interfaceC2335k;
        InterfaceC2330f interfaceC2330f;
        C2871u c2871u;
        int i5;
        boolean z2;
        aq aqVar;
        C2871u c2871u2;
        List list;
        int collectionSizeOrDefault;
        E e;
        boolean z10;
        int i10;
        Throwable th;
        int i11;
        D5.s sVar;
        Ke.b bVar;
        Ke.c cVar;
        Ke.b bVar2;
        Ke.c cVar2;
        Ke.b bVar3;
        ao aoVar;
        ai aiVar;
        q qVar2;
        ai aiVar2;
        ?? r5;
        InterfaceC2330f interfaceC2330f2;
        int i12;
        int i13;
        D5.s alpha2;
        int i14;
        ai foxtrot;
        int collectionSizeOrDefault2;
        kotlin.reflect.jvm.internal.impl.types.y golf;
        Intrinsics.echo(proto, "proto");
        if ((proto.red & 1) == 1) {
            i4 = proto.silver;
        } else {
            int i15 = proto.teal;
            i4 = ((i15 >> 8) << 6) + (i15 & 63);
        }
        D5.s sVar2 = this.alpha;
        InterfaceC2335k interfaceC2335k2 = (InterfaceC2335k) sVar2.charlie;
        InterfaceC2472h bravo = bravo(proto, i4, 2);
        int echo = C0853i.echo((Ie.aa) Ke.d.echo.echo(i4));
        C2339o alpha3 = AbstractC0417a.alpha((E) Ke.d.delta.echo(i4));
        boolean booleanValue = Ke.d.xray.echo(i4).booleanValue();
        Ne.f bravo2 = Zd.a.bravo((Ke.e) sVar2.bravo, proto.white);
        int charlie = AbstractC0417a.charlie((Ie.z) Ke.d.oscar.echo(i4));
        boolean booleanValue2 = Ke.d.azure.echo(i4).booleanValue();
        boolean booleanValue3 = Ke.d.amber.echo(i4).booleanValue();
        boolean booleanValue4 = Ke.d.black.echo(i4).booleanValue();
        boolean booleanValue5 = Ke.d.blue.echo(i4).booleanValue();
        boolean booleanValue6 = Ke.d.bronze.echo(i4).booleanValue();
        int i16 = i4;
        G6.j jVar = (G6.j) sVar2.delta;
        ?? qVar3 = new ef.q(interfaceC2335k2, null, bravo, echo, alpha3, booleanValue, bravo2, charlie, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, proto, (Ke.e) sVar2.bravo, jVar, (Ke.f) sVar2.echo, (Ge.g) sVar2.golf);
        List list2 = proto.f1447b;
        Intrinsics.delta(list2, "proto.typeParameterList");
        alpha = sVar2.alpha(qVar3, list2, (Ke.e) sVar2.bravo, (G6.j) sVar2.delta, (Ke.f) sVar2.echo, (Ke.a) sVar2.foxtrot);
        boolean booleanValue7 = Ke.d.yankee.echo(i16).booleanValue();
        C2470f c2470f = C2471g.alpha;
        int i17 = 3;
        if (booleanValue7) {
            int i18 = proto.red;
            if ((i18 & 32) == 32 || (i18 & 64) == 64) {
                qVar = this;
                interfaceC2472h = new C1653a((ff.l) ((K) sVar2.alpha).alpha, new C0857m(qVar, proto, i17, 1));
                aq india = AbstractC2626c6.india(proto, jVar);
                z zVar = (z) alpha.hotel;
                kotlin.reflect.jvm.internal.impl.types.y golf2 = zVar.golf(india);
                List bravo3 = zVar.bravo();
                interfaceC2335k = (InterfaceC2335k) sVar2.charlie;
                if (!(interfaceC2335k instanceof InterfaceC2330f)) {
                    interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
                } else {
                    interfaceC2330f = null;
                }
                if (interfaceC2330f == null) {
                    c2871u = interfaceC2330f.C();
                } else {
                    c2871u = null;
                }
                i5 = proto.red;
                if ((i5 & 32) != 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    aqVar = proto.f1448c;
                } else if ((i5 & 64) == 64) {
                    aqVar = jVar.alpha(proto.f1449d);
                } else {
                    aqVar = null;
                }
                if (aqVar == null && (golf = zVar.golf(aqVar)) != null) {
                    c2871u2 = Qe.l.kilo(qVar3, golf, interfaceC2472h);
                } else {
                    c2871u2 = null;
                }
                list = proto.e;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    List<Integer> contextReceiverTypeIdList = proto.f1450f;
                    Intrinsics.delta(contextReceiverTypeIdList, "contextReceiverTypeIdList");
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypeIdList, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                    for (Integer it : contextReceiverTypeIdList) {
                        Intrinsics.delta(it, "it");
                        arrayList.add(jVar.alpha(it.intValue()));
                        c2871u2 = c2871u2;
                    }
                    list = arrayList;
                }
                C2871u c2871u3 = c2871u2;
                List list3 = bravo3;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                int i19 = 0;
                for (Object obj : list) {
                    int i20 = i19 + 1;
                    if (i19 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList2.add(Qe.l.echo(qVar3, zVar.golf((aq) obj), null, c2470f, i19));
                    i19 = i20;
                    list3 = list3;
                }
                qVar3.g0(golf2, list3, c2871u, c2871u3, arrayList2);
                Ke.b bVar4 = Ke.d.charlie;
                boolean booleanValue8 = bVar4.echo(i16).booleanValue();
                Ke.c cVar3 = Ke.d.delta;
                e = (E) cVar3.echo(i16);
                Ke.c cVar4 = Ke.d.echo;
                Ie.aa aaVar = (Ie.aa) cVar4.echo(i16);
                if (e == null) {
                    if (aaVar != null) {
                        if (booleanValue8) {
                            z10 = true;
                            i10 = 1 << bVar4.bravo;
                        } else {
                            z10 = true;
                            i10 = 0;
                        }
                        int alpha4 = i10 | (aaVar.alpha() << cVar4.bravo) | (e.alpha() << cVar3.bravo);
                        Ke.b bVar5 = Ke.d.emerald;
                        bVar5.getClass();
                        Ke.b bVar6 = Ke.d.fuchsia;
                        bVar6.getClass();
                        Ke.b bVar7 = Ke.d.gold;
                        bVar7.getClass();
                        ao aoVar2 = an.magenta;
                        if (booleanValue7) {
                            if ((proto.red & Barcode.FORMAT_QR_CODE) == 256) {
                                i14 = proto.f1453i;
                            } else {
                                i14 = alpha4;
                            }
                            boolean booleanValue9 = bVar5.echo(i14).booleanValue();
                            boolean booleanValue10 = bVar6.echo(i14).booleanValue();
                            boolean booleanValue11 = bVar7.echo(i14).booleanValue();
                            th = null;
                            InterfaceC2472h bravo4 = qVar.bravo(proto, i14, 3);
                            if (booleanValue9) {
                                cVar2 = cVar4;
                                i11 = alpha4;
                                bVar = bVar5;
                                aoVar = aoVar2;
                                sVar = alpha;
                                bVar2 = bVar6;
                                cVar = cVar3;
                                bVar3 = bVar7;
                                foxtrot = new ai(qVar3, bravo4, C0853i.echo((Ie.aa) cVar4.echo(i14)), AbstractC0417a.alpha((E) cVar3.echo(i14)), !booleanValue9, booleanValue10, booleanValue11, qVar3.november(), null, aoVar);
                            } else {
                                i11 = alpha4;
                                sVar = alpha;
                                bVar = bVar5;
                                cVar = cVar3;
                                bVar2 = bVar6;
                                cVar2 = cVar4;
                                aoVar = aoVar2;
                                bVar3 = bVar7;
                                foxtrot = Qe.l.foxtrot(qVar3, bravo4);
                            }
                            aiVar = foxtrot;
                            aiVar.c0(qVar3.getReturnType());
                        } else {
                            th = null;
                            i11 = alpha4;
                            sVar = alpha;
                            bVar = bVar5;
                            cVar = cVar3;
                            bVar2 = bVar6;
                            cVar2 = cVar4;
                            bVar3 = bVar7;
                            aoVar = aoVar2;
                            aiVar = null;
                        }
                        if (Ke.d.zulu.echo(i16).booleanValue()) {
                            if ((proto.red & 512) == 512) {
                                i13 = proto.f1454j;
                            } else {
                                i13 = i11;
                            }
                            boolean booleanValue12 = bVar.echo(i13).booleanValue();
                            boolean booleanValue13 = bVar2.echo(i13).booleanValue();
                            boolean booleanValue14 = bVar3.echo(i13).booleanValue();
                            qVar2 = this;
                            ai aiVar3 = aiVar;
                            InterfaceC2472h bravo5 = qVar2.bravo(proto, i13, 4);
                            if (booleanValue12) {
                                aiVar2 = aiVar3;
                                se.aj ajVar = new se.aj(qVar3, bravo5, C0853i.echo((Ie.aa) cVar2.echo(i13)), AbstractC0417a.alpha((E) cVar.echo(i13)), !booleanValue12, booleanValue13, booleanValue14, qVar3.november(), null, aoVar);
                                alpha2 = r6.alpha(ajVar, CollectionsKt.emptyList(), (Ke.e) r6.bravo, (G6.j) r6.delta, (Ke.f) r6.echo, (Ke.a) sVar.foxtrot);
                                se.aq aqVar2 = (se.aq) CollectionsKt.k(((q) alpha2.india).golf(kotlin.collections.ab.juliet(proto.f1452h), proto, 4));
                                if (aqVar2 != null) {
                                    ajVar.f13738f = aqVar2;
                                    r5 = ajVar;
                                } else {
                                    se.aj.D(6);
                                    throw th;
                                }
                            } else {
                                aiVar2 = aiVar3;
                                r5 = Qe.l.golf(qVar3, bravo5);
                            }
                        } else {
                            qVar2 = this;
                            aiVar2 = aiVar;
                            r5 = th;
                        }
                        if (Ke.d.beige.echo(i16).booleanValue()) {
                            qVar3.e0(th, new o(qVar2, proto, qVar3, 1));
                        }
                        InterfaceC2335k interfaceC2335k3 = (InterfaceC2335k) sVar2.charlie;
                        if (interfaceC2335k3 instanceof InterfaceC2330f) {
                            interfaceC2330f2 = (InterfaceC2330f) interfaceC2335k3;
                        } else {
                            interfaceC2330f2 = null;
                        }
                        if (interfaceC2330f2 != null) {
                            i12 = interfaceC2330f2.c();
                        } else {
                            i12 = 0;
                        }
                        if (i12 == 5) {
                            qVar3.e0(null, new o(qVar2, proto, qVar3, 3));
                        }
                        qVar3.d0(aiVar2, r5, new G3.a(qVar2.charlie(proto, false)), new G3.a(qVar2.charlie(proto, z10)));
                        return qVar3;
                    }
                    Ke.d.alpha(11);
                    throw null;
                }
                Ke.d.alpha(10);
                throw null;
            }
        }
        qVar = this;
        interfaceC2472h = c2470f;
        aq india2 = AbstractC2626c6.india(proto, jVar);
        z zVar2 = (z) alpha.hotel;
        kotlin.reflect.jvm.internal.impl.types.y golf22 = zVar2.golf(india2);
        List bravo32 = zVar2.bravo();
        interfaceC2335k = (InterfaceC2335k) sVar2.charlie;
        if (!(interfaceC2335k instanceof InterfaceC2330f)) {
        }
        if (interfaceC2330f == null) {
        }
        i5 = proto.red;
        if ((i5 & 32) != 32) {
        }
        if (!z2) {
        }
        if (aqVar == null) {
        }
        c2871u2 = null;
        list = proto.e;
        if (list.isEmpty()) {
        }
        if (list == null) {
        }
        C2871u c2871u32 = c2871u2;
        List list32 = bravo32;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList22 = new ArrayList(collectionSizeOrDefault);
        int i192 = 0;
        while (r1.hasNext()) {
        }
        qVar3.g0(golf22, list32, c2871u, c2871u32, arrayList22);
        Ke.b bVar42 = Ke.d.charlie;
        boolean booleanValue82 = bVar42.echo(i16).booleanValue();
        Ke.c cVar32 = Ke.d.delta;
        e = (E) cVar32.echo(i16);
        Ke.c cVar42 = Ke.d.echo;
        Ie.aa aaVar2 = (Ie.aa) cVar42.echo(i16);
        if (e == null) {
        }
    }

    public final List golf(List list, Oe.l lVar, int i4) {
        int collectionSizeOrDefault;
        int i5;
        InterfaceC2472h interfaceC2472h;
        aq aqVar;
        q qVar = this;
        D5.s sVar = qVar.alpha;
        InterfaceC2335k interfaceC2335k = (InterfaceC2335k) sVar.charlie;
        Intrinsics.charlie(interfaceC2335k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC2326b interfaceC2326b = (InterfaceC2326b) interfaceC2335k;
        InterfaceC2335k lima = interfaceC2326b.lima();
        Intrinsics.delta(lima, "callableDescriptor.containingDeclaration");
        aj alpha = qVar.alpha(lima);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ay ayVar = (ay) obj;
            boolean z2 = true;
            if ((ayVar.red & 1) == 1) {
                i5 = ayVar.silver;
            } else {
                i5 = 0;
            }
            if (alpha != null && Ke.d.charlie.echo(i5).booleanValue()) {
                interfaceC2472h = new ef.u((ff.l) ((K) sVar.alpha).alpha, new p(qVar, alpha, lVar, i4, i10, ayVar));
            } else {
                interfaceC2472h = C2471g.alpha;
            }
            Ne.f bravo = Zd.a.bravo((Ke.e) sVar.bravo, ayVar.teal);
            G6.j jVar = (G6.j) sVar.delta;
            aq juliet = AbstractC2626c6.juliet(ayVar, jVar);
            z zVar = (z) sVar.hotel;
            kotlin.reflect.jvm.internal.impl.types.y golf = zVar.golf(juliet);
            boolean booleanValue = Ke.d.coral.echo(i5).booleanValue();
            boolean booleanValue2 = Ke.d.crimson.echo(i5).booleanValue();
            boolean booleanValue3 = Ke.d.cyan.echo(i5).booleanValue();
            int i12 = ayVar.red;
            if ((i12 & 16) != 16) {
                z2 = false;
            }
            kotlin.reflect.jvm.internal.impl.types.y yVar = null;
            if (z2) {
                aqVar = ayVar.f1512a;
            } else if ((i12 & 32) == 32) {
                aqVar = jVar.alpha(ayVar.f1513b);
            } else {
                aqVar = null;
            }
            if (aqVar != null) {
                yVar = zVar.golf(aqVar);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new se.aq(interfaceC2326b, null, i10, interfaceC2472h, bravo, golf, booleanValue, booleanValue2, booleanValue3, yVar, an.magenta));
            qVar = this;
            arrayList = arrayList2;
            i10 = i11;
        }
        return CollectionsKt.z(arrayList);
    }
}
