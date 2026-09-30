package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class av {
    public static final av alpha;
    public static final av purple;
    public static final av red;
    public static final /* synthetic */ av[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, s0.av] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, s0.av] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, s0.av] */
    static {
        ?? r32 = new Enum("IsPlacedInLookahead", 0);
        alpha = r32;
        ?? r4 = new Enum("IsPlacedInApproach", 1);
        purple = r4;
        ?? r5 = new Enum("IsNotPlaced", 2);
        red = r5;
        av[] avVarArr = {r32, r4, r5};
        silver = avVarArr;
        AbstractC2708l7.bravo(avVarArr);
    }

    public static av valueOf(String str) {
        return (av) Enum.valueOf(av.class, str);
    }

    public static av[] values() {
        return (av[]) silver.clone();
    }
}
