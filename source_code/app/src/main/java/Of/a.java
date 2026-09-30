package Of;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final a alpha;
    public static final a purple;
    public static final /* synthetic */ a[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Of.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Of.a] */
    static {
        ?? r32 = new Enum("NONE", 0);
        alpha = r32;
        Enum r4 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r5 = new Enum("POLYMORPHIC", 2);
        purple = r5;
        a[] aVarArr = {r32, r4, r5};
        red = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) red.clone();
    }
}
