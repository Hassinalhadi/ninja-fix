package Tf;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Incorrect condition in loop: B:10:0x0058 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, Tf.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(c cVar, g gVar, long j5, boolean z2) {
        g gVar2;
        g gVar3;
        g gVar4;
        g gVar5;
        g gVar6;
        Condition condition;
        g gVar7;
        cVar.getClass();
        gVar2 = g.head;
        if (gVar2 == null) {
            g.head = new Object();
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        long nanoTime = System.nanoTime();
        if (j5 != 0 && z2) {
            gVar.timeoutAt = Math.min(j5, gVar.deadlineNanoTime() - nanoTime) + nanoTime;
        } else if (j5 != 0) {
            gVar.timeoutAt = j5 + nanoTime;
        } else if (z2) {
            gVar.timeoutAt = gVar.deadlineNanoTime();
        } else {
            throw new AssertionError();
        }
        long access$remainingNanos = g.access$remainingNanos(gVar, nanoTime);
        gVar3 = g.head;
        Intrinsics.checkNotNull(gVar3);
        while (gVar4 != null) {
            gVar7 = gVar3.next;
            Intrinsics.checkNotNull(gVar7);
            if (access$remainingNanos < g.access$remainingNanos(gVar7, nanoTime)) {
                break;
            }
            gVar3 = gVar3.next;
            Intrinsics.checkNotNull(gVar3);
        }
        gVar5 = gVar3.next;
        gVar.next = gVar5;
        gVar3.next = gVar;
        gVar6 = g.head;
        if (gVar3 == gVar6) {
            condition = g.condition;
            condition.signal();
        }
    }

    public static final void bravo(c cVar, g gVar) {
        g gVar2;
        g gVar3;
        g gVar4;
        cVar.getClass();
        for (gVar2 = g.head; gVar2 != null; gVar2 = gVar2.next) {
            gVar3 = gVar2.next;
            if (gVar3 == gVar) {
                gVar4 = gVar.next;
                gVar2.next = gVar4;
                gVar.next = null;
                return;
            }
        }
        throw new IllegalStateException("node was not found in the queue");
    }

    public static g charlie() {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        Condition condition;
        Condition condition2;
        long j5;
        g gVar5;
        g gVar6;
        long j6;
        g gVar7;
        gVar = g.head;
        Intrinsics.checkNotNull(gVar);
        gVar2 = gVar.next;
        if (gVar2 == null) {
            long nanoTime = System.nanoTime();
            condition2 = g.condition;
            j5 = g.IDLE_TIMEOUT_MILLIS;
            condition2.await(j5, TimeUnit.MILLISECONDS);
            gVar5 = g.head;
            Intrinsics.checkNotNull(gVar5);
            gVar6 = gVar5.next;
            if (gVar6 == null) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                j6 = g.IDLE_TIMEOUT_NANOS;
                if (nanoTime2 >= j6) {
                    gVar7 = g.head;
                    return gVar7;
                }
            }
            return null;
        }
        long access$remainingNanos = g.access$remainingNanos(gVar2, System.nanoTime());
        if (access$remainingNanos > 0) {
            condition = g.condition;
            condition.await(access$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        gVar3 = g.head;
        Intrinsics.checkNotNull(gVar3);
        gVar4 = gVar2.next;
        gVar3.next = gVar4;
        gVar2.next = null;
        gVar2.state = 2;
        return gVar2;
    }
}
