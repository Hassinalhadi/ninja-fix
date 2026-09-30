package Lb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class B {
    public static final B alpha;
    public static final B purple;
    public static final B red;
    public static final /* synthetic */ B[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Lb.B] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Lb.B] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Lb.B] */
    static {
        ?? r32 = new Enum("INPUT", 0);
        alpha = r32;
        ?? r4 = new Enum("OTP", 1);
        purple = r4;
        ?? r5 = new Enum("SUCCESS", 2);
        red = r5;
        B[] bArr = {r32, r4, r5};
        silver = bArr;
        AbstractC2708l7.bravo(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) silver.clone();
    }
}
