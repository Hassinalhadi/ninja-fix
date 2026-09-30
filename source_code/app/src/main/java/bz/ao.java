package bz;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ao {
    public static final ao alpha;
    public static final /* synthetic */ ao[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, bz.ao] */
    static {
        ?? r32 = new Enum("Default", 0);
        alpha = r32;
        ao[] aoVarArr = {r32, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
        purple = aoVarArr;
        AbstractC2708l7.bravo(aoVarArr);
    }

    public static ao valueOf(String str) {
        return (ao) Enum.valueOf(ao.class, str);
    }

    public static ao[] values() {
        return (ao[]) purple.clone();
    }
}
