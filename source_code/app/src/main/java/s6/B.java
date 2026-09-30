package s6;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class B {
    public static /* synthetic */ boolean alpha(Unsafe unsafe, A a6, long j5, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(a6, j5, obj, obj2)) {
            if (unsafe.getObject(a6, j5) != obj) {
                return false;
            }
        }
        return true;
    }
}
