package B7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements T5.c {
    public static final AtomicReference alpha = new AtomicReference();

    @Override // T5.c
    public final void alpha(boolean z2) {
        synchronized (g.kilo) {
            try {
                Iterator it = new ArrayList(g.lima.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.echo.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.india.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).alpha;
                            if (!z2) {
                                ((g8.c) gVar2.hotel.get()).charlie();
                            } else {
                                gVar2.getClass();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
