package vf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public class J extends P implements r {
    public final boolean red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(I i4) {
        super(true);
        C3211o c3211o;
        C3211o c3211o2;
        boolean z2 = true;
        jade(i4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P.purple;
        InterfaceC3210n interfaceC3210n = (InterfaceC3210n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3210n instanceof C3211o) {
            c3211o = (C3211o) interfaceC3210n;
        } else {
            c3211o = null;
        }
        if (c3211o != null) {
            P india = c3211o.india();
            while (!india.fuchsia()) {
                InterfaceC3210n interfaceC3210n2 = (InterfaceC3210n) atomicReferenceFieldUpdater.get(india);
                if (interfaceC3210n2 instanceof C3211o) {
                    c3211o2 = (C3211o) interfaceC3210n2;
                } else {
                    c3211o2 = null;
                }
                if (c3211o2 != null) {
                    india = c3211o2.india();
                }
            }
            this.red = z2;
        }
        z2 = false;
        this.red = z2;
    }

    @Override // vf.P
    public final boolean fuchsia() {
        return this.red;
    }

    @Override // vf.P
    public final boolean gold() {
        return true;
    }

    public final boolean yellow() {
        return magenta(Unit.INSTANCE);
    }
}
