package m0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v {
    public static final v alpha;
    public static final v purple;
    public static final v red;
    public static final /* synthetic */ v[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, m0.v] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, m0.v] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, m0.v] */
    static {
        ?? r32 = new Enum("Unknown", 0);
        alpha = r32;
        ?? r4 = new Enum("Dispatching", 1);
        purple = r4;
        ?? r5 = new Enum("NotDispatching", 2);
        red = r5;
        v[] vVarArr = {r32, r4, r5};
        silver = vVarArr;
        AbstractC2708l7.bravo(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) silver.clone();
    }
}
