package O2;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    public static final k alpha;
    public static final /* synthetic */ k[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, O2.k] */
    static {
        Enum r32 = new Enum("IGNORE", 0);
        ?? r4 = new Enum("RESPECT_PERFORMANCE", 1);
        alpha = r4;
        k[] kVarArr = {r32, r4, new Enum("RESPECT_ALL", 2)};
        purple = kVarArr;
        AbstractC2708l7.bravo(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) purple.clone();
    }
}
