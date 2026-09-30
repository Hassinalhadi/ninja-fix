package com.checkout.components.wallet.data.dto;

import Qd.a;
import kotlin.Metadata;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/wallet/data/dto/Format;", "", "MIN", "FULL", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Format {
    public static final Format FULL;
    public static final Format MIN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Format[] f6467a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f6468b;

    static {
        Format format = new Format("MIN", 0);
        MIN = format;
        Format format2 = new Format("FULL", 1);
        FULL = format2;
        Format[] formatArr = {format, format2};
        f6467a = formatArr;
        f6468b = AbstractC2708l7.bravo(formatArr);
    }

    private Format(String str, int i4) {
    }

    public static a getEntries() {
        return f6468b;
    }

    public static Format valueOf(String str) {
        return (Format) Enum.valueOf(Format.class, str);
    }

    public static Format[] values() {
        return (Format[]) f6467a.clone();
    }
}
