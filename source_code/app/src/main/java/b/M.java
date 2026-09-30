package b;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class M {
    public static final M alpha;
    public static final M purple;
    public static final /* synthetic */ M[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [b.M, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b.M, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Default", 0);
        alpha = r32;
        ?? r4 = new Enum("UserInput", 1);
        purple = r4;
        M[] mArr = {r32, r4, new Enum("PreventUserInput", 2)};
        red = mArr;
        AbstractC2708l7.bravo(mArr);
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) red.clone();
    }
}
