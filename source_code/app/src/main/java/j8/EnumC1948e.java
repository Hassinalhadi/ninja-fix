package j8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1948e {
    public static final EnumC1948e alpha;
    public static final EnumC1948e purple;
    public static final EnumC1948e red;
    public static final /* synthetic */ EnumC1948e[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j8.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j8.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j8.e] */
    static {
        ?? r32 = new Enum("BAD_CONFIG", 0);
        alpha = r32;
        ?? r4 = new Enum("UNAVAILABLE", 1);
        purple = r4;
        ?? r5 = new Enum("TOO_MANY_REQUESTS", 2);
        red = r5;
        silver = new EnumC1948e[]{r32, r4, r5};
    }

    public static EnumC1948e valueOf(String str) {
        return (EnumC1948e) Enum.valueOf(EnumC1948e.class, str);
    }

    public static EnumC1948e[] values() {
        return (EnumC1948e[]) silver.clone();
    }
}
