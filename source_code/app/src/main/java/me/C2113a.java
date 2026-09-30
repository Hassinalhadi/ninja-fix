package me;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2113a extends Lambda implements Function0 {
    public static final C2113a alpha = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceLoader implementations = ServiceLoader.load(InterfaceC2115c.class, InterfaceC2115c.class.getClassLoader());
        Intrinsics.delta(implementations, "implementations");
        InterfaceC2115c interfaceC2115c = (InterfaceC2115c) CollectionsKt.gray(implementations);
        if (interfaceC2115c != null) {
            return interfaceC2115c;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
