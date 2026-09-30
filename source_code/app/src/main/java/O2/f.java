package O2;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    public static final f alpha;
    public static final f purple;
    public static final f red;
    public static final f silver;
    public static final /* synthetic */ f[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, O2.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, O2.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, O2.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, O2.f] */
    static {
        ?? r4 = new Enum("MEMORY_CACHE", 0);
        alpha = r4;
        ?? r5 = new Enum("MEMORY", 1);
        purple = r5;
        ?? r62 = new Enum("DISK", 2);
        red = r62;
        ?? r72 = new Enum("NETWORK", 3);
        silver = r72;
        f[] fVarArr = {r4, r5, r62, r72};
        teal = fVarArr;
        AbstractC2708l7.bravo(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) teal.clone();
    }
}
