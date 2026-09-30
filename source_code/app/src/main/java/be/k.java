package be;

import bd.ExecutorC0748a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final class k implements com.google.common.util.concurrent.e {
    public ArrayList alpha;
    public ArrayList purple;
    public final boolean red;
    public final AtomicInteger silver;
    public final V0.k teal = AbstractC3003i.alpha(new androidx.core.widget.f(12, this));
    public V0.h white;

    public k(ArrayList arrayList, boolean z2, ExecutorC0748a executorC0748a) {
        this.alpha = arrayList;
        this.purple = new ArrayList(arrayList.size());
        this.red = z2;
        this.silver = new AtomicInteger(arrayList.size());
        foxtrot(new F6.b(16, this), tg.k.bravo());
        if (this.alpha.isEmpty()) {
            this.white.bravo(new ArrayList(this.purple));
            return;
        }
        for (int i4 = 0; i4 < this.alpha.size(); i4++) {
            this.purple.add(null);
        }
        ArrayList arrayList2 = this.alpha;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) arrayList2.get(i5);
            eVar.foxtrot(new D2.i(this, i5, eVar), executorC0748a);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        ArrayList arrayList = this.alpha;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.e) it.next()).cancel(z2);
            }
        }
        return this.teal.cancel(z2);
    }

    @Override // com.google.common.util.concurrent.e
    public final void foxtrot(Runnable runnable, Executor executor) {
        this.teal.purple.foxtrot(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return (List) this.teal.purple.get(j5, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.teal.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.teal.purple.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.alpha;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) it.next();
                while (!eVar.isDone()) {
                    try {
                        eVar.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e4) {
                        throw e4;
                    } catch (Throwable unused) {
                        if (this.red) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.teal.purple.get();
    }
}
