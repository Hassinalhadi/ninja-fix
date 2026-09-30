package com.checkout.components.interfaces.utils;

import android.os.Build;
import av.q;
import com.checkout.components.interfaces.localisation.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/interfaces/utils/Constants;", "", "Lcom/checkout/components/interfaces/localisation/Locale;", "a", "Lcom/checkout/components/interfaces/localisation/Locale;", "getDEFAULT_LOCALE", "()Lcom/checkout/components/interfaces/localisation/Locale;", "DEFAULT_LOCALE", "", "HEADER_USER_AGENT_NAME", "Ljava/lang/String;", "b", "getHEADER_USER_AGENT_VALUE", "()Ljava/lang/String;", "HEADER_USER_AGENT_VALUE", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final int $stable = 0;

    @NotNull
    public static final String HEADER_USER_AGENT_NAME = "User-Agent";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    /* renamed from: a, reason: collision with root package name */
    private static final Locale.En f5621a = Locale.En.INSTANCE;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String HEADER_USER_AGENT_VALUE;

    static {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        int i4 = Build.VERSION.SDK_INT;
        StringBuilder india = q.india("checkout-sdk-components-android/2.1.0 (", str, " ", str2, "; Android ");
        india.append(str3);
        india.append("; API ");
        india.append(i4);
        india.append(")");
        HEADER_USER_AGENT_VALUE = india.toString();
    }

    private Constants() {
    }

    @NotNull
    public final Locale getDEFAULT_LOCALE() {
        return f5621a;
    }

    @NotNull
    public final String getHEADER_USER_AGENT_VALUE() {
        return HEADER_USER_AGENT_VALUE;
    }
}
