package oc;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    public static final g alpha;
    public static final g purple;
    public static final g red;
    public static final g silver;
    public static final g teal;
    public static final g white;
    public static final /* synthetic */ g[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, oc.g] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, oc.g] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, oc.g] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, oc.g] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, oc.g] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, oc.g] */
    static {
        ?? r62 = new Enum("UNLIMITED", 0);
        alpha = r62;
        ?? r72 = new Enum("NONE_LEFT", 1);
        purple = r72;
        ?? r82 = new Enum("ONE_LEFT", 2);
        red = r82;
        ?? r92 = new Enum("FEW_LEFT", 3);
        silver = r92;
        ?? r10 = new Enum("ALL_AVAILABLE", 4);
        teal = r10;
        ?? r11 = new Enum("SOME_LEFT", 5);
        white = r11;
        g[] gVarArr = {r62, r72, r82, r92, r10, r11};
        yellow = gVarArr;
        AbstractC2708l7.bravo(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) yellow.clone();
    }
}
