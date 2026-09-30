package a1;

import c1.C0807f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e {
    public Z0.e alpha;
    public boolean bravo;
    public boolean charlie;
    public Z0.e delta;
    public ArrayList echo;
    public C0807f foxtrot;
    public b golf;
    public ArrayList hotel;

    /* JADX WARN: Type inference failed for: r10v2, types: [a1.l, java.lang.Object] */
    public final void alpha(f fVar, int i4, ArrayList arrayList, l lVar) {
        o oVar = fVar.delta;
        if (oVar.charlie == null) {
            Z0.e eVar = this.alpha;
            if (oVar != eVar.delta) {
                l lVar2 = lVar;
                if (oVar != eVar.echo) {
                    if (lVar == null) {
                        ?? obj = new Object();
                        obj.alpha = null;
                        obj.bravo = new ArrayList();
                        obj.alpha = oVar;
                        arrayList.add(obj);
                        lVar2 = obj;
                    }
                    oVar.charlie = lVar2;
                    lVar2.bravo.add(oVar);
                    f fVar2 = oVar.hotel;
                    Iterator it = fVar2.kilo.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (dVar instanceof f) {
                            alpha((f) dVar, i4, arrayList, lVar2);
                        }
                    }
                    f fVar3 = oVar.india;
                    Iterator it2 = fVar3.kilo.iterator();
                    while (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (dVar2 instanceof f) {
                            alpha((f) dVar2, i4, arrayList, lVar2);
                        }
                    }
                    if (i4 == 1 && (oVar instanceof m)) {
                        Iterator it3 = ((m) oVar).kilo.kilo.iterator();
                        while (it3.hasNext()) {
                            d dVar3 = (d) it3.next();
                            if (dVar3 instanceof f) {
                                alpha((f) dVar3, i4, arrayList, lVar2);
                            }
                        }
                    }
                    Iterator it4 = fVar2.lima.iterator();
                    while (it4.hasNext()) {
                        alpha((f) it4.next(), i4, arrayList, lVar2);
                    }
                    Iterator it5 = fVar3.lima.iterator();
                    while (it5.hasNext()) {
                        alpha((f) it5.next(), i4, arrayList, lVar2);
                    }
                    if (i4 == 1 && (oVar instanceof m)) {
                        Iterator it6 = ((m) oVar).kilo.lima.iterator();
                        while (it6.hasNext()) {
                            alpha((f) it6.next(), i4, arrayList, lVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(Z0.e eVar) {
        int i4;
        int i5;
        float f5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Iterator it = eVar.f2456i.iterator();
        while (it.hasNext()) {
            Z0.d dVar = (Z0.d) it.next();
            int[] iArr = dVar.f2454h;
            int i16 = iArr[0];
            int i17 = iArr[1];
            if (dVar.white == 8) {
                dVar.alpha = true;
            } else {
                float f10 = dVar.whiskey;
                if (f10 < 1.0f && i16 == 3) {
                    dVar.romeo = 2;
                }
                float f11 = dVar.zulu;
                if (f11 < 1.0f && i17 == 3) {
                    dVar.sierra = 2;
                }
                if (dVar.ochre > 0.0f) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        dVar.romeo = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        dVar.sierra = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (dVar.romeo == 0) {
                            dVar.romeo = 3;
                        }
                        if (dVar.sierra == 0) {
                            dVar.sierra = 3;
                        }
                    }
                }
                Z0.c cVar = dVar.fuchsia;
                Z0.c cVar2 = dVar.cyan;
                if (i16 == 3 && dVar.romeo == 1 && (cVar2.foxtrot == null || cVar.foxtrot == null)) {
                    i16 = 2;
                }
                Z0.c cVar3 = dVar.gold;
                Z0.c cVar4 = dVar.emerald;
                if (i17 == 3 && dVar.sierra == 1 && (cVar4.foxtrot == null || cVar3.foxtrot == null)) {
                    i17 = 2;
                }
                k kVar = dVar.delta;
                kVar.delta = i16;
                int i18 = dVar.romeo;
                kVar.alpha = i18;
                m mVar = dVar.echo;
                mVar.delta = i17;
                int i19 = dVar.sierra;
                mVar.alpha = i19;
                if ((i16 == 4 || i16 == 1 || i16 == 2) && (i17 == 4 || i17 == 1 || i17 == 2)) {
                    int i20 = i17;
                    int quebec = dVar.quebec();
                    if (i16 == 4) {
                        quebec = (eVar.quebec() - cVar2.golf) - cVar.golf;
                        i16 = 1;
                    }
                    int i21 = quebec;
                    int kilo = dVar.kilo();
                    if (i20 == 4) {
                        kilo = (eVar.kilo() - cVar4.golf) - cVar3.golf;
                        i20 = 1;
                    }
                    foxtrot(i16, i21, i20, kilo, dVar);
                    dVar.delta.echo.delta(dVar.quebec());
                    dVar.echo.echo.delta(dVar.kilo());
                    dVar.alpha = true;
                } else {
                    int[] iArr2 = eVar.f2454h;
                    Z0.c[] cVarArr = dVar.jade;
                    if (i16 == 3) {
                        if (i17 != 2 && i17 != 1) {
                            i10 = i17;
                            i11 = 3;
                            i4 = i16;
                            i5 = 2;
                            f5 = f11;
                            if (i10 == i11) {
                            }
                            i14 = 1;
                            i15 = 3;
                            if (i13 != i15) {
                            }
                        } else if (i18 == 3) {
                            if (i17 == 2) {
                                foxtrot(2, 0, 2, 0, dVar);
                            }
                            int kilo2 = dVar.kilo();
                            foxtrot(1, (int) ((kilo2 * dVar.ochre) + 0.5f), 1, kilo2, dVar);
                            dVar.delta.echo.delta(dVar.quebec());
                            dVar.echo.echo.delta(dVar.kilo());
                            dVar.alpha = true;
                        } else {
                            i4 = i16;
                            i5 = 2;
                            if (i18 == 1) {
                                foxtrot(2, 0, i17, 0, dVar);
                                dVar.delta.echo.mike = dVar.quebec();
                            } else {
                                f5 = f11;
                                i10 = i17;
                                if (i18 == 2) {
                                    int i22 = iArr2[0];
                                    if (i22 == 1 || i22 == 4) {
                                        foxtrot(1, (int) ((f10 * eVar.quebec()) + 0.5f), i10, dVar.kilo(), dVar);
                                        dVar.delta.echo.delta(dVar.quebec());
                                        dVar.echo.echo.delta(dVar.kilo());
                                        dVar.alpha = true;
                                    }
                                } else if (cVarArr[0].foxtrot == null || cVarArr[1].foxtrot == null) {
                                    foxtrot(2, 0, i10, 0, dVar);
                                    dVar.delta.echo.delta(dVar.quebec());
                                    dVar.echo.echo.delta(dVar.kilo());
                                    dVar.alpha = true;
                                }
                                if (i10 == i11) {
                                    if (i4 != i5 && i4 != 1) {
                                        int i23 = i4;
                                        i12 = i5;
                                        i13 = i23;
                                        i15 = i11;
                                        i14 = 1;
                                        if (i13 != i15) {
                                            if (i18 == i14) {
                                            }
                                            foxtrot(i12, 0, i12, 0, dVar);
                                            dVar.delta.echo.mike = dVar.quebec();
                                            dVar.echo.echo.mike = dVar.kilo();
                                        }
                                    } else if (i19 == i11) {
                                        if (i4 == i5) {
                                            foxtrot(i5, 0, i5, 0, dVar);
                                        }
                                        int quebec2 = dVar.quebec();
                                        float f12 = dVar.ochre;
                                        if (dVar.olive == -1) {
                                            f12 = 1.0f / f12;
                                        }
                                        foxtrot(1, quebec2, 1, (int) ((quebec2 * f12) + 0.5f), dVar);
                                        dVar.delta.echo.delta(dVar.quebec());
                                        dVar.echo.echo.delta(dVar.kilo());
                                        dVar.alpha = true;
                                    } else if (i19 == 1) {
                                        foxtrot(i4, 0, i5, 0, dVar);
                                        dVar.echo.echo.mike = dVar.kilo();
                                    } else {
                                        int i24 = i4;
                                        i12 = i5;
                                        if (i19 == 2) {
                                            int i25 = iArr2[1];
                                            if (i25 != 1 && i25 != 4) {
                                                i13 = i24;
                                            } else {
                                                foxtrot(i24, dVar.quebec(), 1, (int) ((f5 * eVar.kilo()) + 0.5f), dVar);
                                                dVar.delta.echo.delta(dVar.quebec());
                                                dVar.echo.echo.delta(dVar.kilo());
                                                dVar.alpha = true;
                                            }
                                        } else {
                                            i13 = i24;
                                            if (cVarArr[2].foxtrot == null || cVarArr[3].foxtrot == null) {
                                                foxtrot(i12, 0, i10, 0, dVar);
                                                dVar.delta.echo.delta(dVar.quebec());
                                                dVar.echo.echo.delta(dVar.kilo());
                                                dVar.alpha = true;
                                            }
                                        }
                                        if (i13 != i15 && i10 == i15) {
                                            if (i18 == i14 && i19 != i14) {
                                                if (i19 == 2 && i18 == 2 && iArr2[0] == 1 && iArr2[i14] == 1) {
                                                    foxtrot(1, (int) ((f10 * eVar.quebec()) + 0.5f), 1, (int) ((f5 * eVar.kilo()) + 0.5f), dVar);
                                                    dVar.delta.echo.delta(dVar.quebec());
                                                    dVar.echo.echo.delta(dVar.kilo());
                                                    dVar.alpha = true;
                                                }
                                            } else {
                                                foxtrot(i12, 0, i12, 0, dVar);
                                                dVar.delta.echo.mike = dVar.quebec();
                                                dVar.echo.echo.mike = dVar.kilo();
                                            }
                                        }
                                    }
                                } else {
                                    int i26 = i4;
                                    i12 = i5;
                                    i13 = i26;
                                }
                                i14 = 1;
                                i15 = 3;
                                if (i13 != i15) {
                                }
                            }
                        }
                    } else {
                        i4 = i16;
                        i5 = 2;
                        f5 = f11;
                        i10 = i17;
                    }
                    i11 = 3;
                    if (i10 == i11) {
                    }
                    i14 = 1;
                    i15 = 3;
                    if (i13 != i15) {
                    }
                }
            }
        }
    }

    public final void charlie() {
        ArrayList arrayList = this.echo;
        arrayList.clear();
        Z0.e eVar = this.delta;
        eVar.delta.foxtrot();
        eVar.echo.foxtrot();
        arrayList.add(eVar.delta);
        arrayList.add(eVar.echo);
        Iterator it = eVar.f2456i.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            Z0.d dVar = (Z0.d) it.next();
            if (dVar instanceof Z0.h) {
                o oVar = new o(dVar);
                dVar.delta.foxtrot();
                dVar.echo.foxtrot();
                oVar.foxtrot = ((Z0.h) dVar).f2510m;
                arrayList.add(oVar);
            } else {
                if (dVar.xray()) {
                    if (dVar.bravo == null) {
                        dVar.bravo = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.bravo);
                } else {
                    arrayList.add(dVar.delta);
                }
                if (dVar.yankee()) {
                    if (dVar.charlie == null) {
                        dVar.charlie = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.charlie);
                } else {
                    arrayList.add(dVar.echo);
                }
                if (dVar instanceof Z0.i) {
                    arrayList.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).foxtrot();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar2 = (o) it3.next();
            if (oVar2.bravo != eVar) {
                oVar2.delta();
            }
        }
        ArrayList arrayList2 = this.hotel;
        arrayList2.clear();
        Z0.e eVar2 = this.alpha;
        echo(eVar2.delta, 0, arrayList2);
        echo(eVar2.echo, 1, arrayList2);
        this.bravo = false;
    }

    public final int delta(Z0.e eVar, int i4) {
        o oVar;
        o oVar2;
        ArrayList arrayList;
        int i5;
        int i10;
        long juliet;
        float f5;
        long j5;
        Z0.e eVar2 = eVar;
        ArrayList arrayList2 = this.hotel;
        int size = arrayList2.size();
        int i11 = 0;
        long j6 = 0;
        while (i11 < size) {
            o oVar3 = ((l) arrayList2.get(i11)).alpha;
            if (!(oVar3 instanceof c) ? !(i4 != 0 ? (oVar3 instanceof m) : (oVar3 instanceof k)) : ((c) oVar3).foxtrot != i4) {
                arrayList = arrayList2;
                i5 = size;
                i10 = i11;
                juliet = 0;
            } else {
                if (i4 == 0) {
                    oVar = eVar2.delta;
                } else {
                    oVar = eVar2.echo;
                }
                f fVar = oVar.hotel;
                if (i4 == 0) {
                    oVar2 = eVar2.delta;
                } else {
                    oVar2 = eVar2.echo;
                }
                f fVar2 = oVar2.india;
                boolean contains = oVar3.hotel.lima.contains(fVar);
                f fVar3 = oVar3.india;
                boolean contains2 = fVar3.lima.contains(fVar2);
                long juliet2 = oVar3.juliet();
                f fVar4 = oVar3.hotel;
                if (contains && contains2) {
                    long bravo = l.bravo(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i5 = size;
                    long alpha = l.alpha(fVar3, 0L);
                    long j7 = bravo - juliet2;
                    int i12 = fVar3.foxtrot;
                    arrayList = arrayList3;
                    i10 = i11;
                    if (j7 >= (-i12)) {
                        j7 += i12;
                    }
                    long j10 = (-alpha) - juliet2;
                    long j11 = fVar4.foxtrot;
                    long j12 = j10 - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    Z0.d dVar = oVar3.bravo;
                    if (i4 == 0) {
                        f5 = dVar.red;
                    } else if (i4 == 1) {
                        f5 = dVar.silver;
                    } else {
                        dVar.getClass();
                        f5 = -1.0f;
                    }
                    if (f5 > 0.0f) {
                        j5 = (((float) j7) / (1.0f - f5)) + (((float) j12) / f5);
                    } else {
                        j5 = 0;
                    }
                    float f10 = (float) j5;
                    juliet = (fVar4.foxtrot + ((((f10 * f5) + 0.5f) + juliet2) + Q0.c.lima(1.0f, f5, f10, 0.5f))) - fVar3.foxtrot;
                } else {
                    arrayList = arrayList2;
                    i5 = size;
                    i10 = i11;
                    if (contains) {
                        juliet = Math.max(l.bravo(fVar4, fVar4.foxtrot), fVar4.foxtrot + juliet2);
                    } else if (contains2) {
                        juliet = Math.max(-l.alpha(fVar3, fVar3.foxtrot), (-fVar3.foxtrot) + juliet2);
                    } else {
                        juliet = (oVar3.juliet() + fVar4.foxtrot) - fVar3.foxtrot;
                    }
                }
            }
            j6 = Math.max(j6, juliet);
            i11 = i10 + 1;
            eVar2 = eVar;
            size = i5;
            arrayList2 = arrayList;
        }
        return (int) j6;
    }

    public final void echo(o oVar, int i4, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.hotel.kilo.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.india;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                alpha((f) dVar, i4, arrayList, null);
            } else if (dVar instanceof o) {
                alpha(((o) dVar).hotel, i4, arrayList, null);
            }
        }
        Iterator it2 = fVar.kilo.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                alpha((f) dVar2, i4, arrayList, null);
            } else if (dVar2 instanceof o) {
                alpha(((o) dVar2).india, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            Iterator it3 = ((m) oVar).kilo.kilo.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    alpha((f) dVar3, i4, arrayList, null);
                }
            }
        }
    }

    public final void foxtrot(int i4, int i5, int i10, int i11, Z0.d dVar) {
        b bVar = this.golf;
        bVar.alpha = i4;
        bVar.bravo = i10;
        bVar.charlie = i5;
        bVar.delta = i11;
        this.foxtrot.bravo(dVar, bVar);
        dVar.indigo(bVar.echo);
        dVar.gold(bVar.foxtrot);
        dVar.blue = bVar.hotel;
        dVar.cyan(bVar.golf);
    }

    public final void golf() {
        boolean z2;
        a aVar;
        Iterator it = this.alpha.f2456i.iterator();
        while (it.hasNext()) {
            Z0.d dVar = (Z0.d) it.next();
            if (!dVar.alpha) {
                int[] iArr = dVar.f2454h;
                boolean z10 = false;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i10 = dVar.romeo;
                int i11 = dVar.sierra;
                if (i4 != 2 && (i4 != 3 || i10 != 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i5 == 2 || (i5 == 3 && i11 == 1)) {
                    z10 = true;
                }
                g gVar = dVar.delta.echo;
                boolean z11 = gVar.juliet;
                g gVar2 = dVar.echo.echo;
                boolean z12 = gVar2.juliet;
                boolean z13 = z2;
                if (z11 && z12) {
                    foxtrot(1, gVar.golf, 1, gVar2.golf, dVar);
                    dVar.alpha = true;
                } else if (z11 && z10) {
                    foxtrot(1, gVar.golf, 2, gVar2.golf, dVar);
                    if (i5 == 3) {
                        dVar.echo.echo.mike = dVar.kilo();
                    } else {
                        dVar.echo.echo.delta(dVar.kilo());
                        dVar.alpha = true;
                    }
                } else if (z12 && z13) {
                    foxtrot(2, gVar.golf, 1, gVar2.golf, dVar);
                    if (i4 == 3) {
                        dVar.delta.echo.mike = dVar.quebec();
                    } else {
                        dVar.delta.echo.delta(dVar.quebec());
                        dVar.alpha = true;
                    }
                }
                if (dVar.alpha && (aVar = dVar.echo.lima) != null) {
                    aVar.delta(dVar.pink);
                }
            }
        }
    }
}
