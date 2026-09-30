package com.incognia.internal;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class RZF extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final RZF f9552b = new RZF();

    public RZF() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        if (((WDG) ((Map.Entry) obj).getValue()).f9841f9 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
