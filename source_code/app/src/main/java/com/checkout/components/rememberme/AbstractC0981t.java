package com.checkout.components.rememberme;

import com.checkout.components.interfaces.Environment;

/* renamed from: com.checkout.components.rememberme.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0981t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6293a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.SANDBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6293a = iArr;
    }
}
