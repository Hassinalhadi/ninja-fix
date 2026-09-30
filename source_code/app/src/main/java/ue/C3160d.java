package ue;

import cf.InterfaceC0854j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import ve.u;

/* renamed from: ue.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3160d implements InterfaceC0854j {
    public static final C3160d bravo = new Object();
    public static final C3160d charlie = new Object();

    public f alpha(Ee.c javaElement) {
        Intrinsics.echo(javaElement, "javaElement");
        return new f((u) javaElement);
    }

    @Override // cf.InterfaceC0854j
    public void bravo(InterfaceC2328d descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // cf.InterfaceC0854j
    public void charlie(InterfaceC2330f descriptor, ArrayList arrayList) {
        Intrinsics.echo(descriptor, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + arrayList);
    }
}
