package g3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1750k {
    public static final EnumC1750k alpha;
    public static final /* synthetic */ EnumC1750k[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, g3.k] */
    static {
        Enum r4 = new Enum("OFF", 0);
        ?? r5 = new Enum("RECOMMEND_IF_AVAILABLE", 1);
        alpha = r5;
        EnumC1750k[] enumC1750kArr = {r4, r5, new Enum("BLOCK_IF_AVAILABLE", 2), new Enum("BLOCK_AND_FAIL_IF_MISSING", 3)};
        purple = enumC1750kArr;
        AbstractC2708l7.bravo(enumC1750kArr);
    }

    public static EnumC1750k valueOf(String str) {
        return (EnumC1750k) Enum.valueOf(EnumC1750k.class, str);
    }

    public static EnumC1750k[] values() {
        return (EnumC1750k[]) purple.clone();
    }
}
