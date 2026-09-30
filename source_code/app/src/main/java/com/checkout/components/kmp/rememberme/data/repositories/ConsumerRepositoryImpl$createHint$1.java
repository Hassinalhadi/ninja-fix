package com.checkout.components.kmp.rememberme.data.repositories;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepositoryImpl", f = "ConsumerRepositoryImpl.kt", l = {91, 93}, m = "createHint")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsumerRepositoryImpl$createHint$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsumerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumerRepositoryImpl$createHint$1(ConsumerRepositoryImpl consumerRepositoryImpl, Nd.c<? super ConsumerRepositoryImpl$createHint$1> cVar) {
        super(cVar);
        this.this$0 = consumerRepositoryImpl;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.createHint(null, this);
    }
}
