package Ob;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    public static final h alpha;
    public static final h purple;
    public static final h red;
    public static final /* synthetic */ h[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ob.h] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Ob.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ob.h] */
    static {
        ?? r32 = new Enum("INPUT", 0);
        alpha = r32;
        ?? r4 = new Enum("OTP", 1);
        purple = r4;
        ?? r5 = new Enum("SUCCESS", 2);
        red = r5;
        h[] hVarArr = {r32, r4, r5};
        silver = hVarArr;
        AbstractC2708l7.bravo(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) silver.clone();
    }
}
