package com.incognia.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class VVw implements M1 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9776b = LazyKt.lazy(kY6.f10771b);

    static {
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return false;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 6;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        int collectionSizeOrDefault;
        List<String> list = (List) this.f9776b.getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : list) {
            String str2 = VD2.f9761b;
            arrayList.add(VD2.f9761b + '.' + str + '.' + VD2.f9760W);
        }
        QHn.f9492b.b(arrayList);
    }
}
