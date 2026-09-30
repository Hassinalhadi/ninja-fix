package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import vg.aq;
import vg.at;
import vg.e;
import vg.f;

/* loaded from: classes2.dex */
public final class RxJava2CallAdapterFactory extends e {
    private final boolean isAsync;
    private final Scheduler scheduler;

    private RxJava2CallAdapterFactory(Scheduler scheduler, boolean z2) {
        this.scheduler = scheduler;
        this.isAsync = z2;
    }

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(Scheduler scheduler) {
        if (scheduler != null) {
            return new RxJava2CallAdapterFactory(scheduler, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // vg.e
    public f get(Type type, Annotation[] annotationArr, at atVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        Type type2;
        boolean z12;
        boolean z13;
        String str;
        Class<?> rawType = e.getRawType(type);
        if (rawType == Completable.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        if (rawType == Flowable.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rawType == Single.class) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rawType == Maybe.class) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rawType != Observable.class && !z2 && !z10 && !z11) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z2) {
                if (!z10) {
                    if (z11) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = e.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = e.getRawType(parameterUpperBound);
        if (rawType2 == aq.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = e.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z13 = false;
                z12 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 == Result.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = e.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z13 = true;
                z12 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            type2 = parameterUpperBound;
            z12 = true;
            z13 = false;
        }
        return new RxJava2CallAdapter(type2, this.scheduler, this.isAsync, z13, z12, z2, z10, z11, false);
    }
}
