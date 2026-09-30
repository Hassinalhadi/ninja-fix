package q0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2403v {
    public static final EnumC2403v alpha;
    public static final EnumC2403v purple;
    public static final /* synthetic */ EnumC2403v[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [q0.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [q0.v, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Min", 0);
        alpha = r22;
        ?? r32 = new Enum("Max", 1);
        purple = r32;
        EnumC2403v[] enumC2403vArr = {r22, r32};
        red = enumC2403vArr;
        AbstractC2708l7.bravo(enumC2403vArr);
    }

    public static EnumC2403v valueOf(String str) {
        return (EnumC2403v) Enum.valueOf(EnumC2403v.class, str);
    }

    public static EnumC2403v[] values() {
        return (EnumC2403v[]) red.clone();
    }
}
