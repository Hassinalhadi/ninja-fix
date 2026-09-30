package q0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class as {
    public static final as alpha;
    public static final as purple;
    public static final /* synthetic */ as[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, q0.as] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q0.as] */
    static {
        ?? r22 = new Enum("Min", 0);
        alpha = r22;
        ?? r32 = new Enum("Max", 1);
        purple = r32;
        as[] asVarArr = {r22, r32};
        red = asVarArr;
        AbstractC2708l7.bravo(asVarArr);
    }

    public static as valueOf(String str) {
        return (as) Enum.valueOf(as.class, str);
    }

    public static as[] values() {
        return (as[]) red.clone();
    }
}
