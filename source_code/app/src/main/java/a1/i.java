package a1;

/* loaded from: classes3.dex */
public final class i extends o {
    @Override // a1.d
    public final void alpha(d dVar) {
        f fVar = this.hotel;
        if (!fVar.charlie || fVar.juliet) {
            return;
        }
        fVar.delta((int) ((((f) fVar.lima.get(0)).golf * ((Z0.h) this.bravo).f2506i) + 0.5f));
    }

    @Override // a1.o
    public final void delta() {
        Z0.d dVar = this.bravo;
        Z0.h hVar = (Z0.h) dVar;
        int i4 = hVar.f2507j;
        int i5 = hVar.f2508k;
        int i10 = hVar.f2510m;
        f fVar = this.hotel;
        if (i10 == 1) {
            if (i4 != -1) {
                fVar.lima.add(dVar.magenta.delta.hotel);
                this.bravo.magenta.delta.hotel.kilo.add(fVar);
                fVar.foxtrot = i4;
            } else if (i5 != -1) {
                fVar.lima.add(dVar.magenta.delta.india);
                this.bravo.magenta.delta.india.kilo.add(fVar);
                fVar.foxtrot = -i5;
            } else {
                fVar.bravo = true;
                fVar.lima.add(dVar.magenta.delta.india);
                this.bravo.magenta.delta.india.kilo.add(fVar);
            }
            mike(this.bravo.delta.hotel);
            mike(this.bravo.delta.india);
            return;
        }
        if (i4 != -1) {
            fVar.lima.add(dVar.magenta.echo.hotel);
            this.bravo.magenta.echo.hotel.kilo.add(fVar);
            fVar.foxtrot = i4;
        } else if (i5 != -1) {
            fVar.lima.add(dVar.magenta.echo.india);
            this.bravo.magenta.echo.india.kilo.add(fVar);
            fVar.foxtrot = -i5;
        } else {
            fVar.bravo = true;
            fVar.lima.add(dVar.magenta.echo.india);
            this.bravo.magenta.echo.india.kilo.add(fVar);
        }
        mike(this.bravo.echo.hotel);
        mike(this.bravo.echo.india);
    }

    @Override // a1.o
    public final void echo() {
        Z0.d dVar = this.bravo;
        int i4 = ((Z0.h) dVar).f2510m;
        f fVar = this.hotel;
        if (i4 == 1) {
            dVar.orange = fVar.golf;
        } else {
            dVar.peach = fVar.golf;
        }
    }

    @Override // a1.o
    public final void foxtrot() {
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
