package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {
    public static final n alpha;
    public static final n purple;
    public static final n red;
    public static final /* synthetic */ n[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [qe.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [qe.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qe.n, java.lang.Enum] */
    static {
        ?? r32 = new Enum("RUNTIME", 0);
        alpha = r32;
        ?? r4 = new Enum("BINARY", 1);
        purple = r4;
        ?? r5 = new Enum("SOURCE", 2);
        red = r5;
        silver = new n[]{r32, r4, r5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) silver.clone();
    }
}
