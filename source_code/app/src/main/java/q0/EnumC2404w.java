package q0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2404w {
    public static final EnumC2404w alpha;
    public static final EnumC2404w purple;
    public static final /* synthetic */ EnumC2404w[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, q0.w] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q0.w] */
    static {
        ?? r22 = new Enum("Width", 0);
        alpha = r22;
        ?? r32 = new Enum("Height", 1);
        purple = r32;
        EnumC2404w[] enumC2404wArr = {r22, r32};
        red = enumC2404wArr;
        AbstractC2708l7.bravo(enumC2404wArr);
    }

    public static EnumC2404w valueOf(String str) {
        return (EnumC2404w) Enum.valueOf(EnumC2404w.class, str);
    }

    public static EnumC2404w[] values() {
        return (EnumC2404w[]) red.clone();
    }
}
