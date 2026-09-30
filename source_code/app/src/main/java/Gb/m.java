package Gb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    public static final m alpha;
    public static final m purple;
    public static final m red;
    public static final /* synthetic */ m[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Gb.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Gb.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Gb.m] */
    static {
        ?? r32 = new Enum("ALL", 0);
        alpha = r32;
        ?? r4 = new Enum("MESSAGES", 1);
        purple = r4;
        ?? r5 = new Enum("ALERTS", 2);
        red = r5;
        m[] mVarArr = {r32, r4, r5};
        silver = mVarArr;
        AbstractC2708l7.bravo(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) silver.clone();
    }
}
