package kotlin.time;

/* loaded from: classes2.dex */
public abstract class j {
    public static final long alpha = System.nanoTime();

    public static long alpha() {
        return System.nanoTime() - alpha;
    }
}
