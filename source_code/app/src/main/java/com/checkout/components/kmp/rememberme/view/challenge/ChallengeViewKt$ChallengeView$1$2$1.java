package com.checkout.components.kmp.rememberme.view.challenge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ChallengeViewKt$ChallengeView$1$2$1 extends i implements Function0<Unit> {
    public ChallengeViewKt$ChallengeView$1$2$1(Object obj) {
        super(0, 0, ChallengeViewModel.class, obj, "cancelChallengeRequest", "cancelChallengeRequest$rememberme_release()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChallengeViewModel) this.receiver).cancelChallengeRequest$rememberme_release();
    }
}
