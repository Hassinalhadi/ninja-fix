package s6;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class Q7 {
    public final X5.b alpha;
    public final AtomicLong bravo = new AtomicLong(-1);

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.common.api.g, X5.b] */
    public Q7(Context context) {
        this.alpha = new com.google.android.gms.common.api.g(context, null, X5.b.india, new V5.m("mlkit:vision"), com.google.android.gms.common.api.f.bravo);
    }
}
