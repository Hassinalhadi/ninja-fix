package a1;

import av.q;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k extends o {
    public static final int[] kilo = new int[2];

    public static void mike(int[] iArr, int i4, int i5, int i10, int i11, float f5, int i12) {
        int i13 = i5 - i4;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    iArr[0] = i13;
                    iArr[1] = (int) ((i13 * f5) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i14 * f5) + 0.5f);
            iArr[1] = i14;
            return;
        }
        int i15 = (int) ((i14 * f5) + 0.5f);
        int i16 = (int) ((i13 / f5) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // a1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(d dVar) {
        float f5;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        int i4;
        if (q.mike(this.juliet) != 3) {
            g gVar = this.echo;
            boolean z13 = gVar.juliet;
            f fVar = this.hotel;
            f fVar2 = this.india;
            if (!z13 && this.delta == 3) {
                Z0.d dVar2 = this.bravo;
                int i5 = dVar2.romeo;
                if (i5 != 2) {
                    if (i5 == 3) {
                        int i10 = dVar2.sierra;
                        if (i10 != 0 && i10 != 3) {
                            int i11 = dVar2.olive;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i4 = 0;
                                        gVar.delta(i4);
                                    } else {
                                        f10 = dVar2.echo.echo.golf;
                                        f11 = dVar2.ochre;
                                    }
                                } else {
                                    f12 = dVar2.echo.echo.golf / dVar2.ochre;
                                    i4 = (int) (f12 + 0.5f);
                                    gVar.delta(i4);
                                }
                            } else {
                                f10 = dVar2.echo.echo.golf;
                                f11 = dVar2.ochre;
                            }
                            f12 = f10 * f11;
                            i4 = (int) (f12 + 0.5f);
                            gVar.delta(i4);
                        } else {
                            m mVar = dVar2.echo;
                            f fVar3 = mVar.hotel;
                            f fVar4 = mVar.india;
                            if (dVar2.cyan.foxtrot != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (dVar2.emerald.foxtrot != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (dVar2.fuchsia.foxtrot != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (dVar2.gold.foxtrot != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            f5 = 0.5f;
                            int i12 = dVar2.olive;
                            if (z2 && z10 && z11 && z12) {
                                float f13 = dVar2.ochre;
                                boolean z14 = fVar3.juliet;
                                int[] iArr = kilo;
                                if (z14 && fVar4.juliet) {
                                    if (fVar.charlie && fVar2.charlie) {
                                        mike(iArr, ((f) fVar.lima.get(0)).golf + fVar.foxtrot, ((f) fVar2.lima.get(0)).golf - fVar2.foxtrot, fVar3.golf + fVar3.foxtrot, fVar4.golf - fVar4.foxtrot, f13, i12);
                                        gVar.delta(iArr[0]);
                                        this.bravo.echo.echo.delta(iArr[1]);
                                        return;
                                    }
                                    return;
                                }
                                boolean z15 = fVar.juliet;
                                ArrayList arrayList = fVar3.lima;
                                if (z15 && fVar2.juliet) {
                                    if (fVar3.charlie && fVar4.charlie) {
                                        mike(iArr, fVar.golf + fVar.foxtrot, fVar2.golf - fVar2.foxtrot, ((f) arrayList.get(0)).golf + fVar3.foxtrot, ((f) fVar4.lima.get(0)).golf - fVar4.foxtrot, f13, i12);
                                        gVar.delta(iArr[0]);
                                        this.bravo.echo.echo.delta(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (fVar.charlie && fVar2.charlie && fVar3.charlie && fVar4.charlie) {
                                    mike(iArr, ((f) fVar.lima.get(0)).golf + fVar.foxtrot, ((f) fVar2.lima.get(0)).golf - fVar2.foxtrot, ((f) arrayList.get(0)).golf + fVar3.foxtrot, ((f) fVar4.lima.get(0)).golf - fVar4.foxtrot, f13, i12);
                                    gVar.delta(iArr[0]);
                                    this.bravo.echo.echo.delta(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (z2 && z11) {
                                if (fVar.charlie && fVar2.charlie) {
                                    float f14 = dVar2.ochre;
                                    int i13 = ((f) fVar.lima.get(0)).golf + fVar.foxtrot;
                                    int i14 = ((f) fVar2.lima.get(0)).golf - fVar2.foxtrot;
                                    if (i12 != -1 && i12 != 0) {
                                        if (i12 == 1) {
                                            int golf = golf(i14 - i13, 0);
                                            int i15 = (int) ((golf / f14) + 0.5f);
                                            int golf2 = golf(i15, 1);
                                            if (i15 != golf2) {
                                                golf = (int) ((golf2 * f14) + 0.5f);
                                            }
                                            gVar.delta(golf);
                                            this.bravo.echo.echo.delta(golf2);
                                        }
                                    } else {
                                        int golf3 = golf(i14 - i13, 0);
                                        int i16 = (int) ((golf3 * f14) + 0.5f);
                                        int golf4 = golf(i16, 1);
                                        if (i16 != golf4) {
                                            golf3 = (int) ((golf4 / f14) + 0.5f);
                                        }
                                        gVar.delta(golf3);
                                        this.bravo.echo.echo.delta(golf4);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z10 && z12) {
                                if (fVar3.charlie && fVar4.charlie) {
                                    float f15 = dVar2.ochre;
                                    int i17 = ((f) fVar3.lima.get(0)).golf + fVar3.foxtrot;
                                    int i18 = ((f) fVar4.lima.get(0)).golf - fVar4.foxtrot;
                                    if (i12 != -1) {
                                        if (i12 == 0) {
                                            int golf5 = golf(i18 - i17, 1);
                                            int i19 = (int) ((golf5 * f15) + 0.5f);
                                            int golf6 = golf(i19, 0);
                                            if (i19 != golf6) {
                                                golf5 = (int) ((golf6 / f15) + 0.5f);
                                            }
                                            gVar.delta(golf6);
                                            this.bravo.echo.echo.delta(golf5);
                                        }
                                    }
                                    int golf7 = golf(i18 - i17, 1);
                                    int i20 = (int) ((golf7 / f15) + 0.5f);
                                    int golf8 = golf(i20, 0);
                                    if (i20 != golf8) {
                                        golf7 = (int) ((golf8 * f15) + 0.5f);
                                    }
                                    gVar.delta(golf8);
                                    this.bravo.echo.echo.delta(golf7);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    f5 = 0.5f;
                    Z0.d dVar3 = dVar2.magenta;
                    if (dVar3 != null) {
                        if (dVar3.delta.echo.juliet) {
                            gVar.delta((int) ((r7.golf * dVar2.whiskey) + 0.5f));
                        }
                    }
                }
                if (!fVar.charlie && fVar2.charlie) {
                    if (!fVar.juliet || !fVar2.juliet || !gVar.juliet) {
                        if (!gVar.juliet && this.delta == 3) {
                            Z0.d dVar4 = this.bravo;
                            if (dVar4.romeo == 0 && !dVar4.xray()) {
                                f fVar5 = (f) fVar.lima.get(0);
                                f fVar6 = (f) fVar2.lima.get(0);
                                int i21 = fVar5.golf + fVar.foxtrot;
                                int i22 = fVar6.golf + fVar2.foxtrot;
                                fVar.delta(i21);
                                fVar2.delta(i22);
                                gVar.delta(i22 - i21);
                                return;
                            }
                        }
                        if (!gVar.juliet && this.delta == 3 && this.alpha == 1 && fVar.lima.size() > 0 && fVar2.lima.size() > 0) {
                            f fVar7 = (f) fVar.lima.get(0);
                            int min = Math.min((((f) fVar2.lima.get(0)).golf + fVar2.foxtrot) - (fVar7.golf + fVar.foxtrot), gVar.mike);
                            Z0.d dVar5 = this.bravo;
                            int i23 = dVar5.victor;
                            int max = Math.max(dVar5.uniform, min);
                            if (i23 > 0) {
                                max = Math.min(i23, max);
                            }
                            gVar.delta(max);
                        }
                        if (gVar.juliet) {
                            f fVar8 = (f) fVar.lima.get(0);
                            f fVar9 = (f) fVar2.lima.get(0);
                            int i24 = fVar8.golf;
                            int i25 = fVar.foxtrot + i24;
                            int i26 = fVar9.golf;
                            int i27 = fVar2.foxtrot + i26;
                            float f16 = this.bravo.red;
                            if (fVar8 == fVar9) {
                                f16 = f5;
                            } else {
                                i24 = i25;
                                i26 = i27;
                            }
                            fVar.delta((int) ((((i26 - i24) - gVar.golf) * f16) + i24 + f5));
                            fVar2.delta(fVar.golf + gVar.golf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            f5 = 0.5f;
            if (!fVar.charlie) {
                return;
            } else {
                return;
            }
        }
        Z0.d dVar6 = this.bravo;
        lima(dVar6.cyan, dVar6.fuchsia, 0);
    }

    @Override // a1.o
    public final void delta() {
        Z0.d dVar;
        Z0.d dVar2;
        int i4;
        Z0.d dVar3;
        Z0.d dVar4;
        int i5;
        Z0.d dVar5 = this.bravo;
        boolean z2 = dVar5.alpha;
        g gVar = this.echo;
        if (z2) {
            gVar.delta(dVar5.quebec());
        }
        boolean z10 = gVar.juliet;
        f fVar = this.india;
        f fVar2 = this.hotel;
        if (!z10) {
            Z0.d dVar6 = this.bravo;
            int i10 = dVar6.f2454h[0];
            this.delta = i10;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = dVar6.magenta) != null && ((i5 = dVar4.f2454h[0]) == 1 || i5 == 4)) {
                    int quebec = (dVar4.quebec() - this.bravo.cyan.echo()) - this.bravo.fuchsia.echo();
                    o.bravo(fVar2, dVar4.delta.hotel, this.bravo.cyan.echo());
                    o.bravo(fVar, dVar4.delta.india, -this.bravo.fuchsia.echo());
                    gVar.delta(quebec);
                    return;
                }
                if (i10 == 1) {
                    gVar.delta(dVar6.quebec());
                }
            }
        } else if (this.delta == 4 && (dVar2 = (dVar = this.bravo).magenta) != null && ((i4 = dVar2.f2454h[0]) == 1 || i4 == 4)) {
            o.bravo(fVar2, dVar2.delta.hotel, dVar.cyan.echo());
            o.bravo(fVar, dVar2.delta.india, -this.bravo.fuchsia.echo());
            return;
        }
        if (gVar.juliet) {
            Z0.d dVar7 = this.bravo;
            if (dVar7.alpha) {
                Z0.c[] cVarArr = dVar7.jade;
                Z0.c cVar = cVarArr[0];
                Z0.c cVar2 = cVar.foxtrot;
                if (cVar2 != null && cVarArr[1].foxtrot != null) {
                    if (dVar7.xray()) {
                        fVar2.foxtrot = this.bravo.jade[0].echo();
                        fVar.foxtrot = -this.bravo.jade[1].echo();
                        return;
                    }
                    f hotel = o.hotel(this.bravo.jade[0]);
                    if (hotel != null) {
                        o.bravo(fVar2, hotel, this.bravo.jade[0].echo());
                    }
                    f hotel2 = o.hotel(this.bravo.jade[1]);
                    if (hotel2 != null) {
                        o.bravo(fVar, hotel2, -this.bravo.jade[1].echo());
                    }
                    fVar2.bravo = true;
                    fVar.bravo = true;
                    return;
                }
                if (cVar2 != null) {
                    f hotel3 = o.hotel(cVar);
                    if (hotel3 != null) {
                        o.bravo(fVar2, hotel3, this.bravo.jade[0].echo());
                        o.bravo(fVar, fVar2, gVar.golf);
                        return;
                    }
                    return;
                }
                Z0.c cVar3 = cVarArr[1];
                if (cVar3.foxtrot != null) {
                    f hotel4 = o.hotel(cVar3);
                    if (hotel4 != null) {
                        o.bravo(fVar, hotel4, -this.bravo.jade[1].echo());
                        o.bravo(fVar2, fVar, -gVar.golf);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof Z0.i) && dVar7.magenta != null && dVar7.india(7).foxtrot == null) {
                    Z0.d dVar8 = this.bravo;
                    o.bravo(fVar2, dVar8.magenta.delta.hotel, dVar8.romeo());
                    o.bravo(fVar, fVar2, gVar.golf);
                    return;
                }
                return;
            }
        }
        if (this.delta == 3) {
            Z0.d dVar9 = this.bravo;
            int i11 = dVar9.romeo;
            if (i11 != 2) {
                if (i11 == 3) {
                    if (dVar9.sierra == 3) {
                        fVar2.alpha = this;
                        fVar.alpha = this;
                        m mVar = dVar9.echo;
                        mVar.hotel.alpha = this;
                        mVar.india.alpha = this;
                        gVar.alpha = this;
                        if (dVar9.yankee()) {
                            gVar.lima.add(this.bravo.echo.echo);
                            this.bravo.echo.echo.kilo.add(gVar);
                            m mVar2 = this.bravo.echo;
                            mVar2.echo.alpha = this;
                            gVar.lima.add(mVar2.hotel);
                            gVar.lima.add(this.bravo.echo.india);
                            this.bravo.echo.hotel.kilo.add(gVar);
                            this.bravo.echo.india.kilo.add(gVar);
                        } else if (this.bravo.xray()) {
                            this.bravo.echo.echo.lima.add(gVar);
                            gVar.kilo.add(this.bravo.echo.echo);
                        } else {
                            this.bravo.echo.echo.lima.add(gVar);
                        }
                    } else {
                        g gVar2 = dVar9.echo.echo;
                        gVar.lima.add(gVar2);
                        gVar2.kilo.add(gVar);
                        this.bravo.echo.hotel.kilo.add(gVar);
                        this.bravo.echo.india.kilo.add(gVar);
                        gVar.bravo = true;
                        gVar.kilo.add(fVar2);
                        gVar.kilo.add(fVar);
                        fVar2.lima.add(gVar);
                        fVar.lima.add(gVar);
                    }
                }
            } else {
                Z0.d dVar10 = dVar9.magenta;
                if (dVar10 != null) {
                    g gVar3 = dVar10.echo.echo;
                    gVar.lima.add(gVar3);
                    gVar3.kilo.add(gVar);
                    gVar.bravo = true;
                    gVar.kilo.add(fVar2);
                    gVar.kilo.add(fVar);
                }
            }
        }
        Z0.d dVar11 = this.bravo;
        Z0.c[] cVarArr2 = dVar11.jade;
        Z0.c cVar4 = cVarArr2[0];
        Z0.c cVar5 = cVar4.foxtrot;
        if (cVar5 != null && cVarArr2[1].foxtrot != null) {
            if (dVar11.xray()) {
                fVar2.foxtrot = this.bravo.jade[0].echo();
                fVar.foxtrot = -this.bravo.jade[1].echo();
                return;
            }
            f hotel5 = o.hotel(this.bravo.jade[0]);
            f hotel6 = o.hotel(this.bravo.jade[1]);
            if (hotel5 != null) {
                hotel5.bravo(this);
            }
            if (hotel6 != null) {
                hotel6.bravo(this);
            }
            this.juliet = 4;
            return;
        }
        if (cVar5 != null) {
            f hotel7 = o.hotel(cVar4);
            if (hotel7 != null) {
                o.bravo(fVar2, hotel7, this.bravo.jade[0].echo());
                charlie(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        Z0.c cVar6 = cVarArr2[1];
        if (cVar6.foxtrot != null) {
            f hotel8 = o.hotel(cVar6);
            if (hotel8 != null) {
                o.bravo(fVar, hotel8, -this.bravo.jade[1].echo());
                charlie(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof Z0.i) && (dVar3 = dVar11.magenta) != null) {
            o.bravo(fVar2, dVar3.delta.hotel, dVar11.romeo());
            charlie(fVar, fVar2, 1, gVar);
        }
    }

    @Override // a1.o
    public final void echo() {
        f fVar = this.hotel;
        if (fVar.juliet) {
            this.bravo.orange = fVar.golf;
        }
    }

    @Override // a1.o
    public final void foxtrot() {
        this.charlie = null;
        this.hotel.charlie();
        this.india.charlie();
        this.echo.charlie();
        this.golf = false;
    }

    @Override // a1.o
    public final boolean kilo() {
        if (this.delta == 3 && this.bravo.romeo != 0) {
            return false;
        }
        return true;
    }

    public final void november() {
        this.golf = false;
        f fVar = this.hotel;
        fVar.charlie();
        fVar.juliet = false;
        f fVar2 = this.india;
        fVar2.charlie();
        fVar2.juliet = false;
        this.echo.juliet = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.bravo.yellow;
    }
}
