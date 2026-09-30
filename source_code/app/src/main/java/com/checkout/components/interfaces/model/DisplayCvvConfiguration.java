package com.checkout.components.interfaces.model;

import Qd.a;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "", "SHOW", "HIDE", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class DisplayCvvConfiguration {
    public static final DisplayCvvConfiguration HIDE;
    public static final DisplayCvvConfiguration SHOW;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DisplayCvvConfiguration[] f5401a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f5402b;

    static {
        DisplayCvvConfiguration displayCvvConfiguration = new DisplayCvvConfiguration("SHOW", 0);
        SHOW = displayCvvConfiguration;
        DisplayCvvConfiguration displayCvvConfiguration2 = new DisplayCvvConfiguration("HIDE", 1);
        HIDE = displayCvvConfiguration2;
        DisplayCvvConfiguration[] displayCvvConfigurationArr = {displayCvvConfiguration, displayCvvConfiguration2};
        f5401a = displayCvvConfigurationArr;
        f5402b = AbstractC2708l7.bravo(displayCvvConfigurationArr);
    }

    private DisplayCvvConfiguration(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return f5402b;
    }

    public static DisplayCvvConfiguration valueOf(String str) {
        return (DisplayCvvConfiguration) Enum.valueOf(DisplayCvvConfiguration.class, str);
    }

    public static DisplayCvvConfiguration[] values() {
        return (DisplayCvvConfiguration[]) f5401a.clone();
    }
}
