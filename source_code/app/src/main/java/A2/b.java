package A2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements ThreadFactory {
    public final AtomicInteger alpha = new AtomicInteger(0);
    public final /* synthetic */ boolean purple;

    public b(boolean z2) {
        this.purple = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        Intrinsics.echo(runnable, "runnable");
        if (this.purple) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder tango = Q0.c.tango(str);
        tango.append(this.alpha.incrementAndGet());
        return new Thread(runnable, tango.toString());
    }
}
