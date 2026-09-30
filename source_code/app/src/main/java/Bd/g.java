package Bd;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    public static final u8.b alpha;
    public static final /* synthetic */ g[] purple;
    public static final /* synthetic */ Qd.b red;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        g[] gVarArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        purple = gVarArr;
        red = AbstractC2708l7.bravo(gVarArr);
        alpha = new u8.b(1);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) purple.clone();
    }
}
