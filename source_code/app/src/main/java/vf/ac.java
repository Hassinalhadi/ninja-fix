package vf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ac {
    public static final ac alpha;
    public static final ac purple;
    public static final ac red;
    public static final ac silver;
    public static final /* synthetic */ ac[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, vf.ac] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, vf.ac] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, vf.ac] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, vf.ac] */
    static {
        ?? r4 = new Enum("DEFAULT", 0);
        alpha = r4;
        ?? r5 = new Enum("LAZY", 1);
        purple = r5;
        ?? r62 = new Enum("ATOMIC", 2);
        red = r62;
        ?? r72 = new Enum("UNDISPATCHED", 3);
        silver = r72;
        ac[] acVarArr = {r4, r5, r62, r72};
        teal = acVarArr;
        AbstractC2708l7.bravo(acVarArr);
    }

    public static ac valueOf(String str) {
        return (ac) Enum.valueOf(ac.class, str);
    }

    public static ac[] values() {
        return (ac[]) teal.clone();
    }
}
