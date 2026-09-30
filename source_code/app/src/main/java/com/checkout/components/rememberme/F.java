package com.checkout.components.rememberme;

import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class F {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5751a;

    static {
        int[] iArr = new int[ClickTarget.values().length];
        try {
            iArr[ClickTarget.CHANGE_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClickTarget.CONTINUE_WITHOUT_SAVED_DETAILS_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClickTarget.INFO_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5751a = iArr;
    }
}
