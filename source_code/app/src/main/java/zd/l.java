package zd;

import Yb.C0331t0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends LinkedHashMap {
    public final C0331t0 alpha;
    public final com.clevertap.android.sdk.inapp.images.preload.a purple;
    public final int red;

    public l(C0331t0 c0331t0, com.clevertap.android.sdk.inapp.images.preload.a aVar) {
        super(10, 0.75f, true);
        this.alpha = c0331t0;
        this.purple = aVar;
        this.red = 10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.red == 0) {
            return this.alpha.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = this.alpha.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        boolean z2;
        Intrinsics.echo(eldest, "eldest");
        if (super.size() > this.red) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.purple.invoke(eldest.getValue());
        }
        return z2;
    }
}
