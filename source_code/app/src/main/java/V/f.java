package V;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    public static final f alpha;
    public static final f purple;
    public static final /* synthetic */ f[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, V.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, V.f] */
    static {
        ?? r22 = new Enum("VIEW_APPEAR", 0);
        alpha = r22;
        ?? r32 = new Enum("VIEW_DISAPPEAR", 1);
        purple = r32;
        f[] fVarArr = {r22, r32};
        red = fVarArr;
        AbstractC2708l7.bravo(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) red.clone();
    }
}
