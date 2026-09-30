package com.clevertap.android.sdk.customviews;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MediaPlayerRecyclerView$initialize$2 extends i implements Function0<Unit> {
    public MediaPlayerRecyclerView$initialize$2(Object obj) {
        super(0, 0, MediaPlayerRecyclerView.class, obj, "playerReady", "playerReady()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MediaPlayerRecyclerView) this.receiver).playerReady();
    }
}
