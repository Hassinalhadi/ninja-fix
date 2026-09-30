package com.checkout.components.core.utils.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/utils/constants/PaymentComponentHeaderConstants;", "", "LQ0/g;", "a", "F", "getPadding-D9Ej5fM", "()F", "padding", "b", "getContainerPadding-D9Ej5fM", "containerPadding", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentComponentHeaderConstants {
    public static final int $stable = 0;

    @NotNull
    public static final PaymentComponentHeaderConstants INSTANCE = new PaymentComponentHeaderConstants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final float padding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float containerPadding;

    static {
        float f5 = 8;
        padding = f5;
        containerPadding = f5;
    }

    private PaymentComponentHeaderConstants() {
    }

    /* renamed from: getContainerPadding-D9Ej5fM, reason: not valid java name */
    public final float m110getContainerPaddingD9Ej5fM() {
        return containerPadding;
    }

    /* renamed from: getPadding-D9Ej5fM, reason: not valid java name */
    public final float m111getPaddingD9Ej5fM() {
        return padding;
    }
}
