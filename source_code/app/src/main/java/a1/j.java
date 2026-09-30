package a1;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j extends o {
    @Override // a1.d
    public final void alpha(d dVar) {
        Z0.a aVar = (Z0.a) this.bravo;
        int i4 = aVar.f2444k;
        f fVar = this.hotel;
        Iterator it = fVar.lima.iterator();
        int i5 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((f) it.next()).golf;
            if (i10 == -1 || i11 < i10) {
                i10 = i11;
            }
            if (i5 < i11) {
                i5 = i11;
            }
        }
        if (i4 != 0 && i4 != 2) {
            fVar.delta(i5 + aVar.f2446m);
        } else {
            fVar.delta(i10 + aVar.f2446m);
        }
    }

    @Override // a1.o
    public final void delta() {
        Z0.d dVar = this.bravo;
        if (dVar instanceof Z0.a) {
            f fVar = this.hotel;
            fVar.bravo = true;
            Z0.a aVar = (Z0.a) dVar;
            int i4 = aVar.f2444k;
            boolean z2 = aVar.f2445l;
            int i5 = 0;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            fVar.echo = 7;
                            while (i5 < aVar.f2513j) {
                                Z0.d dVar2 = aVar.f2512i[i5];
                                if (z2 || dVar2.white != 8) {
                                    f fVar2 = dVar2.echo.india;
                                    fVar2.kilo.add(fVar);
                                    fVar.lima.add(fVar2);
                                }
                                i5++;
                            }
                            mike(this.bravo.echo.hotel);
                            mike(this.bravo.echo.india);
                            return;
                        }
                        return;
                    }
                    fVar.echo = 6;
                    while (i5 < aVar.f2513j) {
                        Z0.d dVar3 = aVar.f2512i[i5];
                        if (z2 || dVar3.white != 8) {
                            f fVar3 = dVar3.echo.hotel;
                            fVar3.kilo.add(fVar);
                            fVar.lima.add(fVar3);
                        }
                        i5++;
                    }
                    mike(this.bravo.echo.hotel);
                    mike(this.bravo.echo.india);
                    return;
                }
                fVar.echo = 5;
                while (i5 < aVar.f2513j) {
                    Z0.d dVar4 = aVar.f2512i[i5];
                    if (z2 || dVar4.white != 8) {
                        f fVar4 = dVar4.delta.india;
                        fVar4.kilo.add(fVar);
                        fVar.lima.add(fVar4);
                    }
                    i5++;
                }
                mike(this.bravo.delta.hotel);
                mike(this.bravo.delta.india);
                return;
            }
            fVar.echo = 4;
            while (i5 < aVar.f2513j) {
                Z0.d dVar5 = aVar.f2512i[i5];
                if (z2 || dVar5.white != 8) {
                    f fVar5 = dVar5.delta.hotel;
                    fVar5.kilo.add(fVar);
                    fVar.lima.add(fVar5);
                }
                i5++;
            }
            mike(this.bravo.delta.hotel);
            mike(this.bravo.delta.india);
        }
    }

    @Override // a1.o
    public final void echo() {
        Z0.d dVar = this.bravo;
        if (dVar instanceof Z0.a) {
            int i4 = ((Z0.a) dVar).f2444k;
            f fVar = this.hotel;
            if (i4 != 0 && i4 != 1) {
                dVar.peach = fVar.golf;
            } else {
                dVar.orange = fVar.golf;
            }
        }
    }

    @Override // a1.o
    public final void foxtrot() {
        this.charlie = null;
        this.hotel.charlie();
    }

    @Override // a1.o
    public final boolean kilo() {
        return false;
    }

    public final void mike(f fVar) {
        f fVar2 = this.hotel;
        fVar2.kilo.add(fVar);
        fVar.lima.add(fVar2);
    }
}
