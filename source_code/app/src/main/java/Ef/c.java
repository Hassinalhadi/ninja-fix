package Ef;

import Af.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import s6.J6;
import vf.C3207k;
import vf.ad;

/* loaded from: classes2.dex */
public final class c extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater hotel = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z2) {
        super(1, z2 ? 1 : 0);
        t tVar;
        if (z2) {
            tVar = null;
        } else {
            tVar = d.alpha;
        }
        this.owner$volatile = tVar;
    }

    public final boolean charlie() {
        if (Math.max(h.golf.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.hotel(kotlin.Unit.INSTANCE, r3.bravo);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(Nd.c cVar) {
        if (echo()) {
            return Unit.INSTANCE;
        }
        C3207k tango = ad.tango(J6.delta(cVar));
        try {
            b bVar = new b(this, tango);
            while (true) {
                int andDecrement = h.golf.getAndDecrement(this);
                if (andDecrement <= this.alpha) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (alpha(bVar)) {
                        break;
                    }
                }
            }
            Object sierra = tango.sierra();
            Od.a aVar = Od.a.alpha;
            if (sierra != aVar) {
                sierra = Unit.INSTANCE;
            }
            if (sierra == aVar) {
                return sierra;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            tango.amber();
            throw th;
        }
    }

    public final boolean echo() {
        int i4;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.golf;
            int i5 = atomicIntegerFieldUpdater.get(this);
            int i10 = this.alpha;
            if (i5 > i10) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > i10) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i10));
            } else {
                if (i5 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    hotel.set(this, null);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void foxtrot(Object obj) {
        while (charlie()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hotel;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.alpha;
            if (obj2 != tVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                bravo();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + ad.romeo(this) + "[isLocked=" + charlie() + ",owner=" + hotel.get(this) + ']';
    }
}
