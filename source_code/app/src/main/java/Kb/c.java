package Kb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1677a;
    public static final c alpha;

    /* renamed from: b, reason: collision with root package name */
    public static final c f1678b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1679c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f1680d;
    public static final c e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f1681f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f1682g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f1683h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f1684i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f1685j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f1686k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f1687l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f1688m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f1689n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f1690o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f1691p;
    public static final c purple;

    /* renamed from: q, reason: collision with root package name */
    public static final c f1692q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c[] f1693r;
    public static final c red;
    public static final c silver;
    public static final c teal;
    public static final c white;
    public static final c yellow;

    static {
        b[] bVarArr = b.alpha;
        c cVar = new c("BATTERY_OPT_WHITELIST", 0, 8);
        alpha = cVar;
        c cVar2 = new c("NOTIFS_ALLOWED", 1, 8);
        purple = cVar2;
        c cVar3 = new c("PRECISE_PERMISSION", 2, 8);
        red = cVar3;
        c cVar4 = new c("BACKGROUND_PERMISSION", 3, 8);
        silver = cVar4;
        c cVar5 = new c("BATTERY_SAVER", 4, 24);
        teal = cVar5;
        c cVar6 = new c("DATA_SAVER", 5, 24);
        white = cVar6;
        c cVar7 = new c("WIFI_BT_SCANNING", 6, 24);
        yellow = cVar7;
        c cVar8 = new c("GOOGLE_LOCATION_ACCURACY", 7, 24);
        f1677a = cVar8;
        c cVar9 = new c("LOCATION_ON", 8, 24);
        f1678b = cVar9;
        c cVar10 = new c("AUTO_TIME", 9, 24);
        f1679c = cVar10;
        c cVar11 = new c("BACKGROUND_RESTRICTED", 10, 24);
        f1680d = cVar11;
        c cVar12 = new c("GNSS_WEAK", 11, 24);
        e = cVar12;
        c cVar13 = new c("NETWORK_VALIDATED", 12, 24);
        f1681f = cVar13;
        c cVar14 = new c("INTERNET", 13, 24);
        f1682g = cVar14;
        c cVar15 = new c("MOCK_LOCATION", 14, 24);
        f1683h = cVar15;
        c cVar16 = new c("XIAOMI_BATTERY_SETTINGS", 15, 16);
        f1684i = cVar16;
        c cVar17 = new c("HUAWEI_APP_LAUNCH", 16, 16);
        f1685j = cVar17;
        c cVar18 = new c("OPPO_BACKGROUND_FREEZE", 17, 16);
        f1686k = cVar18;
        c cVar19 = new c("SAMSUNG_BATTERY_SETTINGS", 18, 16);
        f1687l = cVar19;
        c cVar20 = new c("VIVO_BATTERY_SETTINGS", 19, 16);
        f1688m = cVar20;
        c cVar21 = new c("NOKIA_BATTERY_SETTINGS", 20, 16);
        f1689n = cVar21;
        c cVar22 = new c("MOTOROLA_BATTERY_SETTINGS", 21, 16);
        f1690o = cVar22;
        c cVar23 = new c("TRANSISION_BATTERY_SETTINGS", 22, 16);
        f1691p = cVar23;
        c cVar24 = new c("ZTE_BATTERY_SETTINGS", 23, 16);
        f1692q = cVar24;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24};
        f1693r = cVarArr;
        AbstractC2708l7.bravo(cVarArr);
    }

    public c(String str, int i4, int i5) {
        if ((i5 & 16) != 0) {
            b[] bVarArr = b.alpha;
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f1693r.clone();
    }
}
