package s6;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class ay extends t6.X1 {
    public static final Unsafe alpha;
    public static final long bravo;
    public static final long charlie;
    public static final long delta;
    public static final long echo;
    public static final long foxtrot;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            charlie = unsafe.objectFieldOffset(A.class.getDeclaredField("red"));
            bravo = unsafe.objectFieldOffset(A.class.getDeclaredField("purple"));
            delta = unsafe.objectFieldOffset(A.class.getDeclaredField("alpha"));
            echo = unsafe.objectFieldOffset(az.class.getDeclaredField("alpha"));
            foxtrot = unsafe.objectFieldOffset(az.class.getDeclaredField("bravo"));
            alpha = unsafe;
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // t6.X1
    public final as bravo(A a6) {
        as asVar;
        as asVar2 = as.delta;
        do {
            asVar = a6.purple;
            if (asVar2 == asVar) {
                break;
            }
        } while (!foxtrot(a6, asVar, asVar2));
        return asVar;
    }

    @Override // t6.X1
    public final az charlie(A a6) {
        az azVar;
        az azVar2 = az.charlie;
        do {
            azVar = a6.red;
            if (azVar2 == azVar) {
                break;
            }
        } while (!hotel(a6, azVar, azVar2));
        return azVar;
    }

    @Override // t6.X1
    public final void delta(az azVar, az azVar2) {
        alpha.putObject(azVar, foxtrot, azVar2);
    }

    @Override // t6.X1
    public final void echo(az azVar, Thread thread) {
        alpha.putObject(azVar, echo, thread);
    }

    @Override // t6.X1
    public final boolean foxtrot(A a6, as asVar, as asVar2) {
        return C.alpha(alpha, a6, bravo, asVar, asVar2);
    }

    @Override // t6.X1
    public final boolean golf(A a6, Object obj, Object obj2) {
        return C.alpha(alpha, a6, delta, obj, obj2);
    }

    @Override // t6.X1
    public final boolean hotel(A a6, az azVar, az azVar2) {
        return C.alpha(alpha, a6, charlie, azVar, azVar2);
    }
}
