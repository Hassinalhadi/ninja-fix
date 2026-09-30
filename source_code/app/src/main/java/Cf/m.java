package Cf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater bravo = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater charlie = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater delta = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater echo = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray alpha = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i alpha(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = charlie;
        if (atomicIntegerFieldUpdater.get(this) - delta.get(this) == 127) {
            return iVar;
        }
        if (iVar.purple) {
            echo.incrementAndGet(this);
        }
        int i4 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.alpha;
            if (atomicReferenceArray.get(i4) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i4, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final i bravo() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = delta;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - charlie.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (iVar = (i) this.alpha.getAndSet(i5, null)) != null) {
                if (iVar.purple) {
                    echo.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        Cf.m.echo.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.purple == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i charlie(int i4, boolean z2) {
        int i5 = i4 & 127;
        AtomicReferenceArray atomicReferenceArray = this.alpha;
        i iVar = (i) atomicReferenceArray.get(i5);
        if (iVar != null) {
        }
        return null;
    }
}
