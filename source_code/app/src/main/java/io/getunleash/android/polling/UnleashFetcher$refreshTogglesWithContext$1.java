package io.getunleash.android.polling;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "io.getunleash.android.polling.UnleashFetcher", f = "UnleashFetcher.kt", l = {104, 110, 115}, m = "refreshTogglesWithContext")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashFetcher$refreshTogglesWithContext$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnleashFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnleashFetcher$refreshTogglesWithContext$1(UnleashFetcher unleashFetcher, Nd.c<? super UnleashFetcher$refreshTogglesWithContext$1> cVar) {
        super(cVar);
        this.this$0 = unleashFetcher;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object refreshTogglesWithContext;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        refreshTogglesWithContext = this.this$0.refreshTogglesWithContext(null, this);
        return refreshTogglesWithContext;
    }
}
