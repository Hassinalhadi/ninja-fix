package X9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ r[] f2243a;
    public static final r alpha;
    public static final r purple;
    public static final r red;
    public static final r silver;
    public static final r teal;
    public static final r white;
    public static final r yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, X9.r] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, X9.r] */
    static {
        ?? r72 = new Enum("NO_GMS", 0);
        alpha = r72;
        ?? r82 = new Enum("NOT_PREPARED", 1);
        purple = r82;
        ?? r92 = new Enum("PROVIDER_INVALID", 2);
        red = r92;
        ?? r10 = new Enum("TOKEN_REQUEST_FAILED", 3);
        silver = r10;
        ?? r11 = new Enum("NETWORK_ERROR", 4);
        teal = r11;
        ?? r12 = new Enum("QUOTA_EXCEEDED", 5);
        white = r12;
        ?? r13 = new Enum("UNKNOWN", 6);
        yellow = r13;
        r[] rVarArr = {r72, r82, r92, r10, r11, r12, r13};
        f2243a = rVarArr;
        AbstractC2708l7.bravo(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f2243a.clone();
    }
}
