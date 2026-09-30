package Fc;

import delivery.samurai.android.R;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1296a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1297b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1298c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1299d;
    public static final b e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1300f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1301g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1302h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1303i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f1304j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f1305k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f1306l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b[] f1307m;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final b white;
    public static final b yellow;
    public final int alpha;

    static {
        b bVar = new b("RESET", 0, 0);
        purple = bVar;
        b bVar2 = new b("FIRST_NAME", 1, R.string.validation_first_name);
        red = bVar2;
        b bVar3 = new b("LAST_NAME", 2, R.string.validation_last_name);
        silver = bVar3;
        b bVar4 = new b("ID_NUMBER", 3, R.string.validation_id_number);
        teal = bVar4;
        b bVar5 = new b("DOB", 4, R.string.validation_dob);
        white = bVar5;
        b bVar6 = new b("PREFERENCE", 5, R.string.validation_preference);
        yellow = bVar6;
        b bVar7 = new b("PLATFORMS", 6, R.string.validation_platform);
        f1296a = bVar7;
        b bVar8 = new b("VECHILEPLATENUMBER", 7, R.string.validation_vehicle_plate);
        f1297b = bVar8;
        b bVar9 = new b("VECHILESEQUENCENUMBER", 8, R.string.validation_vehicle_sequence_number);
        f1298c = bVar9;
        b bVar10 = new b("NATIONALITY", 9, R.string.validation_nationality);
        f1299d = bVar10;
        b bVar11 = new b("COUNTRY", 10, R.string.VALIDATION_COUNTRY);
        e = bVar11;
        b bVar12 = new b("CITY", 11, R.string.VALIDATION_CITY);
        f1300f = bVar12;
        b bVar13 = new b("MOBILE_NO", 12, R.string.VALIDATION_MOBILE_NO);
        f1301g = bVar13;
        b bVar14 = new b("FIN_TECH_ID", 13, R.string.VALIDATION_FINTECH_ID);
        f1302h = bVar14;
        b bVar15 = new b("IBAN_NAME", 14, R.string.VALIDATION_IBAN_NAME);
        b bVar16 = new b("IBAN_NUMBER", 15, R.string.VALIDATION_IBAN_NUMBER);
        b bVar17 = new b("BANK_NAME", 16, R.string.VALIDATION_BANK_NAME);
        b bVar18 = new b("ID_CARD", 17, R.string.VALIDATION_ID_CARD);
        f1303i = bVar18;
        b bVar19 = new b("DRIVING_LICENSE", 18, R.string.VALIDATION_DRIVING_LICENSE);
        f1304j = bVar19;
        b bVar20 = new b("REGISTRATION", 19, R.string.VALIDATION_REGISTRATION);
        f1305k = bVar20;
        b bVar21 = new b("PROFILE_PICTURE", 20, R.string.VALIDATION_PROFILE_PICTURE);
        f1306l = bVar21;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, new b("URPAY_IBAN", 21, R.string.VALIDATION_URPAY_IBAN), new b("URPAY_ID", 22, R.string.VALIDATION_URPAY_ID)};
        f1307m = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public b(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1307m.clone();
    }
}
