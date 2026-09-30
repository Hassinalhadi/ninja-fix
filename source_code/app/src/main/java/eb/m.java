package eb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    public static final m alpha;
    public static final m purple;
    public static final /* synthetic */ m[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [eb.m, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eb.m, java.lang.Enum] */
    static {
        Enum r32 = new Enum("Auto", 0);
        ?? r4 = new Enum("Pills", 1);
        alpha = r4;
        ?? r5 = new Enum("Arcs", 2);
        purple = r5;
        m[] mVarArr = {r32, r4, r5};
        red = mVarArr;
        AbstractC2708l7.bravo(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) red.clone();
    }
}
