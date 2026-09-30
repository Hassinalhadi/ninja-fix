package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u0006*\u00028\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T1", "T2", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC1220i2<V> implements Callable {
    public /* synthetic */ C1228k2 alpha;
    public /* synthetic */ Sensor purple;

    @Override // java.util.concurrent.Callable
    public final List<? extends List<? extends Float>> call() {
        C1228k2 c1228k2 = this.alpha;
        if (!(!C1228k2.bravo(c1228k2).alpha)) {
            C1228k2 c1228k22 = this.alpha;
            return C1228k2.charlie(c1228k22, this.purple, C1228k2.bravo(c1228k22).charlie, C1228k2.bravo(c1228k2).bravo, C1228k2.bravo(c1228k2).delta);
        }
        return CollectionsKt.emptyList();
    }
}
