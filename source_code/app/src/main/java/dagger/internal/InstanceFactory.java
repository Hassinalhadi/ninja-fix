package dagger.internal;

/* loaded from: classes2.dex */
public final class InstanceFactory<T> implements b {
    public static final InstanceFactory bravo = new InstanceFactory(null);
    public final Object alpha;

    public InstanceFactory(Object obj) {
        this.alpha = obj;
    }

    public static InstanceFactory alpha(Object obj) {
        if (obj != null) {
            return new InstanceFactory(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static InstanceFactory bravo(Object obj) {
        if (obj == null) {
            return bravo;
        }
        return new InstanceFactory(obj);
    }

    @Override // Kd.a
    public final Object get() {
        return this.alpha;
    }
}
