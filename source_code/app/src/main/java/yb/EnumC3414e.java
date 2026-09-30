package yb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3414e {
    public static final EnumC3414e purple;
    public static final EnumC3414e red;
    public static final EnumC3414e silver;
    public static final EnumC3414e teal;
    public static final /* synthetic */ EnumC3414e[] white;
    public final String alpha;

    static {
        EnumC3414e enumC3414e = new EnumC3414e("PENDING", 0, "⏳");
        purple = enumC3414e;
        EnumC3414e enumC3414e2 = new EnumC3414e("IN_PROGRESS", 1, "🚗");
        red = enumC3414e2;
        EnumC3414e enumC3414e3 = new EnumC3414e("COMPLETED", 2, "✅");
        silver = enumC3414e3;
        EnumC3414e enumC3414e4 = new EnumC3414e("CANCELLED", 3, "❌");
        teal = enumC3414e4;
        EnumC3414e[] enumC3414eArr = {enumC3414e, enumC3414e2, enumC3414e3, enumC3414e4};
        white = enumC3414eArr;
        AbstractC2708l7.bravo(enumC3414eArr);
    }

    public EnumC3414e(String str, int i4, String str2) {
        this.alpha = str2;
    }

    public static EnumC3414e valueOf(String str) {
        return (EnumC3414e) Enum.valueOf(EnumC3414e.class, str);
    }

    public static EnumC3414e[] values() {
        return (EnumC3414e[]) white.clone();
    }
}
