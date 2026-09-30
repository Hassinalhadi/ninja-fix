package Yf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final a alpha;
    public static final a purple;
    public static final /* synthetic */ a[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Yf.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Yf.a] */
    static {
        ?? r22 = new Enum("Real", 0);
        alpha = r22;
        ?? r32 = new Enum("Virtual", 1);
        purple = r32;
        a[] aVarArr = {r22, r32};
        red = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) red.clone();
    }
}
