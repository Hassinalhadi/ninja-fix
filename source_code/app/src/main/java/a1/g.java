package a1;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class g extends f {
    public int mike;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.echo = 2;
        } else {
            this.echo = 3;
        }
    }

    @Override // a1.f
    public final void delta(int i4) {
        if (!this.juliet) {
            this.juliet = true;
            this.golf = i4;
            Iterator it = this.kilo.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.alpha(dVar);
            }
        }
    }
}
