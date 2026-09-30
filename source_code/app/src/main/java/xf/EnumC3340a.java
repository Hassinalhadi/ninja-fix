package xf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3340a {
    public static final EnumC3340a alpha;
    public static final EnumC3340a purple;
    public static final EnumC3340a red;
    public static final /* synthetic */ EnumC3340a[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, xf.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, xf.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, xf.a] */
    static {
        ?? r32 = new Enum("SUSPEND", 0);
        alpha = r32;
        ?? r4 = new Enum("DROP_OLDEST", 1);
        purple = r4;
        ?? r5 = new Enum("DROP_LATEST", 2);
        red = r5;
        EnumC3340a[] enumC3340aArr = {r32, r4, r5};
        silver = enumC3340aArr;
        AbstractC2708l7.bravo(enumC3340aArr);
    }

    public static EnumC3340a valueOf(String str) {
        return (EnumC3340a) Enum.valueOf(EnumC3340a.class, str);
    }

    public static EnumC3340a[] values() {
        return (EnumC3340a[]) silver.clone();
    }
}
