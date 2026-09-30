package xe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xe.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3339b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3339b f14130a;
    public static final EnumC3339b alpha;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3339b[] f14131b;
    public static final EnumC3339b purple;
    public static final EnumC3339b red;
    public static final EnumC3339b silver;
    public static final EnumC3339b teal;
    public static final EnumC3339b white;
    public static final EnumC3339b yellow;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3339b EF6;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xe.b] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, xe.b] */
    static {
        Enum r62 = new Enum("FROM_IDE", 0);
        Enum r72 = new Enum("FROM_BACKEND", 1);
        Enum r5 = new Enum("FROM_TEST", 2);
        ?? r4 = new Enum("FROM_BUILTINS", 3);
        alpha = r4;
        Enum r32 = new Enum("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        Enum r22 = new Enum("WHEN_CHECK_OVERRIDES", 5);
        Enum r12 = new Enum("FOR_SCRIPT", 6);
        ?? r02 = new Enum("FROM_REFLECTION", 7);
        purple = r02;
        Enum r15 = new Enum("WHEN_RESOLVE_DECLARATION", 8);
        Enum r14 = new Enum("WHEN_GET_DECLARATION_SCOPE", 9);
        Enum r13 = new Enum("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        ?? r122 = new Enum("FOR_ALREADY_TRACKED", 11);
        red = r122;
        ?? r11 = new Enum("WHEN_GET_ALL_DESCRIPTORS", 12);
        silver = r11;
        Enum r10 = new Enum("WHEN_TYPING", 13);
        ?? r92 = new Enum("WHEN_GET_SUPER_MEMBERS", 14);
        teal = r92;
        ?? r03 = new Enum("FOR_NON_TRACKED_SCOPE", 15);
        white = r03;
        Enum r16 = new Enum("FROM_SYNTHETIC_SCOPE", 16);
        ?? r04 = new Enum("FROM_DESERIALIZATION", 17);
        yellow = r04;
        ?? r17 = new Enum("FROM_JAVA_LOADER", 18);
        f14130a = r17;
        f14131b = new EnumC3339b[]{r62, r72, r5, r4, r32, r22, r12, r02, r15, r14, r13, r122, r11, r10, r92, r03, r16, r04, r17, new Enum("WHEN_GET_LOCAL_VARIABLE", 19), new Enum("WHEN_FIND_BY_FQNAME", 20), new Enum("WHEN_GET_COMPANION_OBJECT", 21), new Enum("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static EnumC3339b valueOf(String str) {
        return (EnumC3339b) Enum.valueOf(EnumC3339b.class, str);
    }

    public static EnumC3339b[] values() {
        return (EnumC3339b[]) f14131b.clone();
    }
}
