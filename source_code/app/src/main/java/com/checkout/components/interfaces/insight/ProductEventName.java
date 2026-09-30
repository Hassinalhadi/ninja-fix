package com.checkout.components.interfaces.insight;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/insight/ProductEventName;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", com.clevertap.android.sdk.Constants.KEY_KEY, "InitialisationSucceeded", "PaymentActionInitialised", "PaymentActionCompleted", "Press", "PaymentMethodSelected", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductEventName {
    public static final ProductEventName InitialisationSucceeded;
    public static final ProductEventName PaymentActionCompleted;
    public static final ProductEventName PaymentActionInitialised;
    public static final ProductEventName PaymentMethodSelected;
    public static final ProductEventName Press;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ ProductEventName[] f5336b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a f5337c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    static {
        ProductEventName productEventName = new ProductEventName("InitialisationSucceeded", 0, "initialisation_succeeded");
        InitialisationSucceeded = productEventName;
        ProductEventName productEventName2 = new ProductEventName("PaymentActionInitialised", 1, "payment_action_initialised");
        PaymentActionInitialised = productEventName2;
        ProductEventName productEventName3 = new ProductEventName("PaymentActionCompleted", 2, "payment_action_completed");
        PaymentActionCompleted = productEventName3;
        ProductEventName productEventName4 = new ProductEventName("Press", 3, "press");
        Press = productEventName4;
        ProductEventName productEventName5 = new ProductEventName("PaymentMethodSelected", 4, "payment_method_selected");
        PaymentMethodSelected = productEventName5;
        ProductEventName[] productEventNameArr = {productEventName, productEventName2, productEventName3, productEventName4, productEventName5};
        f5336b = productEventNameArr;
        f5337c = AbstractC2708l7.bravo(productEventNameArr);
    }

    private ProductEventName(String str, int i4, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return f5337c;
    }

    public static ProductEventName valueOf(String str) {
        return (ProductEventName) Enum.valueOf(ProductEventName.class, str);
    }

    public static ProductEventName[] values() {
        return (ProductEventName[]) f5336b.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
