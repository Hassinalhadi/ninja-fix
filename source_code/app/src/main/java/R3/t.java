package R3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class t implements i {
    public final Set alpha = Collections.newSetFromMap(new WeakHashMap());

    @Override // R3.i
    public final void alpha() {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((V3.e) it.next()).alpha();
        }
    }

    @Override // R3.i
    public final void bravo() {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((V3.e) it.next()).bravo();
        }
    }

    @Override // R3.i
    public final void charlie() {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((V3.e) it.next()).charlie();
        }
    }
}
