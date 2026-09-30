package com.checkout.components.wallet.common;

import Z8.a;
import Z8.b;
import com.checkout.components.interfaces.component.GooglePayButtonTheme;
import com.checkout.components.interfaces.component.GooglePayButtonType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "LZ8/a;", "toButtonTheme", "(Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;)LZ8/a;", "Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "LZ8/b;", "toButtonType", "(Lcom/checkout/components/interfaces/component/GooglePayButtonType;)LZ8/b;", "wallet_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonOptionsMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GooglePayButtonTheme.values().length];
            try {
                iArr[GooglePayButtonTheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePayButtonTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GooglePayButtonType.values().length];
            try {
                iArr2[GooglePayButtonType.BOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GooglePayButtonType.CHECKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GooglePayButtonType.DONATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GooglePayButtonType.ORDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GooglePayButtonType.PAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GooglePayButtonType.PLAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GooglePayButtonType.SUBSCRIBE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GooglePayButtonType.BUY.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final a toButtonTheme(GooglePayButtonTheme googlePayButtonTheme) {
        Intrinsics.echo(googlePayButtonTheme, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[googlePayButtonTheme.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return a.Dark;
            }
            throw new NoWhenBranchMatchedException();
        }
        return a.Light;
    }

    public static final b toButtonType(GooglePayButtonType googlePayButtonType) {
        Intrinsics.echo(googlePayButtonType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[googlePayButtonType.ordinal()]) {
            case 1:
                return b.Book;
            case 2:
                return b.Checkout;
            case 3:
                return b.Donate;
            case 4:
                return b.Order;
            case 5:
                return b.Pay;
            case 6:
                return b.Plain;
            case 7:
                return b.Subscribe;
            case 8:
                return b.Buy;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
