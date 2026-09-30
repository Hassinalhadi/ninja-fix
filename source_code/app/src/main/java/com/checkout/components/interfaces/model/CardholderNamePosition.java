package com.checkout.components.interfaces.model;

import Qd.a;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "", "TOP", "BOTTOM", "HIDDEN", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class CardholderNamePosition {
    public static final CardholderNamePosition BOTTOM;
    public static final CardholderNamePosition HIDDEN;
    public static final CardholderNamePosition TOP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ CardholderNamePosition[] f5396a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f5397b;

    static {
        CardholderNamePosition cardholderNamePosition = new CardholderNamePosition("TOP", 0);
        TOP = cardholderNamePosition;
        CardholderNamePosition cardholderNamePosition2 = new CardholderNamePosition("BOTTOM", 1);
        BOTTOM = cardholderNamePosition2;
        CardholderNamePosition cardholderNamePosition3 = new CardholderNamePosition("HIDDEN", 2);
        HIDDEN = cardholderNamePosition3;
        CardholderNamePosition[] cardholderNamePositionArr = {cardholderNamePosition, cardholderNamePosition2, cardholderNamePosition3};
        f5396a = cardholderNamePositionArr;
        f5397b = AbstractC2708l7.bravo(cardholderNamePositionArr);
    }

    private CardholderNamePosition(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return f5397b;
    }

    public static CardholderNamePosition valueOf(String str) {
        return (CardholderNamePosition) Enum.valueOf(CardholderNamePosition.class, str);
    }

    public static CardholderNamePosition[] values() {
        return (CardholderNamePosition[]) f5396a.clone();
    }
}
