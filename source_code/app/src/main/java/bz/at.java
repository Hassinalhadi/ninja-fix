package bz;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class at {
    public static final at alpha;
    public static final /* synthetic */ at[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, bz.at] */
    static {
        ?? r22 = new Enum("Restart", 0);
        alpha = r22;
        at[] atVarArr = {r22, new Enum("Reverse", 1)};
        purple = atVarArr;
        AbstractC2708l7.bravo(atVarArr);
    }

    public static at valueOf(String str) {
        return (at) Enum.valueOf(at.class, str);
    }

    public static at[] values() {
        return (at[]) purple.clone();
    }
}
