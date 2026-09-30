package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ag {
    public static final ag alpha;
    public static final ag purple;
    public static final ag red;
    public static final ag silver;
    public static final ag teal;
    public static final /* synthetic */ ag[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, s0.ag] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, s0.ag] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, s0.ag] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, s0.ag] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, s0.ag] */
    static {
        ?? r5 = new Enum("Measuring", 0);
        alpha = r5;
        ?? r62 = new Enum("LookaheadMeasuring", 1);
        purple = r62;
        ?? r72 = new Enum("LayingOut", 2);
        red = r72;
        ?? r82 = new Enum("LookaheadLayingOut", 3);
        silver = r82;
        ?? r92 = new Enum("Idle", 4);
        teal = r92;
        ag[] agVarArr = {r5, r62, r72, r82, r92};
        white = agVarArr;
        AbstractC2708l7.bravo(agVarArr);
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) white.clone();
    }
}
