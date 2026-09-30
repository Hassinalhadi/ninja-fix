package com.checkout.components.kmp.rememberme.data.usecase;

import Od.a;
import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.components.kmp.rememberme.data.usecase.CreateHintUseCase", f = "CreateHintUseCase.kt", l = {34}, m = "invoke-gIAlu-s$rememberme_release")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateHintUseCase$invoke$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateHintUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHintUseCase$invoke$1(CreateHintUseCase createHintUseCase, Nd.c<? super CreateHintUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = createHintUseCase;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m116invokegIAlus$rememberme_release = this.this$0.m116invokegIAlus$rememberme_release(null, this);
        if (m116invokegIAlus$rememberme_release == a.alpha) {
            return m116invokegIAlus$rememberme_release;
        }
        return new Result(m116invokegIAlus$rememberme_release);
    }
}
