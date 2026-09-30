package R3;

import androidx.lifecycle.B;
import androidx.lifecycle.aa;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ak;
import androidx.lifecycle.al;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h implements g, ak {
    public final HashSet alpha = new HashSet();
    public final ac purple;

    public h(ac acVar) {
        this.purple = acVar;
        acVar.alpha(this);
    }

    @Override // R3.g
    public final void alpha(i iVar) {
        this.alpha.add(iVar);
        ac acVar = this.purple;
        if (acVar.bravo() == ab.alpha) {
            iVar.bravo();
        } else if (acVar.bravo().compareTo(ab.silver) >= 0) {
            iVar.charlie();
        } else {
            iVar.alpha();
        }
    }

    @Override // R3.g
    public final void charlie(i iVar) {
        this.alpha.remove(iVar);
    }

    @B(aa.ON_DESTROY)
    public void onDestroy(al alVar) {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((i) it.next()).bravo();
        }
        alVar.getLifecycle().charlie(this);
    }

    @B(aa.ON_START)
    public void onStart(al alVar) {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((i) it.next()).charlie();
        }
    }

    @B(aa.ON_STOP)
    public void onStop(al alVar) {
        Iterator it = Y3.l.echo(this.alpha).iterator();
        while (it.hasNext()) {
            ((i) it.next()).alpha();
        }
    }
}
