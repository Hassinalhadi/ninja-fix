package p3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ae {
    public static final ae alpha;
    public static final ae purple;
    public static final ae red;
    public static final ae silver;
    public static final ae teal;
    public static final ae white;
    public static final /* synthetic */ ae[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, p3.ae] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, p3.ae] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, p3.ae] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, p3.ae] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, p3.ae] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, p3.ae] */
    static {
        ?? r62 = new Enum("FORCE_SEND", 0);
        alpha = r62;
        ?? r72 = new Enum("STREAM", 1);
        purple = r72;
        ?? r82 = new Enum("WARMUP", 2);
        red = r82;
        ?? r92 = new Enum("COLD_START", 3);
        silver = r92;
        ?? r10 = new Enum("STUCK_FALLBACK", 4);
        teal = r10;
        ?? r11 = new Enum("PENDING_RETRY", 5);
        white = r11;
        ae[] aeVarArr = {r62, r72, r82, r92, r10, r11};
        yellow = aeVarArr;
        AbstractC2708l7.bravo(aeVarArr);
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) yellow.clone();
    }
}
