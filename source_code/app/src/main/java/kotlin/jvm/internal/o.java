package kotlin.jvm.internal;

import ge.InterfaceC1771c;
import ge.InterfaceC1772d;
import ge.InterfaceC1774f;

/* loaded from: classes2.dex */
public class o extends p implements ge.u {
    public o(InterfaceC1774f interfaceC1774f, String str, String str2) {
        super(c.NO_RECEIVER, ((d) interfaceC1774f).golf(), str, str2, !(interfaceC1774f instanceof InterfaceC1772d) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1771c computeReflected() {
        return u.alpha.hotel(this);
    }

    public Object get(Object obj) {
        return ((je.r) bravo()).call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // ge.v
    public final ge.t bravo() {
        return ((ge.u) getReflected()).bravo();
    }

    public o(Class cls, String str, String str2, int i4) {
        super(c.NO_RECEIVER, cls, str, str2, i4);
    }
}
