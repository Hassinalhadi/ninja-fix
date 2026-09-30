package t0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t0.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2943u0 {
    public static final /* synthetic */ EnumC2943u0[] alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC2943u0[] enumC2943u0Arr = {new Enum("Shown", 0), new Enum("Hidden", 1)};
        alpha = enumC2943u0Arr;
        AbstractC2708l7.bravo(enumC2943u0Arr);
    }

    public static EnumC2943u0 valueOf(String str) {
        return (EnumC2943u0) Enum.valueOf(EnumC2943u0.class, str);
    }

    public static EnumC2943u0[] values() {
        return (EnumC2943u0[]) alpha.clone();
    }
}
