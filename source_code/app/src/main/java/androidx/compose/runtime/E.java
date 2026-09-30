package androidx.compose.runtime;

import com.google.android.gms.internal.measurement.C1298c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E {
    public final C0590w alpha;
    public final AbstractC0587t bravo;
    public final C0585q charlie;
    public final Xd.l delta;
    public final boolean echo;
    public final C1298c foxtrot;
    public final Object golf;
    public final AtomicReference hotel = new AtomicReference(F.red);
    public bv.am india;
    public final B9.r juliet;
    public final Z kilo;

    public E(C0590w c0590w, AbstractC0587t abstractC0587t, C0585q c0585q, bv.ao aoVar, Xd.l lVar, boolean z2, C1298c c1298c, Object obj) {
        this.alpha = c0590w;
        this.bravo = abstractC0587t;
        this.charlie = c0585q;
        this.delta = lVar;
        this.echo = z2;
        this.foxtrot = c1298c;
        this.golf = obj;
        bv.am amVar = bv.av.alpha;
        Intrinsics.charlie(amVar, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.india = amVar;
        B9.r rVar = new B9.r();
        rVar.golf(aoVar, c0585q.black());
        this.juliet = rVar;
        this.kilo = new Z(c1298c.red);
    }

    public final void alpha() {
        AtomicReference atomicReference = this.hotel;
        try {
            switch (((F) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    bravo();
                    F f5 = F.white;
                    F f10 = F.yellow;
                    while (!atomicReference.compareAndSet(f5, f10)) {
                        if (atomicReference.get() != f5) {
                            J.bravo("Unexpected state change from: " + f5 + " to: " + f10 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(F.alpha);
            throw e;
        }
    }

    public final void bravo() {
        synchronized (this.golf) {
            try {
                this.kilo.alpha(this.foxtrot, this.juliet);
                this.juliet.charlie();
                this.juliet.delta();
            } finally {
                this.juliet.bravo();
                this.alpha.f3015j = null;
            }
        }
    }

    public final boolean charlie() {
        if (((F) this.hotel.get()).compareTo(F.white) >= 0) {
            return true;
        }
        return false;
    }

    public final void delta() {
        boolean z2;
        F f5 = F.silver;
        F f10 = F.white;
        AtomicReference atomicReference = this.hotel;
        while (true) {
            if (atomicReference.compareAndSet(f5, f10)) {
                z2 = true;
                break;
            } else if (atomicReference.get() != f5) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            J.bravo("Unexpected state change from: " + f5 + " to: " + f10 + '.');
        }
    }

    public final void echo() {
        boolean z2;
        AtomicReference atomicReference = this.hotel;
        Object obj = atomicReference.get();
        F f5 = F.silver;
        if (obj != f5) {
            F f10 = F.white;
            while (true) {
                if (atomicReference.compareAndSet(f10, f5)) {
                    z2 = true;
                    break;
                } else if (atomicReference.get() != f10) {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                J.bravo("Unexpected state change from: " + f10 + " to: " + f5 + '.');
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public final boolean foxtrot(com.google.firebase.messaging.l lVar) {
        AtomicReference atomicReference = this.hotel;
        try {
            int ordinal = ((F) atomicReference.get()).ordinal();
            C0590w c0590w = this.alpha;
            AbstractC0587t abstractC0587t = this.bravo;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C0585q c0585q = this.charlie;
                    boolean z2 = this.echo;
                    if (z2) {
                        c0585q.zulu = 100;
                        c0585q.yankee = true;
                    }
                    try {
                        this.india = abstractC0587t.bravo(c0590w, lVar, this.delta);
                        F f5 = F.red;
                        F f10 = F.silver;
                        while (true) {
                            if (!atomicReference.compareAndSet(f5, f10)) {
                                if (atomicReference.get() != f5) {
                                    J.bravo("Unexpected state change from: " + f5 + " to: " + f10 + '.');
                                }
                            }
                        }
                        if (this.india.golf()) {
                            delta();
                        }
                        return charlie();
                    } finally {
                        if (z2) {
                            c0585q.victor();
                        }
                    }
                case 3:
                    F f11 = F.silver;
                    F f12 = F.teal;
                    while (true) {
                        if (!atomicReference.compareAndSet(f11, f12)) {
                            if (atomicReference.get() != f11) {
                                J.bravo("Unexpected state change from: " + f11 + " to: " + f12 + '.');
                            }
                        }
                    }
                    try {
                        this.india = abstractC0587t.mike(c0590w, lVar, this.india);
                        F f13 = F.teal;
                        F f14 = F.silver;
                        while (true) {
                            if (!atomicReference.compareAndSet(f13, f14)) {
                                if (atomicReference.get() != f13) {
                                    J.bravo("Unexpected state change from: " + f13 + " to: " + f14 + '.');
                                }
                            }
                        }
                        if (this.india.golf()) {
                            delta();
                        }
                        return charlie();
                    } catch (Throwable th) {
                        F f15 = F.teal;
                        F f16 = F.silver;
                        while (true) {
                            if (!atomicReference.compareAndSet(f15, f16)) {
                                if (atomicReference.get() != f15) {
                                    J.bravo("Unexpected state change from: " + f15 + " to: " + f16 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    r.delta("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(F.alpha);
            throw e;
        }
    }
}
