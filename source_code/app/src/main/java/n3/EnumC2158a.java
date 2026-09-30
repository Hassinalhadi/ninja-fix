package n3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2158a {
    public static final /* synthetic */ EnumC2158a[] alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC2158a[] enumC2158aArr = {new Enum("QUICK", 0), new Enum("PERMISSION", 1), new Enum("SETTINGS", 2)};
        alpha = enumC2158aArr;
        AbstractC2708l7.bravo(enumC2158aArr);
    }

    public static EnumC2158a valueOf(String str) {
        return (EnumC2158a) Enum.valueOf(EnumC2158a.class, str);
    }

    public static EnumC2158a[] values() {
        return (EnumC2158a[]) alpha.clone();
    }
}
