package com.checkout.address.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b;\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=¨\u0006>"}, d2 = {"Lcom/checkout/address/model/US;", "Lcom/checkout/address/model/State;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getDisplayName", "displayName", "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class US implements State {
    public static final US AK;
    public static final US AL;
    public static final US AR;
    public static final US AZ;
    public static final US CA;
    public static final US CO;
    public static final US CT;
    public static final US DE;
    public static final US FL;
    public static final US GA;
    public static final US HI;
    public static final US IA;
    public static final US ID;
    public static final US IL;
    public static final US IN;
    public static final US KS;
    public static final US KY;
    public static final US LA;
    public static final US MA;
    public static final US MD;
    public static final US ME;
    public static final US MI;
    public static final US MN;
    public static final US MO;
    public static final US MS;
    public static final US MT;
    public static final US NC;
    public static final US ND;
    public static final US NE;
    public static final US NH;
    public static final US NJ;
    public static final US NM;
    public static final US NV;
    public static final US NY;
    public static final US OH;
    public static final US OK;
    public static final US OR;
    public static final US PA;
    public static final US RI;
    public static final US SC;
    public static final US SD;
    public static final US TN;
    public static final US TX;
    public static final US UT;
    public static final US VA;
    public static final US VT;
    public static final US WA;
    public static final US WI;
    public static final US WV;
    public static final US WY;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ US[] f3785c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a f3786d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String displayName;

    static {
        US us = new US("AL", 0, "AL", "Alabama");
        AL = us;
        US us2 = new US("AK", 1, "AK", "Alaska");
        AK = us2;
        US us3 = new US("AZ", 2, "AZ", "Arizona");
        AZ = us3;
        US us4 = new US("AR", 3, "AR", "Arkansas");
        AR = us4;
        US us5 = new US("CA", 4, "CA", "California");
        CA = us5;
        US us6 = new US("CO", 5, "CO", "Colorado");
        CO = us6;
        US us7 = new US("CT", 6, "CT", "Connecticut");
        CT = us7;
        US us8 = new US("DE", 7, "DE", "Delaware");
        DE = us8;
        US us9 = new US("FL", 8, "FL", "Florida");
        FL = us9;
        US us10 = new US("GA", 9, "GA", "Georgia");
        GA = us10;
        US us11 = new US("HI", 10, "HI", "Hawaii");
        HI = us11;
        US us12 = new US("ID", 11, "ID", "Idaho");
        ID = us12;
        US us13 = new US("IL", 12, "IL", "Illinois");
        IL = us13;
        US us14 = new US("IN", 13, "IN", "Indiana");
        IN = us14;
        US us15 = new US("IA", 14, "IA", "Iowa");
        IA = us15;
        US us16 = new US("KS", 15, "KS", "Kansas");
        KS = us16;
        US us17 = new US("KY", 16, "KY", "Kentucky");
        KY = us17;
        US us18 = new US("LA", 17, "LA", "Louisiana");
        LA = us18;
        US us19 = new US("ME", 18, "ME", "Maine");
        ME = us19;
        US us20 = new US("MD", 19, "MD", "Maryland");
        MD = us20;
        US us21 = new US("MA", 20, "MA", "Massachusetts");
        MA = us21;
        US us22 = new US("MI", 21, "MI", "Michigan");
        MI = us22;
        US us23 = new US("MN", 22, "MN", "Minnesota");
        MN = us23;
        US us24 = new US("MS", 23, "MS", "Mississippi");
        MS = us24;
        US us25 = new US("MO", 24, "MO", "Missouri");
        MO = us25;
        US us26 = new US("MT", 25, "MT", "Montana");
        MT = us26;
        US us27 = new US("NE", 26, "NE", "Nebraska");
        NE = us27;
        US us28 = new US("NV", 27, "NV", "Nevada");
        NV = us28;
        US us29 = new US("NH", 28, "NH", "New Hampshire");
        NH = us29;
        US us30 = new US("NJ", 29, "NJ", "New Jersey");
        NJ = us30;
        US us31 = new US("NM", 30, "NM", "New Mexico");
        NM = us31;
        US us32 = new US("NY", 31, "NY", "New York");
        NY = us32;
        US us33 = new US("NC", 32, "NC", "North Carolina");
        NC = us33;
        US us34 = new US("ND", 33, "ND", "North Dakota");
        ND = us34;
        US us35 = new US("OH", 34, "OH", "Ohio");
        OH = us35;
        US us36 = new US("OK", 35, "OK", "Oklahoma");
        OK = us36;
        US us37 = new US("OR", 36, "OR", "Oregon");
        OR = us37;
        US us38 = new US("PA", 37, "PA", "Pennsylvania");
        PA = us38;
        US us39 = new US("RI", 38, "RI", "Rhode Island");
        RI = us39;
        US us40 = new US("SC", 39, "SC", "South Carolina");
        SC = us40;
        US us41 = new US("SD", 40, "SD", "South Dakota");
        SD = us41;
        US us42 = new US("TN", 41, "TN", "Tennessee");
        TN = us42;
        US us43 = new US("TX", 42, "TX", "Texas");
        TX = us43;
        US us44 = new US("UT", 43, "UT", "Utah");
        UT = us44;
        US us45 = new US("VT", 44, "VT", "Vermont");
        VT = us45;
        US us46 = new US("VA", 45, "VA", "Virginia");
        VA = us46;
        US us47 = new US("WA", 46, "WA", "Washington");
        WA = us47;
        US us48 = new US("WV", 47, "WV", "West Virginia");
        WV = us48;
        US us49 = new US("WI", 48, "WI", "Wisconsin");
        WI = us49;
        US us50 = new US("WY", 49, "WY", "Wyoming");
        WY = us50;
        US[] usArr = {us, us2, us3, us4, us5, us6, us7, us8, us9, us10, us11, us12, us13, us14, us15, us16, us17, us18, us19, us20, us21, us22, us23, us24, us25, us26, us27, us28, us29, us30, us31, us32, us33, us34, us35, us36, us37, us38, us39, us40, us41, us42, us43, us44, us45, us46, us47, us48, us49, us50};
        f3785c = usArr;
        f3786d = AbstractC2708l7.bravo(usArr);
    }

    private US(String str, int i4, String str2, String str3) {
        this.code = str2;
        this.displayName = str3;
    }

    @NotNull
    public static a getEntries() {
        return f3786d;
    }

    public static US valueOf(String str) {
        return (US) Enum.valueOf(US.class, str);
    }

    public static US[] values() {
        return (US[]) f3785c.clone();
    }

    @Override // com.checkout.address.model.State
    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Override // com.checkout.address.model.State
    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }
}
