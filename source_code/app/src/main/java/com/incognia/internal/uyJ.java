package com.incognia.internal;

import java.net.InetAddress;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class uyJ extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final uyJ f11508b = new uyJ();

    public uyJ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InetAddress) obj).getHostAddress();
    }
}
