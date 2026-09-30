package W0;

import androidx.appcompat.widget.P0;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import id.C1915c;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {
    public final a delta;
    public f alpha = null;
    public float bravo = 0.0f;
    public final ArrayList charlie = new ArrayList();
    public boolean echo = false;

    public b(C1915c c1915c) {
        this.delta = new a(this, c1915c);
    }

    public final void alpha(c cVar, int i4) {
        this.delta.golf(cVar.juliet(i4), 1.0f);
        this.delta.golf(cVar.juliet(i4), -1.0f);
    }

    public final void bravo(f fVar, f fVar2, f fVar3, int i4) {
        boolean z2 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z2 = true;
            }
            this.bravo = i4;
        }
        if (!z2) {
            this.delta.golf(fVar, -1.0f);
            this.delta.golf(fVar2, 1.0f);
            this.delta.golf(fVar3, 1.0f);
        } else {
            this.delta.golf(fVar, 1.0f);
            this.delta.golf(fVar2, -1.0f);
            this.delta.golf(fVar3, -1.0f);
        }
    }

    public final void charlie(f fVar, f fVar2, f fVar3, int i4) {
        boolean z2 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z2 = true;
            }
            this.bravo = i4;
        }
        if (!z2) {
            this.delta.golf(fVar, -1.0f);
            this.delta.golf(fVar2, 1.0f);
            this.delta.golf(fVar3, -1.0f);
        } else {
            this.delta.golf(fVar, 1.0f);
            this.delta.golf(fVar2, -1.0f);
            this.delta.golf(fVar3, 1.0f);
        }
    }

    public f delta(boolean[] zArr) {
        return foxtrot(zArr, null);
    }

    public boolean echo() {
        if (this.alpha == null && this.bravo == 0.0f && this.delta.delta() == 0) {
            return true;
        }
        return false;
    }

    public final f foxtrot(boolean[] zArr, f fVar) {
        int i4;
        int delta = this.delta.delta();
        f fVar2 = null;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < delta; i5++) {
            float foxtrot = this.delta.foxtrot(i5);
            if (foxtrot < 0.0f) {
                f echo = this.delta.echo(i5);
                if ((zArr == null || !zArr[echo.purple]) && echo != fVar && (((i4 = echo.e) == 3 || i4 == 4) && foxtrot < f5)) {
                    f5 = foxtrot;
                    fVar2 = echo;
                }
            }
        }
        return fVar2;
    }

    public final void golf(f fVar) {
        f fVar2 = this.alpha;
        if (fVar2 != null) {
            this.delta.golf(fVar2, -1.0f);
            this.alpha.red = -1;
            this.alpha = null;
        }
        float hotel = this.delta.hotel(fVar, true) * (-1.0f);
        this.alpha = fVar;
        if (hotel == 1.0f) {
            return;
        }
        this.bravo /= hotel;
        a aVar = this.delta;
        int i4 = aVar.hotel;
        for (int i5 = 0; i4 != -1 && i5 < aVar.alpha; i5++) {
            float[] fArr = aVar.golf;
            fArr[i4] = fArr[i4] / hotel;
            i4 = aVar.foxtrot[i4];
        }
    }

    public final void hotel(c cVar, f fVar, boolean z2) {
        if (fVar != null && fVar.white) {
            float charlie = this.delta.charlie(fVar);
            this.bravo = (fVar.teal * charlie) + this.bravo;
            this.delta.hotel(fVar, z2);
            if (z2) {
                fVar.bravo(this);
            }
            if (this.delta.delta() == 0) {
                this.echo = true;
                cVar.bravo = true;
            }
        }
    }

    public void india(c cVar, b bVar, boolean z2) {
        a aVar = this.delta;
        aVar.getClass();
        float charlie = aVar.charlie(bVar.alpha);
        aVar.hotel(bVar.alpha, z2);
        a aVar2 = bVar.delta;
        int delta = aVar2.delta();
        for (int i4 = 0; i4 < delta; i4++) {
            f echo = aVar2.echo(i4);
            aVar.alpha(echo, aVar2.charlie(echo) * charlie, z2);
        }
        this.bravo = (bVar.bravo * charlie) + this.bravo;
        if (z2) {
            bVar.alpha.bravo(this);
        }
        if (this.alpha != null && this.delta.delta() == 0) {
            this.echo = true;
            cVar.bravo = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z2;
        if (this.alpha == null) {
            str = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        } else {
            str = "" + this.alpha;
        }
        String crimson = P0.crimson(str, " = ");
        if (this.bravo != 0.0f) {
            StringBuilder tango = Q0.c.tango(crimson);
            tango.append(this.bravo);
            crimson = tango.toString();
            z2 = true;
        } else {
            z2 = false;
        }
        int delta = this.delta.delta();
        for (int i4 = 0; i4 < delta; i4++) {
            f echo = this.delta.echo(i4);
            if (echo != null) {
                float foxtrot = this.delta.foxtrot(i4);
                if (foxtrot != 0.0f) {
                    String fVar = echo.toString();
                    if (!z2) {
                        if (foxtrot < 0.0f) {
                            crimson = P0.crimson(crimson, "- ");
                            foxtrot *= -1.0f;
                        }
                        if (foxtrot == 1.0f) {
                            crimson = P0.crimson(crimson, fVar);
                        } else {
                            crimson = crimson + foxtrot + " " + fVar;
                        }
                        z2 = true;
                    } else if (foxtrot > 0.0f) {
                        crimson = P0.crimson(crimson, " + ");
                        if (foxtrot == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        crimson = P0.crimson(crimson, " - ");
                        foxtrot *= -1.0f;
                        if (foxtrot == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        if (!z2) {
            return P0.crimson(crimson, "0.0");
        }
        return crimson;
    }
}
