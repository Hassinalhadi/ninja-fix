package L9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    public static final h alpha;
    public static final h purple;
    public static final h red;
    public static final h silver;
    public static final /* synthetic */ h[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, L9.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, L9.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, L9.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, L9.h] */
    static {
        ?? r4 = new Enum("ALLOW_ALL_THE_TIME", 0);
        alpha = r4;
        ?? r5 = new Enum("WHILE_USING_APP", 1);
        purple = r5;
        ?? r62 = new Enum("ASK_EVERY_TIME", 2);
        red = r62;
        ?? r72 = new Enum("DENIED", 3);
        silver = r72;
        h[] hVarArr = {r4, r5, r62, r72};
        teal = hVarArr;
        AbstractC2708l7.bravo(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) teal.clone();
    }
}
