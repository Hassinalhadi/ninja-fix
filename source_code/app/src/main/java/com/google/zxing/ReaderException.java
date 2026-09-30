package com.google.zxing;

/* loaded from: classes2.dex */
public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] NO_TRACE;
    protected static boolean isStackTrace;

    static {
        boolean z2;
        if (System.getProperty("surefire.test.class.path") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        isStackTrace = z2;
        NO_TRACE = new StackTraceElement[0];
    }

    public ReaderException() {
    }

    public static void setStackTrace(boolean z2) {
        isStackTrace = z2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}
