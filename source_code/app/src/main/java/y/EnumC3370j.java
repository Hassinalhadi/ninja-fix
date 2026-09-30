package y;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3370j {
    public static final EnumC3370j alpha;
    public static final EnumC3370j purple;
    public static final EnumC3370j red;
    public static final /* synthetic */ EnumC3370j[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, y.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, y.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, y.j] */
    static {
        ?? r32 = new Enum("CROSSED", 0);
        alpha = r32;
        ?? r4 = new Enum("NOT_CROSSED", 1);
        purple = r4;
        ?? r5 = new Enum("COLLAPSED", 2);
        red = r5;
        EnumC3370j[] enumC3370jArr = {r32, r4, r5};
        silver = enumC3370jArr;
        AbstractC2708l7.bravo(enumC3370jArr);
    }

    public static EnumC3370j valueOf(String str) {
        return (EnumC3370j) Enum.valueOf(EnumC3370j.class, str);
    }

    public static EnumC3370j[] values() {
        return (EnumC3370j[]) silver.clone();
    }
}
