package Kb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ b[] alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b[] bVarArr = {new Enum("QUICK", 0), new Enum("PERMISSION", 1), new Enum("SETTINGS", 2)};
        alpha = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) alpha.clone();
    }
}
