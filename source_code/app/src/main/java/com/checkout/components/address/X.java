package com.checkout.components.address;

import com.checkout.components.interfaces.model.contact.Country;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class X {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3874a;

    static {
        int[] iArr = new int[Country.values().length];
        try {
            iArr[Country.UNITED_STATES_OF_AMERICA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Country.CANADA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Country.AUSTRALIA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3874a = iArr;
    }
}
