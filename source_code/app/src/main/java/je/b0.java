package je;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class b0 {
    public final WeakReference alpha;
    public final int bravo;

    public b0(ClassLoader classLoader) {
        this.alpha = new WeakReference(classLoader);
        this.bravo = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b0) && this.alpha.get() == ((b0) obj).alpha.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.alpha.get();
        if (classLoader != null && (obj = classLoader.toString()) != null) {
            return obj;
        }
        return "<null>";
    }
}
