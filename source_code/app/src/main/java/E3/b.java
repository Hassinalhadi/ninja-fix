package E3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    public static final b alpha;
    public static final b purple;
    public static final b red;
    public static final /* synthetic */ b[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [E3.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [E3.b, java.lang.Enum] */
    static {
        ?? r22 = new Enum("PREFER_ARGB_8888", 0);
        alpha = r22;
        ?? r32 = new Enum("PREFER_RGB_565", 1);
        purple = r32;
        silver = new b[]{r22, r32};
        red = r22;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) silver.clone();
    }
}
