package n0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2152b {
    public static final EnumC2152b alpha;
    public static final EnumC2152b purple;
    public static final /* synthetic */ EnumC2152b[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, n0.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, n0.b] */
    static {
        ?? r22 = new Enum("Lsq2", 0);
        alpha = r22;
        ?? r32 = new Enum("Impulse", 1);
        purple = r32;
        EnumC2152b[] enumC2152bArr = {r22, r32};
        red = enumC2152bArr;
        AbstractC2708l7.bravo(enumC2152bArr);
    }

    public static EnumC2152b valueOf(String str) {
        return (EnumC2152b) Enum.valueOf(EnumC2152b.class, str);
    }

    public static EnumC2152b[] values() {
        return (EnumC2152b[]) red.clone();
    }
}
