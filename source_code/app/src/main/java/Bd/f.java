package Bd;

import r6.u;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    public static final u alpha;
    public static final /* synthetic */ f[] purple;
    public static final /* synthetic */ Qd.b red;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f[] fVarArr = {new Enum("JANUARY", 0), new Enum("FEBRUARY", 1), new Enum("MARCH", 2), new Enum("APRIL", 3), new Enum("MAY", 4), new Enum("JUNE", 5), new Enum("JULY", 6), new Enum("AUGUST", 7), new Enum("SEPTEMBER", 8), new Enum("OCTOBER", 9), new Enum("NOVEMBER", 10), new Enum("DECEMBER", 11)};
        purple = fVarArr;
        red = AbstractC2708l7.bravo(fVarArr);
        alpha = new u(1);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) purple.clone();
    }
}
