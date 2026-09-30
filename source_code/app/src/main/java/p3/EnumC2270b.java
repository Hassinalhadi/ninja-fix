package p3;

import com.google.android.gms.measurement.internal.C1475w;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2270b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2270b f13137a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2270b[] f13138b;
    public static final C1475w purple;
    public static final EnumC2270b red;
    public static final EnumC2270b silver;
    public static final EnumC2270b teal;
    public static final EnumC2270b white;
    public static final EnumC2270b yellow;
    public final Float alpha;

    static {
        EnumC2270b enumC2270b = new EnumC2270b("EXCELLENT", 0, Float.valueOf(10.0f));
        red = enumC2270b;
        EnumC2270b enumC2270b2 = new EnumC2270b("GOOD", 1, Float.valueOf(20.0f));
        silver = enumC2270b2;
        EnumC2270b enumC2270b3 = new EnumC2270b("FAIR", 2, Float.valueOf(35.0f));
        teal = enumC2270b3;
        EnumC2270b enumC2270b4 = new EnumC2270b("WEAK", 3, Float.valueOf(50.0f));
        white = enumC2270b4;
        EnumC2270b enumC2270b5 = new EnumC2270b("POOR", 4, Float.valueOf(100.0f));
        yellow = enumC2270b5;
        EnumC2270b enumC2270b6 = new EnumC2270b("UNKNOWN", 5, null);
        f13137a = enumC2270b6;
        EnumC2270b[] enumC2270bArr = {enumC2270b, enumC2270b2, enumC2270b3, enumC2270b4, enumC2270b5, enumC2270b6};
        f13138b = enumC2270bArr;
        AbstractC2708l7.bravo(enumC2270bArr);
        purple = new C1475w(12);
    }

    public EnumC2270b(String str, int i4, Float f5) {
        this.alpha = f5;
    }

    public static EnumC2270b valueOf(String str) {
        return (EnumC2270b) Enum.valueOf(EnumC2270b.class, str);
    }

    public static EnumC2270b[] values() {
        return (EnumC2270b[]) f13138b.clone();
    }
}
