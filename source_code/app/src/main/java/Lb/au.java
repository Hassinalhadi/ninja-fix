package Lb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class au {
    public static final au alpha;
    public static final au purple;
    public static final au red;
    public static final /* synthetic */ au[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [Lb.au, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [Lb.au, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Lb.au, java.lang.Enum] */
    static {
        ?? r72 = new Enum("SUSPENDED", 0);
        alpha = r72;
        Enum r82 = new Enum("INTERNET_LOST", 1);
        Enum r92 = new Enum("RECONNECTING", 2);
        Enum r10 = new Enum("SERVER_TIMEOUT", 3);
        Enum r11 = new Enum("GPS_WEAK", 4);
        ?? r12 = new Enum("OFFLINE", 5);
        purple = r12;
        ?? r13 = new Enum("ONLINE", 6);
        red = r13;
        au[] auVarArr = {r72, r82, r92, r10, r11, r12, r13};
        silver = auVarArr;
        AbstractC2708l7.bravo(auVarArr);
    }

    public static au valueOf(String str) {
        return (au) Enum.valueOf(au.class, str);
    }

    public static au[] values() {
        return (au[]) silver.clone();
    }
}
