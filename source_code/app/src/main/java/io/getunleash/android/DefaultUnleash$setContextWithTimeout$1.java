package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.polling.ToggleResponse;
import io.getunleash.android.polling.UnleashFetcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.TimeoutCancellationException;
import vf.ab;
import vf.d0;
import vf.f0;

@e(c = "io.getunleash.android.DefaultUnleash$setContextWithTimeout$1", f = "DefaultUnleash.kt", l = {343}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "Lio/getunleash/android/polling/ToggleResponse;", "<anonymous>", "(Lvf/ab;)Lio/getunleash/android/polling/ToggleResponse;"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$setContextWithTimeout$1 extends i implements l {
    final /* synthetic */ UnleashContext $context;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    @e(c = "io.getunleash.android.DefaultUnleash$setContextWithTimeout$1$1", f = "DefaultUnleash.kt", l = {344}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "Lio/getunleash/android/polling/ToggleResponse;", "<anonymous>", "(Lvf/ab;)Lio/getunleash/android/polling/ToggleResponse;"}, k = 3, mv = {2, 2, 0})
    /* renamed from: io.getunleash.android.DefaultUnleash$setContextWithTimeout$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements l {
        final /* synthetic */ UnleashContext $context;
        int label;
        final /* synthetic */ DefaultUnleash this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultUnleash defaultUnleash, UnleashContext unleashContext, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultUnleash;
            this.$context = unleashContext;
        }

        @Override // Pd.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$context, cVar);
        }

        @Override // Pd.a
        public final Object invokeSuspend(Object obj) {
            UnleashFetcher unleashFetcher;
            Od.a aVar = Od.a.alpha;
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
            unleashFetcher = this.this$0.fetcher;
            UnleashContext unleashContext = this.$context;
            this.label = 1;
            Object refreshTogglesIfContextChanged = unleashFetcher.refreshTogglesIfContextChanged(unleashContext, this);
            if (refreshTogglesIfContextChanged == aVar) {
                return aVar;
            }
            return refreshTogglesIfContextChanged;
        }

        @Override // Xd.l
        public final Object invoke(ab abVar, c<? super ToggleResponse> cVar) {
            return ((AnonymousClass1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$setContextWithTimeout$1(long j5, DefaultUnleash defaultUnleash, UnleashContext unleashContext, c<? super DefaultUnleash$setContextWithTimeout$1> cVar) {
        super(2, cVar);
        this.$timeout = j5;
        this.this$0 = defaultUnleash;
        this.$context = unleashContext;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$setContextWithTimeout$1(this.$timeout, this.this$0, this.$context, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        long j5 = this.$timeout;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, null);
        this.label = 1;
        if (j5 > 0) {
            Object alpha = f0.alpha(new d0(j5, this), anonymousClass1);
            if (alpha == aVar) {
                return aVar;
            }
            return alpha;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super ToggleResponse> cVar) {
        return ((DefaultUnleash$setContextWithTimeout$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
