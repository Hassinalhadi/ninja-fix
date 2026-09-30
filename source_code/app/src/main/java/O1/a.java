package O1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f1880a;
    public static final a alpha;
    public static final a purple;
    public static final a red;
    public static final a silver;
    public static final a teal;
    public static final a white;
    public static final a yellow;

    /* JADX INFO: Fake field, exist only in values array */
    a EF9;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r14v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [O1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [O1.a, java.lang.Enum] */
    static {
        Enum r92 = new Enum("PENALTY_LOG", 0);
        Enum r10 = new Enum("PENALTY_DEATH", 1);
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        alpha = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        purple = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        red = r13;
        ?? r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        silver = r14;
        ?? r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        teal = r15;
        ?? r32 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        white = r32;
        ?? r22 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        yellow = r22;
        f1880a = new a[]{r92, r10, r11, r12, r13, r14, r15, r32, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1880a.clone();
    }
}
