package Cf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final b alpha;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final /* synthetic */ b[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Cf.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Cf.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Cf.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Cf.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Cf.b] */
    static {
        ?? r5 = new Enum("CPU_ACQUIRED", 0);
        alpha = r5;
        ?? r62 = new Enum("BLOCKING", 1);
        purple = r62;
        ?? r72 = new Enum("PARKING", 2);
        red = r72;
        ?? r82 = new Enum("DORMANT", 3);
        silver = r82;
        ?? r92 = new Enum("TERMINATED", 4);
        teal = r92;
        b[] bVarArr = {r5, r62, r72, r82, r92};
        white = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) white.clone();
    }
}
