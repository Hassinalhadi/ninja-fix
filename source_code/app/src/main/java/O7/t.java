package O7;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class t implements Thread.UncaughtExceptionHandler {
    public final D8.c alpha;
    public final D5.s bravo;
    public final Thread.UncaughtExceptionHandler charlie;
    public final L7.a delta;
    public final AtomicBoolean echo = new AtomicBoolean(false);

    public t(D8.c cVar, D5.s sVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, L7.a aVar) {
        this.alpha = cVar;
        this.bravo = sVar;
        this.charlie = uncaughtExceptionHandler;
        this.delta = aVar;
    }

    public final boolean alpha(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (this.delta.bravo()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.charlie;
        AtomicBoolean atomicBoolean = this.echo;
        atomicBoolean.set(true);
        try {
            try {
                if (alpha(thread, th)) {
                    this.alpha.lima(this.bravo, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                L7.c cVar = L7.c.alpha;
                if (cVar.bravo(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar.charlie("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    cVar.charlie("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
