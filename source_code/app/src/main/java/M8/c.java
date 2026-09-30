package M8;

/* loaded from: classes2.dex */
public final class c implements b, L8.a {
    public final Object alpha;

    public c(Object obj) {
        this.alpha = obj;
    }

    public static c alpha(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // Kd.a
    public final Object get() {
        return this.alpha;
    }
}
