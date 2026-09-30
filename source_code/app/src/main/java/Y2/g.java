package Y2;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g alpha;
    public static final g purple;
    public static final /* synthetic */ g[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Y2.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Y2.g] */
    static {
        ?? r22 = new Enum("FILL", 0);
        alpha = r22;
        ?? r32 = new Enum("FIT", 1);
        purple = r32;
        g[] gVarArr = {r22, r32};
        red = gVarArr;
        AbstractC2708l7.bravo(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) red.clone();
    }
}
