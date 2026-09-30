package Ud;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final b alpha;
    public static final b purple;
    public static final b red;
    public static final /* synthetic */ b[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Ud.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ud.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Ud.b] */
    static {
        ?? r4 = new Enum("PRESENT", 0);
        alpha = r4;
        ?? r5 = new Enum("ABSENT", 1);
        purple = r5;
        ?? r62 = new Enum("PRESENT_OPTIONAL", 2);
        red = r62;
        b[] bVarArr = {r4, r5, r62, new Enum("ABSENT_OPTIONAL", 3)};
        silver = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) silver.clone();
    }
}
