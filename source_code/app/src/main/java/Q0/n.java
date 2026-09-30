package Q0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    public static final n alpha;
    public static final n purple;
    public static final /* synthetic */ n[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Q0.n] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Q0.n] */
    static {
        ?? r22 = new Enum("Ltr", 0);
        alpha = r22;
        ?? r32 = new Enum("Rtl", 1);
        purple = r32;
        n[] nVarArr = {r22, r32};
        red = nVarArr;
        AbstractC2708l7.bravo(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) red.clone();
    }
}
