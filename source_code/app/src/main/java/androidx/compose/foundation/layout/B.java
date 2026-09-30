package androidx.compose.foundation.layout;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class B {
    public static final B alpha;
    public static final B purple;
    public static final /* synthetic */ B[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, androidx.compose.foundation.layout.B] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, androidx.compose.foundation.layout.B] */
    static {
        ?? r22 = new Enum("Min", 0);
        alpha = r22;
        ?? r32 = new Enum("Max", 1);
        purple = r32;
        B[] bArr = {r22, r32};
        red = bArr;
        AbstractC2708l7.bravo(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) red.clone();
    }
}
