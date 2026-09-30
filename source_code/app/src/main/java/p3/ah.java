package p3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ah {
    public static final ah alpha;
    public static final ah purple;
    public static final ah red;
    public static final /* synthetic */ ah[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p3.ah, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p3.ah, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p3.ah, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CONNECTING", 0);
        alpha = r32;
        ?? r4 = new Enum("CONNECTED", 1);
        purple = r4;
        ?? r5 = new Enum("NOT_CONNECTED", 2);
        red = r5;
        ah[] ahVarArr = {r32, r4, r5};
        silver = ahVarArr;
        AbstractC2708l7.bravo(ahVarArr);
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) silver.clone();
    }
}
