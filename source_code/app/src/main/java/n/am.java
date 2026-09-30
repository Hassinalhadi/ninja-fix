package n;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class am {
    public static final am alpha;
    public static final am purple;
    public static final am red;
    public static final /* synthetic */ am[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, n.am] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, n.am] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n.am] */
    static {
        ?? r32 = new Enum("None", 0);
        alpha = r32;
        ?? r4 = new Enum("Selection", 1);
        purple = r4;
        ?? r5 = new Enum("Cursor", 2);
        red = r5;
        am[] amVarArr = {r32, r4, r5};
        silver = amVarArr;
        AbstractC2708l7.bravo(amVarArr);
    }

    public static am valueOf(String str) {
        return (am) Enum.valueOf(am.class, str);
    }

    public static am[] values() {
        return (am[]) silver.clone();
    }
}
