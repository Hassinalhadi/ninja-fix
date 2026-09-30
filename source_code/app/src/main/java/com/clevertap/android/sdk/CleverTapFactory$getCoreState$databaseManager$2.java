package com.clevertap.android.sdk;

import com.clevertap.android.sdk.network.NetworkRepo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CleverTapFactory$getCoreState$databaseManager$2 extends kotlin.jvm.internal.i implements Function0<Unit> {
    public CleverTapFactory$getCoreState$databaseManager$2(Object obj) {
        super(0, 0, NetworkRepo.class, obj, "clearLastRequestTs", "clearLastRequestTs()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NetworkRepo) this.receiver).clearLastRequestTs();
    }
}
