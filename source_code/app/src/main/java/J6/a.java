package J6;

import J2.e;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class a {
    public final Object alpha;
    public final Status bravo;

    public a(Object obj, Status status) {
        this.alpha = obj;
        this.bravo = status;
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.bravo, "status");
        eVar.y(this.alpha, "result");
        return eVar.toString();
    }
}
