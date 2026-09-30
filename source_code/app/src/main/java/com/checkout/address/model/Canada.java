package com.checkout.address.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/checkout/address/model/Canada;", "Lcom/checkout/address/model/State;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getDisplayName", "displayName", "AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Canada implements State {
    public static final Canada AB;
    public static final Canada BC;
    public static final Canada MB;
    public static final Canada NB;
    public static final Canada NL;
    public static final Canada NS;
    public static final Canada NT;
    public static final Canada NU;
    public static final Canada ON;
    public static final Canada PE;
    public static final Canada QC;
    public static final Canada SK;
    public static final Canada YT;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ Canada[] f3755c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a f3756d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String displayName;

    static {
        Canada canada = new Canada("AB", 0, "AB", "Alberta");
        AB = canada;
        Canada canada2 = new Canada("BC", 1, "BC", "British Columbia");
        BC = canada2;
        Canada canada3 = new Canada("MB", 2, "MB", "Manitoba");
        MB = canada3;
        Canada canada4 = new Canada("NB", 3, "NB", "New Brunswick");
        NB = canada4;
        Canada canada5 = new Canada("NL", 4, "NL", "Newfoundland and Labrador");
        NL = canada5;
        Canada canada6 = new Canada("NS", 5, "NS", "Nova Scotia");
        NS = canada6;
        Canada canada7 = new Canada("NT", 6, "NT", "Northwest Territories");
        NT = canada7;
        Canada canada8 = new Canada("NU", 7, "NU", "Nunavut");
        NU = canada8;
        Canada canada9 = new Canada("ON", 8, "ON", "Ontario");
        ON = canada9;
        Canada canada10 = new Canada("PE", 9, "PE", "Prince Edward Island");
        PE = canada10;
        Canada canada11 = new Canada("QC", 10, "QC", "Quebec");
        QC = canada11;
        Canada canada12 = new Canada("SK", 11, "SK", "Saskatchewan");
        SK = canada12;
        Canada canada13 = new Canada("YT", 12, "YT", "Yukon");
        YT = canada13;
        Canada[] canadaArr = {canada, canada2, canada3, canada4, canada5, canada6, canada7, canada8, canada9, canada10, canada11, canada12, canada13};
        f3755c = canadaArr;
        f3756d = AbstractC2708l7.bravo(canadaArr);
    }

    private Canada(String str, int i4, String str2, String str3) {
        this.code = str2;
        this.displayName = str3;
    }

    @NotNull
    public static a getEntries() {
        return f3756d;
    }

    public static Canada valueOf(String str) {
        return (Canada) Enum.valueOf(Canada.class, str);
    }

    public static Canada[] values() {
        return (Canada[]) f3755c.clone();
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
