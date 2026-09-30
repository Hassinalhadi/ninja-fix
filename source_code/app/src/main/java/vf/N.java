package vf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class N implements D {
    public static final /* synthetic */ AtomicIntegerFieldUpdater purple = AtomicIntegerFieldUpdater.newUpdater(N.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater red = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater silver = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final T alpha;

    public N(T t5, Throwable th) {
        this.alpha = t5;
        this._rootCause$volatile = th;
    }

    public final void alpha(Throwable th) {
        Throwable bravo = bravo();
        if (bravo == null) {
            red.set(this, th);
            return;
        }
        if (th != bravo) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = silver;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable bravo() {
        return (Throwable) red.get(this);
    }

    public final boolean charlie() {
        if (bravo() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList delta(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = silver;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable bravo = bravo();
        if (bravo != null) {
            arrayList.add(0, bravo);
        }
        if (th != null && !Intrinsics.areEqual(th, bravo)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, ad.hotel);
        return arrayList;
    }

    @Override // vf.D
    public final boolean echo() {
        if (bravo() == null) {
            return true;
        }
        return false;
    }

    @Override // vf.D
    public final T foxtrot() {
        return this.alpha;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(charlie());
        sb2.append(", completing=");
        boolean z2 = true;
        if (purple.get(this) != 1) {
            z2 = false;
        }
        sb2.append(z2);
        sb2.append(", rootCause=");
        sb2.append(bravo());
        sb2.append(", exceptions=");
        sb2.append(silver.get(this));
        sb2.append(", list=");
        sb2.append(this.alpha);
        sb2.append(']');
        return sb2.toString();
    }
}
