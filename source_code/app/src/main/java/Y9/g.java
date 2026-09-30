package Y9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    public static final g alpha;
    public static final g purple;
    public static final g red;
    public static final /* synthetic */ g[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y9.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Y9.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Y9.g, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CONTINUE", 0);
        alpha = r32;
        ?? r4 = new Enum("DEFER", 1);
        purple = r4;
        ?? r5 = new Enum("STOP", 2);
        red = r5;
        g[] gVarArr = {r32, r4, r5};
        silver = gVarArr;
        AbstractC2708l7.bravo(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) silver.clone();
    }
}
