package a1;

import av.q;

/* loaded from: classes3.dex */
public final class m extends o {
    public f kilo;
    public a lima;

    @Override // a1.d
    public final void alpha(d dVar) {
        float f5;
        float f10;
        float f11;
        int i4;
        if (q.mike(this.juliet) != 3) {
            g gVar = this.echo;
            if (gVar.charlie && !gVar.juliet && this.delta == 3) {
                Z0.d dVar2 = this.bravo;
                int i5 = dVar2.sierra;
                if (i5 != 2) {
                    if (i5 == 3) {
                        g gVar2 = dVar2.delta.echo;
                        if (gVar2.juliet) {
                            int i10 = dVar2.olive;
                            if (i10 != -1) {
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        i4 = 0;
                                        gVar.delta(i4);
                                    } else {
                                        f5 = gVar2.golf;
                                        f10 = dVar2.ochre;
                                    }
                                } else {
                                    f11 = gVar2.golf * dVar2.ochre;
                                    i4 = (int) (f11 + 0.5f);
                                    gVar.delta(i4);
                                }
                            } else {
                                f5 = gVar2.golf;
                                f10 = dVar2.ochre;
                            }
                            f11 = f5 / f10;
                            i4 = (int) (f11 + 0.5f);
                            gVar.delta(i4);
                        }
                    }
                } else {
                    Z0.d dVar3 = dVar2.magenta;
                    if (dVar3 != null) {
                        if (dVar3.echo.echo.juliet) {
                            gVar.delta((int) ((r5.golf * dVar2.zulu) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.hotel;
            if (fVar.charlie) {
                f fVar2 = this.india;
                if (fVar2.charlie) {
                    if (!fVar.juliet || !fVar2.juliet || !gVar.juliet) {
                        if (!gVar.juliet && this.delta == 3) {
                            Z0.d dVar4 = this.bravo;
                            if (dVar4.romeo == 0 && !dVar4.yankee()) {
                                f fVar3 = (f) fVar.lima.get(0);
                                f fVar4 = (f) fVar2.lima.get(0);
                                int i11 = fVar3.golf + fVar.foxtrot;
                                int i12 = fVar4.golf + fVar2.foxtrot;
                                fVar.delta(i11);
                                fVar2.delta(i12);
                                gVar.delta(i12 - i11);
                                return;
                            }
                        }
                        if (!gVar.juliet && this.delta == 3 && this.alpha == 1 && fVar.lima.size() > 0 && fVar2.lima.size() > 0) {
                            f fVar5 = (f) fVar.lima.get(0);
                            int i13 = (((f) fVar2.lima.get(0)).golf + fVar2.foxtrot) - (fVar5.golf + fVar.foxtrot);
                            int i14 = gVar.mike;
                            if (i13 < i14) {
                                gVar.delta(i13);
                            } else {
                                gVar.delta(i14);
                            }
                        }
                        if (gVar.juliet && fVar.lima.size() > 0 && fVar2.lima.size() > 0) {
                            f fVar6 = (f) fVar.lima.get(0);
                            f fVar7 = (f) fVar2.lima.get(0);
                            int i15 = fVar6.golf;
                            int i16 = fVar.foxtrot + i15;
                            int i17 = fVar7.golf;
                            int i18 = fVar2.foxtrot + i17;
                            float f12 = this.bravo.silver;
                            if (fVar6 == fVar7) {
                                f12 = 0.5f;
                            } else {
                                i15 = i16;
                                i17 = i18;
                            }
                            fVar.delta((int) ((((i17 - i15) - gVar.golf) * f12) + i15 + 0.5f));
                            fVar2.delta(fVar.golf + gVar.golf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Z0.d dVar5 = this.bravo;
        lima(dVar5.emerald, dVar5.gold, 1);
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [a1.g, a1.a] */
    @Override // a1.o
    public final void delta() {
        Z0.d dVar;
        Z0.d dVar2;
        Z0.d dVar3;
        Z0.d dVar4;
        Z0.d dVar5 = this.bravo;
        boolean z2 = dVar5.alpha;
        g gVar = this.echo;
        if (z2) {
            gVar.delta(dVar5.kilo());
        }
        boolean z10 = gVar.juliet;
        f fVar = this.india;
        f fVar2 = this.hotel;
        if (!z10) {
            Z0.d dVar6 = this.bravo;
            this.delta = dVar6.f2454h[1];
            if (dVar6.blue) {
                this.lima = new g(this);
            }
            int i4 = this.delta;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.bravo.magenta) != null && dVar4.f2454h[1] == 1) {
                    int kilo = (dVar4.kilo() - this.bravo.emerald.echo()) - this.bravo.gold.echo();
                    o.bravo(fVar2, dVar4.echo.hotel, this.bravo.emerald.echo());
                    o.bravo(fVar, dVar4.echo.india, -this.bravo.gold.echo());
                    gVar.delta(kilo);
                    return;
                }
                if (i4 == 1) {
                    gVar.delta(this.bravo.kilo());
                }
            }
        } else if (this.delta == 4 && (dVar2 = (dVar = this.bravo).magenta) != null && dVar2.f2454h[1] == 1) {
            o.bravo(fVar2, dVar2.echo.hotel, dVar.emerald.echo());
            o.bravo(fVar, dVar2.echo.india, -this.bravo.gold.echo());
            return;
        }
        boolean z11 = gVar.juliet;
        f fVar3 = this.kilo;
        if (z11) {
            Z0.d dVar7 = this.bravo;
            if (dVar7.alpha) {
                Z0.c[] cVarArr = dVar7.jade;
                Z0.c cVar = cVarArr[2];
                Z0.c cVar2 = cVar.foxtrot;
                if (cVar2 != null && cVarArr[3].foxtrot != null) {
                    if (dVar7.yankee()) {
                        fVar2.foxtrot = this.bravo.jade[2].echo();
                        fVar.foxtrot = -this.bravo.jade[3].echo();
                    } else {
                        f hotel = o.hotel(this.bravo.jade[2]);
                        if (hotel != null) {
                            o.bravo(fVar2, hotel, this.bravo.jade[2].echo());
                        }
                        f hotel2 = o.hotel(this.bravo.jade[3]);
                        if (hotel2 != null) {
                            o.bravo(fVar, hotel2, -this.bravo.jade[3].echo());
                        }
                        fVar2.bravo = true;
                        fVar.bravo = true;
                    }
                    Z0.d dVar8 = this.bravo;
                    if (dVar8.blue) {
                        o.bravo(fVar3, fVar2, dVar8.pink);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f hotel3 = o.hotel(cVar);
                    if (hotel3 != null) {
                        o.bravo(fVar2, hotel3, this.bravo.jade[2].echo());
                        o.bravo(fVar, fVar2, gVar.golf);
                        Z0.d dVar9 = this.bravo;
                        if (dVar9.blue) {
                            o.bravo(fVar3, fVar2, dVar9.pink);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Z0.c cVar3 = cVarArr[3];
                if (cVar3.foxtrot != null) {
                    f hotel4 = o.hotel(cVar3);
                    if (hotel4 != null) {
                        o.bravo(fVar, hotel4, -this.bravo.jade[3].echo());
                        o.bravo(fVar2, fVar, -gVar.golf);
                    }
                    Z0.d dVar10 = this.bravo;
                    if (dVar10.blue) {
                        o.bravo(fVar3, fVar2, dVar10.pink);
                        return;
                    }
                    return;
                }
                Z0.c cVar4 = cVarArr[4];
                if (cVar4.foxtrot != null) {
                    f hotel5 = o.hotel(cVar4);
                    if (hotel5 != null) {
                        o.bravo(fVar3, hotel5, 0);
                        o.bravo(fVar2, fVar3, -this.bravo.pink);
                        o.bravo(fVar, fVar2, gVar.golf);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof Z0.i) && dVar7.magenta != null && dVar7.india(7).foxtrot == null) {
                    Z0.d dVar11 = this.bravo;
                    o.bravo(fVar2, dVar11.magenta.echo.hotel, dVar11.sierra());
                    o.bravo(fVar, fVar2, gVar.golf);
                    Z0.d dVar12 = this.bravo;
                    if (dVar12.blue) {
                        o.bravo(fVar3, fVar2, dVar12.pink);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z11 && this.delta == 3) {
            Z0.d dVar13 = this.bravo;
            int i5 = dVar13.sierra;
            if (i5 != 2) {
                if (i5 == 3 && !dVar13.yankee()) {
                    Z0.d dVar14 = this.bravo;
                    if (dVar14.romeo != 3) {
                        g gVar2 = dVar14.delta.echo;
                        gVar.lima.add(gVar2);
                        gVar2.kilo.add(gVar);
                        gVar.bravo = true;
                        gVar.kilo.add(fVar2);
                        gVar.kilo.add(fVar);
                    }
                }
            } else {
                Z0.d dVar15 = dVar13.magenta;
                if (dVar15 != null) {
                    g gVar3 = dVar15.echo.echo;
                    gVar.lima.add(gVar3);
                    gVar3.kilo.add(gVar);
                    gVar.bravo = true;
                    gVar.kilo.add(fVar2);
                    gVar.kilo.add(fVar);
                }
            }
        } else {
            gVar.bravo(this);
        }
        Z0.d dVar16 = this.bravo;
        Z0.c[] cVarArr2 = dVar16.jade;
        Z0.c cVar5 = cVarArr2[2];
        Z0.c cVar6 = cVar5.foxtrot;
        if (cVar6 != null && cVarArr2[3].foxtrot != null) {
            if (dVar16.yankee()) {
                fVar2.foxtrot = this.bravo.jade[2].echo();
                fVar.foxtrot = -this.bravo.jade[3].echo();
            } else {
                f hotel6 = o.hotel(this.bravo.jade[2]);
                f hotel7 = o.hotel(this.bravo.jade[3]);
                if (hotel6 != null) {
                    hotel6.bravo(this);
                }
                if (hotel7 != null) {
                    hotel7.bravo(this);
                }
                this.juliet = 4;
            }
            if (this.bravo.blue) {
                charlie(fVar3, fVar2, 1, this.lima);
            }
        } else if (cVar6 != null) {
            f hotel8 = o.hotel(cVar5);
            if (hotel8 != null) {
                o.bravo(fVar2, hotel8, this.bravo.jade[2].echo());
                charlie(fVar, fVar2, 1, gVar);
                if (this.bravo.blue) {
                    charlie(fVar3, fVar2, 1, this.lima);
                }
                if (this.delta == 3) {
                    Z0.d dVar17 = this.bravo;
                    if (dVar17.ochre > 0.0f) {
                        k kVar = dVar17.delta;
                        if (kVar.delta == 3) {
                            kVar.echo.kilo.add(gVar);
                            gVar.lima.add(this.bravo.delta.echo);
                            gVar.alpha = this;
                        }
                    }
                }
            }
        } else {
            Z0.c cVar7 = cVarArr2[3];
            if (cVar7.foxtrot != null) {
                f hotel9 = o.hotel(cVar7);
                if (hotel9 != null) {
                    o.bravo(fVar, hotel9, -this.bravo.jade[3].echo());
                    charlie(fVar2, fVar, -1, gVar);
                    if (this.bravo.blue) {
                        charlie(fVar3, fVar2, 1, this.lima);
                    }
                }
            } else {
                Z0.c cVar8 = cVarArr2[4];
                if (cVar8.foxtrot != null) {
                    f hotel10 = o.hotel(cVar8);
                    if (hotel10 != null) {
                        o.bravo(fVar3, hotel10, 0);
                        charlie(fVar2, fVar3, -1, this.lima);
                        charlie(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof Z0.i) && (dVar3 = dVar16.magenta) != null) {
                    o.bravo(fVar2, dVar3.echo.hotel, dVar16.sierra());
                    charlie(fVar, fVar2, 1, gVar);
                    if (this.bravo.blue) {
                        charlie(fVar3, fVar2, 1, this.lima);
                    }
                    if (this.delta == 3) {
                        Z0.d dVar18 = this.bravo;
                        if (dVar18.ochre > 0.0f) {
                            k kVar2 = dVar18.delta;
                            if (kVar2.delta == 3) {
                                kVar2.echo.kilo.add(gVar);
                                gVar.lima.add(this.bravo.delta.echo);
                                gVar.alpha = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.lima.size() == 0) {
            gVar.charlie = true;
        }
    }

    @Override // a1.o
    public final void echo() {
        f fVar = this.hotel;
        if (fVar.juliet) {
            this.bravo.peach = fVar.golf;
        }
    }

    @Override // a1.o
    public final void foxtrot() {
        this.charlie = null;
        this.hotel.charlie();
        this.india.charlie();
        this.kilo.charlie();
        this.echo.charlie();
        this.golf = false;
    }

    @Override // a1.o
    public final boolean kilo() {
        if (this.delta == 3 && this.bravo.sierra != 0) {
            return false;
        }
        return true;
    }

    public final void mike() {
        this.golf = false;
        f fVar = this.hotel;
        fVar.charlie();
        fVar.juliet = false;
        f fVar2 = this.india;
        fVar2.charlie();
        fVar2.juliet = false;
        f fVar3 = this.kilo;
        fVar3.charlie();
        fVar3.juliet = false;
        this.echo.juliet = false;
    }

    public final String toString() {
        return "VerticalRun " + this.bravo.yellow;
    }
}
