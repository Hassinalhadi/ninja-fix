package bl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    public static final f alpha;
    public static final f purple;
    public static final f red;
    public static final /* synthetic */ f[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, bl.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, bl.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, bl.f] */
    static {
        ?? r32 = new Enum("UNKNOWN", 0);
        alpha = r32;
        ?? r4 = new Enum("DEFAULT", 1);
        purple = r4;
        ?? r5 = new Enum("YUV", 2);
        red = r5;
        silver = new f[]{r32, r4, r5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) silver.clone();
    }
}
