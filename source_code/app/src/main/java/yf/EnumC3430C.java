package yf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yf.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3430C {
    public static final EnumC3430C alpha;
    public static final EnumC3430C purple;
    public static final EnumC3430C red;
    public static final /* synthetic */ EnumC3430C[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, yf.C] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, yf.C] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, yf.C] */
    static {
        ?? r32 = new Enum("START", 0);
        alpha = r32;
        ?? r4 = new Enum("STOP", 1);
        purple = r4;
        ?? r5 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        red = r5;
        EnumC3430C[] enumC3430CArr = {r32, r4, r5};
        silver = enumC3430CArr;
        AbstractC2708l7.bravo(enumC3430CArr);
    }

    public static EnumC3430C valueOf(String str) {
        return (EnumC3430C) Enum.valueOf(EnumC3430C.class, str);
    }

    public static EnumC3430C[] values() {
        return (EnumC3430C[]) silver.clone();
    }
}
