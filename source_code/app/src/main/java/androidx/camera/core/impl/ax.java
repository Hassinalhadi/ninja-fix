package androidx.camera.core.impl;

import B9.C0058p;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ax implements A {
    public int alpha;
    public boolean purple;
    public Object red;
    public Object silver;
    public Object teal;
    public final Object white;

    public ax(E e) {
        this.red = new Object();
        this.alpha = 0;
        this.purple = false;
        this.teal = new HashMap();
        this.white = new CopyOnWriteArraySet();
        this.silver = new AtomicReference(e);
    }

    public boolean alpha(int i4, int i5) {
        J.e eVar = (J.e) this.silver;
        int i10 = this.alpha;
        T.q qVar = (T.q) eVar.alpha[i4 + i10];
        T.q qVar2 = (T.q) ((J.e) this.teal).alpha[i10 + i5];
        if (Intrinsics.areEqual(qVar, qVar2) || qVar.getClass() == qVar2.getClass()) {
            return true;
        }
        return false;
    }

    public be.j bravo() {
        Object obj = ((AtomicReference) this.silver).get();
        if (obj instanceof AbstractC0508f) {
            ((AbstractC0508f) obj).getClass();
            return new be.j(1, null);
        }
        return be.h.charlie(obj);
    }

    @Override // androidx.camera.core.impl.A
    public void echo(az azVar) {
        synchronized (this.red) {
            S s3 = (S) ((HashMap) this.teal).remove(azVar);
            if (s3 != null) {
                s3.red.set(false);
                ((CopyOnWriteArraySet) this.white).remove(s3);
            }
        }
    }

    @Override // androidx.camera.core.impl.A
    public void kilo(Executor executor, az azVar) {
        S s3;
        synchronized (this.red) {
            S s9 = (S) ((HashMap) this.teal).remove(azVar);
            if (s9 != null) {
                s9.red.set(false);
                ((CopyOnWriteArraySet) this.white).remove(s9);
            }
            s3 = new S((AtomicReference) this.silver, executor, azVar);
            ((HashMap) this.teal).put(azVar, s3);
            ((CopyOnWriteArraySet) this.white).add(s3);
        }
        s3.alpha(0);
    }

    public ax(C0058p c0058p, T.r rVar, int i4, J.e eVar, J.e eVar2, boolean z2) {
        this.white = c0058p;
        this.red = rVar;
        this.alpha = i4;
        this.silver = eVar;
        this.teal = eVar2;
        this.purple = z2;
    }
}
