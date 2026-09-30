package com.checkout.components.kmp.rememberme.data.usecase;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCaseImpl", f = "CreateHintChallengeUseCaseImpl.kt", l = {21}, m = "invoke")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateHintChallengeUseCaseImpl$invoke$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateHintChallengeUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHintChallengeUseCaseImpl$invoke$1(CreateHintChallengeUseCaseImpl createHintChallengeUseCaseImpl, Nd.c<? super CreateHintChallengeUseCaseImpl$invoke$1> cVar) {
        super(cVar);
        this.this$0 = createHintChallengeUseCaseImpl;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(0, null, this);
    }
}
