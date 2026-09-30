package kotlin;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    public static final i alpha;
    public static final i purple;
    public static final /* synthetic */ i[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, kotlin.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, kotlin.i] */
    static {
        Enum r32 = new Enum("SYNCHRONIZED", 0);
        ?? r4 = new Enum("PUBLICATION", 1);
        alpha = r4;
        ?? r5 = new Enum("NONE", 2);
        purple = r5;
        i[] iVarArr = {r32, r4, r5};
        red = iVarArr;
        AbstractC2708l7.bravo(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) red.clone();
    }
}
