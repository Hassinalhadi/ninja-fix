package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import vg.d;
import vg.f;

/* loaded from: classes2.dex */
final class RxJava2CallAdapter<R> implements f {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final Scheduler scheduler;

    public RxJava2CallAdapter(Type type, Scheduler scheduler, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isAsync = z2;
        this.isResult = z10;
        this.isBody = z11;
        this.isFlowable = z12;
        this.isSingle = z13;
        this.isMaybe = z14;
        this.isCompletable = z15;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // vg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object adapt(d<R> dVar) {
        Observable callExecuteObservable;
        Observable bodyObservable;
        Scheduler scheduler;
        if (this.isAsync) {
            callExecuteObservable = new CallEnqueueObservable(dVar);
        } else {
            callExecuteObservable = new CallExecuteObservable(dVar);
        }
        if (this.isResult) {
            bodyObservable = new ResultObservable(callExecuteObservable);
        } else {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callExecuteObservable);
            }
            scheduler = this.scheduler;
            if (scheduler != null) {
                callExecuteObservable = callExecuteObservable.subscribeOn(scheduler);
            }
            if (!this.isFlowable) {
                return callExecuteObservable.toFlowable(BackpressureStrategy.MISSING);
            }
            if (this.isSingle) {
                return callExecuteObservable.singleOrError();
            }
            if (this.isMaybe) {
                return callExecuteObservable.singleElement();
            }
            if (this.isCompletable) {
                return callExecuteObservable.ignoreElements();
            }
            return RxJavaPlugins.onAssembly(callExecuteObservable);
        }
        callExecuteObservable = bodyObservable;
        scheduler = this.scheduler;
        if (scheduler != null) {
        }
        if (!this.isFlowable) {
        }
    }

    @Override // vg.f
    public Type responseType() {
        return this.responseType;
    }
}
