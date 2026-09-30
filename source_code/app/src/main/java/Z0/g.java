package Z0;

import c1.C0807f;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g extends i {
    public int A;
    public float B;
    public float C;

    /* renamed from: D, reason: collision with root package name */
    public float f2474D;

    /* renamed from: E, reason: collision with root package name */
    public float f2475E;

    /* renamed from: F, reason: collision with root package name */
    public float f2476F;

    /* renamed from: G, reason: collision with root package name */
    public float f2477G;

    /* renamed from: H, reason: collision with root package name */
    public int f2478H;

    /* renamed from: I, reason: collision with root package name */
    public int f2479I;

    /* renamed from: J, reason: collision with root package name */
    public int f2480J;

    /* renamed from: K, reason: collision with root package name */
    public int f2481K;

    /* renamed from: L, reason: collision with root package name */
    public int f2482L;

    /* renamed from: M, reason: collision with root package name */
    public int f2483M;

    /* renamed from: N, reason: collision with root package name */
    public int f2484N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f2485O;

    /* renamed from: P, reason: collision with root package name */
    public d[] f2486P;
    public d[] Q;

    /* renamed from: R, reason: collision with root package name */
    public int[] f2487R;

    /* renamed from: S, reason: collision with root package name */
    public d[] f2488S;

    /* renamed from: T, reason: collision with root package name */
    public int f2489T;

    /* renamed from: k, reason: collision with root package name */
    public int f2490k;

    /* renamed from: l, reason: collision with root package name */
    public int f2491l;

    /* renamed from: m, reason: collision with root package name */
    public int f2492m;

    /* renamed from: n, reason: collision with root package name */
    public int f2493n;

    /* renamed from: o, reason: collision with root package name */
    public int f2494o;

    /* renamed from: p, reason: collision with root package name */
    public int f2495p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2496q;

    /* renamed from: r, reason: collision with root package name */
    public int f2497r;

    /* renamed from: s, reason: collision with root package name */
    public int f2498s;

    /* renamed from: t, reason: collision with root package name */
    public a1.b f2499t;

    /* renamed from: u, reason: collision with root package name */
    public C0807f f2500u;

    /* renamed from: v, reason: collision with root package name */
    public int f2501v;

    /* renamed from: w, reason: collision with root package name */
    public int f2502w;

    /* renamed from: x, reason: collision with root package name */
    public int f2503x;

    /* renamed from: y, reason: collision with root package name */
    public int f2504y;

    /* renamed from: z, reason: collision with root package name */
    public int f2505z;

    @Override // Z0.d
    public final void bravo(W0.c cVar, boolean z2) {
        boolean z10;
        boolean z11;
        d dVar;
        float f5;
        int i4;
        boolean z12;
        super.bravo(cVar, z2);
        d dVar2 = this.magenta;
        if (dVar2 != null && ((e) dVar2).f2461n) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i5 = this.f2482L;
        ArrayList arrayList = this.f2485O;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            f fVar = (f) arrayList.get(i10);
                            if (i10 == size - 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            fVar.bravo(i10, z10, z12);
                        }
                    }
                } else if (this.f2487R != null && this.Q != null && this.f2486P != null) {
                    for (int i11 = 0; i11 < this.f2489T; i11++) {
                        this.f2488S[i11].black();
                    }
                    int[] iArr = this.f2487R;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    float f10 = this.B;
                    d dVar3 = null;
                    int i14 = 0;
                    while (i14 < i12) {
                        if (z10) {
                            i4 = (i12 - i14) - 1;
                            f5 = 1.0f - this.B;
                        } else {
                            f5 = f10;
                            i4 = i14;
                        }
                        d dVar4 = this.Q[i4];
                        if (dVar4 != null && dVar4.white != 8) {
                            c cVar2 = dVar4.cyan;
                            if (i14 == 0) {
                                dVar4.foxtrot(cVar2, this.cyan, this.f2494o);
                                dVar4.f2448a = this.f2501v;
                                dVar4.red = f5;
                            }
                            if (i14 == i12 - 1) {
                                dVar4.foxtrot(dVar4.fuchsia, this.fuchsia, this.f2495p);
                            }
                            if (i14 > 0 && dVar3 != null) {
                                int i15 = this.f2478H;
                                c cVar3 = dVar3.fuchsia;
                                dVar4.foxtrot(cVar2, cVar3, i15);
                                dVar3.foxtrot(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                        i14++;
                        f10 = f5;
                    }
                    for (int i16 = 0; i16 < i13; i16++) {
                        d dVar5 = this.f2486P[i16];
                        if (dVar5 != null && dVar5.white != 8) {
                            c cVar4 = dVar5.emerald;
                            if (i16 == 0) {
                                dVar5.foxtrot(cVar4, this.emerald, this.f2490k);
                                dVar5.f2449b = this.f2502w;
                                dVar5.silver = this.C;
                            }
                            if (i16 == i13 - 1) {
                                dVar5.foxtrot(dVar5.gold, this.gold, this.f2491l);
                            }
                            if (i16 > 0 && dVar3 != null) {
                                int i17 = this.f2479I;
                                c cVar5 = dVar3.gold;
                                dVar5.foxtrot(cVar4, cVar5, i17);
                                dVar3.foxtrot(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                    for (int i18 = 0; i18 < i12; i18++) {
                        for (int i19 = 0; i19 < i13; i19++) {
                            int i20 = (i19 * i12) + i18;
                            if (this.f2484N == 1) {
                                i20 = (i18 * i13) + i19;
                            }
                            d[] dVarArr = this.f2488S;
                            if (i20 < dVarArr.length && (dVar = dVarArr[i20]) != null && dVar.white != 8) {
                                d dVar6 = this.Q[i18];
                                d dVar7 = this.f2486P[i19];
                                if (dVar != dVar6) {
                                    dVar.foxtrot(dVar.cyan, dVar6.cyan, 0);
                                    dVar.foxtrot(dVar.fuchsia, dVar6.fuchsia, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.foxtrot(dVar.emerald, dVar7.emerald, 0);
                                    dVar.foxtrot(dVar.gold, dVar7.gold, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i21 = 0; i21 < size2; i21++) {
                    f fVar2 = (f) arrayList.get(i21);
                    if (i21 == size2 - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fVar2.bravo(i21, z10, z11);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).bravo(0, z10, true);
        }
        this.f2496q = false;
    }

    @Override // Z0.i
    public final void lime() {
        for (int i4 = 0; i4 < this.f2513j; i4++) {
            d dVar = this.f2512i[i4];
            if (dVar != null) {
                dVar.bronze = true;
            }
        }
    }

    public final int magenta(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f2454h;
            if (iArr[1] == 3) {
                int i5 = dVar.sierra;
                if (i5 != 0) {
                    if (i5 == 2) {
                        int i10 = (int) (dVar.zulu * i4);
                        if (i10 != dVar.kilo()) {
                            dVar.golf = true;
                            navy(iArr[0], dVar.quebec(), 1, i10, dVar);
                        }
                        return i10;
                    }
                    dVar2 = dVar;
                    if (i5 == 1) {
                        return dVar2.kilo();
                    }
                    if (i5 == 3) {
                        return (int) ((dVar2.quebec() * dVar2.ochre) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.kilo();
        }
        return 0;
    }

    public final int maroon(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f2454h;
            if (iArr[0] == 3) {
                int i5 = dVar.romeo;
                if (i5 != 0) {
                    if (i5 == 2) {
                        int i10 = (int) (dVar.whiskey * i4);
                        if (i10 != dVar.quebec()) {
                            dVar.golf = true;
                            navy(1, i10, iArr[1], dVar.kilo(), dVar);
                        }
                        return i10;
                    }
                    dVar2 = dVar;
                    if (i5 == 1) {
                        return dVar2.quebec();
                    }
                    if (i5 == 3) {
                        return (int) ((dVar2.kilo() * dVar2.ochre) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.quebec();
        }
        return 0;
    }

    public final void navy(int i4, int i5, int i10, int i11, d dVar) {
        C0807f c0807f;
        d dVar2;
        while (true) {
            c0807f = this.f2500u;
            if (c0807f != null || (dVar2 = this.magenta) == null) {
                break;
            } else {
                this.f2500u = ((e) dVar2).f2460m;
            }
        }
        a1.b bVar = this.f2499t;
        bVar.alpha = i4;
        bVar.bravo = i10;
        bVar.charlie = i5;
        bVar.delta = i11;
        c0807f.bravo(dVar, bVar);
        dVar.indigo(bVar.echo);
        dVar.gold(bVar.foxtrot);
        dVar.blue = bVar.hotel;
        dVar.cyan(bVar.golf);
    }
}
