package Pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ae {
    public static final ae alpha;
    public static final ae purple;
    public static final /* synthetic */ ae[] red;

    /* JADX INFO: Fake field, exist only in values array */
    ae EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Pe.ae] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Pe.ae] */
    static {
        Enum r32 = new Enum("PRETTY", 0);
        ?? r4 = new Enum("DEBUG", 1);
        alpha = r4;
        ?? r5 = new Enum("NONE", 2);
        purple = r5;
        red = new ae[]{r32, r4, r5};
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) red.clone();
    }
}
