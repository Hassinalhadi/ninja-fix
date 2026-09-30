package pf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2351a implements InterfaceC2358h {
    public final AtomicReference alpha;

    public C2351a(InterfaceC2358h interfaceC2358h) {
        this.alpha = new AtomicReference(interfaceC2358h);
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        InterfaceC2358h interfaceC2358h = (InterfaceC2358h) this.alpha.getAndSet(null);
        if (interfaceC2358h != null) {
            return interfaceC2358h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
