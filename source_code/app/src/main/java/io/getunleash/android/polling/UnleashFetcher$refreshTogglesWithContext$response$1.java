package io.getunleash.android.polling;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@e(c = "io.getunleash.android.polling.UnleashFetcher$refreshTogglesWithContext$response$1", f = "UnleashFetcher.kt", l = {106}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/getunleash/android/polling/ToggleResponse;"}, k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashFetcher$refreshTogglesWithContext$response$1 extends i implements Function1<c<? super ToggleResponse>, Object> {
    final /* synthetic */ UnleashContext $ctx;
    int label;
    final /* synthetic */ UnleashFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnleashFetcher$refreshTogglesWithContext$response$1(UnleashFetcher unleashFetcher, UnleashContext unleashContext, c<? super UnleashFetcher$refreshTogglesWithContext$response$1> cVar) {
        super(1, cVar);
        this.this$0 = unleashFetcher;
        this.$ctx = unleashContext;
    }

    @Override // Pd.a
    public final c<Unit> create(c<?> cVar) {
        return new UnleashFetcher$refreshTogglesWithContext$response$1(this.this$0, this.$ctx, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(c<? super ToggleResponse> cVar) {
        return ((UnleashFetcher$refreshTogglesWithContext$response$1) create(cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        UnleashLogger.d$default(UnleashLogger.INSTANCE, "UnleashFetcher", "Refreshing toggles", null, 4, null);
        UnleashFetcher unleashFetcher = this.this$0;
        UnleashContext unleashContext = this.$ctx;
        this.label = 1;
        Object doFetchToggles$unleashandroidsdk_release = unleashFetcher.doFetchToggles$unleashandroidsdk_release(unleashContext, this);
        if (doFetchToggles$unleashandroidsdk_release == aVar) {
            return aVar;
        }
        return doFetchToggles$unleashandroidsdk_release;
    }
}
