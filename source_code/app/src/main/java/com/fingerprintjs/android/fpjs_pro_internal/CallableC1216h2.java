package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u0006*\u00028\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T1", "T2", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC1216h2<V> implements Callable {
    public static int red = 0;
    public static int silver = 1;
    public /* synthetic */ C1228k2 alpha;
    public /* synthetic */ Sensor purple;

    @Override // java.util.concurrent.Callable
    public final List<? extends List<? extends Float>> call() {
        int i4 = silver;
        red = (((i4 | 1) << 1) - (i4 ^ 1)) % 128;
        C1228k2 c1228k2 = this.alpha;
        if (C1228k2.bravo(c1228k2).echo) {
            int i5 = red + 123;
            silver = i5 % 128;
            if (i5 % 2 == 0) {
                C1228k2 c1228k22 = this.alpha;
                int i10 = 73 / 0;
                return C1228k2.charlie(c1228k22, this.purple, C1228k2.bravo(c1228k22).golf, C1228k2.bravo(c1228k2).foxtrot, C1228k2.bravo(c1228k2).hotel);
            }
            C1228k2 c1228k23 = this.alpha;
            return C1228k2.charlie(c1228k23, this.purple, C1228k2.bravo(c1228k23).golf, C1228k2.bravo(c1228k2).foxtrot, C1228k2.bravo(c1228k2).hotel);
        }
        List<? extends List<? extends Float>> emptyList = CollectionsKt.emptyList();
        int i11 = red;
        int i12 = ((i11 | 15) << 1) - (i11 ^ 15);
        silver = i12 % 128;
        if (i12 % 2 != 0) {
            return emptyList;
        }
        throw null;
    }
}
