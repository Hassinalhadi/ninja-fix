package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1927a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1927a f12874a;
    public static final EnumC1927a alpha;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1927a[] f12875b;
    public static final EnumC1927a purple;
    public static final EnumC1927a red;
    public static final EnumC1927a silver;
    public static final EnumC1927a teal;
    public static final EnumC1927a white;
    public static final EnumC1927a yellow;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1927a EF6;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j1.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j1.a] */
    static {
        Enum r62 = new Enum("CLEAR", 0);
        Enum r72 = new Enum("SRC", 1);
        Enum r5 = new Enum("DST", 2);
        ?? r4 = new Enum("SRC_OVER", 3);
        alpha = r4;
        Enum r32 = new Enum("DST_OVER", 4);
        Enum r22 = new Enum("SRC_IN", 5);
        Enum r12 = new Enum("DST_IN", 6);
        Enum r02 = new Enum("SRC_OUT", 7);
        Enum r15 = new Enum("DST_OUT", 8);
        ?? r14 = new Enum("SRC_ATOP", 9);
        purple = r14;
        Enum r13 = new Enum("DST_ATOP", 10);
        Enum r122 = new Enum("XOR", 11);
        ?? r11 = new Enum("PLUS", 12);
        red = r11;
        ?? r10 = new Enum("MODULATE", 13);
        silver = r10;
        ?? r92 = new Enum("SCREEN", 14);
        teal = r92;
        ?? r03 = new Enum("OVERLAY", 15);
        white = r03;
        ?? r16 = new Enum("DARKEN", 16);
        yellow = r16;
        ?? r04 = new Enum("LIGHTEN", 17);
        f12874a = r04;
        f12875b = new EnumC1927a[]{r62, r72, r5, r4, r32, r22, r12, r02, r15, r14, r13, r122, r11, r10, r92, r03, r16, r04, new Enum("COLOR_DODGE", 18), new Enum("COLOR_BURN", 19), new Enum("HARD_LIGHT", 20), new Enum("SOFT_LIGHT", 21), new Enum("DIFFERENCE", 22), new Enum("EXCLUSION", 23), new Enum("MULTIPLY", 24), new Enum("HUE", 25), new Enum("SATURATION", 26), new Enum("COLOR", 27), new Enum("LUMINOSITY", 28)};
    }

    public static EnumC1927a valueOf(String str) {
        return (EnumC1927a) Enum.valueOf(EnumC1927a.class, str);
    }

    public static EnumC1927a[] values() {
        return (EnumC1927a[]) f12875b.clone();
    }
}
