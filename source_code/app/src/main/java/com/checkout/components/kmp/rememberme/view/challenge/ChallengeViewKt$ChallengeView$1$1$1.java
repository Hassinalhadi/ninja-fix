package com.checkout.components.kmp.rememberme.view.challenge;

import com.checkout.components.kmp.rememberme.shared.model.Hint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ChallengeViewKt$ChallengeView$1$1$1 extends i implements Function1<Hint, Unit> {
    public ChallengeViewKt$ChallengeView$1$1$1(Object obj) {
        super(1, 0, ChallengeViewModel.class, obj, "createChallenge", "createChallenge$rememberme_release(Lcom/checkout/components/kmp/rememberme/shared/model/Hint;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Hint hint) {
        invoke2(hint);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Hint p02) {
        Intrinsics.echo(p02, "p0");
        ((ChallengeViewModel) this.receiver).createChallenge$rememberme_release(p02);
    }
}
