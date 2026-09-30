package io.getunleash.android.polling;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "io.getunleash.android.polling.UnleashFetcher", f = "UnleashFetcher.kt", l = {176}, m = "fetchToggles")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashFetcher$fetchToggles$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnleashFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnleashFetcher$fetchToggles$1(UnleashFetcher unleashFetcher, Nd.c<? super UnleashFetcher$fetchToggles$1> cVar) {
        super(cVar);
        this.this$0 = unleashFetcher;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchToggles;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        fetchToggles = this.this$0.fetchToggles(null, this);
        return fetchToggles;
    }
}
