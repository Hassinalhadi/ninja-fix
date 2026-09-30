package Z0;

import av.q;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h extends d {

    /* renamed from: i, reason: collision with root package name */
    public float f2506i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f2507j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f2508k = -1;

    /* renamed from: l, reason: collision with root package name */
    public c f2509l = this.emerald;

    /* renamed from: m, reason: collision with root package name */
    public int f2510m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2511n;

    public h() {
        this.lavender.clear();
        this.lavender.add(this.f2509l);
        int length = this.jade.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.jade[i4] = this.f2509l;
        }
    }

    @Override // Z0.d
    public final boolean amber() {
        return this.f2511n;
    }

    @Override // Z0.d
    public final boolean azure() {
        return this.f2511n;
    }

    @Override // Z0.d
    public final void bravo(W0.c cVar, boolean z2) {
        boolean z10;
        e eVar = (e) this.magenta;
        if (eVar != null) {
            Object india = eVar.india(2);
            Object india2 = eVar.india(4);
            d dVar = this.magenta;
            boolean z11 = true;
            if (dVar != null && dVar.f2454h[0] == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f2510m == 0) {
                india = eVar.india(3);
                india2 = eVar.india(5);
                d dVar2 = this.magenta;
                if (dVar2 == null || dVar2.f2454h[1] != 2) {
                    z11 = false;
                }
                z10 = z11;
            }
            if (this.f2511n) {
                c cVar2 = this.f2509l;
                if (cVar2.charlie) {
                    W0.f kilo = cVar.kilo(cVar2);
                    cVar.delta(kilo, this.f2509l.delta());
                    if (this.f2507j != -1) {
                        if (z10) {
                            cVar.foxtrot(cVar.kilo(india2), kilo, 0, 5);
                        }
                    } else if (this.f2508k != -1 && z10) {
                        W0.f kilo2 = cVar.kilo(india2);
                        cVar.foxtrot(kilo, cVar.kilo(india), 0, 5);
                        cVar.foxtrot(kilo2, kilo, 0, 5);
                    }
                    this.f2511n = false;
                    return;
                }
            }
            if (this.f2507j != -1) {
                W0.f kilo3 = cVar.kilo(this.f2509l);
                cVar.echo(kilo3, cVar.kilo(india), this.f2507j, 8);
                if (z10) {
                    cVar.foxtrot(cVar.kilo(india2), kilo3, 0, 5);
                    return;
                }
                return;
            }
            if (this.f2508k != -1) {
                W0.f kilo4 = cVar.kilo(this.f2509l);
                W0.f kilo5 = cVar.kilo(india2);
                cVar.echo(kilo4, kilo5, -this.f2508k, 8);
                if (z10) {
                    cVar.foxtrot(kilo4, cVar.kilo(india), 0, 5);
                    cVar.foxtrot(kilo5, kilo4, 0, 5);
                    return;
                }
                return;
            }
            if (this.f2506i != -1.0f) {
                W0.f kilo6 = cVar.kilo(this.f2509l);
                W0.f kilo7 = cVar.kilo(india2);
                float f5 = this.f2506i;
                W0.b lima = cVar.lima();
                lima.delta.golf(kilo6, -1.0f);
                lima.delta.golf(kilo7, f5);
                cVar.charlie(lima);
            }
        }
    }

    @Override // Z0.d
    public final boolean charlie() {
        return true;
    }

    @Override // Z0.d
    public final c india(int i4) {
        int mike = q.mike(i4);
        if (mike != 1) {
            if (mike != 2) {
                if (mike != 3) {
                    if (mike != 4) {
                        return null;
                    }
                }
            }
            if (this.f2510m == 0) {
                return this.f2509l;
            }
            return null;
        }
        if (this.f2510m == 1) {
            return this.f2509l;
        }
        return null;
    }

    @Override // Z0.d
    public final void jade(W0.c cVar, boolean z2) {
        if (this.magenta == null) {
            return;
        }
        c cVar2 = this.f2509l;
        cVar.getClass();
        int november = W0.c.november(cVar2);
        if (this.f2510m == 1) {
            this.orange = november;
            this.peach = 0;
            gold(this.magenta.kilo());
            indigo(0);
            return;
        }
        this.orange = 0;
        this.peach = november;
        indigo(this.magenta.quebec());
        gold(0);
    }

    public final void lavender(int i4) {
        this.f2509l.lima(i4);
        this.f2511n = true;
    }

    public final void lime(int i4) {
        if (this.f2510m != i4) {
            this.f2510m = i4;
            ArrayList arrayList = this.lavender;
            arrayList.clear();
            if (this.f2510m == 1) {
                this.f2509l = this.cyan;
            } else {
                this.f2509l = this.emerald;
            }
            arrayList.add(this.f2509l);
            c[] cVarArr = this.jade;
            int length = cVarArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                cVarArr[i5] = this.f2509l;
            }
        }
    }
}
