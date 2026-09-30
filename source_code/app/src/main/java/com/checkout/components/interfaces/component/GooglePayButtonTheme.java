package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "", "DARK", "LIGHT", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class GooglePayButtonTheme {
    public static final GooglePayButtonTheme DARK;
    public static final GooglePayButtonTheme LIGHT;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ GooglePayButtonTheme[] f5297a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Qd.a f5298b;

    static {
        GooglePayButtonTheme googlePayButtonTheme = new GooglePayButtonTheme("DARK", 0);
        DARK = googlePayButtonTheme;
        GooglePayButtonTheme googlePayButtonTheme2 = new GooglePayButtonTheme("LIGHT", 1);
        LIGHT = googlePayButtonTheme2;
        GooglePayButtonTheme[] googlePayButtonThemeArr = {googlePayButtonTheme, googlePayButtonTheme2};
        f5297a = googlePayButtonThemeArr;
        f5298b = AbstractC2708l7.bravo(googlePayButtonThemeArr);
    }

    private GooglePayButtonTheme(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return f5298b;
    }

    public static GooglePayButtonTheme valueOf(String str) {
        return (GooglePayButtonTheme) Enum.valueOf(GooglePayButtonTheme.class, str);
    }

    public static GooglePayButtonTheme[] values() {
        return (GooglePayButtonTheme[]) f5297a.clone();
    }
}
