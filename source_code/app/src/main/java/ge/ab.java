package ge;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ab {
    public static final ab alpha;
    public static final ab purple;
    public static final ab red;
    public static final ab silver;
    public static final /* synthetic */ ab[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, ge.ab] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, ge.ab] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, ge.ab] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, ge.ab] */
    static {
        ?? r4 = new Enum("PUBLIC", 0);
        alpha = r4;
        ?? r5 = new Enum("PROTECTED", 1);
        purple = r5;
        ?? r62 = new Enum("INTERNAL", 2);
        red = r62;
        ?? r72 = new Enum("PRIVATE", 3);
        silver = r72;
        ab[] abVarArr = {r4, r5, r62, r72};
        teal = abVarArr;
        AbstractC2708l7.bravo(abVarArr);
    }

    public static ab valueOf(String str) {
        return (ab) Enum.valueOf(ab.class, str);
    }

    public static ab[] values() {
        return (ab[]) teal.clone();
    }
}
