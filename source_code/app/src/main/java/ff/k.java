package ff;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {
    public static final k alpha;
    public static final k purple;
    public static final k red;
    public static final /* synthetic */ k[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ff.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ff.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ff.k, java.lang.Enum] */
    static {
        ?? r32 = new Enum("NOT_COMPUTED", 0);
        alpha = r32;
        ?? r4 = new Enum("COMPUTING", 1);
        purple = r4;
        ?? r5 = new Enum("RECURSION_WAS_DETECTED", 2);
        red = r5;
        silver = new k[]{r32, r4, r5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) silver.clone();
    }
}
