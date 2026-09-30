package g3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1742c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1742c f12642a;
    public static final EnumC1742c alpha;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1742c f12643b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1742c f12644c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1742c f12645d;
    public static final EnumC1742c e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1742c[] f12646f;
    public static final EnumC1742c purple;
    public static final EnumC1742c red;
    public static final EnumC1742c silver;
    public static final EnumC1742c teal;
    public static final EnumC1742c white;
    public static final EnumC1742c yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, g3.c] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, g3.c] */
    static {
        ?? r13 = new Enum("PERMISSION", 0);
        alpha = r13;
        ?? r14 = new Enum("LOCATION_OFF", 1);
        purple = r14;
        ?? r15 = new Enum("NO_INTERNET", 2);
        red = r15;
        ?? r11 = new Enum("CAPTIVE_PORTAL", 3);
        silver = r11;
        ?? r10 = new Enum("DATA_SAVER", 4);
        teal = r10;
        ?? r92 = new Enum("BACKGROUND_RESTRICTED", 5);
        white = r92;
        ?? r82 = new Enum("SERVICE_STOPPED", 6);
        yellow = r82;
        ?? r72 = new Enum("AUTH_EXPIRED", 7);
        f12642a = r72;
        ?? r62 = new Enum("REFRESH_FAILED", 8);
        f12643b = r62;
        ?? r5 = new Enum("BACKEND_DOWN", 9);
        f12644c = r5;
        ?? r4 = new Enum("WS_CLOSE_ERROR", 10);
        f12645d = r4;
        Enum r32 = new Enum("VPN_DETECTED", 11);
        ?? r22 = new Enum("UNSPECIFIED", 12);
        e = r22;
        EnumC1742c[] enumC1742cArr = {r13, r14, r15, r11, r10, r92, r82, r72, r62, r5, r4, r32, r22};
        f12646f = enumC1742cArr;
        AbstractC2708l7.bravo(enumC1742cArr);
    }

    public static EnumC1742c valueOf(String str) {
        return (EnumC1742c) Enum.valueOf(EnumC1742c.class, str);
    }

    public static EnumC1742c[] values() {
        return (EnumC1742c[]) f12646f.clone();
    }
}
