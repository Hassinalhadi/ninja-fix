package ge;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ge.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1782n {
    public static final EnumC1782n alpha;
    public static final EnumC1782n purple;
    public static final EnumC1782n red;
    public static final /* synthetic */ EnumC1782n[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, ge.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, ge.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, ge.n] */
    static {
        ?? r32 = new Enum("INSTANCE", 0);
        alpha = r32;
        ?? r4 = new Enum("EXTENSION_RECEIVER", 1);
        purple = r4;
        ?? r5 = new Enum("VALUE", 2);
        red = r5;
        EnumC1782n[] enumC1782nArr = {r32, r4, r5};
        silver = enumC1782nArr;
        AbstractC2708l7.bravo(enumC1782nArr);
    }

    public static EnumC1782n valueOf(String str) {
        return (EnumC1782n) Enum.valueOf(EnumC1782n.class, str);
    }

    public static EnumC1782n[] values() {
        return (EnumC1782n[]) silver.clone();
    }
}
