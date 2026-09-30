package com.checkout.components.ui.model;

import Qd.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/ui/model/CountryPickerType;", "", "<init>", "(Ljava/lang/String;I)V", "Phone", "Address", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CountryPickerType[] $VALUES;
    public static final CountryPickerType Phone = new CountryPickerType("Phone", 0);
    public static final CountryPickerType Address = new CountryPickerType("Address", 1);

    private static final /* synthetic */ CountryPickerType[] $values() {
        return new CountryPickerType[]{Phone, Address};
    }

    static {
        CountryPickerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private CountryPickerType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CountryPickerType valueOf(String str) {
        return (CountryPickerType) Enum.valueOf(CountryPickerType.class, str);
    }

    public static CountryPickerType[] values() {
        return (CountryPickerType[]) $VALUES.clone();
    }
}
