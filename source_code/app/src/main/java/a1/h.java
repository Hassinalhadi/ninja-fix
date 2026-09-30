package a1;

import c1.C0807f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class h {
    public static final b alpha = new Object();

    public static boolean alpha(Z0.d dVar) {
        Z0.e eVar;
        boolean z2;
        boolean z10;
        int[] iArr = dVar.f2454h;
        int i4 = iArr[0];
        int i5 = iArr[1];
        Z0.d dVar2 = dVar.magenta;
        if (dVar2 != null) {
            eVar = (Z0.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i10 = eVar.f2454h[0];
        }
        if (eVar != null) {
            int i11 = eVar.f2454h[1];
        }
        if (i4 != 1 && !dVar.amber() && i4 != 2 && ((i4 != 3 || dVar.romeo != 0 || dVar.ochre != 0.0f || !dVar.tango(0)) && (i4 != 3 || dVar.romeo != 1 || !dVar.uniform(0, dVar.quebec())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 1 && !dVar.azure() && i5 != 2 && ((i5 != 3 || dVar.sierra != 0 || dVar.ochre != 0.0f || !dVar.tango(1)) && (i5 != 3 || dVar.sierra != 1 || !dVar.uniform(1, dVar.kilo())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((dVar.ochre <= 0.0f || (!z2 && !z10)) && (!z2 || !z10)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, a1.n] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, a1.n] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static n bravo(Z0.d dVar, int i4, ArrayList arrayList, n nVar) {
        int i5;
        int i10;
        if (i4 == 0) {
            i5 = dVar.f2452f;
        } else {
            i5 = dVar.f2453g;
        }
        int i11 = 0;
        if (i5 != -1 && (nVar == 0 || i5 != nVar.bravo)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i12);
                if (nVar2.bravo == i5) {
                    if (nVar != 0) {
                        nVar.charlie(i4, nVar2);
                        arrayList.remove((Object) nVar);
                    }
                    nVar = nVar2;
                } else {
                    i12++;
                }
            }
        } else if (i5 != -1) {
            return nVar;
        }
        n nVar3 = nVar;
        if (nVar == 0) {
            if (dVar instanceof Z0.i) {
                Z0.i iVar = (Z0.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 < iVar.f2513j) {
                        Z0.d dVar2 = iVar.f2512i[i13];
                        if ((i4 == 0 && (i10 = dVar2.f2452f) != -1) || (i4 == 1 && (i10 = dVar2.f2453g) != -1)) {
                            break;
                        }
                        i13++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        n nVar4 = (n) arrayList.get(i14);
                        if (nVar4.bravo == i10) {
                            nVar = nVar4;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (nVar == 0) {
                nVar = new Object();
                nVar.alpha = new ArrayList();
                nVar.delta = null;
                nVar.echo = -1;
                int i15 = n.foxtrot;
                n.foxtrot = i15 + 1;
                nVar.bravo = i15;
                nVar.charlie = i4;
            }
            arrayList.add(nVar);
            nVar3 = nVar;
        }
        ArrayList arrayList2 = nVar3.alpha;
        if (arrayList2.contains(dVar)) {
            return nVar3;
        }
        arrayList2.add(dVar);
        if (dVar instanceof Z0.h) {
            Z0.h hVar = (Z0.h) dVar;
            Z0.c cVar = hVar.f2509l;
            if (hVar.f2510m == 0) {
                i11 = 1;
            }
            cVar.charlie(i11, nVar3, arrayList);
        }
        int i16 = nVar3.bravo;
        if (i4 == 0) {
            dVar.f2452f = i16;
            dVar.cyan.charlie(i4, nVar3, arrayList);
            dVar.fuchsia.charlie(i4, nVar3, arrayList);
        } else {
            dVar.f2453g = i16;
            dVar.emerald.charlie(i4, nVar3, arrayList);
            dVar.gray.charlie(i4, nVar3, arrayList);
            dVar.gold.charlie(i4, nVar3, arrayList);
        }
        dVar.ivory.charlie(i4, nVar3, arrayList);
        return nVar3;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [a1.b, java.lang.Object] */
    public static void charlie(int i4, Z0.d dVar, C0807f c0807f, boolean z2) {
        boolean z10;
        Z0.c cVar;
        Z0.c cVar2;
        char c3;
        char c4;
        Z0.c cVar3;
        Z0.c cVar4;
        if (dVar.mike) {
            return;
        }
        if (!(dVar instanceof Z0.e) && dVar.zulu() && alpha(dVar)) {
            Z0.e.navy(dVar, c0807f, new Object());
        }
        Z0.c india = dVar.india(2);
        Z0.c india2 = dVar.india(4);
        int delta = india.delta();
        int delta2 = india2.delta();
        HashSet hashSet = india.alpha;
        if (hashSet != null && india.charlie) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Z0.c cVar5 = (Z0.c) it.next();
                Z0.d dVar2 = cVar5.delta;
                int i5 = i4 + 1;
                boolean alpha2 = alpha(dVar2);
                if (dVar2.zulu() && alpha2) {
                    c3 = 0;
                    Z0.e.navy(dVar2, c0807f, new Object());
                } else {
                    c3 = 0;
                }
                Z0.c cVar6 = dVar2.cyan;
                Z0.c cVar7 = dVar2.fuchsia;
                if ((cVar5 == cVar6 && (cVar4 = cVar7.foxtrot) != null && cVar4.charlie) || (cVar5 == cVar7 && (cVar3 = cVar6.foxtrot) != null && cVar3.charlie)) {
                    c4 = 1;
                } else {
                    c4 = c3;
                }
                int i10 = dVar2.f2454h[c3];
                if (i10 == 3 && !alpha2) {
                    if (i10 == 3 && dVar2.victor >= 0 && dVar2.uniform >= 0 && (dVar2.white == 8 || (dVar2.romeo == 0 && dVar2.ochre == 0.0f))) {
                        if (!dVar2.xray() && !dVar2.bronze && c4 != 0 && !dVar2.xray()) {
                            echo(i5, dVar, c0807f, dVar2, z2);
                        }
                    }
                } else if (!dVar2.zulu()) {
                    if (cVar5 == cVar6 && cVar7.foxtrot == null) {
                        int echo = cVar6.echo() + delta;
                        dVar2.emerald(echo, dVar2.quebec() + echo);
                        charlie(i5, dVar2, c0807f, z2);
                    } else if (cVar5 == cVar7 && cVar6.foxtrot == null) {
                        int echo2 = delta - cVar7.echo();
                        dVar2.emerald(echo2 - dVar2.quebec(), echo2);
                        charlie(i5, dVar2, c0807f, z2);
                    } else if (c4 != 0 && !dVar2.xray()) {
                        delta(i5, dVar2, c0807f, z2);
                    }
                }
            }
        }
        if (dVar instanceof Z0.h) {
            return;
        }
        HashSet hashSet2 = india2.alpha;
        if (hashSet2 != null && india2.charlie) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Z0.c cVar8 = (Z0.c) it2.next();
                Z0.d dVar3 = cVar8.delta;
                int i11 = i4 + 1;
                boolean alpha3 = alpha(dVar3);
                if (dVar3.zulu() && alpha3) {
                    Z0.e.navy(dVar3, c0807f, new Object());
                }
                Z0.c cVar9 = dVar3.cyan;
                Z0.c cVar10 = dVar3.fuchsia;
                if ((cVar8 == cVar9 && (cVar2 = cVar10.foxtrot) != null && cVar2.charlie) || (cVar8 == cVar10 && (cVar = cVar9.foxtrot) != null && cVar.charlie)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = dVar3.f2454h[0];
                if (i12 == 3 && !alpha3) {
                    if (i12 == 3 && dVar3.victor >= 0 && dVar3.uniform >= 0) {
                        if (dVar3.white == 8 || (dVar3.romeo == 0 && dVar3.ochre == 0.0f)) {
                            if (!dVar3.xray() && !dVar3.bronze && z10 && !dVar3.xray()) {
                                echo(i11, dVar, c0807f, dVar3, z2);
                            }
                        }
                    }
                } else if (!dVar3.zulu()) {
                    if (cVar8 == cVar9 && cVar10.foxtrot == null) {
                        int echo3 = cVar9.echo() + delta2;
                        dVar3.emerald(echo3, dVar3.quebec() + echo3);
                        charlie(i11, dVar3, c0807f, z2);
                    } else if (cVar8 == cVar10 && cVar9.foxtrot == null) {
                        int echo4 = delta2 - cVar10.echo();
                        dVar3.emerald(echo4 - dVar3.quebec(), echo4);
                        charlie(i11, dVar3, c0807f, z2);
                    } else if (z10 && !dVar3.xray()) {
                        delta(i11, dVar3, c0807f, z2);
                    }
                }
            }
        }
        dVar.mike = true;
    }

    public static void delta(int i4, Z0.d dVar, C0807f c0807f, boolean z2) {
        float f5;
        float f10 = dVar.red;
        Z0.c cVar = dVar.cyan;
        int delta = cVar.foxtrot.delta();
        Z0.c cVar2 = dVar.fuchsia;
        int delta2 = cVar2.foxtrot.delta();
        int echo = cVar.echo() + delta;
        int echo2 = delta2 - cVar2.echo();
        if (delta == delta2) {
            f10 = 0.5f;
        } else {
            delta = echo;
            delta2 = echo2;
        }
        int quebec = dVar.quebec();
        int i5 = (delta2 - delta) - quebec;
        if (delta > delta2) {
            i5 = (delta - delta2) - quebec;
        }
        if (i5 > 0) {
            f5 = (f10 * i5) + 0.5f;
        } else {
            f5 = f10 * i5;
        }
        int i10 = ((int) f5) + delta;
        int i11 = i10 + quebec;
        if (delta > delta2) {
            i11 = i10 - quebec;
        }
        dVar.emerald(i10, i11);
        charlie(i4 + 1, dVar, c0807f, z2);
    }

    public static void echo(int i4, Z0.d dVar, C0807f c0807f, Z0.d dVar2, boolean z2) {
        int quebec;
        float f5 = dVar2.red;
        Z0.c cVar = dVar2.cyan;
        int echo = cVar.echo() + cVar.foxtrot.delta();
        Z0.c cVar2 = dVar2.fuchsia;
        int delta = cVar2.foxtrot.delta() - cVar2.echo();
        if (delta >= echo) {
            int quebec2 = dVar2.quebec();
            if (dVar2.white != 8) {
                int i5 = dVar2.romeo;
                if (i5 == 2) {
                    if (dVar instanceof Z0.e) {
                        quebec = dVar.quebec();
                    } else {
                        quebec = dVar.magenta.quebec();
                    }
                    quebec2 = (int) (dVar2.red * 0.5f * quebec);
                } else if (i5 == 0) {
                    quebec2 = delta - echo;
                }
                quebec2 = Math.max(dVar2.uniform, quebec2);
                int i10 = dVar2.victor;
                if (i10 > 0) {
                    quebec2 = Math.min(i10, quebec2);
                }
            }
            int i11 = echo + ((int) ((f5 * ((delta - echo) - quebec2)) + 0.5f));
            dVar2.emerald(i11, quebec2 + i11);
            charlie(i4 + 1, dVar2, c0807f, z2);
        }
    }

    public static void foxtrot(int i4, Z0.d dVar, C0807f c0807f) {
        float f5;
        float f10 = dVar.silver;
        Z0.c cVar = dVar.emerald;
        int delta = cVar.foxtrot.delta();
        Z0.c cVar2 = dVar.gold;
        int delta2 = cVar2.foxtrot.delta();
        int echo = cVar.echo() + delta;
        int echo2 = delta2 - cVar2.echo();
        if (delta == delta2) {
            f10 = 0.5f;
        } else {
            delta = echo;
            delta2 = echo2;
        }
        int kilo = dVar.kilo();
        int i5 = (delta2 - delta) - kilo;
        if (delta > delta2) {
            i5 = (delta - delta2) - kilo;
        }
        if (i5 > 0) {
            f5 = (f10 * i5) + 0.5f;
        } else {
            f5 = f10 * i5;
        }
        int i10 = (int) f5;
        int i11 = delta + i10;
        int i12 = i11 + kilo;
        if (delta > delta2) {
            i11 = delta - i10;
            i12 = i11 - kilo;
        }
        dVar.fuchsia(i11, i12);
        india(i4 + 1, dVar, c0807f);
    }

    public static void golf(int i4, Z0.d dVar, C0807f c0807f, Z0.d dVar2) {
        int kilo;
        float f5 = dVar2.silver;
        Z0.c cVar = dVar2.emerald;
        int echo = cVar.echo() + cVar.foxtrot.delta();
        Z0.c cVar2 = dVar2.gold;
        int delta = cVar2.foxtrot.delta() - cVar2.echo();
        if (delta >= echo) {
            int kilo2 = dVar2.kilo();
            if (dVar2.white != 8) {
                int i5 = dVar2.sierra;
                if (i5 == 2) {
                    if (dVar instanceof Z0.e) {
                        kilo = dVar.kilo();
                    } else {
                        kilo = dVar.magenta.kilo();
                    }
                    kilo2 = (int) (f5 * 0.5f * kilo);
                } else if (i5 == 0) {
                    kilo2 = delta - echo;
                }
                kilo2 = Math.max(dVar2.xray, kilo2);
                int i10 = dVar2.yankee;
                if (i10 > 0) {
                    kilo2 = Math.min(i10, kilo2);
                }
            }
            int i11 = echo + ((int) ((f5 * ((delta - echo) - kilo2)) + 0.5f));
            dVar2.fuchsia(i11, kilo2 + i11);
            india(i4 + 1, dVar2, c0807f);
        }
    }

    public static boolean hotel(int i4, int i5, int i10, int i11) {
        boolean z2;
        boolean z10;
        if (i10 != 1 && i10 != 2 && (i10 != 4 || i4 == 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i11 != 1 && i11 != 2 && (i11 != 4 || i5 == 2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z2 || z10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [a1.b, java.lang.Object] */
    public static void india(int i4, Z0.d dVar, C0807f c0807f) {
        boolean z2;
        Z0.c cVar;
        Z0.c cVar2;
        boolean z10;
        Z0.c cVar3;
        Z0.c cVar4;
        if (dVar.november) {
            return;
        }
        if (!(dVar instanceof Z0.e) && dVar.zulu() && alpha(dVar)) {
            Z0.e.navy(dVar, c0807f, new Object());
        }
        Z0.c india = dVar.india(3);
        Z0.c india2 = dVar.india(5);
        int delta = india.delta();
        int delta2 = india2.delta();
        HashSet hashSet = india.alpha;
        if (hashSet != null && india.charlie) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Z0.c cVar5 = (Z0.c) it.next();
                Z0.d dVar2 = cVar5.delta;
                int i5 = i4 + 1;
                boolean alpha2 = alpha(dVar2);
                if (dVar2.zulu() && alpha2) {
                    Z0.e.navy(dVar2, c0807f, new Object());
                }
                Z0.c cVar6 = dVar2.emerald;
                Z0.c cVar7 = dVar2.gold;
                if ((cVar5 == cVar6 && (cVar4 = cVar7.foxtrot) != null && cVar4.charlie) || (cVar5 == cVar7 && (cVar3 = cVar6.foxtrot) != null && cVar3.charlie)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = dVar2.f2454h[1];
                if (i10 == 3 && !alpha2) {
                    if (i10 == 3 && dVar2.yankee >= 0 && dVar2.xray >= 0 && (dVar2.white == 8 || (dVar2.sierra == 0 && dVar2.ochre == 0.0f))) {
                        if (!dVar2.yankee() && !dVar2.bronze && z10 && !dVar2.yankee()) {
                            golf(i5, dVar, c0807f, dVar2);
                        }
                    }
                } else if (!dVar2.zulu()) {
                    if (cVar5 == cVar6 && cVar7.foxtrot == null) {
                        int echo = cVar6.echo() + delta;
                        dVar2.fuchsia(echo, dVar2.kilo() + echo);
                        india(i5, dVar2, c0807f);
                    } else if (cVar5 == cVar7 && cVar6.foxtrot == null) {
                        int echo2 = delta - cVar7.echo();
                        dVar2.fuchsia(echo2 - dVar2.kilo(), echo2);
                        india(i5, dVar2, c0807f);
                    } else if (z10 && !dVar2.yankee()) {
                        foxtrot(i5, dVar2, c0807f);
                    }
                }
            }
        }
        char c3 = 1;
        if (dVar instanceof Z0.h) {
            return;
        }
        HashSet hashSet2 = india2.alpha;
        if (hashSet2 != null && india2.charlie) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Z0.c cVar8 = (Z0.c) it2.next();
                Z0.d dVar3 = cVar8.delta;
                int i11 = i4 + 1;
                boolean alpha3 = alpha(dVar3);
                if (dVar3.zulu() && alpha3) {
                    Z0.e.navy(dVar3, c0807f, new Object());
                }
                Z0.c cVar9 = dVar3.emerald;
                Z0.c cVar10 = dVar3.gold;
                if ((cVar8 == cVar9 && (cVar2 = cVar10.foxtrot) != null && cVar2.charlie) || (cVar8 == cVar10 && (cVar = cVar9.foxtrot) != null && cVar.charlie)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i12 = dVar3.f2454h[1];
                if (i12 == 3 && !alpha3) {
                    if (i12 == 3 && dVar3.yankee >= 0 && dVar3.xray >= 0 && (dVar3.white == 8 || (dVar3.sierra == 0 && dVar3.ochre == 0.0f))) {
                        if (!dVar3.yankee() && !dVar3.bronze && z2 && !dVar3.yankee()) {
                            golf(i11, dVar, c0807f, dVar3);
                        }
                    }
                } else if (!dVar3.zulu()) {
                    if (cVar8 == cVar9 && cVar10.foxtrot == null) {
                        int echo3 = cVar9.echo() + delta2;
                        dVar3.fuchsia(echo3, dVar3.kilo() + echo3);
                        india(i11, dVar3, c0807f);
                    } else if (cVar8 == cVar10 && cVar9.foxtrot == null) {
                        int echo4 = delta2 - cVar10.echo();
                        dVar3.fuchsia(echo4 - dVar3.kilo(), echo4);
                        india(i11, dVar3, c0807f);
                    } else if (z2 && !dVar3.yankee()) {
                        foxtrot(i11, dVar3, c0807f);
                    }
                }
            }
        }
        Z0.c india3 = dVar.india(6);
        if (india3.alpha != null && india3.charlie) {
            int delta3 = india3.delta();
            Iterator it3 = india3.alpha.iterator();
            while (it3.hasNext()) {
                Z0.c cVar11 = (Z0.c) it3.next();
                Z0.d dVar4 = cVar11.delta;
                int i13 = i4 + 1;
                boolean alpha4 = alpha(dVar4);
                if (dVar4.zulu() && alpha4) {
                    Z0.e.navy(dVar4, c0807f, new Object());
                }
                if (dVar4.f2454h[c3 == true ? 1 : 0] != 3 || alpha4) {
                    if (dVar4.zulu()) {
                        continue;
                    } else {
                        Z0.c cVar12 = dVar4.gray;
                        if (cVar11 == cVar12) {
                            int echo5 = cVar11.echo() + delta3;
                            if (dVar4.blue) {
                                int i14 = echo5 - dVar4.pink;
                                int i15 = dVar4.navy + i14;
                                dVar4.peach = i14;
                                dVar4.emerald.lima(i14);
                                dVar4.gold.lima(i15);
                                cVar12.lima(echo5);
                                dVar4.lima = c3 == true ? 1 : 0;
                            }
                            india(i13, dVar4, c0807f);
                        }
                    }
                }
                c3 = 1;
            }
        }
        dVar.november = true;
    }
}
