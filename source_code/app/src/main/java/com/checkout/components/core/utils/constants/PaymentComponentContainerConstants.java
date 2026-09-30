package com.checkout.components.core.utils.constants;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/core/utils/constants/PaymentComponentContainerConstants;", "", "LQ0/g;", "a", "F", "getPaddingStart-D9Ej5fM", "()F", "paddingStart", "b", "getPaddingEnd-D9Ej5fM", "paddingEnd", "c", "getPaddingTop-D9Ej5fM", "paddingTop", Constants.INAPP_DATA_TAG, "getPaddingBottom-D9Ej5fM", "paddingBottom", "LQ0/p;", "e", "J", "getFOOT_NOTE_TEXT_SIZE-XSAIIZE", "()J", "FOOT_NOTE_TEXT_SIZE", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentComponentContainerConstants {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final float paddingStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float paddingEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float paddingBottom;

    @NotNull
    public static final PaymentComponentContainerConstants INSTANCE = new PaymentComponentContainerConstants();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float paddingTop = 8;

    /* renamed from: e, reason: from kotlin metadata */
    private static final long FOOT_NOTE_TEXT_SIZE = AbstractC2636d7.charlie(13);

    static {
        float f5 = 16;
        paddingStart = f5;
        paddingEnd = f5;
        paddingBottom = f5;
    }

    private PaymentComponentContainerConstants() {
    }

    /* renamed from: getFOOT_NOTE_TEXT_SIZE-XSAIIZE, reason: not valid java name */
    public final long m105getFOOT_NOTE_TEXT_SIZEXSAIIZE() {
        return FOOT_NOTE_TEXT_SIZE;
    }

    /* renamed from: getPaddingBottom-D9Ej5fM, reason: not valid java name */
    public final float m106getPaddingBottomD9Ej5fM() {
        return paddingBottom;
    }

    /* renamed from: getPaddingEnd-D9Ej5fM, reason: not valid java name */
    public final float m107getPaddingEndD9Ej5fM() {
        return paddingEnd;
    }

    /* renamed from: getPaddingStart-D9Ej5fM, reason: not valid java name */
    public final float m108getPaddingStartD9Ej5fM() {
        return paddingStart;
    }

    /* renamed from: getPaddingTop-D9Ej5fM, reason: not valid java name */
    public final float m109getPaddingTopD9Ej5fM() {
        return paddingTop;
    }
}
