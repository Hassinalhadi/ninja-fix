package oe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: oe.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2239j {
    public static final EnumC2239j alpha;
    public static final EnumC2239j purple;
    public static final EnumC2239j red;
    public static final EnumC2239j silver;
    public static final /* synthetic */ EnumC2239j[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [oe.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [oe.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [oe.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [oe.j, java.lang.Enum] */
    static {
        ?? r4 = new Enum("HIDDEN", 0);
        alpha = r4;
        ?? r5 = new Enum("VISIBLE", 1);
        purple = r5;
        ?? r62 = new Enum("NOT_CONSIDERED", 2);
        red = r62;
        ?? r72 = new Enum("DROP", 3);
        silver = r72;
        teal = new EnumC2239j[]{r4, r5, r62, r72};
    }

    public static EnumC2239j valueOf(String str) {
        return (EnumC2239j) Enum.valueOf(EnumC2239j.class, str);
    }

    public static EnumC2239j[] values() {
        return (EnumC2239j[]) teal.clone();
    }
}
