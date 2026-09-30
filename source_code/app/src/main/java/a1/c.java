package a1;

import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c extends o {
    public final ArrayList kilo;
    public int lima;

    public c(Z0.d dVar, int i4) {
        super(dVar);
        Z0.d dVar2;
        d dVar3;
        int i5;
        d dVar4;
        this.kilo = new ArrayList();
        this.foxtrot = i4;
        Z0.d dVar5 = this.bravo;
        Z0.d mike = dVar5.mike(i4);
        while (true) {
            Z0.d dVar6 = mike;
            dVar2 = dVar5;
            dVar5 = dVar6;
            if (dVar5 == null) {
                break;
            } else {
                mike = dVar5.mike(this.foxtrot);
            }
        }
        this.bravo = dVar2;
        int i10 = this.foxtrot;
        if (i10 == 0) {
            dVar3 = dVar2.delta;
        } else if (i10 == 1) {
            dVar3 = dVar2.echo;
        } else {
            dVar3 = null;
        }
        ArrayList arrayList = this.kilo;
        arrayList.add(dVar3);
        Z0.d lima = dVar2.lima(this.foxtrot);
        while (lima != null) {
            int i11 = this.foxtrot;
            if (i11 == 0) {
                dVar4 = lima.delta;
            } else if (i11 == 1) {
                dVar4 = lima.echo;
            } else {
                dVar4 = null;
            }
            arrayList.add(dVar4);
            lima = lima.lima(this.foxtrot);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            int i12 = this.foxtrot;
            if (i12 == 0) {
                oVar.bravo.bravo = this;
            } else if (i12 == 1) {
                oVar.bravo.charlie = this;
            }
        }
        if (this.foxtrot == 0 && ((Z0.e) this.bravo.magenta).f2461n && arrayList.size() > 1) {
            this.bravo = ((o) P0.amber(1, arrayList)).bravo;
        }
        if (this.foxtrot == 0) {
            i5 = this.bravo.f2448a;
        } else {
            i5 = this.bravo.f2449b;
        }
        this.lima = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // a1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(d dVar) {
        boolean z2;
        int i4;
        int i5;
        boolean z10;
        float f5;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z11;
        boolean z12;
        int i29;
        f fVar = this.hotel;
        if (fVar.juliet) {
            f fVar2 = this.india;
            if (fVar2.juliet) {
                Z0.d dVar2 = this.bravo.magenta;
                if (dVar2 instanceof Z0.e) {
                    z2 = ((Z0.e) dVar2).f2461n;
                } else {
                    z2 = false;
                }
                int i30 = fVar2.golf - fVar.golf;
                ArrayList arrayList = this.kilo;
                int size = arrayList.size();
                int i31 = 0;
                while (true) {
                    i4 = -1;
                    i5 = 8;
                    if (i31 < size) {
                        if (((o) arrayList.get(i31)).bravo.white != 8) {
                            break;
                        } else {
                            i31++;
                        }
                    } else {
                        i31 = -1;
                        break;
                    }
                }
                int i32 = size - 1;
                int i33 = i32;
                while (true) {
                    if (i33 < 0) {
                        break;
                    }
                    if (((o) arrayList.get(i33)).bravo.white != 8) {
                        i4 = i33;
                        break;
                    }
                    i33--;
                }
                int i34 = 0;
                while (i34 < 2) {
                    f5 = 0.0f;
                    int i35 = 0;
                    i12 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    while (i35 < size) {
                        o oVar = (o) arrayList.get(i35);
                        Z0.d dVar3 = oVar.bravo;
                        boolean z13 = z2;
                        if (dVar3.white == i5) {
                            i28 = i34;
                        } else {
                            i37++;
                            if (i35 > 0 && i35 >= i31) {
                                i12 += oVar.hotel.foxtrot;
                            }
                            g gVar = oVar.echo;
                            int i38 = gVar.golf;
                            i28 = i34;
                            if (oVar.delta != 3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                int i39 = this.foxtrot;
                                if (i39 != 0 || dVar3.delta.echo.juliet) {
                                    if (i39 != 1 || dVar3.echo.echo.juliet) {
                                        z12 = z11;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                z12 = z11;
                                if (oVar.alpha == 1 && i28 == 0) {
                                    i29 = gVar.mike;
                                    i36++;
                                } else if (gVar.juliet) {
                                    i29 = i38;
                                }
                                z12 = true;
                                if (z12) {
                                    i36++;
                                    float f12 = dVar3.f2450c[this.foxtrot];
                                    if (f12 >= 0.0f) {
                                        f5 += f12;
                                    }
                                } else {
                                    i12 += i29;
                                }
                                if (i35 < i32 && i35 < i4) {
                                    i12 += -oVar.india.foxtrot;
                                }
                            }
                            i29 = i38;
                            if (z12) {
                            }
                            if (i35 < i32) {
                                i12 += -oVar.india.foxtrot;
                            }
                        }
                        i35++;
                        z2 = z13;
                        i34 = i28;
                        i5 = 8;
                    }
                    z10 = z2;
                    int i40 = i34;
                    if (i12 >= i30 && i36 != 0) {
                        i34 = i40 + 1;
                        z2 = z10;
                        i5 = 8;
                    } else {
                        i10 = i36;
                        i11 = i37;
                        break;
                    }
                }
                z10 = z2;
                f5 = 0.0f;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                int i41 = fVar.golf;
                if (z10) {
                    i41 = fVar2.golf;
                }
                float f13 = 0.5f;
                if (i12 > i30) {
                    if (z10) {
                        i41 += (int) (((i12 - i30) / 2.0f) + 0.5f);
                    } else {
                        i41 -= (int) (((i12 - i30) / 2.0f) + 0.5f);
                    }
                }
                if (i10 > 0) {
                    float f14 = i30 - i12;
                    int i42 = (int) ((f14 / i10) + 0.5f);
                    int i43 = 0;
                    int i44 = 0;
                    while (i43 < size) {
                        float f15 = f13;
                        o oVar2 = (o) arrayList.get(i43);
                        int i45 = i41;
                        Z0.d dVar4 = oVar2.bravo;
                        int i46 = i10;
                        float f16 = f14;
                        if (dVar4.white != 8 && oVar2.delta == 3) {
                            g gVar2 = oVar2.echo;
                            if (!gVar2.juliet) {
                                if (f5 > 0.0f) {
                                    i22 = (int) (((dVar4.f2450c[this.foxtrot] * f16) / f5) + f15);
                                    i23 = i42;
                                } else {
                                    i22 = i42;
                                    i23 = i22;
                                }
                                if (this.foxtrot == 0) {
                                    i24 = dVar4.victor;
                                    i25 = dVar4.uniform;
                                } else {
                                    i24 = dVar4.yankee;
                                    i25 = dVar4.xray;
                                }
                                i26 = i43;
                                if (oVar2.alpha == 1) {
                                    i27 = Math.min(i22, gVar2.mike);
                                } else {
                                    i27 = i22;
                                }
                                int max = Math.max(i25, i27);
                                if (i24 > 0) {
                                    max = Math.min(i24, max);
                                }
                                if (max != i22) {
                                    i44++;
                                    i22 = max;
                                }
                                gVar2.delta(i22);
                                i43 = i26 + 1;
                                i41 = i45;
                                f13 = f15;
                                i10 = i46;
                                f14 = f16;
                                i42 = i23;
                            }
                        }
                        i23 = i42;
                        i26 = i43;
                        i43 = i26 + 1;
                        i41 = i45;
                        f13 = f15;
                        i10 = i46;
                        f14 = f16;
                        i42 = i23;
                    }
                    i13 = i41;
                    f10 = f13;
                    int i47 = i10;
                    if (i44 > 0) {
                        i10 = i47 - i44;
                        i12 = 0;
                        for (int i48 = 0; i48 < size; i48++) {
                            o oVar3 = (o) arrayList.get(i48);
                            if (oVar3.bravo.white != 8) {
                                if (i48 > 0 && i48 >= i31) {
                                    i12 += oVar3.hotel.foxtrot;
                                }
                                i12 += oVar3.echo.golf;
                                if (i48 < i32 && i48 < i4) {
                                    i12 += -oVar3.india.foxtrot;
                                }
                            }
                        }
                    } else {
                        i10 = i47;
                    }
                    i15 = 2;
                    if (this.lima == 2 && i44 == 0) {
                        i14 = 0;
                        this.lima = 0;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i13 = i41;
                    f10 = 0.5f;
                    i14 = 0;
                    i15 = 2;
                }
                if (i12 > i30) {
                    this.lima = i15;
                }
                if (i11 > 0 && i10 == 0 && i31 == i4) {
                    this.lima = i15;
                }
                int i49 = this.lima;
                if (i49 == 1) {
                    if (i11 > 1) {
                        i20 = (i30 - i12) / (i11 - 1);
                    } else if (i11 == 1) {
                        i20 = (i30 - i12) / 2;
                    } else {
                        i20 = i14;
                    }
                    if (i10 > 0) {
                        i20 = i14;
                    }
                    int i50 = i13;
                    for (int i51 = i14; i51 < size; i51++) {
                        if (z10) {
                            i21 = size - (i51 + 1);
                        } else {
                            i21 = i51;
                        }
                        o oVar4 = (o) arrayList.get(i21);
                        int i52 = oVar4.bravo.white;
                        f fVar3 = oVar4.india;
                        f fVar4 = oVar4.hotel;
                        if (i52 == 8) {
                            fVar4.delta(i50);
                            fVar3.delta(i50);
                        } else {
                            if (i51 > 0) {
                                if (z10) {
                                    i50 -= i20;
                                } else {
                                    i50 += i20;
                                }
                            }
                            if (i51 > 0 && i51 >= i31) {
                                if (z10) {
                                    i50 -= fVar4.foxtrot;
                                } else {
                                    i50 += fVar4.foxtrot;
                                }
                            }
                            if (z10) {
                                fVar3.delta(i50);
                            } else {
                                fVar4.delta(i50);
                            }
                            g gVar3 = oVar4.echo;
                            int i53 = gVar3.golf;
                            if (oVar4.delta == 3 && oVar4.alpha == 1) {
                                i53 = gVar3.mike;
                            }
                            if (z10) {
                                i50 -= i53;
                            } else {
                                i50 += i53;
                            }
                            if (z10) {
                                fVar4.delta(i50);
                            } else {
                                fVar3.delta(i50);
                            }
                            oVar4.golf = true;
                            if (i51 < i32 && i51 < i4) {
                                if (z10) {
                                    i50 -= -fVar3.foxtrot;
                                } else {
                                    i50 += -fVar3.foxtrot;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i49 == 0) {
                    int i54 = (i30 - i12) / (i11 + 1);
                    if (i10 > 0) {
                        i54 = i14;
                    }
                    int i55 = i13;
                    for (int i56 = i14; i56 < size; i56++) {
                        if (z10) {
                            i18 = size - (i56 + 1);
                        } else {
                            i18 = i56;
                        }
                        o oVar5 = (o) arrayList.get(i18);
                        int i57 = oVar5.bravo.white;
                        f fVar5 = oVar5.india;
                        f fVar6 = oVar5.hotel;
                        if (i57 == 8) {
                            fVar6.delta(i55);
                            fVar5.delta(i55);
                        } else {
                            if (z10) {
                                i19 = i55 - i54;
                            } else {
                                i19 = i55 + i54;
                            }
                            if (i56 > 0 && i56 >= i31) {
                                if (z10) {
                                    i19 -= fVar6.foxtrot;
                                } else {
                                    i19 += fVar6.foxtrot;
                                }
                            }
                            if (z10) {
                                fVar5.delta(i19);
                            } else {
                                fVar6.delta(i19);
                            }
                            g gVar4 = oVar5.echo;
                            int i58 = gVar4.golf;
                            if (oVar5.delta == 3 && oVar5.alpha == 1) {
                                i58 = Math.min(i58, gVar4.mike);
                            }
                            if (z10) {
                                i55 = i19 - i58;
                            } else {
                                i55 = i19 + i58;
                            }
                            if (z10) {
                                fVar6.delta(i55);
                            } else {
                                fVar5.delta(i55);
                            }
                            if (i56 < i32 && i56 < i4) {
                                if (z10) {
                                    i55 -= -fVar5.foxtrot;
                                } else {
                                    i55 += -fVar5.foxtrot;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i49 == 2) {
                    if (this.foxtrot == 0) {
                        f11 = this.bravo.red;
                    } else {
                        f11 = this.bravo.silver;
                    }
                    if (z10) {
                        f11 = 1.0f - f11;
                    }
                    int i59 = (int) (((i30 - i12) * f11) + f10);
                    if (i59 < 0 || i10 > 0) {
                        i59 = i14;
                    }
                    if (z10) {
                        i16 = i13 - i59;
                    } else {
                        i16 = i13 + i59;
                    }
                    for (int i60 = i14; i60 < size; i60++) {
                        if (z10) {
                            i17 = size - (i60 + 1);
                        } else {
                            i17 = i60;
                        }
                        o oVar6 = (o) arrayList.get(i17);
                        int i61 = oVar6.bravo.white;
                        f fVar7 = oVar6.india;
                        f fVar8 = oVar6.hotel;
                        if (i61 == 8) {
                            fVar8.delta(i16);
                            fVar7.delta(i16);
                        } else {
                            if (i60 > 0 && i60 >= i31) {
                                if (z10) {
                                    i16 -= fVar8.foxtrot;
                                } else {
                                    i16 += fVar8.foxtrot;
                                }
                            }
                            if (z10) {
                                fVar7.delta(i16);
                            } else {
                                fVar8.delta(i16);
                            }
                            g gVar5 = oVar6.echo;
                            int i62 = gVar5.golf;
                            if (oVar6.delta == 3 && oVar6.alpha == 1) {
                                i62 = gVar5.mike;
                            }
                            i16 += i62;
                            if (z10) {
                                fVar8.delta(i16);
                            } else {
                                fVar7.delta(i16);
                            }
                            if (i60 < i32 && i60 < i4) {
                                if (z10) {
                                    i16 -= -fVar7.foxtrot;
                                } else {
                                    i16 += -fVar7.foxtrot;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // a1.o
    public final void delta() {
        ArrayList arrayList = this.kilo;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).delta();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        Z0.d dVar = ((o) arrayList.get(0)).bravo;
        Z0.d dVar2 = ((o) arrayList.get(size - 1)).bravo;
        int i4 = this.foxtrot;
        f fVar = this.india;
        f fVar2 = this.hotel;
        if (i4 == 0) {
            Z0.c cVar = dVar.cyan;
            Z0.c cVar2 = dVar2.fuchsia;
            f india = o.india(cVar, 0);
            int echo = cVar.echo();
            Z0.d mike = mike();
            if (mike != null) {
                echo = mike.cyan.echo();
            }
            if (india != null) {
                o.bravo(fVar2, india, echo);
            }
            f india2 = o.india(cVar2, 0);
            int echo2 = cVar2.echo();
            Z0.d november = november();
            if (november != null) {
                echo2 = november.fuchsia.echo();
            }
            if (india2 != null) {
                o.bravo(fVar, india2, -echo2);
            }
        } else {
            Z0.c cVar3 = dVar.emerald;
            Z0.c cVar4 = dVar2.gold;
            f india3 = o.india(cVar3, 1);
            int echo3 = cVar3.echo();
            Z0.d mike2 = mike();
            if (mike2 != null) {
                echo3 = mike2.emerald.echo();
            }
            if (india3 != null) {
                o.bravo(fVar2, india3, echo3);
            }
            f india4 = o.india(cVar4, 1);
            int echo4 = cVar4.echo();
            Z0.d november2 = november();
            if (november2 != null) {
                echo4 = november2.gold.echo();
            }
            if (india4 != null) {
                o.bravo(fVar, india4, -echo4);
            }
        }
        fVar2.alpha = this;
        fVar.alpha = this;
    }

    @Override // a1.o
    public final void echo() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.kilo;
            if (i4 < arrayList.size()) {
                ((o) arrayList.get(i4)).echo();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // a1.o
    public final void foxtrot() {
        this.charlie = null;
        Iterator it = this.kilo.iterator();
        while (it.hasNext()) {
            ((o) it.next()).foxtrot();
        }
    }

    @Override // a1.o
    public final long juliet() {
        ArrayList arrayList = this.kilo;
        int size = arrayList.size();
        long j5 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j5 = r5.india.foxtrot + ((o) arrayList.get(i4)).juliet() + j5 + r5.hotel.foxtrot;
        }
        return j5;
    }

    @Override // a1.o
    public final boolean kilo() {
        ArrayList arrayList = this.kilo;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((o) arrayList.get(i4)).kilo()) {
                return false;
            }
        }
        return true;
    }

    public final Z0.d mike() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.kilo;
            if (i4 < arrayList.size()) {
                Z0.d dVar = ((o) arrayList.get(i4)).bravo;
                if (dVar.white != 8) {
                    return dVar;
                }
                i4++;
            } else {
                return null;
            }
        }
    }

    public final Z0.d november() {
        ArrayList arrayList = this.kilo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Z0.d dVar = ((o) arrayList.get(size)).bravo;
            if (dVar.white != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.foxtrot == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator it = this.kilo.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb2.append("<");
            sb2.append(oVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
