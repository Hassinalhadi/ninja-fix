package pf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2362l extends kotlin.jvm.internal.i implements Function1 {
    public static final C2362l alpha = new kotlin.jvm.internal.i(1, InterfaceC2358h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2358h p02 = (InterfaceC2358h) obj;
        Intrinsics.echo(p02, "p0");
        return p02.iterator();
    }
}
