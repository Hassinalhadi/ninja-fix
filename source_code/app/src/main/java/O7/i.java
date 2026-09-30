package O7;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i {
    public final u alpha;
    public final h bravo;

    public i(u uVar, U7.c cVar) {
        this.alpha = uVar;
        this.bravo = new h(cVar);
    }

    public final void alpha(String str) {
        h hVar = this.bravo;
        synchronized (hVar) {
            if (!Objects.equals(hVar.bravo, str)) {
                h.alpha(hVar.alpha, str, hVar.charlie);
                hVar.bravo = str;
            }
        }
    }
}
