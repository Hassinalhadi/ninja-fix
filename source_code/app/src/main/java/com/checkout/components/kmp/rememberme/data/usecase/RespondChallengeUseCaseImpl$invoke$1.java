package com.checkout.components.kmp.rememberme.data.usecase;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCaseImpl", f = "RespondChallengeUseCaseImpl.kt", l = {21}, m = "invoke")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RespondChallengeUseCaseImpl$invoke$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RespondChallengeUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RespondChallengeUseCaseImpl$invoke$1(RespondChallengeUseCaseImpl respondChallengeUseCaseImpl, Nd.c<? super RespondChallengeUseCaseImpl$invoke$1> cVar) {
        super(cVar);
        this.this$0 = respondChallengeUseCaseImpl;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(null, null, this);
    }
}
