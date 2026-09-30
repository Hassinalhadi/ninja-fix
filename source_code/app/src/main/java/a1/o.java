package a1;

import av.q;

/* loaded from: classes3.dex */
public abstract class o implements d {
    public int alpha;
    public Z0.d bravo;
    public l charlie;
    public int delta;
    public final g echo = new g(this);
    public int foxtrot = 0;
    public boolean golf = false;
    public final f hotel = new f(this);
    public final f india = new f(this);
    public int juliet = 1;

    public o(Z0.d dVar) {
        this.bravo = dVar;
    }

    public static void bravo(f fVar, f fVar2, int i4) {
        fVar.lima.add(fVar2);
        fVar.foxtrot = i4;
        fVar2.kilo.add(fVar);
    }

    public static f hotel(Z0.c cVar) {
        Z0.c cVar2 = cVar.foxtrot;
        if (cVar2 != null) {
            int mike = q.mike(cVar2.echo);
            Z0.d dVar = cVar2.delta;
            if (mike != 1) {
                if (mike != 2) {
                    if (mike != 3) {
                        if (mike != 4) {
                            if (mike != 5) {
                                return null;
                            }
                            return dVar.echo.kilo;
                        }
                        return dVar.echo.india;
                    }
                    return dVar.delta.india;
                }
                return dVar.echo.hotel;
            }
            return dVar.delta.hotel;
        }
        return null;
    }

    public static f india(Z0.c cVar, int i4) {
        o oVar;
        Z0.c cVar2 = cVar.foxtrot;
        if (cVar2 != null) {
            Z0.d dVar = cVar2.delta;
            if (i4 == 0) {
                oVar = dVar.delta;
            } else {
                oVar = dVar.echo;
            }
            int mike = q.mike(cVar2.echo);
            if (mike != 1 && mike != 2) {
                if (mike != 3 && mike != 4) {
                    return null;
                }
                return oVar.india;
            }
            return oVar.hotel;
        }
        return null;
    }

    public final void charlie(f fVar, f fVar2, int i4, g gVar) {
        fVar.lima.add(fVar2);
        fVar.lima.add(this.echo);
        fVar.hotel = i4;
        fVar.india = gVar;
        fVar2.kilo.add(fVar);
        gVar.kilo.add(fVar);
    }

    public abstract void delta();

    public abstract void echo();

    public abstract void foxtrot();

    public final int golf(int i4, int i5) {
        if (i5 == 0) {
            Z0.d dVar = this.bravo;
            int i10 = dVar.victor;
            int max = Math.max(dVar.uniform, i4);
            if (i10 > 0) {
                max = Math.min(i10, i4);
            }
            if (max != i4) {
                return max;
            }
        } else {
            Z0.d dVar2 = this.bravo;
            int i11 = dVar2.yankee;
            int max2 = Math.max(dVar2.xray, i4);
            if (i11 > 0) {
                max2 = Math.min(i11, i4);
            }
            if (max2 != i4) {
                return max2;
            }
        }
        return i4;
    }

    public long juliet() {
        if (this.echo.juliet) {
            return r0.golf;
        }
        return 0L;
    }

    public abstract boolean kilo();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.alpha == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lima(Z0.c cVar, Z0.c cVar2, int i4) {
        float f5;
        o oVar;
        float f10;
        int i5;
        f hotel = hotel(cVar);
        f hotel2 = hotel(cVar2);
        if (hotel.juliet && hotel2.juliet) {
            int echo = cVar.echo() + hotel.golf;
            int echo2 = hotel2.golf - cVar2.echo();
            int i10 = echo2 - echo;
            g gVar = this.echo;
            if (!gVar.juliet && this.delta == 3) {
                int i11 = this.alpha;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                Z0.d dVar = this.bravo;
                                o oVar2 = dVar.delta;
                                if (oVar2.delta == 3 && oVar2.alpha == 3) {
                                    m mVar = dVar.echo;
                                    if (mVar.delta == 3) {
                                    }
                                }
                                if (i4 == 0) {
                                    oVar2 = dVar.echo;
                                }
                                if (oVar2.echo.juliet) {
                                    float f11 = dVar.ochre;
                                    if (i4 == 1) {
                                        i5 = (int) ((r6.golf / f11) + 0.5f);
                                    } else {
                                        i5 = (int) ((f11 * r6.golf) + 0.5f);
                                    }
                                    gVar.delta(i5);
                                }
                            }
                        } else {
                            Z0.d dVar2 = this.bravo;
                            Z0.d dVar3 = dVar2.magenta;
                            if (dVar3 != null) {
                                if (i4 == 0) {
                                    oVar = dVar3.delta;
                                } else {
                                    oVar = dVar3.echo;
                                }
                                if (oVar.echo.juliet) {
                                    if (i4 == 0) {
                                        f10 = dVar2.whiskey;
                                    } else {
                                        f10 = dVar2.zulu;
                                    }
                                    gVar.delta(golf((int) ((r6.golf * f10) + 0.5f), i4));
                                }
                            }
                        }
                    } else {
                        gVar.delta(Math.min(golf(gVar.mike, i4), i10));
                    }
                } else {
                    gVar.delta(golf(i10, i4));
                }
            }
            if (gVar.juliet) {
                int i12 = gVar.golf;
                f fVar = this.india;
                f fVar2 = this.hotel;
                if (i12 == i10) {
                    fVar2.delta(echo);
                    fVar.delta(echo2);
                    return;
                }
                if (i4 == 0) {
                    f5 = this.bravo.red;
                } else {
                    f5 = this.bravo.silver;
                }
                if (hotel == hotel2) {
                    echo = hotel.golf;
                    echo2 = hotel2.golf;
                    f5 = 0.5f;
                }
                fVar2.delta((int) ((((echo2 - echo) - i12) * f5) + echo + 0.5f));
                fVar.delta(fVar2.golf + gVar.golf);
            }
        }
    }
}
