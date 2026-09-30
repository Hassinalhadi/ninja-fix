package F;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0107f2 {
    public static final EnumC0107f2 alpha;
    public static final EnumC0107f2 purple;
    public static final EnumC0107f2 red;
    public static final /* synthetic */ EnumC0107f2[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, F.f2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, F.f2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, F.f2] */
    static {
        ?? r32 = new Enum("Hidden", 0);
        alpha = r32;
        ?? r4 = new Enum("Expanded", 1);
        purple = r4;
        ?? r5 = new Enum("PartiallyExpanded", 2);
        red = r5;
        silver = new EnumC0107f2[]{r32, r4, r5};
    }

    public static EnumC0107f2 valueOf(String str) {
        return (EnumC0107f2) Enum.valueOf(EnumC0107f2.class, str);
    }

    public static EnumC0107f2[] values() {
        return (EnumC0107f2[]) silver.clone();
    }
}
