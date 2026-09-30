package com.incognia.internal;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class CmI implements M1 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f8474b = LazyKt.lazy(II.f8894b);

    static {
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return false;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 1;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        Iterator it = ((List) this.f8474b.getValue()).iterator();
        while (it.hasNext()) {
            WjO.b(context, ((Number) it.next()).intValue());
        }
    }
}
