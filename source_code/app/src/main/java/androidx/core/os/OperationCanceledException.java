package androidx.core.os;

/* loaded from: classes3.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }
}
