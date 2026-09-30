package bz;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bz.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0784i {
    public static final EnumC0784i alpha;
    public static final EnumC0784i purple;
    public static final /* synthetic */ EnumC0784i[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, bz.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, bz.i] */
    static {
        ?? r22 = new Enum("BoundReached", 0);
        alpha = r22;
        ?? r32 = new Enum("Finished", 1);
        purple = r32;
        EnumC0784i[] enumC0784iArr = {r22, r32};
        red = enumC0784iArr;
        AbstractC2708l7.bravo(enumC0784iArr);
    }

    public static EnumC0784i valueOf(String str) {
        return (EnumC0784i) Enum.valueOf(EnumC0784i.class, str);
    }

    public static EnumC0784i[] values() {
        return (EnumC0784i[]) red.clone();
    }
}
