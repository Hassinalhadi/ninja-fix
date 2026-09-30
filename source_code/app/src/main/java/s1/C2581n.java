package s1;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: s1.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2581n {
    public final Runnable alpha;
    public final CopyOnWriteArrayList bravo = new CopyOnWriteArrayList();
    public final HashMap charlie = new HashMap();

    public C2581n(Runnable runnable) {
        this.alpha = runnable;
    }

    public final boolean alpha(MenuItem menuItem) {
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.az) ((InterfaceC2582o) it.next())).alpha.papa(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void bravo(InterfaceC2582o interfaceC2582o) {
        this.bravo.remove(interfaceC2582o);
        C2580m c2580m = (C2580m) this.charlie.remove(interfaceC2582o);
        if (c2580m != null) {
            c2580m.alpha.charlie(c2580m.bravo);
            c2580m.bravo = null;
        }
        this.alpha.run();
    }
}
