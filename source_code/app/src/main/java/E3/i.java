package E3;

import bv.aw;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class i implements f {
    public final Y3.c bravo = new aw(0);

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        int i4 = 0;
        while (true) {
            Y3.c cVar = this.bravo;
            if (i4 < cVar.red) {
                h hVar = (h) cVar.foxtrot(i4);
                Object juliet = this.bravo.juliet(i4);
                g gVar = hVar.bravo;
                if (hVar.delta == null) {
                    hVar.delta = hVar.charlie.getBytes(f.alpha);
                }
                gVar.echo(hVar.delta, juliet, messageDigest);
                i4++;
            } else {
                return;
            }
        }
    }

    public final Object charlie(h hVar) {
        Y3.c cVar = this.bravo;
        if (cVar.containsKey(hVar)) {
            return cVar.get(hVar);
        }
        return hVar.alpha;
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.bravo.equals(((i) obj).bravo);
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.bravo + '}';
    }
}
