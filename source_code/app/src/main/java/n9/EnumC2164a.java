package n9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2164a {
    public static final EnumC2164a alpha;
    public static final EnumC2164a purple;
    public static final EnumC2164a red;
    public static final EnumC2164a silver;
    public static final EnumC2164a teal;
    public static final /* synthetic */ EnumC2164a[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, n9.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, n9.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, n9.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, n9.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, n9.a] */
    static {
        ?? r5 = new Enum("NOT_DETECTED", 0);
        alpha = r5;
        ?? r62 = new Enum("UP", 1);
        purple = r62;
        ?? r72 = new Enum("DOWN", 2);
        red = r72;
        ?? r82 = new Enum("LEFT", 3);
        silver = r82;
        ?? r92 = new Enum("RIGHT", 4);
        teal = r92;
        white = new EnumC2164a[]{r5, r62, r72, r82, r92};
    }

    public static EnumC2164a valueOf(String str) {
        return (EnumC2164a) Enum.valueOf(EnumC2164a.class, str);
    }

    public static EnumC2164a[] values() {
        return (EnumC2164a[]) white.clone();
    }
}
