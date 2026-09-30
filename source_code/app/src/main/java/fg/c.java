package fg;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    public static final c alpha;
    public static final c purple;
    public static final /* synthetic */ c[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, fg.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, fg.c] */
    static {
        ?? r32 = new Enum("Singleton", 0);
        alpha = r32;
        ?? r4 = new Enum("Factory", 1);
        purple = r4;
        c[] cVarArr = {r32, r4, new Enum("Scoped", 2)};
        red = cVarArr;
        AbstractC2708l7.bravo(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) red.clone();
    }
}
