package io.reactivex.internal.util;

import com.clevertap.android.sdk.Constants;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public enum NotificationLite {
    COMPLETE;

    /* loaded from: classes2.dex */
    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + Constants.AES_SUFFIX;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        public ErrorNotification(Throwable th) {
            this.e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.e, ((ErrorNotification) obj).e);
            }
            return false;
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.e + Constants.AES_SUFFIX;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final d upstream;

        public SubscriptionNotification(d dVar) {
            this.upstream = dVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + Constants.AES_SUFFIX;
        }
    }

    public static <T> boolean accept(Object obj, c cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).e);
            return true;
        }
        cVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, c cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            cVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        cVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).e;
    }

    public static d getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t5) {
        return t5;
    }

    public static Object subscription(d dVar) {
        return new SubscriptionNotification(dVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        observer.onNext(obj);
        return false;
    }
}
