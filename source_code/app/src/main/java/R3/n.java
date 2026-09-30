package R3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n implements a {
    public final /* synthetic */ s alpha;

    public n(s sVar) {
        this.alpha = sVar;
    }

    @Override // R3.a
    public final void alpha(boolean z2) {
        ArrayList arrayList;
        Y3.l.alpha();
        synchronized (this.alpha) {
            arrayList = new ArrayList((HashSet) this.alpha.silver);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).alpha(z2);
        }
    }
}
