package com.checkout.components.address;

import com.checkout.components.ui.model.CountryPickerType;

/* renamed from: com.checkout.components.address.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0882w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3913a;

    static {
        int[] iArr = new int[CountryPickerType.values().length];
        try {
            iArr[CountryPickerType.Phone.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CountryPickerType.Address.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3913a = iArr;
    }
}
