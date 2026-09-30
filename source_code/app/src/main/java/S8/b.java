package S8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2048a;
    public static final b alpha;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2049b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2050c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f2051d;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final b white;
    public static final b yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, S8.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, S8.b] */
    static {
        ?? r10 = new Enum("BEGIN_ARRAY", 0);
        alpha = r10;
        ?? r11 = new Enum("END_ARRAY", 1);
        purple = r11;
        ?? r12 = new Enum("BEGIN_OBJECT", 2);
        red = r12;
        ?? r13 = new Enum("END_OBJECT", 3);
        silver = r13;
        ?? r14 = new Enum("NAME", 4);
        teal = r14;
        ?? r15 = new Enum("STRING", 5);
        white = r15;
        ?? r5 = new Enum("NUMBER", 6);
        yellow = r5;
        ?? r4 = new Enum("BOOLEAN", 7);
        f2048a = r4;
        ?? r32 = new Enum("NULL", 8);
        f2049b = r32;
        ?? r22 = new Enum("END_DOCUMENT", 9);
        f2050c = r22;
        f2051d = new b[]{r10, r11, r12, r13, r14, r15, r5, r4, r32, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2051d.clone();
    }
}
