package vf;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static final ThreadLocal alpha = new ThreadLocal();

    public static ay alpha() {
        ThreadLocal threadLocal = alpha;
        ay ayVar = (ay) threadLocal.get();
        if (ayVar == null) {
            C3203g c3203g = new C3203g(Thread.currentThread());
            threadLocal.set(c3203g);
            return c3203g;
        }
        return ayVar;
    }
}
