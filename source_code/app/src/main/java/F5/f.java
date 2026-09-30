package F5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {
    public final J2.e alpha;
    public final d bravo;
    public final HashMap charlie;

    public f(Context context, d dVar) {
        J2.e eVar = new J2.e(context);
        this.charlie = new HashMap();
        this.alpha = eVar;
        this.bravo = dVar;
    }

    public final synchronized h alpha(String str) {
        if (this.charlie.containsKey(str)) {
            return (h) this.charlie.get(str);
        }
        CctBackendFactory A = this.alpha.A(str);
        if (A == null) {
            return null;
        }
        d dVar = this.bravo;
        h create = A.create(new b(dVar.alpha, dVar.bravo, dVar.charlie, str));
        this.charlie.put(str, create);
        return create;
    }
}
