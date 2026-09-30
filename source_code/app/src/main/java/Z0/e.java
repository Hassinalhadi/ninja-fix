package Z0;

import a1.n;
import a1.o;
import c1.C0807f;
import com.google.mlkit.vision.barcode.common.Barcode;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e extends d {
    public WeakReference A;
    public WeakReference B;
    public final HashSet C;

    /* renamed from: D, reason: collision with root package name */
    public final a1.b f2455D;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2456i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final C1915c f2457j = new C1915c(this);

    /* renamed from: k, reason: collision with root package name */
    public final a1.e f2458k;

    /* renamed from: l, reason: collision with root package name */
    public int f2459l;

    /* renamed from: m, reason: collision with root package name */
    public C0807f f2460m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2461n;

    /* renamed from: o, reason: collision with root package name */
    public final W0.c f2462o;

    /* renamed from: p, reason: collision with root package name */
    public int f2463p;

    /* renamed from: q, reason: collision with root package name */
    public int f2464q;

    /* renamed from: r, reason: collision with root package name */
    public int f2465r;

    /* renamed from: s, reason: collision with root package name */
    public int f2466s;

    /* renamed from: t, reason: collision with root package name */
    public b[] f2467t;

    /* renamed from: u, reason: collision with root package name */
    public b[] f2468u;

    /* renamed from: v, reason: collision with root package name */
    public int f2469v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2470w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2471x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f2472y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f2473z;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a1.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a1.b, java.lang.Object] */
    public e() {
        ?? obj = new Object();
        obj.bravo = true;
        obj.charlie = true;
        obj.echo = new ArrayList();
        new ArrayList();
        obj.foxtrot = null;
        obj.golf = new Object();
        obj.hotel = new ArrayList();
        obj.alpha = this;
        obj.delta = this;
        this.f2458k = obj;
        this.f2460m = null;
        this.f2461n = false;
        this.f2462o = new W0.c();
        this.f2465r = 0;
        this.f2466s = 0;
        this.f2467t = new b[4];
        this.f2468u = new b[4];
        this.f2469v = 257;
        this.f2470w = false;
        this.f2471x = false;
        this.f2472y = null;
        this.f2473z = null;
        this.A = null;
        this.B = null;
        this.C = new HashSet();
        this.f2455D = new Object();
    }

    public static void navy(d dVar, C0807f c0807f, a1.b bVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        int i5;
        if (c0807f == null) {
            return;
        }
        if (dVar.white != 8 && !(dVar instanceof h) && !(dVar instanceof a)) {
            int[] iArr = dVar.f2454h;
            bVar.alpha = iArr[0];
            bVar.bravo = iArr[1];
            bVar.charlie = dVar.quebec();
            bVar.delta = dVar.kilo();
            bVar.india = false;
            bVar.juliet = 0;
            if (bVar.alpha == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar.bravo == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 && dVar.ochre > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && dVar.ochre > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z2 && dVar.tango(0) && dVar.romeo == 0 && !z11) {
                bVar.alpha = 2;
                if (z10 && dVar.sierra == 0) {
                    bVar.alpha = 1;
                }
                z2 = false;
            }
            if (z10 && dVar.tango(1) && dVar.sierra == 0 && !z12) {
                bVar.bravo = 2;
                if (z2 && dVar.romeo == 0) {
                    bVar.bravo = 1;
                }
                z10 = false;
            }
            if (dVar.amber()) {
                bVar.alpha = 1;
                z2 = false;
            }
            if (dVar.azure()) {
                bVar.bravo = 1;
                z10 = false;
            }
            int[] iArr2 = dVar.tango;
            if (z11) {
                if (iArr2[0] == 4) {
                    bVar.alpha = 1;
                } else if (!z10) {
                    if (bVar.bravo == 1) {
                        i5 = bVar.delta;
                    } else {
                        bVar.alpha = 2;
                        c0807f.bravo(dVar, bVar);
                        i5 = bVar.foxtrot;
                    }
                    bVar.alpha = 1;
                    bVar.charlie = (int) (dVar.ochre * i5);
                }
            }
            if (z12) {
                if (iArr2[1] == 4) {
                    bVar.bravo = 1;
                } else if (!z2) {
                    if (bVar.alpha == 1) {
                        i4 = bVar.charlie;
                    } else {
                        bVar.bravo = 2;
                        c0807f.bravo(dVar, bVar);
                        i4 = bVar.echo;
                    }
                    bVar.bravo = 1;
                    if (dVar.olive == -1) {
                        bVar.delta = (int) (i4 / dVar.ochre);
                    } else {
                        bVar.delta = (int) (dVar.ochre * i4);
                    }
                }
            }
            c0807f.bravo(dVar, bVar);
            dVar.indigo(bVar.echo);
            dVar.gold(bVar.foxtrot);
            dVar.blue = bVar.hotel;
            dVar.cyan(bVar.golf);
            bVar.juliet = 0;
            return;
        }
        bVar.echo = 0;
        bVar.foxtrot = 0;
    }

    @Override // Z0.d
    public final void beige() {
        this.f2462o.tango();
        this.f2463p = 0;
        this.f2464q = 0;
        this.f2456i.clear();
        super.beige();
    }

    @Override // Z0.d
    public final void bronze(C1915c c1915c) {
        super.bronze(c1915c);
        int size = this.f2456i.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f2456i.get(i4)).bronze(c1915c);
        }
    }

    @Override // Z0.d
    public final void ivory(boolean z2, boolean z10) {
        super.ivory(z2, z10);
        int size = this.f2456i.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f2456i.get(i4)).ivory(z2, z10);
        }
    }

    public final void lavender(d dVar, int i4) {
        if (i4 == 0) {
            int i5 = this.f2465r + 1;
            b[] bVarArr = this.f2468u;
            if (i5 >= bVarArr.length) {
                this.f2468u = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f2468u;
            int i10 = this.f2465r;
            bVarArr2[i10] = new b(dVar, 0, this.f2461n);
            this.f2465r = i10 + 1;
            return;
        }
        if (i4 == 1) {
            int i11 = this.f2466s + 1;
            b[] bVarArr3 = this.f2467t;
            if (i11 >= bVarArr3.length) {
                this.f2467t = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f2467t;
            int i12 = this.f2466s;
            bVarArr4[i12] = new b(dVar, 1, this.f2461n);
            this.f2466s = i12 + 1;
        }
    }

    public final void lime(W0.c cVar) {
        e eVar;
        W0.c cVar2;
        int i4;
        boolean ochre = ochre(64);
        bravo(cVar, ochre);
        int size = this.f2456i.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) this.f2456i.get(i5);
            boolean[] zArr = dVar.lime;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f2456i.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f2513j; i11++) {
                        d dVar3 = aVar.f2512i[i11];
                        if (aVar.f2445l || dVar3.charlie()) {
                            int i12 = aVar.f2444k;
                            if (i12 != 0 && i12 != 1) {
                                if (i12 == 2 || i12 == 3) {
                                    dVar3.lime[1] = true;
                                }
                            } else {
                                dVar3.lime[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.C;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f2456i.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.bravo(cVar, ochre);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f2513j; i14++) {
                    if (hashSet.contains(gVar.f2512i[i14])) {
                        gVar.bravo(cVar, ochre);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).bravo(cVar, ochre);
                }
                hashSet.clear();
            }
        }
        if (W0.c.quebec) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f2456i.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f2454h[0] == 2) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            eVar = this;
            cVar2 = cVar;
            eVar.alpha(this, cVar2, hashSet2, i4, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.bravo(this, cVar2, dVar6);
                dVar6.bravo(cVar2, ochre);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f2456i.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f2454h;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.gray(1);
                    }
                    if (i18 == 2) {
                        dVar7.green(1);
                    }
                    dVar7.bravo(cVar2, ochre);
                    if (i17 == 2) {
                        dVar7.gray(i17);
                    }
                    if (i18 == 2) {
                        dVar7.green(i18);
                    }
                } else {
                    j.bravo(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.bravo(cVar2, ochre);
                    }
                }
            }
        }
        if (eVar.f2465r > 0) {
            j.alpha(this, cVar2, null, 0);
        }
        if (eVar.f2466s > 0) {
            j.alpha(this, cVar2, null, 1);
        }
    }

    public final boolean magenta(int i4, boolean z2) {
        boolean z10;
        a1.e eVar = this.f2458k;
        e eVar2 = eVar.alpha;
        boolean z11 = false;
        int juliet = eVar2.juliet(0);
        int juliet2 = eVar2.juliet(1);
        int romeo = eVar2.romeo();
        int sierra = eVar2.sierra();
        ArrayList arrayList = eVar.echo;
        if (z2 && (juliet == 2 || juliet2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.foxtrot == i4 && !oVar.kilo()) {
                    z2 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z2 && juliet == 2) {
                    eVar2.gray(1);
                    eVar2.indigo(eVar.delta(eVar2, 0));
                    eVar2.delta.echo.delta(eVar2.quebec());
                }
            } else if (z2 && juliet2 == 2) {
                eVar2.green(1);
                eVar2.gold(eVar.delta(eVar2, 1));
                eVar2.echo.echo.delta(eVar2.kilo());
            }
        }
        int[] iArr = eVar2.f2454h;
        if (i4 == 0) {
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int quebec = eVar2.quebec() + romeo;
                eVar2.delta.india.delta(quebec);
                eVar2.delta.echo.delta(quebec - romeo);
                z10 = true;
            }
            z10 = false;
        } else {
            int i10 = iArr[1];
            if (i10 == 1 || i10 == 4) {
                int kilo = eVar2.kilo() + sierra;
                eVar2.echo.india.delta(kilo);
                eVar2.echo.echo.delta(kilo - sierra);
                z10 = true;
            }
            z10 = false;
        }
        eVar.golf();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.foxtrot == i4 && (oVar2.bravo != eVar2 || oVar2.golf)) {
                oVar2.echo();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                o oVar3 = (o) it3.next();
                if (oVar3.foxtrot == i4 && (z10 || oVar3.bravo != eVar2)) {
                    if (!oVar3.hotel.juliet) {
                        break;
                    }
                    if (!oVar3.india.juliet) {
                        break;
                    }
                    if (!(oVar3 instanceof a1.c) && !oVar3.echo.juliet) {
                        break;
                    }
                }
            } else {
                z11 = true;
                break;
            }
        }
        eVar2.gray(juliet);
        eVar2.green(juliet2);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084f A[LOOP:14: B:281:0x084d->B:282:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0668  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v140, types: [a1.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void maroon() {
        Object[] objArr;
        c cVar;
        int i4;
        int i5;
        boolean z2;
        boolean z10;
        char c3;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        c cVar2;
        boolean z14;
        boolean[] zArr;
        boolean z15;
        int max;
        ?? r14;
        boolean z16;
        int max2;
        boolean z17;
        boolean z18;
        int i11;
        int i12;
        int max3;
        int max4;
        W0.c cVar3;
        char c4;
        n nVar;
        n nVar2;
        int bravo;
        int bravo2;
        int i13;
        n nVar3;
        n nVar4;
        boolean z19;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i14;
        boolean z20;
        this.orange = 0;
        this.peach = 0;
        this.f2470w = false;
        this.f2471x = false;
        int size = this.f2456i.size();
        int max5 = Math.max(0, quebec());
        int max6 = Math.max(0, kilo());
        int[] iArr = this.f2454h;
        int i15 = iArr[1];
        int i16 = iArr[0];
        int i17 = this.f2459l;
        c cVar4 = this.emerald;
        c cVar5 = this.cyan;
        if (i17 == 0 && j.charlie(this.f2469v, 1)) {
            C0807f c0807f = this.f2460m;
            int i18 = iArr[0];
            int i19 = iArr[1];
            blue();
            ArrayList arrayList7 = this.f2456i;
            int size2 = arrayList7.size();
            for (int i20 = 0; i20 < size2; i20++) {
                ((d) arrayList7.get(i20)).blue();
            }
            boolean z21 = this.f2461n;
            if (i18 == 1) {
                emerald(0, quebec());
            } else {
                cVar5.lima(0);
                this.orange = 0;
            }
            int i21 = 0;
            boolean z22 = false;
            boolean z23 = false;
            while (i21 < size2) {
                int[] iArr2 = iArr;
                d dVar = (d) arrayList7.get(i21);
                int i22 = i21;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    z20 = z22;
                    if (hVar.f2510m == 1) {
                        int i23 = hVar.f2507j;
                        if (i23 != -1) {
                            hVar.lavender(i23);
                        } else if (hVar.f2508k != -1 && amber()) {
                            hVar.lavender(quebec() - hVar.f2508k);
                        } else if (amber()) {
                            hVar.lavender((int) ((hVar.f2506i * quebec()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else {
                    z20 = z22;
                    if ((dVar instanceof a) && ((a) dVar).maroon() == 0) {
                        z22 = z20;
                        z23 = true;
                        i21 = i22 + 1;
                        iArr = iArr2;
                    }
                }
                z22 = z20;
                i21 = i22 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z22) {
                for (int i24 = 0; i24 < size2; i24 = i14 + 1) {
                    d dVar2 = (d) arrayList7.get(i24);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        i14 = i24;
                        if (hVar2.f2510m == 1) {
                            a1.h.charlie(0, hVar2, c0807f, z21);
                        }
                    } else {
                        i14 = i24;
                    }
                }
            }
            a1.h.charlie(0, this, c0807f, z21);
            if (z23) {
                for (int i25 = 0; i25 < size2; i25++) {
                    d dVar3 = (d) arrayList7.get(i25);
                    if (dVar3 instanceof a) {
                        a aVar = (a) dVar3;
                        if (aVar.maroon() == 0 && aVar.magenta()) {
                            a1.h.charlie(1, aVar, c0807f, z21);
                        }
                    }
                }
            }
            if (i19 == 1) {
                fuchsia(0, kilo());
            } else {
                cVar4.lima(0);
                this.peach = 0;
            }
            int i26 = 0;
            boolean z24 = false;
            boolean z25 = false;
            while (i26 < size2) {
                d dVar4 = (d) arrayList7.get(i26);
                int i27 = i26;
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f2510m == 0) {
                        int i28 = hVar3.f2507j;
                        if (i28 != -1) {
                            hVar3.lavender(i28);
                        } else if (hVar3.f2508k != -1 && azure()) {
                            hVar3.lavender(kilo() - hVar3.f2508k);
                        } else if (azure()) {
                            hVar3.lavender((int) ((hVar3.f2506i * kilo()) + 0.5f));
                        }
                        z24 = true;
                    }
                } else if ((dVar4 instanceof a) && ((a) dVar4).maroon() == 1) {
                    z25 = true;
                }
                i26 = i27 + 1;
            }
            if (z24) {
                for (int i29 = 0; i29 < size2; i29++) {
                    d dVar5 = (d) arrayList7.get(i29);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f2510m == 0) {
                            a1.h.india(1, hVar4, c0807f);
                        }
                    }
                }
            }
            a1.h.india(0, this, c0807f);
            if (z25) {
                for (int i30 = 0; i30 < size2; i30++) {
                    d dVar6 = (d) arrayList7.get(i30);
                    if (dVar6 instanceof a) {
                        a aVar2 = (a) dVar6;
                        if (aVar2.maroon() == 1 && aVar2.magenta()) {
                            a1.h.india(1, aVar2, c0807f);
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                d dVar7 = (d) arrayList7.get(i31);
                if (dVar7.zulu() && a1.h.alpha(dVar7)) {
                    navy(dVar7, c0807f, a1.h.alpha);
                    if (dVar7 instanceof h) {
                        if (((h) dVar7).f2510m == 0) {
                            a1.h.india(0, dVar7, c0807f);
                        } else {
                            a1.h.charlie(0, dVar7, c0807f, z21);
                        }
                    } else {
                        a1.h.charlie(0, dVar7, c0807f, z21);
                        a1.h.india(0, dVar7, c0807f);
                    }
                }
            }
            for (int i32 = 0; i32 < size; i32++) {
                d dVar8 = (d) this.f2456i.get(i32);
                if (dVar8.zulu() && !(dVar8 instanceof h) && !(dVar8 instanceof a) && !(dVar8 instanceof g) && !dVar8.bronze) {
                    int juliet = dVar8.juliet(0);
                    int juliet2 = dVar8.juliet(1);
                    if (juliet != 3 || dVar8.romeo == 1 || juliet2 != 3 || dVar8.sierra == 1) {
                        navy(dVar8, this.f2460m, new Object());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        W0.c cVar6 = this.f2462o;
        if (size <= 2 || ((i16 != 2 && i15 != 2) || !j.charlie(this.f2469v, Barcode.FORMAT_UPC_E))) {
            cVar = cVar5;
        } else {
            C0807f c0807f2 = this.f2460m;
            ArrayList arrayList8 = this.f2456i;
            int size3 = arrayList8.size();
            int i33 = 0;
            while (true) {
                if (i33 < size3) {
                    d dVar9 = (d) arrayList8.get(i33);
                    char c10 = objArr[0];
                    char c11 = objArr[1];
                    int i34 = i33;
                    int[] iArr3 = dVar9.f2454h;
                    cVar = cVar5;
                    if (!a1.h.hotel(c10, c11, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                        break;
                    }
                    i33 = i34 + 1;
                    cVar5 = cVar;
                } else {
                    cVar = cVar5;
                    int i35 = 0;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    ArrayList arrayList14 = null;
                    while (i35 < size3) {
                        int i36 = i35;
                        d dVar10 = (d) arrayList8.get(i35);
                        ArrayList arrayList15 = arrayList9;
                        char c12 = objArr[0];
                        ArrayList arrayList16 = arrayList10;
                        char c13 = objArr[1];
                        ArrayList arrayList17 = arrayList11;
                        int[] iArr4 = dVar10.f2454h;
                        ArrayList arrayList18 = arrayList12;
                        if (!a1.h.hotel(c12, c13, iArr4[0], iArr4[1])) {
                            navy(dVar10, c0807f2, this.f2455D);
                        }
                        boolean z26 = dVar10 instanceof h;
                        if (z26) {
                            h hVar5 = (h) dVar10;
                            if (hVar5.f2510m == 0) {
                                if (arrayList17 == null) {
                                    arrayList2 = new ArrayList();
                                } else {
                                    arrayList2 = arrayList17;
                                }
                                arrayList2.add(hVar5);
                            } else {
                                arrayList2 = arrayList17;
                            }
                            z19 = z26;
                            if (hVar5.f2510m == 1) {
                                if (arrayList15 == null) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = arrayList15;
                                }
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList15;
                            }
                        } else {
                            z19 = z26;
                            arrayList = arrayList15;
                            arrayList2 = arrayList17;
                        }
                        if (dVar10 instanceof i) {
                            if (dVar10 instanceof a) {
                                a aVar3 = (a) dVar10;
                                if (aVar3.maroon() == 0) {
                                    if (arrayList16 == null) {
                                        arrayList5 = new ArrayList();
                                    } else {
                                        arrayList5 = arrayList16;
                                    }
                                    arrayList5.add(aVar3);
                                } else {
                                    arrayList5 = arrayList16;
                                }
                                arrayList3 = arrayList;
                                arrayList4 = arrayList2;
                                if (aVar3.maroon() == 1) {
                                    if (arrayList18 == null) {
                                        arrayList6 = new ArrayList();
                                    } else {
                                        arrayList6 = arrayList18;
                                    }
                                    arrayList6.add(aVar3);
                                    arrayList18 = arrayList6;
                                }
                                arrayList10 = arrayList5;
                            } else {
                                arrayList3 = arrayList;
                                arrayList4 = arrayList2;
                                i iVar = (i) dVar10;
                                if (arrayList16 == null) {
                                    arrayList10 = new ArrayList();
                                } else {
                                    arrayList10 = arrayList16;
                                }
                                arrayList10.add(iVar);
                                if (arrayList18 == null) {
                                    arrayList12 = new ArrayList();
                                } else {
                                    arrayList12 = arrayList18;
                                }
                                arrayList12.add(iVar);
                                if (dVar10.cyan.foxtrot == null && dVar10.fuchsia.foxtrot == null && !z19 && !(dVar10 instanceof a)) {
                                    if (arrayList13 == null) {
                                        arrayList13 = new ArrayList();
                                    }
                                    ArrayList arrayList19 = arrayList13;
                                    arrayList19.add(dVar10);
                                    arrayList13 = arrayList19;
                                }
                                if (dVar10.emerald.foxtrot == null && dVar10.gold.foxtrot == null && dVar10.gray.foxtrot == null && !z19 && !(dVar10 instanceof a)) {
                                    if (arrayList14 == null) {
                                        arrayList14 = new ArrayList();
                                    }
                                    ArrayList arrayList20 = arrayList14;
                                    arrayList20.add(dVar10);
                                    arrayList14 = arrayList20;
                                }
                                i35 = i36 + 1;
                                arrayList9 = arrayList3;
                                arrayList11 = arrayList4;
                            }
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList10 = arrayList16;
                        }
                        arrayList12 = arrayList18;
                        if (dVar10.cyan.foxtrot == null) {
                            if (arrayList13 == null) {
                            }
                            ArrayList arrayList192 = arrayList13;
                            arrayList192.add(dVar10);
                            arrayList13 = arrayList192;
                        }
                        if (dVar10.emerald.foxtrot == null) {
                            if (arrayList14 == null) {
                            }
                            ArrayList arrayList202 = arrayList14;
                            arrayList202.add(dVar10);
                            arrayList14 = arrayList202;
                        }
                        i35 = i36 + 1;
                        arrayList9 = arrayList3;
                        arrayList11 = arrayList4;
                    }
                    ArrayList arrayList21 = arrayList9;
                    ArrayList arrayList22 = arrayList10;
                    ArrayList arrayList23 = arrayList11;
                    ArrayList arrayList24 = arrayList12;
                    ArrayList arrayList25 = new ArrayList();
                    if (arrayList21 != null) {
                        Iterator it = arrayList21.iterator();
                        while (it.hasNext()) {
                            a1.h.bravo((h) it.next(), 0, arrayList25, null);
                        }
                    }
                    int i37 = 0;
                    n nVar5 = null;
                    if (arrayList22 != null) {
                        Iterator it2 = arrayList22.iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            n bravo3 = a1.h.bravo(iVar2, i37, arrayList25, nVar5);
                            iVar2.lavender(i37, bravo3, arrayList25);
                            bravo3.alpha(arrayList25);
                            i37 = 0;
                            nVar5 = null;
                        }
                    }
                    HashSet hashSet = india(2).alpha;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            a1.h.bravo(((c) it3.next()).delta, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = india(4).alpha;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            a1.h.bravo(((c) it4.next()).delta, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = india(7).alpha;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            a1.h.bravo(((c) it5.next()).delta, 0, arrayList25, null);
                        }
                    }
                    n nVar6 = null;
                    if (arrayList13 != null) {
                        Iterator it6 = arrayList13.iterator();
                        while (it6.hasNext()) {
                            a1.h.bravo((d) it6.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it7 = arrayList23.iterator();
                        while (it7.hasNext()) {
                            a1.h.bravo((h) it7.next(), 1, arrayList25, null);
                        }
                    }
                    int i38 = 1;
                    if (arrayList24 != null) {
                        Iterator it8 = arrayList24.iterator();
                        while (it8.hasNext()) {
                            i iVar3 = (i) it8.next();
                            n bravo4 = a1.h.bravo(iVar3, i38, arrayList25, nVar6);
                            iVar3.lavender(i38, bravo4, arrayList25);
                            bravo4.alpha(arrayList25);
                            i38 = 1;
                            nVar6 = null;
                        }
                    }
                    HashSet hashSet4 = india(3).alpha;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            a1.h.bravo(((c) it9.next()).delta, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = india(6).alpha;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            a1.h.bravo(((c) it10.next()).delta, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = india(5).alpha;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            a1.h.bravo(((c) it11.next()).delta, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = india(7).alpha;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            a1.h.bravo(((c) it12.next()).delta, 1, arrayList25, null);
                        }
                    }
                    if (arrayList14 != null) {
                        Iterator it13 = arrayList14.iterator();
                        while (it13.hasNext()) {
                            a1.h.bravo((d) it13.next(), 1, arrayList25, null);
                        }
                    }
                    int i39 = 0;
                    while (i39 < size3) {
                        d dVar11 = (d) arrayList8.get(i39);
                        int[] iArr5 = dVar11.f2454h;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i40 = dVar11.f2452f;
                            int size4 = arrayList25.size();
                            int i41 = 0;
                            while (true) {
                                if (i41 < size4) {
                                    i13 = i39;
                                    nVar3 = (n) arrayList25.get(i41);
                                    int i42 = size4;
                                    if (i40 == nVar3.bravo) {
                                        break;
                                    }
                                    i41++;
                                    size4 = i42;
                                    i39 = i13;
                                } else {
                                    i13 = i39;
                                    nVar3 = null;
                                    break;
                                }
                            }
                            int i43 = dVar11.f2453g;
                            int size5 = arrayList25.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 < size5) {
                                    nVar4 = (n) arrayList25.get(i44);
                                    int i45 = size5;
                                    if (i43 == nVar4.bravo) {
                                        break;
                                    }
                                    i44++;
                                    size5 = i45;
                                } else {
                                    nVar4 = null;
                                    break;
                                }
                            }
                            if (nVar3 != null && nVar4 != null) {
                                nVar3.charlie(0, nVar4);
                                nVar4.charlie = 2;
                                arrayList25.remove(nVar3);
                            }
                        } else {
                            i13 = i39;
                        }
                        i39 = i13 + 1;
                    }
                    if (arrayList25.size() > 1) {
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList25.iterator();
                            int i46 = 0;
                            nVar = null;
                            while (it14.hasNext()) {
                                n nVar7 = (n) it14.next();
                                if (nVar7.charlie != 1 && (bravo2 = nVar7.bravo(cVar6, 0)) > i46) {
                                    nVar = nVar7;
                                    i46 = bravo2;
                                }
                            }
                            c4 = 1;
                            if (nVar != null) {
                                gray(1);
                                indigo(i46);
                                if (objArr[c4] == 2) {
                                    Iterator it15 = arrayList25.iterator();
                                    int i47 = 0;
                                    nVar2 = null;
                                    while (it15.hasNext()) {
                                        n nVar8 = (n) it15.next();
                                        if (nVar8.charlie != 0 && (bravo = nVar8.bravo(cVar6, 1)) > i47) {
                                            nVar2 = nVar8;
                                            i47 = bravo;
                                        }
                                    }
                                    if (nVar2 != null) {
                                        green(1);
                                        gold(i47);
                                        if (nVar == null || nVar2 != null) {
                                            if (i16 == 2) {
                                                if (max5 < quebec() && max5 > 0) {
                                                    indigo(max5);
                                                    this.f2470w = true;
                                                } else {
                                                    max5 = quebec();
                                                }
                                            }
                                            if (i15 == 2) {
                                                if (max6 < kilo() && max6 > 0) {
                                                    gold(max6);
                                                    this.f2471x = true;
                                                } else {
                                                    max6 = kilo();
                                                }
                                            }
                                            i4 = max6;
                                            i5 = max5;
                                            z2 = true;
                                        }
                                    }
                                }
                                nVar2 = null;
                                if (nVar == null) {
                                }
                                if (i16 == 2) {
                                }
                                if (i15 == 2) {
                                }
                                i4 = max6;
                                i5 = max5;
                                z2 = true;
                            }
                        } else {
                            c4 = 1;
                        }
                        nVar = null;
                        if (objArr[c4] == 2) {
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        if (i16 == 2) {
                        }
                        if (i15 == 2) {
                        }
                        i4 = max6;
                        i5 = max5;
                        z2 = true;
                    }
                }
            }
            if (ochre(64) && !ochre(128)) {
                z10 = false;
            } else {
                z10 = true;
            }
            cVar6.getClass();
            cVar6.hotel = false;
            if (this.f2469v == 0 && z10) {
                c3 = 1;
                cVar6.hotel = true;
            } else {
                c3 = 1;
            }
            ArrayList arrayList26 = this.f2456i;
            if (objArr[0] == 2 && objArr[c3] != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f2465r = 0;
            this.f2466s = 0;
            for (i10 = 0; i10 < size; i10++) {
                d dVar12 = (d) this.f2456i.get(i10);
                if (dVar12 instanceof e) {
                    ((e) dVar12).maroon();
                }
            }
            boolean ochre = ochre(64);
            z12 = z2;
            int i48 = 0;
            z13 = true;
            while (z13) {
                int i49 = i48 + 1;
                try {
                    cVar6.tango();
                    this.f2465r = 0;
                    this.f2466s = 0;
                    golf(cVar6);
                    for (int i50 = 0; i50 < size; i50++) {
                        ((d) this.f2456i.get(i50)).golf(cVar6);
                    }
                    lime(cVar6);
                    try {
                        WeakReference weakReference = this.f2472y;
                        if (weakReference != null && weakReference.get() != null) {
                            c cVar7 = (c) this.f2472y.get();
                            W0.f kilo = cVar6.kilo(cVar4);
                            W0.c cVar8 = this.f2462o;
                            cVar2 = cVar4;
                            z14 = z11;
                            try {
                                cVar8.foxtrot(cVar8.kilo(cVar7), kilo, 0, 5);
                                this.f2472y = null;
                            } catch (Exception e) {
                                e = e;
                                z13 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = j.alpha;
                                if (!z13) {
                                }
                                if (z14) {
                                }
                                max = Math.max(this.plum, quebec());
                                if (max <= quebec()) {
                                }
                                max2 = Math.max(this.purple, kilo());
                                if (max2 <= kilo()) {
                                }
                                if (!z17) {
                                }
                                z12 = z17;
                                z18 = z15;
                                i11 = 8;
                                if (i49 > i11) {
                                }
                                i48 = i49;
                                cVar4 = cVar2;
                                z11 = z14;
                            }
                        } else {
                            cVar2 = cVar4;
                            z14 = z11;
                        }
                        WeakReference weakReference2 = this.A;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            c cVar9 = (c) this.A.get();
                            W0.f kilo2 = cVar6.kilo(this.gold);
                            W0.c cVar10 = this.f2462o;
                            cVar10.foxtrot(kilo2, cVar10.kilo(cVar9), 0, 5);
                            this.A = null;
                        }
                        WeakReference weakReference3 = this.f2473z;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            c cVar11 = (c) this.f2473z.get();
                            c cVar12 = cVar;
                            try {
                                W0.f kilo3 = cVar6.kilo(cVar12);
                                W0.c cVar13 = this.f2462o;
                                cVar = cVar12;
                                cVar13.foxtrot(cVar13.kilo(cVar11), kilo3, 0, 5);
                                this.f2473z = null;
                            } catch (Exception e4) {
                                e = e4;
                                cVar = cVar12;
                                z13 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22 = j.alpha;
                                if (!z13) {
                                }
                                if (z14) {
                                }
                                max = Math.max(this.plum, quebec());
                                if (max <= quebec()) {
                                }
                                max2 = Math.max(this.purple, kilo());
                                if (max2 <= kilo()) {
                                }
                                if (!z17) {
                                }
                                z12 = z17;
                                z18 = z15;
                                i11 = 8;
                                if (i49 > i11) {
                                }
                                i48 = i49;
                                cVar4 = cVar2;
                                z11 = z14;
                            }
                        }
                        WeakReference weakReference4 = this.B;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            c cVar14 = (c) this.B.get();
                            W0.f kilo4 = cVar6.kilo(this.fuchsia);
                            try {
                                cVar3 = this.f2462o;
                            } catch (Exception e5) {
                                e = e5;
                                z13 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = j.alpha;
                                if (!z13) {
                                }
                                if (z14) {
                                    int i51 = 0;
                                    int i52 = 0;
                                    while (i12 < size) {
                                    }
                                    max3 = Math.max(this.plum, i51);
                                    max4 = Math.max(this.purple, i52);
                                    if (i16 == 2) {
                                        indigo(max3);
                                        objArr[0] = 2;
                                        z12 = true;
                                        z15 = true;
                                    }
                                    if (i15 == 2) {
                                        gold(max4);
                                        objArr[1] = 2;
                                        z12 = true;
                                        z15 = true;
                                    }
                                }
                                max = Math.max(this.plum, quebec());
                                if (max <= quebec()) {
                                }
                                max2 = Math.max(this.purple, kilo());
                                if (max2 <= kilo()) {
                                }
                                if (!z17) {
                                }
                                z12 = z17;
                                z18 = z15;
                                i11 = 8;
                                if (i49 > i11) {
                                }
                                i48 = i49;
                                cVar4 = cVar2;
                                z11 = z14;
                            }
                            try {
                                cVar3.foxtrot(kilo4, cVar3.kilo(cVar14), 0, 5);
                            } catch (Exception e10) {
                                e = e10;
                                z13 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = j.alpha;
                                if (!z13) {
                                }
                                if (z14) {
                                }
                                max = Math.max(this.plum, quebec());
                                if (max <= quebec()) {
                                }
                                max2 = Math.max(this.purple, kilo());
                                if (max2 <= kilo()) {
                                }
                                if (!z17) {
                                }
                                z12 = z17;
                                z18 = z15;
                                i11 = 8;
                                if (i49 > i11) {
                                }
                                i48 = i49;
                                cVar4 = cVar2;
                                z11 = z14;
                            }
                            try {
                                this.B = null;
                            } catch (Exception e11) {
                                e = e11;
                                z13 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22222 = j.alpha;
                                if (!z13) {
                                }
                                if (z14) {
                                }
                                max = Math.max(this.plum, quebec());
                                if (max <= quebec()) {
                                }
                                max2 = Math.max(this.purple, kilo());
                                if (max2 <= kilo()) {
                                }
                                if (!z17) {
                                }
                                z12 = z17;
                                z18 = z15;
                                i11 = 8;
                                if (i49 > i11) {
                                }
                                i48 = i49;
                                cVar4 = cVar2;
                                z11 = z14;
                            }
                        }
                        cVar6.papa();
                        z13 = true;
                    } catch (Exception e12) {
                        e = e12;
                        cVar2 = cVar4;
                        z14 = z11;
                    }
                } catch (Exception e13) {
                    e = e13;
                    cVar2 = cVar4;
                    z14 = z11;
                }
                boolean[] zArr222222 = j.alpha;
                if (!z13) {
                    zArr222222[2] = false;
                    boolean ochre2 = ochre(64);
                    jade(cVar6, ochre2);
                    int size6 = this.f2456i.size();
                    int i53 = 0;
                    z15 = false;
                    while (i53 < size6) {
                        d dVar13 = (d) this.f2456i.get(i53);
                        dVar13.jade(cVar6, ochre2);
                        boolean[] zArr3 = zArr222222;
                        boolean z27 = ochre2;
                        if (dVar13.hotel != -1 || dVar13.india != -1) {
                            z15 = true;
                        }
                        i53++;
                        zArr222222 = zArr3;
                        ochre2 = z27;
                    }
                    zArr = zArr222222;
                } else {
                    zArr = zArr222222;
                    jade(cVar6, ochre);
                    for (int i54 = 0; i54 < size; i54++) {
                        ((d) this.f2456i.get(i54)).jade(cVar6, ochre);
                    }
                    z15 = false;
                }
                if (z14 && i49 < 8 && zArr[2]) {
                    int i512 = 0;
                    int i522 = 0;
                    for (i12 = 0; i12 < size; i12++) {
                        d dVar14 = (d) this.f2456i.get(i12);
                        i512 = Math.max(i512, dVar14.quebec() + dVar14.orange);
                        i522 = Math.max(i522, dVar14.kilo() + dVar14.peach);
                    }
                    max3 = Math.max(this.plum, i512);
                    max4 = Math.max(this.purple, i522);
                    if (i16 == 2 && quebec() < max3) {
                        indigo(max3);
                        objArr[0] = 2;
                        z12 = true;
                        z15 = true;
                    }
                    if (i15 == 2 && kilo() < max4) {
                        gold(max4);
                        objArr[1] = 2;
                        z12 = true;
                        z15 = true;
                    }
                }
                max = Math.max(this.plum, quebec());
                if (max <= quebec()) {
                    indigo(max);
                    r14 = 1;
                    objArr[0] = 1;
                    z15 = true;
                    z16 = true;
                } else {
                    r14 = 1;
                    z16 = z12;
                }
                max2 = Math.max(this.purple, kilo());
                if (max2 <= kilo()) {
                    gold(max2);
                    objArr[r14] = r14;
                    z17 = r14;
                    z15 = z17;
                } else {
                    z17 = z16;
                }
                if (!z17) {
                    if (objArr[0] == 2 && i5 > 0 && quebec() > i5) {
                        this.f2470w = r14;
                        objArr[0] = r14;
                        indigo(i5);
                        z17 = r14;
                        z15 = z17;
                    }
                    if (objArr[r14] == 2 && i4 > 0 && kilo() > i4) {
                        this.f2471x = r14;
                        objArr[r14] = r14;
                        gold(i4);
                        i11 = 8;
                        z18 = true;
                        z12 = true;
                        if (i49 > i11) {
                            z13 = false;
                        } else {
                            z13 = z18;
                        }
                        i48 = i49;
                        cVar4 = cVar2;
                        z11 = z14;
                    }
                }
                z12 = z17;
                z18 = z15;
                i11 = 8;
                if (i49 > i11) {
                }
                i48 = i49;
                cVar4 = cVar2;
                z11 = z14;
            }
            this.f2456i = arrayList26;
            if (z12) {
                objArr[0] = i16;
                objArr[1] = i15;
            }
            bronze(cVar6.mike);
        }
        i4 = max6;
        i5 = max5;
        z2 = false;
        if (ochre(64)) {
        }
        z10 = true;
        cVar6.getClass();
        cVar6.hotel = false;
        if (this.f2469v == 0) {
        }
        c3 = 1;
        ArrayList arrayList262 = this.f2456i;
        if (objArr[0] == 2) {
        }
        z11 = true;
        this.f2465r = 0;
        this.f2466s = 0;
        while (i10 < size) {
        }
        boolean ochre3 = ochre(64);
        z12 = z2;
        int i482 = 0;
        z13 = true;
        while (z13) {
        }
        this.f2456i = arrayList262;
        if (z12) {
        }
        bronze(cVar6.mike);
    }

    @Override // Z0.d
    public final void november(StringBuilder sb2) {
        sb2.append(this.juliet + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.maroon);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.navy);
        sb2.append("\n");
        Iterator it = this.f2456i.iterator();
        while (it.hasNext()) {
            ((d) it.next()).november(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public final boolean ochre(int i4) {
        if ((this.f2469v & i4) == i4) {
            return true;
        }
        return false;
    }
}
