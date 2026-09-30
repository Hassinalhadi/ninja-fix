package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.SelectedPaymentMethod;

/* renamed from: com.checkout.components.rememberme.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0957l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5985a;

    static {
        int[] iArr = new int[SelectedPaymentMethod.values().length];
        try {
            iArr[SelectedPaymentMethod.SAVED_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedPaymentMethod.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectedPaymentMethod.ADD_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5985a = iArr;
    }
}
