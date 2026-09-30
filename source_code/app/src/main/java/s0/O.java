package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class O {
    public static final O alpha;
    public static final O purple;
    public static final /* synthetic */ O[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, s0.O] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, s0.O] */
    static {
        ?? r22 = new Enum("Width", 0);
        alpha = r22;
        ?? r32 = new Enum("Height", 1);
        purple = r32;
        O[] oArr = {r22, r32};
        red = oArr;
        AbstractC2708l7.bravo(oArr);
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) red.clone();
    }
}
