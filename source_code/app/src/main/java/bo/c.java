package bo;

import B9.ab;
import androidx.lifecycle.B;
import androidx.lifecycle.aa;
import androidx.lifecycle.ak;
import androidx.lifecycle.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c implements ak {
    public final ab alpha;
    public final al purple;

    public c(al alVar, ab abVar) {
        this.purple = alVar;
        this.alpha = abVar;
    }

    @B(aa.ON_DESTROY)
    public void onDestroy(al alVar) {
        ab abVar = this.alpha;
        synchronized (abVar.purple) {
            try {
                c crimson = abVar.crimson(alVar);
                if (crimson == null) {
                    return;
                }
                abVar.magenta(alVar);
                Iterator it = ((Set) ((HashMap) abVar.red).get(crimson)).iterator();
                while (it.hasNext()) {
                    ((HashMap) abVar.white).remove((a) it.next());
                }
                ((HashMap) abVar.red).remove(crimson);
                crimson.purple.getLifecycle().charlie(crimson);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(aa.ON_START)
    public void onStart(al alVar) {
        this.alpha.lime(alVar);
    }

    @B(aa.ON_STOP)
    public void onStop(al alVar) {
        this.alpha.magenta(alVar);
    }
}
