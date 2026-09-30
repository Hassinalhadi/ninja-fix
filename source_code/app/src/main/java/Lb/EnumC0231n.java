package Lb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Lb.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0231n {
    public static final EnumC0231n alpha;
    public static final EnumC0231n purple;
    public static final EnumC0231n red;
    public static final /* synthetic */ EnumC0231n[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Lb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Lb.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Lb.n, java.lang.Enum] */
    static {
        ?? r32 = new Enum("INPUT", 0);
        alpha = r32;
        ?? r4 = new Enum("OTP", 1);
        purple = r4;
        ?? r5 = new Enum("SUCCESS", 2);
        red = r5;
        EnumC0231n[] enumC0231nArr = {r32, r4, r5};
        silver = enumC0231nArr;
        AbstractC2708l7.bravo(enumC0231nArr);
    }

    public static EnumC0231n valueOf(String str) {
        return (EnumC0231n) Enum.valueOf(EnumC0231n.class, str);
    }

    public static EnumC0231n[] values() {
        return (EnumC0231n[]) silver.clone();
    }
}
