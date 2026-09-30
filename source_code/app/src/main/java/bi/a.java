package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a alpha;
    public static final /* synthetic */ a[] purple;

    /* JADX INFO: Fake field, exist only in values array */
    a EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, bi.a] */
    static {
        Enum r32 = new Enum("ENCODE_FAILED", 0);
        Enum r4 = new Enum("DECODE_FAILED", 1);
        ?? r5 = new Enum("UNKNOWN", 2);
        alpha = r5;
        purple = new a[]{r32, r4, r5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) purple.clone();
    }
}
