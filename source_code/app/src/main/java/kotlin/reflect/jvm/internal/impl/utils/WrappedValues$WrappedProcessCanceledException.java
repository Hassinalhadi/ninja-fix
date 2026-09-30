package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes2.dex */
public class WrappedValues$WrappedProcessCanceledException extends RuntimeException {
    public WrappedValues$WrappedProcessCanceledException(Throwable th) {
        super("Rethrow stored exception", th);
    }
}
