package Od;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final a alpha;
    public static final a purple;
    public static final a red;
    public static final /* synthetic */ a[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Od.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Od.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Od.a] */
    static {
        ?? r32 = new Enum("COROUTINE_SUSPENDED", 0);
        alpha = r32;
        ?? r4 = new Enum("UNDECIDED", 1);
        purple = r4;
        ?? r5 = new Enum("RESUMED", 2);
        red = r5;
        a[] aVarArr = {r32, r4, r5};
        silver = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) silver.clone();
    }
}
