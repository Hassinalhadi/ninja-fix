package n;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class al {
    public static final al alpha;
    public static final al purple;
    public static final al red;
    public static final /* synthetic */ al[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, n.al] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, n.al] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n.al] */
    static {
        ?? r32 = new Enum("Cursor", 0);
        alpha = r32;
        ?? r4 = new Enum("SelectionStart", 1);
        purple = r4;
        ?? r5 = new Enum("SelectionEnd", 2);
        red = r5;
        al[] alVarArr = {r32, r4, r5};
        silver = alVarArr;
        AbstractC2708l7.bravo(alVarArr);
    }

    public static al valueOf(String str) {
        return (al) Enum.valueOf(al.class, str);
    }

    public static al[] values() {
        return (al[]) silver.clone();
    }
}
