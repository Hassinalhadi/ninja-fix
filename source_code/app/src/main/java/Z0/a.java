package Z0;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class a extends i {

    /* renamed from: k, reason: collision with root package name */
    public int f2444k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2445l;

    /* renamed from: m, reason: collision with root package name */
    public int f2446m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2447n;

    @Override // Z0.d
    public final boolean amber() {
        return this.f2447n;
    }

    @Override // Z0.d
    public final boolean azure() {
        return this.f2447n;
    }

    @Override // Z0.d
    public final void bravo(W0.c cVar, boolean z2) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        int i5;
        int i10;
        int i11;
        c[] cVarArr = this.jade;
        c cVar2 = this.cyan;
        cVarArr[0] = cVar2;
        c cVar3 = this.emerald;
        int i12 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.fuchsia;
        cVarArr[1] = cVar4;
        c cVar5 = this.gold;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.india = cVar.kilo(cVar6);
        }
        int i13 = this.f2444k;
        if (i13 >= 0 && i13 < 4) {
            c cVar7 = cVarArr[i13];
            if (!this.f2447n) {
                magenta();
            }
            if (this.f2447n) {
                this.f2447n = false;
                int i14 = this.f2444k;
                if (i14 != 0 && i14 != 1) {
                    if (i14 == 2 || i14 == 3) {
                        cVar.delta(cVar3.india, this.peach);
                        cVar.delta(cVar5.india, this.peach);
                        return;
                    }
                    return;
                }
                cVar.delta(cVar2.india, this.orange);
                cVar.delta(cVar4.india, this.orange);
                return;
            }
            for (int i15 = 0; i15 < this.f2513j; i15++) {
                d dVar = this.f2512i[i15];
                if ((this.f2445l || dVar.charlie()) && ((((i11 = this.f2444k) == 0 || i11 == 1) && dVar.f2454h[0] == 3 && dVar.cyan.foxtrot != null && dVar.fuchsia.foxtrot != null) || ((i11 == 2 || i11 == 3) && dVar.f2454h[1] == 3 && dVar.emerald.foxtrot != null && dVar.gold.foxtrot != null))) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!cVar2.golf() && !cVar4.golf()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!cVar3.golf() && !cVar5.golf()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z10 && (((i10 = this.f2444k) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) {
                i4 = 5;
            } else {
                i4 = 4;
            }
            int i16 = 0;
            while (i16 < this.f2513j) {
                d dVar2 = this.f2512i[i16];
                if (this.f2445l || dVar2.charlie()) {
                    W0.f kilo = cVar.kilo(dVar2.jade[this.f2444k]);
                    int i17 = this.f2444k;
                    c cVar8 = dVar2.jade[i17];
                    cVar8.india = kilo;
                    c cVar9 = cVar8.foxtrot;
                    if (cVar9 != null && cVar9.delta == this) {
                        i5 = cVar8.golf;
                    } else {
                        i5 = 0;
                    }
                    if (i17 != 0 && i17 != i12) {
                        W0.f fVar = cVar7.india;
                        int i18 = this.f2446m + i5;
                        W0.b lima = cVar.lima();
                        W0.f mike = cVar.mike();
                        mike.silver = 0;
                        lima.bravo(fVar, kilo, mike, i18);
                        cVar.charlie(lima);
                    } else {
                        W0.f fVar2 = cVar7.india;
                        int i19 = this.f2446m - i5;
                        W0.b lima2 = cVar.lima();
                        W0.f mike2 = cVar.mike();
                        mike2.silver = 0;
                        lima2.charlie(fVar2, kilo, mike2, i19);
                        cVar.charlie(lima2);
                    }
                    cVar.echo(cVar7.india, kilo, this.f2446m + i5, i4);
                }
                i16++;
                i12 = 2;
            }
            int i20 = this.f2444k;
            if (i20 == 0) {
                cVar.echo(cVar4.india, cVar2.india, 0, 8);
                cVar.echo(cVar2.india, this.magenta.fuchsia.india, 0, 4);
                cVar.echo(cVar2.india, this.magenta.cyan.india, 0, 0);
                return;
            }
            if (i20 == 1) {
                cVar.echo(cVar2.india, cVar4.india, 0, 8);
                cVar.echo(cVar2.india, this.magenta.cyan.india, 0, 4);
                cVar.echo(cVar2.india, this.magenta.fuchsia.india, 0, 0);
            } else if (i20 == 2) {
                cVar.echo(cVar5.india, cVar3.india, 0, 8);
                cVar.echo(cVar3.india, this.magenta.gold.india, 0, 4);
                cVar.echo(cVar3.india, this.magenta.emerald.india, 0, 0);
            } else if (i20 == 3) {
                cVar.echo(cVar3.india, cVar5.india, 0, 8);
                cVar.echo(cVar3.india, this.magenta.emerald.india, 0, 4);
                cVar.echo(cVar3.india, this.magenta.gold.india, 0, 0);
            }
        }
    }

    @Override // Z0.d
    public final boolean charlie() {
        return true;
    }

    public final boolean magenta() {
        int i4;
        int i5;
        int i10;
        boolean z2 = true;
        int i11 = 0;
        while (true) {
            i4 = this.f2513j;
            if (i11 >= i4) {
                break;
            }
            d dVar = this.f2512i[i11];
            if ((this.f2445l || dVar.charlie()) && ((((i5 = this.f2444k) == 0 || i5 == 1) && !dVar.amber()) || (((i10 = this.f2444k) == 2 || i10 == 3) && !dVar.azure()))) {
                z2 = false;
            }
            i11++;
        }
        if (!z2 || i4 <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f2513j; i13++) {
            d dVar2 = this.f2512i[i13];
            if (this.f2445l || dVar2.charlie()) {
                if (!z10) {
                    int i14 = this.f2444k;
                    if (i14 == 0) {
                        i12 = dVar2.india(2).delta();
                    } else if (i14 == 1) {
                        i12 = dVar2.india(4).delta();
                    } else if (i14 == 2) {
                        i12 = dVar2.india(3).delta();
                    } else if (i14 == 3) {
                        i12 = dVar2.india(5).delta();
                    }
                    z10 = true;
                }
                int i15 = this.f2444k;
                if (i15 == 0) {
                    i12 = Math.min(i12, dVar2.india(2).delta());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, dVar2.india(4).delta());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, dVar2.india(3).delta());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, dVar2.india(5).delta());
                }
            }
        }
        int i16 = i12 + this.f2446m;
        int i17 = this.f2444k;
        if (i17 != 0 && i17 != 1) {
            fuchsia(i16, i16);
        } else {
            emerald(i16, i16);
        }
        this.f2447n = true;
        return true;
    }

    public final int maroon() {
        int i4 = this.f2444k;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // Z0.d
    public final String toString() {
        String gold = P0.gold(new StringBuilder("[Barrier] "), this.yellow, " {");
        for (int i4 = 0; i4 < this.f2513j; i4++) {
            d dVar = this.f2512i[i4];
            if (i4 > 0) {
                gold = P0.crimson(gold, ", ");
            }
            StringBuilder tango = Q0.c.tango(gold);
            tango.append(dVar.yellow);
            gold = tango.toString();
        }
        return P0.crimson(gold, "}");
    }
}
