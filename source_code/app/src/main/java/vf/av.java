package vf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class av implements Runnable, Comparable, aq {

    @Nullable
    private volatile Object _heap;
    public long alpha;
    public int purple = -1;

    public av(long j5) {
        this.alpha = j5;
    }

    public final Af.w bravo() {
        Object obj = this._heap;
        if (obj instanceof Af.w) {
            return (Af.w) obj;
        }
        return null;
    }

    public final int charlie(long j5, aw awVar, ax axVar) {
        av avVar;
        boolean z2;
        synchronized (this) {
            if (this._heap == ad.bravo) {
                return 2;
            }
            synchronized (awVar) {
                try {
                    av[] avVarArr = awVar.alpha;
                    if (avVarArr != null) {
                        avVar = avVarArr[0];
                    } else {
                        avVar = null;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ax.white;
                    axVar.getClass();
                    if (ax.f13995a.get(axVar) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return 1;
                    }
                    if (avVar == null) {
                        awVar.charlie = j5;
                    } else {
                        long j6 = avVar.alpha;
                        if (j6 - j5 < 0) {
                            j5 = j6;
                        }
                        if (j5 - awVar.charlie > 0) {
                            awVar.charlie = j5;
                        }
                    }
                    long j7 = this.alpha;
                    long j10 = awVar.charlie;
                    if (j7 - j10 < 0) {
                        this.alpha = j10;
                    }
                    awVar.alpha(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = this.alpha - ((av) obj).alpha;
        if (j5 > 0) {
            return 1;
        }
        if (j5 < 0) {
            return -1;
        }
        return 0;
    }

    public final void delta(aw awVar) {
        if (this._heap != ad.bravo) {
            this._heap = awVar;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // vf.aq
    public final void dispose() {
        aw awVar;
        synchronized (this) {
            try {
                Object obj = this._heap;
                Af.t tVar = ad.bravo;
                if (obj == tVar) {
                    return;
                }
                if (obj instanceof aw) {
                    awVar = (aw) obj;
                } else {
                    awVar = null;
                }
                if (awVar != null) {
                    awVar.bravo(this);
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.alpha + ']';
    }
}
