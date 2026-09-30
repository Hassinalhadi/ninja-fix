package qb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qb.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2443j {
    public static final EnumC2443j alpha;
    public static final EnumC2443j purple;
    public static final EnumC2443j red;
    public static final /* synthetic */ EnumC2443j[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, qb.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, qb.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, qb.j] */
    static {
        ?? r32 = new Enum("Active", 0);
        alpha = r32;
        ?? r4 = new Enum("Inactive", 1);
        purple = r4;
        ?? r5 = new Enum("Warning", 2);
        red = r5;
        EnumC2443j[] enumC2443jArr = {r32, r4, r5};
        silver = enumC2443jArr;
        AbstractC2708l7.bravo(enumC2443jArr);
    }

    public static EnumC2443j valueOf(String str) {
        return (EnumC2443j) Enum.valueOf(EnumC2443j.class, str);
    }

    public static EnumC2443j[] values() {
        return (EnumC2443j[]) silver.clone();
    }
}
