package bx;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ai {
    public static final ai alpha;
    public static final ai purple;
    public static final ai red;
    public static final /* synthetic */ ai[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, bx.ai] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, bx.ai] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, bx.ai] */
    static {
        ?? r32 = new Enum("PreEnter", 0);
        alpha = r32;
        ?? r4 = new Enum("Visible", 1);
        purple = r4;
        ?? r5 = new Enum("PostExit", 2);
        red = r5;
        ai[] aiVarArr = {r32, r4, r5};
        silver = aiVarArr;
        AbstractC2708l7.bravo(aiVarArr);
    }

    public static ai valueOf(String str) {
        return (ai) Enum.valueOf(ai.class, str);
    }

    public static ai[] values() {
        return (ai[]) silver.clone();
    }
}
