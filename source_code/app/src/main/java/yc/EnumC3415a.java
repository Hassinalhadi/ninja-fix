package yc;

import com.google.android.gms.measurement.internal.C1475w;
import delivery.samurai.android.R;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3415a {
    public static final C1475w red;
    public static final EnumC3415a silver;
    public static final EnumC3415a teal;
    public static final EnumC3415a white;
    public static final /* synthetic */ EnumC3415a[] yellow;
    public final int alpha;
    public final int purple;

    static {
        EnumC3415a enumC3415a = new EnumC3415a(0, R.string.pricing_category_minimum_guarantee, R.color.location_info_blue, "MINIMUM_GUARANTEE");
        silver = enumC3415a;
        EnumC3415a enumC3415a2 = new EnumC3415a(1, R.string.pricing_category_bonuses, R.color.green_500, "BONUS");
        teal = enumC3415a2;
        EnumC3415a enumC3415a3 = new EnumC3415a(2, R.string.pricing_category_deductions, R.color.red_700, "DEDUCTION");
        white = enumC3415a3;
        EnumC3415a[] enumC3415aArr = {enumC3415a, enumC3415a2, enumC3415a3};
        yellow = enumC3415aArr;
        AbstractC2708l7.bravo(enumC3415aArr);
        red = new C1475w(16);
    }

    public EnumC3415a(int i4, int i5, int i10, String str) {
        this.alpha = i5;
        this.purple = i10;
    }

    public static EnumC3415a valueOf(String str) {
        return (EnumC3415a) Enum.valueOf(EnumC3415a.class, str);
    }

    public static EnumC3415a[] values() {
        return (EnumC3415a[]) yellow.clone();
    }
}
