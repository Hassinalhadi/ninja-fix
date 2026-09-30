package tg;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class h implements rg.a {
    public volatile boolean alpha = false;
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final LinkedBlockingQueue charlie = new LinkedBlockingQueue();

    @Override // rg.a
    public final synchronized rg.b alpha(String str) {
        g gVar;
        gVar = (g) this.bravo.get(str);
        if (gVar == null) {
            gVar = new g(str, this.charlie, this.alpha);
            this.bravo.put(str, gVar);
        }
        return gVar;
    }
}
