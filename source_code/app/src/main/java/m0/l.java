package m0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {
    public static final l alpha;
    public static final l purple;
    public static final l red;
    public static final /* synthetic */ l[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [m0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [m0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [m0.l, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Initial", 0);
        alpha = r32;
        ?? r4 = new Enum("Main", 1);
        purple = r4;
        ?? r5 = new Enum("Final", 2);
        red = r5;
        l[] lVarArr = {r32, r4, r5};
        silver = lVarArr;
        AbstractC2708l7.bravo(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) silver.clone();
    }
}
