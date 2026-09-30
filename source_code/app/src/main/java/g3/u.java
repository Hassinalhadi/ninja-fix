package g3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {
    public static final u alpha;
    public static final u purple;
    public static final u red;
    public static final u silver;
    public static final u teal;
    public static final u white;
    public static final /* synthetic */ u[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, g3.u] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, g3.u] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, g3.u] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, g3.u] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, g3.u] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, g3.u] */
    static {
        ?? r62 = new Enum("APPROXIMATE_LOCATION_ONLY", 0);
        alpha = r62;
        ?? r72 = new Enum("NO_LOCATION_PERMISSION", 1);
        purple = r72;
        ?? r82 = new Enum("BACKGROUND_LOCATION_MISSING", 2);
        red = r82;
        ?? r92 = new Enum("BACKGROUND_LOCATION_DOWNGRADED", 3);
        silver = r92;
        ?? r10 = new Enum("FOREGROUND_SERVICE_LOCATION_MISSING", 4);
        teal = r10;
        ?? r11 = new Enum("SYSTEM_LOCATION_DISABLED", 5);
        white = r11;
        u[] uVarArr = {r62, r72, r82, r92, r10, r11};
        yellow = uVarArr;
        AbstractC2708l7.bravo(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) yellow.clone();
    }
}
