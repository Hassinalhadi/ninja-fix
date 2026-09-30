package be;

import av.ah;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t6.AbstractC3003i;

/* renamed from: be.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0758d implements com.google.common.util.concurrent.e {
    public final com.google.common.util.concurrent.e alpha;
    public V0.h purple;

    public C0758d(com.google.common.util.concurrent.e eVar) {
        eVar.getClass();
        this.alpha = eVar;
    }

    public static C0758d alpha(com.google.common.util.concurrent.e eVar) {
        if (eVar instanceof C0758d) {
            return (C0758d) eVar;
        }
        return new C0758d(eVar);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.alpha.cancel(z2);
    }

    @Override // com.google.common.util.concurrent.e
    public final void foxtrot(Runnable runnable, Executor executor) {
        this.alpha.foxtrot(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.alpha.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.alpha.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.alpha.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j5, TimeUnit timeUnit) {
        return this.alpha.get(j5, timeUnit);
    }

    public C0758d() {
        this.alpha = AbstractC3003i.alpha(new ah(7, this));
    }
}
