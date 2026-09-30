package kotlin.io;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    public static final i alpha;
    public static final /* synthetic */ i[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.io.i, java.lang.Enum] */
    static {
        Enum r22 = new Enum("TOP_DOWN", 0);
        ?? r32 = new Enum("BOTTOM_UP", 1);
        alpha = r32;
        i[] iVarArr = {r22, r32};
        purple = iVarArr;
        AbstractC2708l7.bravo(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) purple.clone();
    }
}
