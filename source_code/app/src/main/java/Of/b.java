package Of;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final b alpha;
    public static final b purple;
    public static final /* synthetic */ b[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Of.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Of.b] */
    static {
        ?? r32 = new Enum("WHITESPACE_SEPARATED", 0);
        alpha = r32;
        ?? r4 = new Enum("ARRAY_WRAPPED", 1);
        purple = r4;
        b[] bVarArr = {r32, r4, new Enum("AUTO_DETECT", 2)};
        red = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) red.clone();
    }
}
