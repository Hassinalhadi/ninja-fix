package T5;

import bv.aw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ag {
    public int delta;
    public final bv.e bravo = new aw(0);
    public final G6.h charlie = new G6.h();
    public boolean echo = false;
    public final bv.e alpha = new aw(0);

    /* JADX WARN: Type inference failed for: r0v0, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bv.e, bv.aw] */
    public ag(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.alpha.put(((com.google.android.gms.common.api.k) it.next()).getApiKey(), null);
        }
        this.delta = ((bv.b) this.alpha.keySet()).alpha.red;
    }

    public final void alpha(b bVar, ConnectionResult connectionResult, String str) {
        bv.e eVar = this.alpha;
        eVar.put(bVar, connectionResult);
        bv.e eVar2 = this.bravo;
        eVar2.put(bVar, str);
        this.delta--;
        if (!connectionResult.o()) {
            this.echo = true;
        }
        if (this.delta == 0) {
            boolean z2 = this.echo;
            G6.h hVar = this.charlie;
            if (z2) {
                hVar.alpha(new AvailabilityException(eVar));
            } else {
                hVar.bravo(eVar2);
            }
        }
    }
}
