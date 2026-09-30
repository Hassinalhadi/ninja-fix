package g3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1741b {
    public static final EnumC1741b alpha;
    public static final EnumC1741b purple;
    public static final EnumC1741b red;
    public static final EnumC1741b silver;
    public static final EnumC1741b teal;
    public static final EnumC1741b white;
    public static final /* synthetic */ EnumC1741b[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, g3.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, g3.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, g3.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, g3.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, g3.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, g3.b] */
    static {
        ?? r82 = new Enum("OPEN_NETWORK_SETTINGS", 0);
        alpha = r82;
        ?? r92 = new Enum("OPEN_LOCATION_SETTINGS", 1);
        purple = r92;
        ?? r10 = new Enum("OPEN_APP_SETTINGS", 2);
        red = r10;
        Enum r11 = new Enum("OPEN_BATTERY_SETTINGS", 3);
        ?? r12 = new Enum("START_SERVICE", 4);
        silver = r12;
        ?? r13 = new Enum("RETRY_CONNECT", 5);
        teal = r13;
        ?? r14 = new Enum("RELOGIN", 6);
        white = r14;
        EnumC1741b[] enumC1741bArr = {r82, r92, r10, r11, r12, r13, r14, new Enum("NONE", 7)};
        yellow = enumC1741bArr;
        AbstractC2708l7.bravo(enumC1741bArr);
    }

    public static EnumC1741b valueOf(String str) {
        return (EnumC1741b) Enum.valueOf(EnumC1741b.class, str);
    }

    public static EnumC1741b[] values() {
        return (EnumC1741b[]) yellow.clone();
    }
}
