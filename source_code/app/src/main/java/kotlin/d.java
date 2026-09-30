package kotlin;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    public static final d alpha;
    public static final /* synthetic */ d[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.d, java.lang.Enum] */
    static {
        ?? r32 = new Enum("WARNING", 0);
        alpha = r32;
        d[] dVarArr = {r32, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
        purple = dVarArr;
        AbstractC2708l7.bravo(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) purple.clone();
    }
}
