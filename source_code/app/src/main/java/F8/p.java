package F8;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class p {
    public static final HashMap charlie = new HashMap();
    public final Context alpha;
    public final String bravo;

    public p(Context context, String str) {
        this.alpha = context;
        this.bravo = str;
    }

    public final synchronized void alpha() {
        this.alpha.deleteFile(this.bravo);
    }
}
