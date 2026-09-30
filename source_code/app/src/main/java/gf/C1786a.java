package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ax;

/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1786a extends kotlin.reflect.jvm.internal.impl.types.c {
    public final /* synthetic */ InterfaceC1787b alpha;
    public final /* synthetic */ ax bravo;

    public C1786a(InterfaceC1787b interfaceC1787b, ax axVar) {
        this.alpha = interfaceC1787b;
        this.bravo = axVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c
    public final p000if.d xray(ao state, p000if.c type) {
        Intrinsics.echo(state, "state");
        Intrinsics.echo(type, "type");
        InterfaceC1787b interfaceC1787b = this.alpha;
        ae lime = interfaceC1787b.lime(type);
        Intrinsics.charlie(lime, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        ae quebec = interfaceC1787b.quebec(this.bravo.golf(1, lime));
        Intrinsics.checkNotNull(quebec);
        return quebec;
    }
}
