package Pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ad {
    public static final ad alpha;
    public static final ad purple;
    public static final ad red;
    public static final /* synthetic */ ad[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Pe.ad] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Pe.ad] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Pe.ad] */
    static {
        ?? r32 = new Enum("ALL", 0);
        alpha = r32;
        ?? r4 = new Enum("ONLY_NON_SYNTHESIZED", 1);
        purple = r4;
        ?? r5 = new Enum("NONE", 2);
        red = r5;
        silver = new ad[]{r32, r4, r5};
    }

    public static ad valueOf(String str) {
        return (ad) Enum.valueOf(ad.class, str);
    }

    public static ad[] values() {
        return (ad[]) silver.clone();
    }
}
