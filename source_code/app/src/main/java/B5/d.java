package B5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d alpha;
    public static final d purple;
    public static final d red;
    public static final /* synthetic */ d[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, B5.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, B5.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, B5.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        alpha = r32;
        ?? r4 = new Enum("VERY_LOW", 1);
        purple = r4;
        ?? r5 = new Enum("HIGHEST", 2);
        red = r5;
        silver = new d[]{r32, r4, r5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) silver.clone();
    }
}
