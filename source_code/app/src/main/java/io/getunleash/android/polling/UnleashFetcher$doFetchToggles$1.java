package io.getunleash.android.polling;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "io.getunleash.android.polling.UnleashFetcher", f = "UnleashFetcher.kt", l = {121, 130}, m = "doFetchToggles$unleashandroidsdk_release")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashFetcher$doFetchToggles$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnleashFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnleashFetcher$doFetchToggles$1(UnleashFetcher unleashFetcher, Nd.c<? super UnleashFetcher$doFetchToggles$1> cVar) {
        super(cVar);
        this.this$0 = unleashFetcher;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.doFetchToggles$unleashandroidsdk_release(null, this);
    }
}
