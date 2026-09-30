package Wb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {
    public static final n alpha;
    public static final n purple;
    public static final n red;
    public static final n silver;
    public static final n teal;
    public static final /* synthetic */ n[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Wb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Wb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Wb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Wb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Wb.n, java.lang.Enum] */
    static {
        ?? r5 = new Enum("BUILDING", 0);
        alpha = r5;
        ?? r62 = new Enum("BUSINESS", 1);
        purple = r62;
        ?? r72 = new Enum("VILLA", 2);
        red = r72;
        ?? r82 = new Enum("COMPOUND", 3);
        silver = r82;
        ?? r92 = new Enum("OTHER", 4);
        teal = r92;
        n[] nVarArr = {r5, r62, r72, r82, r92};
        white = nVarArr;
        AbstractC2708l7.bravo(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) white.clone();
    }
}
