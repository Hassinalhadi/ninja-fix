package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s6.J6;

/* loaded from: classes2.dex */
public final class ak extends Af.q {
    public static final /* synthetic */ AtomicIntegerFieldUpdater teal = AtomicIntegerFieldUpdater.newUpdater(ak.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // Af.q, vf.P
    public final void romeo(Object obj) {
        sierra(obj);
    }

    @Override // Af.q, vf.P
    public final void sierra(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = teal;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    Af.f.golf(J6.delta(this.silver), AbstractC3216u.alpha(obj));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
