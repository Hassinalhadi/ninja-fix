package com.checkout.components.wallet.data.dto;

import Qd.a;
import kotlin.Metadata;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;", "", "ESTIMATED", "FINAL", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TotalPriceStatus {
    public static final TotalPriceStatus ESTIMATED;
    public static final TotalPriceStatus FINAL;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ TotalPriceStatus[] f6489a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f6490b;

    static {
        TotalPriceStatus totalPriceStatus = new TotalPriceStatus("ESTIMATED", 0);
        ESTIMATED = totalPriceStatus;
        TotalPriceStatus totalPriceStatus2 = new TotalPriceStatus("FINAL", 1);
        FINAL = totalPriceStatus2;
        TotalPriceStatus[] totalPriceStatusArr = {totalPriceStatus, totalPriceStatus2};
        f6489a = totalPriceStatusArr;
        f6490b = AbstractC2708l7.bravo(totalPriceStatusArr);
    }

    private TotalPriceStatus(String str, int i4) {
    }

    public static a getEntries() {
        return f6490b;
    }

    public static TotalPriceStatus valueOf(String str) {
        return (TotalPriceStatus) Enum.valueOf(TotalPriceStatus.class, str);
    }

    public static TotalPriceStatus[] values() {
        return (TotalPriceStatus[]) f6489a.clone();
    }
}
