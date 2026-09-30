package d2;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1581f {
    public static final EnumC1581f alpha;
    public static final EnumC1581f purple;
    public static final /* synthetic */ EnumC1581f[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, d2.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d2.f] */
    static {
        ?? r22 = new Enum("PATH", 0);
        alpha = r22;
        ?? r32 = new Enum("QUERY", 1);
        purple = r32;
        EnumC1581f[] enumC1581fArr = {r22, r32};
        red = enumC1581fArr;
        AbstractC2708l7.bravo(enumC1581fArr);
    }

    public static EnumC1581f valueOf(String str) {
        return (EnumC1581f) Enum.valueOf(EnumC1581f.class, str);
    }

    public static EnumC1581f[] values() {
        return (EnumC1581f[]) red.clone();
    }
}
