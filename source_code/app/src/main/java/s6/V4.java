package s6;

import android.os.Looper;
import bd.ExecutorC0748a;
import bd.ExecutorC0753f;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class V4 {
    public static final /* synthetic */ int alpha = 0;

    public static Object alpha(G6.q qVar, long j5, TimeUnit timeUnit) {
        V5.x.golf("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        V5.x.india(qVar, "Task must not be null");
        V5.x.india(timeUnit, "TimeUnit must not be null");
        if (qVar.india()) {
            return hotel(qVar);
        }
        Aa.m mVar = new Aa.m(10);
        Executor executor = G6.i.bravo;
        qVar.echo(executor, mVar);
        qVar.delta(executor, mVar);
        qVar.alpha(executor, mVar);
        if (((CountDownLatch) mVar.purple).await(j5, timeUnit)) {
            return hotel(qVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object bravo(Task task) {
        V5.x.golf("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        V5.x.india(task, "Task must not be null");
        if (task.india()) {
            return hotel(task);
        }
        Aa.m mVar = new Aa.m(10);
        Executor executor = G6.i.bravo;
        task.echo(executor, mVar);
        task.delta(executor, mVar);
        task.alpha(executor, mVar);
        ((CountDownLatch) mVar.purple).await();
        return hotel(task);
    }

    public static G6.q charlie(Executor executor, Callable callable) {
        V5.x.india(executor, "Executor must not be null");
        G6.q qVar = new G6.q();
        executor.execute(new E(3, qVar, callable));
        return qVar;
    }

    public static G6.q delta(Exception exc) {
        G6.q qVar = new G6.q();
        qVar.oscar(exc);
        return qVar;
    }

    public static G6.q echo(Object obj) {
        G6.q qVar = new G6.q();
        qVar.papa(obj);
        return qVar;
    }

    public static G6.q foxtrot(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            G6.q qVar = new G6.q();
            G6.k kVar = new G6.k(list.size(), qVar);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Task task = (Task) it2.next();
                ExecutorC0748a executorC0748a = G6.i.bravo;
                task.echo(executorC0748a, kVar);
                task.delta(executorC0748a, kVar);
                task.alpha(executorC0748a, kVar);
            }
            return qVar;
        }
        return echo(null);
    }

    public static G6.q golf(Task... taskArr) {
        if (taskArr.length == 0) {
            return echo(Collections.EMPTY_LIST);
        }
        List asList = Arrays.asList(taskArr);
        ExecutorC0753f executorC0753f = G6.i.alpha;
        if (asList != null && !asList.isEmpty()) {
            return foxtrot(asList).foxtrot(executorC0753f, new G6.j(asList));
        }
        return echo(Collections.EMPTY_LIST);
    }

    public static Object hotel(Task task) {
        if (task.juliet()) {
            return task.hotel();
        }
        if (((G6.q) task).delta) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.golf());
    }
}
