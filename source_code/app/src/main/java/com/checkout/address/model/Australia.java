package com.checkout.address.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/address/model/Australia;", "Lcom/checkout/address/model/State;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getDisplayName", "displayName", "ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Australia implements State {
    public static final Australia ACT;
    public static final Australia NSW;
    public static final Australia NT;
    public static final Australia QLD;
    public static final Australia SA;
    public static final Australia TAS;
    public static final Australia VIC;
    public static final Australia WA;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ Australia[] f3749c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a f3750d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String displayName;

    static {
        Australia australia = new Australia("ACT", 0, "ACT", "Australian Capital Territory");
        ACT = australia;
        Australia australia2 = new Australia("NSW", 1, "NSW", "New South Wales");
        NSW = australia2;
        Australia australia3 = new Australia("NT", 2, "NT", "Northern Territory");
        NT = australia3;
        Australia australia4 = new Australia("QLD", 3, "QLD", "Queensland");
        QLD = australia4;
        Australia australia5 = new Australia("SA", 4, "SA", "South Australia");
        SA = australia5;
        Australia australia6 = new Australia("TAS", 5, "TAS", "Tasmania");
        TAS = australia6;
        Australia australia7 = new Australia("VIC", 6, "VIC", "Victoria");
        VIC = australia7;
        Australia australia8 = new Australia("WA", 7, "WA", "Western Australia");
        WA = australia8;
        Australia[] australiaArr = {australia, australia2, australia3, australia4, australia5, australia6, australia7, australia8};
        f3749c = australiaArr;
        f3750d = AbstractC2708l7.bravo(australiaArr);
    }

    private Australia(String str, int i4, String str2, String str3) {
        this.code = str2;
        this.displayName = str3;
    }

    @NotNull
    public static a getEntries() {
        return f3750d;
    }

    public static Australia valueOf(String str) {
        return (Australia) Enum.valueOf(Australia.class, str);
    }

    public static Australia[] values() {
        return (Australia[]) f3749c.clone();
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
