package com.incognia.internal;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Cv extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Cv f8497b = new Cv();

    public Cv() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
    }
}
