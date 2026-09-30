package K8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    public static final d alpha;
    public static final d purple;
    public static final /* synthetic */ d[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [K8.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [K8.d, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CRASHLYTICS", 0);
        alpha = r32;
        ?? r4 = new Enum("PERFORMANCE", 1);
        purple = r4;
        red = new d[]{r32, r4, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) red.clone();
    }
}
