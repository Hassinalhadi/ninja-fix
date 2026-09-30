package com.checkout.components.rememberme;

import com.checkout.components.interfaces.Environment;

/* renamed from: com.checkout.components.rememberme.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0952j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5965a;

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
        f5965a = iArr;
    }
}
