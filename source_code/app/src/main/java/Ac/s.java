package Ac;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s {
    public static final s alpha;
    public static final s purple;
    public static final s red;
    public static final /* synthetic */ s[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ac.s] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Ac.s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ac.s] */
    static {
        ?? r32 = new Enum("ALL", 0);
        alpha = r32;
        ?? r4 = new Enum("ACTIVE", 1);
        purple = r4;
        ?? r5 = new Enum("UPCOMING", 2);
        red = r5;
        s[] sVarArr = {r32, r4, r5};
        silver = sVarArr;
        AbstractC2708l7.bravo(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) silver.clone();
    }
}
