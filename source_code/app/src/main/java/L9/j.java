package L9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    public static final /* synthetic */ j[] alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        j[] jVarArr = {new Enum("ORDERS_FRAGMENT_TOGGLE", 0), new Enum("HOME_ACTIVITY_START_MONITORING", 1), new Enum("HOME_ACTIVITY_ENSURE_PERMS", 2), new Enum("LOCATION_MONITORING_CONTROLLER", 3), new Enum("OTHER", 4)};
        alpha = jVarArr;
        AbstractC2708l7.bravo(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) alpha.clone();
    }
}
