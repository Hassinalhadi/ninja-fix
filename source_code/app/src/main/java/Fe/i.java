package Fe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    public static final i alpha;
    public static final i purple;
    public static final i red;
    public static final /* synthetic */ i[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Fe.i] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Fe.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Fe.i] */
    static {
        ?? r32 = new Enum("FORCE_FLEXIBILITY", 0);
        alpha = r32;
        ?? r4 = new Enum("NULLABLE", 1);
        purple = r4;
        ?? r5 = new Enum("NOT_NULL", 2);
        red = r5;
        silver = new i[]{r32, r4, r5};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) silver.clone();
    }
}
