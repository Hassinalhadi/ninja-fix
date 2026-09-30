package J7;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class h extends V0.g implements ScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f1628a;

    public h(g gVar) {
        this.f1628a = gVar.alpha(new D8.c(23, this));
    }

    @Override // V0.g
    public final void bravo() {
        boolean z2;
        ScheduledFuture scheduledFuture = this.f1628a;
        Object obj = this.alpha;
        if ((obj instanceof V0.a) && ((V0.a) obj).alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        scheduledFuture.cancel(z2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f1628a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f1628a.getDelay(timeUnit);
    }
}
