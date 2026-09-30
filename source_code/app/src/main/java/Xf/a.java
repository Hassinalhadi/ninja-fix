package Xf;

import s6.AbstractC2708l7;
import u8.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final b alpha;
    public static final /* synthetic */ a[] purple;
    public static final /* synthetic */ Qd.b red;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a[] aVarArr = {new Enum("ZERO", 0), new Enum("ONE", 1), new Enum("TWO", 2), new Enum("FEW", 3), new Enum("MANY", 4), new Enum("OTHER", 5)};
        purple = aVarArr;
        red = AbstractC2708l7.bravo(aVarArr);
        alpha = new b(12);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) purple.clone();
    }
}
