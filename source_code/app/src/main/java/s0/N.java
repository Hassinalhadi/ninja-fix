package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class N {
    public static final N alpha;
    public static final N purple;
    public static final /* synthetic */ N[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, s0.N] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, s0.N] */
    static {
        ?? r22 = new Enum("Min", 0);
        alpha = r22;
        ?? r32 = new Enum("Max", 1);
        purple = r32;
        N[] nArr = {r22, r32};
        red = nArr;
        AbstractC2708l7.bravo(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) red.clone();
    }
}
