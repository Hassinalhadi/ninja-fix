package B3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a alpha;
    public static final a purple;
    public static final a red;
    public static final a silver;
    public static final a teal;
    public static final /* synthetic */ a[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, B3.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, B3.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, B3.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, B3.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, B3.a] */
    static {
        ?? r5 = new Enum("EMPTY", 0);
        alpha = r5;
        ?? r62 = new Enum("HAS_IBAN_TOKEN", 1);
        purple = r62;
        ?? r72 = new Enum("BAD_FORMAT", 2);
        red = r72;
        ?? r82 = new Enum("BAD_LENGTH_FOR_COUNTRY", 3);
        silver = r82;
        ?? r92 = new Enum("BAD_CHECKSUM", 4);
        teal = r92;
        a[] aVarArr = {r5, r62, r72, r82, r92};
        white = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) white.clone();
    }
}
