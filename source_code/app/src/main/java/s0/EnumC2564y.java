package s0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s0.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2564y {
    public static final EnumC2564y alpha;
    public static final EnumC2564y purple;
    public static final EnumC2564y red;
    public static final EnumC2564y silver;
    public static final /* synthetic */ EnumC2564y[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, s0.y] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, s0.y] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, s0.y] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, s0.y] */
    static {
        ?? r4 = new Enum("LookaheadMeasurement", 0);
        alpha = r4;
        ?? r5 = new Enum("LookaheadPlacement", 1);
        purple = r5;
        ?? r62 = new Enum("Measurement", 2);
        red = r62;
        ?? r72 = new Enum("Placement", 3);
        silver = r72;
        EnumC2564y[] enumC2564yArr = {r4, r5, r62, r72};
        teal = enumC2564yArr;
        AbstractC2708l7.bravo(enumC2564yArr);
    }

    public static EnumC2564y valueOf(String str) {
        return (EnumC2564y) Enum.valueOf(EnumC2564y.class, str);
    }

    public static EnumC2564y[] values() {
        return (EnumC2564y[]) teal.clone();
    }
}
