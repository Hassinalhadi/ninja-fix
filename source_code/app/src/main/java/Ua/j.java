package Ua;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    public static final j alpha;
    public static final j purple;
    public static final /* synthetic */ j[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Ua.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ua.j, java.lang.Enum] */
    static {
        ?? r22 = new Enum("STEP_1_PRECISE_APPROXIMATE", 0);
        alpha = r22;
        ?? r32 = new Enum("STEP_2_BACKGROUND_LOCATION", 1);
        purple = r32;
        j[] jVarArr = {r22, r32};
        red = jVarArr;
        AbstractC2708l7.bravo(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) red.clone();
    }
}
