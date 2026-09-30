package vf;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3202f extends AbstractC3197a {
    public final Thread silver;
    public final ay teal;

    public C3202f(Nd.h hVar, Thread thread, ay ayVar) {
        super(hVar, true, true);
        this.silver = thread;
        this.teal = ayVar;
    }

    @Override // vf.P
    public final void romeo(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.silver;
        if (!Intrinsics.areEqual(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
