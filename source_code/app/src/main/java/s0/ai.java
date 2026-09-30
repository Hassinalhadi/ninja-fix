package s0;

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
    /* JADX WARN: Type inference failed for: r3v0, types: [s0.ai, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [s0.ai, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [s0.ai, java.lang.Enum] */
    static {
        ?? r32 = new Enum("InMeasureBlock", 0);
        alpha = r32;
        ?? r4 = new Enum("InLayoutBlock", 1);
        purple = r4;
        ?? r5 = new Enum("NotUsed", 2);
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
