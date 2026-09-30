package tg;

import android.os.Handler;
import android.os.Looper;
import bd.AbstractC0754g;
import bd.ExecutorC0748a;
import bd.ExecutorC0752e;
import bd.ExecutorC0753f;
import bd.ScheduledExecutorServiceC0750c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zd.q;

/* loaded from: classes2.dex */
public abstract class k {
    public static j alpha;
    public static boolean bravo;

    public static final void alpha(q qVar, q builder) {
        Intrinsics.echo(qVar, "<this>");
        Intrinsics.echo(builder, "builder");
        for (Map.Entry entry : builder.foxtrot()) {
            qVar.indigo((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static ExecutorC0748a bravo() {
        if (ExecutorC0748a.purple != null) {
            return ExecutorC0748a.purple;
        }
        synchronized (ExecutorC0748a.class) {
            try {
                if (ExecutorC0748a.purple == null) {
                    ExecutorC0748a.purple = new ExecutorC0748a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC0748a.purple;
    }

    public static ExecutorC0752e charlie() {
        if (ExecutorC0752e.red != null) {
            return ExecutorC0752e.red;
        }
        synchronized (ExecutorC0752e.class) {
            try {
                if (ExecutorC0752e.red == null) {
                    ExecutorC0752e.red = new ExecutorC0752e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC0752e.red;
    }

    public static ExecutorC0753f delta() {
        if (ExecutorC0753f.red != null) {
            return ExecutorC0753f.red;
        }
        synchronized (ExecutorC0753f.class) {
            try {
                if (ExecutorC0753f.red == null) {
                    ExecutorC0753f.red = new ExecutorC0753f(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC0753f.red;
    }

    public static ScheduledExecutorServiceC0750c echo() {
        if (AbstractC0754g.alpha != null) {
            return AbstractC0754g.alpha;
        }
        synchronized (AbstractC0754g.class) {
            try {
                if (AbstractC0754g.alpha == null) {
                    AbstractC0754g.alpha = new ScheduledExecutorServiceC0750c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return AbstractC0754g.alpha;
    }
}
