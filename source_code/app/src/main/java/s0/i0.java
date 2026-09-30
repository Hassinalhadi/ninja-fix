package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i0 {
    public static final i0 alpha;
    public static final i0 purple;
    public static final i0 red;
    public static final /* synthetic */ i0[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [s0.i0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [s0.i0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [s0.i0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("ContinueTraversal", 0);
        alpha = r32;
        ?? r4 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        purple = r4;
        ?? r5 = new Enum("CancelTraversal", 2);
        red = r5;
        i0[] i0VarArr = {r32, r4, r5};
        silver = i0VarArr;
        AbstractC2708l7.bravo(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) silver.clone();
    }
}
