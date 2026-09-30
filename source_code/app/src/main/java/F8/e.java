package F8;

import A2.ao;
import B2.ai;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s6.V4;

/* loaded from: classes2.dex */
public final class e {
    public static final HashMap delta = new HashMap();
    public static final ap.a echo = new ap.a(1);
    public final Executor alpha;
    public final p bravo;
    public G6.q charlie = null;

    public e(Executor executor, p pVar) {
        this.alpha = executor;
        this.bravo = pVar;
    }

    public static Object alpha(Task task) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d dVar = new d();
        Executor executor = echo;
        task.echo(executor, dVar);
        task.delta(executor, dVar);
        task.alpha(executor, dVar);
        if (dVar.alpha.await(5L, timeUnit)) {
            if (task.juliet()) {
                return task.hotel();
            }
            throw new ExecutionException(task.golf());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized e delta(Executor executor, p pVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String str = pVar.bravo;
                HashMap hashMap = delta;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new e(executor, pVar));
                }
                eVar = (e) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized Task bravo() {
        try {
            G6.q qVar = this.charlie;
            if (qVar != null) {
                if (qVar.india() && !this.charlie.juliet()) {
                }
            }
            Executor executor = this.alpha;
            p pVar = this.bravo;
            Objects.requireNonNull(pVar);
            this.charlie = V4.charlie(executor, new E8.g(1, pVar));
        } catch (Throwable th) {
            throw th;
        }
        return this.charlie;
    }

    public final g charlie() {
        synchronized (this) {
            try {
                G6.q qVar = this.charlie;
                if (qVar != null && qVar.juliet()) {
                    return (g) this.charlie.hotel();
                }
                try {
                    Task bravo = bravo();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (g) alpha(bravo);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G6.q echo(g gVar) {
        ai aiVar = new ai(2, this, gVar);
        Executor executor = this.alpha;
        return V4.charlie(executor, aiVar).november(executor, new ao(2, this, gVar));
    }
}
