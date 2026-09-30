package yf;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: yf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3437g implements InterfaceC3439i {
    public final InterfaceC3439i alpha;

    public C3437g(InterfaceC3439i interfaceC3439i) {
        this.alpha = interfaceC3439i;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = zf.b.bravo;
        Object collect = this.alpha.collect(new C3436f(this, objectRef, interfaceC3440j), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
