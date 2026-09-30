package X2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3220y;
import vf.ao;
import wf.C3268e;

/* loaded from: classes3.dex */
public final class b {
    public final AbstractC3220y alpha;
    public final AbstractC3220y bravo;
    public final AbstractC3220y charlie;
    public final AbstractC3220y delta;
    public final Z2.c echo;
    public final Y2.d foxtrot;
    public final Bitmap.Config golf;
    public final boolean hotel;
    public final a india;
    public final a juliet;
    public final a kilo;

    public b() {
        Cf.e eVar = ao.alpha;
        C3268e c3268e = Af.n.alpha.teal;
        Cf.d dVar = Cf.d.purple;
        Z2.c cVar = Z2.e.alpha;
        Y2.d dVar2 = Y2.d.red;
        Bitmap.Config config = a3.h.bravo;
        a aVar = a.red;
        this.alpha = c3268e;
        this.bravo = dVar;
        this.charlie = dVar;
        this.delta = dVar;
        this.echo = cVar;
        this.foxtrot = dVar2;
        this.golf = config;
        this.hotel = true;
        this.india = aVar;
        this.juliet = aVar;
        this.kilo = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Intrinsics.areEqual(this.alpha, bVar.alpha) && Intrinsics.areEqual(this.bravo, bVar.bravo) && Intrinsics.areEqual(this.charlie, bVar.charlie) && Intrinsics.areEqual(this.delta, bVar.delta) && Intrinsics.areEqual(this.echo, bVar.echo) && this.foxtrot == bVar.foxtrot && this.golf == bVar.golf && this.hotel == bVar.hotel && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && this.india == bVar.india && this.juliet == bVar.juliet && this.kilo == bVar.kilo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31)) * 31;
        this.echo.getClass();
        int hashCode2 = (this.golf.hashCode() + ((this.foxtrot.hashCode() + ((Z2.c.class.hashCode() + hashCode) * 31)) * 31)) * 31;
        if (this.hotel) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.kilo.hashCode() + ((this.juliet.hashCode() + ((this.india.hashCode() + ((((hashCode2 + i4) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
