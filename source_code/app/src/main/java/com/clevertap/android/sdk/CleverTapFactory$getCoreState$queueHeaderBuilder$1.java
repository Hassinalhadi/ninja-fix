package com.clevertap.android.sdk;

import com.clevertap.android.sdk.network.NetworkRepo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CleverTapFactory$getCoreState$queueHeaderBuilder$1 extends kotlin.jvm.internal.i implements Function0<Integer> {
    public CleverTapFactory$getCoreState$queueHeaderBuilder$1(Object obj) {
        super(0, 0, NetworkRepo.class, obj, "getFirstRequestTs", "getFirstRequestTs()I");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((NetworkRepo) this.receiver).getFirstRequestTs());
    }
}
