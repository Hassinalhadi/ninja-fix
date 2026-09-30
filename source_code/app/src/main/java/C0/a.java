package C0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a alpha;
    public static final a purple;
    public static final /* synthetic */ a[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, C0.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, C0.a] */
    static {
        ?? r32 = new Enum("On", 0);
        alpha = r32;
        ?? r4 = new Enum("Off", 1);
        purple = r4;
        a[] aVarArr = {r32, r4, new Enum("Indeterminate", 2)};
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
