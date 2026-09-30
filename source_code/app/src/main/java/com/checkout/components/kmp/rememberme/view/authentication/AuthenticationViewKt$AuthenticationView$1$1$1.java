package com.checkout.components.kmp.rememberme.view.authentication;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class AuthenticationViewKt$AuthenticationView$1$1$1 extends i implements Function0<Unit> {
    public AuthenticationViewKt$AuthenticationView$1$1$1(Object obj) {
        super(0, 0, AuthenticationViewModel.class, obj, "goToChallengeView", "goToChallengeView$rememberme_release()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuthenticationViewModel) this.receiver).goToChallengeView$rememberme_release();
    }
}
