package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "", "BOOK", "BUY", "CHECKOUT", "DONATE", "ORDER", "PAY", "PLAIN", "SUBSCRIBE", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class GooglePayButtonType {
    public static final GooglePayButtonType BOOK;
    public static final GooglePayButtonType BUY;
    public static final GooglePayButtonType CHECKOUT;
    public static final GooglePayButtonType DONATE;
    public static final GooglePayButtonType ORDER;
    public static final GooglePayButtonType PAY;
    public static final GooglePayButtonType PLAIN;
    public static final GooglePayButtonType SUBSCRIBE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ GooglePayButtonType[] f5299a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Qd.a f5300b;

    static {
        GooglePayButtonType googlePayButtonType = new GooglePayButtonType("BOOK", 0);
        BOOK = googlePayButtonType;
        GooglePayButtonType googlePayButtonType2 = new GooglePayButtonType("BUY", 1);
        BUY = googlePayButtonType2;
        GooglePayButtonType googlePayButtonType3 = new GooglePayButtonType("CHECKOUT", 2);
        CHECKOUT = googlePayButtonType3;
        GooglePayButtonType googlePayButtonType4 = new GooglePayButtonType("DONATE", 3);
        DONATE = googlePayButtonType4;
        GooglePayButtonType googlePayButtonType5 = new GooglePayButtonType("ORDER", 4);
        ORDER = googlePayButtonType5;
        GooglePayButtonType googlePayButtonType6 = new GooglePayButtonType("PAY", 5);
        PAY = googlePayButtonType6;
        GooglePayButtonType googlePayButtonType7 = new GooglePayButtonType("PLAIN", 6);
        PLAIN = googlePayButtonType7;
        GooglePayButtonType googlePayButtonType8 = new GooglePayButtonType("SUBSCRIBE", 7);
        SUBSCRIBE = googlePayButtonType8;
        GooglePayButtonType[] googlePayButtonTypeArr = {googlePayButtonType, googlePayButtonType2, googlePayButtonType3, googlePayButtonType4, googlePayButtonType5, googlePayButtonType6, googlePayButtonType7, googlePayButtonType8};
        f5299a = googlePayButtonTypeArr;
        f5300b = AbstractC2708l7.bravo(googlePayButtonTypeArr);
    }

    private GooglePayButtonType(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return f5300b;
    }

    public static GooglePayButtonType valueOf(String str) {
        return (GooglePayButtonType) Enum.valueOf(GooglePayButtonType.class, str);
    }

    public static GooglePayButtonType[] values() {
        return (GooglePayButtonType[]) f5299a.clone();
    }
}
