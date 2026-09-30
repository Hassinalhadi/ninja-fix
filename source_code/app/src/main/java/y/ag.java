package y;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ag {
    public static final ag alpha;
    public static final ag purple;
    public static final ag red;
    public static final /* synthetic */ ag[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, y.ag] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, y.ag] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, y.ag] */
    static {
        ?? r32 = new Enum("Left", 0);
        alpha = r32;
        ?? r4 = new Enum("Middle", 1);
        purple = r4;
        ?? r5 = new Enum("Right", 2);
        red = r5;
        ag[] agVarArr = {r32, r4, r5};
        silver = agVarArr;
        AbstractC2708l7.bravo(agVarArr);
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) silver.clone();
    }
}
