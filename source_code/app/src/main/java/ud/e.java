package ud;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Id.d alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z2;
        Id.a aVar;
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            z2 = Boolean.parseBoolean(property);
        } else {
            z2 = false;
        }
        if (z2) {
            aVar = new Object();
        } else {
            aVar = new Id.a(4096, 3);
        }
        alpha = aVar;
    }
}
