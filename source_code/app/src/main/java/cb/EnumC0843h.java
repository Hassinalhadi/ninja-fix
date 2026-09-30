package cb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cb.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0843h {
    public static final EnumC0843h alpha;
    public static final /* synthetic */ EnumC0843h[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, cb.h] */
    static {
        Enum r22 = new Enum("DASHED", 0);
        ?? r32 = new Enum("SOLID", 1);
        alpha = r32;
        EnumC0843h[] enumC0843hArr = {r22, r32};
        purple = enumC0843hArr;
        AbstractC2708l7.bravo(enumC0843hArr);
    }

    public static EnumC0843h valueOf(String str) {
        return (EnumC0843h) Enum.valueOf(EnumC0843h.class, str);
    }

    public static EnumC0843h[] values() {
        return (EnumC0843h[]) purple.clone();
    }
}
