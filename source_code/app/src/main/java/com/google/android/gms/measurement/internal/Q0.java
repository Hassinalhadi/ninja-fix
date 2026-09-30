package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Q0 {
    public static final Q0 alpha;
    public static final Q0 purple;
    public static final /* synthetic */ Q0[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, com.google.android.gms.measurement.internal.Q0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.google.android.gms.measurement.internal.Q0] */
    static {
        ?? r4 = new Enum("CONSENT", 0);
        alpha = r4;
        Enum r5 = new Enum("LEGITIMATE_INTEREST", 1);
        Enum r62 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r72 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        purple = r72;
        red = new Q0[]{r4, r5, r62, r72};
    }

    public static Q0[] values() {
        return (Q0[]) red.clone();
    }
}
