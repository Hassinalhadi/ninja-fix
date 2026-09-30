package A2;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class am {
    public final y alpha(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.echo(appContext, "appContext");
        Intrinsics.echo(workerClassName, "workerClassName");
        Intrinsics.echo(workerParameters, "workerParameters");
        try {
            Class<? extends U> asSubclass = Class.forName(workerClassName).asSubclass(y.class);
            Intrinsics.delta(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                Intrinsics.delta(newInstance, "{\n                val co…Parameters)\n            }");
                y yVar = (y) newInstance;
                if (!yVar.isUsed()) {
                    return yVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                z.echo().delta(an.alpha, "Could not instantiate ".concat(workerClassName), th);
                throw th;
            }
        } catch (Throwable th2) {
            z.echo().delta(an.alpha, "Invalid class: ".concat(workerClassName), th2);
            throw th2;
        }
    }
}
