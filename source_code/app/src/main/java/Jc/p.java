package Jc;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p {
    public static final p alpha;
    public static final p purple;
    public static final /* synthetic */ p[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Jc.p] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Jc.p] */
    static {
        ?? r22 = new Enum("ACTIVE", 0);
        alpha = r22;
        ?? r32 = new Enum("HISTORY", 1);
        purple = r32;
        p[] pVarArr = {r22, r32};
        red = pVarArr;
        AbstractC2708l7.bravo(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) red.clone();
    }
}
