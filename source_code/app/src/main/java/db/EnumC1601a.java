package db;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1601a {
    public static final EnumC1601a alpha;
    public static final EnumC1601a purple;
    public static final EnumC1601a red;
    public static final /* synthetic */ EnumC1601a[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, db.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, db.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, db.a] */
    static {
        ?? r32 = new Enum("Hero", 0);
        alpha = r32;
        ?? r4 = new Enum("Spacious", 1);
        purple = r4;
        ?? r5 = new Enum("Default", 2);
        red = r5;
        EnumC1601a[] enumC1601aArr = {r32, r4, r5};
        silver = enumC1601aArr;
        AbstractC2708l7.bravo(enumC1601aArr);
    }

    public static EnumC1601a valueOf(String str) {
        return (EnumC1601a) Enum.valueOf(EnumC1601a.class, str);
    }

    public static EnumC1601a[] values() {
        return (EnumC1601a[]) silver.clone();
    }
}
