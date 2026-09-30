package sc;

import com.google.android.gms.measurement.internal.C1473v;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2849d {
    public static final C1473v alpha;
    public static final EnumC2849d purple;
    public static final /* synthetic */ EnumC2849d[] red;
    public static final /* synthetic */ Qd.b silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sc.d, java.lang.Enum] */
    static {
        Enum r22 = new Enum("STRICT", 0);
        ?? r32 = new Enum("FLEXIBLE", 1);
        purple = r32;
        EnumC2849d[] enumC2849dArr = {r22, r32};
        red = enumC2849dArr;
        silver = AbstractC2708l7.bravo(enumC2849dArr);
        alpha = new C1473v(15);
    }

    public static EnumC2849d valueOf(String str) {
        return (EnumC2849d) Enum.valueOf(EnumC2849d.class, str);
    }

    public static EnumC2849d[] values() {
        return (EnumC2849d[]) red.clone();
    }
}
